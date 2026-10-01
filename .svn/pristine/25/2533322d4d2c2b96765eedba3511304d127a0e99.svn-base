/**
 * SmartCredentialDefinitionInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class SmartCredentialDefinitionInfoList  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionInfo[] smartCredentialDefinitionInfo;

    public SmartCredentialDefinitionInfoList() {
    }

    public SmartCredentialDefinitionInfoList(
           wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionInfo[] smartCredentialDefinitionInfo) {
           this.smartCredentialDefinitionInfo = smartCredentialDefinitionInfo;
    }


    /**
     * Gets the smartCredentialDefinitionInfo value for this SmartCredentialDefinitionInfoList.
     * 
     * @return smartCredentialDefinitionInfo
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionInfo[] getSmartCredentialDefinitionInfo() {
        return smartCredentialDefinitionInfo;
    }


    /**
     * Sets the smartCredentialDefinitionInfo value for this SmartCredentialDefinitionInfoList.
     * 
     * @param smartCredentialDefinitionInfo
     */
    public void setSmartCredentialDefinitionInfo(wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionInfo[] smartCredentialDefinitionInfo) {
        this.smartCredentialDefinitionInfo = smartCredentialDefinitionInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmartCredentialDefinitionInfoList)) return false;
        SmartCredentialDefinitionInfoList other = (SmartCredentialDefinitionInfoList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smartCredentialDefinitionInfo==null && other.getSmartCredentialDefinitionInfo()==null) || 
             (this.smartCredentialDefinitionInfo!=null &&
              java.util.Arrays.equals(this.smartCredentialDefinitionInfo, other.getSmartCredentialDefinitionInfo())));
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
        if (getSmartCredentialDefinitionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartCredentialDefinitionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmartCredentialDefinitionInfo(), i);
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
        new org.apache.axis.description.TypeDesc(SmartCredentialDefinitionInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialDefinitionInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialDefinitionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCredentialDefinitionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialDefinitionInfo"));
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
