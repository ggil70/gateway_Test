/**
 * UserFederationGetCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserFederationGetCallParms  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String originatorFederationName;

    private wsdl.adminV8.ig.com.entrust.UserFederationFilter filter;

    public UserFederationGetCallParms() {
    }

    public UserFederationGetCallParms(
           java.lang.String userid,
           java.lang.String originatorFederationName,
           wsdl.adminV8.ig.com.entrust.UserFederationFilter filter) {
           this.userid = userid;
           this.originatorFederationName = originatorFederationName;
           this.filter = filter;
    }


    /**
     * Gets the userid value for this UserFederationGetCallParms.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserFederationGetCallParms.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the originatorFederationName value for this UserFederationGetCallParms.
     * 
     * @return originatorFederationName
     */
    public java.lang.String getOriginatorFederationName() {
        return originatorFederationName;
    }


    /**
     * Sets the originatorFederationName value for this UserFederationGetCallParms.
     * 
     * @param originatorFederationName
     */
    public void setOriginatorFederationName(java.lang.String originatorFederationName) {
        this.originatorFederationName = originatorFederationName;
    }


    /**
     * Gets the filter value for this UserFederationGetCallParms.
     * 
     * @return filter
     */
    public wsdl.adminV8.ig.com.entrust.UserFederationFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this UserFederationGetCallParms.
     * 
     * @param filter
     */
    public void setFilter(wsdl.adminV8.ig.com.entrust.UserFederationFilter filter) {
        this.filter = filter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFederationGetCallParms)) return false;
        UserFederationGetCallParms other = (UserFederationGetCallParms) obj;
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
            ((this.originatorFederationName==null && other.getOriginatorFederationName()==null) || 
             (this.originatorFederationName!=null &&
              this.originatorFederationName.equals(other.getOriginatorFederationName()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter())));
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
        if (getOriginatorFederationName() != null) {
            _hashCode += getOriginatorFederationName().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserFederationGetCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserFederationGetCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatorFederationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originatorFederationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserFederationFilter"));
        elemField.setNillable(false);
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
