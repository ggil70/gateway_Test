/**
 * SmartCredentialGraphicInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialGraphicInfoList  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicInfo[] smartCredentialGraphicInfo;

    public SmartCredentialGraphicInfoList() {
    }

    public SmartCredentialGraphicInfoList(
           wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicInfo[] smartCredentialGraphicInfo) {
           this.smartCredentialGraphicInfo = smartCredentialGraphicInfo;
    }


    /**
     * Gets the smartCredentialGraphicInfo value for this SmartCredentialGraphicInfoList.
     * 
     * @return smartCredentialGraphicInfo
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicInfo[] getSmartCredentialGraphicInfo() {
        return smartCredentialGraphicInfo;
    }


    /**
     * Sets the smartCredentialGraphicInfo value for this SmartCredentialGraphicInfoList.
     * 
     * @param smartCredentialGraphicInfo
     */
    public void setSmartCredentialGraphicInfo(wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicInfo[] smartCredentialGraphicInfo) {
        this.smartCredentialGraphicInfo = smartCredentialGraphicInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialGraphicInfoList)) return false;
        SmartCredentialGraphicInfoList other = (SmartCredentialGraphicInfoList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smartCredentialGraphicInfo==null && other.getSmartCredentialGraphicInfo()==null) || 
             (this.smartCredentialGraphicInfo!=null &&
              java.util.Arrays.equals(this.smartCredentialGraphicInfo, other.getSmartCredentialGraphicInfo())));
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
        if (getSmartCredentialGraphicInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartCredentialGraphicInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmartCredentialGraphicInfo(), i);
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
        new org.apache.axis.description.TypeDesc(SmartCredentialGraphicInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialGraphicInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialGraphicInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCredentialGraphicInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialGraphicInfo"));
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
