/**
 * UserDigitalIdParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserDigitalIdParms  implements java.io.Serializable {
    private java.lang.String digitalIdConfig;

    private java.lang.String RDN;

    private commonV8.ig.com.entrust.NameValue[] RDNVariables;

    private wsdl.adminV8.ig.com.entrust.SubjectAltName[] subjectAltName;

    private wsdl.adminV8.ig.com.entrust.ManagedCaVariable[] caVariables;

    private java.lang.String caDirectoryMode;

    private java.lang.Boolean createIfNotExists;

    private java.lang.Boolean recoverIfExists;

    private java.lang.Boolean p12LatestKeyOnly;

    private java.lang.String securityStoreType;

    private java.lang.String securityStorePassword;

    private wsdl.adminV8.ig.com.entrust.DigitalIdP10Request[] p10Requests;

    private java.lang.String clientType;

    private java.lang.String comment;

    public UserDigitalIdParms() {
    }

    public UserDigitalIdParms(
           java.lang.String digitalIdConfig,
           java.lang.String RDN,
           commonV8.ig.com.entrust.NameValue[] RDNVariables,
           wsdl.adminV8.ig.com.entrust.SubjectAltName[] subjectAltName,
           wsdl.adminV8.ig.com.entrust.ManagedCaVariable[] caVariables,
           java.lang.String caDirectoryMode,
           java.lang.Boolean createIfNotExists,
           java.lang.Boolean recoverIfExists,
           java.lang.Boolean p12LatestKeyOnly,
           java.lang.String securityStoreType,
           java.lang.String securityStorePassword,
           wsdl.adminV8.ig.com.entrust.DigitalIdP10Request[] p10Requests,
           java.lang.String clientType,
           java.lang.String comment) {
           this.digitalIdConfig = digitalIdConfig;
           this.RDN = RDN;
           this.RDNVariables = RDNVariables;
           this.subjectAltName = subjectAltName;
           this.caVariables = caVariables;
           this.caDirectoryMode = caDirectoryMode;
           this.createIfNotExists = createIfNotExists;
           this.recoverIfExists = recoverIfExists;
           this.p12LatestKeyOnly = p12LatestKeyOnly;
           this.securityStoreType = securityStoreType;
           this.securityStorePassword = securityStorePassword;
           this.p10Requests = p10Requests;
           this.clientType = clientType;
           this.comment = comment;
    }


    /**
     * Gets the digitalIdConfig value for this UserDigitalIdParms.
     * 
     * @return digitalIdConfig
     */
    public java.lang.String getDigitalIdConfig() {
        return digitalIdConfig;
    }


    /**
     * Sets the digitalIdConfig value for this UserDigitalIdParms.
     * 
     * @param digitalIdConfig
     */
    public void setDigitalIdConfig(java.lang.String digitalIdConfig) {
        this.digitalIdConfig = digitalIdConfig;
    }


    /**
     * Gets the RDN value for this UserDigitalIdParms.
     * 
     * @return RDN
     */
    public java.lang.String getRDN() {
        return RDN;
    }


    /**
     * Sets the RDN value for this UserDigitalIdParms.
     * 
     * @param RDN
     */
    public void setRDN(java.lang.String RDN) {
        this.RDN = RDN;
    }


    /**
     * Gets the RDNVariables value for this UserDigitalIdParms.
     * 
     * @return RDNVariables
     */
    public commonV8.ig.com.entrust.NameValue[] getRDNVariables() {
        return RDNVariables;
    }


    /**
     * Sets the RDNVariables value for this UserDigitalIdParms.
     * 
     * @param RDNVariables
     */
    public void setRDNVariables(commonV8.ig.com.entrust.NameValue[] RDNVariables) {
        this.RDNVariables = RDNVariables;
    }


    /**
     * Gets the subjectAltName value for this UserDigitalIdParms.
     * 
     * @return subjectAltName
     */
    public wsdl.adminV8.ig.com.entrust.SubjectAltName[] getSubjectAltName() {
        return subjectAltName;
    }


    /**
     * Sets the subjectAltName value for this UserDigitalIdParms.
     * 
     * @param subjectAltName
     */
    public void setSubjectAltName(wsdl.adminV8.ig.com.entrust.SubjectAltName[] subjectAltName) {
        this.subjectAltName = subjectAltName;
    }


    /**
     * Gets the caVariables value for this UserDigitalIdParms.
     * 
     * @return caVariables
     */
    public wsdl.adminV8.ig.com.entrust.ManagedCaVariable[] getCaVariables() {
        return caVariables;
    }


    /**
     * Sets the caVariables value for this UserDigitalIdParms.
     * 
     * @param caVariables
     */
    public void setCaVariables(wsdl.adminV8.ig.com.entrust.ManagedCaVariable[] caVariables) {
        this.caVariables = caVariables;
    }


    /**
     * Gets the caDirectoryMode value for this UserDigitalIdParms.
     * 
     * @return caDirectoryMode
     */
    public java.lang.String getCaDirectoryMode() {
        return caDirectoryMode;
    }


    /**
     * Sets the caDirectoryMode value for this UserDigitalIdParms.
     * 
     * @param caDirectoryMode
     */
    public void setCaDirectoryMode(java.lang.String caDirectoryMode) {
        this.caDirectoryMode = caDirectoryMode;
    }


    /**
     * Gets the createIfNotExists value for this UserDigitalIdParms.
     * 
     * @return createIfNotExists
     */
    public java.lang.Boolean getCreateIfNotExists() {
        return createIfNotExists;
    }


    /**
     * Sets the createIfNotExists value for this UserDigitalIdParms.
     * 
     * @param createIfNotExists
     */
    public void setCreateIfNotExists(java.lang.Boolean createIfNotExists) {
        this.createIfNotExists = createIfNotExists;
    }


    /**
     * Gets the recoverIfExists value for this UserDigitalIdParms.
     * 
     * @return recoverIfExists
     */
    public java.lang.Boolean getRecoverIfExists() {
        return recoverIfExists;
    }


    /**
     * Sets the recoverIfExists value for this UserDigitalIdParms.
     * 
     * @param recoverIfExists
     */
    public void setRecoverIfExists(java.lang.Boolean recoverIfExists) {
        this.recoverIfExists = recoverIfExists;
    }


    /**
     * Gets the p12LatestKeyOnly value for this UserDigitalIdParms.
     * 
     * @return p12LatestKeyOnly
     */
    public java.lang.Boolean getP12LatestKeyOnly() {
        return p12LatestKeyOnly;
    }


    /**
     * Sets the p12LatestKeyOnly value for this UserDigitalIdParms.
     * 
     * @param p12LatestKeyOnly
     */
    public void setP12LatestKeyOnly(java.lang.Boolean p12LatestKeyOnly) {
        this.p12LatestKeyOnly = p12LatestKeyOnly;
    }


    /**
     * Gets the securityStoreType value for this UserDigitalIdParms.
     * 
     * @return securityStoreType
     */
    public java.lang.String getSecurityStoreType() {
        return securityStoreType;
    }


    /**
     * Sets the securityStoreType value for this UserDigitalIdParms.
     * 
     * @param securityStoreType
     */
    public void setSecurityStoreType(java.lang.String securityStoreType) {
        this.securityStoreType = securityStoreType;
    }


    /**
     * Gets the securityStorePassword value for this UserDigitalIdParms.
     * 
     * @return securityStorePassword
     */
    public java.lang.String getSecurityStorePassword() {
        return securityStorePassword;
    }


    /**
     * Sets the securityStorePassword value for this UserDigitalIdParms.
     * 
     * @param securityStorePassword
     */
    public void setSecurityStorePassword(java.lang.String securityStorePassword) {
        this.securityStorePassword = securityStorePassword;
    }


    /**
     * Gets the p10Requests value for this UserDigitalIdParms.
     * 
     * @return p10Requests
     */
    public wsdl.adminV8.ig.com.entrust.DigitalIdP10Request[] getP10Requests() {
        return p10Requests;
    }


    /**
     * Sets the p10Requests value for this UserDigitalIdParms.
     * 
     * @param p10Requests
     */
    public void setP10Requests(wsdl.adminV8.ig.com.entrust.DigitalIdP10Request[] p10Requests) {
        this.p10Requests = p10Requests;
    }


    /**
     * Gets the clientType value for this UserDigitalIdParms.
     * 
     * @return clientType
     */
    public java.lang.String getClientType() {
        return clientType;
    }


    /**
     * Sets the clientType value for this UserDigitalIdParms.
     * 
     * @param clientType
     */
    public void setClientType(java.lang.String clientType) {
        this.clientType = clientType;
    }


    /**
     * Gets the comment value for this UserDigitalIdParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserDigitalIdParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDigitalIdParms)) return false;
        UserDigitalIdParms other = (UserDigitalIdParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.digitalIdConfig==null && other.getDigitalIdConfig()==null) || 
             (this.digitalIdConfig!=null &&
              this.digitalIdConfig.equals(other.getDigitalIdConfig()))) &&
            ((this.RDN==null && other.getRDN()==null) || 
             (this.RDN!=null &&
              this.RDN.equals(other.getRDN()))) &&
            ((this.RDNVariables==null && other.getRDNVariables()==null) || 
             (this.RDNVariables!=null &&
              java.util.Arrays.equals(this.RDNVariables, other.getRDNVariables()))) &&
            ((this.subjectAltName==null && other.getSubjectAltName()==null) || 
             (this.subjectAltName!=null &&
              java.util.Arrays.equals(this.subjectAltName, other.getSubjectAltName()))) &&
            ((this.caVariables==null && other.getCaVariables()==null) || 
             (this.caVariables!=null &&
              java.util.Arrays.equals(this.caVariables, other.getCaVariables()))) &&
            ((this.caDirectoryMode==null && other.getCaDirectoryMode()==null) || 
             (this.caDirectoryMode!=null &&
              this.caDirectoryMode.equals(other.getCaDirectoryMode()))) &&
            ((this.createIfNotExists==null && other.getCreateIfNotExists()==null) || 
             (this.createIfNotExists!=null &&
              this.createIfNotExists.equals(other.getCreateIfNotExists()))) &&
            ((this.recoverIfExists==null && other.getRecoverIfExists()==null) || 
             (this.recoverIfExists!=null &&
              this.recoverIfExists.equals(other.getRecoverIfExists()))) &&
            ((this.p12LatestKeyOnly==null && other.getP12LatestKeyOnly()==null) || 
             (this.p12LatestKeyOnly!=null &&
              this.p12LatestKeyOnly.equals(other.getP12LatestKeyOnly()))) &&
            ((this.securityStoreType==null && other.getSecurityStoreType()==null) || 
             (this.securityStoreType!=null &&
              this.securityStoreType.equals(other.getSecurityStoreType()))) &&
            ((this.securityStorePassword==null && other.getSecurityStorePassword()==null) || 
             (this.securityStorePassword!=null &&
              this.securityStorePassword.equals(other.getSecurityStorePassword()))) &&
            ((this.p10Requests==null && other.getP10Requests()==null) || 
             (this.p10Requests!=null &&
              java.util.Arrays.equals(this.p10Requests, other.getP10Requests()))) &&
            ((this.clientType==null && other.getClientType()==null) || 
             (this.clientType!=null &&
              this.clientType.equals(other.getClientType()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getDigitalIdConfig() != null) {
            _hashCode += getDigitalIdConfig().hashCode();
        }
        if (getRDN() != null) {
            _hashCode += getRDN().hashCode();
        }
        if (getRDNVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRDNVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRDNVariables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubjectAltName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubjectAltName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubjectAltName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaVariables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaDirectoryMode() != null) {
            _hashCode += getCaDirectoryMode().hashCode();
        }
        if (getCreateIfNotExists() != null) {
            _hashCode += getCreateIfNotExists().hashCode();
        }
        if (getRecoverIfExists() != null) {
            _hashCode += getRecoverIfExists().hashCode();
        }
        if (getP12LatestKeyOnly() != null) {
            _hashCode += getP12LatestKeyOnly().hashCode();
        }
        if (getSecurityStoreType() != null) {
            _hashCode += getSecurityStoreType().hashCode();
        }
        if (getSecurityStorePassword() != null) {
            _hashCode += getSecurityStorePassword().hashCode();
        }
        if (getP10Requests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getP10Requests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getP10Requests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientType() != null) {
            _hashCode += getClientType().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDigitalIdParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserDigitalIdParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalIdConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DigitalIdConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RDNVariables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RDNVariables"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "NameValue"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectAltName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubjectAltName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SubjectAltName"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caVariables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaVariables"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaVariable"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caDirectoryMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaDirectoryMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createIfNotExists");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreateIfNotExists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recoverIfExists");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RecoverIfExists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p12LatestKeyOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "P12LatestKeyOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityStoreType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecurityStoreType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityStorePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecurityStorePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p10Requests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "P10Requests"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdP10Request"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comment"));
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
