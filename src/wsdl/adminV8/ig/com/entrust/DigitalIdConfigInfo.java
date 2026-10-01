/**
 * DigitalIdConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class DigitalIdConfigInfo  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String RDNFormat;

    private java.lang.String searchbase;

    private java.lang.String managedCA;

    private java.lang.String category;

    private wsdl.adminV8.ig.com.entrust.SubjectAltName[] subjectAltNames;

    private java.lang.String description;

    private java.lang.String type;

    private byte[][] p10TrustedSignerCertificates;

    private java.lang.String p10CertStreamPolicy;

    private wsdl.adminV8.ig.com.entrust.DigitalIdConfigEntrustSpecificInfo entrustSpecificInfo;

    private wsdl.adminV8.ig.com.entrust.DigitalIdConfigMicrosoftSpecificInfo microsoftSpecificInfo;

    private java.lang.String[] rolesGrantingAccess;

    public DigitalIdConfigInfo() {
    }

    public DigitalIdConfigInfo(
           java.lang.String name,
           java.lang.String RDNFormat,
           java.lang.String searchbase,
           java.lang.String managedCA,
           java.lang.String category,
           wsdl.adminV8.ig.com.entrust.SubjectAltName[] subjectAltNames,
           java.lang.String description,
           java.lang.String type,
           byte[][] p10TrustedSignerCertificates,
           java.lang.String p10CertStreamPolicy,
           wsdl.adminV8.ig.com.entrust.DigitalIdConfigEntrustSpecificInfo entrustSpecificInfo,
           wsdl.adminV8.ig.com.entrust.DigitalIdConfigMicrosoftSpecificInfo microsoftSpecificInfo,
           java.lang.String[] rolesGrantingAccess) {
           this.name = name;
           this.RDNFormat = RDNFormat;
           this.searchbase = searchbase;
           this.managedCA = managedCA;
           this.category = category;
           this.subjectAltNames = subjectAltNames;
           this.description = description;
           this.type = type;
           this.p10TrustedSignerCertificates = p10TrustedSignerCertificates;
           this.p10CertStreamPolicy = p10CertStreamPolicy;
           this.entrustSpecificInfo = entrustSpecificInfo;
           this.microsoftSpecificInfo = microsoftSpecificInfo;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the name value for this DigitalIdConfigInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DigitalIdConfigInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the RDNFormat value for this DigitalIdConfigInfo.
     * 
     * @return RDNFormat
     */
    public java.lang.String getRDNFormat() {
        return RDNFormat;
    }


    /**
     * Sets the RDNFormat value for this DigitalIdConfigInfo.
     * 
     * @param RDNFormat
     */
    public void setRDNFormat(java.lang.String RDNFormat) {
        this.RDNFormat = RDNFormat;
    }


    /**
     * Gets the searchbase value for this DigitalIdConfigInfo.
     * 
     * @return searchbase
     */
    public java.lang.String getSearchbase() {
        return searchbase;
    }


    /**
     * Sets the searchbase value for this DigitalIdConfigInfo.
     * 
     * @param searchbase
     */
    public void setSearchbase(java.lang.String searchbase) {
        this.searchbase = searchbase;
    }


    /**
     * Gets the managedCA value for this DigitalIdConfigInfo.
     * 
     * @return managedCA
     */
    public java.lang.String getManagedCA() {
        return managedCA;
    }


    /**
     * Sets the managedCA value for this DigitalIdConfigInfo.
     * 
     * @param managedCA
     */
    public void setManagedCA(java.lang.String managedCA) {
        this.managedCA = managedCA;
    }


    /**
     * Gets the category value for this DigitalIdConfigInfo.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this DigitalIdConfigInfo.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the subjectAltNames value for this DigitalIdConfigInfo.
     * 
     * @return subjectAltNames
     */
    public wsdl.adminV8.ig.com.entrust.SubjectAltName[] getSubjectAltNames() {
        return subjectAltNames;
    }


    /**
     * Sets the subjectAltNames value for this DigitalIdConfigInfo.
     * 
     * @param subjectAltNames
     */
    public void setSubjectAltNames(wsdl.adminV8.ig.com.entrust.SubjectAltName[] subjectAltNames) {
        this.subjectAltNames = subjectAltNames;
    }


    /**
     * Gets the description value for this DigitalIdConfigInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DigitalIdConfigInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the type value for this DigitalIdConfigInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DigitalIdConfigInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the p10TrustedSignerCertificates value for this DigitalIdConfigInfo.
     * 
     * @return p10TrustedSignerCertificates
     */
    public byte[][] getP10TrustedSignerCertificates() {
        return p10TrustedSignerCertificates;
    }


    /**
     * Sets the p10TrustedSignerCertificates value for this DigitalIdConfigInfo.
     * 
     * @param p10TrustedSignerCertificates
     */
    public void setP10TrustedSignerCertificates(byte[][] p10TrustedSignerCertificates) {
        this.p10TrustedSignerCertificates = p10TrustedSignerCertificates;
    }


    /**
     * Gets the p10CertStreamPolicy value for this DigitalIdConfigInfo.
     * 
     * @return p10CertStreamPolicy
     */
    public java.lang.String getP10CertStreamPolicy() {
        return p10CertStreamPolicy;
    }


    /**
     * Sets the p10CertStreamPolicy value for this DigitalIdConfigInfo.
     * 
     * @param p10CertStreamPolicy
     */
    public void setP10CertStreamPolicy(java.lang.String p10CertStreamPolicy) {
        this.p10CertStreamPolicy = p10CertStreamPolicy;
    }


    /**
     * Gets the entrustSpecificInfo value for this DigitalIdConfigInfo.
     * 
     * @return entrustSpecificInfo
     */
    public wsdl.adminV8.ig.com.entrust.DigitalIdConfigEntrustSpecificInfo getEntrustSpecificInfo() {
        return entrustSpecificInfo;
    }


    /**
     * Sets the entrustSpecificInfo value for this DigitalIdConfigInfo.
     * 
     * @param entrustSpecificInfo
     */
    public void setEntrustSpecificInfo(wsdl.adminV8.ig.com.entrust.DigitalIdConfigEntrustSpecificInfo entrustSpecificInfo) {
        this.entrustSpecificInfo = entrustSpecificInfo;
    }


    /**
     * Gets the microsoftSpecificInfo value for this DigitalIdConfigInfo.
     * 
     * @return microsoftSpecificInfo
     */
    public wsdl.adminV8.ig.com.entrust.DigitalIdConfigMicrosoftSpecificInfo getMicrosoftSpecificInfo() {
        return microsoftSpecificInfo;
    }


    /**
     * Sets the microsoftSpecificInfo value for this DigitalIdConfigInfo.
     * 
     * @param microsoftSpecificInfo
     */
    public void setMicrosoftSpecificInfo(wsdl.adminV8.ig.com.entrust.DigitalIdConfigMicrosoftSpecificInfo microsoftSpecificInfo) {
        this.microsoftSpecificInfo = microsoftSpecificInfo;
    }


    /**
     * Gets the rolesGrantingAccess value for this DigitalIdConfigInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this DigitalIdConfigInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigitalIdConfigInfo)) return false;
        DigitalIdConfigInfo other = (DigitalIdConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.RDNFormat==null && other.getRDNFormat()==null) || 
             (this.RDNFormat!=null &&
              this.RDNFormat.equals(other.getRDNFormat()))) &&
            ((this.searchbase==null && other.getSearchbase()==null) || 
             (this.searchbase!=null &&
              this.searchbase.equals(other.getSearchbase()))) &&
            ((this.managedCA==null && other.getManagedCA()==null) || 
             (this.managedCA!=null &&
              this.managedCA.equals(other.getManagedCA()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.subjectAltNames==null && other.getSubjectAltNames()==null) || 
             (this.subjectAltNames!=null &&
              java.util.Arrays.equals(this.subjectAltNames, other.getSubjectAltNames()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.p10TrustedSignerCertificates==null && other.getP10TrustedSignerCertificates()==null) || 
             (this.p10TrustedSignerCertificates!=null &&
              java.util.Arrays.equals(this.p10TrustedSignerCertificates, other.getP10TrustedSignerCertificates()))) &&
            ((this.p10CertStreamPolicy==null && other.getP10CertStreamPolicy()==null) || 
             (this.p10CertStreamPolicy!=null &&
              this.p10CertStreamPolicy.equals(other.getP10CertStreamPolicy()))) &&
            ((this.entrustSpecificInfo==null && other.getEntrustSpecificInfo()==null) || 
             (this.entrustSpecificInfo!=null &&
              this.entrustSpecificInfo.equals(other.getEntrustSpecificInfo()))) &&
            ((this.microsoftSpecificInfo==null && other.getMicrosoftSpecificInfo()==null) || 
             (this.microsoftSpecificInfo!=null &&
              this.microsoftSpecificInfo.equals(other.getMicrosoftSpecificInfo()))) &&
            ((this.rolesGrantingAccess==null && other.getRolesGrantingAccess()==null) || 
             (this.rolesGrantingAccess!=null &&
              java.util.Arrays.equals(this.rolesGrantingAccess, other.getRolesGrantingAccess())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRDNFormat() != null) {
            _hashCode += getRDNFormat().hashCode();
        }
        if (getSearchbase() != null) {
            _hashCode += getSearchbase().hashCode();
        }
        if (getManagedCA() != null) {
            _hashCode += getManagedCA().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getSubjectAltNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubjectAltNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubjectAltNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getP10TrustedSignerCertificates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getP10TrustedSignerCertificates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getP10TrustedSignerCertificates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getP10CertStreamPolicy() != null) {
            _hashCode += getP10CertStreamPolicy().hashCode();
        }
        if (getEntrustSpecificInfo() != null) {
            _hashCode += getEntrustSpecificInfo().hashCode();
        }
        if (getMicrosoftSpecificInfo() != null) {
            _hashCode += getMicrosoftSpecificInfo().hashCode();
        }
        if (getRolesGrantingAccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRolesGrantingAccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRolesGrantingAccess(), i);
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
        new org.apache.axis.description.TypeDesc(DigitalIdConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RDNFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RDNFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchbase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Searchbase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedCA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ManagedCA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectAltNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subjectAltNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SubjectAltName"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p10TrustedSignerCertificates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "p10TrustedSignerCertificates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p10CertStreamPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "p10CertStreamPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrustSpecificInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntrustSpecificInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdConfigEntrustSpecificInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microsoftSpecificInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MicrosoftSpecificInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdConfigMicrosoftSpecificInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesGrantingAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rolesGrantingAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
