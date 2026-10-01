/**
 * PACSInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class PACSInfo  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String URL;

    private byte[] profile;

    private java.lang.String password;

    private java.lang.String proxy;

    private int connectionTimeout;

    private boolean disableSSLHostnameValidation;

    private java.lang.String[] applets;

    private java.lang.String description;

    private java.lang.String defaultAccessRights;

    private long version;

    private java.lang.String[] rolesGrantingAccess;

    public PACSInfo() {
    }

    public PACSInfo(
           java.lang.String name,
           java.lang.String URL,
           byte[] profile,
           java.lang.String password,
           java.lang.String proxy,
           int connectionTimeout,
           boolean disableSSLHostnameValidation,
           java.lang.String[] applets,
           java.lang.String description,
           java.lang.String defaultAccessRights,
           long version,
           java.lang.String[] rolesGrantingAccess) {
           this.name = name;
           this.URL = URL;
           this.profile = profile;
           this.password = password;
           this.proxy = proxy;
           this.connectionTimeout = connectionTimeout;
           this.disableSSLHostnameValidation = disableSSLHostnameValidation;
           this.applets = applets;
           this.description = description;
           this.defaultAccessRights = defaultAccessRights;
           this.version = version;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the name value for this PACSInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PACSInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the URL value for this PACSInfo.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this PACSInfo.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the profile value for this PACSInfo.
     * 
     * @return profile
     */
    public byte[] getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this PACSInfo.
     * 
     * @param profile
     */
    public void setProfile(byte[] profile) {
        this.profile = profile;
    }


    /**
     * Gets the password value for this PACSInfo.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this PACSInfo.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the proxy value for this PACSInfo.
     * 
     * @return proxy
     */
    public java.lang.String getProxy() {
        return proxy;
    }


    /**
     * Sets the proxy value for this PACSInfo.
     * 
     * @param proxy
     */
    public void setProxy(java.lang.String proxy) {
        this.proxy = proxy;
    }


    /**
     * Gets the connectionTimeout value for this PACSInfo.
     * 
     * @return connectionTimeout
     */
    public int getConnectionTimeout() {
        return connectionTimeout;
    }


    /**
     * Sets the connectionTimeout value for this PACSInfo.
     * 
     * @param connectionTimeout
     */
    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }


    /**
     * Gets the disableSSLHostnameValidation value for this PACSInfo.
     * 
     * @return disableSSLHostnameValidation
     */
    public boolean isDisableSSLHostnameValidation() {
        return disableSSLHostnameValidation;
    }


    /**
     * Sets the disableSSLHostnameValidation value for this PACSInfo.
     * 
     * @param disableSSLHostnameValidation
     */
    public void setDisableSSLHostnameValidation(boolean disableSSLHostnameValidation) {
        this.disableSSLHostnameValidation = disableSSLHostnameValidation;
    }


    /**
     * Gets the applets value for this PACSInfo.
     * 
     * @return applets
     */
    public java.lang.String[] getApplets() {
        return applets;
    }


    /**
     * Sets the applets value for this PACSInfo.
     * 
     * @param applets
     */
    public void setApplets(java.lang.String[] applets) {
        this.applets = applets;
    }


    /**
     * Gets the description value for this PACSInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PACSInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the defaultAccessRights value for this PACSInfo.
     * 
     * @return defaultAccessRights
     */
    public java.lang.String getDefaultAccessRights() {
        return defaultAccessRights;
    }


    /**
     * Sets the defaultAccessRights value for this PACSInfo.
     * 
     * @param defaultAccessRights
     */
    public void setDefaultAccessRights(java.lang.String defaultAccessRights) {
        this.defaultAccessRights = defaultAccessRights;
    }


    /**
     * Gets the version value for this PACSInfo.
     * 
     * @return version
     */
    public long getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PACSInfo.
     * 
     * @param version
     */
    public void setVersion(long version) {
        this.version = version;
    }


    /**
     * Gets the rolesGrantingAccess value for this PACSInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this PACSInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PACSInfo)) return false;
        PACSInfo other = (PACSInfo) obj;
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
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              java.util.Arrays.equals(this.profile, other.getProfile()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.proxy==null && other.getProxy()==null) || 
             (this.proxy!=null &&
              this.proxy.equals(other.getProxy()))) &&
            this.connectionTimeout == other.getConnectionTimeout() &&
            this.disableSSLHostnameValidation == other.isDisableSSLHostnameValidation() &&
            ((this.applets==null && other.getApplets()==null) || 
             (this.applets!=null &&
              java.util.Arrays.equals(this.applets, other.getApplets()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.defaultAccessRights==null && other.getDefaultAccessRights()==null) || 
             (this.defaultAccessRights!=null &&
              this.defaultAccessRights.equals(other.getDefaultAccessRights()))) &&
            this.version == other.getVersion() &&
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
        if (getProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getProxy() != null) {
            _hashCode += getProxy().hashCode();
        }
        _hashCode += getConnectionTimeout();
        _hashCode += (isDisableSSLHostnameValidation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDefaultAccessRights() != null) {
            _hashCode += getDefaultAccessRights().hashCode();
        }
        _hashCode += new Long(getVersion()).hashCode();
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
        new org.apache.axis.description.TypeDesc(PACSInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PACSInfo"));
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
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("applets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAccessRights");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultAccessRights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
