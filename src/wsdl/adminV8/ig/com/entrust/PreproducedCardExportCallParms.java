/**
 * PreproducedCardExportCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class PreproducedCardExportCallParms  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.PreproducedCardFilter filter;

    private commonV8.ig.com.entrust.NameValue[] parms;

    public PreproducedCardExportCallParms() {
    }

    public PreproducedCardExportCallParms(
           wsdl.adminV8.ig.com.entrust.PreproducedCardFilter filter,
           commonV8.ig.com.entrust.NameValue[] parms) {
           this.filter = filter;
           this.parms = parms;
    }


    /**
     * Gets the filter value for this PreproducedCardExportCallParms.
     * 
     * @return filter
     */
    public wsdl.adminV8.ig.com.entrust.PreproducedCardFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this PreproducedCardExportCallParms.
     * 
     * @param filter
     */
    public void setFilter(wsdl.adminV8.ig.com.entrust.PreproducedCardFilter filter) {
        this.filter = filter;
    }


    /**
     * Gets the parms value for this PreproducedCardExportCallParms.
     * 
     * @return parms
     */
    public commonV8.ig.com.entrust.NameValue[] getParms() {
        return parms;
    }


    /**
     * Sets the parms value for this PreproducedCardExportCallParms.
     * 
     * @param parms
     */
    public void setParms(commonV8.ig.com.entrust.NameValue[] parms) {
        this.parms = parms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreproducedCardExportCallParms)) return false;
        PreproducedCardExportCallParms other = (PreproducedCardExportCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.parms==null && other.getParms()==null) || 
             (this.parms!=null &&
              java.util.Arrays.equals(this.parms, other.getParms())));
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
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getParms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParms(), i);
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
        new org.apache.axis.description.TypeDesc(PreproducedCardExportCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PreproducedCardExportCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PreproducedCardFilter"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "NameValue"));
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
