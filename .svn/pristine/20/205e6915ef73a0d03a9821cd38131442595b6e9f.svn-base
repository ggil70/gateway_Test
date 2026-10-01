/**
 * UserSmartCredentialPACSGetResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserSmartCredentialPACSGetResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.UserSmartCredentialInfo smartCredential;

    private wsdl.adminV8.ig.com.entrust.UserSmartCredentialPACSInfo[] PACS;

    public UserSmartCredentialPACSGetResult() {
    }

    public UserSmartCredentialPACSGetResult(
           wsdl.adminV8.ig.com.entrust.UserSmartCredentialInfo smartCredential,
           wsdl.adminV8.ig.com.entrust.UserSmartCredentialPACSInfo[] PACS) {
           this.smartCredential = smartCredential;
           this.PACS = PACS;
    }


    /**
     * Gets the smartCredential value for this UserSmartCredentialPACSGetResult.
     * 
     * @return smartCredential
     */
    public wsdl.adminV8.ig.com.entrust.UserSmartCredentialInfo getSmartCredential() {
        return smartCredential;
    }


    /**
     * Sets the smartCredential value for this UserSmartCredentialPACSGetResult.
     * 
     * @param smartCredential
     */
    public void setSmartCredential(wsdl.adminV8.ig.com.entrust.UserSmartCredentialInfo smartCredential) {
        this.smartCredential = smartCredential;
    }


    /**
     * Gets the PACS value for this UserSmartCredentialPACSGetResult.
     * 
     * @return PACS
     */
    public wsdl.adminV8.ig.com.entrust.UserSmartCredentialPACSInfo[] getPACS() {
        return PACS;
    }


    /**
     * Sets the PACS value for this UserSmartCredentialPACSGetResult.
     * 
     * @param PACS
     */
    public void setPACS(wsdl.adminV8.ig.com.entrust.UserSmartCredentialPACSInfo[] PACS) {
        this.PACS = PACS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSmartCredentialPACSGetResult)) return false;
        UserSmartCredentialPACSGetResult other = (UserSmartCredentialPACSGetResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smartCredential==null && other.getSmartCredential()==null) || 
             (this.smartCredential!=null &&
              this.smartCredential.equals(other.getSmartCredential()))) &&
            ((this.PACS==null && other.getPACS()==null) || 
             (this.PACS!=null &&
              java.util.Arrays.equals(this.PACS, other.getPACS())));
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
        if (getSmartCredential() != null) {
            _hashCode += getSmartCredential().hashCode();
        }
        if (getPACS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPACS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPACS(), i);
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
        new org.apache.axis.description.TypeDesc(UserSmartCredentialPACSGetResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSmartCredentialPACSGetResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smartCredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSmartCredentialInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PACS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PACS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSmartCredentialPACSInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
