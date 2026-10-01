/**
 * SystemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SystemInfo  implements java.io.Serializable {
    private java.lang.String version;

    private java.lang.String patchLevel;

    private java.math.BigInteger numUsers;

    private java.math.BigInteger nextUserNumber;

    private java.math.BigInteger nextCardSerialNumber;

    private java.math.BigInteger numLicensedTokens;

    public SystemInfo() {
    }

    public SystemInfo(
           java.lang.String version,
           java.lang.String patchLevel,
           java.math.BigInteger numUsers,
           java.math.BigInteger nextUserNumber,
           java.math.BigInteger nextCardSerialNumber,
           java.math.BigInteger numLicensedTokens) {
           this.version = version;
           this.patchLevel = patchLevel;
           this.numUsers = numUsers;
           this.nextUserNumber = nextUserNumber;
           this.nextCardSerialNumber = nextCardSerialNumber;
           this.numLicensedTokens = numLicensedTokens;
    }


    /**
     * Gets the version value for this SystemInfo.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SystemInfo.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the patchLevel value for this SystemInfo.
     * 
     * @return patchLevel
     */
    public java.lang.String getPatchLevel() {
        return patchLevel;
    }


    /**
     * Sets the patchLevel value for this SystemInfo.
     * 
     * @param patchLevel
     */
    public void setPatchLevel(java.lang.String patchLevel) {
        this.patchLevel = patchLevel;
    }


    /**
     * Gets the numUsers value for this SystemInfo.
     * 
     * @return numUsers
     */
    public java.math.BigInteger getNumUsers() {
        return numUsers;
    }


    /**
     * Sets the numUsers value for this SystemInfo.
     * 
     * @param numUsers
     */
    public void setNumUsers(java.math.BigInteger numUsers) {
        this.numUsers = numUsers;
    }


    /**
     * Gets the nextUserNumber value for this SystemInfo.
     * 
     * @return nextUserNumber
     */
    public java.math.BigInteger getNextUserNumber() {
        return nextUserNumber;
    }


    /**
     * Sets the nextUserNumber value for this SystemInfo.
     * 
     * @param nextUserNumber
     */
    public void setNextUserNumber(java.math.BigInteger nextUserNumber) {
        this.nextUserNumber = nextUserNumber;
    }


    /**
     * Gets the nextCardSerialNumber value for this SystemInfo.
     * 
     * @return nextCardSerialNumber
     */
    public java.math.BigInteger getNextCardSerialNumber() {
        return nextCardSerialNumber;
    }


    /**
     * Sets the nextCardSerialNumber value for this SystemInfo.
     * 
     * @param nextCardSerialNumber
     */
    public void setNextCardSerialNumber(java.math.BigInteger nextCardSerialNumber) {
        this.nextCardSerialNumber = nextCardSerialNumber;
    }


    /**
     * Gets the numLicensedTokens value for this SystemInfo.
     * 
     * @return numLicensedTokens
     */
    public java.math.BigInteger getNumLicensedTokens() {
        return numLicensedTokens;
    }


    /**
     * Sets the numLicensedTokens value for this SystemInfo.
     * 
     * @param numLicensedTokens
     */
    public void setNumLicensedTokens(java.math.BigInteger numLicensedTokens) {
        this.numLicensedTokens = numLicensedTokens;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemInfo)) return false;
        SystemInfo other = (SystemInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.patchLevel==null && other.getPatchLevel()==null) || 
             (this.patchLevel!=null &&
              this.patchLevel.equals(other.getPatchLevel()))) &&
            ((this.numUsers==null && other.getNumUsers()==null) || 
             (this.numUsers!=null &&
              this.numUsers.equals(other.getNumUsers()))) &&
            ((this.nextUserNumber==null && other.getNextUserNumber()==null) || 
             (this.nextUserNumber!=null &&
              this.nextUserNumber.equals(other.getNextUserNumber()))) &&
            ((this.nextCardSerialNumber==null && other.getNextCardSerialNumber()==null) || 
             (this.nextCardSerialNumber!=null &&
              this.nextCardSerialNumber.equals(other.getNextCardSerialNumber()))) &&
            ((this.numLicensedTokens==null && other.getNumLicensedTokens()==null) || 
             (this.numLicensedTokens!=null &&
              this.numLicensedTokens.equals(other.getNumLicensedTokens())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getPatchLevel() != null) {
            _hashCode += getPatchLevel().hashCode();
        }
        if (getNumUsers() != null) {
            _hashCode += getNumUsers().hashCode();
        }
        if (getNextUserNumber() != null) {
            _hashCode += getNextUserNumber().hashCode();
        }
        if (getNextCardSerialNumber() != null) {
            _hashCode += getNextCardSerialNumber().hashCode();
        }
        if (getNumLicensedTokens() != null) {
            _hashCode += getNumLicensedTokens().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SystemInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patchLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "patchLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextUserNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextUserNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextCardSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextCardSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numLicensedTokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numLicensedTokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
