/**
 * DeliveryConfigInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class DeliveryConfigInfoList  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.DeliveryConfigInfo[] deliveryConfigInfo;

    public DeliveryConfigInfoList() {
    }

    public DeliveryConfigInfoList(
           wsdl.adminV8.ig.com.entrust.DeliveryConfigInfo[] deliveryConfigInfo) {
           this.deliveryConfigInfo = deliveryConfigInfo;
    }


    /**
     * Gets the deliveryConfigInfo value for this DeliveryConfigInfoList.
     * 
     * @return deliveryConfigInfo
     */
    public wsdl.adminV8.ig.com.entrust.DeliveryConfigInfo[] getDeliveryConfigInfo() {
        return deliveryConfigInfo;
    }


    /**
     * Sets the deliveryConfigInfo value for this DeliveryConfigInfoList.
     * 
     * @param deliveryConfigInfo
     */
    public void setDeliveryConfigInfo(wsdl.adminV8.ig.com.entrust.DeliveryConfigInfo[] deliveryConfigInfo) {
        this.deliveryConfigInfo = deliveryConfigInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryConfigInfoList)) return false;
        DeliveryConfigInfoList other = (DeliveryConfigInfoList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryConfigInfo==null && other.getDeliveryConfigInfo()==null) || 
             (this.deliveryConfigInfo!=null &&
              java.util.Arrays.equals(this.deliveryConfigInfo, other.getDeliveryConfigInfo())));
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
        if (getDeliveryConfigInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryConfigInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryConfigInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryConfigInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DeliveryConfigInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "DeliveryConfigInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
