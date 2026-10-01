/**
 * ManagedCaIsCertRevokedCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ManagedCaIsCertRevokedCallParms  implements java.io.Serializable {
    private java.lang.String managedCaName;

    private java.lang.String certSubjectDn;

    private java.lang.String certSerialNumber;

    public ManagedCaIsCertRevokedCallParms() {
    }

    public ManagedCaIsCertRevokedCallParms(
           java.lang.String managedCaName,
           java.lang.String certSubjectDn,
           java.lang.String certSerialNumber) {
           this.managedCaName = managedCaName;
           this.certSubjectDn = certSubjectDn;
           this.certSerialNumber = certSerialNumber;
    }


    /**
     * Gets the managedCaName value for this ManagedCaIsCertRevokedCallParms.
     * 
     * @return managedCaName
     */
    public java.lang.String getManagedCaName() {
        return managedCaName;
    }


    /**
     * Sets the managedCaName value for this ManagedCaIsCertRevokedCallParms.
     * 
     * @param managedCaName
     */
    public void setManagedCaName(java.lang.String managedCaName) {
        this.managedCaName = managedCaName;
    }


    /**
     * Gets the certSubjectDn value for this ManagedCaIsCertRevokedCallParms.
     * 
     * @return certSubjectDn
     */
    public java.lang.String getCertSubjectDn() {
        return certSubjectDn;
    }


    /**
     * Sets the certSubjectDn value for this ManagedCaIsCertRevokedCallParms.
     * 
     * @param certSubjectDn
     */
    public void setCertSubjectDn(java.lang.String certSubjectDn) {
        this.certSubjectDn = certSubjectDn;
    }


    /**
     * Gets the certSerialNumber value for this ManagedCaIsCertRevokedCallParms.
     * 
     * @return certSerialNumber
     */
    public java.lang.String getCertSerialNumber() {
        return certSerialNumber;
    }


    /**
     * Sets the certSerialNumber value for this ManagedCaIsCertRevokedCallParms.
     * 
     * @param certSerialNumber
     */
    public void setCertSerialNumber(java.lang.String certSerialNumber) {
        this.certSerialNumber = certSerialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCaIsCertRevokedCallParms)) return false;
        ManagedCaIsCertRevokedCallParms other = (ManagedCaIsCertRevokedCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.managedCaName==null && other.getManagedCaName()==null) || 
             (this.managedCaName!=null &&
              this.managedCaName.equals(other.getManagedCaName()))) &&
            ((this.certSubjectDn==null && other.getCertSubjectDn()==null) || 
             (this.certSubjectDn!=null &&
              this.certSubjectDn.equals(other.getCertSubjectDn()))) &&
            ((this.certSerialNumber==null && other.getCertSerialNumber()==null) || 
             (this.certSerialNumber!=null &&
              this.certSerialNumber.equals(other.getCertSerialNumber())));
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
        if (getManagedCaName() != null) {
            _hashCode += getManagedCaName().hashCode();
        }
        if (getCertSubjectDn() != null) {
            _hashCode += getCertSubjectDn().hashCode();
        }
        if (getCertSerialNumber() != null) {
            _hashCode += getCertSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCaIsCertRevokedCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaIsCertRevokedCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedCaName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "managedCaName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSubjectDn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSubjectDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certSerialNumber"));
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
