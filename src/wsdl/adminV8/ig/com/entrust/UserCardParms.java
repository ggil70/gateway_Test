/**
 * UserCardParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserCardParms  implements java.io.Serializable {
    private java.lang.String serialNumber;

    private java.lang.Long lifetime;

    private java.lang.Long supersede;

    private java.lang.String state;

    private java.lang.Integer challengeCount;

    private java.lang.Integer leastUsedCellUsageCount;

    private java.lang.String comment;

    public UserCardParms() {
    }

    public UserCardParms(
           java.lang.String serialNumber,
           java.lang.Long lifetime,
           java.lang.Long supersede,
           java.lang.String state,
           java.lang.Integer challengeCount,
           java.lang.Integer leastUsedCellUsageCount,
           java.lang.String comment) {
           this.serialNumber = serialNumber;
           this.lifetime = lifetime;
           this.supersede = supersede;
           this.state = state;
           this.challengeCount = challengeCount;
           this.leastUsedCellUsageCount = leastUsedCellUsageCount;
           this.comment = comment;
    }


    /**
     * Gets the serialNumber value for this UserCardParms.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this UserCardParms.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the lifetime value for this UserCardParms.
     * 
     * @return lifetime
     */
    public java.lang.Long getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this UserCardParms.
     * 
     * @param lifetime
     */
    public void setLifetime(java.lang.Long lifetime) {
        this.lifetime = lifetime;
    }


    /**
     * Gets the supersede value for this UserCardParms.
     * 
     * @return supersede
     */
    public java.lang.Long getSupersede() {
        return supersede;
    }


    /**
     * Sets the supersede value for this UserCardParms.
     * 
     * @param supersede
     */
    public void setSupersede(java.lang.Long supersede) {
        this.supersede = supersede;
    }


    /**
     * Gets the state value for this UserCardParms.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this UserCardParms.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the challengeCount value for this UserCardParms.
     * 
     * @return challengeCount
     */
    public java.lang.Integer getChallengeCount() {
        return challengeCount;
    }


    /**
     * Sets the challengeCount value for this UserCardParms.
     * 
     * @param challengeCount
     */
    public void setChallengeCount(java.lang.Integer challengeCount) {
        this.challengeCount = challengeCount;
    }


    /**
     * Gets the leastUsedCellUsageCount value for this UserCardParms.
     * 
     * @return leastUsedCellUsageCount
     */
    public java.lang.Integer getLeastUsedCellUsageCount() {
        return leastUsedCellUsageCount;
    }


    /**
     * Sets the leastUsedCellUsageCount value for this UserCardParms.
     * 
     * @param leastUsedCellUsageCount
     */
    public void setLeastUsedCellUsageCount(java.lang.Integer leastUsedCellUsageCount) {
        this.leastUsedCellUsageCount = leastUsedCellUsageCount;
    }


    /**
     * Gets the comment value for this UserCardParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserCardParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserCardParms)) return false;
        UserCardParms other = (UserCardParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.lifetime==null && other.getLifetime()==null) || 
             (this.lifetime!=null &&
              this.lifetime.equals(other.getLifetime()))) &&
            ((this.supersede==null && other.getSupersede()==null) || 
             (this.supersede!=null &&
              this.supersede.equals(other.getSupersede()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.challengeCount==null && other.getChallengeCount()==null) || 
             (this.challengeCount!=null &&
              this.challengeCount.equals(other.getChallengeCount()))) &&
            ((this.leastUsedCellUsageCount==null && other.getLeastUsedCellUsageCount()==null) || 
             (this.leastUsedCellUsageCount!=null &&
              this.leastUsedCellUsageCount.equals(other.getLeastUsedCellUsageCount()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getLifetime() != null) {
            _hashCode += getLifetime().hashCode();
        }
        if (getSupersede() != null) {
            _hashCode += getSupersede().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getChallengeCount() != null) {
            _hashCode += getChallengeCount().hashCode();
        }
        if (getLeastUsedCellUsageCount() != null) {
            _hashCode += getLeastUsedCellUsageCount().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserCardParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserCardParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Lifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supersede");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Supersede"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChallengeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leastUsedCellUsageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LeastUsedCellUsageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
