/**
 * UserFederationSetParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserFederationSetParms  implements java.io.Serializable {
    private java.lang.String originatorFederationName;

    private java.lang.String receiverFederationName;

    private java.lang.String comment;

    public UserFederationSetParms() {
    }

    public UserFederationSetParms(
           java.lang.String originatorFederationName,
           java.lang.String receiverFederationName,
           java.lang.String comment) {
           this.originatorFederationName = originatorFederationName;
           this.receiverFederationName = receiverFederationName;
           this.comment = comment;
    }


    /**
     * Gets the originatorFederationName value for this UserFederationSetParms.
     * 
     * @return originatorFederationName
     */
    public java.lang.String getOriginatorFederationName() {
        return originatorFederationName;
    }


    /**
     * Sets the originatorFederationName value for this UserFederationSetParms.
     * 
     * @param originatorFederationName
     */
    public void setOriginatorFederationName(java.lang.String originatorFederationName) {
        this.originatorFederationName = originatorFederationName;
    }


    /**
     * Gets the receiverFederationName value for this UserFederationSetParms.
     * 
     * @return receiverFederationName
     */
    public java.lang.String getReceiverFederationName() {
        return receiverFederationName;
    }


    /**
     * Sets the receiverFederationName value for this UserFederationSetParms.
     * 
     * @param receiverFederationName
     */
    public void setReceiverFederationName(java.lang.String receiverFederationName) {
        this.receiverFederationName = receiverFederationName;
    }


    /**
     * Gets the comment value for this UserFederationSetParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserFederationSetParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFederationSetParms)) return false;
        UserFederationSetParms other = (UserFederationSetParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originatorFederationName==null && other.getOriginatorFederationName()==null) || 
             (this.originatorFederationName!=null &&
              this.originatorFederationName.equals(other.getOriginatorFederationName()))) &&
            ((this.receiverFederationName==null && other.getReceiverFederationName()==null) || 
             (this.receiverFederationName!=null &&
              this.receiverFederationName.equals(other.getReceiverFederationName()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getOriginatorFederationName() != null) {
            _hashCode += getOriginatorFederationName().hashCode();
        }
        if (getReceiverFederationName() != null) {
            _hashCode += getReceiverFederationName().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserFederationSetParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserFederationSetParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatorFederationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OriginatorFederationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverFederationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReceiverFederationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comment"));
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
