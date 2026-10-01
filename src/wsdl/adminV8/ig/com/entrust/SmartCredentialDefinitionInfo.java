/**
 * SmartCredentialDefinitionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialDefinitionInfo  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String valueDefinition;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialLocaleInfo[] variableLocales;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableInfo[] variables;

    private java.lang.Boolean approvalRequired;

    private java.lang.String layout;

    private java.lang.String[] applets;

    private java.lang.String[] PACS;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialDeliveryInfo[] allowedDeliveries;

    private java.lang.String description;

    private java.lang.String[] rolesGrantingAccess;

    public SmartCredentialDefinitionInfo() {
    }

    public SmartCredentialDefinitionInfo(
           java.lang.String name,
           java.lang.String valueDefinition,
           wsdl.adminV8.ig.com.entrust.SmartCredentialLocaleInfo[] variableLocales,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableInfo[] variables,
           java.lang.Boolean approvalRequired,
           java.lang.String layout,
           java.lang.String[] applets,
           java.lang.String[] PACS,
           wsdl.adminV8.ig.com.entrust.SmartCredentialDeliveryInfo[] allowedDeliveries,
           java.lang.String description,
           java.lang.String[] rolesGrantingAccess) {
           this.name = name;
           this.valueDefinition = valueDefinition;
           this.variableLocales = variableLocales;
           this.variables = variables;
           this.approvalRequired = approvalRequired;
           this.layout = layout;
           this.applets = applets;
           this.PACS = PACS;
           this.allowedDeliveries = allowedDeliveries;
           this.description = description;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the name value for this SmartCredentialDefinitionInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SmartCredentialDefinitionInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the valueDefinition value for this SmartCredentialDefinitionInfo.
     * 
     * @return valueDefinition
     */
    public java.lang.String getValueDefinition() {
        return valueDefinition;
    }


    /**
     * Sets the valueDefinition value for this SmartCredentialDefinitionInfo.
     * 
     * @param valueDefinition
     */
    public void setValueDefinition(java.lang.String valueDefinition) {
        this.valueDefinition = valueDefinition;
    }


    /**
     * Gets the variableLocales value for this SmartCredentialDefinitionInfo.
     * 
     * @return variableLocales
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialLocaleInfo[] getVariableLocales() {
        return variableLocales;
    }


    /**
     * Sets the variableLocales value for this SmartCredentialDefinitionInfo.
     * 
     * @param variableLocales
     */
    public void setVariableLocales(wsdl.adminV8.ig.com.entrust.SmartCredentialLocaleInfo[] variableLocales) {
        this.variableLocales = variableLocales;
    }


    /**
     * Gets the variables value for this SmartCredentialDefinitionInfo.
     * 
     * @return variables
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableInfo[] getVariables() {
        return variables;
    }


    /**
     * Sets the variables value for this SmartCredentialDefinitionInfo.
     * 
     * @param variables
     */
    public void setVariables(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableInfo[] variables) {
        this.variables = variables;
    }


    /**
     * Gets the approvalRequired value for this SmartCredentialDefinitionInfo.
     * 
     * @return approvalRequired
     */
    public java.lang.Boolean getApprovalRequired() {
        return approvalRequired;
    }


    /**
     * Sets the approvalRequired value for this SmartCredentialDefinitionInfo.
     * 
     * @param approvalRequired
     */
    public void setApprovalRequired(java.lang.Boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
    }


    /**
     * Gets the layout value for this SmartCredentialDefinitionInfo.
     * 
     * @return layout
     */
    public java.lang.String getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this SmartCredentialDefinitionInfo.
     * 
     * @param layout
     */
    public void setLayout(java.lang.String layout) {
        this.layout = layout;
    }


    /**
     * Gets the applets value for this SmartCredentialDefinitionInfo.
     * 
     * @return applets
     */
    public java.lang.String[] getApplets() {
        return applets;
    }


    /**
     * Sets the applets value for this SmartCredentialDefinitionInfo.
     * 
     * @param applets
     */
    public void setApplets(java.lang.String[] applets) {
        this.applets = applets;
    }


    /**
     * Gets the PACS value for this SmartCredentialDefinitionInfo.
     * 
     * @return PACS
     */
    public java.lang.String[] getPACS() {
        return PACS;
    }


    /**
     * Sets the PACS value for this SmartCredentialDefinitionInfo.
     * 
     * @param PACS
     */
    public void setPACS(java.lang.String[] PACS) {
        this.PACS = PACS;
    }


    /**
     * Gets the allowedDeliveries value for this SmartCredentialDefinitionInfo.
     * 
     * @return allowedDeliveries
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialDeliveryInfo[] getAllowedDeliveries() {
        return allowedDeliveries;
    }


    /**
     * Sets the allowedDeliveries value for this SmartCredentialDefinitionInfo.
     * 
     * @param allowedDeliveries
     */
    public void setAllowedDeliveries(wsdl.adminV8.ig.com.entrust.SmartCredentialDeliveryInfo[] allowedDeliveries) {
        this.allowedDeliveries = allowedDeliveries;
    }


    /**
     * Gets the description value for this SmartCredentialDefinitionInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SmartCredentialDefinitionInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the rolesGrantingAccess value for this SmartCredentialDefinitionInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this SmartCredentialDefinitionInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialDefinitionInfo)) return false;
        SmartCredentialDefinitionInfo other = (SmartCredentialDefinitionInfo) obj;
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
            ((this.valueDefinition==null && other.getValueDefinition()==null) || 
             (this.valueDefinition!=null &&
              this.valueDefinition.equals(other.getValueDefinition()))) &&
            ((this.variableLocales==null && other.getVariableLocales()==null) || 
             (this.variableLocales!=null &&
              java.util.Arrays.equals(this.variableLocales, other.getVariableLocales()))) &&
            ((this.variables==null && other.getVariables()==null) || 
             (this.variables!=null &&
              java.util.Arrays.equals(this.variables, other.getVariables()))) &&
            ((this.approvalRequired==null && other.getApprovalRequired()==null) || 
             (this.approvalRequired!=null &&
              this.approvalRequired.equals(other.getApprovalRequired()))) &&
            ((this.layout==null && other.getLayout()==null) || 
             (this.layout!=null &&
              this.layout.equals(other.getLayout()))) &&
            ((this.applets==null && other.getApplets()==null) || 
             (this.applets!=null &&
              java.util.Arrays.equals(this.applets, other.getApplets()))) &&
            ((this.PACS==null && other.getPACS()==null) || 
             (this.PACS!=null &&
              java.util.Arrays.equals(this.PACS, other.getPACS()))) &&
            ((this.allowedDeliveries==null && other.getAllowedDeliveries()==null) || 
             (this.allowedDeliveries!=null &&
              java.util.Arrays.equals(this.allowedDeliveries, other.getAllowedDeliveries()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.rolesGrantingAccess==null && other.getRolesGrantingAccess()==null) || 
             (this.rolesGrantingAccess!=null &&
              java.util.Arrays.equals(this.rolesGrantingAccess, other.getRolesGrantingAccess())));
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
        if (getValueDefinition() != null) {
            _hashCode += getValueDefinition().hashCode();
        }
        if (getVariableLocales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariableLocales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariableLocales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApprovalRequired() != null) {
            _hashCode += getApprovalRequired().hashCode();
        }
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        if (getApplets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPACS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPACS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPACS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowedDeliveries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedDeliveries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedDeliveries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRolesGrantingAccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRolesGrantingAccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRolesGrantingAccess(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialDefinitionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialDefinitionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableLocales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variableLocales"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialLocaleInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variables"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApprovalRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Applets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PACS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PACS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedDeliveries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowedDeliveries"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialDeliveryInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesGrantingAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rolesGrantingAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
