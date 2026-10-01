/**
 * SmartCredentialVariableRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialVariableRules  implements java.io.Serializable {
    private java.lang.String digits;

    private java.lang.String upper;

    private java.lang.String lower;

    private java.lang.String symbols;

    public SmartCredentialVariableRules() {
    }

    public SmartCredentialVariableRules(
           java.lang.String digits,
           java.lang.String upper,
           java.lang.String lower,
           java.lang.String symbols) {
           this.digits = digits;
           this.upper = upper;
           this.lower = lower;
           this.symbols = symbols;
    }


    /**
     * Gets the digits value for this SmartCredentialVariableRules.
     * 
     * @return digits
     */
    public java.lang.String getDigits() {
        return digits;
    }


    /**
     * Sets the digits value for this SmartCredentialVariableRules.
     * 
     * @param digits
     */
    public void setDigits(java.lang.String digits) {
        this.digits = digits;
    }


    /**
     * Gets the upper value for this SmartCredentialVariableRules.
     * 
     * @return upper
     */
    public java.lang.String getUpper() {
        return upper;
    }


    /**
     * Sets the upper value for this SmartCredentialVariableRules.
     * 
     * @param upper
     */
    public void setUpper(java.lang.String upper) {
        this.upper = upper;
    }


    /**
     * Gets the lower value for this SmartCredentialVariableRules.
     * 
     * @return lower
     */
    public java.lang.String getLower() {
        return lower;
    }


    /**
     * Sets the lower value for this SmartCredentialVariableRules.
     * 
     * @param lower
     */
    public void setLower(java.lang.String lower) {
        this.lower = lower;
    }


    /**
     * Gets the symbols value for this SmartCredentialVariableRules.
     * 
     * @return symbols
     */
    public java.lang.String getSymbols() {
        return symbols;
    }


    /**
     * Sets the symbols value for this SmartCredentialVariableRules.
     * 
     * @param symbols
     */
    public void setSymbols(java.lang.String symbols) {
        this.symbols = symbols;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialVariableRules)) return false;
        SmartCredentialVariableRules other = (SmartCredentialVariableRules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.digits==null && other.getDigits()==null) || 
             (this.digits!=null &&
              this.digits.equals(other.getDigits()))) &&
            ((this.upper==null && other.getUpper()==null) || 
             (this.upper!=null &&
              this.upper.equals(other.getUpper()))) &&
            ((this.lower==null && other.getLower()==null) || 
             (this.lower!=null &&
              this.lower.equals(other.getLower()))) &&
            ((this.symbols==null && other.getSymbols()==null) || 
             (this.symbols!=null &&
              this.symbols.equals(other.getSymbols())));
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
        if (getDigits() != null) {
            _hashCode += getDigits().hashCode();
        }
        if (getUpper() != null) {
            _hashCode += getUpper().hashCode();
        }
        if (getLower() != null) {
            _hashCode += getLower().hashCode();
        }
        if (getSymbols() != null) {
            _hashCode += getSymbols().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialVariableRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableRules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upper");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbols");
        elemField.setXmlName(new javax.xml.namespace.QName("", "symbols"));
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
