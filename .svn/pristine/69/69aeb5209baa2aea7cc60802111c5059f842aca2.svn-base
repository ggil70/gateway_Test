/**
 * ChallengeAuthenticateCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ChallengeAuthenticateCallParms  implements java.io.Serializable {
    private java.lang.String userid;

    private wsdl.adminV8.ig.com.entrust.UserCardFilter cardFilter;

    private java.lang.String[] response;

    private java.lang.Boolean obeyLockout;

    public ChallengeAuthenticateCallParms() {
    }

    public ChallengeAuthenticateCallParms(
           java.lang.String userid,
           wsdl.adminV8.ig.com.entrust.UserCardFilter cardFilter,
           java.lang.String[] response,
           java.lang.Boolean obeyLockout) {
           this.userid = userid;
           this.cardFilter = cardFilter;
           this.response = response;
           this.obeyLockout = obeyLockout;
    }


    /**
     * Gets the userid value for this ChallengeAuthenticateCallParms.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this ChallengeAuthenticateCallParms.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the cardFilter value for this ChallengeAuthenticateCallParms.
     * 
     * @return cardFilter
     */
    public wsdl.adminV8.ig.com.entrust.UserCardFilter getCardFilter() {
        return cardFilter;
    }


    /**
     * Sets the cardFilter value for this ChallengeAuthenticateCallParms.
     * 
     * @param cardFilter
     */
    public void setCardFilter(wsdl.adminV8.ig.com.entrust.UserCardFilter cardFilter) {
        this.cardFilter = cardFilter;
    }


    /**
     * Gets the response value for this ChallengeAuthenticateCallParms.
     * 
     * @return response
     */
    public java.lang.String[] getResponse() {
        return response;
    }


    /**
     * Sets the response value for this ChallengeAuthenticateCallParms.
     * 
     * @param response
     */
    public void setResponse(java.lang.String[] response) {
        this.response = response;
    }


    /**
     * Gets the obeyLockout value for this ChallengeAuthenticateCallParms.
     * 
     * @return obeyLockout
     */
    public java.lang.Boolean getObeyLockout() {
        return obeyLockout;
    }


    /**
     * Sets the obeyLockout value for this ChallengeAuthenticateCallParms.
     * 
     * @param obeyLockout
     */
    public void setObeyLockout(java.lang.Boolean obeyLockout) {
        this.obeyLockout = obeyLockout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChallengeAuthenticateCallParms)) return false;
        ChallengeAuthenticateCallParms other = (ChallengeAuthenticateCallParms) obj;
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
            ((this.cardFilter==null && other.getCardFilter()==null) || 
             (this.cardFilter!=null &&
              this.cardFilter.equals(other.getCardFilter()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              java.util.Arrays.equals(this.response, other.getResponse()))) &&
            ((this.obeyLockout==null && other.getObeyLockout()==null) || 
             (this.obeyLockout!=null &&
              this.obeyLockout.equals(other.getObeyLockout())));
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
        if (getCardFilter() != null) {
            _hashCode += getCardFilter().hashCode();
        }
        if (getResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObeyLockout() != null) {
            _hashCode += getObeyLockout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChallengeAuthenticateCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ChallengeAuthenticateCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserCardFilter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obeyLockout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obeyLockout"));
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
