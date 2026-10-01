/**
 * UserDigitalIdCreateRecoverPolicyGetCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserDigitalIdCreateRecoverPolicyGetCallParms  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String digitalIdConfig;

    private java.lang.String DN;

    public UserDigitalIdCreateRecoverPolicyGetCallParms() {
    }

    public UserDigitalIdCreateRecoverPolicyGetCallParms(
           java.lang.String userid,
           java.lang.String digitalIdConfig,
           java.lang.String DN) {
           this.userid = userid;
           this.digitalIdConfig = digitalIdConfig;
           this.DN = DN;
    }


    /**
     * Gets the userid value for this UserDigitalIdCreateRecoverPolicyGetCallParms.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserDigitalIdCreateRecoverPolicyGetCallParms.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the digitalIdConfig value for this UserDigitalIdCreateRecoverPolicyGetCallParms.
     * 
     * @return digitalIdConfig
     */
    public java.lang.String getDigitalIdConfig() {
        return digitalIdConfig;
    }


    /**
     * Sets the digitalIdConfig value for this UserDigitalIdCreateRecoverPolicyGetCallParms.
     * 
     * @param digitalIdConfig
     */
    public void setDigitalIdConfig(java.lang.String digitalIdConfig) {
        this.digitalIdConfig = digitalIdConfig;
    }


    /**
     * Gets the DN value for this UserDigitalIdCreateRecoverPolicyGetCallParms.
     * 
     * @return DN
     */
    public java.lang.String getDN() {
        return DN;
    }


    /**
     * Sets the DN value for this UserDigitalIdCreateRecoverPolicyGetCallParms.
     * 
     * @param DN
     */
    public void setDN(java.lang.String DN) {
        this.DN = DN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDigitalIdCreateRecoverPolicyGetCallParms)) return false;
        UserDigitalIdCreateRecoverPolicyGetCallParms other = (UserDigitalIdCreateRecoverPolicyGetCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.digitalIdConfig==null && other.getDigitalIdConfig()==null) || 
             (this.digitalIdConfig!=null &&
              this.digitalIdConfig.equals(other.getDigitalIdConfig()))) &&
            ((this.DN==null && other.getDN()==null) || 
             (this.DN!=null &&
              this.DN.equals(other.getDN())));
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
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getDigitalIdConfig() != null) {
            _hashCode += getDigitalIdConfig().hashCode();
        }
        if (getDN() != null) {
            _hashCode += getDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDigitalIdCreateRecoverPolicyGetCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserDigitalIdCreateRecoverPolicyGetCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalIdConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DigitalIdConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DN"));
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
