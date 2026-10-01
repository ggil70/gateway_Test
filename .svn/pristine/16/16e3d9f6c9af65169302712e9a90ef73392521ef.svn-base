/**
 * SmartCredentialVariableCreateCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialVariableCreateCallParms  implements java.io.Serializable {
    private java.lang.String definition;

    private java.lang.String variable;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableParms parms;

    public SmartCredentialVariableCreateCallParms() {
    }

    public SmartCredentialVariableCreateCallParms(
           java.lang.String definition,
           java.lang.String variable,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableParms parms) {
           this.definition = definition;
           this.variable = variable;
           this.parms = parms;
    }


    /**
     * Gets the definition value for this SmartCredentialVariableCreateCallParms.
     * 
     * @return definition
     */
    public java.lang.String getDefinition() {
        return definition;
    }


    /**
     * Sets the definition value for this SmartCredentialVariableCreateCallParms.
     * 
     * @param definition
     */
    public void setDefinition(java.lang.String definition) {
        this.definition = definition;
    }


    /**
     * Gets the variable value for this SmartCredentialVariableCreateCallParms.
     * 
     * @return variable
     */
    public java.lang.String getVariable() {
        return variable;
    }


    /**
     * Sets the variable value for this SmartCredentialVariableCreateCallParms.
     * 
     * @param variable
     */
    public void setVariable(java.lang.String variable) {
        this.variable = variable;
    }


    /**
     * Gets the parms value for this SmartCredentialVariableCreateCallParms.
     * 
     * @return parms
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableParms getParms() {
        return parms;
    }


    /**
     * Sets the parms value for this SmartCredentialVariableCreateCallParms.
     * 
     * @param parms
     */
    public void setParms(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableParms parms) {
        this.parms = parms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialVariableCreateCallParms)) return false;
        SmartCredentialVariableCreateCallParms other = (SmartCredentialVariableCreateCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.definition==null && other.getDefinition()==null) || 
             (this.definition!=null &&
              this.definition.equals(other.getDefinition()))) &&
            ((this.variable==null && other.getVariable()==null) || 
             (this.variable!=null &&
              this.variable.equals(other.getVariable()))) &&
            ((this.parms==null && other.getParms()==null) || 
             (this.parms!=null &&
              this.parms.equals(other.getParms())));
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
        if (getDefinition() != null) {
            _hashCode += getDefinition().hashCode();
        }
        if (getVariable() != null) {
            _hashCode += getVariable().hashCode();
        }
        if (getParms() != null) {
            _hashCode += getParms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialVariableCreateCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableCreateCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableParms"));
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
