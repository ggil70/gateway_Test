/**
 * PolicyParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class PolicyParms  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean defaultPolicy;

    private wsdl.adminV8.ig.com.entrust.UserSpecParms userSpec;

    private wsdl.adminV8.ig.com.entrust.CardSpecParms cardSpec;

    private wsdl.adminV8.ig.com.entrust.PINSpecParms pinSpec;

    private wsdl.adminV8.ig.com.entrust.PasswordRulesParms passwordRules;

    private java.lang.String comment;

    public PolicyParms() {
    }

    public PolicyParms(
           java.lang.String name,
           java.lang.Boolean defaultPolicy,
           wsdl.adminV8.ig.com.entrust.UserSpecParms userSpec,
           wsdl.adminV8.ig.com.entrust.CardSpecParms cardSpec,
           wsdl.adminV8.ig.com.entrust.PINSpecParms pinSpec,
           wsdl.adminV8.ig.com.entrust.PasswordRulesParms passwordRules,
           java.lang.String comment) {
           this.name = name;
           this.defaultPolicy = defaultPolicy;
           this.userSpec = userSpec;
           this.cardSpec = cardSpec;
           this.pinSpec = pinSpec;
           this.passwordRules = passwordRules;
           this.comment = comment;
    }


    /**
     * Gets the name value for this PolicyParms.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PolicyParms.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the defaultPolicy value for this PolicyParms.
     * 
     * @return defaultPolicy
     */
    public java.lang.Boolean getDefaultPolicy() {
        return defaultPolicy;
    }


    /**
     * Sets the defaultPolicy value for this PolicyParms.
     * 
     * @param defaultPolicy
     */
    public void setDefaultPolicy(java.lang.Boolean defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }


    /**
     * Gets the userSpec value for this PolicyParms.
     * 
     * @return userSpec
     */
    public wsdl.adminV8.ig.com.entrust.UserSpecParms getUserSpec() {
        return userSpec;
    }


    /**
     * Sets the userSpec value for this PolicyParms.
     * 
     * @param userSpec
     */
    public void setUserSpec(wsdl.adminV8.ig.com.entrust.UserSpecParms userSpec) {
        this.userSpec = userSpec;
    }


    /**
     * Gets the cardSpec value for this PolicyParms.
     * 
     * @return cardSpec
     */
    public wsdl.adminV8.ig.com.entrust.CardSpecParms getCardSpec() {
        return cardSpec;
    }


    /**
     * Sets the cardSpec value for this PolicyParms.
     * 
     * @param cardSpec
     */
    public void setCardSpec(wsdl.adminV8.ig.com.entrust.CardSpecParms cardSpec) {
        this.cardSpec = cardSpec;
    }


    /**
     * Gets the pinSpec value for this PolicyParms.
     * 
     * @return pinSpec
     */
    public wsdl.adminV8.ig.com.entrust.PINSpecParms getPinSpec() {
        return pinSpec;
    }


    /**
     * Sets the pinSpec value for this PolicyParms.
     * 
     * @param pinSpec
     */
    public void setPinSpec(wsdl.adminV8.ig.com.entrust.PINSpecParms pinSpec) {
        this.pinSpec = pinSpec;
    }


    /**
     * Gets the passwordRules value for this PolicyParms.
     * 
     * @return passwordRules
     */
    public wsdl.adminV8.ig.com.entrust.PasswordRulesParms getPasswordRules() {
        return passwordRules;
    }


    /**
     * Sets the passwordRules value for this PolicyParms.
     * 
     * @param passwordRules
     */
    public void setPasswordRules(wsdl.adminV8.ig.com.entrust.PasswordRulesParms passwordRules) {
        this.passwordRules = passwordRules;
    }


    /**
     * Gets the comment value for this PolicyParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this PolicyParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyParms)) return false;
        PolicyParms other = (PolicyParms) obj;
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
            ((this.defaultPolicy==null && other.getDefaultPolicy()==null) || 
             (this.defaultPolicy!=null &&
              this.defaultPolicy.equals(other.getDefaultPolicy()))) &&
            ((this.userSpec==null && other.getUserSpec()==null) || 
             (this.userSpec!=null &&
              this.userSpec.equals(other.getUserSpec()))) &&
            ((this.cardSpec==null && other.getCardSpec()==null) || 
             (this.cardSpec!=null &&
              this.cardSpec.equals(other.getCardSpec()))) &&
            ((this.pinSpec==null && other.getPinSpec()==null) || 
             (this.pinSpec!=null &&
              this.pinSpec.equals(other.getPinSpec()))) &&
            ((this.passwordRules==null && other.getPasswordRules()==null) || 
             (this.passwordRules!=null &&
              this.passwordRules.equals(other.getPasswordRules()))) &&
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
        if (getDefaultPolicy() != null) {
            _hashCode += getDefaultPolicy().hashCode();
        }
        if (getUserSpec() != null) {
            _hashCode += getUserSpec().hashCode();
        }
        if (getCardSpec() != null) {
            _hashCode += getCardSpec().hashCode();
        }
        if (getPinSpec() != null) {
            _hashCode += getPinSpec().hashCode();
        }
        if (getPasswordRules() != null) {
            _hashCode += getPasswordRules().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PolicyParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSpecParms"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "CardSpecParms"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PINSpecParms"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PasswordRulesParms"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
