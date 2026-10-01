/**
 * UserTokenActivateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserTokenActivateResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.UserTokenInfo token;

    private java.lang.String activationId;

    private java.lang.String activationCode;

    private java.lang.String checkCode;

    public UserTokenActivateResult() {
    }

    public UserTokenActivateResult(
           wsdl.adminV8.ig.com.entrust.UserTokenInfo token,
           java.lang.String activationId,
           java.lang.String activationCode,
           java.lang.String checkCode) {
           this.token = token;
           this.activationId = activationId;
           this.activationCode = activationCode;
           this.checkCode = checkCode;
    }


    /**
     * Gets the token value for this UserTokenActivateResult.
     * 
     * @return token
     */
    public wsdl.adminV8.ig.com.entrust.UserTokenInfo getToken() {
        return token;
    }


    /**
     * Sets the token value for this UserTokenActivateResult.
     * 
     * @param token
     */
    public void setToken(wsdl.adminV8.ig.com.entrust.UserTokenInfo token) {
        this.token = token;
    }


    /**
     * Gets the activationId value for this UserTokenActivateResult.
     * 
     * @return activationId
     */
    public java.lang.String getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this UserTokenActivateResult.
     * 
     * @param activationId
     */
    public void setActivationId(java.lang.String activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the activationCode value for this UserTokenActivateResult.
     * 
     * @return activationCode
     */
    public java.lang.String getActivationCode() {
        return activationCode;
    }


    /**
     * Sets the activationCode value for this UserTokenActivateResult.
     * 
     * @param activationCode
     */
    public void setActivationCode(java.lang.String activationCode) {
        this.activationCode = activationCode;
    }


    /**
     * Gets the checkCode value for this UserTokenActivateResult.
     * 
     * @return checkCode
     */
    public java.lang.String getCheckCode() {
        return checkCode;
    }


    /**
     * Sets the checkCode value for this UserTokenActivateResult.
     * 
     * @param checkCode
     */
    public void setCheckCode(java.lang.String checkCode) {
        this.checkCode = checkCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTokenActivateResult)) return false;
        UserTokenActivateResult other = (UserTokenActivateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
            ((this.activationCode==null && other.getActivationCode()==null) || 
             (this.activationCode!=null &&
              this.activationCode.equals(other.getActivationCode()))) &&
            ((this.checkCode==null && other.getCheckCode()==null) || 
             (this.checkCode!=null &&
              this.checkCode.equals(other.getCheckCode())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        if (getActivationCode() != null) {
            _hashCode += getActivationCode().hashCode();
        }
        if (getCheckCode() != null) {
            _hashCode += getCheckCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTokenActivateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserTokenActivateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserTokenInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkCode"));
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
