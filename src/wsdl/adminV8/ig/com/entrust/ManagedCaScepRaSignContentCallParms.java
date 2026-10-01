/**
 * ManagedCaScepRaSignContentCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ManagedCaScepRaSignContentCallParms  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.ScepRaSignContentParms parms;

    public ManagedCaScepRaSignContentCallParms() {
    }

    public ManagedCaScepRaSignContentCallParms(
           wsdl.adminV8.ig.com.entrust.ScepRaSignContentParms parms) {
           this.parms = parms;
    }


    /**
     * Gets the parms value for this ManagedCaScepRaSignContentCallParms.
     * 
     * @return parms
     */
    public wsdl.adminV8.ig.com.entrust.ScepRaSignContentParms getParms() {
        return parms;
    }


    /**
     * Sets the parms value for this ManagedCaScepRaSignContentCallParms.
     * 
     * @param parms
     */
    public void setParms(wsdl.adminV8.ig.com.entrust.ScepRaSignContentParms parms) {
        this.parms = parms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCaScepRaSignContentCallParms)) return false;
        ManagedCaScepRaSignContentCallParms other = (ManagedCaScepRaSignContentCallParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getParms() != null) {
            _hashCode += getParms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCaScepRaSignContentCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaScepRaSignContentCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ScepRaSignContentParms"));
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
