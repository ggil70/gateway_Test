/**
 * ReportFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ReportFilter  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String startId;

    private java.lang.String endId;

    private java.lang.String nextId;

    private java.lang.Integer maxReturn;

    public ReportFilter() {
    }

    public ReportFilter(
           java.lang.String id,
           java.lang.String startId,
           java.lang.String endId,
           java.lang.String nextId,
           java.lang.Integer maxReturn) {
           this.id = id;
           this.startId = startId;
           this.endId = endId;
           this.nextId = nextId;
           this.maxReturn = maxReturn;
    }


    /**
     * Gets the id value for this ReportFilter.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ReportFilter.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the startId value for this ReportFilter.
     * 
     * @return startId
     */
    public java.lang.String getStartId() {
        return startId;
    }


    /**
     * Sets the startId value for this ReportFilter.
     * 
     * @param startId
     */
    public void setStartId(java.lang.String startId) {
        this.startId = startId;
    }


    /**
     * Gets the endId value for this ReportFilter.
     * 
     * @return endId
     */
    public java.lang.String getEndId() {
        return endId;
    }


    /**
     * Sets the endId value for this ReportFilter.
     * 
     * @param endId
     */
    public void setEndId(java.lang.String endId) {
        this.endId = endId;
    }


    /**
     * Gets the nextId value for this ReportFilter.
     * 
     * @return nextId
     */
    public java.lang.String getNextId() {
        return nextId;
    }


    /**
     * Sets the nextId value for this ReportFilter.
     * 
     * @param nextId
     */
    public void setNextId(java.lang.String nextId) {
        this.nextId = nextId;
    }


    /**
     * Gets the maxReturn value for this ReportFilter.
     * 
     * @return maxReturn
     */
    public java.lang.Integer getMaxReturn() {
        return maxReturn;
    }


    /**
     * Sets the maxReturn value for this ReportFilter.
     * 
     * @param maxReturn
     */
    public void setMaxReturn(java.lang.Integer maxReturn) {
        this.maxReturn = maxReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportFilter)) return false;
        ReportFilter other = (ReportFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.startId==null && other.getStartId()==null) || 
             (this.startId!=null &&
              this.startId.equals(other.getStartId()))) &&
            ((this.endId==null && other.getEndId()==null) || 
             (this.endId!=null &&
              this.endId.equals(other.getEndId()))) &&
            ((this.nextId==null && other.getNextId()==null) || 
             (this.nextId!=null &&
              this.nextId.equals(other.getNextId()))) &&
            ((this.maxReturn==null && other.getMaxReturn()==null) || 
             (this.maxReturn!=null &&
              this.maxReturn.equals(other.getMaxReturn())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStartId() != null) {
            _hashCode += getStartId().hashCode();
        }
        if (getEndId() != null) {
            _hashCode += getEndId().hashCode();
        }
        if (getNextId() != null) {
            _hashCode += getNextId().hashCode();
        }
        if (getMaxReturn() != null) {
            _hashCode += getMaxReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
