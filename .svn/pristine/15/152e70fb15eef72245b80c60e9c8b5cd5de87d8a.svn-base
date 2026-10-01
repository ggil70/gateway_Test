/**
 * ContentSigner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ContentSigner  implements java.io.Serializable {
    private byte[] securityStore;

    private java.lang.String password;

    private java.lang.String userDN;

    private java.lang.String signingAlg;

    private java.lang.Boolean delete;

    public ContentSigner() {
    }

    public ContentSigner(
           byte[] securityStore,
           java.lang.String password,
           java.lang.String userDN,
           java.lang.String signingAlg,
           java.lang.Boolean delete) {
           this.securityStore = securityStore;
           this.password = password;
           this.userDN = userDN;
           this.signingAlg = signingAlg;
           this.delete = delete;
    }


    /**
     * Gets the securityStore value for this ContentSigner.
     * 
     * @return securityStore
     */
    public byte[] getSecurityStore() {
        return securityStore;
    }


    /**
     * Sets the securityStore value for this ContentSigner.
     * 
     * @param securityStore
     */
    public void setSecurityStore(byte[] securityStore) {
        this.securityStore = securityStore;
    }


    /**
     * Gets the password value for this ContentSigner.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ContentSigner.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the userDN value for this ContentSigner.
     * 
     * @return userDN
     */
    public java.lang.String getUserDN() {
        return userDN;
    }


    /**
     * Sets the userDN value for this ContentSigner.
     * 
     * @param userDN
     */
    public void setUserDN(java.lang.String userDN) {
        this.userDN = userDN;
    }


    /**
     * Gets the signingAlg value for this ContentSigner.
     * 
     * @return signingAlg
     */
    public java.lang.String getSigningAlg() {
        return signingAlg;
    }


    /**
     * Sets the signingAlg value for this ContentSigner.
     * 
     * @param signingAlg
     */
    public void setSigningAlg(java.lang.String signingAlg) {
        this.signingAlg = signingAlg;
    }


    /**
     * Gets the delete value for this ContentSigner.
     * 
     * @return delete
     */
    public java.lang.Boolean getDelete() {
        return delete;
    }


    /**
     * Sets the delete value for this ContentSigner.
     * 
     * @param delete
     */
    public void setDelete(java.lang.Boolean delete) {
        this.delete = delete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentSigner)) return false;
        ContentSigner other = (ContentSigner) obj;
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
            ((this.userDN==null && other.getUserDN()==null) || 
             (this.userDN!=null &&
              this.userDN.equals(other.getUserDN()))) &&
            ((this.signingAlg==null && other.getSigningAlg()==null) || 
             (this.signingAlg!=null &&
              this.signingAlg.equals(other.getSigningAlg()))) &&
            ((this.delete==null && other.getDelete()==null) || 
             (this.delete!=null &&
              this.delete.equals(other.getDelete())));
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
        if (getUserDN() != null) {
            _hashCode += getUserDN().hashCode();
        }
        if (getSigningAlg() != null) {
            _hashCode += getSigningAlg().hashCode();
        }
        if (getDelete() != null) {
            _hashCode += getDelete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentSigner.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ContentSigner"));
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
        elemField.setFieldName("userDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SigningAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Delete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
