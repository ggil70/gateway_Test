/**
 * SmartCredentialVariableGenerated.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialVariableGenerated  implements java.io.Serializable {
    private boolean value;

    private org.apache.axis.types.PositiveInteger length;

    private java.lang.Boolean clone;

    public SmartCredentialVariableGenerated() {
    }

    public SmartCredentialVariableGenerated(
           boolean value,
           org.apache.axis.types.PositiveInteger length,
           java.lang.Boolean clone) {
           this.value = value;
           this.length = length;
           this.clone = clone;
    }


    /**
     * Gets the value value for this SmartCredentialVariableGenerated.
     * 
     * @return value
     */
    public boolean isValue() {
        return value;
    }


    /**
     * Sets the value value for this SmartCredentialVariableGenerated.
     * 
     * @param value
     */
    public void setValue(boolean value) {
        this.value = value;
    }


    /**
     * Gets the length value for this SmartCredentialVariableGenerated.
     * 
     * @return length
     */
    public org.apache.axis.types.PositiveInteger getLength() {
        return length;
    }


    /**
     * Sets the length value for this SmartCredentialVariableGenerated.
     * 
     * @param length
     */
    public void setLength(org.apache.axis.types.PositiveInteger length) {
        this.length = length;
    }


    /**
     * Gets the clone value for this SmartCredentialVariableGenerated.
     * 
     * @return clone
     */
    public java.lang.Boolean getClone() {
        return clone;
    }


    /**
     * Sets the clone value for this SmartCredentialVariableGenerated.
     * 
     * @param clone
     */
    public void setClone(java.lang.Boolean clone) {
        this.clone = clone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialVariableGenerated)) return false;
        SmartCredentialVariableGenerated other = (SmartCredentialVariableGenerated) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.value == other.isValue() &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.clone==null && other.getClone()==null) || 
             (this.clone!=null &&
              this.clone.equals(other.getClone())));
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
        _hashCode += (isValue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getClone() != null) {
            _hashCode += getClone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialVariableGenerated.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableGenerated"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clone"));
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
