/**
 * ContactServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.contact;

public interface ContactServiceSoap extends java.rmi.Remote {
    public com.evolveum.polygon.connector.liferay.contact.ContactSoap getContact(long contactId) throws java.rmi.RemoteException;
    public int getContactsCount(long classNameId, long classPK) throws java.rmi.RemoteException;
    public com.evolveum.polygon.connector.liferay.contact.ContactSoap[] getContacts(long classNameId, long classPK, int start, int end, com.evolveum.polygon.connector.liferay.contact.OrderByComparator orderByComparator) throws java.rmi.RemoteException;
}
