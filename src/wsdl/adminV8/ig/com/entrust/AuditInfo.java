/**
 * AuditInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AuditInfo  implements java.io.Serializable {
    private long seqNo;

    private java.util.Calendar date;

    private java.lang.String host;

    private java.lang.String level;

    private int code;

    private java.lang.String symbol;

    private java.lang.String adminGroup;

    private java.lang.String adminName;

    private java.lang.String targetType;

    private java.lang.String targetOp;

    private java.lang.String targetGroup;

    private java.lang.String targetName;

    private java.lang.String targetSubname;

    private java.lang.String service;

    private java.lang.String externalCode;

    private java.lang.String externalService;

    private java.lang.String text;

    private java.lang.String[] rolesGrantingAccess;

    public AuditInfo() {
    }

    public AuditInfo(
           long seqNo,
           java.util.Calendar date,
           java.lang.String host,
           java.lang.String level,
           int code,
           java.lang.String symbol,
           java.lang.String adminGroup,
           java.lang.String adminName,
           java.lang.String targetType,
           java.lang.String targetOp,
           java.lang.String targetGroup,
           java.lang.String targetName,
           java.lang.String targetSubname,
           java.lang.String service,
           java.lang.String externalCode,
           java.lang.String externalService,
           java.lang.String text,
           java.lang.String[] rolesGrantingAccess) {
           this.seqNo = seqNo;
           this.date = date;
           this.host = host;
           this.level = level;
           this.code = code;
           this.symbol = symbol;
           this.adminGroup = adminGroup;
           this.adminName = adminName;
           this.targetType = targetType;
           this.targetOp = targetOp;
           this.targetGroup = targetGroup;
           this.targetName = targetName;
           this.targetSubname = targetSubname;
           this.service = service;
           this.externalCode = externalCode;
           this.externalService = externalService;
           this.text = text;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the seqNo value for this AuditInfo.
     * 
     * @return seqNo
     */
    public long getSeqNo() {
        return seqNo;
    }


    /**
     * Sets the seqNo value for this AuditInfo.
     * 
     * @param seqNo
     */
    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }


    /**
     * Gets the date value for this AuditInfo.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this AuditInfo.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the host value for this AuditInfo.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this AuditInfo.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the level value for this AuditInfo.
     * 
     * @return level
     */
    public java.lang.String getLevel() {
        return level;
    }


    /**
     * Sets the level value for this AuditInfo.
     * 
     * @param level
     */
    public void setLevel(java.lang.String level) {
        this.level = level;
    }


    /**
     * Gets the code value for this AuditInfo.
     * 
     * @return code
     */
    public int getCode() {
        return code;
    }


    /**
     * Sets the code value for this AuditInfo.
     * 
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * Gets the symbol value for this AuditInfo.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this AuditInfo.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the adminGroup value for this AuditInfo.
     * 
     * @return adminGroup
     */
    public java.lang.String getAdminGroup() {
        return adminGroup;
    }


    /**
     * Sets the adminGroup value for this AuditInfo.
     * 
     * @param adminGroup
     */
    public void setAdminGroup(java.lang.String adminGroup) {
        this.adminGroup = adminGroup;
    }


    /**
     * Gets the adminName value for this AuditInfo.
     * 
     * @return adminName
     */
    public java.lang.String getAdminName() {
        return adminName;
    }


    /**
     * Sets the adminName value for this AuditInfo.
     * 
     * @param adminName
     */
    public void setAdminName(java.lang.String adminName) {
        this.adminName = adminName;
    }


    /**
     * Gets the targetType value for this AuditInfo.
     * 
     * @return targetType
     */
    public java.lang.String getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this AuditInfo.
     * 
     * @param targetType
     */
    public void setTargetType(java.lang.String targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the targetOp value for this AuditInfo.
     * 
     * @return targetOp
     */
    public java.lang.String getTargetOp() {
        return targetOp;
    }


    /**
     * Sets the targetOp value for this AuditInfo.
     * 
     * @param targetOp
     */
    public void setTargetOp(java.lang.String targetOp) {
        this.targetOp = targetOp;
    }


    /**
     * Gets the targetGroup value for this AuditInfo.
     * 
     * @return targetGroup
     */
    public java.lang.String getTargetGroup() {
        return targetGroup;
    }


    /**
     * Sets the targetGroup value for this AuditInfo.
     * 
     * @param targetGroup
     */
    public void setTargetGroup(java.lang.String targetGroup) {
        this.targetGroup = targetGroup;
    }


    /**
     * Gets the targetName value for this AuditInfo.
     * 
     * @return targetName
     */
    public java.lang.String getTargetName() {
        return targetName;
    }


    /**
     * Sets the targetName value for this AuditInfo.
     * 
     * @param targetName
     */
    public void setTargetName(java.lang.String targetName) {
        this.targetName = targetName;
    }


    /**
     * Gets the targetSubname value for this AuditInfo.
     * 
     * @return targetSubname
     */
    public java.lang.String getTargetSubname() {
        return targetSubname;
    }


    /**
     * Sets the targetSubname value for this AuditInfo.
     * 
     * @param targetSubname
     */
    public void setTargetSubname(java.lang.String targetSubname) {
        this.targetSubname = targetSubname;
    }


    /**
     * Gets the service value for this AuditInfo.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this AuditInfo.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the externalCode value for this AuditInfo.
     * 
     * @return externalCode
     */
    public java.lang.String getExternalCode() {
        return externalCode;
    }


    /**
     * Sets the externalCode value for this AuditInfo.
     * 
     * @param externalCode
     */
    public void setExternalCode(java.lang.String externalCode) {
        this.externalCode = externalCode;
    }


    /**
     * Gets the externalService value for this AuditInfo.
     * 
     * @return externalService
     */
    public java.lang.String getExternalService() {
        return externalService;
    }


    /**
     * Sets the externalService value for this AuditInfo.
     * 
     * @param externalService
     */
    public void setExternalService(java.lang.String externalService) {
        this.externalService = externalService;
    }


    /**
     * Gets the text value for this AuditInfo.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this AuditInfo.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the rolesGrantingAccess value for this AuditInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this AuditInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditInfo)) return false;
        AuditInfo other = (AuditInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.seqNo == other.getSeqNo() &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            this.code == other.getCode() &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.adminGroup==null && other.getAdminGroup()==null) || 
             (this.adminGroup!=null &&
              this.adminGroup.equals(other.getAdminGroup()))) &&
            ((this.adminName==null && other.getAdminName()==null) || 
             (this.adminName!=null &&
              this.adminName.equals(other.getAdminName()))) &&
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
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.externalCode==null && other.getExternalCode()==null) || 
             (this.externalCode!=null &&
              this.externalCode.equals(other.getExternalCode()))) &&
            ((this.externalService==null && other.getExternalService()==null) || 
             (this.externalService!=null &&
              this.externalService.equals(other.getExternalService()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.rolesGrantingAccess==null && other.getRolesGrantingAccess()==null) || 
             (this.rolesGrantingAccess!=null &&
              java.util.Arrays.equals(this.rolesGrantingAccess, other.getRolesGrantingAccess())));
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
        _hashCode += new Long(getSeqNo()).hashCode();
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        _hashCode += getCode();
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getAdminGroup() != null) {
            _hashCode += getAdminGroup().hashCode();
        }
        if (getAdminName() != null) {
            _hashCode += getAdminName().hashCode();
        }
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
        if (getService() != null) {
            _hashCode += getService().hashCode();
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
        if (getRolesGrantingAccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRolesGrantingAccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRolesGrantingAccess(), i);
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
        new org.apache.axis.description.TypeDesc(AuditInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuditInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adminGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adminName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesGrantingAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RolesGrantingAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
