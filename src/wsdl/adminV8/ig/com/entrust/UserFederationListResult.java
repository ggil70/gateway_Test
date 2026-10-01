/**
 * UserFederationListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserFederationListResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.UserFederationInfo[] federations;

    private java.math.BigInteger nextUser;

    public UserFederationListResult() {
    }

    public UserFederationListResult(
           wsdl.adminV8.ig.com.entrust.UserFederationInfo[] federations,
           java.math.BigInteger nextUser) {
           this.federations = federations;
           this.nextUser = nextUser;
    }


    /**
     * Gets the federations value for this UserFederationListResult.
     * 
     * @return federations
     */
    public wsdl.adminV8.ig.com.entrust.UserFederationInfo[] getFederations() {
        return federations;
    }


    /**
     * Sets the federations value for this UserFederationListResult.
     * 
     * @param federations
     */
    public void setFederations(wsdl.adminV8.ig.com.entrust.UserFederationInfo[] federations) {
        this.federations = federations;
    }


    /**
     * Gets the nextUser value for this UserFederationListResult.
     * 
     * @return nextUser
     */
    public java.math.BigInteger getNextUser() {
        return nextUser;
    }


    /**
     * Sets the nextUser value for this UserFederationListResult.
     * 
     * @param nextUser
     */
    public void setNextUser(java.math.BigInteger nextUser) {
        this.nextUser = nextUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFederationListResult)) return false;
        UserFederationListResult other = (UserFederationListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.federations==null && other.getFederations()==null) || 
             (this.federations!=null &&
              java.util.Arrays.equals(this.federations, other.getFederations()))) &&
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
        if (getFederations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFederations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFederations(), i);
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
        new org.apache.axis.description.TypeDesc(UserFederationListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserFederationListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("federations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "federations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserFederationInfo"));
        elemField.setNillable(false);
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
