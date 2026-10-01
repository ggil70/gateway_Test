/**
 * GenericChallengeParmsEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.authenticationV8.ig.com.entrust;

public class GenericChallengeParmsEx  extends wsdl.authenticationV8.ig.com.entrust.GenericChallengeParms  implements java.io.Serializable {
    private java.lang.String passwordName;

    public GenericChallengeParmsEx() {
    }

    public GenericChallengeParmsEx(
           java.lang.String[] challengeHistory,
           java.lang.String securityLevel,
           java.lang.String authenticationType,
           java.lang.String[] authenticationTypeList,
           java.lang.String applicationName,
           java.lang.Boolean requiresPVN,
           java.lang.String[] authTypesRequiringPVN,
           java.lang.Integer gridChallengeSize,
           java.lang.Integer QAChallengeSize,
           wsdl.authenticationV8.ig.com.entrust.AuthenticationSecretParms authSecretParms,
           wsdl.authenticationV8.ig.com.entrust.SharedSecretParms sharedSecretParms,
           java.lang.String IPAddress,
           java.lang.Boolean updateMachineSecret,
           java.lang.Boolean registerMachineSecret,
           wsdl.authenticationV8.ig.com.entrust.MachineSecret machineSecret,
           java.lang.Boolean registerCertificate,
           java.lang.String certificate,
           wsdl.authenticationV8.ig.com.entrust.ExternalRiskScoreParms externalRiskScore,
           java.lang.Boolean useDefaultDelivery,
           java.lang.String[] contactInfoLabel,
           java.lang.Boolean deliverForDynamicRefresh,
           java.lang.Boolean onlySelectOTPAuthenticationIfDeliveryAvailable,
           java.lang.String[] tokenSets,
           commonV8.ig.com.entrust.NameValue[] transactionDetails,
           java.lang.Boolean performDeliveryAndSignature,
           java.lang.Boolean requireDeliveryAndSignatureIfAvailable,
           java.lang.String passwordName) {
        super(
            challengeHistory,
            securityLevel,
            authenticationType,
            authenticationTypeList,
            applicationName,
            requiresPVN,
            authTypesRequiringPVN,
            gridChallengeSize,
            QAChallengeSize,
            authSecretParms,
            sharedSecretParms,
            IPAddress,
            updateMachineSecret,
            registerMachineSecret,
            machineSecret,
            registerCertificate,
            certificate,
            externalRiskScore,
            useDefaultDelivery,
            contactInfoLabel,
            deliverForDynamicRefresh,
            onlySelectOTPAuthenticationIfDeliveryAvailable,
            tokenSets,
            transactionDetails,
            performDeliveryAndSignature,
            requireDeliveryAndSignatureIfAvailable);
        this.passwordName = passwordName;
    }


    /**
     * Gets the passwordName value for this GenericChallengeParmsEx.
     * 
     * @return passwordName
     */
    public java.lang.String getPasswordName() {
        return passwordName;
    }


    /**
     * Sets the passwordName value for this GenericChallengeParmsEx.
     * 
     * @param passwordName
     */
    public void setPasswordName(java.lang.String passwordName) {
        this.passwordName = passwordName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenericChallengeParmsEx)) return false;
        GenericChallengeParmsEx other = (GenericChallengeParmsEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.passwordName==null && other.getPasswordName()==null) || 
             (this.passwordName!=null &&
              this.passwordName.equals(other.getPasswordName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPasswordName() != null) {
            _hashCode += getPasswordName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenericChallengeParmsEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:authenticationV8:wsdl", "GenericChallengeParmsEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordName"));
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
