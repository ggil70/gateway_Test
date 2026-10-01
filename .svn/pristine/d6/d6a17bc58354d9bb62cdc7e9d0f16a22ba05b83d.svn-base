/**
 * LoginChallenge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class LoginChallenge  implements java.io.Serializable {
    private java.lang.String type;

    private commonV8.ig.com.entrust.ChallengeSet gridChallenge;

    private commonV8.ig.com.entrust.TokenChallenge tokenChallenge;

    public LoginChallenge() {
    }

    public LoginChallenge(
           java.lang.String type,
           commonV8.ig.com.entrust.ChallengeSet gridChallenge,
           commonV8.ig.com.entrust.TokenChallenge tokenChallenge) {
           this.type = type;
           this.gridChallenge = gridChallenge;
           this.tokenChallenge = tokenChallenge;
    }


    /**
     * Gets the type value for this LoginChallenge.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this LoginChallenge.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the gridChallenge value for this LoginChallenge.
     * 
     * @return gridChallenge
     */
    public commonV8.ig.com.entrust.ChallengeSet getGridChallenge() {
        return gridChallenge;
    }


    /**
     * Sets the gridChallenge value for this LoginChallenge.
     * 
     * @param gridChallenge
     */
    public void setGridChallenge(commonV8.ig.com.entrust.ChallengeSet gridChallenge) {
        this.gridChallenge = gridChallenge;
    }


    /**
     * Gets the tokenChallenge value for this LoginChallenge.
     * 
     * @return tokenChallenge
     */
    public commonV8.ig.com.entrust.TokenChallenge getTokenChallenge() {
        return tokenChallenge;
    }


    /**
     * Sets the tokenChallenge value for this LoginChallenge.
     * 
     * @param tokenChallenge
     */
    public void setTokenChallenge(commonV8.ig.com.entrust.TokenChallenge tokenChallenge) {
        this.tokenChallenge = tokenChallenge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginChallenge)) return false;
        LoginChallenge other = (LoginChallenge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.gridChallenge==null && other.getGridChallenge()==null) || 
             (this.gridChallenge!=null &&
              this.gridChallenge.equals(other.getGridChallenge()))) &&
            ((this.tokenChallenge==null && other.getTokenChallenge()==null) || 
             (this.tokenChallenge!=null &&
              this.tokenChallenge.equals(other.getTokenChallenge())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getGridChallenge() != null) {
            _hashCode += getGridChallenge().hashCode();
        }
        if (getTokenChallenge() != null) {
            _hashCode += getTokenChallenge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginChallenge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "LoginChallenge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gridChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gridChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "ChallengeSet"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "TokenChallenge"));
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
