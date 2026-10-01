/**
 * UserDigitalIdListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserDigitalIdListResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.UserDigitalIdInfo[] digitalIds;

    private java.math.BigInteger nextUser;

    public UserDigitalIdListResult() {
    }

    public UserDigitalIdListResult(
           wsdl.adminV8.ig.com.entrust.UserDigitalIdInfo[] digitalIds,
           java.math.BigInteger nextUser) {
           this.digitalIds = digitalIds;
           this.nextUser = nextUser;
    }


    /**
     * Gets the digitalIds value for this UserDigitalIdListResult.
     * 
     * @return digitalIds
     */
    public wsdl.adminV8.ig.com.entrust.UserDigitalIdInfo[] getDigitalIds() {
        return digitalIds;
    }


    /**
     * Sets the digitalIds value for this UserDigitalIdListResult.
     * 
     * @param digitalIds
     */
    public void setDigitalIds(wsdl.adminV8.ig.com.entrust.UserDigitalIdInfo[] digitalIds) {
        this.digitalIds = digitalIds;
    }


    /**
     * Gets the nextUser value for this UserDigitalIdListResult.
     * 
     * @return nextUser
     */
    public java.math.BigInteger getNextUser() {
        return nextUser;
    }


    /**
     * Sets the nextUser value for this UserDigitalIdListResult.
     * 
     * @param nextUser
     */
    public void setNextUser(java.math.BigInteger nextUser) {
        this.nextUser = nextUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDigitalIdListResult)) return false;
        UserDigitalIdListResult other = (UserDigitalIdListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.digitalIds==null && other.getDigitalIds()==null) || 
             (this.digitalIds!=null &&
              java.util.Arrays.equals(this.digitalIds, other.getDigitalIds()))) &&
            ((this.nextUser==null && other.getNextUser()==null) || 
             (this.nextUser!=null &&
              this.nextUser.equals(other.getNextUser())));
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
        if (getDigitalIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDigitalIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDigitalIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextUser() != null) {
            _hashCode += getNextUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDigitalIdListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserDigitalIdListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DigitalIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserDigitalIdInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
