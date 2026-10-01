/**
 * MachineSecretInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class MachineSecretInfo  implements java.io.Serializable {
    private java.lang.String machineLabel;

    private java.lang.String machineNonce;

    private java.lang.String sequenceNonce;

    private commonV8.ig.com.entrust.NameValue[] applicationData;

    private java.util.Calendar createDate;

    private java.util.Calendar lastUsedDate;

    private java.util.Calendar expiryDate;

    public MachineSecretInfo() {
    }

    public MachineSecretInfo(
           java.lang.String machineLabel,
           java.lang.String machineNonce,
           java.lang.String sequenceNonce,
           commonV8.ig.com.entrust.NameValue[] applicationData,
           java.util.Calendar createDate,
           java.util.Calendar lastUsedDate,
           java.util.Calendar expiryDate) {
           this.machineLabel = machineLabel;
           this.machineNonce = machineNonce;
           this.sequenceNonce = sequenceNonce;
           this.applicationData = applicationData;
           this.createDate = createDate;
           this.lastUsedDate = lastUsedDate;
           this.expiryDate = expiryDate;
    }


    /**
     * Gets the machineLabel value for this MachineSecretInfo.
     * 
     * @return machineLabel
     */
    public java.lang.String getMachineLabel() {
        return machineLabel;
    }


    /**
     * Sets the machineLabel value for this MachineSecretInfo.
     * 
     * @param machineLabel
     */
    public void setMachineLabel(java.lang.String machineLabel) {
        this.machineLabel = machineLabel;
    }


    /**
     * Gets the machineNonce value for this MachineSecretInfo.
     * 
     * @return machineNonce
     */
    public java.lang.String getMachineNonce() {
        return machineNonce;
    }


    /**
     * Sets the machineNonce value for this MachineSecretInfo.
     * 
     * @param machineNonce
     */
    public void setMachineNonce(java.lang.String machineNonce) {
        this.machineNonce = machineNonce;
    }


    /**
     * Gets the sequenceNonce value for this MachineSecretInfo.
     * 
     * @return sequenceNonce
     */
    public java.lang.String getSequenceNonce() {
        return sequenceNonce;
    }


    /**
     * Sets the sequenceNonce value for this MachineSecretInfo.
     * 
     * @param sequenceNonce
     */
    public void setSequenceNonce(java.lang.String sequenceNonce) {
        this.sequenceNonce = sequenceNonce;
    }


    /**
     * Gets the applicationData value for this MachineSecretInfo.
     * 
     * @return applicationData
     */
    public commonV8.ig.com.entrust.NameValue[] getApplicationData() {
        return applicationData;
    }


    /**
     * Sets the applicationData value for this MachineSecretInfo.
     * 
     * @param applicationData
     */
    public void setApplicationData(commonV8.ig.com.entrust.NameValue[] applicationData) {
        this.applicationData = applicationData;
    }


    /**
     * Gets the createDate value for this MachineSecretInfo.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this MachineSecretInfo.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the lastUsedDate value for this MachineSecretInfo.
     * 
     * @return lastUsedDate
     */
    public java.util.Calendar getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this MachineSecretInfo.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.util.Calendar lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the expiryDate value for this MachineSecretInfo.
     * 
     * @return expiryDate
     */
    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this MachineSecretInfo.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MachineSecretInfo)) return false;
        MachineSecretInfo other = (MachineSecretInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.machineLabel==null && other.getMachineLabel()==null) || 
             (this.machineLabel!=null &&
              this.machineLabel.equals(other.getMachineLabel()))) &&
            ((this.machineNonce==null && other.getMachineNonce()==null) || 
             (this.machineNonce!=null &&
              this.machineNonce.equals(other.getMachineNonce()))) &&
            ((this.sequenceNonce==null && other.getSequenceNonce()==null) || 
             (this.sequenceNonce!=null &&
              this.sequenceNonce.equals(other.getSequenceNonce()))) &&
            ((this.applicationData==null && other.getApplicationData()==null) || 
             (this.applicationData!=null &&
              java.util.Arrays.equals(this.applicationData, other.getApplicationData()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.lastUsedDate==null && other.getLastUsedDate()==null) || 
             (this.lastUsedDate!=null &&
              this.lastUsedDate.equals(other.getLastUsedDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate())));
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
        if (getMachineLabel() != null) {
            _hashCode += getMachineLabel().hashCode();
        }
        if (getMachineNonce() != null) {
            _hashCode += getMachineNonce().hashCode();
        }
        if (getSequenceNonce() != null) {
            _hashCode += getSequenceNonce().hashCode();
        }
        if (getApplicationData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getLastUsedDate() != null) {
            _hashCode += getLastUsedDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MachineSecretInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "MachineSecretInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineNonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineNonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "NameValue"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUsedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastUsedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
