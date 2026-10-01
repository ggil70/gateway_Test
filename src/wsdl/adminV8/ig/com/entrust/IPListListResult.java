/**
 * IPListListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class IPListListResult  implements java.io.Serializable {
    private java.lang.String nextEntry;

    private wsdl.adminV8.ig.com.entrust.IPListEntry[] entries;

    public IPListListResult() {
    }

    public IPListListResult(
           java.lang.String nextEntry,
           wsdl.adminV8.ig.com.entrust.IPListEntry[] entries) {
           this.nextEntry = nextEntry;
           this.entries = entries;
    }


    /**
     * Gets the nextEntry value for this IPListListResult.
     * 
     * @return nextEntry
     */
    public java.lang.String getNextEntry() {
        return nextEntry;
    }


    /**
     * Sets the nextEntry value for this IPListListResult.
     * 
     * @param nextEntry
     */
    public void setNextEntry(java.lang.String nextEntry) {
        this.nextEntry = nextEntry;
    }


    /**
     * Gets the entries value for this IPListListResult.
     * 
     * @return entries
     */
    public wsdl.adminV8.ig.com.entrust.IPListEntry[] getEntries() {
        return entries;
    }


    /**
     * Sets the entries value for this IPListListResult.
     * 
     * @param entries
     */
    public void setEntries(wsdl.adminV8.ig.com.entrust.IPListEntry[] entries) {
        this.entries = entries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IPListListResult)) return false;
        IPListListResult other = (IPListListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nextEntry==null && other.getNextEntry()==null) || 
             (this.nextEntry!=null &&
              this.nextEntry.equals(other.getNextEntry()))) &&
            ((this.entries==null && other.getEntries()==null) || 
             (this.entries!=null &&
              java.util.Arrays.equals(this.entries, other.getEntries())));
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
        if (getNextEntry() != null) {
            _hashCode += getNextEntry().hashCode();
        }
        if (getEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntries(), i);
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
        new org.apache.axis.description.TypeDesc(IPListListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "IPListListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entries"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "IPListEntry"));
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
