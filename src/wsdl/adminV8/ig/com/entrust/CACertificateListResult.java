/**
 * CACertificateListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class CACertificateListResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.CACertificateInfo[] CACertificates;

    public CACertificateListResult() {
    }

    public CACertificateListResult(
           wsdl.adminV8.ig.com.entrust.CACertificateInfo[] CACertificates) {
           this.CACertificates = CACertificates;
    }


    /**
     * Gets the CACertificates value for this CACertificateListResult.
     * 
     * @return CACertificates
     */
    public wsdl.adminV8.ig.com.entrust.CACertificateInfo[] getCACertificates() {
        return CACertificates;
    }


    /**
     * Sets the CACertificates value for this CACertificateListResult.
     * 
     * @param CACertificates
     */
    public void setCACertificates(wsdl.adminV8.ig.com.entrust.CACertificateInfo[] CACertificates) {
        this.CACertificates = CACertificates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CACertificateListResult)) return false;
        CACertificateListResult other = (CACertificateListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CACertificates==null && other.getCACertificates()==null) || 
             (this.CACertificates!=null &&
              java.util.Arrays.equals(this.CACertificates, other.getCACertificates())));
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
        if (getCACertificates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCACertificates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCACertificates(), i);
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
        new org.apache.axis.description.TypeDesc(CACertificateListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "CACertificateListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CACertificates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CACertificates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "CACertificateInfo"));
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
