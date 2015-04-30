/**
 * ContactServiceSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.contact;

public interface ContactServiceSoapService extends javax.xml.rpc.Service {
    public java.lang.String getPortal_ContactServiceAddress();

    public com.evolveum.polygon.connector.liferay.contact.ContactServiceSoap getPortal_ContactService() throws javax.xml.rpc.ServiceException;

    public com.evolveum.polygon.connector.liferay.contact.ContactServiceSoap getPortal_ContactService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
