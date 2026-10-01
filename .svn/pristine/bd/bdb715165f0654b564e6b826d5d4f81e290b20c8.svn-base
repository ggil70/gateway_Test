/**
 * CertAndKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class CertAndKey  implements java.io.Serializable {
    private byte[] cert;

    private byte[] privateKey;

    public CertAndKey() {
    }

    public CertAndKey(
           byte[] cert,
           byte[] privateKey) {
           this.cert = cert;
           this.privateKey = privateKey;
    }


    /**
     * Gets the cert value for this CertAndKey.
     * 
     * @return cert
     */
    public byte[] getCert() {
        return cert;
    }


    /**
     * Sets the cert value for this CertAndKey.
     * 
     * @param cert
     */
    public void setCert(byte[] cert) {
        this.cert = cert;
    }


    /**
     * Gets the privateKey value for this CertAndKey.
     * 
     * @return privateKey
     */
    public byte[] getPrivateKey() {
        return privateKey;
    }


    /**
     * Sets the privateKey value for this CertAndKey.
     * 
     * @param privateKey
     */
    public void setPrivateKey(byte[] privateKey) {
        this.privateKey = privateKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertAndKey)) return false;
        CertAndKey other = (CertAndKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cert==null && other.getCert()==null) || 
             (this.cert!=null &&
              java.util.Arrays.equals(this.cert, other.getCert()))) &&
            ((this.privateKey==null && other.getPrivateKey()==null) || 
             (this.privateKey!=null &&
              java.util.Arrays.equals(this.privateKey, other.getPrivateKey())));
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
        if (getCert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCert(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrivateKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrivateKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrivateKey(), i);
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
        new org.apache.axis.description.TypeDesc(CertAndKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "CertAndKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrivateKey"));
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
