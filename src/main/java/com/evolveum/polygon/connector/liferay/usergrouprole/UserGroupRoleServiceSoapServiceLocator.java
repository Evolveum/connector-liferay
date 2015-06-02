/**
 * UserGroupRoleServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.usergrouprole;

public class UserGroupRoleServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.evolveum.polygon.connector.liferay.usergrouprole.UserGroupRoleServiceSoapService {

    public UserGroupRoleServiceSoapServiceLocator() {
    }


    public UserGroupRoleServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserGroupRoleServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portal_UserGroupRoleService
    private java.lang.String Portal_UserGroupRoleService_address = "http://localhost:8080/api/axis/Portal_UserGroupRoleService";

    public java.lang.String getPortal_UserGroupRoleServiceAddress() {
        return Portal_UserGroupRoleService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portal_UserGroupRoleServiceWSDDServiceName = "Portal_UserGroupRoleService";

    public java.lang.String getPortal_UserGroupRoleServiceWSDDServiceName() {
        return Portal_UserGroupRoleServiceWSDDServiceName;
    }

    public void setPortal_UserGroupRoleServiceWSDDServiceName(java.lang.String name) {
        Portal_UserGroupRoleServiceWSDDServiceName = name;
    }

    public com.evolveum.polygon.connector.liferay.usergrouprole.UserGroupRoleServiceSoap getPortal_UserGroupRoleService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portal_UserGroupRoleService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortal_UserGroupRoleService(endpoint);
    }

    public com.evolveum.polygon.connector.liferay.usergrouprole.UserGroupRoleServiceSoap getPortal_UserGroupRoleService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.evolveum.polygon.connector.liferay.usergrouprole.Portal_UserGroupRoleServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.usergrouprole.Portal_UserGroupRoleServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortal_UserGroupRoleServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortal_UserGroupRoleServiceEndpointAddress(java.lang.String address) {
        Portal_UserGroupRoleService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.evolveum.polygon.connector.liferay.usergrouprole.UserGroupRoleServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.evolveum.polygon.connector.liferay.usergrouprole.Portal_UserGroupRoleServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.usergrouprole.Portal_UserGroupRoleServiceSoapBindingStub(new java.net.URL(Portal_UserGroupRoleService_address), this);
                _stub.setPortName(getPortal_UserGroupRoleServiceWSDDServiceName());
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
        if ("Portal_UserGroupRoleService".equals(inputPortName)) {
            return getPortal_UserGroupRoleService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "UserGroupRoleServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.portal.liferay.com", "Portal_UserGroupRoleService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portal_UserGroupRoleService".equals(portName)) {
            setPortal_UserGroupRoleServiceEndpointAddress(address);
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
