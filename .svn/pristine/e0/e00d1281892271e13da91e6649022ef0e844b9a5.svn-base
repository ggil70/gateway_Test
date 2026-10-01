/**
 * ManagedCaScepRaDecryptDataCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ManagedCaScepRaDecryptDataCallParms  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.EncryptedDataParms encryptedData;

    public ManagedCaScepRaDecryptDataCallParms() {
    }

    public ManagedCaScepRaDecryptDataCallParms(
           wsdl.adminV8.ig.com.entrust.EncryptedDataParms encryptedData) {
           this.encryptedData = encryptedData;
    }


    /**
     * Gets the encryptedData value for this ManagedCaScepRaDecryptDataCallParms.
     * 
     * @return encryptedData
     */
    public wsdl.adminV8.ig.com.entrust.EncryptedDataParms getEncryptedData() {
        return encryptedData;
    }


    /**
     * Sets the encryptedData value for this ManagedCaScepRaDecryptDataCallParms.
     * 
     * @param encryptedData
     */
    public void setEncryptedData(wsdl.adminV8.ig.com.entrust.EncryptedDataParms encryptedData) {
        this.encryptedData = encryptedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCaScepRaDecryptDataCallParms)) return false;
        ManagedCaScepRaDecryptDataCallParms other = (ManagedCaScepRaDecryptDataCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.encryptedData==null && other.getEncryptedData()==null) || 
             (this.encryptedData!=null &&
              this.encryptedData.equals(other.getEncryptedData())));
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
        if (getEncryptedData() != null) {
            _hashCode += getEncryptedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCaScepRaDecryptDataCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaScepRaDecryptDataCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "EncryptedDataParms"));
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
