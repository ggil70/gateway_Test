/**
 * ManagedCaEntrustSpecificInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ManagedCaEntrustSpecificInfo  implements java.io.Serializable {
    private java.lang.Integer pkixCmpPort;

    private java.lang.Integer xapPort;

    private byte[] xapAdminEpf;

    private java.lang.String xapAdminPassword;

    private java.lang.String xapAdminDN;

    public ManagedCaEntrustSpecificInfo() {
    }

    public ManagedCaEntrustSpecificInfo(
           java.lang.Integer pkixCmpPort,
           java.lang.Integer xapPort,
           byte[] xapAdminEpf,
           java.lang.String xapAdminPassword,
           java.lang.String xapAdminDN) {
           this.pkixCmpPort = pkixCmpPort;
           this.xapPort = xapPort;
           this.xapAdminEpf = xapAdminEpf;
           this.xapAdminPassword = xapAdminPassword;
           this.xapAdminDN = xapAdminDN;
    }


    /**
     * Gets the pkixCmpPort value for this ManagedCaEntrustSpecificInfo.
     * 
     * @return pkixCmpPort
     */
    public java.lang.Integer getPkixCmpPort() {
        return pkixCmpPort;
    }


    /**
     * Sets the pkixCmpPort value for this ManagedCaEntrustSpecificInfo.
     * 
     * @param pkixCmpPort
     */
    public void setPkixCmpPort(java.lang.Integer pkixCmpPort) {
        this.pkixCmpPort = pkixCmpPort;
    }


    /**
     * Gets the xapPort value for this ManagedCaEntrustSpecificInfo.
     * 
     * @return xapPort
     */
    public java.lang.Integer getXapPort() {
        return xapPort;
    }


    /**
     * Sets the xapPort value for this ManagedCaEntrustSpecificInfo.
     * 
     * @param xapPort
     */
    public void setXapPort(java.lang.Integer xapPort) {
        this.xapPort = xapPort;
    }


    /**
     * Gets the xapAdminEpf value for this ManagedCaEntrustSpecificInfo.
     * 
     * @return xapAdminEpf
     */
    public byte[] getXapAdminEpf() {
        return xapAdminEpf;
    }


    /**
     * Sets the xapAdminEpf value for this ManagedCaEntrustSpecificInfo.
     * 
     * @param xapAdminEpf
     */
    public void setXapAdminEpf(byte[] xapAdminEpf) {
        this.xapAdminEpf = xapAdminEpf;
    }


    /**
     * Gets the xapAdminPassword value for this ManagedCaEntrustSpecificInfo.
     * 
     * @return xapAdminPassword
     */
    public java.lang.String getXapAdminPassword() {
        return xapAdminPassword;
    }


    /**
     * Sets the xapAdminPassword value for this ManagedCaEntrustSpecificInfo.
     * 
     * @param xapAdminPassword
     */
    public void setXapAdminPassword(java.lang.String xapAdminPassword) {
        this.xapAdminPassword = xapAdminPassword;
    }


    /**
     * Gets the xapAdminDN value for this ManagedCaEntrustSpecificInfo.
     * 
     * @return xapAdminDN
     */
    public java.lang.String getXapAdminDN() {
        return xapAdminDN;
    }


    /**
     * Sets the xapAdminDN value for this ManagedCaEntrustSpecificInfo.
     * 
     * @param xapAdminDN
     */
    public void setXapAdminDN(java.lang.String xapAdminDN) {
        this.xapAdminDN = xapAdminDN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCaEntrustSpecificInfo)) return false;
        ManagedCaEntrustSpecificInfo other = (ManagedCaEntrustSpecificInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pkixCmpPort==null && other.getPkixCmpPort()==null) || 
             (this.pkixCmpPort!=null &&
              this.pkixCmpPort.equals(other.getPkixCmpPort()))) &&
            ((this.xapPort==null && other.getXapPort()==null) || 
             (this.xapPort!=null &&
              this.xapPort.equals(other.getXapPort()))) &&
            ((this.xapAdminEpf==null && other.getXapAdminEpf()==null) || 
             (this.xapAdminEpf!=null &&
              java.util.Arrays.equals(this.xapAdminEpf, other.getXapAdminEpf()))) &&
            ((this.xapAdminPassword==null && other.getXapAdminPassword()==null) || 
             (this.xapAdminPassword!=null &&
              this.xapAdminPassword.equals(other.getXapAdminPassword()))) &&
            ((this.xapAdminDN==null && other.getXapAdminDN()==null) || 
             (this.xapAdminDN!=null &&
              this.xapAdminDN.equals(other.getXapAdminDN())));
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
        if (getPkixCmpPort() != null) {
            _hashCode += getPkixCmpPort().hashCode();
        }
        if (getXapPort() != null) {
            _hashCode += getXapPort().hashCode();
        }
        if (getXapAdminEpf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXapAdminEpf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXapAdminEpf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXapAdminPassword() != null) {
            _hashCode += getXapAdminPassword().hashCode();
        }
        if (getXapAdminDN() != null) {
            _hashCode += getXapAdminDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCaEntrustSpecificInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaEntrustSpecificInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkixCmpPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PkixCmpPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xapPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XapPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xapAdminEpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XapAdminEpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xapAdminPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XapAdminPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xapAdminDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XapAdminDN"));
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
