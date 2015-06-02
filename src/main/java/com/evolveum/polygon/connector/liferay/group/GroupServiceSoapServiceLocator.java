/**
 * GroupServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.group;

public class GroupServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.evolveum.polygon.connector.liferay.group.GroupServiceSoapService {

    public GroupServiceSoapServiceLocator() {
    }


    public GroupServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GroupServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_GroupService
    private java.lang.String Portal_GroupService_address = "http://localhost:8080/api/axis/Portal_GroupService";

    public java.lang.String getPortal_GroupServiceAddress() {
        return Portal_GroupService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_GroupServiceWSDDServiceName = "Portal_GroupService";

    public java.lang.String getPortal_GroupServiceWSDDServiceName() {
        return Portal_GroupServiceWSDDServiceName;
    }

    public void setPortal_GroupServiceWSDDServiceName(java.lang.String name) {
        Portal_GroupServiceWSDDServiceName = name;
    }

    public com.evolveum.polygon.connector.liferay.group.GroupServiceSoap getPortal_GroupService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_GroupService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_GroupService(endpoint);
    }

    public com.evolveum.polygon.connector.liferay.group.GroupServiceSoap getPortal_GroupService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.evolveum.polygon.connector.liferay.group.Portal_GroupServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.group.Portal_GroupServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_GroupServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_GroupServiceEndpointAddress(java.lang.String address) {
        Portal_GroupService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.evolveum.polygon.connector.liferay.group.GroupServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.evolveum.polygon.connector.liferay.group.Portal_GroupServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.group.Portal_GroupServiceSoapBindingStub(new java.net.URL(Portal_GroupService_address), this);
                _stub.setPortName(getPortal_GroupServiceWSDDServiceName());
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
        if ("Portal_GroupService".equals(inputPortName)) {
            return getPortal_GroupService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "GroupServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_GroupService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_GroupService".equals(portName)) {
            setPortal_GroupServiceEndpointAddress(address);
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
