/**
 * ManagedCaMicrosoftSpecificInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ManagedCaMicrosoftSpecificInfo  implements java.io.Serializable {
    private java.lang.String caCommonName;

    private wsdl.adminV8.ig.com.entrust.ManagedCaAdmin keyRecoveryAgent;

    private wsdl.adminV8.ig.com.entrust.ManagedCaAdmin enrollmentAgent;

    public ManagedCaMicrosoftSpecificInfo() {
    }

    public ManagedCaMicrosoftSpecificInfo(
           java.lang.String caCommonName,
           wsdl.adminV8.ig.com.entrust.ManagedCaAdmin keyRecoveryAgent,
           wsdl.adminV8.ig.com.entrust.ManagedCaAdmin enrollmentAgent) {
           this.caCommonName = caCommonName;
           this.keyRecoveryAgent = keyRecoveryAgent;
           this.enrollmentAgent = enrollmentAgent;
    }


    /**
     * Gets the caCommonName value for this ManagedCaMicrosoftSpecificInfo.
     * 
     * @return caCommonName
     */
    public java.lang.String getCaCommonName() {
        return caCommonName;
    }


    /**
     * Sets the caCommonName value for this ManagedCaMicrosoftSpecificInfo.
     * 
     * @param caCommonName
     */
    public void setCaCommonName(java.lang.String caCommonName) {
        this.caCommonName = caCommonName;
    }


    /**
     * Gets the keyRecoveryAgent value for this ManagedCaMicrosoftSpecificInfo.
     * 
     * @return keyRecoveryAgent
     */
    public wsdl.adminV8.ig.com.entrust.ManagedCaAdmin getKeyRecoveryAgent() {
        return keyRecoveryAgent;
    }


    /**
     * Sets the keyRecoveryAgent value for this ManagedCaMicrosoftSpecificInfo.
     * 
     * @param keyRecoveryAgent
     */
    public void setKeyRecoveryAgent(wsdl.adminV8.ig.com.entrust.ManagedCaAdmin keyRecoveryAgent) {
        this.keyRecoveryAgent = keyRecoveryAgent;
    }


    /**
     * Gets the enrollmentAgent value for this ManagedCaMicrosoftSpecificInfo.
     * 
     * @return enrollmentAgent
     */
    public wsdl.adminV8.ig.com.entrust.ManagedCaAdmin getEnrollmentAgent() {
        return enrollmentAgent;
    }


    /**
     * Sets the enrollmentAgent value for this ManagedCaMicrosoftSpecificInfo.
     * 
     * @param enrollmentAgent
     */
    public void setEnrollmentAgent(wsdl.adminV8.ig.com.entrust.ManagedCaAdmin enrollmentAgent) {
        this.enrollmentAgent = enrollmentAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCaMicrosoftSpecificInfo)) return false;
        ManagedCaMicrosoftSpecificInfo other = (ManagedCaMicrosoftSpecificInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caCommonName==null && other.getCaCommonName()==null) || 
             (this.caCommonName!=null &&
              this.caCommonName.equals(other.getCaCommonName()))) &&
            ((this.keyRecoveryAgent==null && other.getKeyRecoveryAgent()==null) || 
             (this.keyRecoveryAgent!=null &&
              this.keyRecoveryAgent.equals(other.getKeyRecoveryAgent()))) &&
            ((this.enrollmentAgent==null && other.getEnrollmentAgent()==null) || 
             (this.enrollmentAgent!=null &&
              this.enrollmentAgent.equals(other.getEnrollmentAgent())));
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
        if (getCaCommonName() != null) {
            _hashCode += getCaCommonName().hashCode();
        }
        if (getKeyRecoveryAgent() != null) {
            _hashCode += getKeyRecoveryAgent().hashCode();
        }
        if (getEnrollmentAgent() != null) {
            _hashCode += getEnrollmentAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCaMicrosoftSpecificInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaMicrosoftSpecificInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caCommonName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaCommonName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyRecoveryAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyRecoveryAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaAdmin"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollmentAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EnrollmentAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaAdmin"));
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
