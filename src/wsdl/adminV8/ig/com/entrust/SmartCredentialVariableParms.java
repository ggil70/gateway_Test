/**
 * SmartCredentialVariableParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialVariableParms  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.Boolean removeRestrictions;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRestrictions restrictions;

    private java.lang.Boolean removeConversion;

    private java.lang.String conversion;

    private java.lang.Boolean removeOptions;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableOption[] options;

    private java.lang.Boolean removeDefaultValue;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableDefault defaultValue;

    private java.lang.Boolean required;

    private java.lang.Boolean removeGenerated;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableGenerated generated;

    private java.lang.Boolean displayable;

    private java.lang.Boolean modifiable;

    private java.lang.Boolean searchable;

    private java.lang.Boolean privateVariable;

    private java.lang.Boolean removeUnique;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableUnique unique;

    private java.lang.String keyType;

    private java.lang.String unblock;

    private java.lang.String category;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialVariableLocale[] locales;

    private java.lang.String before;

    public SmartCredentialVariableParms() {
    }

    public SmartCredentialVariableParms(
           java.lang.String type,
           java.lang.Boolean removeRestrictions,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRestrictions restrictions,
           java.lang.Boolean removeConversion,
           java.lang.String conversion,
           java.lang.Boolean removeOptions,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableOption[] options,
           java.lang.Boolean removeDefaultValue,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableDefault defaultValue,
           java.lang.Boolean required,
           java.lang.Boolean removeGenerated,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableGenerated generated,
           java.lang.Boolean displayable,
           java.lang.Boolean modifiable,
           java.lang.Boolean searchable,
           java.lang.Boolean privateVariable,
           java.lang.Boolean removeUnique,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableUnique unique,
           java.lang.String keyType,
           java.lang.String unblock,
           java.lang.String category,
           wsdl.adminV8.ig.com.entrust.SmartCredentialVariableLocale[] locales,
           java.lang.String before) {
           this.type = type;
           this.removeRestrictions = removeRestrictions;
           this.restrictions = restrictions;
           this.removeConversion = removeConversion;
           this.conversion = conversion;
           this.removeOptions = removeOptions;
           this.options = options;
           this.removeDefaultValue = removeDefaultValue;
           this.defaultValue = defaultValue;
           this.required = required;
           this.removeGenerated = removeGenerated;
           this.generated = generated;
           this.displayable = displayable;
           this.modifiable = modifiable;
           this.searchable = searchable;
           this.privateVariable = privateVariable;
           this.removeUnique = removeUnique;
           this.unique = unique;
           this.keyType = keyType;
           this.unblock = unblock;
           this.category = category;
           this.locales = locales;
           this.before = before;
    }


    /**
     * Gets the type value for this SmartCredentialVariableParms.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this SmartCredentialVariableParms.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the removeRestrictions value for this SmartCredentialVariableParms.
     * 
     * @return removeRestrictions
     */
    public java.lang.Boolean getRemoveRestrictions() {
        return removeRestrictions;
    }


    /**
     * Sets the removeRestrictions value for this SmartCredentialVariableParms.
     * 
     * @param removeRestrictions
     */
    public void setRemoveRestrictions(java.lang.Boolean removeRestrictions) {
        this.removeRestrictions = removeRestrictions;
    }


    /**
     * Gets the restrictions value for this SmartCredentialVariableParms.
     * 
     * @return restrictions
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRestrictions getRestrictions() {
        return restrictions;
    }


    /**
     * Sets the restrictions value for this SmartCredentialVariableParms.
     * 
     * @param restrictions
     */
    public void setRestrictions(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableRestrictions restrictions) {
        this.restrictions = restrictions;
    }


    /**
     * Gets the removeConversion value for this SmartCredentialVariableParms.
     * 
     * @return removeConversion
     */
    public java.lang.Boolean getRemoveConversion() {
        return removeConversion;
    }


    /**
     * Sets the removeConversion value for this SmartCredentialVariableParms.
     * 
     * @param removeConversion
     */
    public void setRemoveConversion(java.lang.Boolean removeConversion) {
        this.removeConversion = removeConversion;
    }


    /**
     * Gets the conversion value for this SmartCredentialVariableParms.
     * 
     * @return conversion
     */
    public java.lang.String getConversion() {
        return conversion;
    }


    /**
     * Sets the conversion value for this SmartCredentialVariableParms.
     * 
     * @param conversion
     */
    public void setConversion(java.lang.String conversion) {
        this.conversion = conversion;
    }


    /**
     * Gets the removeOptions value for this SmartCredentialVariableParms.
     * 
     * @return removeOptions
     */
    public java.lang.Boolean getRemoveOptions() {
        return removeOptions;
    }


    /**
     * Sets the removeOptions value for this SmartCredentialVariableParms.
     * 
     * @param removeOptions
     */
    public void setRemoveOptions(java.lang.Boolean removeOptions) {
        this.removeOptions = removeOptions;
    }


    /**
     * Gets the options value for this SmartCredentialVariableParms.
     * 
     * @return options
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableOption[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this SmartCredentialVariableParms.
     * 
     * @param options
     */
    public void setOptions(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableOption[] options) {
        this.options = options;
    }


    /**
     * Gets the removeDefaultValue value for this SmartCredentialVariableParms.
     * 
     * @return removeDefaultValue
     */
    public java.lang.Boolean getRemoveDefaultValue() {
        return removeDefaultValue;
    }


    /**
     * Sets the removeDefaultValue value for this SmartCredentialVariableParms.
     * 
     * @param removeDefaultValue
     */
    public void setRemoveDefaultValue(java.lang.Boolean removeDefaultValue) {
        this.removeDefaultValue = removeDefaultValue;
    }


    /**
     * Gets the defaultValue value for this SmartCredentialVariableParms.
     * 
     * @return defaultValue
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableDefault getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this SmartCredentialVariableParms.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableDefault defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the required value for this SmartCredentialVariableParms.
     * 
     * @return required
     */
    public java.lang.Boolean getRequired() {
        return required;
    }


    /**
     * Sets the required value for this SmartCredentialVariableParms.
     * 
     * @param required
     */
    public void setRequired(java.lang.Boolean required) {
        this.required = required;
    }


    /**
     * Gets the removeGenerated value for this SmartCredentialVariableParms.
     * 
     * @return removeGenerated
     */
    public java.lang.Boolean getRemoveGenerated() {
        return removeGenerated;
    }


    /**
     * Sets the removeGenerated value for this SmartCredentialVariableParms.
     * 
     * @param removeGenerated
     */
    public void setRemoveGenerated(java.lang.Boolean removeGenerated) {
        this.removeGenerated = removeGenerated;
    }


    /**
     * Gets the generated value for this SmartCredentialVariableParms.
     * 
     * @return generated
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableGenerated getGenerated() {
        return generated;
    }


    /**
     * Sets the generated value for this SmartCredentialVariableParms.
     * 
     * @param generated
     */
    public void setGenerated(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableGenerated generated) {
        this.generated = generated;
    }


    /**
     * Gets the displayable value for this SmartCredentialVariableParms.
     * 
     * @return displayable
     */
    public java.lang.Boolean getDisplayable() {
        return displayable;
    }


    /**
     * Sets the displayable value for this SmartCredentialVariableParms.
     * 
     * @param displayable
     */
    public void setDisplayable(java.lang.Boolean displayable) {
        this.displayable = displayable;
    }


    /**
     * Gets the modifiable value for this SmartCredentialVariableParms.
     * 
     * @return modifiable
     */
    public java.lang.Boolean getModifiable() {
        return modifiable;
    }


    /**
     * Sets the modifiable value for this SmartCredentialVariableParms.
     * 
     * @param modifiable
     */
    public void setModifiable(java.lang.Boolean modifiable) {
        this.modifiable = modifiable;
    }


    /**
     * Gets the searchable value for this SmartCredentialVariableParms.
     * 
     * @return searchable
     */
    public java.lang.Boolean getSearchable() {
        return searchable;
    }


    /**
     * Sets the searchable value for this SmartCredentialVariableParms.
     * 
     * @param searchable
     */
    public void setSearchable(java.lang.Boolean searchable) {
        this.searchable = searchable;
    }


    /**
     * Gets the privateVariable value for this SmartCredentialVariableParms.
     * 
     * @return privateVariable
     */
    public java.lang.Boolean getPrivateVariable() {
        return privateVariable;
    }


    /**
     * Sets the privateVariable value for this SmartCredentialVariableParms.
     * 
     * @param privateVariable
     */
    public void setPrivateVariable(java.lang.Boolean privateVariable) {
        this.privateVariable = privateVariable;
    }


    /**
     * Gets the removeUnique value for this SmartCredentialVariableParms.
     * 
     * @return removeUnique
     */
    public java.lang.Boolean getRemoveUnique() {
        return removeUnique;
    }


    /**
     * Sets the removeUnique value for this SmartCredentialVariableParms.
     * 
     * @param removeUnique
     */
    public void setRemoveUnique(java.lang.Boolean removeUnique) {
        this.removeUnique = removeUnique;
    }


    /**
     * Gets the unique value for this SmartCredentialVariableParms.
     * 
     * @return unique
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableUnique getUnique() {
        return unique;
    }


    /**
     * Sets the unique value for this SmartCredentialVariableParms.
     * 
     * @param unique
     */
    public void setUnique(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableUnique unique) {
        this.unique = unique;
    }


    /**
     * Gets the keyType value for this SmartCredentialVariableParms.
     * 
     * @return keyType
     */
    public java.lang.String getKeyType() {
        return keyType;
    }


    /**
     * Sets the keyType value for this SmartCredentialVariableParms.
     * 
     * @param keyType
     */
    public void setKeyType(java.lang.String keyType) {
        this.keyType = keyType;
    }


    /**
     * Gets the unblock value for this SmartCredentialVariableParms.
     * 
     * @return unblock
     */
    public java.lang.String getUnblock() {
        return unblock;
    }


    /**
     * Sets the unblock value for this SmartCredentialVariableParms.
     * 
     * @param unblock
     */
    public void setUnblock(java.lang.String unblock) {
        this.unblock = unblock;
    }


    /**
     * Gets the category value for this SmartCredentialVariableParms.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SmartCredentialVariableParms.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the locales value for this SmartCredentialVariableParms.
     * 
     * @return locales
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialVariableLocale[] getLocales() {
        return locales;
    }


    /**
     * Sets the locales value for this SmartCredentialVariableParms.
     * 
     * @param locales
     */
    public void setLocales(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableLocale[] locales) {
        this.locales = locales;
    }


    /**
     * Gets the before value for this SmartCredentialVariableParms.
     * 
     * @return before
     */
    public java.lang.String getBefore() {
        return before;
    }


    /**
     * Sets the before value for this SmartCredentialVariableParms.
     * 
     * @param before
     */
    public void setBefore(java.lang.String before) {
        this.before = before;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialVariableParms)) return false;
        SmartCredentialVariableParms other = (SmartCredentialVariableParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.removeRestrictions==null && other.getRemoveRestrictions()==null) || 
             (this.removeRestrictions!=null &&
              this.removeRestrictions.equals(other.getRemoveRestrictions()))) &&
            ((this.restrictions==null && other.getRestrictions()==null) || 
             (this.restrictions!=null &&
              this.restrictions.equals(other.getRestrictions()))) &&
            ((this.removeConversion==null && other.getRemoveConversion()==null) || 
             (this.removeConversion!=null &&
              this.removeConversion.equals(other.getRemoveConversion()))) &&
            ((this.conversion==null && other.getConversion()==null) || 
             (this.conversion!=null &&
              this.conversion.equals(other.getConversion()))) &&
            ((this.removeOptions==null && other.getRemoveOptions()==null) || 
             (this.removeOptions!=null &&
              this.removeOptions.equals(other.getRemoveOptions()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.removeDefaultValue==null && other.getRemoveDefaultValue()==null) || 
             (this.removeDefaultValue!=null &&
              this.removeDefaultValue.equals(other.getRemoveDefaultValue()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            ((this.removeGenerated==null && other.getRemoveGenerated()==null) || 
             (this.removeGenerated!=null &&
              this.removeGenerated.equals(other.getRemoveGenerated()))) &&
            ((this.generated==null && other.getGenerated()==null) || 
             (this.generated!=null &&
              this.generated.equals(other.getGenerated()))) &&
            ((this.displayable==null && other.getDisplayable()==null) || 
             (this.displayable!=null &&
              this.displayable.equals(other.getDisplayable()))) &&
            ((this.modifiable==null && other.getModifiable()==null) || 
             (this.modifiable!=null &&
              this.modifiable.equals(other.getModifiable()))) &&
            ((this.searchable==null && other.getSearchable()==null) || 
             (this.searchable!=null &&
              this.searchable.equals(other.getSearchable()))) &&
            ((this.privateVariable==null && other.getPrivateVariable()==null) || 
             (this.privateVariable!=null &&
              this.privateVariable.equals(other.getPrivateVariable()))) &&
            ((this.removeUnique==null && other.getRemoveUnique()==null) || 
             (this.removeUnique!=null &&
              this.removeUnique.equals(other.getRemoveUnique()))) &&
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
              java.util.Arrays.equals(this.locales, other.getLocales()))) &&
            ((this.before==null && other.getBefore()==null) || 
             (this.before!=null &&
              this.before.equals(other.getBefore())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRemoveRestrictions() != null) {
            _hashCode += getRemoveRestrictions().hashCode();
        }
        if (getRestrictions() != null) {
            _hashCode += getRestrictions().hashCode();
        }
        if (getRemoveConversion() != null) {
            _hashCode += getRemoveConversion().hashCode();
        }
        if (getConversion() != null) {
            _hashCode += getConversion().hashCode();
        }
        if (getRemoveOptions() != null) {
            _hashCode += getRemoveOptions().hashCode();
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
        if (getRemoveDefaultValue() != null) {
            _hashCode += getRemoveDefaultValue().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        if (getRemoveGenerated() != null) {
            _hashCode += getRemoveGenerated().hashCode();
        }
        if (getGenerated() != null) {
            _hashCode += getGenerated().hashCode();
        }
        if (getDisplayable() != null) {
            _hashCode += getDisplayable().hashCode();
        }
        if (getModifiable() != null) {
            _hashCode += getModifiable().hashCode();
        }
        if (getSearchable() != null) {
            _hashCode += getSearchable().hashCode();
        }
        if (getPrivateVariable() != null) {
            _hashCode += getPrivateVariable().hashCode();
        }
        if (getRemoveUnique() != null) {
            _hashCode += getRemoveUnique().hashCode();
        }
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
        if (getBefore() != null) {
            _hashCode += getBefore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialVariableParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeRestrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeRestrictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restrictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableRestrictions"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("removeDefaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeDefaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeGenerated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeGenerated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateVariable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateVariable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeUnique");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeUnique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locales"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialVariableLocale"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("before");
        elemField.setXmlName(new javax.xml.namespace.QName("", "before"));
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
