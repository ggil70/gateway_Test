/**
 * AuditListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AuditListResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.AuditInfo[] audits;

    private java.lang.Long nextAudit;

    public AuditListResult() {
    }

    public AuditListResult(
           wsdl.adminV8.ig.com.entrust.AuditInfo[] audits,
           java.lang.Long nextAudit) {
           this.audits = audits;
           this.nextAudit = nextAudit;
    }


    /**
     * Gets the audits value for this AuditListResult.
     * 
     * @return audits
     */
    public wsdl.adminV8.ig.com.entrust.AuditInfo[] getAudits() {
        return audits;
    }


    /**
     * Sets the audits value for this AuditListResult.
     * 
     * @param audits
     */
    public void setAudits(wsdl.adminV8.ig.com.entrust.AuditInfo[] audits) {
        this.audits = audits;
    }


    /**
     * Gets the nextAudit value for this AuditListResult.
     * 
     * @return nextAudit
     */
    public java.lang.Long getNextAudit() {
        return nextAudit;
    }


    /**
     * Sets the nextAudit value for this AuditListResult.
     * 
     * @param nextAudit
     */
    public void setNextAudit(java.lang.Long nextAudit) {
        this.nextAudit = nextAudit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditListResult)) return false;
        AuditListResult other = (AuditListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.audits==null && other.getAudits()==null) || 
             (this.audits!=null &&
              java.util.Arrays.equals(this.audits, other.getAudits()))) &&
            ((this.nextAudit==null && other.getNextAudit()==null) || 
             (this.nextAudit!=null &&
              this.nextAudit.equals(other.getNextAudit())));
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
        if (getAudits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextAudit() != null) {
            _hashCode += getNextAudit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuditListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "audits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuditInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextAudit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextAudit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
