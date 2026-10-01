/**
 * ManagedCaIsCertRevokedResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ManagedCaIsCertRevokedResult  implements java.io.Serializable {
    private java.lang.Boolean isRevoked;

    public ManagedCaIsCertRevokedResult() {
    }

    public ManagedCaIsCertRevokedResult(
           java.lang.Boolean isRevoked) {
           this.isRevoked = isRevoked;
    }


    /**
     * Gets the isRevoked value for this ManagedCaIsCertRevokedResult.
     * 
     * @return isRevoked
     */
    public java.lang.Boolean getIsRevoked() {
        return isRevoked;
    }


    /**
     * Sets the isRevoked value for this ManagedCaIsCertRevokedResult.
     * 
     * @param isRevoked
     */
    public void setIsRevoked(java.lang.Boolean isRevoked) {
        this.isRevoked = isRevoked;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCaIsCertRevokedResult)) return false;
        ManagedCaIsCertRevokedResult other = (ManagedCaIsCertRevokedResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isRevoked==null && other.getIsRevoked()==null) || 
             (this.isRevoked!=null &&
              this.isRevoked.equals(other.getIsRevoked())));
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
        if (getIsRevoked() != null) {
            _hashCode += getIsRevoked().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCaIsCertRevokedResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaIsCertRevokedResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRevoked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isRevoked"));
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
