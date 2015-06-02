/**
 * GroupServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.group;

public interface GroupServiceSoap extends java.rmi.Remote {
    public com.evolveum.polygon.connector.liferay.group.GroupSoap addGroup(long parentGroupId, long liveGroupId, java.lang.String name, java.lang.String description, int type, boolean manualMembership, int membershipRestriction, java.lang.String friendlyURL, boolean site, boolean active, com.evolveum.polygon.connector.liferay.group.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap addGroup(long parentGroupId, java.lang.String name, java.lang.String description, int type, java.lang.String friendlyURL, boolean site, boolean active, com.evolveum.polygon.connector.liferay.group.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap addGroup(java.lang.String name, java.lang.String description, int type, java.lang.String friendlyURL, boolean site, boolean active, com.evolveum.polygon.connector.liferay.group.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void addRoleGroups(long roleId, long[] groupIds) throws java.rmi.RemoteException;
    public void checkRemoteStagingGroup(long groupId) throws java.rmi.RemoteException;
    public void deleteGroup(long groupId) throws java.rmi.RemoteException;
    public void disableStaging(long groupId) throws java.rmi.RemoteException;
    public void enableStaging(long groupId) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap getCompanyGroup(long companyId) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap getGroup(long groupId) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap getGroup(long companyId, java.lang.String name) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getGroups(long companyId, long parentGroupId, boolean site) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getManageableSiteGroups(java.lang.Object[] portlets, int max) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getManageableSites(java.lang.Object[] portlets, int max) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getOrganizationsGroups(com.evolveum.polygon.connector.liferay.group.OrganizationSoap[] organizations) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap getUserGroup(long companyId, long userId) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserGroupsGroups(com.evolveum.polygon.connector.liferay.group.UserGroupSoap[] userGroups) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserOrganizationsGroups(long userId, int start, int end) throws java.rmi.RemoteException;
    public int getUserPlacesCount() throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserPlaces(java.lang.String[] classNames, int max) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserPlaces(long userId, java.lang.String[] classNames, boolean includeControlPanel, int max) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserPlaces(long userId, java.lang.String[] classNames, int max) throws java.rmi.RemoteException;
    public int getUserSitesGroupsCount() throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserSitesGroups() throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserSitesGroups(java.lang.String[] classNames, int max) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserSitesGroups(long userId, java.lang.String[] classNames, boolean includeControlPanel, int max) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserSitesGroups(long userId, java.lang.String[] classNames, int max) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] getUserSites() throws java.rmi.RemoteException;
    public boolean hasUserGroup(long userId, long groupId) throws java.rmi.RemoteException;
    public int searchCount(long companyId, java.lang.String name, java.lang.String description, java.lang.String[] params) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap[] search(long companyId, java.lang.String name, java.lang.String description, java.lang.String[] params, int start, int end) throws java.rmi.RemoteException;
    public void setRoleGroups(long roleId, long[] groupIds) throws java.rmi.RemoteException;
    public void unsetRoleGroups(long roleId, long[] groupIds) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap updateFriendlyURL(long groupId, java.lang.String friendlyURL) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap updateGroup(long groupId, long parentGroupId, java.lang.String name, java.lang.String description, int type, boolean manualMembership, int membershipRestriction, java.lang.String friendlyURL, boolean active, com.evolveum.polygon.connector.liferay.group.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.group.GroupSoap updateGroup(long groupId, java.lang.String typeSettings) throws java.rmi.RemoteException;


}
