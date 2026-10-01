/**
 * UserCertificateAssignVerifyResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserCertificateAssignVerifyResult  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String issuerDN;

    private java.lang.String subjectDN;

    private java.lang.String serialNumber;

    private java.util.Calendar issueDate;

    private java.util.Calendar expiryDate;

    private java.lang.String CA;

    private boolean selfSigned;

    private java.lang.String MD5Hash;

    private java.lang.String SHA1Hash;

    private java.lang.String SHA256Hash;

    public UserCertificateAssignVerifyResult() {
    }

    public UserCertificateAssignVerifyResult(
           java.lang.String type,
           java.lang.String issuerDN,
           java.lang.String subjectDN,
           java.lang.String serialNumber,
           java.util.Calendar issueDate,
           java.util.Calendar expiryDate,
           java.lang.String CA,
           boolean selfSigned,
           java.lang.String MD5Hash,
           java.lang.String SHA1Hash,
           java.lang.String SHA256Hash) {
           this.type = type;
           this.issuerDN = issuerDN;
           this.subjectDN = subjectDN;
           this.serialNumber = serialNumber;
           this.issueDate = issueDate;
           this.expiryDate = expiryDate;
           this.CA = CA;
           this.selfSigned = selfSigned;
           this.MD5Hash = MD5Hash;
           this.SHA1Hash = SHA1Hash;
           this.SHA256Hash = SHA256Hash;
    }


    /**
     * Gets the type value for this UserCertificateAssignVerifyResult.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this UserCertificateAssignVerifyResult.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the issuerDN value for this UserCertificateAssignVerifyResult.
     * 
     * @return issuerDN
     */
    public java.lang.String getIssuerDN() {
        return issuerDN;
    }


    /**
     * Sets the issuerDN value for this UserCertificateAssignVerifyResult.
     * 
     * @param issuerDN
     */
    public void setIssuerDN(java.lang.String issuerDN) {
        this.issuerDN = issuerDN;
    }


    /**
     * Gets the subjectDN value for this UserCertificateAssignVerifyResult.
     * 
     * @return subjectDN
     */
    public java.lang.String getSubjectDN() {
        return subjectDN;
    }


    /**
     * Sets the subjectDN value for this UserCertificateAssignVerifyResult.
     * 
     * @param subjectDN
     */
    public void setSubjectDN(java.lang.String subjectDN) {
        this.subjectDN = subjectDN;
    }


    /**
     * Gets the serialNumber value for this UserCertificateAssignVerifyResult.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this UserCertificateAssignVerifyResult.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the issueDate value for this UserCertificateAssignVerifyResult.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this UserCertificateAssignVerifyResult.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the expiryDate value for this UserCertificateAssignVerifyResult.
     * 
     * @return expiryDate
     */
    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this UserCertificateAssignVerifyResult.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the CA value for this UserCertificateAssignVerifyResult.
     * 
     * @return CA
     */
    public java.lang.String getCA() {
        return CA;
    }


    /**
     * Sets the CA value for this UserCertificateAssignVerifyResult.
     * 
     * @param CA
     */
    public void setCA(java.lang.String CA) {
        this.CA = CA;
    }


    /**
     * Gets the selfSigned value for this UserCertificateAssignVerifyResult.
     * 
     * @return selfSigned
     */
    public boolean isSelfSigned() {
        return selfSigned;
    }


    /**
     * Sets the selfSigned value for this UserCertificateAssignVerifyResult.
     * 
     * @param selfSigned
     */
    public void setSelfSigned(boolean selfSigned) {
        this.selfSigned = selfSigned;
    }


    /**
     * Gets the MD5Hash value for this UserCertificateAssignVerifyResult.
     * 
     * @return MD5Hash
     */
    public java.lang.String getMD5Hash() {
        return MD5Hash;
    }


    /**
     * Sets the MD5Hash value for this UserCertificateAssignVerifyResult.
     * 
     * @param MD5Hash
     */
    public void setMD5Hash(java.lang.String MD5Hash) {
        this.MD5Hash = MD5Hash;
    }


    /**
     * Gets the SHA1Hash value for this UserCertificateAssignVerifyResult.
     * 
     * @return SHA1Hash
     */
    public java.lang.String getSHA1Hash() {
        return SHA1Hash;
    }


    /**
     * Sets the SHA1Hash value for this UserCertificateAssignVerifyResult.
     * 
     * @param SHA1Hash
     */
    public void setSHA1Hash(java.lang.String SHA1Hash) {
        this.SHA1Hash = SHA1Hash;
    }


    /**
     * Gets the SHA256Hash value for this UserCertificateAssignVerifyResult.
     * 
     * @return SHA256Hash
     */
    public java.lang.String getSHA256Hash() {
        return SHA256Hash;
    }


    /**
     * Sets the SHA256Hash value for this UserCertificateAssignVerifyResult.
     * 
     * @param SHA256Hash
     */
    public void setSHA256Hash(java.lang.String SHA256Hash) {
        this.SHA256Hash = SHA256Hash;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserCertificateAssignVerifyResult)) return false;
        UserCertificateAssignVerifyResult other = (UserCertificateAssignVerifyResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.issuerDN==null && other.getIssuerDN()==null) || 
             (this.issuerDN!=null &&
              this.issuerDN.equals(other.getIssuerDN()))) &&
            ((this.subjectDN==null && other.getSubjectDN()==null) || 
             (this.subjectDN!=null &&
              this.subjectDN.equals(other.getSubjectDN()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.CA==null && other.getCA()==null) || 
             (this.CA!=null &&
              this.CA.equals(other.getCA()))) &&
            this.selfSigned == other.isSelfSigned() &&
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIssuerDN() != null) {
            _hashCode += getIssuerDN().hashCode();
        }
        if (getSubjectDN() != null) {
            _hashCode += getSubjectDN().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getCA() != null) {
            _hashCode += getCA().hashCode();
        }
        _hashCode += (isSelfSigned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        new org.apache.axis.description.TypeDesc(UserCertificateAssignVerifyResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserCertificateAssignVerifyResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subjectDN"));
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
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selfSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
