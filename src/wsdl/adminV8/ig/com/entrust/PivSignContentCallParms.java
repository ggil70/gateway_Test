/**
 * PivSignContentCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class PivSignContentCallParms  implements java.io.Serializable {
    private java.lang.String managedCaName;

    private java.lang.String operationType;

    private byte[] dataToSign;

    private java.lang.String uuid;

    private byte[] fascn;

    public PivSignContentCallParms() {
    }

    public PivSignContentCallParms(
           java.lang.String managedCaName,
           java.lang.String operationType,
           byte[] dataToSign,
           java.lang.String uuid,
           byte[] fascn) {
           this.managedCaName = managedCaName;
           this.operationType = operationType;
           this.dataToSign = dataToSign;
           this.uuid = uuid;
           this.fascn = fascn;
    }


    /**
     * Gets the managedCaName value for this PivSignContentCallParms.
     * 
     * @return managedCaName
     */
    public java.lang.String getManagedCaName() {
        return managedCaName;
    }


    /**
     * Sets the managedCaName value for this PivSignContentCallParms.
     * 
     * @param managedCaName
     */
    public void setManagedCaName(java.lang.String managedCaName) {
        this.managedCaName = managedCaName;
    }


    /**
     * Gets the operationType value for this PivSignContentCallParms.
     * 
     * @return operationType
     */
    public java.lang.String getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this PivSignContentCallParms.
     * 
     * @param operationType
     */
    public void setOperationType(java.lang.String operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the dataToSign value for this PivSignContentCallParms.
     * 
     * @return dataToSign
     */
    public byte[] getDataToSign() {
        return dataToSign;
    }


    /**
     * Sets the dataToSign value for this PivSignContentCallParms.
     * 
     * @param dataToSign
     */
    public void setDataToSign(byte[] dataToSign) {
        this.dataToSign = dataToSign;
    }


    /**
     * Gets the uuid value for this PivSignContentCallParms.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this PivSignContentCallParms.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the fascn value for this PivSignContentCallParms.
     * 
     * @return fascn
     */
    public byte[] getFascn() {
        return fascn;
    }


    /**
     * Sets the fascn value for this PivSignContentCallParms.
     * 
     * @param fascn
     */
    public void setFascn(byte[] fascn) {
        this.fascn = fascn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PivSignContentCallParms)) return false;
        PivSignContentCallParms other = (PivSignContentCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.managedCaName==null && other.getManagedCaName()==null) || 
             (this.managedCaName!=null &&
              this.managedCaName.equals(other.getManagedCaName()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.dataToSign==null && other.getDataToSign()==null) || 
             (this.dataToSign!=null &&
              java.util.Arrays.equals(this.dataToSign, other.getDataToSign()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.fascn==null && other.getFascn()==null) || 
             (this.fascn!=null &&
              java.util.Arrays.equals(this.fascn, other.getFascn())));
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
        if (getManagedCaName() != null) {
            _hashCode += getManagedCaName().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getDataToSign() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataToSign());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataToSign(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getFascn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFascn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFascn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PivSignContentCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PivSignContentCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedCaName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "managedCaName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataToSign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataToSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fascn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fascn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
