/**
 * CertificateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class CertificateResponse  implements java.io.Serializable {
    private java.lang.String certificateEncoding;

    private byte[] certificate;

    public CertificateResponse() {
    }

    public CertificateResponse(
           java.lang.String certificateEncoding,
           byte[] certificate) {
           this.certificateEncoding = certificateEncoding;
           this.certificate = certificate;
    }


    /**
     * Gets the certificateEncoding value for this CertificateResponse.
     * 
     * @return certificateEncoding
     */
    public java.lang.String getCertificateEncoding() {
        return certificateEncoding;
    }


    /**
     * Sets the certificateEncoding value for this CertificateResponse.
     * 
     * @param certificateEncoding
     */
    public void setCertificateEncoding(java.lang.String certificateEncoding) {
        this.certificateEncoding = certificateEncoding;
    }


    /**
     * Gets the certificate value for this CertificateResponse.
     * 
     * @return certificate
     */
    public byte[] getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this CertificateResponse.
     * 
     * @param certificate
     */
    public void setCertificate(byte[] certificate) {
        this.certificate = certificate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificateResponse)) return false;
        CertificateResponse other = (CertificateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificateEncoding==null && other.getCertificateEncoding()==null) || 
             (this.certificateEncoding!=null &&
              this.certificateEncoding.equals(other.getCertificateEncoding()))) &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              java.util.Arrays.equals(this.certificate, other.getCertificate())));
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
        if (getCertificateEncoding() != null) {
            _hashCode += getCertificateEncoding().hashCode();
        }
        if (getCertificate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificate(), i);
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
        new org.apache.axis.description.TypeDesc(CertificateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "CertificateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateEncoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CertificateEncoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Certificate"));
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
