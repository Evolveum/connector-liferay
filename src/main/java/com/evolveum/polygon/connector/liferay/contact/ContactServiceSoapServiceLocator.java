/**
 * ContactServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.contact;

public class ContactServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.evolveum.polygon.connector.liferay.contact.ContactServiceSoapService {

    public ContactServiceSoapServiceLocator() {
    }


    public ContactServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContactServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_ContactService
    private java.lang.String Portal_ContactService_address = "http://localhost:8080/api/axis/Portal_ContactService";

    public java.lang.String getPortal_ContactServiceAddress() {
        return Portal_ContactService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_ContactServiceWSDDServiceName = "Portal_ContactService";

    public java.lang.String getPortal_ContactServiceWSDDServiceName() {
        return Portal_ContactServiceWSDDServiceName;
    }

    public void setPortal_ContactServiceWSDDServiceName(java.lang.String name) {
        Portal_ContactServiceWSDDServiceName = name;
    }

    public com.evolveum.polygon.connector.liferay.contact.ContactServiceSoap getPortal_ContactService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_ContactService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_ContactService(endpoint);
    }

    public com.evolveum.polygon.connector.liferay.contact.ContactServiceSoap getPortal_ContactService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.evolveum.polygon.connector.liferay.contact.Portal_ContactServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.contact.Portal_ContactServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_ContactServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_ContactServiceEndpointAddress(java.lang.String address) {
        Portal_ContactService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.evolveum.polygon.connector.liferay.contact.ContactServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.evolveum.polygon.connector.liferay.contact.Portal_ContactServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.contact.Portal_ContactServiceSoapBindingStub(new java.net.URL(Portal_ContactService_address), this);
                _stub.setPortName(getPortal_ContactServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Portal_ContactService".equals(inputPortName)) {
            return getPortal_ContactService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "ContactServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_ContactService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_ContactService".equals(portName)) {
            setPortal_ContactServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
