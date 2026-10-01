/**
 * ScepRaSignContentResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ScepRaSignContentResult  implements java.io.Serializable {
    private byte[] cmsSignedData;

    public ScepRaSignContentResult() {
    }

    public ScepRaSignContentResult(
           byte[] cmsSignedData) {
           this.cmsSignedData = cmsSignedData;
    }


    /**
     * Gets the cmsSignedData value for this ScepRaSignContentResult.
     * 
     * @return cmsSignedData
     */
    public byte[] getCmsSignedData() {
        return cmsSignedData;
    }


    /**
     * Sets the cmsSignedData value for this ScepRaSignContentResult.
     * 
     * @param cmsSignedData
     */
    public void setCmsSignedData(byte[] cmsSignedData) {
        this.cmsSignedData = cmsSignedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScepRaSignContentResult)) return false;
        ScepRaSignContentResult other = (ScepRaSignContentResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cmsSignedData==null && other.getCmsSignedData()==null) || 
             (this.cmsSignedData!=null &&
              java.util.Arrays.equals(this.cmsSignedData, other.getCmsSignedData())));
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
        if (getCmsSignedData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmsSignedData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmsSignedData(), i);
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
        new org.apache.axis.description.TypeDesc(ScepRaSignContentResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ScepRaSignContentResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsSignedData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmsSignedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
