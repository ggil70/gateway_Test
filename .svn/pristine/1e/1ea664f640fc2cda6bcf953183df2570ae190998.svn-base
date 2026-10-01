/**
 * EncryptedDataParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class EncryptedDataParms  implements java.io.Serializable {
    private byte[] cmsEnvelopedData;

    private java.lang.String managedCa;

    public EncryptedDataParms() {
    }

    public EncryptedDataParms(
           byte[] cmsEnvelopedData,
           java.lang.String managedCa) {
           this.cmsEnvelopedData = cmsEnvelopedData;
           this.managedCa = managedCa;
    }


    /**
     * Gets the cmsEnvelopedData value for this EncryptedDataParms.
     * 
     * @return cmsEnvelopedData
     */
    public byte[] getCmsEnvelopedData() {
        return cmsEnvelopedData;
    }


    /**
     * Sets the cmsEnvelopedData value for this EncryptedDataParms.
     * 
     * @param cmsEnvelopedData
     */
    public void setCmsEnvelopedData(byte[] cmsEnvelopedData) {
        this.cmsEnvelopedData = cmsEnvelopedData;
    }


    /**
     * Gets the managedCa value for this EncryptedDataParms.
     * 
     * @return managedCa
     */
    public java.lang.String getManagedCa() {
        return managedCa;
    }


    /**
     * Sets the managedCa value for this EncryptedDataParms.
     * 
     * @param managedCa
     */
    public void setManagedCa(java.lang.String managedCa) {
        this.managedCa = managedCa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EncryptedDataParms)) return false;
        EncryptedDataParms other = (EncryptedDataParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cmsEnvelopedData==null && other.getCmsEnvelopedData()==null) || 
             (this.cmsEnvelopedData!=null &&
              java.util.Arrays.equals(this.cmsEnvelopedData, other.getCmsEnvelopedData()))) &&
            ((this.managedCa==null && other.getManagedCa()==null) || 
             (this.managedCa!=null &&
              this.managedCa.equals(other.getManagedCa())));
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
        if (getCmsEnvelopedData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmsEnvelopedData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmsEnvelopedData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManagedCa() != null) {
            _hashCode += getManagedCa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EncryptedDataParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "EncryptedDataParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsEnvelopedData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmsEnvelopedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedCa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ManagedCa"));
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
