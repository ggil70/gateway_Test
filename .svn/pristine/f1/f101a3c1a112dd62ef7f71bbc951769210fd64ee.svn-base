/**
 * UserDigitalIdCreateRecoverPolicyGetResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserDigitalIdCreateRecoverPolicyGetResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicy[] digitalIdCreateRecoverPolicy;

    private java.lang.Boolean digitalIdExistsOnManagedCa;

    private java.lang.String[] rolesGrantingAccess;

    public UserDigitalIdCreateRecoverPolicyGetResult() {
    }

    public UserDigitalIdCreateRecoverPolicyGetResult(
           wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicy[] digitalIdCreateRecoverPolicy,
           java.lang.Boolean digitalIdExistsOnManagedCa,
           java.lang.String[] rolesGrantingAccess) {
           this.digitalIdCreateRecoverPolicy = digitalIdCreateRecoverPolicy;
           this.digitalIdExistsOnManagedCa = digitalIdExistsOnManagedCa;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the digitalIdCreateRecoverPolicy value for this UserDigitalIdCreateRecoverPolicyGetResult.
     * 
     * @return digitalIdCreateRecoverPolicy
     */
    public wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicy[] getDigitalIdCreateRecoverPolicy() {
        return digitalIdCreateRecoverPolicy;
    }


    /**
     * Sets the digitalIdCreateRecoverPolicy value for this UserDigitalIdCreateRecoverPolicyGetResult.
     * 
     * @param digitalIdCreateRecoverPolicy
     */
    public void setDigitalIdCreateRecoverPolicy(wsdl.adminV8.ig.com.entrust.DigitalIdCertStreamPolicy[] digitalIdCreateRecoverPolicy) {
        this.digitalIdCreateRecoverPolicy = digitalIdCreateRecoverPolicy;
    }


    /**
     * Gets the digitalIdExistsOnManagedCa value for this UserDigitalIdCreateRecoverPolicyGetResult.
     * 
     * @return digitalIdExistsOnManagedCa
     */
    public java.lang.Boolean getDigitalIdExistsOnManagedCa() {
        return digitalIdExistsOnManagedCa;
    }


    /**
     * Sets the digitalIdExistsOnManagedCa value for this UserDigitalIdCreateRecoverPolicyGetResult.
     * 
     * @param digitalIdExistsOnManagedCa
     */
    public void setDigitalIdExistsOnManagedCa(java.lang.Boolean digitalIdExistsOnManagedCa) {
        this.digitalIdExistsOnManagedCa = digitalIdExistsOnManagedCa;
    }


    /**
     * Gets the rolesGrantingAccess value for this UserDigitalIdCreateRecoverPolicyGetResult.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this UserDigitalIdCreateRecoverPolicyGetResult.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDigitalIdCreateRecoverPolicyGetResult)) return false;
        UserDigitalIdCreateRecoverPolicyGetResult other = (UserDigitalIdCreateRecoverPolicyGetResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.digitalIdCreateRecoverPolicy==null && other.getDigitalIdCreateRecoverPolicy()==null) || 
             (this.digitalIdCreateRecoverPolicy!=null &&
              java.util.Arrays.equals(this.digitalIdCreateRecoverPolicy, other.getDigitalIdCreateRecoverPolicy()))) &&
            ((this.digitalIdExistsOnManagedCa==null && other.getDigitalIdExistsOnManagedCa()==null) || 
             (this.digitalIdExistsOnManagedCa!=null &&
              this.digitalIdExistsOnManagedCa.equals(other.getDigitalIdExistsOnManagedCa()))) &&
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
        if (getDigitalIdCreateRecoverPolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDigitalIdCreateRecoverPolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDigitalIdCreateRecoverPolicy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDigitalIdExistsOnManagedCa() != null) {
            _hashCode += getDigitalIdExistsOnManagedCa().hashCode();
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
        new org.apache.axis.description.TypeDesc(UserDigitalIdCreateRecoverPolicyGetResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserDigitalIdCreateRecoverPolicyGetResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalIdCreateRecoverPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DigitalIdCreateRecoverPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DigitalIdCertStreamPolicy"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalIdExistsOnManagedCa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DigitalIdExistsOnManagedCa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesGrantingAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RolesGrantingAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
