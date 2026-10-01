/**
 * UserCertificateExportResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserCertificateExportResult  implements java.io.Serializable {
    private java.lang.String issuerDN;

    private java.lang.String serialNumber;

    private java.lang.String type;

    private java.lang.String data;

    private java.lang.String MD5Hash;

    private java.lang.String SHA1Hash;

    private java.lang.String SHA256Hash;

    public UserCertificateExportResult() {
    }

    public UserCertificateExportResult(
           java.lang.String issuerDN,
           java.lang.String serialNumber,
           java.lang.String type,
           java.lang.String data,
           java.lang.String MD5Hash,
           java.lang.String SHA1Hash,
           java.lang.String SHA256Hash) {
           this.issuerDN = issuerDN;
           this.serialNumber = serialNumber;
           this.type = type;
           this.data = data;
           this.MD5Hash = MD5Hash;
           this.SHA1Hash = SHA1Hash;
           this.SHA256Hash = SHA256Hash;
    }


    /**
     * Gets the issuerDN value for this UserCertificateExportResult.
     * 
     * @return issuerDN
     */
    public java.lang.String getIssuerDN() {
        return issuerDN;
    }


    /**
     * Sets the issuerDN value for this UserCertificateExportResult.
     * 
     * @param issuerDN
     */
    public void setIssuerDN(java.lang.String issuerDN) {
        this.issuerDN = issuerDN;
    }


    /**
     * Gets the serialNumber value for this UserCertificateExportResult.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this UserCertificateExportResult.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the type value for this UserCertificateExportResult.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this UserCertificateExportResult.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the data value for this UserCertificateExportResult.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this UserCertificateExportResult.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the MD5Hash value for this UserCertificateExportResult.
     * 
     * @return MD5Hash
     */
    public java.lang.String getMD5Hash() {
        return MD5Hash;
    }


    /**
     * Sets the MD5Hash value for this UserCertificateExportResult.
     * 
     * @param MD5Hash
     */
    public void setMD5Hash(java.lang.String MD5Hash) {
        this.MD5Hash = MD5Hash;
    }


    /**
     * Gets the SHA1Hash value for this UserCertificateExportResult.
     * 
     * @return SHA1Hash
     */
    public java.lang.String getSHA1Hash() {
        return SHA1Hash;
    }


    /**
     * Sets the SHA1Hash value for this UserCertificateExportResult.
     * 
     * @param SHA1Hash
     */
    public void setSHA1Hash(java.lang.String SHA1Hash) {
        this.SHA1Hash = SHA1Hash;
    }


    /**
     * Gets the SHA256Hash value for this UserCertificateExportResult.
     * 
     * @return SHA256Hash
     */
    public java.lang.String getSHA256Hash() {
        return SHA256Hash;
    }


    /**
     * Sets the SHA256Hash value for this UserCertificateExportResult.
     * 
     * @param SHA256Hash
     */
    public void setSHA256Hash(java.lang.String SHA256Hash) {
        this.SHA256Hash = SHA256Hash;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserCertificateExportResult)) return false;
        UserCertificateExportResult other = (UserCertificateExportResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issuerDN==null && other.getIssuerDN()==null) || 
             (this.issuerDN!=null &&
              this.issuerDN.equals(other.getIssuerDN()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.MD5Hash==null && other.getMD5Hash()==null) || 
             (this.MD5Hash!=null &&
              this.MD5Hash.equals(other.getMD5Hash()))) &&
            ((this.SHA1Hash==null && other.getSHA1Hash()==null) || 
             (this.SHA1Hash!=null &&
              this.SHA1Hash.equals(other.getSHA1Hash()))) &&
            ((this.SHA256Hash==null && other.getSHA256Hash()==null) || 
             (this.SHA256Hash!=null &&
              this.SHA256Hash.equals(other.getSHA256Hash())));
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
        if (getIssuerDN() != null) {
            _hashCode += getIssuerDN().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getMD5Hash() != null) {
            _hashCode += getMD5Hash().hashCode();
        }
        if (getSHA1Hash() != null) {
            _hashCode += getSHA1Hash().hashCode();
        }
        if (getSHA256Hash() != null) {
            _hashCode += getSHA256Hash().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserCertificateExportResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserCertificateExportResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MD5Hash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MD5Hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHA1Hash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SHA1Hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHA256Hash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SHA256Hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
