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

import com.evolveum.polygon.connector.liferay.group.GroupServiceSoap;
import com.evolveum.polygon.connector.liferay.group.GroupSoap;
import com.evolveum.polygon.connector.liferay.role.RoleServiceSoap;
import com.evolveum.polygon.connector.liferay.role.RoleSoap;
import org.identityconnectors.common.StringUtil;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.framework.common.exceptions.InvalidAttributeValueException;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * When we set Site or Organization Role, we need to transfer over connId not only Role associated to user,
 * but also associated Group (for example Site). With this class we extend connId value to do this.
 * <p/>
 * One value is used to send:
 * - regular role name (for example: 'Administrator')
 * - regular role ID (for example: '1')
 * - regular role name with role type and empty Group (for example: 'Administrator,1,' - '1' is role TYPE_REGULAR from Liferay)
 * - regular role ID with role type and empty Group (for example: '1,1,')
 * - site role name and associated Group name (for example: 'ISSUser,2,ISS site' - '2' is role TYPE_SITE from Liferay)
 * - site role ID and associated Group name (for example: '51501,2,ISS site')
 * - site role ID and associated Group ID (for example: '51501,2,107016')
 * <p/>
 * 
 * @author gpalos
 */
public class LiferayRoleGroup {
    private static final Log LOG = Log.getLog(LiferayRoleGroup.class);

    static final int TYPE_REGULAR = 1;       // see com.liferay.portal.model.RoleConstants, label = 'regular' in GUI
    static final int TYPE_SITE = 2;          // label = 'site' in GUI
    static final int TYPE_ORGANIZATION = 3;  // not implemented yet

    private static final String DELIMITER = ","; // Role name and Group name is not contains ',' (not valid char in name)

    private String value;

    private String roleName;
    private Long roleId;
    private int roleType = TYPE_REGULAR;
    private String groupName = null;
    private Long groupId = null;

    // global cache
    static Map<String, Long> roleCache = new HashMap<String, Long>();
    static Map<String, Long> groupCache = new HashMap<String, Long>();
    static Map<String, Long> siteCache = new HashMap<String, Long>();

    public LiferayRoleGroup(String value) throws InvalidAttributeValueException {
        this.value = value;
        if (StringUtil.isNotEmpty(value)) {
            if (this.value.contains(DELIMITER)) {
                String[] atts = this.value.split(DELIMITER, -1);
                if (atts.length != 3)
                    throw new InvalidAttributeValueException("value '" + this.value + "' must have 1 or 3 attributes inside delimited with: '" + DELIMITER + "'");

                roleType = Integer.parseInt(atts[1]);
                if (roleType != TYPE_REGULAR && roleType != TYPE_SITE)
                    throw new InvalidAttributeValueException("not supported Role Type '" + roleType + "' in value: " + this.value);

                roleType = Integer.parseInt(atts[1]);

                parseRole(atts[0]);
                parseGroup(atts[2]);
            } else {
                // regular role without type and Group
                parseRole(value);
            }
        }
    }

    public LiferayRoleGroup(RoleSoap roleSoap) {
        this(roleSoap, TYPE_REGULAR, null, null);
    }

    public LiferayRoleGroup(RoleSoap roleSoap, int type, Long groupId, String groupName) {
        this.roleType = type;
        this.groupId = groupId;
        this.groupName = groupName;
        this.roleId = roleSoap.getRoleId();
        this.roleName = roleSoap.getName();
        generateValue();
    }

    private void generateValue() {
        this.value = roleName + DELIMITER + roleType + DELIMITER + (groupName == null ? "" : groupName);
    }

    private void parseRole(String val) {
        roleId = getLongVal(val);
        if (roleId == null)
            roleName = val;
    }

    private void parseGroup(String val) {
        groupId = getLongVal(val);
        if (groupId == null)
            groupName = val;
    }

    private Long getLongVal(String val) {
        try {
            return Long.parseLong(val);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public String getValue() {
        return value;
    }

    public String getRoleName() {
        return roleName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public int getRoleType() {
        return roleType;
    }

    public String getGroupName() {
        return groupName;
    }

    public Long getGroupId() {
        return groupId;
    }

    public boolean isRegularRole() {
        return roleType == TYPE_REGULAR;
    }

    public boolean isSiteRole() {
        return roleType == TYPE_SITE;
    }

    public void computeIds(RoleServiceSoap roleService, GroupServiceSoap groupService, Long companyId) throws RemoteException {
        if (StringUtil.isNotEmpty(roleName)) {
            roleId = roleCache.get(roleName);
            if (roleId == null) {
                RoleSoap role = roleService.getRole(companyId, roleName);
                LOG.ok("put to roleCache {0}:{1}", role.getRoleId(), role.getName());
                roleCache.put(role.getName(), role.getRoleId());
                roleId = role.getRoleId();
            }
        }

        if (StringUtil.isNotEmpty(groupName)) {
            groupId = groupCache.get(groupName);
            if (groupId == null) {
                GroupSoap group = groupService.getGroup(companyId, groupName);
                groupCache.put(group.getName(), group.getGroupId());
                LOG.ok("put to groupCache {0}:{1}", group.getGroupId(), group.getName());
                groupId = group.getGroupId();
            }
        }
    }

    public void cleareCache() {
        roleCache.clear();
        groupCache.clear();
        siteCache.clear();
    }

    @Override
    public String toString() {
        return "LiferayRoleGroup{" +
                "value='" + value + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleId=" + roleId +
                ", roleType=" + roleType +
                ", groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                '}';
    }

}
