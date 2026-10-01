/**
 * UserLockoutParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserLockoutParms  implements java.io.Serializable {
    private java.lang.Boolean clearlockout;

    private java.lang.Boolean increaseLockout;

    private wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutId[] authenticatorLockoutIds;

    public UserLockoutParms() {
    }

    public UserLockoutParms(
           java.lang.Boolean clearlockout,
           java.lang.Boolean increaseLockout,
           wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutId[] authenticatorLockoutIds) {
           this.clearlockout = clearlockout;
           this.increaseLockout = increaseLockout;
           this.authenticatorLockoutIds = authenticatorLockoutIds;
    }


    /**
     * Gets the clearlockout value for this UserLockoutParms.
     * 
     * @return clearlockout
     */
    public java.lang.Boolean getClearlockout() {
        return clearlockout;
    }


    /**
     * Sets the clearlockout value for this UserLockoutParms.
     * 
     * @param clearlockout
     */
    public void setClearlockout(java.lang.Boolean clearlockout) {
        this.clearlockout = clearlockout;
    }


    /**
     * Gets the increaseLockout value for this UserLockoutParms.
     * 
     * @return increaseLockout
     */
    public java.lang.Boolean getIncreaseLockout() {
        return increaseLockout;
    }


    /**
     * Sets the increaseLockout value for this UserLockoutParms.
     * 
     * @param increaseLockout
     */
    public void setIncreaseLockout(java.lang.Boolean increaseLockout) {
        this.increaseLockout = increaseLockout;
    }


    /**
     * Gets the authenticatorLockoutIds value for this UserLockoutParms.
     * 
     * @return authenticatorLockoutIds
     */
    public wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutId[] getAuthenticatorLockoutIds() {
        return authenticatorLockoutIds;
    }


    /**
     * Sets the authenticatorLockoutIds value for this UserLockoutParms.
     * 
     * @param authenticatorLockoutIds
     */
    public void setAuthenticatorLockoutIds(wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutId[] authenticatorLockoutIds) {
        this.authenticatorLockoutIds = authenticatorLockoutIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserLockoutParms)) return false;
        UserLockoutParms other = (UserLockoutParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clearlockout==null && other.getClearlockout()==null) || 
             (this.clearlockout!=null &&
              this.clearlockout.equals(other.getClearlockout()))) &&
            ((this.increaseLockout==null && other.getIncreaseLockout()==null) || 
             (this.increaseLockout!=null &&
              this.increaseLockout.equals(other.getIncreaseLockout()))) &&
            ((this.authenticatorLockoutIds==null && other.getAuthenticatorLockoutIds()==null) || 
             (this.authenticatorLockoutIds!=null &&
              java.util.Arrays.equals(this.authenticatorLockoutIds, other.getAuthenticatorLockoutIds())));
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
        if (getClearlockout() != null) {
            _hashCode += getClearlockout().hashCode();
        }
        if (getIncreaseLockout() != null) {
            _hashCode += getIncreaseLockout().hashCode();
        }
        if (getAuthenticatorLockoutIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthenticatorLockoutIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthenticatorLockoutIds(), i);
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
        new org.apache.axis.description.TypeDesc(UserLockoutParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserLockoutParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearlockout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Clearlockout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("increaseLockout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncreaseLockout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticatorLockoutIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthenticatorLockoutIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuthenticatorLockoutId"));
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
