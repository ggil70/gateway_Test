/**
 * DigitalIdConfigMicrosoftSpecificParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class DigitalIdConfigMicrosoftSpecificParms  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.MicrosoftCertTemplate[] certTemplates;

    private java.lang.Boolean mergeCertTemplates;

    private java.lang.Boolean removeCertTemplates;

    public DigitalIdConfigMicrosoftSpecificParms() {
    }

    public DigitalIdConfigMicrosoftSpecificParms(
           wsdl.adminV8.ig.com.entrust.MicrosoftCertTemplate[] certTemplates,
           java.lang.Boolean mergeCertTemplates,
           java.lang.Boolean removeCertTemplates) {
           this.certTemplates = certTemplates;
           this.mergeCertTemplates = mergeCertTemplates;
           this.removeCertTemplates = removeCertTemplates;
    }


    /**
     * Gets the certTemplates value for this DigitalIdConfigMicrosoftSpecificParms.
     * 
     * @return certTemplates
     */
    public wsdl.adminV8.ig.com.entrust.MicrosoftCertTemplate[] getCertTemplates() {
        return certTemplates;
    }


    /**
     * Sets the certTemplates value for this DigitalIdConfigMicrosoftSpecificParms.
     * 
     * @param certTemplates
     */
    public void setCertTemplates(wsdl.adminV8.ig.com.entrust.MicrosoftCertTemplate[] certTemplates) {
        this.certTemplates = certTemplates;
    }


    /**
     * Gets the mergeCertTemplates value for this DigitalIdConfigMicrosoftSpecificParms.
     * 
     * @return mergeCertTemplates
     */
    public java.lang.Boolean getMergeCertTemplates() {
        return mergeCertTemplates;
    }


    /**
     * Sets the mergeCertTemplates value for this DigitalIdConfigMicrosoftSpecificParms.
     * 
     * @param mergeCertTemplates
     */
    public void setMergeCertTemplates(java.lang.Boolean mergeCertTemplates) {
        this.mergeCertTemplates = mergeCertTemplates;
    }


    /**
     * Gets the removeCertTemplates value for this DigitalIdConfigMicrosoftSpecificParms.
     * 
     * @return removeCertTemplates
     */
    public java.lang.Boolean getRemoveCertTemplates() {
        return removeCertTemplates;
    }


    /**
     * Sets the removeCertTemplates value for this DigitalIdConfigMicrosoftSpecificParms.
     * 
     * @param removeCertTemplates
     */
    public void setRemoveCertTemplates(java.lang.Boolean removeCertTemplates) {
        this.removeCertTemplates = removeCertTemplates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigitalIdConfigMicrosoftSpecificParms)) return false;
        DigitalIdConfigMicrosoftSpecificParms other = (DigitalIdConfigMicrosoftSpecificParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certTemplates==null && other.getCertTemplates()==null) || 
             (this.certTemplates!=null &&
              java.util.Arrays.equals(this.certTemplates, other.getCertTemplates()))) &&
            ((this.mergeCertTemplates==null && other.getMergeCertTemplates()==null) || 
             (this.mergeCertTemplates!=null &&
              this.mergeCertTemplates.equals(other.getMergeCertTemplates()))) &&
            ((this.removeCertTemplates==null && other.getRemoveCertTemplates()==null) || 
             (this.removeCertTemplates!=null &&
              this.removeCertTemplates.equals(other.getRemoveCertTemplates())));
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
        if (getCertTemplates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertTemplates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertTemplates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMergeCertTemplates() != null) {
            _hashCode += getMergeCertTemplates().hashCode();
        }
        if (getRemoveCertTemplates() != null) {
            _hashCode += getRemoveCertTemplates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DigitalIdConfigMicrosoftSpecificParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdConfigMicrosoftSpecificParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "MicrosoftCertTemplate"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeCertTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mergeCertTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeCertTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeCertTemplates"));
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
