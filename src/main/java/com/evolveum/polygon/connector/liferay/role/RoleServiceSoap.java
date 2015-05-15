/**
 * RoleServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.role;

public interface RoleServiceSoap extends java.rmi.Remote {
    public com.evolveum.polygon.connector.liferay.role.RoleSoap addRole(java.lang.String name, java.lang.String[] titleMapLanguageIds, java.lang.String[] titleMapValues, java.lang.String[] descriptionMapLanguageIds, java.lang.String[] descriptionMapValues, int type) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.role.RoleSoap addRole(java.lang.String className, long classPK, java.lang.String name, java.lang.String[] titleMapLanguageIds, java.lang.String[] titleMapValues, java.lang.String[] descriptionMapLanguageIds, java.lang.String[] descriptionMapValues, int type, java.lang.String subtype, com.evolveum.polygon.connector.liferay.role.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void addUserRoles(long userId, long[] roleIds) throws java.rmi.RemoteException;
    public void deleteRole(long roleId) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.role.RoleSoap[] getGroupRoles(long groupId) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.role.RoleSoap getRole(long roleId) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.role.RoleSoap getRole(long companyId, java.lang.String name) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.role.RoleSoap[] getUserGroupGroupRoles(long userId, long groupId) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.role.RoleSoap[] getUserGroupRoles(long userId, long groupId) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.role.RoleSoap[] getUserRelatedRoles(long userId, com.evolveum.polygon.connector.liferay.role.GroupSoap[] groups) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.role.RoleSoap[] getUserRoles(long userId) throws java.rmi.RemoteException;
    public boolean hasUserRole(long userId, long companyId, java.lang.String name, boolean inherited) throws java.rmi.RemoteException;
    public boolean hasUserRoles(long userId, long companyId, java.lang.String[] names, boolean inherited) throws java.rmi.RemoteException;
    public void unsetUserRoles(long userId, long[] roleIds) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.role.RoleSoap updateRole(long roleId, java.lang.String name, java.lang.String[] titleMapLanguageIds, java.lang.String[] titleMapValues, java.lang.String[] descriptionMapLanguageIds, java.lang.String[] descriptionMapValues, java.lang.String subtype, com.evolveum.polygon.connector.liferay.role.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
