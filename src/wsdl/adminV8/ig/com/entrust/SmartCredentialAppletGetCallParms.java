/**
 * SmartCredentialAppletGetCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialAppletGetCallParms  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean includeData;

    private java.lang.Boolean includeMasterKey;

    private java.lang.Boolean includeFileSettings;

    public SmartCredentialAppletGetCallParms() {
    }

    public SmartCredentialAppletGetCallParms(
           java.lang.String name,
           java.lang.Boolean includeData,
           java.lang.Boolean includeMasterKey,
           java.lang.Boolean includeFileSettings) {
           this.name = name;
           this.includeData = includeData;
           this.includeMasterKey = includeMasterKey;
           this.includeFileSettings = includeFileSettings;
    }


    /**
     * Gets the name value for this SmartCredentialAppletGetCallParms.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SmartCredentialAppletGetCallParms.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the includeData value for this SmartCredentialAppletGetCallParms.
     * 
     * @return includeData
     */
    public java.lang.Boolean getIncludeData() {
        return includeData;
    }


    /**
     * Sets the includeData value for this SmartCredentialAppletGetCallParms.
     * 
     * @param includeData
     */
    public void setIncludeData(java.lang.Boolean includeData) {
        this.includeData = includeData;
    }


    /**
     * Gets the includeMasterKey value for this SmartCredentialAppletGetCallParms.
     * 
     * @return includeMasterKey
     */
    public java.lang.Boolean getIncludeMasterKey() {
        return includeMasterKey;
    }


    /**
     * Sets the includeMasterKey value for this SmartCredentialAppletGetCallParms.
     * 
     * @param includeMasterKey
     */
    public void setIncludeMasterKey(java.lang.Boolean includeMasterKey) {
        this.includeMasterKey = includeMasterKey;
    }


    /**
     * Gets the includeFileSettings value for this SmartCredentialAppletGetCallParms.
     * 
     * @return includeFileSettings
     */
    public java.lang.Boolean getIncludeFileSettings() {
        return includeFileSettings;
    }


    /**
     * Sets the includeFileSettings value for this SmartCredentialAppletGetCallParms.
     * 
     * @param includeFileSettings
     */
    public void setIncludeFileSettings(java.lang.Boolean includeFileSettings) {
        this.includeFileSettings = includeFileSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialAppletGetCallParms)) return false;
        SmartCredentialAppletGetCallParms other = (SmartCredentialAppletGetCallParms) obj;
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
            ((this.includeData==null && other.getIncludeData()==null) || 
             (this.includeData!=null &&
              this.includeData.equals(other.getIncludeData()))) &&
            ((this.includeMasterKey==null && other.getIncludeMasterKey()==null) || 
             (this.includeMasterKey!=null &&
              this.includeMasterKey.equals(other.getIncludeMasterKey()))) &&
            ((this.includeFileSettings==null && other.getIncludeFileSettings()==null) || 
             (this.includeFileSettings!=null &&
              this.includeFileSettings.equals(other.getIncludeFileSettings())));
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
        if (getIncludeData() != null) {
            _hashCode += getIncludeData().hashCode();
        }
        if (getIncludeMasterKey() != null) {
            _hashCode += getIncludeMasterKey().hashCode();
        }
        if (getIncludeFileSettings() != null) {
            _hashCode += getIncludeFileSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialAppletGetCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialAppletGetCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeMasterKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeMasterKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeFileSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeFileSettings"));
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
