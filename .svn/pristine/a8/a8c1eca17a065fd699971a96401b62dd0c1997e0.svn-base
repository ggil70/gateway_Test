/**
 * UserTokenActivateCompleteCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserTokenActivateCompleteCallParms  implements java.io.Serializable {
    private java.lang.String userid;

    private wsdl.adminV8.ig.com.entrust.UserTokenFilter filter;

    private commonV8.ig.com.entrust.NameValue[] activationParms;

    public UserTokenActivateCompleteCallParms() {
    }

    public UserTokenActivateCompleteCallParms(
           java.lang.String userid,
           wsdl.adminV8.ig.com.entrust.UserTokenFilter filter,
           commonV8.ig.com.entrust.NameValue[] activationParms) {
           this.userid = userid;
           this.filter = filter;
           this.activationParms = activationParms;
    }


    /**
     * Gets the userid value for this UserTokenActivateCompleteCallParms.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserTokenActivateCompleteCallParms.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the filter value for this UserTokenActivateCompleteCallParms.
     * 
     * @return filter
     */
    public wsdl.adminV8.ig.com.entrust.UserTokenFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this UserTokenActivateCompleteCallParms.
     * 
     * @param filter
     */
    public void setFilter(wsdl.adminV8.ig.com.entrust.UserTokenFilter filter) {
        this.filter = filter;
    }


    /**
     * Gets the activationParms value for this UserTokenActivateCompleteCallParms.
     * 
     * @return activationParms
     */
    public commonV8.ig.com.entrust.NameValue[] getActivationParms() {
        return activationParms;
    }


    /**
     * Sets the activationParms value for this UserTokenActivateCompleteCallParms.
     * 
     * @param activationParms
     */
    public void setActivationParms(commonV8.ig.com.entrust.NameValue[] activationParms) {
        this.activationParms = activationParms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTokenActivateCompleteCallParms)) return false;
        UserTokenActivateCompleteCallParms other = (UserTokenActivateCompleteCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.activationParms==null && other.getActivationParms()==null) || 
             (this.activationParms!=null &&
              java.util.Arrays.equals(this.activationParms, other.getActivationParms())));
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
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getActivationParms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivationParms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivationParms(), i);
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
        new org.apache.axis.description.TypeDesc(UserTokenActivateCompleteCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserTokenActivateCompleteCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserTokenFilter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationParms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activationParms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "NameValue"));
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
