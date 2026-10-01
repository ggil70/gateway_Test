/**
 * ManagedCaAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ManagedCaAdmin  implements java.io.Serializable {
    private byte[] securityStore;

    private java.lang.String password;

    private java.lang.String DN;

    public ManagedCaAdmin() {
    }

    public ManagedCaAdmin(
           byte[] securityStore,
           java.lang.String password,
           java.lang.String DN) {
           this.securityStore = securityStore;
           this.password = password;
           this.DN = DN;
    }


    /**
     * Gets the securityStore value for this ManagedCaAdmin.
     * 
     * @return securityStore
     */
    public byte[] getSecurityStore() {
        return securityStore;
    }


    /**
     * Sets the securityStore value for this ManagedCaAdmin.
     * 
     * @param securityStore
     */
    public void setSecurityStore(byte[] securityStore) {
        this.securityStore = securityStore;
    }


    /**
     * Gets the password value for this ManagedCaAdmin.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ManagedCaAdmin.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the DN value for this ManagedCaAdmin.
     * 
     * @return DN
     */
    public java.lang.String getDN() {
        return DN;
    }


    /**
     * Sets the DN value for this ManagedCaAdmin.
     * 
     * @param DN
     */
    public void setDN(java.lang.String DN) {
        this.DN = DN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCaAdmin)) return false;
        ManagedCaAdmin other = (ManagedCaAdmin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.securityStore==null && other.getSecurityStore()==null) || 
             (this.securityStore!=null &&
              java.util.Arrays.equals(this.securityStore, other.getSecurityStore()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.DN==null && other.getDN()==null) || 
             (this.DN!=null &&
              this.DN.equals(other.getDN())));
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
        if (getSecurityStore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecurityStore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecurityStore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getDN() != null) {
            _hashCode += getDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCaAdmin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaAdmin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityStore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecurityStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DN"));
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
