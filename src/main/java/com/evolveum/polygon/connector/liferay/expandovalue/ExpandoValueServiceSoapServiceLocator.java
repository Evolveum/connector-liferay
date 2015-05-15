/**
 * ExpandoValueServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.expandovalue;

public class ExpandoValueServiceSoapServiceLocator extends org.apache.axis.client.Service implements com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueServiceSoapService {

    public ExpandoValueServiceSoapServiceLocator() {
    }


    public ExpandoValueServiceSoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExpandoValueServiceSoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Portlet_Expando_ExpandoValueService
    private java.lang.String Portlet_Expando_ExpandoValueService_address = "http://localhost:8080/api/axis/Portlet_Expando_ExpandoValueService";

    public java.lang.String getPortlet_Expando_ExpandoValueServiceAddress() {
        return Portlet_Expando_ExpandoValueService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Portlet_Expando_ExpandoValueServiceWSDDServiceName = "Portlet_Expando_ExpandoValueService";

    public java.lang.String getPortlet_Expando_ExpandoValueServiceWSDDServiceName() {
        return Portlet_Expando_ExpandoValueServiceWSDDServiceName;
    }

    public void setPortlet_Expando_ExpandoValueServiceWSDDServiceName(java.lang.String name) {
        Portlet_Expando_ExpandoValueServiceWSDDServiceName = name;
    }

    public com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueServiceSoap getPortlet_Expando_ExpandoValueService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Portlet_Expando_ExpandoValueService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortlet_Expando_ExpandoValueService(endpoint);
    }

    public com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueServiceSoap getPortlet_Expando_ExpandoValueService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.evolveum.polygon.connector.liferay.expandovalue.Portlet_Expando_ExpandoValueServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.expandovalue.Portlet_Expando_ExpandoValueServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortlet_Expando_ExpandoValueServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortlet_Expando_ExpandoValueServiceEndpointAddress(java.lang.String address) {
        Portlet_Expando_ExpandoValueService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.evolveum.polygon.connector.liferay.expandovalue.Portlet_Expando_ExpandoValueServiceSoapBindingStub _stub = new com.evolveum.polygon.connector.liferay.expandovalue.Portlet_Expando_ExpandoValueServiceSoapBindingStub(new java.net.URL(Portlet_Expando_ExpandoValueService_address), this);
                _stub.setPortName(getPortlet_Expando_ExpandoValueServiceWSDDServiceName());
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
        if ("Portlet_Expando_ExpandoValueService".equals(inputPortName)) {
            return getPortlet_Expando_ExpandoValueService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:http.service.expando.portlet.liferay.com", "ExpandoValueServiceSoapService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:http.service.expando.portlet.liferay.com", "Portlet_Expando_ExpandoValueService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Portlet_Expando_ExpandoValueService".equals(portName)) {
            setPortlet_Expando_ExpandoValueServiceEndpointAddress(address);
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
