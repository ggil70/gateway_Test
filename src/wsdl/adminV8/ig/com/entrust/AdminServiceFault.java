/**
 * AdminServiceFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AdminServiceFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String errorCode;

    private java.lang.String internalCode;

    private java.lang.String errorMessage;

    private java.lang.String id;

    private wsdl.adminV8.ig.com.entrust.AdminServiceFault causeFault;

    public AdminServiceFault() {
    }

    public AdminServiceFault(
           java.lang.String errorCode,
           java.lang.String internalCode,
           java.lang.String errorMessage,
           java.lang.String id,
           wsdl.adminV8.ig.com.entrust.AdminServiceFault causeFault) {
        this.errorCode = errorCode;
        this.internalCode = internalCode;
        this.errorMessage = errorMessage;
        this.id = id;
        this.causeFault = causeFault;
    }


    /**
     * Gets the errorCode value for this AdminServiceFault.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this AdminServiceFault.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the internalCode value for this AdminServiceFault.
     * 
     * @return internalCode
     */
    public java.lang.String getInternalCode() {
        return internalCode;
    }


    /**
     * Sets the internalCode value for this AdminServiceFault.
     * 
     * @param internalCode
     */
    public void setInternalCode(java.lang.String internalCode) {
        this.internalCode = internalCode;
    }


    /**
     * Gets the errorMessage value for this AdminServiceFault.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this AdminServiceFault.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the id value for this AdminServiceFault.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AdminServiceFault.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the causeFault value for this AdminServiceFault.
     * 
     * @return causeFault
     */
    public wsdl.adminV8.ig.com.entrust.AdminServiceFault getCauseFault() {
        return causeFault;
    }


    /**
     * Sets the causeFault value for this AdminServiceFault.
     * 
     * @param causeFault
     */
    public void setCauseFault(wsdl.adminV8.ig.com.entrust.AdminServiceFault causeFault) {
        this.causeFault = causeFault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdminServiceFault)) return false;
        AdminServiceFault other = (AdminServiceFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.internalCode==null && other.getInternalCode()==null) || 
             (this.internalCode!=null &&
              this.internalCode.equals(other.getInternalCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.causeFault==null && other.getCauseFault()==null) || 
             (this.causeFault!=null &&
              this.causeFault.equals(other.getCauseFault())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getInternalCode() != null) {
            _hashCode += getInternalCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCauseFault() != null) {
            _hashCode += getCauseFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdminServiceFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AdminServiceFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InternalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causeFault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "causeFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AdminServiceFault"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
