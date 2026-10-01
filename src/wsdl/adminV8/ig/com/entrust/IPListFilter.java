/**
 * IPListFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class IPListFilter  implements java.io.Serializable {
    private java.lang.String startIPAddress;

    private java.lang.String endIPAddress;

    private java.lang.Integer maxReturn;

    public IPListFilter() {
    }

    public IPListFilter(
           java.lang.String startIPAddress,
           java.lang.String endIPAddress,
           java.lang.Integer maxReturn) {
           this.startIPAddress = startIPAddress;
           this.endIPAddress = endIPAddress;
           this.maxReturn = maxReturn;
    }


    /**
     * Gets the startIPAddress value for this IPListFilter.
     * 
     * @return startIPAddress
     */
    public java.lang.String getStartIPAddress() {
        return startIPAddress;
    }


    /**
     * Sets the startIPAddress value for this IPListFilter.
     * 
     * @param startIPAddress
     */
    public void setStartIPAddress(java.lang.String startIPAddress) {
        this.startIPAddress = startIPAddress;
    }


    /**
     * Gets the endIPAddress value for this IPListFilter.
     * 
     * @return endIPAddress
     */
    public java.lang.String getEndIPAddress() {
        return endIPAddress;
    }


    /**
     * Sets the endIPAddress value for this IPListFilter.
     * 
     * @param endIPAddress
     */
    public void setEndIPAddress(java.lang.String endIPAddress) {
        this.endIPAddress = endIPAddress;
    }


    /**
     * Gets the maxReturn value for this IPListFilter.
     * 
     * @return maxReturn
     */
    public java.lang.Integer getMaxReturn() {
        return maxReturn;
    }


    /**
     * Sets the maxReturn value for this IPListFilter.
     * 
     * @param maxReturn
     */
    public void setMaxReturn(java.lang.Integer maxReturn) {
        this.maxReturn = maxReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IPListFilter)) return false;
        IPListFilter other = (IPListFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startIPAddress==null && other.getStartIPAddress()==null) || 
             (this.startIPAddress!=null &&
              this.startIPAddress.equals(other.getStartIPAddress()))) &&
            ((this.endIPAddress==null && other.getEndIPAddress()==null) || 
             (this.endIPAddress!=null &&
              this.endIPAddress.equals(other.getEndIPAddress()))) &&
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
        if (getStartIPAddress() != null) {
            _hashCode += getStartIPAddress().hashCode();
        }
        if (getEndIPAddress() != null) {
            _hashCode += getEndIPAddress().hashCode();
        }
        if (getMaxReturn() != null) {
            _hashCode += getMaxReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IPListFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "IPListFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxReturn"));
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
