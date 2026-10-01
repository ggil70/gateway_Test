/**
 * AuthenticatorLockout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AuthenticatorLockout  implements java.io.Serializable {
    private java.lang.String name;

    private int failureCount;

    private java.util.Calendar lockoutDate;

    public AuthenticatorLockout() {
    }

    public AuthenticatorLockout(
           java.lang.String name,
           int failureCount,
           java.util.Calendar lockoutDate) {
           this.name = name;
           this.failureCount = failureCount;
           this.lockoutDate = lockoutDate;
    }


    /**
     * Gets the name value for this AuthenticatorLockout.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AuthenticatorLockout.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the failureCount value for this AuthenticatorLockout.
     * 
     * @return failureCount
     */
    public int getFailureCount() {
        return failureCount;
    }


    /**
     * Sets the failureCount value for this AuthenticatorLockout.
     * 
     * @param failureCount
     */
    public void setFailureCount(int failureCount) {
        this.failureCount = failureCount;
    }


    /**
     * Gets the lockoutDate value for this AuthenticatorLockout.
     * 
     * @return lockoutDate
     */
    public java.util.Calendar getLockoutDate() {
        return lockoutDate;
    }


    /**
     * Sets the lockoutDate value for this AuthenticatorLockout.
     * 
     * @param lockoutDate
     */
    public void setLockoutDate(java.util.Calendar lockoutDate) {
        this.lockoutDate = lockoutDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticatorLockout)) return false;
        AuthenticatorLockout other = (AuthenticatorLockout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
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
        new org.apache.axis.description.TypeDesc(AuthenticatorLockout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuthenticatorLockout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
