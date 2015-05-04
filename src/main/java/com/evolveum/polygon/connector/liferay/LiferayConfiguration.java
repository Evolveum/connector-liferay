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

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.identityconnectors.framework.common.exceptions.ConfigurationException;
import org.identityconnectors.framework.spi.AbstractConfiguration;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.framework.spi.ConfigurationProperty;

import java.net.MalformedURLException;
import java.net.URL;

import static org.identityconnectors.common.StringUtil.isBlank;

public class LiferayConfiguration extends AbstractConfiguration {

    private static final Log LOG = Log.getLog(LiferayConfiguration.class);

    private String hostUrl;
    private Long companyId;
    // in Liferay at first login user must reset password by default (value=true),
    // but when MidPoint manage account & passwords its useless and must set to 'false'
    private Boolean passwordResetDefault = false;
    public static final String SERVICE_USERSERVICE = "Portal_UserService";
    public static final String SERVICE_CONTACTSERVICE = "Portal_ContactService";
    // not implemented now:
    public static final String SERVICE_ORGANIZATIONSERVICE = "Portal_OrganizationService";
    public static final String SERVICE_GROUPSERVICE = "Portal_GroupService";
    public static final String SERVICE_ROLESERVICE = "Portal_RoleService";
    public static final String SERVICE_USERGROUPSERVICE = "Portal_UserGroupService";
    public static final String SERVICE_USERGROUPROLESERVICE = "Portal_UserGroupRoleService";

    @Override
    public void validate() {
        if (isBlank(hostUrl))
            throw new ConfigurationException("hostUrl is empty, format: http://user:password@localhost:8080/api/axis/ where user in {ScreenName, UserID} and the portal authentication type must be set either to screen name or user ID, see: http://www.liferay.com/documentation/liferay-portal/6.2/development/-/ai/service-security-layers-liferay-portal-6-2-dev-guide-05-en");
        if (companyId==null)
            throw new ConfigurationException("companyId is empty");

        try {
            new URL(hostUrl);
        }
        catch (MalformedURLException e)
        {
            throw new ConfigurationException("Mallformed hostUrl: "+hostUrl, e);
        }
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.hostUrl",
            helpMessageKey = "liferay.config.hostUrl.help")
    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    @ConfigurationProperty(displayMessageKey = "liferay.config.companyId",
            helpMessageKey = "liferay.config.companyId.help")
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Boolean getPasswordResetDefault() {
        return passwordResetDefault;
    }

    public void setPasswordResetDefault(Boolean passwordResetDefault) {
        this.passwordResetDefault = passwordResetDefault;
    }
}