/**
 * UserDigitalIdSetParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserDigitalIdSetParms  implements java.io.Serializable {
    private java.lang.String[] removeClientTypes;

    private java.lang.String comment;

    public UserDigitalIdSetParms() {
    }

    public UserDigitalIdSetParms(
           java.lang.String[] removeClientTypes,
           java.lang.String comment) {
           this.removeClientTypes = removeClientTypes;
           this.comment = comment;
    }


    /**
     * Gets the removeClientTypes value for this UserDigitalIdSetParms.
     * 
     * @return removeClientTypes
     */
    public java.lang.String[] getRemoveClientTypes() {
        return removeClientTypes;
    }


    /**
     * Sets the removeClientTypes value for this UserDigitalIdSetParms.
     * 
     * @param removeClientTypes
     */
    public void setRemoveClientTypes(java.lang.String[] removeClientTypes) {
        this.removeClientTypes = removeClientTypes;
    }


    /**
     * Gets the comment value for this UserDigitalIdSetParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserDigitalIdSetParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDigitalIdSetParms)) return false;
        UserDigitalIdSetParms other = (UserDigitalIdSetParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.removeClientTypes==null && other.getRemoveClientTypes()==null) || 
             (this.removeClientTypes!=null &&
              java.util.Arrays.equals(this.removeClientTypes, other.getRemoveClientTypes()))) &&
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
        if (getRemoveClientTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoveClientTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoveClientTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDigitalIdSetParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserDigitalIdSetParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeClientTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RemoveClientTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
