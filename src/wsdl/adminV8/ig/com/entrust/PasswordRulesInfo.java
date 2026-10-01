/**
 * PasswordRulesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class PasswordRulesInfo  implements java.io.Serializable {
    private java.lang.String name;

    private int minLength;

    private int lifetime;

    private int minLifetime;

    private int history;

    private int idleTimeout;

    private boolean uppercase;

    private boolean lowercase;

    private boolean number;

    private boolean special;

    private java.lang.String firstAuth;

    private java.lang.String secondAuth;

    private java.lang.String storage;

    private java.lang.String[] rolesGrantingAccess;

    private java.lang.String comment;

    public PasswordRulesInfo() {
    }

    public PasswordRulesInfo(
           java.lang.String name,
           int minLength,
           int lifetime,
           int minLifetime,
           int history,
           int idleTimeout,
           boolean uppercase,
           boolean lowercase,
           boolean number,
           boolean special,
           java.lang.String firstAuth,
           java.lang.String secondAuth,
           java.lang.String storage,
           java.lang.String[] rolesGrantingAccess,
           java.lang.String comment) {
           this.name = name;
           this.minLength = minLength;
           this.lifetime = lifetime;
           this.minLifetime = minLifetime;
           this.history = history;
           this.idleTimeout = idleTimeout;
           this.uppercase = uppercase;
           this.lowercase = lowercase;
           this.number = number;
           this.special = special;
           this.firstAuth = firstAuth;
           this.secondAuth = secondAuth;
           this.storage = storage;
           this.rolesGrantingAccess = rolesGrantingAccess;
           this.comment = comment;
    }


    /**
     * Gets the name value for this PasswordRulesInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PasswordRulesInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the minLength value for this PasswordRulesInfo.
     * 
     * @return minLength
     */
    public int getMinLength() {
        return minLength;
    }


    /**
     * Sets the minLength value for this PasswordRulesInfo.
     * 
     * @param minLength
     */
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }


    /**
     * Gets the lifetime value for this PasswordRulesInfo.
     * 
     * @return lifetime
     */
    public int getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this PasswordRulesInfo.
     * 
     * @param lifetime
     */
    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }


    /**
     * Gets the minLifetime value for this PasswordRulesInfo.
     * 
     * @return minLifetime
     */
    public int getMinLifetime() {
        return minLifetime;
    }


    /**
     * Sets the minLifetime value for this PasswordRulesInfo.
     * 
     * @param minLifetime
     */
    public void setMinLifetime(int minLifetime) {
        this.minLifetime = minLifetime;
    }


    /**
     * Gets the history value for this PasswordRulesInfo.
     * 
     * @return history
     */
    public int getHistory() {
        return history;
    }


    /**
     * Sets the history value for this PasswordRulesInfo.
     * 
     * @param history
     */
    public void setHistory(int history) {
        this.history = history;
    }


    /**
     * Gets the idleTimeout value for this PasswordRulesInfo.
     * 
     * @return idleTimeout
     */
    public int getIdleTimeout() {
        return idleTimeout;
    }


    /**
     * Sets the idleTimeout value for this PasswordRulesInfo.
     * 
     * @param idleTimeout
     */
    public void setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
    }


    /**
     * Gets the uppercase value for this PasswordRulesInfo.
     * 
     * @return uppercase
     */
    public boolean isUppercase() {
        return uppercase;
    }


    /**
     * Sets the uppercase value for this PasswordRulesInfo.
     * 
     * @param uppercase
     */
    public void setUppercase(boolean uppercase) {
        this.uppercase = uppercase;
    }


    /**
     * Gets the lowercase value for this PasswordRulesInfo.
     * 
     * @return lowercase
     */
    public boolean isLowercase() {
        return lowercase;
    }


    /**
     * Sets the lowercase value for this PasswordRulesInfo.
     * 
     * @param lowercase
     */
    public void setLowercase(boolean lowercase) {
        this.lowercase = lowercase;
    }


    /**
     * Gets the number value for this PasswordRulesInfo.
     * 
     * @return number
     */
    public boolean isNumber() {
        return number;
    }


    /**
     * Sets the number value for this PasswordRulesInfo.
     * 
     * @param number
     */
    public void setNumber(boolean number) {
        this.number = number;
    }


    /**
     * Gets the special value for this PasswordRulesInfo.
     * 
     * @return special
     */
    public boolean isSpecial() {
        return special;
    }


    /**
     * Sets the special value for this PasswordRulesInfo.
     * 
     * @param special
     */
    public void setSpecial(boolean special) {
        this.special = special;
    }


    /**
     * Gets the firstAuth value for this PasswordRulesInfo.
     * 
     * @return firstAuth
     */
    public java.lang.String getFirstAuth() {
        return firstAuth;
    }


    /**
     * Sets the firstAuth value for this PasswordRulesInfo.
     * 
     * @param firstAuth
     */
    public void setFirstAuth(java.lang.String firstAuth) {
        this.firstAuth = firstAuth;
    }


    /**
     * Gets the secondAuth value for this PasswordRulesInfo.
     * 
     * @return secondAuth
     */
    public java.lang.String getSecondAuth() {
        return secondAuth;
    }


    /**
     * Sets the secondAuth value for this PasswordRulesInfo.
     * 
     * @param secondAuth
     */
    public void setSecondAuth(java.lang.String secondAuth) {
        this.secondAuth = secondAuth;
    }


    /**
     * Gets the storage value for this PasswordRulesInfo.
     * 
     * @return storage
     */
    public java.lang.String getStorage() {
        return storage;
    }


    /**
     * Sets the storage value for this PasswordRulesInfo.
     * 
     * @param storage
     */
    public void setStorage(java.lang.String storage) {
        this.storage = storage;
    }


    /**
     * Gets the rolesGrantingAccess value for this PasswordRulesInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this PasswordRulesInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the comment value for this PasswordRulesInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this PasswordRulesInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PasswordRulesInfo)) return false;
        PasswordRulesInfo other = (PasswordRulesInfo) obj;
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
            this.minLength == other.getMinLength() &&
            this.lifetime == other.getLifetime() &&
            this.minLifetime == other.getMinLifetime() &&
            this.history == other.getHistory() &&
            this.idleTimeout == other.getIdleTimeout() &&
            this.uppercase == other.isUppercase() &&
            this.lowercase == other.isLowercase() &&
            this.number == other.isNumber() &&
            this.special == other.isSpecial() &&
            ((this.firstAuth==null && other.getFirstAuth()==null) || 
             (this.firstAuth!=null &&
              this.firstAuth.equals(other.getFirstAuth()))) &&
            ((this.secondAuth==null && other.getSecondAuth()==null) || 
             (this.secondAuth!=null &&
              this.secondAuth.equals(other.getSecondAuth()))) &&
            ((this.storage==null && other.getStorage()==null) || 
             (this.storage!=null &&
              this.storage.equals(other.getStorage()))) &&
            ((this.rolesGrantingAccess==null && other.getRolesGrantingAccess()==null) || 
             (this.rolesGrantingAccess!=null &&
              java.util.Arrays.equals(this.rolesGrantingAccess, other.getRolesGrantingAccess()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        _hashCode += getMinLength();
        _hashCode += getLifetime();
        _hashCode += getMinLifetime();
        _hashCode += getHistory();
        _hashCode += getIdleTimeout();
        _hashCode += (isUppercase() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLowercase() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNumber() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSpecial() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFirstAuth() != null) {
            _hashCode += getFirstAuth().hashCode();
        }
        if (getSecondAuth() != null) {
            _hashCode += getSecondAuth().hashCode();
        }
        if (getStorage() != null) {
            _hashCode += getStorage().hashCode();
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PasswordRulesInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PasswordRulesInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idleTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idleTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uppercase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uppercase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowercase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lowercase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("special");
        elemField.setXmlName(new javax.xml.namespace.QName("", "special"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storage"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
