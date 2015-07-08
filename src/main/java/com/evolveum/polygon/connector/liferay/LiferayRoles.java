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
import com.evolveum.polygon.connector.liferay.user.UserGroupRoleSoap;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.framework.common.exceptions.InvalidAttributeValueException;
import org.identityconnectors.framework.common.objects.Attribute;

import java.rmi.RemoteException;
import java.util.*;

/**
 * @author gpalos
 */
public class LiferayRoles {
    private static final Log LOG = Log.getLog(LiferayRoles.class);

    List<LiferayRoleGroup> values = new LinkedList<LiferayRoleGroup>();
    // if roles not null, modify
    boolean modifyRoles = false;

    public LiferayRoles(Set<Attribute> attributes, String attrName, String[] defaultVals, RoleServiceSoap roleService, GroupServiceSoap groupService, Long companyId) throws RemoteException {
        List<Object> roles = null;
        for (Attribute attr : attributes) {
            if (attrName.equals(attr.getName())) {
                modifyRoles = true;
                roles = attr.getValue();
                if (roles != null) {
                    for (int i = 0; i < roles.size(); i++) {
                        String role = (String) roles.get(i);
                        if (role == null) {
                            throw new InvalidAttributeValueException("Value " + null + " must be not null for attribute " + attrName);
                        }

                        LiferayRoleGroup lrg = new LiferayRoleGroup(role);
                        lrg.computeIds(roleService, groupService, companyId);
                        values.add(lrg);
                    }
                }
            }
        }

        // set default roles if needed
        if (modifyRoles && values.isEmpty() && defaultVals != null) {
            for (String defaultRole : defaultVals) {
                LiferayRoleGroup lrg = new LiferayRoleGroup(defaultRole);
                lrg.computeIds(roleService, groupService, companyId);
                values.add(lrg);
            }
        }
        LOG.ok("roles in input: {0}, in output: {1}, modifyRoles: {2} ", roles, values, modifyRoles);
    }

    public LiferayRoles(long userId, RoleServiceSoap roleService, GroupServiceSoap groupService) throws RemoteException {
        RoleSoap[] roles = roleService.getUserRoles(userId);
        for (RoleSoap roleSoap : roles) {
            LiferayRoleGroup lrg = new LiferayRoleGroup(roleSoap);
            values.add(lrg);
        }

        if (LiferayRoleGroup.siteCache.isEmpty()) {
            // initialize cache
            GroupSoap[] sites = groupService.getUserSites();
            for (GroupSoap site : sites) {
                LOG.ok("put to siteCache {0}:{1}", site.getGroupId(), site.getName());
                LiferayRoleGroup.siteCache.put(site.getName(), site.getGroupId());
            }
        }

        for (String groupName : LiferayRoleGroup.siteCache.keySet()) {
            Long groupId = LiferayRoleGroup.siteCache.get(groupName);
            RoleSoap[] siteRoles = roleService.getUserGroupRoles(userId, groupId);
            for (RoleSoap roleSoap : siteRoles) {
                LiferayRoleGroup lrg = new LiferayRoleGroup(roleSoap, LiferayRoleGroup.TYPE_SITE, groupId, groupName);
                values.add(lrg);
            }
        }
    }

    public long[] getRegularRoles() {
        if (!modifyRoles)
            return null;

        List<Long> regularRoles = new LinkedList<Long>();
        for (LiferayRoleGroup value : values) {
            if (value.isRegularRole()) {
                regularRoles.add(value.getRoleId());
            }
        }
        long[] ret = new long[0];
        if (!regularRoles.isEmpty()) {
            ret = new long[regularRoles.size()];
            for (int i = 0; i < regularRoles.size(); i++) {
                ret[i] = regularRoles.get(i);
            }
        }

        return ret;
    }

    public UserGroupRoleSoap[] getUserGroupRoles(long userId) {
        if (!modifyRoles)
            return null;

        List<LiferayRoleGroup> notRegularRoles = new LinkedList<LiferayRoleGroup>();
        for (LiferayRoleGroup rg : values) {
            if (!rg.isRegularRole()) {
                notRegularRoles.add(rg);
            }
        }
        UserGroupRoleSoap[] ret = new UserGroupRoleSoap[notRegularRoles.size()];
        for (int i = 0; i < notRegularRoles.size(); i++) {
            LiferayRoleGroup rg = notRegularRoles.get(i);
            UserGroupRoleSoap ugrs = new UserGroupRoleSoap();
            ugrs.setUserId(userId);
            ugrs.setRoleId(rg.getRoleId());
            ugrs.setGroupId(rg.getGroupId());
            ret[i] = ugrs;
        }

        return ret;
    }

    public static String userGroupRolesToString(UserGroupRoleSoap[] userGroupRoles) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (userGroupRoles != null) {
            for (UserGroupRoleSoap ugr : userGroupRoles) {
                sb.append("(" + ugr.getUserId() + "," + ugr.getGroupId() + "," + ugr.getRoleId() + "),");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    public String[] getValues() {
        String[] ret = new String[values.size()];
        for (int i = 0; i < values.size(); i++) {
            ret[i] = values.get(i).getValue();
        }
        return ret;
    }

    @Override
    public String toString() {
        return "LiferayRoles{" +
                "modifyRoles=" + modifyRoles +
                ", values=" + values +
                '}';
    }

    public long[] getSites() {
        long[] ret = null;
        Set<Long> sites = new HashSet<Long>();
        for (LiferayRoleGroup rg : values) {
            if (rg.isSiteRole()) {
                sites.add(rg.getGroupId());
            }
        }
        if (!sites.isEmpty()) {
            ret = new long[sites.size()];
            int i=0;
            for (Long site : sites) {
                ret[i]=site.longValue();
                i++;
            }
        }

        return ret;
    }
}
