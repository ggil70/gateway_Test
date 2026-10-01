/**
 * ScepRaSignedAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ScepRaSignedAttributes  implements java.io.Serializable {
    private java.lang.String transactionID;

    private java.lang.String messageType;

    private java.lang.String pkiStatus;

    private java.lang.String failInfo;

    private byte[] senderNonce;

    private byte[] recipientNonce;

    public ScepRaSignedAttributes() {
    }

    public ScepRaSignedAttributes(
           java.lang.String transactionID,
           java.lang.String messageType,
           java.lang.String pkiStatus,
           java.lang.String failInfo,
           byte[] senderNonce,
           byte[] recipientNonce) {
           this.transactionID = transactionID;
           this.messageType = messageType;
           this.pkiStatus = pkiStatus;
           this.failInfo = failInfo;
           this.senderNonce = senderNonce;
           this.recipientNonce = recipientNonce;
    }


    /**
     * Gets the transactionID value for this ScepRaSignedAttributes.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this ScepRaSignedAttributes.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the messageType value for this ScepRaSignedAttributes.
     * 
     * @return messageType
     */
    public java.lang.String getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this ScepRaSignedAttributes.
     * 
     * @param messageType
     */
    public void setMessageType(java.lang.String messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the pkiStatus value for this ScepRaSignedAttributes.
     * 
     * @return pkiStatus
     */
    public java.lang.String getPkiStatus() {
        return pkiStatus;
    }


    /**
     * Sets the pkiStatus value for this ScepRaSignedAttributes.
     * 
     * @param pkiStatus
     */
    public void setPkiStatus(java.lang.String pkiStatus) {
        this.pkiStatus = pkiStatus;
    }


    /**
     * Gets the failInfo value for this ScepRaSignedAttributes.
     * 
     * @return failInfo
     */
    public java.lang.String getFailInfo() {
        return failInfo;
    }


    /**
     * Sets the failInfo value for this ScepRaSignedAttributes.
     * 
     * @param failInfo
     */
    public void setFailInfo(java.lang.String failInfo) {
        this.failInfo = failInfo;
    }


    /**
     * Gets the senderNonce value for this ScepRaSignedAttributes.
     * 
     * @return senderNonce
     */
    public byte[] getSenderNonce() {
        return senderNonce;
    }


    /**
     * Sets the senderNonce value for this ScepRaSignedAttributes.
     * 
     * @param senderNonce
     */
    public void setSenderNonce(byte[] senderNonce) {
        this.senderNonce = senderNonce;
    }


    /**
     * Gets the recipientNonce value for this ScepRaSignedAttributes.
     * 
     * @return recipientNonce
     */
    public byte[] getRecipientNonce() {
        return recipientNonce;
    }


    /**
     * Sets the recipientNonce value for this ScepRaSignedAttributes.
     * 
     * @param recipientNonce
     */
    public void setRecipientNonce(byte[] recipientNonce) {
        this.recipientNonce = recipientNonce;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScepRaSignedAttributes)) return false;
        ScepRaSignedAttributes other = (ScepRaSignedAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.pkiStatus==null && other.getPkiStatus()==null) || 
             (this.pkiStatus!=null &&
              this.pkiStatus.equals(other.getPkiStatus()))) &&
            ((this.failInfo==null && other.getFailInfo()==null) || 
             (this.failInfo!=null &&
              this.failInfo.equals(other.getFailInfo()))) &&
            ((this.senderNonce==null && other.getSenderNonce()==null) || 
             (this.senderNonce!=null &&
              java.util.Arrays.equals(this.senderNonce, other.getSenderNonce()))) &&
            ((this.recipientNonce==null && other.getRecipientNonce()==null) || 
             (this.recipientNonce!=null &&
              java.util.Arrays.equals(this.recipientNonce, other.getRecipientNonce())));
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getPkiStatus() != null) {
            _hashCode += getPkiStatus().hashCode();
        }
        if (getFailInfo() != null) {
            _hashCode += getFailInfo().hashCode();
        }
        if (getSenderNonce() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSenderNonce());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSenderNonce(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipientNonce() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientNonce());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientNonce(), i);
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
        new org.apache.axis.description.TypeDesc(ScepRaSignedAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ScepRaSignedAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkiStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pkiStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FailInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderNonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SenderNonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientNonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RecipientNonce"));
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
