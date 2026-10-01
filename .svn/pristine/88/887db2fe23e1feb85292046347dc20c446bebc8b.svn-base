/**
 * SmartCredentialVariablePrintWidth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialVariablePrintWidth  implements java.io.Serializable {
    private int value;

    private java.lang.String fontName;

    private int fontSize;

    public SmartCredentialVariablePrintWidth() {
    }

    public SmartCredentialVariablePrintWidth(
           int value,
           java.lang.String fontName,
           int fontSize) {
           this.value = value;
           this.fontName = fontName;
           this.fontSize = fontSize;
    }


    /**
     * Gets the value value for this SmartCredentialVariablePrintWidth.
     * 
     * @return value
     */
    public int getValue() {
        return value;
    }


    /**
     * Sets the value value for this SmartCredentialVariablePrintWidth.
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }


    /**
     * Gets the fontName value for this SmartCredentialVariablePrintWidth.
     * 
     * @return fontName
     */
    public java.lang.String getFontName() {
        return fontName;
    }


    /**
     * Sets the fontName value for this SmartCredentialVariablePrintWidth.
     * 
     * @param fontName
     */
    public void setFontName(java.lang.String fontName) {
        this.fontName = fontName;
    }


    /**
     * Gets the fontSize value for this SmartCredentialVariablePrintWidth.
     * 
     * @return fontSize
     */
    public int getFontSize() {
        return fontSize;
    }


    /**
     * Sets the fontSize value for this SmartCredentialVariablePrintWidth.
     * 
     * @param fontSize
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialVariablePrintWidth)) return false;
        SmartCredentialVariablePrintWidth other = (SmartCredentialVariablePrintWidth) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.value == other.getValue() &&
            ((this.fontName==null && other.getFontName()==null) || 
             (this.fontName!=null &&
              this.fontName.equals(other.getFontName()))) &&
            this.fontSize == other.getFontSize();
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
        _hashCode += getValue();
        if (getFontName() != null) {
            _hashCode += getFontName().hashCode();
        }
        _hashCode += getFontSize();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialVariablePrintWidth.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariablePrintWidth"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fontName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fontName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fontSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fontSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
