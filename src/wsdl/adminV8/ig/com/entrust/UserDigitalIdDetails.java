/**
 * UserDigitalIdDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserDigitalIdDetails  implements java.io.Serializable {
    private int numActiveCerts;

    private int numActiveCertsCanHold;

    private int numHoldCerts;

    private int numCanceledCerts;

    private wsdl.adminV8.ig.com.entrust.AdminServiceFault fault;

    public UserDigitalIdDetails() {
    }

    public UserDigitalIdDetails(
           int numActiveCerts,
           int numActiveCertsCanHold,
           int numHoldCerts,
           int numCanceledCerts,
           wsdl.adminV8.ig.com.entrust.AdminServiceFault fault) {
           this.numActiveCerts = numActiveCerts;
           this.numActiveCertsCanHold = numActiveCertsCanHold;
           this.numHoldCerts = numHoldCerts;
           this.numCanceledCerts = numCanceledCerts;
           this.fault = fault;
    }


    /**
     * Gets the numActiveCerts value for this UserDigitalIdDetails.
     * 
     * @return numActiveCerts
     */
    public int getNumActiveCerts() {
        return numActiveCerts;
    }


    /**
     * Sets the numActiveCerts value for this UserDigitalIdDetails.
     * 
     * @param numActiveCerts
     */
    public void setNumActiveCerts(int numActiveCerts) {
        this.numActiveCerts = numActiveCerts;
    }


    /**
     * Gets the numActiveCertsCanHold value for this UserDigitalIdDetails.
     * 
     * @return numActiveCertsCanHold
     */
    public int getNumActiveCertsCanHold() {
        return numActiveCertsCanHold;
    }


    /**
     * Sets the numActiveCertsCanHold value for this UserDigitalIdDetails.
     * 
     * @param numActiveCertsCanHold
     */
    public void setNumActiveCertsCanHold(int numActiveCertsCanHold) {
        this.numActiveCertsCanHold = numActiveCertsCanHold;
    }


    /**
     * Gets the numHoldCerts value for this UserDigitalIdDetails.
     * 
     * @return numHoldCerts
     */
    public int getNumHoldCerts() {
        return numHoldCerts;
    }


    /**
     * Sets the numHoldCerts value for this UserDigitalIdDetails.
     * 
     * @param numHoldCerts
     */
    public void setNumHoldCerts(int numHoldCerts) {
        this.numHoldCerts = numHoldCerts;
    }


    /**
     * Gets the numCanceledCerts value for this UserDigitalIdDetails.
     * 
     * @return numCanceledCerts
     */
    public int getNumCanceledCerts() {
        return numCanceledCerts;
    }


    /**
     * Sets the numCanceledCerts value for this UserDigitalIdDetails.
     * 
     * @param numCanceledCerts
     */
    public void setNumCanceledCerts(int numCanceledCerts) {
        this.numCanceledCerts = numCanceledCerts;
    }


    /**
     * Gets the fault value for this UserDigitalIdDetails.
     * 
     * @return fault
     */
    public wsdl.adminV8.ig.com.entrust.AdminServiceFault getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this UserDigitalIdDetails.
     * 
     * @param fault
     */
    public void setFault(wsdl.adminV8.ig.com.entrust.AdminServiceFault fault) {
        this.fault = fault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDigitalIdDetails)) return false;
        UserDigitalIdDetails other = (UserDigitalIdDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.numActiveCerts == other.getNumActiveCerts() &&
            this.numActiveCertsCanHold == other.getNumActiveCertsCanHold() &&
            this.numHoldCerts == other.getNumHoldCerts() &&
            this.numCanceledCerts == other.getNumCanceledCerts() &&
            ((this.fault==null && other.getFault()==null) || 
             (this.fault!=null &&
              this.fault.equals(other.getFault())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getNumActiveCerts();
        _hashCode += getNumActiveCertsCanHold();
        _hashCode += getNumHoldCerts();
        _hashCode += getNumCanceledCerts();
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDigitalIdDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserDigitalIdDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveCerts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numActiveCerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveCertsCanHold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numActiveCertsCanHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numHoldCerts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numHoldCerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCanceledCerts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numCanceledCerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AdminServiceFault"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
