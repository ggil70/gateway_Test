/**
 * UserPINParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserPINParms  implements java.io.Serializable {
    private java.lang.Boolean force;

    private java.lang.Long lifetime;

    private java.lang.Integer maxUses;

    private java.lang.String comment;

    public UserPINParms() {
    }

    public UserPINParms(
           java.lang.Boolean force,
           java.lang.Long lifetime,
           java.lang.Integer maxUses,
           java.lang.String comment) {
           this.force = force;
           this.lifetime = lifetime;
           this.maxUses = maxUses;
           this.comment = comment;
    }


    /**
     * Gets the force value for this UserPINParms.
     * 
     * @return force
     */
    public java.lang.Boolean getForce() {
        return force;
    }


    /**
     * Sets the force value for this UserPINParms.
     * 
     * @param force
     */
    public void setForce(java.lang.Boolean force) {
        this.force = force;
    }


    /**
     * Gets the lifetime value for this UserPINParms.
     * 
     * @return lifetime
     */
    public java.lang.Long getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this UserPINParms.
     * 
     * @param lifetime
     */
    public void setLifetime(java.lang.Long lifetime) {
        this.lifetime = lifetime;
    }


    /**
     * Gets the maxUses value for this UserPINParms.
     * 
     * @return maxUses
     */
    public java.lang.Integer getMaxUses() {
        return maxUses;
    }


    /**
     * Sets the maxUses value for this UserPINParms.
     * 
     * @param maxUses
     */
    public void setMaxUses(java.lang.Integer maxUses) {
        this.maxUses = maxUses;
    }


    /**
     * Gets the comment value for this UserPINParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserPINParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPINParms)) return false;
        UserPINParms other = (UserPINParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.force==null && other.getForce()==null) || 
             (this.force!=null &&
              this.force.equals(other.getForce()))) &&
            ((this.lifetime==null && other.getLifetime()==null) || 
             (this.lifetime!=null &&
              this.lifetime.equals(other.getLifetime()))) &&
            ((this.maxUses==null && other.getMaxUses()==null) || 
             (this.maxUses!=null &&
              this.maxUses.equals(other.getMaxUses()))) &&
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
        if (getForce() != null) {
            _hashCode += getForce().hashCode();
        }
        if (getLifetime() != null) {
            _hashCode += getLifetime().hashCode();
        }
        if (getMaxUses() != null) {
            _hashCode += getMaxUses().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPINParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserPINParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("force");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Force"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Lifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxUses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxUses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comment"));
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
