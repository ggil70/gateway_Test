/**
 * AuthenticatorLockoutEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AuthenticatorLockoutEx  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutId id;

    private int failureCount;

    private java.util.Calendar lockoutDate;

    public AuthenticatorLockoutEx() {
    }

    public AuthenticatorLockoutEx(
           wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutId id,
           int failureCount,
           java.util.Calendar lockoutDate) {
           this.id = id;
           this.failureCount = failureCount;
           this.lockoutDate = lockoutDate;
    }


    /**
     * Gets the id value for this AuthenticatorLockoutEx.
     * 
     * @return id
     */
    public wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutId getId() {
        return id;
    }


    /**
     * Sets the id value for this AuthenticatorLockoutEx.
     * 
     * @param id
     */
    public void setId(wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutId id) {
        this.id = id;
    }


    /**
     * Gets the failureCount value for this AuthenticatorLockoutEx.
     * 
     * @return failureCount
     */
    public int getFailureCount() {
        return failureCount;
    }


    /**
     * Sets the failureCount value for this AuthenticatorLockoutEx.
     * 
     * @param failureCount
     */
    public void setFailureCount(int failureCount) {
        this.failureCount = failureCount;
    }


    /**
     * Gets the lockoutDate value for this AuthenticatorLockoutEx.
     * 
     * @return lockoutDate
     */
    public java.util.Calendar getLockoutDate() {
        return lockoutDate;
    }


    /**
     * Sets the lockoutDate value for this AuthenticatorLockoutEx.
     * 
     * @param lockoutDate
     */
    public void setLockoutDate(java.util.Calendar lockoutDate) {
        this.lockoutDate = lockoutDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticatorLockoutEx)) return false;
        AuthenticatorLockoutEx other = (AuthenticatorLockoutEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.failureCount == other.getFailureCount() &&
            ((this.lockoutDate==null && other.getLockoutDate()==null) || 
             (this.lockoutDate!=null &&
              this.lockoutDate.equals(other.getLockoutDate())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += getFailureCount();
        if (getLockoutDate() != null) {
            _hashCode += getLockoutDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticatorLockoutEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuthenticatorLockoutEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuthenticatorLockoutId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FailureCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LockoutDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
