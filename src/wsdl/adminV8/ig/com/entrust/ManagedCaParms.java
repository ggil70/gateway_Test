/**
 * ManagedCaParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ManagedCaParms  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String host;

    private java.lang.String proxy;

    private java.lang.String dirHost;

    private java.lang.Integer dirLdapPort;

    private wsdl.adminV8.ig.com.entrust.ContentSigner pivContentSigner;

    private wsdl.adminV8.ig.com.entrust.ScepRa scepRaSigner;

    private java.lang.Boolean publishCRLAfterRevocation;

    private wsdl.adminV8.ig.com.entrust.ManagedCaEntrustSpecificParms entrustSpecificParams;

    private wsdl.adminV8.ig.com.entrust.ManagedCaMicrosoftSpecificParms microsoftSpecificParams;

    public ManagedCaParms() {
    }

    public ManagedCaParms(
           java.lang.String name,
           java.lang.String host,
           java.lang.String proxy,
           java.lang.String dirHost,
           java.lang.Integer dirLdapPort,
           wsdl.adminV8.ig.com.entrust.ContentSigner pivContentSigner,
           wsdl.adminV8.ig.com.entrust.ScepRa scepRaSigner,
           java.lang.Boolean publishCRLAfterRevocation,
           wsdl.adminV8.ig.com.entrust.ManagedCaEntrustSpecificParms entrustSpecificParams,
           wsdl.adminV8.ig.com.entrust.ManagedCaMicrosoftSpecificParms microsoftSpecificParams) {
           this.name = name;
           this.host = host;
           this.proxy = proxy;
           this.dirHost = dirHost;
           this.dirLdapPort = dirLdapPort;
           this.pivContentSigner = pivContentSigner;
           this.scepRaSigner = scepRaSigner;
           this.publishCRLAfterRevocation = publishCRLAfterRevocation;
           this.entrustSpecificParams = entrustSpecificParams;
           this.microsoftSpecificParams = microsoftSpecificParams;
    }


    /**
     * Gets the name value for this ManagedCaParms.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ManagedCaParms.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the host value for this ManagedCaParms.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this ManagedCaParms.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the proxy value for this ManagedCaParms.
     * 
     * @return proxy
     */
    public java.lang.String getProxy() {
        return proxy;
    }


    /**
     * Sets the proxy value for this ManagedCaParms.
     * 
     * @param proxy
     */
    public void setProxy(java.lang.String proxy) {
        this.proxy = proxy;
    }


    /**
     * Gets the dirHost value for this ManagedCaParms.
     * 
     * @return dirHost
     */
    public java.lang.String getDirHost() {
        return dirHost;
    }


    /**
     * Sets the dirHost value for this ManagedCaParms.
     * 
     * @param dirHost
     */
    public void setDirHost(java.lang.String dirHost) {
        this.dirHost = dirHost;
    }


    /**
     * Gets the dirLdapPort value for this ManagedCaParms.
     * 
     * @return dirLdapPort
     */
    public java.lang.Integer getDirLdapPort() {
        return dirLdapPort;
    }


    /**
     * Sets the dirLdapPort value for this ManagedCaParms.
     * 
     * @param dirLdapPort
     */
    public void setDirLdapPort(java.lang.Integer dirLdapPort) {
        this.dirLdapPort = dirLdapPort;
    }


    /**
     * Gets the pivContentSigner value for this ManagedCaParms.
     * 
     * @return pivContentSigner
     */
    public wsdl.adminV8.ig.com.entrust.ContentSigner getPivContentSigner() {
        return pivContentSigner;
    }


    /**
     * Sets the pivContentSigner value for this ManagedCaParms.
     * 
     * @param pivContentSigner
     */
    public void setPivContentSigner(wsdl.adminV8.ig.com.entrust.ContentSigner pivContentSigner) {
        this.pivContentSigner = pivContentSigner;
    }


    /**
     * Gets the scepRaSigner value for this ManagedCaParms.
     * 
     * @return scepRaSigner
     */
    public wsdl.adminV8.ig.com.entrust.ScepRa getScepRaSigner() {
        return scepRaSigner;
    }


    /**
     * Sets the scepRaSigner value for this ManagedCaParms.
     * 
     * @param scepRaSigner
     */
    public void setScepRaSigner(wsdl.adminV8.ig.com.entrust.ScepRa scepRaSigner) {
        this.scepRaSigner = scepRaSigner;
    }


    /**
     * Gets the publishCRLAfterRevocation value for this ManagedCaParms.
     * 
     * @return publishCRLAfterRevocation
     */
    public java.lang.Boolean getPublishCRLAfterRevocation() {
        return publishCRLAfterRevocation;
    }


    /**
     * Sets the publishCRLAfterRevocation value for this ManagedCaParms.
     * 
     * @param publishCRLAfterRevocation
     */
    public void setPublishCRLAfterRevocation(java.lang.Boolean publishCRLAfterRevocation) {
        this.publishCRLAfterRevocation = publishCRLAfterRevocation;
    }


    /**
     * Gets the entrustSpecificParams value for this ManagedCaParms.
     * 
     * @return entrustSpecificParams
     */
    public wsdl.adminV8.ig.com.entrust.ManagedCaEntrustSpecificParms getEntrustSpecificParams() {
        return entrustSpecificParams;
    }


    /**
     * Sets the entrustSpecificParams value for this ManagedCaParms.
     * 
     * @param entrustSpecificParams
     */
    public void setEntrustSpecificParams(wsdl.adminV8.ig.com.entrust.ManagedCaEntrustSpecificParms entrustSpecificParams) {
        this.entrustSpecificParams = entrustSpecificParams;
    }


    /**
     * Gets the microsoftSpecificParams value for this ManagedCaParms.
     * 
     * @return microsoftSpecificParams
     */
    public wsdl.adminV8.ig.com.entrust.ManagedCaMicrosoftSpecificParms getMicrosoftSpecificParams() {
        return microsoftSpecificParams;
    }


    /**
     * Sets the microsoftSpecificParams value for this ManagedCaParms.
     * 
     * @param microsoftSpecificParams
     */
    public void setMicrosoftSpecificParams(wsdl.adminV8.ig.com.entrust.ManagedCaMicrosoftSpecificParms microsoftSpecificParams) {
        this.microsoftSpecificParams = microsoftSpecificParams;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCaParms)) return false;
        ManagedCaParms other = (ManagedCaParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.proxy==null && other.getProxy()==null) || 
             (this.proxy!=null &&
              this.proxy.equals(other.getProxy()))) &&
            ((this.dirHost==null && other.getDirHost()==null) || 
             (this.dirHost!=null &&
              this.dirHost.equals(other.getDirHost()))) &&
            ((this.dirLdapPort==null && other.getDirLdapPort()==null) || 
             (this.dirLdapPort!=null &&
              this.dirLdapPort.equals(other.getDirLdapPort()))) &&
            ((this.pivContentSigner==null && other.getPivContentSigner()==null) || 
             (this.pivContentSigner!=null &&
              this.pivContentSigner.equals(other.getPivContentSigner()))) &&
            ((this.scepRaSigner==null && other.getScepRaSigner()==null) || 
             (this.scepRaSigner!=null &&
              this.scepRaSigner.equals(other.getScepRaSigner()))) &&
            ((this.publishCRLAfterRevocation==null && other.getPublishCRLAfterRevocation()==null) || 
             (this.publishCRLAfterRevocation!=null &&
              this.publishCRLAfterRevocation.equals(other.getPublishCRLAfterRevocation()))) &&
            ((this.entrustSpecificParams==null && other.getEntrustSpecificParams()==null) || 
             (this.entrustSpecificParams!=null &&
              this.entrustSpecificParams.equals(other.getEntrustSpecificParams()))) &&
            ((this.microsoftSpecificParams==null && other.getMicrosoftSpecificParams()==null) || 
             (this.microsoftSpecificParams!=null &&
              this.microsoftSpecificParams.equals(other.getMicrosoftSpecificParams())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getProxy() != null) {
            _hashCode += getProxy().hashCode();
        }
        if (getDirHost() != null) {
            _hashCode += getDirHost().hashCode();
        }
        if (getDirLdapPort() != null) {
            _hashCode += getDirLdapPort().hashCode();
        }
        if (getPivContentSigner() != null) {
            _hashCode += getPivContentSigner().hashCode();
        }
        if (getScepRaSigner() != null) {
            _hashCode += getScepRaSigner().hashCode();
        }
        if (getPublishCRLAfterRevocation() != null) {
            _hashCode += getPublishCRLAfterRevocation().hashCode();
        }
        if (getEntrustSpecificParams() != null) {
            _hashCode += getEntrustSpecificParams().hashCode();
        }
        if (getMicrosoftSpecificParams() != null) {
            _hashCode += getMicrosoftSpecificParams().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCaParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Proxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DirHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirLdapPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DirLdapPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pivContentSigner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PivContentSigner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ContentSigner"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scepRaSigner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ScepRaSigner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ScepRa"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishCRLAfterRevocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublishCRLAfterRevocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrustSpecificParams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EntrustSpecificParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaEntrustSpecificParms"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microsoftSpecificParams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MicrosoftSpecificParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ManagedCaMicrosoftSpecificParms"));
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
