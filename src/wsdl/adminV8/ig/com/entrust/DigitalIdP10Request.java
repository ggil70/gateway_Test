/**
 * DigitalIdP10Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class DigitalIdP10Request  implements java.io.Serializable {
    private java.lang.String certStreamPolicy;

    private byte[] p10;

    private byte[] privateKey;

    public DigitalIdP10Request() {
    }

    public DigitalIdP10Request(
           java.lang.String certStreamPolicy,
           byte[] p10,
           byte[] privateKey) {
           this.certStreamPolicy = certStreamPolicy;
           this.p10 = p10;
           this.privateKey = privateKey;
    }


    /**
     * Gets the certStreamPolicy value for this DigitalIdP10Request.
     * 
     * @return certStreamPolicy
     */
    public java.lang.String getCertStreamPolicy() {
        return certStreamPolicy;
    }


    /**
     * Sets the certStreamPolicy value for this DigitalIdP10Request.
     * 
     * @param certStreamPolicy
     */
    public void setCertStreamPolicy(java.lang.String certStreamPolicy) {
        this.certStreamPolicy = certStreamPolicy;
    }


    /**
     * Gets the p10 value for this DigitalIdP10Request.
     * 
     * @return p10
     */
    public byte[] getP10() {
        return p10;
    }


    /**
     * Sets the p10 value for this DigitalIdP10Request.
     * 
     * @param p10
     */
    public void setP10(byte[] p10) {
        this.p10 = p10;
    }


    /**
     * Gets the privateKey value for this DigitalIdP10Request.
     * 
     * @return privateKey
     */
    public byte[] getPrivateKey() {
        return privateKey;
    }


    /**
     * Sets the privateKey value for this DigitalIdP10Request.
     * 
     * @param privateKey
     */
    public void setPrivateKey(byte[] privateKey) {
        this.privateKey = privateKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DigitalIdP10Request)) return false;
        DigitalIdP10Request other = (DigitalIdP10Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certStreamPolicy==null && other.getCertStreamPolicy()==null) || 
             (this.certStreamPolicy!=null &&
              this.certStreamPolicy.equals(other.getCertStreamPolicy()))) &&
            ((this.p10==null && other.getP10()==null) || 
             (this.p10!=null &&
              java.util.Arrays.equals(this.p10, other.getP10()))) &&
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
        if (getCertStreamPolicy() != null) {
            _hashCode += getCertStreamPolicy().hashCode();
        }
        if (getP10() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getP10());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getP10(), i);
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
        new org.apache.axis.description.TypeDesc(DigitalIdP10Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdP10Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certStreamPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CertStreamPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "P10"));
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
