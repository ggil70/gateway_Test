/**
 * TokenLicenseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class TokenLicenseInfo  implements java.io.Serializable {
    private java.math.BigInteger numTokens;

    private java.math.BigInteger maxTokens;

    private java.util.Calendar expiryDate;

    private java.lang.String[] rolesGrantingAccess;

    public TokenLicenseInfo() {
    }

    public TokenLicenseInfo(
           java.math.BigInteger numTokens,
           java.math.BigInteger maxTokens,
           java.util.Calendar expiryDate,
           java.lang.String[] rolesGrantingAccess) {
           this.numTokens = numTokens;
           this.maxTokens = maxTokens;
           this.expiryDate = expiryDate;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the numTokens value for this TokenLicenseInfo.
     * 
     * @return numTokens
     */
    public java.math.BigInteger getNumTokens() {
        return numTokens;
    }


    /**
     * Sets the numTokens value for this TokenLicenseInfo.
     * 
     * @param numTokens
     */
    public void setNumTokens(java.math.BigInteger numTokens) {
        this.numTokens = numTokens;
    }


    /**
     * Gets the maxTokens value for this TokenLicenseInfo.
     * 
     * @return maxTokens
     */
    public java.math.BigInteger getMaxTokens() {
        return maxTokens;
    }


    /**
     * Sets the maxTokens value for this TokenLicenseInfo.
     * 
     * @param maxTokens
     */
    public void setMaxTokens(java.math.BigInteger maxTokens) {
        this.maxTokens = maxTokens;
    }


    /**
     * Gets the expiryDate value for this TokenLicenseInfo.
     * 
     * @return expiryDate
     */
    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this TokenLicenseInfo.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the rolesGrantingAccess value for this TokenLicenseInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this TokenLicenseInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenLicenseInfo)) return false;
        TokenLicenseInfo other = (TokenLicenseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numTokens==null && other.getNumTokens()==null) || 
             (this.numTokens!=null &&
              this.numTokens.equals(other.getNumTokens()))) &&
            ((this.maxTokens==null && other.getMaxTokens()==null) || 
             (this.maxTokens!=null &&
              this.maxTokens.equals(other.getMaxTokens()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
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
        if (getNumTokens() != null) {
            _hashCode += getNumTokens().hashCode();
        }
        if (getMaxTokens() != null) {
            _hashCode += getMaxTokens().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(TokenLicenseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "TokenLicenseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numTokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
