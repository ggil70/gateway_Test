/**
 * TokenData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package commonV8.ig.com.entrust;

public class TokenData  implements java.io.Serializable {
    private java.lang.String vendorId;

    private java.lang.String serialNumber;

    private java.lang.String set;

    private boolean supportsDataSignature;

    private boolean supportsDeliveryAndSignature;

    private java.lang.String deliveryStatus;

    public TokenData() {
    }

    public TokenData(
           java.lang.String vendorId,
           java.lang.String serialNumber,
           java.lang.String set,
           boolean supportsDataSignature,
           boolean supportsDeliveryAndSignature,
           java.lang.String deliveryStatus) {
           this.vendorId = vendorId;
           this.serialNumber = serialNumber;
           this.set = set;
           this.supportsDataSignature = supportsDataSignature;
           this.supportsDeliveryAndSignature = supportsDeliveryAndSignature;
           this.deliveryStatus = deliveryStatus;
    }


    /**
     * Gets the vendorId value for this TokenData.
     * 
     * @return vendorId
     */
    public java.lang.String getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this TokenData.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.String vendorId) {
        this.vendorId = vendorId;
    }


    /**
     * Gets the serialNumber value for this TokenData.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this TokenData.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the set value for this TokenData.
     * 
     * @return set
     */
    public java.lang.String getSet() {
        return set;
    }


    /**
     * Sets the set value for this TokenData.
     * 
     * @param set
     */
    public void setSet(java.lang.String set) {
        this.set = set;
    }


    /**
     * Gets the supportsDataSignature value for this TokenData.
     * 
     * @return supportsDataSignature
     */
    public boolean isSupportsDataSignature() {
        return supportsDataSignature;
    }


    /**
     * Sets the supportsDataSignature value for this TokenData.
     * 
     * @param supportsDataSignature
     */
    public void setSupportsDataSignature(boolean supportsDataSignature) {
        this.supportsDataSignature = supportsDataSignature;
    }


    /**
     * Gets the supportsDeliveryAndSignature value for this TokenData.
     * 
     * @return supportsDeliveryAndSignature
     */
    public boolean isSupportsDeliveryAndSignature() {
        return supportsDeliveryAndSignature;
    }


    /**
     * Sets the supportsDeliveryAndSignature value for this TokenData.
     * 
     * @param supportsDeliveryAndSignature
     */
    public void setSupportsDeliveryAndSignature(boolean supportsDeliveryAndSignature) {
        this.supportsDeliveryAndSignature = supportsDeliveryAndSignature;
    }


    /**
     * Gets the deliveryStatus value for this TokenData.
     * 
     * @return deliveryStatus
     */
    public java.lang.String getDeliveryStatus() {
        return deliveryStatus;
    }


    /**
     * Sets the deliveryStatus value for this TokenData.
     * 
     * @param deliveryStatus
     */
    public void setDeliveryStatus(java.lang.String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenData)) return false;
        TokenData other = (TokenData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.set==null && other.getSet()==null) || 
             (this.set!=null &&
              this.set.equals(other.getSet()))) &&
            this.supportsDataSignature == other.isSupportsDataSignature() &&
            this.supportsDeliveryAndSignature == other.isSupportsDeliveryAndSignature() &&
            ((this.deliveryStatus==null && other.getDeliveryStatus()==null) || 
             (this.deliveryStatus!=null &&
              this.deliveryStatus.equals(other.getDeliveryStatus())));
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
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSet() != null) {
            _hashCode += getSet().hashCode();
        }
        _hashCode += (isSupportsDataSignature() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSupportsDeliveryAndSignature() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeliveryStatus() != null) {
            _hashCode += getDeliveryStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "TokenData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VendorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsDataSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SupportsDataSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsDeliveryAndSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SupportsDeliveryAndSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryStatus"));
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
