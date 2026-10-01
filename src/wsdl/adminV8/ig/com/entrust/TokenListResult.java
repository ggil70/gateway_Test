/**
 * TokenListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class TokenListResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.TokenInfo[] tokens;

    private java.lang.String nextTokenVendorId;

    private java.lang.String nextTokenSerialNumber;

    public TokenListResult() {
    }

    public TokenListResult(
           wsdl.adminV8.ig.com.entrust.TokenInfo[] tokens,
           java.lang.String nextTokenVendorId,
           java.lang.String nextTokenSerialNumber) {
           this.tokens = tokens;
           this.nextTokenVendorId = nextTokenVendorId;
           this.nextTokenSerialNumber = nextTokenSerialNumber;
    }


    /**
     * Gets the tokens value for this TokenListResult.
     * 
     * @return tokens
     */
    public wsdl.adminV8.ig.com.entrust.TokenInfo[] getTokens() {
        return tokens;
    }


    /**
     * Sets the tokens value for this TokenListResult.
     * 
     * @param tokens
     */
    public void setTokens(wsdl.adminV8.ig.com.entrust.TokenInfo[] tokens) {
        this.tokens = tokens;
    }


    /**
     * Gets the nextTokenVendorId value for this TokenListResult.
     * 
     * @return nextTokenVendorId
     */
    public java.lang.String getNextTokenVendorId() {
        return nextTokenVendorId;
    }


    /**
     * Sets the nextTokenVendorId value for this TokenListResult.
     * 
     * @param nextTokenVendorId
     */
    public void setNextTokenVendorId(java.lang.String nextTokenVendorId) {
        this.nextTokenVendorId = nextTokenVendorId;
    }


    /**
     * Gets the nextTokenSerialNumber value for this TokenListResult.
     * 
     * @return nextTokenSerialNumber
     */
    public java.lang.String getNextTokenSerialNumber() {
        return nextTokenSerialNumber;
    }


    /**
     * Sets the nextTokenSerialNumber value for this TokenListResult.
     * 
     * @param nextTokenSerialNumber
     */
    public void setNextTokenSerialNumber(java.lang.String nextTokenSerialNumber) {
        this.nextTokenSerialNumber = nextTokenSerialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenListResult)) return false;
        TokenListResult other = (TokenListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tokens==null && other.getTokens()==null) || 
             (this.tokens!=null &&
              java.util.Arrays.equals(this.tokens, other.getTokens()))) &&
            ((this.nextTokenVendorId==null && other.getNextTokenVendorId()==null) || 
             (this.nextTokenVendorId!=null &&
              this.nextTokenVendorId.equals(other.getNextTokenVendorId()))) &&
            ((this.nextTokenSerialNumber==null && other.getNextTokenSerialNumber()==null) || 
             (this.nextTokenSerialNumber!=null &&
              this.nextTokenSerialNumber.equals(other.getNextTokenSerialNumber())));
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
        if (getTokens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTokens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTokens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextTokenVendorId() != null) {
            _hashCode += getNextTokenVendorId().hashCode();
        }
        if (getNextTokenSerialNumber() != null) {
            _hashCode += getNextTokenSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "TokenListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "TokenInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextTokenVendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextTokenVendorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextTokenSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextTokenSerialNumber"));
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
