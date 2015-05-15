/**
 * OrganizationServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.organization;

public class OrganizationServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.evolveum.polygon.connector.liferay.organization.OrganizationServiceSoapService {

    public OrganizationServiceSoapServiceLocator() {
    }


    public OrganizationServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrganizationServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_OrganizationService
    private java.lang.String Portal_OrganizationService_address = "http://localhost:8080/api/axis/Portal_OrganizationService";

    public java.lang.String getPortal_OrganizationServiceAddress() {
        return Portal_OrganizationService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_OrganizationServiceWSDDServiceName = "Portal_OrganizationService";

    public java.lang.String getPortal_OrganizationServiceWSDDServiceName() {
        return Portal_OrganizationServiceWSDDServiceName;
    }

    public void setPortal_OrganizationServiceWSDDServiceName(java.lang.String name) {
        Portal_OrganizationServiceWSDDServiceName = name;
    }

    public com.evolveum.polygon.connector.liferay.organization.OrganizationServiceSoap getPortal_OrganizationService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_OrganizationService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_OrganizationService(endpoint);
    }

    public com.evolveum.polygon.connector.liferay.organization.OrganizationServiceSoap getPortal_OrganizationService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.evolveum.polygon.connector.liferay.organization.Portal_OrganizationServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.organization.Portal_OrganizationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_OrganizationServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_OrganizationServiceEndpointAddress(java.lang.String address) {
        Portal_OrganizationService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.evolveum.polygon.connector.liferay.organization.OrganizationServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.evolveum.polygon.connector.liferay.organization.Portal_OrganizationServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.organization.Portal_OrganizationServiceSoapBindingStub(new java.net.URL(Portal_OrganizationService_address), this);
                _stub.setPortName(getPortal_OrganizationServiceWSDDServiceName());
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
        if ("Portal_OrganizationService".equals(inputPortName)) {
            return getPortal_OrganizationService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "OrganizationServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_OrganizationService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_OrganizationService".equals(portName)) {
            setPortal_OrganizationServiceEndpointAddress(address);
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
