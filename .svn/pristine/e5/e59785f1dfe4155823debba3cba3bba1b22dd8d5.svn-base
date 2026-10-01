/**
 * SmartCredentialVariableUnique.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialVariableUnique  implements java.io.Serializable {
    private boolean value;

    private java.lang.String scope;

    private java.lang.String variable;

    public SmartCredentialVariableUnique() {
    }

    public SmartCredentialVariableUnique(
           boolean value,
           java.lang.String scope,
           java.lang.String variable) {
           this.value = value;
           this.scope = scope;
           this.variable = variable;
    }


    /**
     * Gets the value value for this SmartCredentialVariableUnique.
     * 
     * @return value
     */
    public boolean isValue() {
        return value;
    }


    /**
     * Sets the value value for this SmartCredentialVariableUnique.
     * 
     * @param value
     */
    public void setValue(boolean value) {
        this.value = value;
    }


    /**
     * Gets the scope value for this SmartCredentialVariableUnique.
     * 
     * @return scope
     */
    public java.lang.String getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this SmartCredentialVariableUnique.
     * 
     * @param scope
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }


    /**
     * Gets the variable value for this SmartCredentialVariableUnique.
     * 
     * @return variable
     */
    public java.lang.String getVariable() {
        return variable;
    }


    /**
     * Sets the variable value for this SmartCredentialVariableUnique.
     * 
     * @param variable
     */
    public void setVariable(java.lang.String variable) {
        this.variable = variable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialVariableUnique)) return false;
        SmartCredentialVariableUnique other = (SmartCredentialVariableUnique) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.value == other.isValue() &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.variable==null && other.getVariable()==null) || 
             (this.variable!=null &&
              this.variable.equals(other.getVariable())));
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
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getVariable() != null) {
            _hashCode += getVariable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialVariableUnique.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableUnique"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variable"));
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
