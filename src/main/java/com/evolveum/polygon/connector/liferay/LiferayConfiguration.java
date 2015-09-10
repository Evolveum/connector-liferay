/*
 * Copyright (c) 2015 Evolveum
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evolveum.polygon.connector.liferay;

import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.identityconnectors.common.StringUtil;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.exceptions.ConfigurationException;
import org.identityconnectors.framework.spi.AbstractConfiguration;
import org.identityconnectors.framework.spi.ConfigurationProperty;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import static org.identityconnectors.common.StringUtil.isBlank;

/**
 * @author gpalos
 */
public class LiferayConfiguration extends AbstractConfiguration {

    private static final Log LOG = Log.getLog(LiferayConfiguration.class);

    private String endpoint;
    private String username;
    private GuardedString password;
    private Long companyId;

    private String CUSTOM_FIELD_DELIMITER = ":";
    private String[] customFields; //java.util.Date:createdOn
    // parsed customFields cache for internal use
    private Map<String, Class> customFieldsClass = new HashMap<String, Class>();

    private String[] defaultRoles;

    private Boolean trustingAllCertificates = false;

    private Boolean ignoreJSONException = false;

    private Boolean ignoreRemoteExceptionWhenUpdatePassword = false;

    private boolean associateOrganizationWithMainSite = false;

    @Override
    public void validate() {
        if (isBlank(endpoint))
            throw new ConfigurationException("endpoint is empty");
        if (isBlank(username))
            throw new ConfigurationException("username is empty");
        if (isBlank(getPlainPassword()))
            throw new ConfigurationException("password is empty");
        if (companyId == null)
            throw new ConfigurationException("companyId is empty");

        try {
            new URL(endpoint);
        } catch (MalformedURLException e) {
            throw new ConfigurationException("Malformed endpoint: " + endpoint, e);
        }

        if (!parseCustomFields())
            throw new ConfigurationException("customField not configured correctly, format is type:fieldName, for example 'java.util.Date:createdOn'");

    }

    public void hackAsixAuth(Stub service) {
        // asix not support e-mail as encoded login in auth URL, we need to fix it
        service._setProperty(Call.USERNAME_PROPERTY, getUsername());
        service._setProperty(Call.PASSWORD_PROPERTY, getPlainPassword());
    }


    private String getPlainPassword() {
        final StringBuilder sb = new StringBuilder();
        if (password != null) {
            password.access(new GuardedString.Accessor() {
                @Override
                public void access(char[] chars) {
                    sb.append(new String(chars));
                }
            });
        } else {
            return null;
        }
        return sb.toString();
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.endpoint",
            helpMessageKey = "liferay.config.endpoint.help")
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.companyId",
            helpMessageKey = "liferay.config.companyId.help")
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.username",
            helpMessageKey = "liferay.config.username.help")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.password",
            helpMessageKey = "liferay.config.password.help")
    public GuardedString getPassword() {
        return password;
    }

    public void setPassword(GuardedString password) {
        this.password = password;
    }

    public URL getUrl(String portalService) throws MalformedURLException {
        if (portalService==null)
            return null;
        return new URL(endpoint + portalService);
    }

    void setPlainPassword(String plainPassword) {
        this.password = new GuardedString(plainPassword.toCharArray());
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.customFields",
            helpMessageKey = "liferay.config.customFields.help")
    public String[] getCustomFields() {
        return customFields;
    }

    public boolean parseCustomFields() {
        if (this.customFields == null || this.customFields.length == 0) {
            return true;
        }

        if (!customFieldsClass.isEmpty()) {
            LOG.ok("parsing customFields was mades in the past, ignoring: {0}", this.customFieldsClass);
            return true;
        }

        LOG.ok("parsing customFields: {0}", Arrays.toString(this.customFields));
        for (int i = 0; i < customFields.length; i++) {
            String[] customField = customFields[i].split(CUSTOM_FIELD_DELIMITER);
            if (customField == null || customField.length != 2) {
                throw new ConfigurationException("customField is not parsable '" + customFields[i] + "', example: 'java.util.Date:createdOn'");
            }

            if (StringUtil.isEmpty(customField[1])) {
                throw new ConfigurationException("customField name is empty for " + customFields[i]);
            }

            if (StringUtil.isEmpty(customField[0])) {
                throw new ConfigurationException("customField type is empty for " + customFields[i]);
            }
            try {
                Class<?> type = Class.forName(customField[0]);
                if (LiferayExpando.isSupportedCustomFieldType(type)) {
                    // cache initialization
                    customFieldsClass.put(customField[1], type);
                } else {
                    throw new ConfigurationException("customField type '" + type.getName() + "' is not supported for " + customFields[i]);
                }

            } catch (ClassNotFoundException e) {
                throw new ConfigurationException("customField type '" + customField[0] + "' is not found for " + customFields[i] + ", " + e, e);
            }
        }

        LOG.ok("parsed customFieldsClasses: {0}", this.customFieldsClass);
        return true;
    }

    public Set<String> getCustomFieldNames() {
        if (customFieldsClass.isEmpty()) {
            return new HashSet<String>();
        }

        return customFieldsClass.keySet();
    }

    public Class getCustomFieldType(String key) {
        if (!customFieldsClass.containsKey(key)) {
            return null;
        }

        return customFieldsClass.get(key);
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.defaultRoles",
            helpMessageKey = "liferay.config.defaultRoles.help")
    public String[] getDefaultRoles() {
        return defaultRoles;
    }

    public void setDefaultRoles(String[] defaultRoles) {
        this.defaultRoles = defaultRoles;
    }


    @ConfigurationProperty(displayMessageKey = "liferay.config.trustingAllCertificates",
            helpMessageKey = "liferay.config.trustingAllCertificates.help")
    public Boolean getTrustingAllCertificates() {
        return trustingAllCertificates;
    }

    public void setTrustingAllCertificates(Boolean trustingAllCertificates) {
        this.trustingAllCertificates = trustingAllCertificates;
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.ignoreJSONException",
            helpMessageKey = "liferay.config.ignoreJSONException.help")
    public Boolean getIgnoreJSONException() {
        return ignoreJSONException;
    }

    public void setIgnoreJSONException(Boolean ignoreJSONException) {
        this.ignoreJSONException = ignoreJSONException;
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.associateOrganizationWithMainSite",
            helpMessageKey = "liferay.config.associateOrganizationWithMainSite.help")
    public boolean getAssociateOrganizationWithMainSite() {
        return associateOrganizationWithMainSite;
    }

    public void setAssociateOrganizationWithMainSite(boolean associateOrganizationWithMainSite) {
        this.associateOrganizationWithMainSite = associateOrganizationWithMainSite;
    }

    public void setCustomFields(String[] customFields) {
        this.customFields = customFields;
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.ignoreRemoteExceptionWhenUpdatePassword",
            helpMessageKey = "liferay.config.ignoreRemoteExceptionWhenUpdatePassword.help")
    public Boolean getIgnoreRemoteExceptionWhenUpdatePassword() {
        return ignoreRemoteExceptionWhenUpdatePassword;
    }

    public void setIgnoreRemoteExceptionWhenUpdatePassword(Boolean ignoreRemoteExceptionWhenUpdatePassword) {
        this.ignoreRemoteExceptionWhenUpdatePassword = ignoreRemoteExceptionWhenUpdatePassword;
    }
}