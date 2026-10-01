/**
 * UserFederationFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserFederationFilter  implements java.io.Serializable {
    private java.lang.String[] types;

    private java.lang.String partnerID;

    private java.lang.Boolean originator;

    public UserFederationFilter() {
    }

    public UserFederationFilter(
           java.lang.String[] types,
           java.lang.String partnerID,
           java.lang.Boolean originator) {
           this.types = types;
           this.partnerID = partnerID;
           this.originator = originator;
    }


    /**
     * Gets the types value for this UserFederationFilter.
     * 
     * @return types
     */
    public java.lang.String[] getTypes() {
        return types;
    }


    /**
     * Sets the types value for this UserFederationFilter.
     * 
     * @param types
     */
    public void setTypes(java.lang.String[] types) {
        this.types = types;
    }


    /**
     * Gets the partnerID value for this UserFederationFilter.
     * 
     * @return partnerID
     */
    public java.lang.String getPartnerID() {
        return partnerID;
    }


    /**
     * Sets the partnerID value for this UserFederationFilter.
     * 
     * @param partnerID
     */
    public void setPartnerID(java.lang.String partnerID) {
        this.partnerID = partnerID;
    }


    /**
     * Gets the originator value for this UserFederationFilter.
     * 
     * @return originator
     */
    public java.lang.Boolean getOriginator() {
        return originator;
    }


    /**
     * Sets the originator value for this UserFederationFilter.
     * 
     * @param originator
     */
    public void setOriginator(java.lang.Boolean originator) {
        this.originator = originator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFederationFilter)) return false;
        UserFederationFilter other = (UserFederationFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.types==null && other.getTypes()==null) || 
             (this.types!=null &&
              java.util.Arrays.equals(this.types, other.getTypes()))) &&
            ((this.partnerID==null && other.getPartnerID()==null) || 
             (this.partnerID!=null &&
              this.partnerID.equals(other.getPartnerID()))) &&
            ((this.originator==null && other.getOriginator()==null) || 
             (this.originator!=null &&
              this.originator.equals(other.getOriginator())));
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
        if (getTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerID() != null) {
            _hashCode += getPartnerID().hashCode();
        }
        if (getOriginator() != null) {
            _hashCode += getOriginator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserFederationFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserFederationFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Originator"));
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
