/**
 * SmartCredentialListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialListResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.SmartCredentialInfo[] smartCredentials;

    private java.lang.String nextSmartCredentialSerialNumber;

    public SmartCredentialListResult() {
    }

    public SmartCredentialListResult(
           wsdl.adminV8.ig.com.entrust.SmartCredentialInfo[] smartCredentials,
           java.lang.String nextSmartCredentialSerialNumber) {
           this.smartCredentials = smartCredentials;
           this.nextSmartCredentialSerialNumber = nextSmartCredentialSerialNumber;
    }


    /**
     * Gets the smartCredentials value for this SmartCredentialListResult.
     * 
     * @return smartCredentials
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialInfo[] getSmartCredentials() {
        return smartCredentials;
    }


    /**
     * Sets the smartCredentials value for this SmartCredentialListResult.
     * 
     * @param smartCredentials
     */
    public void setSmartCredentials(wsdl.adminV8.ig.com.entrust.SmartCredentialInfo[] smartCredentials) {
        this.smartCredentials = smartCredentials;
    }


    /**
     * Gets the nextSmartCredentialSerialNumber value for this SmartCredentialListResult.
     * 
     * @return nextSmartCredentialSerialNumber
     */
    public java.lang.String getNextSmartCredentialSerialNumber() {
        return nextSmartCredentialSerialNumber;
    }


    /**
     * Sets the nextSmartCredentialSerialNumber value for this SmartCredentialListResult.
     * 
     * @param nextSmartCredentialSerialNumber
     */
    public void setNextSmartCredentialSerialNumber(java.lang.String nextSmartCredentialSerialNumber) {
        this.nextSmartCredentialSerialNumber = nextSmartCredentialSerialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialListResult)) return false;
        SmartCredentialListResult other = (SmartCredentialListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smartCredentials==null && other.getSmartCredentials()==null) || 
             (this.smartCredentials!=null &&
              java.util.Arrays.equals(this.smartCredentials, other.getSmartCredentials()))) &&
            ((this.nextSmartCredentialSerialNumber==null && other.getNextSmartCredentialSerialNumber()==null) || 
             (this.nextSmartCredentialSerialNumber!=null &&
              this.nextSmartCredentialSerialNumber.equals(other.getNextSmartCredentialSerialNumber())));
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
        if (getSmartCredentials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartCredentials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmartCredentials(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextSmartCredentialSerialNumber() != null) {
            _hashCode += getNextSmartCredentialSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smartCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextSmartCredentialSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextSmartCredentialSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
