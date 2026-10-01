/**
 * AdminService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AdminService_ServiceLocator extends org.apache.axis.client.Service implements wsdl.adminV8.ig.com.entrust.AdminService_Service {

    public AdminService_ServiceLocator() {
    }


    public AdminService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdminService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AdminService
    private java.lang.String AdminService_address = "https://10.3.0.215:8444/IdentityGuardAdminService/services/AdminServiceV8";

    public java.lang.String getAdminServiceAddress() {
        return AdminService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdminServiceWSDDServiceName = "AdminService";

    public java.lang.String getAdminServiceWSDDServiceName() {
        return AdminServiceWSDDServiceName;
    }

    public void setAdminServiceWSDDServiceName(java.lang.String name) {
        AdminServiceWSDDServiceName = name;
    }

    public wsdl.adminV8.ig.com.entrust.AdminService_PortType getAdminService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AdminService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdminService(endpoint);
    }

    public wsdl.adminV8.ig.com.entrust.AdminService_PortType getAdminService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            wsdl.adminV8.ig.com.entrust.AdminServiceSoapBindingStub _stub = new wsdl.adminV8.ig.com.entrust.AdminServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdminServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdminServiceEndpointAddress(java.lang.String address) {
        AdminService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (wsdl.adminV8.ig.com.entrust.AdminService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                wsdl.adminV8.ig.com.entrust.AdminServiceSoapBindingStub _stub = new wsdl.adminV8.ig.com.entrust.AdminServiceSoapBindingStub(new java.net.URL(AdminService_address), this);
                _stub.setPortName(getAdminServiceWSDDServiceName());
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
        if ("AdminService".equals(inputPortName)) {
            return getAdminService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AdminService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AdminService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AdminService".equals(portName)) {
            setAdminServiceEndpointAddress(address);
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
