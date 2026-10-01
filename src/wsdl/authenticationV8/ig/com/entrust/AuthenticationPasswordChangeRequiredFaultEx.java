/**
 * AuthenticationPasswordChangeRequiredFaultEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.authenticationV8.ig.com.entrust;

public class AuthenticationPasswordChangeRequiredFaultEx  extends wsdl.authenticationV8.ig.com.entrust.AuthenticationFault  implements java.io.Serializable {
    private commonV8.ig.com.entrust.PasswordRulesEx passwordRules;

    public AuthenticationPasswordChangeRequiredFaultEx() {
    }

    public AuthenticationPasswordChangeRequiredFaultEx(
           java.lang.String errorCode,
           java.lang.String internalCode,
           java.lang.String errorMessage,
           java.lang.String id,
           commonV8.ig.com.entrust.PasswordRulesEx passwordRules) {
        super(
            errorCode,
            internalCode,
            errorMessage,
            id);
        this.passwordRules = passwordRules;
    }


    /**
     * Gets the passwordRules value for this AuthenticationPasswordChangeRequiredFaultEx.
     * 
     * @return passwordRules
     */
    public commonV8.ig.com.entrust.PasswordRulesEx getPasswordRules() {
        return passwordRules;
    }


    /**
     * Sets the passwordRules value for this AuthenticationPasswordChangeRequiredFaultEx.
     * 
     * @param passwordRules
     */
    public void setPasswordRules(commonV8.ig.com.entrust.PasswordRulesEx passwordRules) {
        this.passwordRules = passwordRules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationPasswordChangeRequiredFaultEx)) return false;
        AuthenticationPasswordChangeRequiredFaultEx other = (AuthenticationPasswordChangeRequiredFaultEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.passwordRules==null && other.getPasswordRules()==null) || 
             (this.passwordRules!=null &&
              this.passwordRules.equals(other.getPasswordRules())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPasswordRules() != null) {
            _hashCode += getPasswordRules().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationPasswordChangeRequiredFaultEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:authenticationV8:wsdl", "AuthenticationPasswordChangeRequiredFaultEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PasswordRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "PasswordRulesEx"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
