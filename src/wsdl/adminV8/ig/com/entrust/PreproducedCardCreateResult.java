/**
 * PreproducedCardCreateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class PreproducedCardCreateResult  implements java.io.Serializable {
    private int numCreated;

    private int numRequested;

    private java.lang.String firstSerialNumber;

    private java.lang.String lastSerialNumber;

    private wsdl.adminV8.ig.com.entrust.AdminServiceFault failureReason;

    public PreproducedCardCreateResult() {
    }

    public PreproducedCardCreateResult(
           int numCreated,
           int numRequested,
           java.lang.String firstSerialNumber,
           java.lang.String lastSerialNumber,
           wsdl.adminV8.ig.com.entrust.AdminServiceFault failureReason) {
           this.numCreated = numCreated;
           this.numRequested = numRequested;
           this.firstSerialNumber = firstSerialNumber;
           this.lastSerialNumber = lastSerialNumber;
           this.failureReason = failureReason;
    }


    /**
     * Gets the numCreated value for this PreproducedCardCreateResult.
     * 
     * @return numCreated
     */
    public int getNumCreated() {
        return numCreated;
    }


    /**
     * Sets the numCreated value for this PreproducedCardCreateResult.
     * 
     * @param numCreated
     */
    public void setNumCreated(int numCreated) {
        this.numCreated = numCreated;
    }


    /**
     * Gets the numRequested value for this PreproducedCardCreateResult.
     * 
     * @return numRequested
     */
    public int getNumRequested() {
        return numRequested;
    }


    /**
     * Sets the numRequested value for this PreproducedCardCreateResult.
     * 
     * @param numRequested
     */
    public void setNumRequested(int numRequested) {
        this.numRequested = numRequested;
    }


    /**
     * Gets the firstSerialNumber value for this PreproducedCardCreateResult.
     * 
     * @return firstSerialNumber
     */
    public java.lang.String getFirstSerialNumber() {
        return firstSerialNumber;
    }


    /**
     * Sets the firstSerialNumber value for this PreproducedCardCreateResult.
     * 
     * @param firstSerialNumber
     */
    public void setFirstSerialNumber(java.lang.String firstSerialNumber) {
        this.firstSerialNumber = firstSerialNumber;
    }


    /**
     * Gets the lastSerialNumber value for this PreproducedCardCreateResult.
     * 
     * @return lastSerialNumber
     */
    public java.lang.String getLastSerialNumber() {
        return lastSerialNumber;
    }


    /**
     * Sets the lastSerialNumber value for this PreproducedCardCreateResult.
     * 
     * @param lastSerialNumber
     */
    public void setLastSerialNumber(java.lang.String lastSerialNumber) {
        this.lastSerialNumber = lastSerialNumber;
    }


    /**
     * Gets the failureReason value for this PreproducedCardCreateResult.
     * 
     * @return failureReason
     */
    public wsdl.adminV8.ig.com.entrust.AdminServiceFault getFailureReason() {
        return failureReason;
    }


    /**
     * Sets the failureReason value for this PreproducedCardCreateResult.
     * 
     * @param failureReason
     */
    public void setFailureReason(wsdl.adminV8.ig.com.entrust.AdminServiceFault failureReason) {
        this.failureReason = failureReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreproducedCardCreateResult)) return false;
        PreproducedCardCreateResult other = (PreproducedCardCreateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.numCreated == other.getNumCreated() &&
            this.numRequested == other.getNumRequested() &&
            ((this.firstSerialNumber==null && other.getFirstSerialNumber()==null) || 
             (this.firstSerialNumber!=null &&
              this.firstSerialNumber.equals(other.getFirstSerialNumber()))) &&
            ((this.lastSerialNumber==null && other.getLastSerialNumber()==null) || 
             (this.lastSerialNumber!=null &&
              this.lastSerialNumber.equals(other.getLastSerialNumber()))) &&
            ((this.failureReason==null && other.getFailureReason()==null) || 
             (this.failureReason!=null &&
              this.failureReason.equals(other.getFailureReason())));
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
        _hashCode += getNumCreated();
        _hashCode += getNumRequested();
        if (getFirstSerialNumber() != null) {
            _hashCode += getFirstSerialNumber().hashCode();
        }
        if (getLastSerialNumber() != null) {
            _hashCode += getLastSerialNumber().hashCode();
        }
        if (getFailureReason() != null) {
            _hashCode += getFailureReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreproducedCardCreateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PreproducedCardCreateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FailureReason"));
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

}
