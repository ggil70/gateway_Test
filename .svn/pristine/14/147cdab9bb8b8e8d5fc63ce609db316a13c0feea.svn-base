/**
 * DigitalIdCertResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class DigitalIdCertResponse  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicyNameAndId certStreamPolicyNamdAndId;

    private wsdl.adminV8.ig.com.entrust.CertAndKey[] certsAndKeys;

    private java.lang.String mscapiKeyContainerNameTemplate;

    public DigitalIdCertResponse() {
    }

    public DigitalIdCertResponse(
           wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicyNameAndId certStreamPolicyNamdAndId,
           wsdl.adminV8.ig.com.entrust.CertAndKey[] certsAndKeys,
           java.lang.String mscapiKeyContainerNameTemplate) {
           this.certStreamPolicyNamdAndId = certStreamPolicyNamdAndId;
           this.certsAndKeys = certsAndKeys;
           this.mscapiKeyContainerNameTemplate = mscapiKeyContainerNameTemplate;
    }


    /**
     * Gets the certStreamPolicyNamdAndId value for this DigitalIdCertResponse.
     * 
     * @return certStreamPolicyNamdAndId
     */
    public wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicyNameAndId getCertStreamPolicyNamdAndId() {
        return certStreamPolicyNamdAndId;
    }


    /**
     * Sets the certStreamPolicyNamdAndId value for this DigitalIdCertResponse.
     * 
     * @param certStreamPolicyNamdAndId
     */
    public void setCertStreamPolicyNamdAndId(wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicyNameAndId certStreamPolicyNamdAndId) {
        this.certStreamPolicyNamdAndId = certStreamPolicyNamdAndId;
    }


    /**
     * Gets the certsAndKeys value for this DigitalIdCertResponse.
     * 
     * @return certsAndKeys
     */
    public wsdl.adminV8.ig.com.entrust.CertAndKey[] getCertsAndKeys() {
        return certsAndKeys;
    }


    /**
     * Sets the certsAndKeys value for this DigitalIdCertResponse.
     * 
     * @param certsAndKeys
     */
    public void setCertsAndKeys(wsdl.adminV8.ig.com.entrust.CertAndKey[] certsAndKeys) {
        this.certsAndKeys = certsAndKeys;
    }


    /**
     * Gets the mscapiKeyContainerNameTemplate value for this DigitalIdCertResponse.
     * 
     * @return mscapiKeyContainerNameTemplate
     */
    public java.lang.String getMscapiKeyContainerNameTemplate() {
        return mscapiKeyContainerNameTemplate;
    }


    /**
     * Sets the mscapiKeyContainerNameTemplate value for this DigitalIdCertResponse.
     * 
     * @param mscapiKeyContainerNameTemplate
     */
    public void setMscapiKeyContainerNameTemplate(java.lang.String mscapiKeyContainerNameTemplate) {
        this.mscapiKeyContainerNameTemplate = mscapiKeyContainerNameTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigitalIdCertResponse)) return false;
        DigitalIdCertResponse other = (DigitalIdCertResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certStreamPolicyNamdAndId==null && other.getCertStreamPolicyNamdAndId()==null) || 
             (this.certStreamPolicyNamdAndId!=null &&
              this.certStreamPolicyNamdAndId.equals(other.getCertStreamPolicyNamdAndId()))) &&
            ((this.certsAndKeys==null && other.getCertsAndKeys()==null) || 
             (this.certsAndKeys!=null &&
              java.util.Arrays.equals(this.certsAndKeys, other.getCertsAndKeys()))) &&
            ((this.mscapiKeyContainerNameTemplate==null && other.getMscapiKeyContainerNameTemplate()==null) || 
             (this.mscapiKeyContainerNameTemplate!=null &&
              this.mscapiKeyContainerNameTemplate.equals(other.getMscapiKeyContainerNameTemplate())));
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
        if (getCertStreamPolicyNamdAndId() != null) {
            _hashCode += getCertStreamPolicyNamdAndId().hashCode();
        }
        if (getCertsAndKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertsAndKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertsAndKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMscapiKeyContainerNameTemplate() != null) {
            _hashCode += getMscapiKeyContainerNameTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DigitalIdCertResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdCertResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certStreamPolicyNamdAndId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CertStreamPolicyNamdAndId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdCertStreamPolicyNameAndId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certsAndKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CertsAndKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "CertAndKey"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mscapiKeyContainerNameTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MscapiKeyContainerNameTemplate"));
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
