/**
 * AuditParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AuditParms  implements java.io.Serializable {
    private java.lang.String targetType;

    private java.lang.String targetOp;

    private java.lang.String targetGroup;

    private java.lang.String targetName;

    private java.lang.String targetSubname;

    private java.lang.String externalCode;

    private java.lang.String externalService;

    private java.lang.String text;

    public AuditParms() {
    }

    public AuditParms(
           java.lang.String targetType,
           java.lang.String targetOp,
           java.lang.String targetGroup,
           java.lang.String targetName,
           java.lang.String targetSubname,
           java.lang.String externalCode,
           java.lang.String externalService,
           java.lang.String text) {
           this.targetType = targetType;
           this.targetOp = targetOp;
           this.targetGroup = targetGroup;
           this.targetName = targetName;
           this.targetSubname = targetSubname;
           this.externalCode = externalCode;
           this.externalService = externalService;
           this.text = text;
    }


    /**
     * Gets the targetType value for this AuditParms.
     * 
     * @return targetType
     */
    public java.lang.String getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this AuditParms.
     * 
     * @param targetType
     */
    public void setTargetType(java.lang.String targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the targetOp value for this AuditParms.
     * 
     * @return targetOp
     */
    public java.lang.String getTargetOp() {
        return targetOp;
    }


    /**
     * Sets the targetOp value for this AuditParms.
     * 
     * @param targetOp
     */
    public void setTargetOp(java.lang.String targetOp) {
        this.targetOp = targetOp;
    }


    /**
     * Gets the targetGroup value for this AuditParms.
     * 
     * @return targetGroup
     */
    public java.lang.String getTargetGroup() {
        return targetGroup;
    }


    /**
     * Sets the targetGroup value for this AuditParms.
     * 
     * @param targetGroup
     */
    public void setTargetGroup(java.lang.String targetGroup) {
        this.targetGroup = targetGroup;
    }


    /**
     * Gets the targetName value for this AuditParms.
     * 
     * @return targetName
     */
    public java.lang.String getTargetName() {
        return targetName;
    }


    /**
     * Sets the targetName value for this AuditParms.
     * 
     * @param targetName
     */
    public void setTargetName(java.lang.String targetName) {
        this.targetName = targetName;
    }


    /**
     * Gets the targetSubname value for this AuditParms.
     * 
     * @return targetSubname
     */
    public java.lang.String getTargetSubname() {
        return targetSubname;
    }


    /**
     * Sets the targetSubname value for this AuditParms.
     * 
     * @param targetSubname
     */
    public void setTargetSubname(java.lang.String targetSubname) {
        this.targetSubname = targetSubname;
    }


    /**
     * Gets the externalCode value for this AuditParms.
     * 
     * @return externalCode
     */
    public java.lang.String getExternalCode() {
        return externalCode;
    }


    /**
     * Sets the externalCode value for this AuditParms.
     * 
     * @param externalCode
     */
    public void setExternalCode(java.lang.String externalCode) {
        this.externalCode = externalCode;
    }


    /**
     * Gets the externalService value for this AuditParms.
     * 
     * @return externalService
     */
    public java.lang.String getExternalService() {
        return externalService;
    }


    /**
     * Sets the externalService value for this AuditParms.
     * 
     * @param externalService
     */
    public void setExternalService(java.lang.String externalService) {
        this.externalService = externalService;
    }


    /**
     * Gets the text value for this AuditParms.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this AuditParms.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditParms)) return false;
        AuditParms other = (AuditParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetType==null && other.getTargetType()==null) || 
             (this.targetType!=null &&
              this.targetType.equals(other.getTargetType()))) &&
            ((this.targetOp==null && other.getTargetOp()==null) || 
             (this.targetOp!=null &&
              this.targetOp.equals(other.getTargetOp()))) &&
            ((this.targetGroup==null && other.getTargetGroup()==null) || 
             (this.targetGroup!=null &&
              this.targetGroup.equals(other.getTargetGroup()))) &&
            ((this.targetName==null && other.getTargetName()==null) || 
             (this.targetName!=null &&
              this.targetName.equals(other.getTargetName()))) &&
            ((this.targetSubname==null && other.getTargetSubname()==null) || 
             (this.targetSubname!=null &&
              this.targetSubname.equals(other.getTargetSubname()))) &&
            ((this.externalCode==null && other.getExternalCode()==null) || 
             (this.externalCode!=null &&
              this.externalCode.equals(other.getExternalCode()))) &&
            ((this.externalService==null && other.getExternalService()==null) || 
             (this.externalService!=null &&
              this.externalService.equals(other.getExternalService()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText())));
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
        if (getTargetType() != null) {
            _hashCode += getTargetType().hashCode();
        }
        if (getTargetOp() != null) {
            _hashCode += getTargetOp().hashCode();
        }
        if (getTargetGroup() != null) {
            _hashCode += getTargetGroup().hashCode();
        }
        if (getTargetName() != null) {
            _hashCode += getTargetName().hashCode();
        }
        if (getTargetSubname() != null) {
            _hashCode += getTargetSubname().hashCode();
        }
        if (getExternalCode() != null) {
            _hashCode += getExternalCode().hashCode();
        }
        if (getExternalService() != null) {
            _hashCode += getExternalService().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuditParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetOp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetSubname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetSubname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
