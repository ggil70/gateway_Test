/**
 * AdminPasswordChangeRequiredFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AdminPasswordChangeRequiredFault  extends wsdl.adminV8.ig.com.entrust.AdminServiceFault  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.PasswordRulesInfo passwordRules;

    public AdminPasswordChangeRequiredFault() {
    }

    public AdminPasswordChangeRequiredFault(
           java.lang.String errorCode,
           java.lang.String internalCode,
           java.lang.String errorMessage,
           java.lang.String id,
           wsdl.adminV8.ig.com.entrust.AdminServiceFault causeFault,
           wsdl.adminV8.ig.com.entrust.PasswordRulesInfo passwordRules) {
        super(
            errorCode,
            internalCode,
            errorMessage,
            id,
            causeFault);
        this.passwordRules = passwordRules;
    }


    /**
     * Gets the passwordRules value for this AdminPasswordChangeRequiredFault.
     * 
     * @return passwordRules
     */
    public wsdl.adminV8.ig.com.entrust.PasswordRulesInfo getPasswordRules() {
        return passwordRules;
    }


    /**
     * Sets the passwordRules value for this AdminPasswordChangeRequiredFault.
     * 
     * @param passwordRules
     */
    public void setPasswordRules(wsdl.adminV8.ig.com.entrust.PasswordRulesInfo passwordRules) {
        this.passwordRules = passwordRules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdminPasswordChangeRequiredFault)) return false;
        AdminPasswordChangeRequiredFault other = (AdminPasswordChangeRequiredFault) obj;
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
        new org.apache.axis.description.TypeDesc(AdminPasswordChangeRequiredFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AdminPasswordChangeRequiredFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PasswordRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PasswordRulesInfo"));
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
