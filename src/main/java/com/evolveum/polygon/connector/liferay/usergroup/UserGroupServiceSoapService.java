/**
 * UserGroupServiceSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.usergroup;

public interface UserGroupServiceSoapService extends javax.xml.rpc.Service {
    public java.lang.String getPortal_UserGroupServiceAddress();

    public com.evolveum.polygon.connector.liferay.usergroup.UserGroupServiceSoap getPortal_UserGroupService() throws javax.xml.rpc.ServiceException;

    public com.evolveum.polygon.connector.liferay.usergroup.UserGroupServiceSoap getPortal_UserGroupService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
