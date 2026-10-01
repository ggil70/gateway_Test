/**
 * UserTokenUnlockCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserTokenUnlockCallParms  implements java.io.Serializable {
    private java.lang.String userid;

    private wsdl.adminV8.ig.com.entrust.UserTokenFilter filter;

    private java.lang.String challenge;

    public UserTokenUnlockCallParms() {
    }

    public UserTokenUnlockCallParms(
           java.lang.String userid,
           wsdl.adminV8.ig.com.entrust.UserTokenFilter filter,
           java.lang.String challenge) {
           this.userid = userid;
           this.filter = filter;
           this.challenge = challenge;
    }


    /**
     * Gets the userid value for this UserTokenUnlockCallParms.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserTokenUnlockCallParms.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the filter value for this UserTokenUnlockCallParms.
     * 
     * @return filter
     */
    public wsdl.adminV8.ig.com.entrust.UserTokenFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this UserTokenUnlockCallParms.
     * 
     * @param filter
     */
    public void setFilter(wsdl.adminV8.ig.com.entrust.UserTokenFilter filter) {
        this.filter = filter;
    }


    /**
     * Gets the challenge value for this UserTokenUnlockCallParms.
     * 
     * @return challenge
     */
    public java.lang.String getChallenge() {
        return challenge;
    }


    /**
     * Sets the challenge value for this UserTokenUnlockCallParms.
     * 
     * @param challenge
     */
    public void setChallenge(java.lang.String challenge) {
        this.challenge = challenge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTokenUnlockCallParms)) return false;
        UserTokenUnlockCallParms other = (UserTokenUnlockCallParms) obj;
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
            ((this.challenge==null && other.getChallenge()==null) || 
             (this.challenge!=null &&
              this.challenge.equals(other.getChallenge())));
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
        if (getChallenge() != null) {
            _hashCode += getChallenge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTokenUnlockCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserTokenUnlockCallParms"));
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
        elemField.setFieldName("challenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "challenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
