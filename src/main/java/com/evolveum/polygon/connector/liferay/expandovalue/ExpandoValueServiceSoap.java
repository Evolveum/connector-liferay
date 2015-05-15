/**
 * ExpandoValueServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.expandovalue;

public interface ExpandoValueServiceSoap extends java.rmi.Remote {
    public com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueSoap addValue(long companyId, java.lang.String className, java.lang.String tableName, java.lang.String columnName, long classPK, java.lang.Object data) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueSoap addValue(long companyId, java.lang.String className, java.lang.String tableName, java.lang.String columnName, long classPK, java.lang.String data) throws java.rmi.RemoteException;
    public java.lang.String getJSONData(long companyId, java.lang.String className, java.lang.String tableName, java.lang.String columnName, long classPK) throws java.rmi.RemoteException;
}
