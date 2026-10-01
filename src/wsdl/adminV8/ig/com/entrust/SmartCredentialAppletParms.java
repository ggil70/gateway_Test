/**
 * SmartCredentialAppletParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialAppletParms  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String type;

    private byte[] data;

    private byte[] masterKey;

    private java.lang.String masterKeyPassword;

    private java.lang.String masterKeyType;

    private java.lang.Boolean addConfigSettings;

    private commonV8.ig.com.entrust.NameValue[] configSettings;

    private java.lang.String[] removeConfigSettings;

    private java.lang.Boolean addFileSettings;

    private wsdl.adminV8.ig.com.entrust.FileSetting[] fileSettings;

    private java.lang.String[] removeFileSettings;

    private java.lang.String description;

    public SmartCredentialAppletParms() {
    }

    public SmartCredentialAppletParms(
           java.lang.String name,
           java.lang.String type,
           byte[] data,
           byte[] masterKey,
           java.lang.String masterKeyPassword,
           java.lang.String masterKeyType,
           java.lang.Boolean addConfigSettings,
           commonV8.ig.com.entrust.NameValue[] configSettings,
           java.lang.String[] removeConfigSettings,
           java.lang.Boolean addFileSettings,
           wsdl.adminV8.ig.com.entrust.FileSetting[] fileSettings,
           java.lang.String[] removeFileSettings,
           java.lang.String description) {
           this.name = name;
           this.type = type;
           this.data = data;
           this.masterKey = masterKey;
           this.masterKeyPassword = masterKeyPassword;
           this.masterKeyType = masterKeyType;
           this.addConfigSettings = addConfigSettings;
           this.configSettings = configSettings;
           this.removeConfigSettings = removeConfigSettings;
           this.addFileSettings = addFileSettings;
           this.fileSettings = fileSettings;
           this.removeFileSettings = removeFileSettings;
           this.description = description;
    }


    /**
     * Gets the name value for this SmartCredentialAppletParms.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SmartCredentialAppletParms.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this SmartCredentialAppletParms.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this SmartCredentialAppletParms.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the data value for this SmartCredentialAppletParms.
     * 
     * @return data
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this SmartCredentialAppletParms.
     * 
     * @param data
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Gets the masterKey value for this SmartCredentialAppletParms.
     * 
     * @return masterKey
     */
    public byte[] getMasterKey() {
        return masterKey;
    }


    /**
     * Sets the masterKey value for this SmartCredentialAppletParms.
     * 
     * @param masterKey
     */
    public void setMasterKey(byte[] masterKey) {
        this.masterKey = masterKey;
    }


    /**
     * Gets the masterKeyPassword value for this SmartCredentialAppletParms.
     * 
     * @return masterKeyPassword
     */
    public java.lang.String getMasterKeyPassword() {
        return masterKeyPassword;
    }


    /**
     * Sets the masterKeyPassword value for this SmartCredentialAppletParms.
     * 
     * @param masterKeyPassword
     */
    public void setMasterKeyPassword(java.lang.String masterKeyPassword) {
        this.masterKeyPassword = masterKeyPassword;
    }


    /**
     * Gets the masterKeyType value for this SmartCredentialAppletParms.
     * 
     * @return masterKeyType
     */
    public java.lang.String getMasterKeyType() {
        return masterKeyType;
    }


    /**
     * Sets the masterKeyType value for this SmartCredentialAppletParms.
     * 
     * @param masterKeyType
     */
    public void setMasterKeyType(java.lang.String masterKeyType) {
        this.masterKeyType = masterKeyType;
    }


    /**
     * Gets the addConfigSettings value for this SmartCredentialAppletParms.
     * 
     * @return addConfigSettings
     */
    public java.lang.Boolean getAddConfigSettings() {
        return addConfigSettings;
    }


    /**
     * Sets the addConfigSettings value for this SmartCredentialAppletParms.
     * 
     * @param addConfigSettings
     */
    public void setAddConfigSettings(java.lang.Boolean addConfigSettings) {
        this.addConfigSettings = addConfigSettings;
    }


    /**
     * Gets the configSettings value for this SmartCredentialAppletParms.
     * 
     * @return configSettings
     */
    public commonV8.ig.com.entrust.NameValue[] getConfigSettings() {
        return configSettings;
    }


    /**
     * Sets the configSettings value for this SmartCredentialAppletParms.
     * 
     * @param configSettings
     */
    public void setConfigSettings(commonV8.ig.com.entrust.NameValue[] configSettings) {
        this.configSettings = configSettings;
    }


    /**
     * Gets the removeConfigSettings value for this SmartCredentialAppletParms.
     * 
     * @return removeConfigSettings
     */
    public java.lang.String[] getRemoveConfigSettings() {
        return removeConfigSettings;
    }


    /**
     * Sets the removeConfigSettings value for this SmartCredentialAppletParms.
     * 
     * @param removeConfigSettings
     */
    public void setRemoveConfigSettings(java.lang.String[] removeConfigSettings) {
        this.removeConfigSettings = removeConfigSettings;
    }


    /**
     * Gets the addFileSettings value for this SmartCredentialAppletParms.
     * 
     * @return addFileSettings
     */
    public java.lang.Boolean getAddFileSettings() {
        return addFileSettings;
    }


    /**
     * Sets the addFileSettings value for this SmartCredentialAppletParms.
     * 
     * @param addFileSettings
     */
    public void setAddFileSettings(java.lang.Boolean addFileSettings) {
        this.addFileSettings = addFileSettings;
    }


    /**
     * Gets the fileSettings value for this SmartCredentialAppletParms.
     * 
     * @return fileSettings
     */
    public wsdl.adminV8.ig.com.entrust.FileSetting[] getFileSettings() {
        return fileSettings;
    }


    /**
     * Sets the fileSettings value for this SmartCredentialAppletParms.
     * 
     * @param fileSettings
     */
    public void setFileSettings(wsdl.adminV8.ig.com.entrust.FileSetting[] fileSettings) {
        this.fileSettings = fileSettings;
    }


    /**
     * Gets the removeFileSettings value for this SmartCredentialAppletParms.
     * 
     * @return removeFileSettings
     */
    public java.lang.String[] getRemoveFileSettings() {
        return removeFileSettings;
    }


    /**
     * Sets the removeFileSettings value for this SmartCredentialAppletParms.
     * 
     * @param removeFileSettings
     */
    public void setRemoveFileSettings(java.lang.String[] removeFileSettings) {
        this.removeFileSettings = removeFileSettings;
    }


    /**
     * Gets the description value for this SmartCredentialAppletParms.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SmartCredentialAppletParms.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialAppletParms)) return false;
        SmartCredentialAppletParms other = (SmartCredentialAppletParms) obj;
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
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.masterKey==null && other.getMasterKey()==null) || 
             (this.masterKey!=null &&
              java.util.Arrays.equals(this.masterKey, other.getMasterKey()))) &&
            ((this.masterKeyPassword==null && other.getMasterKeyPassword()==null) || 
             (this.masterKeyPassword!=null &&
              this.masterKeyPassword.equals(other.getMasterKeyPassword()))) &&
            ((this.masterKeyType==null && other.getMasterKeyType()==null) || 
             (this.masterKeyType!=null &&
              this.masterKeyType.equals(other.getMasterKeyType()))) &&
            ((this.addConfigSettings==null && other.getAddConfigSettings()==null) || 
             (this.addConfigSettings!=null &&
              this.addConfigSettings.equals(other.getAddConfigSettings()))) &&
            ((this.configSettings==null && other.getConfigSettings()==null) || 
             (this.configSettings!=null &&
              java.util.Arrays.equals(this.configSettings, other.getConfigSettings()))) &&
            ((this.removeConfigSettings==null && other.getRemoveConfigSettings()==null) || 
             (this.removeConfigSettings!=null &&
              java.util.Arrays.equals(this.removeConfigSettings, other.getRemoveConfigSettings()))) &&
            ((this.addFileSettings==null && other.getAddFileSettings()==null) || 
             (this.addFileSettings!=null &&
              this.addFileSettings.equals(other.getAddFileSettings()))) &&
            ((this.fileSettings==null && other.getFileSettings()==null) || 
             (this.fileSettings!=null &&
              java.util.Arrays.equals(this.fileSettings, other.getFileSettings()))) &&
            ((this.removeFileSettings==null && other.getRemoveFileSettings()==null) || 
             (this.removeFileSettings!=null &&
              java.util.Arrays.equals(this.removeFileSettings, other.getRemoveFileSettings()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMasterKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMasterKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterKeyPassword() != null) {
            _hashCode += getMasterKeyPassword().hashCode();
        }
        if (getMasterKeyType() != null) {
            _hashCode += getMasterKeyType().hashCode();
        }
        if (getAddConfigSettings() != null) {
            _hashCode += getAddConfigSettings().hashCode();
        }
        if (getConfigSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemoveConfigSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoveConfigSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoveConfigSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddFileSettings() != null) {
            _hashCode += getAddFileSettings().hashCode();
        }
        if (getFileSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemoveFileSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoveFileSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoveFileSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartCredentialAppletParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialAppletParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterKeyPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterKeyPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterKeyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterKeyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addConfigSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addConfigSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "NameValue"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeConfigSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeConfigSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addFileSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addFileSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "FileSetting"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeFileSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeFileSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
