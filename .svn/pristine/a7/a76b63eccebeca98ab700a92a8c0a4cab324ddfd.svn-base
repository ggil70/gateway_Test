/**
 * AuditDeleteCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AuditDeleteCallParms  implements java.io.Serializable {
    private java.lang.Long seqNo;

    private java.lang.Long seqNoStart;

    private java.lang.Long seqNoEnd;

    public AuditDeleteCallParms() {
    }

    public AuditDeleteCallParms(
           java.lang.Long seqNo,
           java.lang.Long seqNoStart,
           java.lang.Long seqNoEnd) {
           this.seqNo = seqNo;
           this.seqNoStart = seqNoStart;
           this.seqNoEnd = seqNoEnd;
    }


    /**
     * Gets the seqNo value for this AuditDeleteCallParms.
     * 
     * @return seqNo
     */
    public java.lang.Long getSeqNo() {
        return seqNo;
    }


    /**
     * Sets the seqNo value for this AuditDeleteCallParms.
     * 
     * @param seqNo
     */
    public void setSeqNo(java.lang.Long seqNo) {
        this.seqNo = seqNo;
    }


    /**
     * Gets the seqNoStart value for this AuditDeleteCallParms.
     * 
     * @return seqNoStart
     */
    public java.lang.Long getSeqNoStart() {
        return seqNoStart;
    }


    /**
     * Sets the seqNoStart value for this AuditDeleteCallParms.
     * 
     * @param seqNoStart
     */
    public void setSeqNoStart(java.lang.Long seqNoStart) {
        this.seqNoStart = seqNoStart;
    }


    /**
     * Gets the seqNoEnd value for this AuditDeleteCallParms.
     * 
     * @return seqNoEnd
     */
    public java.lang.Long getSeqNoEnd() {
        return seqNoEnd;
    }


    /**
     * Sets the seqNoEnd value for this AuditDeleteCallParms.
     * 
     * @param seqNoEnd
     */
    public void setSeqNoEnd(java.lang.Long seqNoEnd) {
        this.seqNoEnd = seqNoEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditDeleteCallParms)) return false;
        AuditDeleteCallParms other = (AuditDeleteCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqNo==null && other.getSeqNo()==null) || 
             (this.seqNo!=null &&
              this.seqNo.equals(other.getSeqNo()))) &&
            ((this.seqNoStart==null && other.getSeqNoStart()==null) || 
             (this.seqNoStart!=null &&
              this.seqNoStart.equals(other.getSeqNoStart()))) &&
            ((this.seqNoEnd==null && other.getSeqNoEnd()==null) || 
             (this.seqNoEnd!=null &&
              this.seqNoEnd.equals(other.getSeqNoEnd())));
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
        if (getSeqNo() != null) {
            _hashCode += getSeqNo().hashCode();
        }
        if (getSeqNoStart() != null) {
            _hashCode += getSeqNoStart().hashCode();
        }
        if (getSeqNoEnd() != null) {
            _hashCode += getSeqNoEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditDeleteCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuditDeleteCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNoStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqNoStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNoEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqNoEnd"));
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
