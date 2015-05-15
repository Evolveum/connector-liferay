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

import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.exceptions.ConfigurationException;
import org.identityconnectors.framework.spi.AbstractConfiguration;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.framework.spi.ConfigurationProperty;

import java.net.MalformedURLException;
import java.net.URL;

import static org.identityconnectors.common.StringUtil.isBlank;

public class LiferayConfiguration extends AbstractConfiguration {

    private static final Log LOG = Log.getLog(LiferayConfiguration.class);

    private String endpoint;
    private String username;
    private GuardedString password;
    private Long companyId;

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
        String url = endpoint.replace("//", "//" + username + ":" + getPlainPassword() + "@");
        return new URL(url + portalService);
    }


    void setPlainPassword(String plainPassword) {
        this.password = new GuardedString(plainPassword.toCharArray());
    }
}