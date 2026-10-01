/**
 * ManagedCaMicrosoftSpecificParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ManagedCaMicrosoftSpecificParms  implements java.io.Serializable {
    private java.lang.String caCommonName;

    private wsdl.adminV8.ig.com.entrust.ManagedCaAdmin enrollmentAgent;

    private java.lang.Boolean deleteEnrollmentAgent;

    private wsdl.adminV8.ig.com.entrust.ManagedCaAdmin keyRecoveryAgent;

    private java.lang.Boolean deleteKeyRecoveryAgent;

    public ManagedCaMicrosoftSpecificParms() {
    }

    public ManagedCaMicrosoftSpecificParms(
           java.lang.String caCommonName,
           wsdl.adminV8.ig.com.entrust.ManagedCaAdmin enrollmentAgent,
           java.lang.Boolean deleteEnrollmentAgent,
           wsdl.adminV8.ig.com.entrust.ManagedCaAdmin keyRecoveryAgent,
           java.lang.Boolean deleteKeyRecoveryAgent) {
           this.caCommonName = caCommonName;
           this.enrollmentAgent = enrollmentAgent;
           this.deleteEnrollmentAgent = deleteEnrollmentAgent;
           this.keyRecoveryAgent = keyRecoveryAgent;
           this.deleteKeyRecoveryAgent = deleteKeyRecoveryAgent;
    }


    /**
     * Gets the caCommonName value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @return caCommonName
     */
    public java.lang.String getCaCommonName() {
        return caCommonName;
    }


    /**
     * Sets the caCommonName value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @param caCommonName
     */
    public void setCaCommonName(java.lang.String caCommonName) {
        this.caCommonName = caCommonName;
    }


    /**
     * Gets the enrollmentAgent value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @return enrollmentAgent
     */
    public wsdl.adminV8.ig.com.entrust.ManagedCaAdmin getEnrollmentAgent() {
        return enrollmentAgent;
    }


    /**
     * Sets the enrollmentAgent value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @param enrollmentAgent
     */
    public void setEnrollmentAgent(wsdl.adminV8.ig.com.entrust.ManagedCaAdmin enrollmentAgent) {
        this.enrollmentAgent = enrollmentAgent;
    }


    /**
     * Gets the deleteEnrollmentAgent value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @return deleteEnrollmentAgent
     */
    public java.lang.Boolean getDeleteEnrollmentAgent() {
        return deleteEnrollmentAgent;
    }


    /**
     * Sets the deleteEnrollmentAgent value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @param deleteEnrollmentAgent
     */
    public void setDeleteEnrollmentAgent(java.lang.Boolean deleteEnrollmentAgent) {
        this.deleteEnrollmentAgent = deleteEnrollmentAgent;
    }


    /**
     * Gets the keyRecoveryAgent value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @return keyRecoveryAgent
     */
    public wsdl.adminV8.ig.com.entrust.ManagedCaAdmin getKeyRecoveryAgent() {
        return keyRecoveryAgent;
    }


    /**
     * Sets the keyRecoveryAgent value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @param keyRecoveryAgent
     */
    public void setKeyRecoveryAgent(wsdl.adminV8.ig.com.entrust.ManagedCaAdmin keyRecoveryAgent) {
        this.keyRecoveryAgent = keyRecoveryAgent;
    }


    /**
     * Gets the deleteKeyRecoveryAgent value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @return deleteKeyRecoveryAgent
     */
    public java.lang.Boolean getDeleteKeyRecoveryAgent() {
        return deleteKeyRecoveryAgent;
    }


    /**
     * Sets the deleteKeyRecoveryAgent value for this ManagedCaMicrosoftSpecificParms.
     * 
     * @param deleteKeyRecoveryAgent
     */
    public void setDeleteKeyRecoveryAgent(java.lang.Boolean deleteKeyRecoveryAgent) {
        this.deleteKeyRecoveryAgent = deleteKeyRecoveryAgent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCaMicrosoftSpecificParms)) return false;
        ManagedCaMicrosoftSpecificParms other = (ManagedCaMicrosoftSpecificParms) obj;
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
            ((this.enrollmentAgent==null && other.getEnrollmentAgent()==null) || 
             (this.enrollmentAgent!=null &&
              this.enrollmentAgent.equals(other.getEnrollmentAgent()))) &&
            ((this.deleteEnrollmentAgent==null && other.getDeleteEnrollmentAgent()==null) || 
             (this.deleteEnrollmentAgent!=null &&
              this.deleteEnrollmentAgent.equals(other.getDeleteEnrollmentAgent()))) &&
            ((this.keyRecoveryAgent==null && other.getKeyRecoveryAgent()==null) || 
             (this.keyRecoveryAgent!=null &&
              this.keyRecoveryAgent.equals(other.getKeyRecoveryAgent()))) &&
            ((this.deleteKeyRecoveryAgent==null && other.getDeleteKeyRecoveryAgent()==null) || 
             (this.deleteKeyRecoveryAgent!=null &&
              this.deleteKeyRecoveryAgent.equals(other.getDeleteKeyRecoveryAgent())));
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
        if (getEnrollmentAgent() != null) {
            _hashCode += getEnrollmentAgent().hashCode();
        }
        if (getDeleteEnrollmentAgent() != null) {
            _hashCode += getDeleteEnrollmentAgent().hashCode();
        }
        if (getKeyRecoveryAgent() != null) {
            _hashCode += getKeyRecoveryAgent().hashCode();
        }
        if (getDeleteKeyRecoveryAgent() != null) {
            _hashCode += getDeleteKeyRecoveryAgent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCaMicrosoftSpecificParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaMicrosoftSpecificParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caCommonName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaCommonName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollmentAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EnrollmentAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaAdmin"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteEnrollmentAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeleteEnrollmentAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyRecoveryAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyRecoveryAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaAdmin"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteKeyRecoveryAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeleteKeyRecoveryAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
