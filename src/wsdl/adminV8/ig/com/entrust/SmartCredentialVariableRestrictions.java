/**
 * SmartCredentialVariableRestrictions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialVariableRestrictions  implements java.io.Serializable {
    private java.math.BigInteger min;

    private java.math.BigInteger max;

    private java.lang.String regex;

    private java.lang.String charSet;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRules rules;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariablePrintWidth printWidth;

    public SmartCredentialVariableRestrictions() {
    }

    public SmartCredentialVariableRestrictions(
           java.math.BigInteger min,
           java.math.BigInteger max,
           java.lang.String regex,
           java.lang.String charSet,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRules rules,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariablePrintWidth printWidth) {
           this.min = min;
           this.max = max;
           this.regex = regex;
           this.charSet = charSet;
           this.rules = rules;
           this.printWidth = printWidth;
    }


    /**
     * Gets the min value for this SmartCredentialVariableRestrictions.
     * 
     * @return min
     */
    public java.math.BigInteger getMin() {
        return min;
    }


    /**
     * Sets the min value for this SmartCredentialVariableRestrictions.
     * 
     * @param min
     */
    public void setMin(java.math.BigInteger min) {
        this.min = min;
    }


    /**
     * Gets the max value for this SmartCredentialVariableRestrictions.
     * 
     * @return max
     */
    public java.math.BigInteger getMax() {
        return max;
    }


    /**
     * Sets the max value for this SmartCredentialVariableRestrictions.
     * 
     * @param max
     */
    public void setMax(java.math.BigInteger max) {
        this.max = max;
    }


    /**
     * Gets the regex value for this SmartCredentialVariableRestrictions.
     * 
     * @return regex
     */
    public java.lang.String getRegex() {
        return regex;
    }


    /**
     * Sets the regex value for this SmartCredentialVariableRestrictions.
     * 
     * @param regex
     */
    public void setRegex(java.lang.String regex) {
        this.regex = regex;
    }


    /**
     * Gets the charSet value for this SmartCredentialVariableRestrictions.
     * 
     * @return charSet
     */
    public java.lang.String getCharSet() {
        return charSet;
    }


    /**
     * Sets the charSet value for this SmartCredentialVariableRestrictions.
     * 
     * @param charSet
     */
    public void setCharSet(java.lang.String charSet) {
        this.charSet = charSet;
    }


    /**
     * Gets the rules value for this SmartCredentialVariableRestrictions.
     * 
     * @return rules
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRules getRules() {
        return rules;
    }


    /**
     * Sets the rules value for this SmartCredentialVariableRestrictions.
     * 
     * @param rules
     */
    public void setRules(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRules rules) {
        this.rules = rules;
    }


    /**
     * Gets the printWidth value for this SmartCredentialVariableRestrictions.
     * 
     * @return printWidth
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariablePrintWidth getPrintWidth() {
        return printWidth;
    }


    /**
     * Sets the printWidth value for this SmartCredentialVariableRestrictions.
     * 
     * @param printWidth
     */
    public void setPrintWidth(wsdl.adminV8.ig.com.entrust.SmartCredentialVariablePrintWidth printWidth) {
        this.printWidth = printWidth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialVariableRestrictions)) return false;
        SmartCredentialVariableRestrictions other = (SmartCredentialVariableRestrictions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax()))) &&
            ((this.regex==null && other.getRegex()==null) || 
             (this.regex!=null &&
              this.regex.equals(other.getRegex()))) &&
            ((this.charSet==null && other.getCharSet()==null) || 
             (this.charSet!=null &&
              this.charSet.equals(other.getCharSet()))) &&
            ((this.rules==null && other.getRules()==null) || 
             (this.rules!=null &&
              this.rules.equals(other.getRules()))) &&
            ((this.printWidth==null && other.getPrintWidth()==null) || 
             (this.printWidth!=null &&
              this.printWidth.equals(other.getPrintWidth())));
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
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        if (getRegex() != null) {
            _hashCode += getRegex().hashCode();
        }
        if (getCharSet() != null) {
            _hashCode += getCharSet().hashCode();
        }
        if (getRules() != null) {
            _hashCode += getRules().hashCode();
        }
        if (getPrintWidth() != null) {
            _hashCode += getPrintWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialVariableRestrictions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableRestrictions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CharSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rules"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableRules"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariablePrintWidth"));
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
