/**
 * PartitionInfoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class PartitionInfoList  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.PartitionInfo[] partitionInfo;

    public PartitionInfoList() {
    }

    public PartitionInfoList(
           wsdl.adminV8.ig.com.entrust.PartitionInfo[] partitionInfo) {
           this.partitionInfo = partitionInfo;
    }


    /**
     * Gets the partitionInfo value for this PartitionInfoList.
     * 
     * @return partitionInfo
     */
    public wsdl.adminV8.ig.com.entrust.PartitionInfo[] getPartitionInfo() {
        return partitionInfo;
    }


    /**
     * Sets the partitionInfo value for this PartitionInfoList.
     * 
     * @param partitionInfo
     */
    public void setPartitionInfo(wsdl.adminV8.ig.com.entrust.PartitionInfo[] partitionInfo) {
        this.partitionInfo = partitionInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartitionInfoList)) return false;
        PartitionInfoList other = (PartitionInfoList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partitionInfo==null && other.getPartitionInfo()==null) || 
             (this.partitionInfo!=null &&
              java.util.Arrays.equals(this.partitionInfo, other.getPartitionInfo())));
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
        if (getPartitionInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitionInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitionInfo(), i);
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
        new org.apache.axis.description.TypeDesc(PartitionInfoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PartitionInfoList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PartitionInfo"));
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
