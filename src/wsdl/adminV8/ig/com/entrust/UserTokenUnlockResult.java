/**
 * UserTokenUnlockResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserTokenUnlockResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.UserTokenInfo token;

    private java.lang.String unlockCode;

    public UserTokenUnlockResult() {
    }

    public UserTokenUnlockResult(
           wsdl.adminV8.ig.com.entrust.UserTokenInfo token,
           java.lang.String unlockCode) {
           this.token = token;
           this.unlockCode = unlockCode;
    }


    /**
     * Gets the token value for this UserTokenUnlockResult.
     * 
     * @return token
     */
    public wsdl.adminV8.ig.com.entrust.UserTokenInfo getToken() {
        return token;
    }


    /**
     * Sets the token value for this UserTokenUnlockResult.
     * 
     * @param token
     */
    public void setToken(wsdl.adminV8.ig.com.entrust.UserTokenInfo token) {
        this.token = token;
    }


    /**
     * Gets the unlockCode value for this UserTokenUnlockResult.
     * 
     * @return unlockCode
     */
    public java.lang.String getUnlockCode() {
        return unlockCode;
    }


    /**
     * Sets the unlockCode value for this UserTokenUnlockResult.
     * 
     * @param unlockCode
     */
    public void setUnlockCode(java.lang.String unlockCode) {
        this.unlockCode = unlockCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTokenUnlockResult)) return false;
        UserTokenUnlockResult other = (UserTokenUnlockResult) obj;
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
            ((this.unlockCode==null && other.getUnlockCode()==null) || 
             (this.unlockCode!=null &&
              this.unlockCode.equals(other.getUnlockCode())));
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
        if (getUnlockCode() != null) {
            _hashCode += getUnlockCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTokenUnlockResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserTokenUnlockResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserTokenInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlockCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unlockCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
