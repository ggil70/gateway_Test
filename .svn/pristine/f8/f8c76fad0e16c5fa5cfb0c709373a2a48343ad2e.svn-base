/**
 * SmartCredentialDefinitionGetCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialDefinitionGetCallParms  implements java.io.Serializable {
    private java.lang.String name;

    private boolean getXML;

    private boolean getVariables;

    public SmartCredentialDefinitionGetCallParms() {
    }

    public SmartCredentialDefinitionGetCallParms(
           java.lang.String name,
           boolean getXML,
           boolean getVariables) {
           this.name = name;
           this.getXML = getXML;
           this.getVariables = getVariables;
    }


    /**
     * Gets the name value for this SmartCredentialDefinitionGetCallParms.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SmartCredentialDefinitionGetCallParms.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the getXML value for this SmartCredentialDefinitionGetCallParms.
     * 
     * @return getXML
     */
    public boolean isGetXML() {
        return getXML;
    }


    /**
     * Sets the getXML value for this SmartCredentialDefinitionGetCallParms.
     * 
     * @param getXML
     */
    public void setGetXML(boolean getXML) {
        this.getXML = getXML;
    }


    /**
     * Gets the getVariables value for this SmartCredentialDefinitionGetCallParms.
     * 
     * @return getVariables
     */
    public boolean isGetVariables() {
        return getVariables;
    }


    /**
     * Sets the getVariables value for this SmartCredentialDefinitionGetCallParms.
     * 
     * @param getVariables
     */
    public void setGetVariables(boolean getVariables) {
        this.getVariables = getVariables;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialDefinitionGetCallParms)) return false;
        SmartCredentialDefinitionGetCallParms other = (SmartCredentialDefinitionGetCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.getXML == other.isGetXML() &&
            this.getVariables == other.isGetVariables();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isGetXML() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGetVariables() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialDefinitionGetCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialDefinitionGetCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getXML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getVariables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getVariables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
