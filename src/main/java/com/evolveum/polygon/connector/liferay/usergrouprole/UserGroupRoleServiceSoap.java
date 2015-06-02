/**
 * UserGroupRoleServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.usergrouprole;

public interface UserGroupRoleServiceSoap extends java.rmi.Remote {
    public void addUserGroupRoles(long[] userIds, long groupId, long roleId) throws java.rmi.RemoteException;
    public void addUserGroupRoles(long userId, long groupId, long[] roleIds) throws java.rmi.RemoteException;
    public void deleteUserGroupRoles(long[] userIds, long groupId, long roleId) throws java.rmi.RemoteException;
    public void deleteUserGroupRoles(long userId, long groupId, long[] roleIds) throws java.rmi.RemoteException;
}
