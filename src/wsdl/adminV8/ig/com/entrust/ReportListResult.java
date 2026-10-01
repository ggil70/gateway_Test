/**
 * ReportListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ReportListResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.ReportInfo[] reportInfo;

    private java.lang.String nextReport;

    public ReportListResult() {
    }

    public ReportListResult(
           wsdl.adminV8.ig.com.entrust.ReportInfo[] reportInfo,
           java.lang.String nextReport) {
           this.reportInfo = reportInfo;
           this.nextReport = nextReport;
    }


    /**
     * Gets the reportInfo value for this ReportListResult.
     * 
     * @return reportInfo
     */
    public wsdl.adminV8.ig.com.entrust.ReportInfo[] getReportInfo() {
        return reportInfo;
    }


    /**
     * Sets the reportInfo value for this ReportListResult.
     * 
     * @param reportInfo
     */
    public void setReportInfo(wsdl.adminV8.ig.com.entrust.ReportInfo[] reportInfo) {
        this.reportInfo = reportInfo;
    }


    /**
     * Gets the nextReport value for this ReportListResult.
     * 
     * @return nextReport
     */
    public java.lang.String getNextReport() {
        return nextReport;
    }


    /**
     * Sets the nextReport value for this ReportListResult.
     * 
     * @param nextReport
     */
    public void setNextReport(java.lang.String nextReport) {
        this.nextReport = nextReport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportListResult)) return false;
        ReportListResult other = (ReportListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reportInfo==null && other.getReportInfo()==null) || 
             (this.reportInfo!=null &&
              java.util.Arrays.equals(this.reportInfo, other.getReportInfo()))) &&
            ((this.nextReport==null && other.getNextReport()==null) || 
             (this.nextReport!=null &&
              this.nextReport.equals(other.getNextReport())));
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
        if (getReportInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextReport() != null) {
            _hashCode += getNextReport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReportInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextReport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NextReport"));
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
