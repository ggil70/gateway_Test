/**
 * UserPVNSetParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserPVNSetParms  implements java.io.Serializable {
    private java.lang.String oldPVN;

    private java.lang.String PVN;

    private java.lang.Boolean autoGenerate;

    private java.lang.Boolean changeRequired;

    public UserPVNSetParms() {
    }

    public UserPVNSetParms(
           java.lang.String oldPVN,
           java.lang.String PVN,
           java.lang.Boolean autoGenerate,
           java.lang.Boolean changeRequired) {
           this.oldPVN = oldPVN;
           this.PVN = PVN;
           this.autoGenerate = autoGenerate;
           this.changeRequired = changeRequired;
    }


    /**
     * Gets the oldPVN value for this UserPVNSetParms.
     * 
     * @return oldPVN
     */
    public java.lang.String getOldPVN() {
        return oldPVN;
    }


    /**
     * Sets the oldPVN value for this UserPVNSetParms.
     * 
     * @param oldPVN
     */
    public void setOldPVN(java.lang.String oldPVN) {
        this.oldPVN = oldPVN;
    }


    /**
     * Gets the PVN value for this UserPVNSetParms.
     * 
     * @return PVN
     */
    public java.lang.String getPVN() {
        return PVN;
    }


    /**
     * Sets the PVN value for this UserPVNSetParms.
     * 
     * @param PVN
     */
    public void setPVN(java.lang.String PVN) {
        this.PVN = PVN;
    }


    /**
     * Gets the autoGenerate value for this UserPVNSetParms.
     * 
     * @return autoGenerate
     */
    public java.lang.Boolean getAutoGenerate() {
        return autoGenerate;
    }


    /**
     * Sets the autoGenerate value for this UserPVNSetParms.
     * 
     * @param autoGenerate
     */
    public void setAutoGenerate(java.lang.Boolean autoGenerate) {
        this.autoGenerate = autoGenerate;
    }


    /**
     * Gets the changeRequired value for this UserPVNSetParms.
     * 
     * @return changeRequired
     */
    public java.lang.Boolean getChangeRequired() {
        return changeRequired;
    }


    /**
     * Sets the changeRequired value for this UserPVNSetParms.
     * 
     * @param changeRequired
     */
    public void setChangeRequired(java.lang.Boolean changeRequired) {
        this.changeRequired = changeRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPVNSetParms)) return false;
        UserPVNSetParms other = (UserPVNSetParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldPVN==null && other.getOldPVN()==null) || 
             (this.oldPVN!=null &&
              this.oldPVN.equals(other.getOldPVN()))) &&
            ((this.PVN==null && other.getPVN()==null) || 
             (this.PVN!=null &&
              this.PVN.equals(other.getPVN()))) &&
            ((this.autoGenerate==null && other.getAutoGenerate()==null) || 
             (this.autoGenerate!=null &&
              this.autoGenerate.equals(other.getAutoGenerate()))) &&
            ((this.changeRequired==null && other.getChangeRequired()==null) || 
             (this.changeRequired!=null &&
              this.changeRequired.equals(other.getChangeRequired())));
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
        if (getOldPVN() != null) {
            _hashCode += getOldPVN().hashCode();
        }
        if (getPVN() != null) {
            _hashCode += getPVN().hashCode();
        }
        if (getAutoGenerate() != null) {
            _hashCode += getAutoGenerate().hashCode();
        }
        if (getChangeRequired() != null) {
            _hashCode += getChangeRequired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPVNSetParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserPVNSetParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPVN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OldPVN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PVN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoGenerate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoGenerate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
