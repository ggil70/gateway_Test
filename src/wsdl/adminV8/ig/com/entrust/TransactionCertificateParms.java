/**
 * TransactionCertificateParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class TransactionCertificateParms  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String state;

    private java.lang.String subjectDN;

    private java.lang.Integer lifetime;

    private java.lang.String hashAlg;

    private java.lang.String keyAlg;

    private java.lang.Boolean force;

    public TransactionCertificateParms() {
    }

    public TransactionCertificateParms(
           java.lang.String name,
           java.lang.String state,
           java.lang.String subjectDN,
           java.lang.Integer lifetime,
           java.lang.String hashAlg,
           java.lang.String keyAlg,
           java.lang.Boolean force) {
           this.name = name;
           this.state = state;
           this.subjectDN = subjectDN;
           this.lifetime = lifetime;
           this.hashAlg = hashAlg;
           this.keyAlg = keyAlg;
           this.force = force;
    }


    /**
     * Gets the name value for this TransactionCertificateParms.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TransactionCertificateParms.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the state value for this TransactionCertificateParms.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TransactionCertificateParms.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the subjectDN value for this TransactionCertificateParms.
     * 
     * @return subjectDN
     */
    public java.lang.String getSubjectDN() {
        return subjectDN;
    }


    /**
     * Sets the subjectDN value for this TransactionCertificateParms.
     * 
     * @param subjectDN
     */
    public void setSubjectDN(java.lang.String subjectDN) {
        this.subjectDN = subjectDN;
    }


    /**
     * Gets the lifetime value for this TransactionCertificateParms.
     * 
     * @return lifetime
     */
    public java.lang.Integer getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this TransactionCertificateParms.
     * 
     * @param lifetime
     */
    public void setLifetime(java.lang.Integer lifetime) {
        this.lifetime = lifetime;
    }


    /**
     * Gets the hashAlg value for this TransactionCertificateParms.
     * 
     * @return hashAlg
     */
    public java.lang.String getHashAlg() {
        return hashAlg;
    }


    /**
     * Sets the hashAlg value for this TransactionCertificateParms.
     * 
     * @param hashAlg
     */
    public void setHashAlg(java.lang.String hashAlg) {
        this.hashAlg = hashAlg;
    }


    /**
     * Gets the keyAlg value for this TransactionCertificateParms.
     * 
     * @return keyAlg
     */
    public java.lang.String getKeyAlg() {
        return keyAlg;
    }


    /**
     * Sets the keyAlg value for this TransactionCertificateParms.
     * 
     * @param keyAlg
     */
    public void setKeyAlg(java.lang.String keyAlg) {
        this.keyAlg = keyAlg;
    }


    /**
     * Gets the force value for this TransactionCertificateParms.
     * 
     * @return force
     */
    public java.lang.Boolean getForce() {
        return force;
    }


    /**
     * Sets the force value for this TransactionCertificateParms.
     * 
     * @param force
     */
    public void setForce(java.lang.Boolean force) {
        this.force = force;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionCertificateParms)) return false;
        TransactionCertificateParms other = (TransactionCertificateParms) obj;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subjectDN==null && other.getSubjectDN()==null) || 
             (this.subjectDN!=null &&
              this.subjectDN.equals(other.getSubjectDN()))) &&
            ((this.lifetime==null && other.getLifetime()==null) || 
             (this.lifetime!=null &&
              this.lifetime.equals(other.getLifetime()))) &&
            ((this.hashAlg==null && other.getHashAlg()==null) || 
             (this.hashAlg!=null &&
              this.hashAlg.equals(other.getHashAlg()))) &&
            ((this.keyAlg==null && other.getKeyAlg()==null) || 
             (this.keyAlg!=null &&
              this.keyAlg.equals(other.getKeyAlg()))) &&
            ((this.force==null && other.getForce()==null) || 
             (this.force!=null &&
              this.force.equals(other.getForce())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubjectDN() != null) {
            _hashCode += getSubjectDN().hashCode();
        }
        if (getLifetime() != null) {
            _hashCode += getLifetime().hashCode();
        }
        if (getHashAlg() != null) {
            _hashCode += getHashAlg().hashCode();
        }
        if (getKeyAlg() != null) {
            _hashCode += getKeyAlg().hashCode();
        }
        if (getForce() != null) {
            _hashCode += getForce().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionCertificateParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "TransactionCertificateParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subjectDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("force");
        elemField.setXmlName(new javax.xml.namespace.QName("", "force"));
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
