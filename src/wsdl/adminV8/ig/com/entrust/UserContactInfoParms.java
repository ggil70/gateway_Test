/**
 * UserContactInfoParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserContactInfoParms  implements java.io.Serializable {
    private java.lang.String contactInfoLabel;

    private java.lang.String originalLabel;

    private java.lang.String value;

    private java.lang.String deliveryConfigLabel;

    private java.lang.Boolean defaultContactInfo;

    public UserContactInfoParms() {
    }

    public UserContactInfoParms(
           java.lang.String contactInfoLabel,
           java.lang.String originalLabel,
           java.lang.String value,
           java.lang.String deliveryConfigLabel,
           java.lang.Boolean defaultContactInfo) {
           this.contactInfoLabel = contactInfoLabel;
           this.originalLabel = originalLabel;
           this.value = value;
           this.deliveryConfigLabel = deliveryConfigLabel;
           this.defaultContactInfo = defaultContactInfo;
    }


    /**
     * Gets the contactInfoLabel value for this UserContactInfoParms.
     * 
     * @return contactInfoLabel
     */
    public java.lang.String getContactInfoLabel() {
        return contactInfoLabel;
    }


    /**
     * Sets the contactInfoLabel value for this UserContactInfoParms.
     * 
     * @param contactInfoLabel
     */
    public void setContactInfoLabel(java.lang.String contactInfoLabel) {
        this.contactInfoLabel = contactInfoLabel;
    }


    /**
     * Gets the originalLabel value for this UserContactInfoParms.
     * 
     * @return originalLabel
     */
    public java.lang.String getOriginalLabel() {
        return originalLabel;
    }


    /**
     * Sets the originalLabel value for this UserContactInfoParms.
     * 
     * @param originalLabel
     */
    public void setOriginalLabel(java.lang.String originalLabel) {
        this.originalLabel = originalLabel;
    }


    /**
     * Gets the value value for this UserContactInfoParms.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this UserContactInfoParms.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the deliveryConfigLabel value for this UserContactInfoParms.
     * 
     * @return deliveryConfigLabel
     */
    public java.lang.String getDeliveryConfigLabel() {
        return deliveryConfigLabel;
    }


    /**
     * Sets the deliveryConfigLabel value for this UserContactInfoParms.
     * 
     * @param deliveryConfigLabel
     */
    public void setDeliveryConfigLabel(java.lang.String deliveryConfigLabel) {
        this.deliveryConfigLabel = deliveryConfigLabel;
    }


    /**
     * Gets the defaultContactInfo value for this UserContactInfoParms.
     * 
     * @return defaultContactInfo
     */
    public java.lang.Boolean getDefaultContactInfo() {
        return defaultContactInfo;
    }


    /**
     * Sets the defaultContactInfo value for this UserContactInfoParms.
     * 
     * @param defaultContactInfo
     */
    public void setDefaultContactInfo(java.lang.Boolean defaultContactInfo) {
        this.defaultContactInfo = defaultContactInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserContactInfoParms)) return false;
        UserContactInfoParms other = (UserContactInfoParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactInfoLabel==null && other.getContactInfoLabel()==null) || 
             (this.contactInfoLabel!=null &&
              this.contactInfoLabel.equals(other.getContactInfoLabel()))) &&
            ((this.originalLabel==null && other.getOriginalLabel()==null) || 
             (this.originalLabel!=null &&
              this.originalLabel.equals(other.getOriginalLabel()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.deliveryConfigLabel==null && other.getDeliveryConfigLabel()==null) || 
             (this.deliveryConfigLabel!=null &&
              this.deliveryConfigLabel.equals(other.getDeliveryConfigLabel()))) &&
            ((this.defaultContactInfo==null && other.getDefaultContactInfo()==null) || 
             (this.defaultContactInfo!=null &&
              this.defaultContactInfo.equals(other.getDefaultContactInfo())));
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
        if (getContactInfoLabel() != null) {
            _hashCode += getContactInfoLabel().hashCode();
        }
        if (getOriginalLabel() != null) {
            _hashCode += getOriginalLabel().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getDeliveryConfigLabel() != null) {
            _hashCode += getDeliveryConfigLabel().hashCode();
        }
        if (getDefaultContactInfo() != null) {
            _hashCode += getDefaultContactInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserContactInfoParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserContactInfoParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactInfoLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactInfoLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryConfigLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryConfigLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultContactInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultContactInfo"));
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
