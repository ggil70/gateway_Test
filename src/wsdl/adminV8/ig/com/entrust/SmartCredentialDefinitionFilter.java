/**
 * SmartCredentialDefinitionFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialDefinitionFilter  implements java.io.Serializable {
    private java.lang.String group;

    private java.lang.Boolean getXML;

    private java.lang.Boolean getVariables;

    public SmartCredentialDefinitionFilter() {
    }

    public SmartCredentialDefinitionFilter(
           java.lang.String group,
           java.lang.Boolean getXML,
           java.lang.Boolean getVariables) {
           this.group = group;
           this.getXML = getXML;
           this.getVariables = getVariables;
    }


    /**
     * Gets the group value for this SmartCredentialDefinitionFilter.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this SmartCredentialDefinitionFilter.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the getXML value for this SmartCredentialDefinitionFilter.
     * 
     * @return getXML
     */
    public java.lang.Boolean getGetXML() {
        return getXML;
    }


    /**
     * Sets the getXML value for this SmartCredentialDefinitionFilter.
     * 
     * @param getXML
     */
    public void setGetXML(java.lang.Boolean getXML) {
        this.getXML = getXML;
    }


    /**
     * Gets the getVariables value for this SmartCredentialDefinitionFilter.
     * 
     * @return getVariables
     */
    public java.lang.Boolean getGetVariables() {
        return getVariables;
    }


    /**
     * Sets the getVariables value for this SmartCredentialDefinitionFilter.
     * 
     * @param getVariables
     */
    public void setGetVariables(java.lang.Boolean getVariables) {
        this.getVariables = getVariables;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialDefinitionFilter)) return false;
        SmartCredentialDefinitionFilter other = (SmartCredentialDefinitionFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.getXML==null && other.getGetXML()==null) || 
             (this.getXML!=null &&
              this.getXML.equals(other.getGetXML()))) &&
            ((this.getVariables==null && other.getGetVariables()==null) || 
             (this.getVariables!=null &&
              this.getVariables.equals(other.getGetVariables())));
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
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getGetXML() != null) {
            _hashCode += getGetXML().hashCode();
        }
        if (getGetVariables() != null) {
            _hashCode += getGetVariables().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialDefinitionFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialDefinitionFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getXML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getVariables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getVariables"));
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
