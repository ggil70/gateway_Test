/**
 * SmartCredentialLayoutInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialLayoutInfoList  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutInfo[] smartCredentialLayoutInfo;

    public SmartCredentialLayoutInfoList() {
    }

    public SmartCredentialLayoutInfoList(
           wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutInfo[] smartCredentialLayoutInfo) {
           this.smartCredentialLayoutInfo = smartCredentialLayoutInfo;
    }


    /**
     * Gets the smartCredentialLayoutInfo value for this SmartCredentialLayoutInfoList.
     * 
     * @return smartCredentialLayoutInfo
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutInfo[] getSmartCredentialLayoutInfo() {
        return smartCredentialLayoutInfo;
    }


    /**
     * Sets the smartCredentialLayoutInfo value for this SmartCredentialLayoutInfoList.
     * 
     * @param smartCredentialLayoutInfo
     */
    public void setSmartCredentialLayoutInfo(wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutInfo[] smartCredentialLayoutInfo) {
        this.smartCredentialLayoutInfo = smartCredentialLayoutInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialLayoutInfoList)) return false;
        SmartCredentialLayoutInfoList other = (SmartCredentialLayoutInfoList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smartCredentialLayoutInfo==null && other.getSmartCredentialLayoutInfo()==null) || 
             (this.smartCredentialLayoutInfo!=null &&
              java.util.Arrays.equals(this.smartCredentialLayoutInfo, other.getSmartCredentialLayoutInfo())));
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
        if (getSmartCredentialLayoutInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartCredentialLayoutInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmartCredentialLayoutInfo(), i);
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
        new org.apache.axis.description.TypeDesc(SmartCredentialLayoutInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialLayoutInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialLayoutInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCredentialLayoutInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialLayoutInfo"));
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
