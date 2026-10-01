/**
 * SmartCredentialVariableInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialVariableInfo  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String type;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRestrictions restrictions;

    private java.lang.String conversion;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableOption[] options;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableDefault defaultValue;

    private boolean required;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableGenerated generated;

    private boolean displayable;

    private boolean modifiable;

    private boolean searchable;

    private boolean privateValue;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableUnique unique;

    private java.lang.String keyType;

    private java.lang.String unblock;

    private java.lang.String category;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableLocale[] locales;

    public SmartCredentialVariableInfo() {
    }

    public SmartCredentialVariableInfo(
           java.lang.String name,
           java.lang.String type,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRestrictions restrictions,
           java.lang.String conversion,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableOption[] options,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableDefault defaultValue,
           boolean required,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableGenerated generated,
           boolean displayable,
           boolean modifiable,
           boolean searchable,
           boolean privateValue,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableUnique unique,
           java.lang.String keyType,
           java.lang.String unblock,
           java.lang.String category,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableLocale[] locales) {
           this.name = name;
           this.type = type;
           this.restrictions = restrictions;
           this.conversion = conversion;
           this.options = options;
           this.defaultValue = defaultValue;
           this.required = required;
           this.generated = generated;
           this.displayable = displayable;
           this.modifiable = modifiable;
           this.searchable = searchable;
           this.privateValue = privateValue;
           this.unique = unique;
           this.keyType = keyType;
           this.unblock = unblock;
           this.category = category;
           this.locales = locales;
    }


    /**
     * Gets the name value for this SmartCredentialVariableInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SmartCredentialVariableInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this SmartCredentialVariableInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this SmartCredentialVariableInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the restrictions value for this SmartCredentialVariableInfo.
     * 
     * @return restrictions
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRestrictions getRestrictions() {
        return restrictions;
    }


    /**
     * Sets the restrictions value for this SmartCredentialVariableInfo.
     * 
     * @param restrictions
     */
    public void setRestrictions(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRestrictions restrictions) {
        this.restrictions = restrictions;
    }


    /**
     * Gets the conversion value for this SmartCredentialVariableInfo.
     * 
     * @return conversion
     */
    public java.lang.String getConversion() {
        return conversion;
    }


    /**
     * Sets the conversion value for this SmartCredentialVariableInfo.
     * 
     * @param conversion
     */
    public void setConversion(java.lang.String conversion) {
        this.conversion = conversion;
    }


    /**
     * Gets the options value for this SmartCredentialVariableInfo.
     * 
     * @return options
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableOption[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this SmartCredentialVariableInfo.
     * 
     * @param options
     */
    public void setOptions(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableOption[] options) {
        this.options = options;
    }


    /**
     * Gets the defaultValue value for this SmartCredentialVariableInfo.
     * 
     * @return defaultValue
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableDefault getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this SmartCredentialVariableInfo.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableDefault defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the required value for this SmartCredentialVariableInfo.
     * 
     * @return required
     */
    public boolean isRequired() {
        return required;
    }


    /**
     * Sets the required value for this SmartCredentialVariableInfo.
     * 
     * @param required
     */
    public void setRequired(boolean required) {
        this.required = required;
    }


    /**
     * Gets the generated value for this SmartCredentialVariableInfo.
     * 
     * @return generated
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableGenerated getGenerated() {
        return generated;
    }


    /**
     * Sets the generated value for this SmartCredentialVariableInfo.
     * 
     * @param generated
     */
    public void setGenerated(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableGenerated generated) {
        this.generated = generated;
    }


    /**
     * Gets the displayable value for this SmartCredentialVariableInfo.
     * 
     * @return displayable
     */
    public boolean isDisplayable() {
        return displayable;
    }


    /**
     * Sets the displayable value for this SmartCredentialVariableInfo.
     * 
     * @param displayable
     */
    public void setDisplayable(boolean displayable) {
        this.displayable = displayable;
    }


    /**
     * Gets the modifiable value for this SmartCredentialVariableInfo.
     * 
     * @return modifiable
     */
    public boolean isModifiable() {
        return modifiable;
    }


    /**
     * Sets the modifiable value for this SmartCredentialVariableInfo.
     * 
     * @param modifiable
     */
    public void setModifiable(boolean modifiable) {
        this.modifiable = modifiable;
    }


    /**
     * Gets the searchable value for this SmartCredentialVariableInfo.
     * 
     * @return searchable
     */
    public boolean isSearchable() {
        return searchable;
    }


    /**
     * Sets the searchable value for this SmartCredentialVariableInfo.
     * 
     * @param searchable
     */
    public void setSearchable(boolean searchable) {
        this.searchable = searchable;
    }


    /**
     * Gets the privateValue value for this SmartCredentialVariableInfo.
     * 
     * @return privateValue
     */
    public boolean isPrivateValue() {
        return privateValue;
    }


    /**
     * Sets the privateValue value for this SmartCredentialVariableInfo.
     * 
     * @param privateValue
     */
    public void setPrivateValue(boolean privateValue) {
        this.privateValue = privateValue;
    }


    /**
     * Gets the unique value for this SmartCredentialVariableInfo.
     * 
     * @return unique
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableUnique getUnique() {
        return unique;
    }


    /**
     * Sets the unique value for this SmartCredentialVariableInfo.
     * 
     * @param unique
     */
    public void setUnique(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableUnique unique) {
        this.unique = unique;
    }


    /**
     * Gets the keyType value for this SmartCredentialVariableInfo.
     * 
     * @return keyType
     */
    public java.lang.String getKeyType() {
        return keyType;
    }


    /**
     * Sets the keyType value for this SmartCredentialVariableInfo.
     * 
     * @param keyType
     */
    public void setKeyType(java.lang.String keyType) {
        this.keyType = keyType;
    }


    /**
     * Gets the unblock value for this SmartCredentialVariableInfo.
     * 
     * @return unblock
     */
    public java.lang.String getUnblock() {
        return unblock;
    }


    /**
     * Sets the unblock value for this SmartCredentialVariableInfo.
     * 
     * @param unblock
     */
    public void setUnblock(java.lang.String unblock) {
        this.unblock = unblock;
    }


    /**
     * Gets the category value for this SmartCredentialVariableInfo.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SmartCredentialVariableInfo.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the locales value for this SmartCredentialVariableInfo.
     * 
     * @return locales
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableLocale[] getLocales() {
        return locales;
    }


    /**
     * Sets the locales value for this SmartCredentialVariableInfo.
     * 
     * @param locales
     */
    public void setLocales(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableLocale[] locales) {
        this.locales = locales;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialVariableInfo)) return false;
        SmartCredentialVariableInfo other = (SmartCredentialVariableInfo) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.restrictions==null && other.getRestrictions()==null) || 
             (this.restrictions!=null &&
              this.restrictions.equals(other.getRestrictions()))) &&
            ((this.conversion==null && other.getConversion()==null) || 
             (this.conversion!=null &&
              this.conversion.equals(other.getConversion()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            this.required == other.isRequired() &&
            ((this.generated==null && other.getGenerated()==null) || 
             (this.generated!=null &&
              this.generated.equals(other.getGenerated()))) &&
            this.displayable == other.isDisplayable() &&
            this.modifiable == other.isModifiable() &&
            this.searchable == other.isSearchable() &&
            this.privateValue == other.isPrivateValue() &&
            ((this.unique==null && other.getUnique()==null) || 
             (this.unique!=null &&
              this.unique.equals(other.getUnique()))) &&
            ((this.keyType==null && other.getKeyType()==null) || 
             (this.keyType!=null &&
              this.keyType.equals(other.getKeyType()))) &&
            ((this.unblock==null && other.getUnblock()==null) || 
             (this.unblock!=null &&
              this.unblock.equals(other.getUnblock()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.locales==null && other.getLocales()==null) || 
             (this.locales!=null &&
              java.util.Arrays.equals(this.locales, other.getLocales())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRestrictions() != null) {
            _hashCode += getRestrictions().hashCode();
        }
        if (getConversion() != null) {
            _hashCode += getConversion().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        _hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getGenerated() != null) {
            _hashCode += getGenerated().hashCode();
        }
        _hashCode += (isDisplayable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModifiable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSearchable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPrivateValue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUnique() != null) {
            _hashCode += getUnique().hashCode();
        }
        if (getKeyType() != null) {
            _hashCode += getKeyType().hashCode();
        }
        if (getUnblock() != null) {
            _hashCode += getUnblock().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getLocales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocales(), i);
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
        new org.apache.axis.description.TypeDesc(SmartCredentialVariableInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restrictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableRestrictions"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableOption"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableDefault"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableGenerated"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unique"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableUnique"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KeyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unblock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unblock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locales"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableLocale"));
        elemField.setNillable(true);
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
