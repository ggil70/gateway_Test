/**
 * UserOTPDeliverResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserOTPDeliverResult  implements java.io.Serializable {
    private java.lang.String[] deliveryPassed;

    private java.lang.String[] deliveryFailed;

    private wsdl.adminV8.ig.com.entrust.AdminServiceFault[] deliveryFailedReason;

    public UserOTPDeliverResult() {
    }

    public UserOTPDeliverResult(
           java.lang.String[] deliveryPassed,
           java.lang.String[] deliveryFailed,
           wsdl.adminV8.ig.com.entrust.AdminServiceFault[] deliveryFailedReason) {
           this.deliveryPassed = deliveryPassed;
           this.deliveryFailed = deliveryFailed;
           this.deliveryFailedReason = deliveryFailedReason;
    }


    /**
     * Gets the deliveryPassed value for this UserOTPDeliverResult.
     * 
     * @return deliveryPassed
     */
    public java.lang.String[] getDeliveryPassed() {
        return deliveryPassed;
    }


    /**
     * Sets the deliveryPassed value for this UserOTPDeliverResult.
     * 
     * @param deliveryPassed
     */
    public void setDeliveryPassed(java.lang.String[] deliveryPassed) {
        this.deliveryPassed = deliveryPassed;
    }


    /**
     * Gets the deliveryFailed value for this UserOTPDeliverResult.
     * 
     * @return deliveryFailed
     */
    public java.lang.String[] getDeliveryFailed() {
        return deliveryFailed;
    }


    /**
     * Sets the deliveryFailed value for this UserOTPDeliverResult.
     * 
     * @param deliveryFailed
     */
    public void setDeliveryFailed(java.lang.String[] deliveryFailed) {
        this.deliveryFailed = deliveryFailed;
    }


    /**
     * Gets the deliveryFailedReason value for this UserOTPDeliverResult.
     * 
     * @return deliveryFailedReason
     */
    public wsdl.adminV8.ig.com.entrust.AdminServiceFault[] getDeliveryFailedReason() {
        return deliveryFailedReason;
    }


    /**
     * Sets the deliveryFailedReason value for this UserOTPDeliverResult.
     * 
     * @param deliveryFailedReason
     */
    public void setDeliveryFailedReason(wsdl.adminV8.ig.com.entrust.AdminServiceFault[] deliveryFailedReason) {
        this.deliveryFailedReason = deliveryFailedReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserOTPDeliverResult)) return false;
        UserOTPDeliverResult other = (UserOTPDeliverResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryPassed==null && other.getDeliveryPassed()==null) || 
             (this.deliveryPassed!=null &&
              java.util.Arrays.equals(this.deliveryPassed, other.getDeliveryPassed()))) &&
            ((this.deliveryFailed==null && other.getDeliveryFailed()==null) || 
             (this.deliveryFailed!=null &&
              java.util.Arrays.equals(this.deliveryFailed, other.getDeliveryFailed()))) &&
            ((this.deliveryFailedReason==null && other.getDeliveryFailedReason()==null) || 
             (this.deliveryFailedReason!=null &&
              java.util.Arrays.equals(this.deliveryFailedReason, other.getDeliveryFailedReason())));
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
        if (getDeliveryPassed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryPassed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryPassed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryFailed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryFailed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryFailed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryFailedReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryFailedReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryFailedReason(), i);
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
        new org.apache.axis.description.TypeDesc(UserOTPDeliverResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserOTPDeliverResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPassed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryPassed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryFailedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryFailedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AdminServiceFault"));
        elemField.setNillable(true);
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
