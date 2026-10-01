/**
 * DigitalIdCertStreamPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class DigitalIdCertStreamPolicy  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicyNameAndId nameAndId;

    private java.lang.String keyType;

    private java.lang.String keyUsage;

    private boolean keyClientGenerated;

    private boolean keyBackup;

    private java.lang.String keyCsp;

    private java.lang.String pivContainer;

    private java.lang.String mscapiKeyContainerNameTemplate;

    private long renewalPeriod;

    private int renewalPercent;

    private java.util.Calendar renewalDate;

    public DigitalIdCertStreamPolicy() {
    }

    public DigitalIdCertStreamPolicy(
           wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicyNameAndId nameAndId,
           java.lang.String keyType,
           java.lang.String keyUsage,
           boolean keyClientGenerated,
           boolean keyBackup,
           java.lang.String keyCsp,
           java.lang.String pivContainer,
           java.lang.String mscapiKeyContainerNameTemplate,
           long renewalPeriod,
           int renewalPercent,
           java.util.Calendar renewalDate) {
           this.nameAndId = nameAndId;
           this.keyType = keyType;
           this.keyUsage = keyUsage;
           this.keyClientGenerated = keyClientGenerated;
           this.keyBackup = keyBackup;
           this.keyCsp = keyCsp;
           this.pivContainer = pivContainer;
           this.mscapiKeyContainerNameTemplate = mscapiKeyContainerNameTemplate;
           this.renewalPeriod = renewalPeriod;
           this.renewalPercent = renewalPercent;
           this.renewalDate = renewalDate;
    }


    /**
     * Gets the nameAndId value for this DigitalIdCertStreamPolicy.
     * 
     * @return nameAndId
     */
    public wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicyNameAndId getNameAndId() {
        return nameAndId;
    }


    /**
     * Sets the nameAndId value for this DigitalIdCertStreamPolicy.
     * 
     * @param nameAndId
     */
    public void setNameAndId(wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicyNameAndId nameAndId) {
        this.nameAndId = nameAndId;
    }


    /**
     * Gets the keyType value for this DigitalIdCertStreamPolicy.
     * 
     * @return keyType
     */
    public java.lang.String getKeyType() {
        return keyType;
    }


    /**
     * Sets the keyType value for this DigitalIdCertStreamPolicy.
     * 
     * @param keyType
     */
    public void setKeyType(java.lang.String keyType) {
        this.keyType = keyType;
    }


    /**
     * Gets the keyUsage value for this DigitalIdCertStreamPolicy.
     * 
     * @return keyUsage
     */
    public java.lang.String getKeyUsage() {
        return keyUsage;
    }


    /**
     * Sets the keyUsage value for this DigitalIdCertStreamPolicy.
     * 
     * @param keyUsage
     */
    public void setKeyUsage(java.lang.String keyUsage) {
        this.keyUsage = keyUsage;
    }


    /**
     * Gets the keyClientGenerated value for this DigitalIdCertStreamPolicy.
     * 
     * @return keyClientGenerated
     */
    public boolean isKeyClientGenerated() {
        return keyClientGenerated;
    }


    /**
     * Sets the keyClientGenerated value for this DigitalIdCertStreamPolicy.
     * 
     * @param keyClientGenerated
     */
    public void setKeyClientGenerated(boolean keyClientGenerated) {
        this.keyClientGenerated = keyClientGenerated;
    }


    /**
     * Gets the keyBackup value for this DigitalIdCertStreamPolicy.
     * 
     * @return keyBackup
     */
    public boolean isKeyBackup() {
        return keyBackup;
    }


    /**
     * Sets the keyBackup value for this DigitalIdCertStreamPolicy.
     * 
     * @param keyBackup
     */
    public void setKeyBackup(boolean keyBackup) {
        this.keyBackup = keyBackup;
    }


    /**
     * Gets the keyCsp value for this DigitalIdCertStreamPolicy.
     * 
     * @return keyCsp
     */
    public java.lang.String getKeyCsp() {
        return keyCsp;
    }


    /**
     * Sets the keyCsp value for this DigitalIdCertStreamPolicy.
     * 
     * @param keyCsp
     */
    public void setKeyCsp(java.lang.String keyCsp) {
        this.keyCsp = keyCsp;
    }


    /**
     * Gets the pivContainer value for this DigitalIdCertStreamPolicy.
     * 
     * @return pivContainer
     */
    public java.lang.String getPivContainer() {
        return pivContainer;
    }


    /**
     * Sets the pivContainer value for this DigitalIdCertStreamPolicy.
     * 
     * @param pivContainer
     */
    public void setPivContainer(java.lang.String pivContainer) {
        this.pivContainer = pivContainer;
    }


    /**
     * Gets the mscapiKeyContainerNameTemplate value for this DigitalIdCertStreamPolicy.
     * 
     * @return mscapiKeyContainerNameTemplate
     */
    public java.lang.String getMscapiKeyContainerNameTemplate() {
        return mscapiKeyContainerNameTemplate;
    }


    /**
     * Sets the mscapiKeyContainerNameTemplate value for this DigitalIdCertStreamPolicy.
     * 
     * @param mscapiKeyContainerNameTemplate
     */
    public void setMscapiKeyContainerNameTemplate(java.lang.String mscapiKeyContainerNameTemplate) {
        this.mscapiKeyContainerNameTemplate = mscapiKeyContainerNameTemplate;
    }


    /**
     * Gets the renewalPeriod value for this DigitalIdCertStreamPolicy.
     * 
     * @return renewalPeriod
     */
    public long getRenewalPeriod() {
        return renewalPeriod;
    }


    /**
     * Sets the renewalPeriod value for this DigitalIdCertStreamPolicy.
     * 
     * @param renewalPeriod
     */
    public void setRenewalPeriod(long renewalPeriod) {
        this.renewalPeriod = renewalPeriod;
    }


    /**
     * Gets the renewalPercent value for this DigitalIdCertStreamPolicy.
     * 
     * @return renewalPercent
     */
    public int getRenewalPercent() {
        return renewalPercent;
    }


    /**
     * Sets the renewalPercent value for this DigitalIdCertStreamPolicy.
     * 
     * @param renewalPercent
     */
    public void setRenewalPercent(int renewalPercent) {
        this.renewalPercent = renewalPercent;
    }


    /**
     * Gets the renewalDate value for this DigitalIdCertStreamPolicy.
     * 
     * @return renewalDate
     */
    public java.util.Calendar getRenewalDate() {
        return renewalDate;
    }


    /**
     * Sets the renewalDate value for this DigitalIdCertStreamPolicy.
     * 
     * @param renewalDate
     */
    public void setRenewalDate(java.util.Calendar renewalDate) {
        this.renewalDate = renewalDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigitalIdCertStreamPolicy)) return false;
        DigitalIdCertStreamPolicy other = (DigitalIdCertStreamPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nameAndId==null && other.getNameAndId()==null) || 
             (this.nameAndId!=null &&
              this.nameAndId.equals(other.getNameAndId()))) &&
            ((this.keyType==null && other.getKeyType()==null) || 
             (this.keyType!=null &&
              this.keyType.equals(other.getKeyType()))) &&
            ((this.keyUsage==null && other.getKeyUsage()==null) || 
             (this.keyUsage!=null &&
              this.keyUsage.equals(other.getKeyUsage()))) &&
            this.keyClientGenerated == other.isKeyClientGenerated() &&
            this.keyBackup == other.isKeyBackup() &&
            ((this.keyCsp==null && other.getKeyCsp()==null) || 
             (this.keyCsp!=null &&
              this.keyCsp.equals(other.getKeyCsp()))) &&
            ((this.pivContainer==null && other.getPivContainer()==null) || 
             (this.pivContainer!=null &&
              this.pivContainer.equals(other.getPivContainer()))) &&
            ((this.mscapiKeyContainerNameTemplate==null && other.getMscapiKeyContainerNameTemplate()==null) || 
             (this.mscapiKeyContainerNameTemplate!=null &&
              this.mscapiKeyContainerNameTemplate.equals(other.getMscapiKeyContainerNameTemplate()))) &&
            this.renewalPeriod == other.getRenewalPeriod() &&
            this.renewalPercent == other.getRenewalPercent() &&
            ((this.renewalDate==null && other.getRenewalDate()==null) || 
             (this.renewalDate!=null &&
              this.renewalDate.equals(other.getRenewalDate())));
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
        if (getNameAndId() != null) {
            _hashCode += getNameAndId().hashCode();
        }
        if (getKeyType() != null) {
            _hashCode += getKeyType().hashCode();
        }
        if (getKeyUsage() != null) {
            _hashCode += getKeyUsage().hashCode();
        }
        _hashCode += (isKeyClientGenerated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isKeyBackup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKeyCsp() != null) {
            _hashCode += getKeyCsp().hashCode();
        }
        if (getPivContainer() != null) {
            _hashCode += getPivContainer().hashCode();
        }
        if (getMscapiKeyContainerNameTemplate() != null) {
            _hashCode += getMscapiKeyContainerNameTemplate().hashCode();
        }
        _hashCode += new Long(getRenewalPeriod()).hashCode();
        _hashCode += getRenewalPercent();
        if (getRenewalDate() != null) {
            _hashCode += getRenewalDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DigitalIdCertStreamPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdCertStreamPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameAndId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NameAndId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdCertStreamPolicyNameAndId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyClientGenerated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyClientGenerated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyBackup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyBackup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyCsp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyCsp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pivContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PivContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mscapiKeyContainerNameTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MscapiKeyContainerNameTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RenewalPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RenewalPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RenewalDate"));
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
