/**
 * ReportCreateFilters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ReportCreateFilters  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.UserFilter userFilter;

    private wsdl.adminV8.ig.com.entrust.PreproducedCardFilter preproducedCardFilter;

    private wsdl.adminV8.ig.com.entrust.TokenFilter tokenFilter;

    private wsdl.adminV8.ig.com.entrust.SmartCredentialFilter smartCredentialFilter;

    private wsdl.adminV8.ig.com.entrust.AuditFilter auditFilter;

    public ReportCreateFilters() {
    }

    public ReportCreateFilters(
           wsdl.adminV8.ig.com.entrust.UserFilter userFilter,
           wsdl.adminV8.ig.com.entrust.PreproducedCardFilter preproducedCardFilter,
           wsdl.adminV8.ig.com.entrust.TokenFilter tokenFilter,
           wsdl.adminV8.ig.com.entrust.SmartCredentialFilter smartCredentialFilter,
           wsdl.adminV8.ig.com.entrust.AuditFilter auditFilter) {
           this.userFilter = userFilter;
           this.preproducedCardFilter = preproducedCardFilter;
           this.tokenFilter = tokenFilter;
           this.smartCredentialFilter = smartCredentialFilter;
           this.auditFilter = auditFilter;
    }


    /**
     * Gets the userFilter value for this ReportCreateFilters.
     * 
     * @return userFilter
     */
    public wsdl.adminV8.ig.com.entrust.UserFilter getUserFilter() {
        return userFilter;
    }


    /**
     * Sets the userFilter value for this ReportCreateFilters.
     * 
     * @param userFilter
     */
    public void setUserFilter(wsdl.adminV8.ig.com.entrust.UserFilter userFilter) {
        this.userFilter = userFilter;
    }


    /**
     * Gets the preproducedCardFilter value for this ReportCreateFilters.
     * 
     * @return preproducedCardFilter
     */
    public wsdl.adminV8.ig.com.entrust.PreproducedCardFilter getPreproducedCardFilter() {
        return preproducedCardFilter;
    }


    /**
     * Sets the preproducedCardFilter value for this ReportCreateFilters.
     * 
     * @param preproducedCardFilter
     */
    public void setPreproducedCardFilter(wsdl.adminV8.ig.com.entrust.PreproducedCardFilter preproducedCardFilter) {
        this.preproducedCardFilter = preproducedCardFilter;
    }


    /**
     * Gets the tokenFilter value for this ReportCreateFilters.
     * 
     * @return tokenFilter
     */
    public wsdl.adminV8.ig.com.entrust.TokenFilter getTokenFilter() {
        return tokenFilter;
    }


    /**
     * Sets the tokenFilter value for this ReportCreateFilters.
     * 
     * @param tokenFilter
     */
    public void setTokenFilter(wsdl.adminV8.ig.com.entrust.TokenFilter tokenFilter) {
        this.tokenFilter = tokenFilter;
    }


    /**
     * Gets the smartCredentialFilter value for this ReportCreateFilters.
     * 
     * @return smartCredentialFilter
     */
    public wsdl.adminV8.ig.com.entrust.SmartCredentialFilter getSmartCredentialFilter() {
        return smartCredentialFilter;
    }


    /**
     * Sets the smartCredentialFilter value for this ReportCreateFilters.
     * 
     * @param smartCredentialFilter
     */
    public void setSmartCredentialFilter(wsdl.adminV8.ig.com.entrust.SmartCredentialFilter smartCredentialFilter) {
        this.smartCredentialFilter = smartCredentialFilter;
    }


    /**
     * Gets the auditFilter value for this ReportCreateFilters.
     * 
     * @return auditFilter
     */
    public wsdl.adminV8.ig.com.entrust.AuditFilter getAuditFilter() {
        return auditFilter;
    }


    /**
     * Sets the auditFilter value for this ReportCreateFilters.
     * 
     * @param auditFilter
     */
    public void setAuditFilter(wsdl.adminV8.ig.com.entrust.AuditFilter auditFilter) {
        this.auditFilter = auditFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportCreateFilters)) return false;
        ReportCreateFilters other = (ReportCreateFilters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userFilter==null && other.getUserFilter()==null) || 
             (this.userFilter!=null &&
              this.userFilter.equals(other.getUserFilter()))) &&
            ((this.preproducedCardFilter==null && other.getPreproducedCardFilter()==null) || 
             (this.preproducedCardFilter!=null &&
              this.preproducedCardFilter.equals(other.getPreproducedCardFilter()))) &&
            ((this.tokenFilter==null && other.getTokenFilter()==null) || 
             (this.tokenFilter!=null &&
              this.tokenFilter.equals(other.getTokenFilter()))) &&
            ((this.smartCredentialFilter==null && other.getSmartCredentialFilter()==null) || 
             (this.smartCredentialFilter!=null &&
              this.smartCredentialFilter.equals(other.getSmartCredentialFilter()))) &&
            ((this.auditFilter==null && other.getAuditFilter()==null) || 
             (this.auditFilter!=null &&
              this.auditFilter.equals(other.getAuditFilter())));
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
        if (getUserFilter() != null) {
            _hashCode += getUserFilter().hashCode();
        }
        if (getPreproducedCardFilter() != null) {
            _hashCode += getPreproducedCardFilter().hashCode();
        }
        if (getTokenFilter() != null) {
            _hashCode += getTokenFilter().hashCode();
        }
        if (getSmartCredentialFilter() != null) {
            _hashCode += getSmartCredentialFilter().hashCode();
        }
        if (getAuditFilter() != null) {
            _hashCode += getAuditFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportCreateFilters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportCreateFilters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preproducedCardFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreproducedCardFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PreproducedCardFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TokenFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "TokenFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCredentialFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "SmartCredentialFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuditFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuditFilter"));
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
