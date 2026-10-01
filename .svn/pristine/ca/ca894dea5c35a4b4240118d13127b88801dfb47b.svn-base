/**
 * UserSmartCredentialUnblockResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserSmartCredentialUnblockResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.UserSmartCredentialInfo smartCredential;

    private java.lang.String unblockCode;

    private java.lang.String delivery;

    public UserSmartCredentialUnblockResult() {
    }

    public UserSmartCredentialUnblockResult(
           wsdl.adminV8.ig.com.entrust.UserSmartCredentialInfo smartCredential,
           java.lang.String unblockCode,
           java.lang.String delivery) {
           this.smartCredential = smartCredential;
           this.unblockCode = unblockCode;
           this.delivery = delivery;
    }


    /**
     * Gets the smartCredential value for this UserSmartCredentialUnblockResult.
     * 
     * @return smartCredential
     */
    public wsdl.adminV8.ig.com.entrust.UserSmartCredentialInfo getSmartCredential() {
        return smartCredential;
    }


    /**
     * Sets the smartCredential value for this UserSmartCredentialUnblockResult.
     * 
     * @param smartCredential
     */
    public void setSmartCredential(wsdl.adminV8.ig.com.entrust.UserSmartCredentialInfo smartCredential) {
        this.smartCredential = smartCredential;
    }


    /**
     * Gets the unblockCode value for this UserSmartCredentialUnblockResult.
     * 
     * @return unblockCode
     */
    public java.lang.String getUnblockCode() {
        return unblockCode;
    }


    /**
     * Sets the unblockCode value for this UserSmartCredentialUnblockResult.
     * 
     * @param unblockCode
     */
    public void setUnblockCode(java.lang.String unblockCode) {
        this.unblockCode = unblockCode;
    }


    /**
     * Gets the delivery value for this UserSmartCredentialUnblockResult.
     * 
     * @return delivery
     */
    public java.lang.String getDelivery() {
        return delivery;
    }


    /**
     * Sets the delivery value for this UserSmartCredentialUnblockResult.
     * 
     * @param delivery
     */
    public void setDelivery(java.lang.String delivery) {
        this.delivery = delivery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSmartCredentialUnblockResult)) return false;
        UserSmartCredentialUnblockResult other = (UserSmartCredentialUnblockResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smartCredential==null && other.getSmartCredential()==null) || 
             (this.smartCredential!=null &&
              this.smartCredential.equals(other.getSmartCredential()))) &&
            ((this.unblockCode==null && other.getUnblockCode()==null) || 
             (this.unblockCode!=null &&
              this.unblockCode.equals(other.getUnblockCode()))) &&
            ((this.delivery==null && other.getDelivery()==null) || 
             (this.delivery!=null &&
              this.delivery.equals(other.getDelivery())));
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
        if (getSmartCredential() != null) {
            _hashCode += getSmartCredential().hashCode();
        }
        if (getUnblockCode() != null) {
            _hashCode += getUnblockCode().hashCode();
        }
        if (getDelivery() != null) {
            _hashCode += getDelivery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserSmartCredentialUnblockResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSmartCredentialUnblockResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smartCredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSmartCredentialInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unblockCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unblockCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivery"));
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
