/**
 * ReportCreateCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ReportCreateCallParms  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.ReportCreateParms parms;

    private wsdl.adminV8.ig.com.entrust.ReportCreateFilters filters;

    public ReportCreateCallParms() {
    }

    public ReportCreateCallParms(
           wsdl.adminV8.ig.com.entrust.ReportCreateParms parms,
           wsdl.adminV8.ig.com.entrust.ReportCreateFilters filters) {
           this.parms = parms;
           this.filters = filters;
    }


    /**
     * Gets the parms value for this ReportCreateCallParms.
     * 
     * @return parms
     */
    public wsdl.adminV8.ig.com.entrust.ReportCreateParms getParms() {
        return parms;
    }


    /**
     * Sets the parms value for this ReportCreateCallParms.
     * 
     * @param parms
     */
    public void setParms(wsdl.adminV8.ig.com.entrust.ReportCreateParms parms) {
        this.parms = parms;
    }


    /**
     * Gets the filters value for this ReportCreateCallParms.
     * 
     * @return filters
     */
    public wsdl.adminV8.ig.com.entrust.ReportCreateFilters getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this ReportCreateCallParms.
     * 
     * @param filters
     */
    public void setFilters(wsdl.adminV8.ig.com.entrust.ReportCreateFilters filters) {
        this.filters = filters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportCreateCallParms)) return false;
        ReportCreateCallParms other = (ReportCreateCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parms==null && other.getParms()==null) || 
             (this.parms!=null &&
              this.parms.equals(other.getParms()))) &&
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              this.filters.equals(other.getFilters())));
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
        if (getParms() != null) {
            _hashCode += getParms().hashCode();
        }
        if (getFilters() != null) {
            _hashCode += getFilters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportCreateCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportCreateCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportCreateParms"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportCreateFilters"));
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
