/**
 * UserMachineSecretSetCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserMachineSecretSetCallParms  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String machineNonce;

    private wsdl.adminV8.ig.com.entrust.MachineSecretParms parms;

    public UserMachineSecretSetCallParms() {
    }

    public UserMachineSecretSetCallParms(
           java.lang.String userid,
           java.lang.String machineNonce,
           wsdl.adminV8.ig.com.entrust.MachineSecretParms parms) {
           this.userid = userid;
           this.machineNonce = machineNonce;
           this.parms = parms;
    }


    /**
     * Gets the userid value for this UserMachineSecretSetCallParms.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserMachineSecretSetCallParms.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the machineNonce value for this UserMachineSecretSetCallParms.
     * 
     * @return machineNonce
     */
    public java.lang.String getMachineNonce() {
        return machineNonce;
    }


    /**
     * Sets the machineNonce value for this UserMachineSecretSetCallParms.
     * 
     * @param machineNonce
     */
    public void setMachineNonce(java.lang.String machineNonce) {
        this.machineNonce = machineNonce;
    }


    /**
     * Gets the parms value for this UserMachineSecretSetCallParms.
     * 
     * @return parms
     */
    public wsdl.adminV8.ig.com.entrust.MachineSecretParms getParms() {
        return parms;
    }


    /**
     * Sets the parms value for this UserMachineSecretSetCallParms.
     * 
     * @param parms
     */
    public void setParms(wsdl.adminV8.ig.com.entrust.MachineSecretParms parms) {
        this.parms = parms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserMachineSecretSetCallParms)) return false;
        UserMachineSecretSetCallParms other = (UserMachineSecretSetCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.machineNonce==null && other.getMachineNonce()==null) || 
             (this.machineNonce!=null &&
              this.machineNonce.equals(other.getMachineNonce()))) &&
            ((this.parms==null && other.getParms()==null) || 
             (this.parms!=null &&
              this.parms.equals(other.getParms())));
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
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getMachineNonce() != null) {
            _hashCode += getMachineNonce().hashCode();
        }
        if (getParms() != null) {
            _hashCode += getParms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserMachineSecretSetCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserMachineSecretSetCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineNonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineNonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "MachineSecretParms"));
        elemField.setNillable(false);
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
