/**
 * ReportSuccessInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ReportSuccessInfo  implements java.io.Serializable {
    private java.util.Calendar endDate;

    private boolean viewable;

    private wsdl.adminV8.ig.com.entrust.ReportDetailInfo detail;

    private boolean truncated;

    public ReportSuccessInfo() {
    }

    public ReportSuccessInfo(
           java.util.Calendar endDate,
           boolean viewable,
           wsdl.adminV8.ig.com.entrust.ReportDetailInfo detail,
           boolean truncated) {
           this.endDate = endDate;
           this.viewable = viewable;
           this.detail = detail;
           this.truncated = truncated;
    }


    /**
     * Gets the endDate value for this ReportSuccessInfo.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ReportSuccessInfo.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the viewable value for this ReportSuccessInfo.
     * 
     * @return viewable
     */
    public boolean isViewable() {
        return viewable;
    }


    /**
     * Sets the viewable value for this ReportSuccessInfo.
     * 
     * @param viewable
     */
    public void setViewable(boolean viewable) {
        this.viewable = viewable;
    }


    /**
     * Gets the detail value for this ReportSuccessInfo.
     * 
     * @return detail
     */
    public wsdl.adminV8.ig.com.entrust.ReportDetailInfo getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this ReportSuccessInfo.
     * 
     * @param detail
     */
    public void setDetail(wsdl.adminV8.ig.com.entrust.ReportDetailInfo detail) {
        this.detail = detail;
    }


    /**
     * Gets the truncated value for this ReportSuccessInfo.
     * 
     * @return truncated
     */
    public boolean isTruncated() {
        return truncated;
    }


    /**
     * Sets the truncated value for this ReportSuccessInfo.
     * 
     * @param truncated
     */
    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportSuccessInfo)) return false;
        ReportSuccessInfo other = (ReportSuccessInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.viewable == other.isViewable() &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail()))) &&
            this.truncated == other.isTruncated();
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
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += (isViewable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        _hashCode += (isTruncated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportSuccessInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportSuccessInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Viewable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportDetailInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("truncated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Truncated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
