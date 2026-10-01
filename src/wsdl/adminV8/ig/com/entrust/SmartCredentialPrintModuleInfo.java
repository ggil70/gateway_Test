/**
 * SmartCredentialPrintModuleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialPrintModuleInfo  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String URL;

    private boolean sharedKey;

    private int connectionTimeout;

    private boolean disableSSLHostnameValidation;

    private boolean supportsPrint;

    private boolean supportsPrinterEncode;

    private boolean supportsExternalEncode;

    private boolean supportsProximity;

    private boolean supportsPrinterWipe;

    private boolean supportsExternalWipe;

    private java.lang.String wipeState;

    private java.util.Calendar wipeDate;

    private java.lang.String wipeInfo;

    private java.lang.Integer wipeCount;

    private java.lang.String proxy;

    private java.lang.String description;

    private java.lang.String[] rolesGrantingAccess;

    public SmartCredentialPrintModuleInfo() {
    }

    public SmartCredentialPrintModuleInfo(
           java.lang.String name,
           java.lang.String URL,
           boolean sharedKey,
           int connectionTimeout,
           boolean disableSSLHostnameValidation,
           boolean supportsPrint,
           boolean supportsPrinterEncode,
           boolean supportsExternalEncode,
           boolean supportsProximity,
           boolean supportsPrinterWipe,
           boolean supportsExternalWipe,
           java.lang.String wipeState,
           java.util.Calendar wipeDate,
           java.lang.String wipeInfo,
           java.lang.Integer wipeCount,
           java.lang.String proxy,
           java.lang.String description,
           java.lang.String[] rolesGrantingAccess) {
           this.name = name;
           this.URL = URL;
           this.sharedKey = sharedKey;
           this.connectionTimeout = connectionTimeout;
           this.disableSSLHostnameValidation = disableSSLHostnameValidation;
           this.supportsPrint = supportsPrint;
           this.supportsPrinterEncode = supportsPrinterEncode;
           this.supportsExternalEncode = supportsExternalEncode;
           this.supportsProximity = supportsProximity;
           this.supportsPrinterWipe = supportsPrinterWipe;
           this.supportsExternalWipe = supportsExternalWipe;
           this.wipeState = wipeState;
           this.wipeDate = wipeDate;
           this.wipeInfo = wipeInfo;
           this.wipeCount = wipeCount;
           this.proxy = proxy;
           this.description = description;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the name value for this SmartCredentialPrintModuleInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SmartCredentialPrintModuleInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the URL value for this SmartCredentialPrintModuleInfo.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this SmartCredentialPrintModuleInfo.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the sharedKey value for this SmartCredentialPrintModuleInfo.
     * 
     * @return sharedKey
     */
    public boolean isSharedKey() {
        return sharedKey;
    }


    /**
     * Sets the sharedKey value for this SmartCredentialPrintModuleInfo.
     * 
     * @param sharedKey
     */
    public void setSharedKey(boolean sharedKey) {
        this.sharedKey = sharedKey;
    }


    /**
     * Gets the connectionTimeout value for this SmartCredentialPrintModuleInfo.
     * 
     * @return connectionTimeout
     */
    public int getConnectionTimeout() {
        return connectionTimeout;
    }


    /**
     * Sets the connectionTimeout value for this SmartCredentialPrintModuleInfo.
     * 
     * @param connectionTimeout
     */
    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }


    /**
     * Gets the disableSSLHostnameValidation value for this SmartCredentialPrintModuleInfo.
     * 
     * @return disableSSLHostnameValidation
     */
    public boolean isDisableSSLHostnameValidation() {
        return disableSSLHostnameValidation;
    }


    /**
     * Sets the disableSSLHostnameValidation value for this SmartCredentialPrintModuleInfo.
     * 
     * @param disableSSLHostnameValidation
     */
    public void setDisableSSLHostnameValidation(boolean disableSSLHostnameValidation) {
        this.disableSSLHostnameValidation = disableSSLHostnameValidation;
    }


    /**
     * Gets the supportsPrint value for this SmartCredentialPrintModuleInfo.
     * 
     * @return supportsPrint
     */
    public boolean isSupportsPrint() {
        return supportsPrint;
    }


    /**
     * Sets the supportsPrint value for this SmartCredentialPrintModuleInfo.
     * 
     * @param supportsPrint
     */
    public void setSupportsPrint(boolean supportsPrint) {
        this.supportsPrint = supportsPrint;
    }


    /**
     * Gets the supportsPrinterEncode value for this SmartCredentialPrintModuleInfo.
     * 
     * @return supportsPrinterEncode
     */
    public boolean isSupportsPrinterEncode() {
        return supportsPrinterEncode;
    }


    /**
     * Sets the supportsPrinterEncode value for this SmartCredentialPrintModuleInfo.
     * 
     * @param supportsPrinterEncode
     */
    public void setSupportsPrinterEncode(boolean supportsPrinterEncode) {
        this.supportsPrinterEncode = supportsPrinterEncode;
    }


    /**
     * Gets the supportsExternalEncode value for this SmartCredentialPrintModuleInfo.
     * 
     * @return supportsExternalEncode
     */
    public boolean isSupportsExternalEncode() {
        return supportsExternalEncode;
    }


    /**
     * Sets the supportsExternalEncode value for this SmartCredentialPrintModuleInfo.
     * 
     * @param supportsExternalEncode
     */
    public void setSupportsExternalEncode(boolean supportsExternalEncode) {
        this.supportsExternalEncode = supportsExternalEncode;
    }


    /**
     * Gets the supportsProximity value for this SmartCredentialPrintModuleInfo.
     * 
     * @return supportsProximity
     */
    public boolean isSupportsProximity() {
        return supportsProximity;
    }


    /**
     * Sets the supportsProximity value for this SmartCredentialPrintModuleInfo.
     * 
     * @param supportsProximity
     */
    public void setSupportsProximity(boolean supportsProximity) {
        this.supportsProximity = supportsProximity;
    }


    /**
     * Gets the supportsPrinterWipe value for this SmartCredentialPrintModuleInfo.
     * 
     * @return supportsPrinterWipe
     */
    public boolean isSupportsPrinterWipe() {
        return supportsPrinterWipe;
    }


    /**
     * Sets the supportsPrinterWipe value for this SmartCredentialPrintModuleInfo.
     * 
     * @param supportsPrinterWipe
     */
    public void setSupportsPrinterWipe(boolean supportsPrinterWipe) {
        this.supportsPrinterWipe = supportsPrinterWipe;
    }


    /**
     * Gets the supportsExternalWipe value for this SmartCredentialPrintModuleInfo.
     * 
     * @return supportsExternalWipe
     */
    public boolean isSupportsExternalWipe() {
        return supportsExternalWipe;
    }


    /**
     * Sets the supportsExternalWipe value for this SmartCredentialPrintModuleInfo.
     * 
     * @param supportsExternalWipe
     */
    public void setSupportsExternalWipe(boolean supportsExternalWipe) {
        this.supportsExternalWipe = supportsExternalWipe;
    }


    /**
     * Gets the wipeState value for this SmartCredentialPrintModuleInfo.
     * 
     * @return wipeState
     */
    public java.lang.String getWipeState() {
        return wipeState;
    }


    /**
     * Sets the wipeState value for this SmartCredentialPrintModuleInfo.
     * 
     * @param wipeState
     */
    public void setWipeState(java.lang.String wipeState) {
        this.wipeState = wipeState;
    }


    /**
     * Gets the wipeDate value for this SmartCredentialPrintModuleInfo.
     * 
     * @return wipeDate
     */
    public java.util.Calendar getWipeDate() {
        return wipeDate;
    }


    /**
     * Sets the wipeDate value for this SmartCredentialPrintModuleInfo.
     * 
     * @param wipeDate
     */
    public void setWipeDate(java.util.Calendar wipeDate) {
        this.wipeDate = wipeDate;
    }


    /**
     * Gets the wipeInfo value for this SmartCredentialPrintModuleInfo.
     * 
     * @return wipeInfo
     */
    public java.lang.String getWipeInfo() {
        return wipeInfo;
    }


    /**
     * Sets the wipeInfo value for this SmartCredentialPrintModuleInfo.
     * 
     * @param wipeInfo
     */
    public void setWipeInfo(java.lang.String wipeInfo) {
        this.wipeInfo = wipeInfo;
    }


    /**
     * Gets the wipeCount value for this SmartCredentialPrintModuleInfo.
     * 
     * @return wipeCount
     */
    public java.lang.Integer getWipeCount() {
        return wipeCount;
    }


    /**
     * Sets the wipeCount value for this SmartCredentialPrintModuleInfo.
     * 
     * @param wipeCount
     */
    public void setWipeCount(java.lang.Integer wipeCount) {
        this.wipeCount = wipeCount;
    }


    /**
     * Gets the proxy value for this SmartCredentialPrintModuleInfo.
     * 
     * @return proxy
     */
    public java.lang.String getProxy() {
        return proxy;
    }


    /**
     * Sets the proxy value for this SmartCredentialPrintModuleInfo.
     * 
     * @param proxy
     */
    public void setProxy(java.lang.String proxy) {
        this.proxy = proxy;
    }


    /**
     * Gets the description value for this SmartCredentialPrintModuleInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SmartCredentialPrintModuleInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the rolesGrantingAccess value for this SmartCredentialPrintModuleInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this SmartCredentialPrintModuleInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialPrintModuleInfo)) return false;
        SmartCredentialPrintModuleInfo other = (SmartCredentialPrintModuleInfo) obj;
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
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            this.sharedKey == other.isSharedKey() &&
            this.connectionTimeout == other.getConnectionTimeout() &&
            this.disableSSLHostnameValidation == other.isDisableSSLHostnameValidation() &&
            this.supportsPrint == other.isSupportsPrint() &&
            this.supportsPrinterEncode == other.isSupportsPrinterEncode() &&
            this.supportsExternalEncode == other.isSupportsExternalEncode() &&
            this.supportsProximity == other.isSupportsProximity() &&
            this.supportsPrinterWipe == other.isSupportsPrinterWipe() &&
            this.supportsExternalWipe == other.isSupportsExternalWipe() &&
            ((this.wipeState==null && other.getWipeState()==null) || 
             (this.wipeState!=null &&
              this.wipeState.equals(other.getWipeState()))) &&
            ((this.wipeDate==null && other.getWipeDate()==null) || 
             (this.wipeDate!=null &&
              this.wipeDate.equals(other.getWipeDate()))) &&
            ((this.wipeInfo==null && other.getWipeInfo()==null) || 
             (this.wipeInfo!=null &&
              this.wipeInfo.equals(other.getWipeInfo()))) &&
            ((this.wipeCount==null && other.getWipeCount()==null) || 
             (this.wipeCount!=null &&
              this.wipeCount.equals(other.getWipeCount()))) &&
            ((this.proxy==null && other.getProxy()==null) || 
             (this.proxy!=null &&
              this.proxy.equals(other.getProxy()))) &&
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
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        _hashCode += (isSharedKey() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getConnectionTimeout();
        _hashCode += (isDisableSSLHostnameValidation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSupportsPrint() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSupportsPrinterEncode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSupportsExternalEncode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSupportsProximity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSupportsPrinterWipe() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSupportsExternalWipe() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWipeState() != null) {
            _hashCode += getWipeState().hashCode();
        }
        if (getWipeDate() != null) {
            _hashCode += getWipeDate().hashCode();
        }
        if (getWipeInfo() != null) {
            _hashCode += getWipeInfo().hashCode();
        }
        if (getWipeCount() != null) {
            _hashCode += getWipeCount().hashCode();
        }
        if (getProxy() != null) {
            _hashCode += getProxy().hashCode();
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
        new org.apache.axis.description.TypeDesc(SmartCredentialPrintModuleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialPrintModuleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sharedKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableSSLHostnameValidation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableSSLHostnameValidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportsPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsPrinterEncode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportsPrinterEncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsExternalEncode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportsExternalEncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsProximity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportsProximity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsPrinterWipe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportsPrinterWipe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsExternalWipe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportsExternalWipe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wipeState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wipeState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wipeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wipeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wipeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wipeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wipeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wipeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
