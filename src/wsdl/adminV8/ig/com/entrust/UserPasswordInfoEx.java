/**
 * UserPasswordInfoEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserPasswordInfoEx  extends wsdl.adminV8.ig.com.entrust.UserPasswordInfo  implements java.io.Serializable {
    private java.lang.String passwordName;

    public UserPasswordInfoEx() {
    }

    public UserPasswordInfoEx(
           java.lang.String userid,
           java.lang.String userName,
           java.lang.String group,
           java.lang.String passwordStorage,
           java.lang.String retrievablePassword,
           java.util.Calendar lastChangeDate,
           java.util.Calendar expireDate,
           java.lang.Boolean changeRequired,
           java.lang.Integer historySize,
           java.lang.Boolean imported,
           java.lang.String[] rolesGrantingAccess,
           java.lang.String passwordName) {
        super(
            userid,
            userName,
            group,
            passwordStorage,
            retrievablePassword,
            lastChangeDate,
            expireDate,
            changeRequired,
            historySize,
            imported,
            rolesGrantingAccess);
        this.passwordName = passwordName;
    }


    /**
     * Gets the passwordName value for this UserPasswordInfoEx.
     * 
     * @return passwordName
     */
    public java.lang.String getPasswordName() {
        return passwordName;
    }


    /**
     * Sets the passwordName value for this UserPasswordInfoEx.
     * 
     * @param passwordName
     */
    public void setPasswordName(java.lang.String passwordName) {
        this.passwordName = passwordName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPasswordInfoEx)) return false;
        UserPasswordInfoEx other = (UserPasswordInfoEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.passwordName==null && other.getPasswordName()==null) || 
             (this.passwordName!=null &&
              this.passwordName.equals(other.getPasswordName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPasswordName() != null) {
            _hashCode += getPasswordName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPasswordInfoEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserPasswordInfoEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordName"));
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
