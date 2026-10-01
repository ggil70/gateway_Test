/**
 * ScepRaSignContentParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ScepRaSignContentParms  implements java.io.Serializable {
    private java.lang.String managedCa;

    private java.lang.String signingAlg;

    private wsdl.adminV8.ig.com.entrust.ScepRaSignedAttributes signedAttributes;

    private java.lang.Boolean includeSignerCertificate;

    private java.lang.Boolean includeIssuerAndSerialNumber;

    private byte[] dataToSign;

    public ScepRaSignContentParms() {
    }

    public ScepRaSignContentParms(
           java.lang.String managedCa,
           java.lang.String signingAlg,
           wsdl.adminV8.ig.com.entrust.ScepRaSignedAttributes signedAttributes,
           java.lang.Boolean includeSignerCertificate,
           java.lang.Boolean includeIssuerAndSerialNumber,
           byte[] dataToSign) {
           this.managedCa = managedCa;
           this.signingAlg = signingAlg;
           this.signedAttributes = signedAttributes;
           this.includeSignerCertificate = includeSignerCertificate;
           this.includeIssuerAndSerialNumber = includeIssuerAndSerialNumber;
           this.dataToSign = dataToSign;
    }


    /**
     * Gets the managedCa value for this ScepRaSignContentParms.
     * 
     * @return managedCa
     */
    public java.lang.String getManagedCa() {
        return managedCa;
    }


    /**
     * Sets the managedCa value for this ScepRaSignContentParms.
     * 
     * @param managedCa
     */
    public void setManagedCa(java.lang.String managedCa) {
        this.managedCa = managedCa;
    }


    /**
     * Gets the signingAlg value for this ScepRaSignContentParms.
     * 
     * @return signingAlg
     */
    public java.lang.String getSigningAlg() {
        return signingAlg;
    }


    /**
     * Sets the signingAlg value for this ScepRaSignContentParms.
     * 
     * @param signingAlg
     */
    public void setSigningAlg(java.lang.String signingAlg) {
        this.signingAlg = signingAlg;
    }


    /**
     * Gets the signedAttributes value for this ScepRaSignContentParms.
     * 
     * @return signedAttributes
     */
    public wsdl.adminV8.ig.com.entrust.ScepRaSignedAttributes getSignedAttributes() {
        return signedAttributes;
    }


    /**
     * Sets the signedAttributes value for this ScepRaSignContentParms.
     * 
     * @param signedAttributes
     */
    public void setSignedAttributes(wsdl.adminV8.ig.com.entrust.ScepRaSignedAttributes signedAttributes) {
        this.signedAttributes = signedAttributes;
    }


    /**
     * Gets the includeSignerCertificate value for this ScepRaSignContentParms.
     * 
     * @return includeSignerCertificate
     */
    public java.lang.Boolean getIncludeSignerCertificate() {
        return includeSignerCertificate;
    }


    /**
     * Sets the includeSignerCertificate value for this ScepRaSignContentParms.
     * 
     * @param includeSignerCertificate
     */
    public void setIncludeSignerCertificate(java.lang.Boolean includeSignerCertificate) {
        this.includeSignerCertificate = includeSignerCertificate;
    }


    /**
     * Gets the includeIssuerAndSerialNumber value for this ScepRaSignContentParms.
     * 
     * @return includeIssuerAndSerialNumber
     */
    public java.lang.Boolean getIncludeIssuerAndSerialNumber() {
        return includeIssuerAndSerialNumber;
    }


    /**
     * Sets the includeIssuerAndSerialNumber value for this ScepRaSignContentParms.
     * 
     * @param includeIssuerAndSerialNumber
     */
    public void setIncludeIssuerAndSerialNumber(java.lang.Boolean includeIssuerAndSerialNumber) {
        this.includeIssuerAndSerialNumber = includeIssuerAndSerialNumber;
    }


    /**
     * Gets the dataToSign value for this ScepRaSignContentParms.
     * 
     * @return dataToSign
     */
    public byte[] getDataToSign() {
        return dataToSign;
    }


    /**
     * Sets the dataToSign value for this ScepRaSignContentParms.
     * 
     * @param dataToSign
     */
    public void setDataToSign(byte[] dataToSign) {
        this.dataToSign = dataToSign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScepRaSignContentParms)) return false;
        ScepRaSignContentParms other = (ScepRaSignContentParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.managedCa==null && other.getManagedCa()==null) || 
             (this.managedCa!=null &&
              this.managedCa.equals(other.getManagedCa()))) &&
            ((this.signingAlg==null && other.getSigningAlg()==null) || 
             (this.signingAlg!=null &&
              this.signingAlg.equals(other.getSigningAlg()))) &&
            ((this.signedAttributes==null && other.getSignedAttributes()==null) || 
             (this.signedAttributes!=null &&
              this.signedAttributes.equals(other.getSignedAttributes()))) &&
            ((this.includeSignerCertificate==null && other.getIncludeSignerCertificate()==null) || 
             (this.includeSignerCertificate!=null &&
              this.includeSignerCertificate.equals(other.getIncludeSignerCertificate()))) &&
            ((this.includeIssuerAndSerialNumber==null && other.getIncludeIssuerAndSerialNumber()==null) || 
             (this.includeIssuerAndSerialNumber!=null &&
              this.includeIssuerAndSerialNumber.equals(other.getIncludeIssuerAndSerialNumber()))) &&
            ((this.dataToSign==null && other.getDataToSign()==null) || 
             (this.dataToSign!=null &&
              java.util.Arrays.equals(this.dataToSign, other.getDataToSign())));
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
        if (getManagedCa() != null) {
            _hashCode += getManagedCa().hashCode();
        }
        if (getSigningAlg() != null) {
            _hashCode += getSigningAlg().hashCode();
        }
        if (getSignedAttributes() != null) {
            _hashCode += getSignedAttributes().hashCode();
        }
        if (getIncludeSignerCertificate() != null) {
            _hashCode += getIncludeSignerCertificate().hashCode();
        }
        if (getIncludeIssuerAndSerialNumber() != null) {
            _hashCode += getIncludeIssuerAndSerialNumber().hashCode();
        }
        if (getDataToSign() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataToSign());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataToSign(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScepRaSignContentParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ScepRaSignContentParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedCa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ManagedCa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SigningAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signedAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SignedAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ScepRaSignedAttributes"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSignerCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncludeSignerCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeIssuerAndSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncludeIssuerAndSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataToSign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataToSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
