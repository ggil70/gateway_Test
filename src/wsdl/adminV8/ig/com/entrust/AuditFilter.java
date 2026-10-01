/**
 * AuditFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class AuditFilter  implements java.io.Serializable {
    private java.lang.Long seqNo;

    private java.lang.Long seqNoStart;

    private java.lang.Long seqNoEnd;

    private java.lang.String host;

    private java.lang.String level;

    private java.lang.Integer code;

    private int[] codes;

    private java.lang.Integer codeStart;

    private java.lang.Integer codeEnd;

    private java.util.Calendar dateStart;

    private java.util.Calendar dateEnd;

    private java.lang.String service;

    private java.lang.String adminGroup;

    private java.lang.String adminName;

    private java.lang.String targetType;

    private java.lang.String[] targetTypes;

    private java.lang.String targetOp;

    private java.lang.String[] targetOps;

    private java.lang.String targetGroup;

    private java.lang.String targetName;

    private java.lang.String targetSubname;

    private java.lang.String externalCode;

    private java.lang.String externalService;

    private java.lang.String text;

    private java.lang.Integer maxReturn;

    public AuditFilter() {
    }

    public AuditFilter(
           java.lang.Long seqNo,
           java.lang.Long seqNoStart,
           java.lang.Long seqNoEnd,
           java.lang.String host,
           java.lang.String level,
           java.lang.Integer code,
           int[] codes,
           java.lang.Integer codeStart,
           java.lang.Integer codeEnd,
           java.util.Calendar dateStart,
           java.util.Calendar dateEnd,
           java.lang.String service,
           java.lang.String adminGroup,
           java.lang.String adminName,
           java.lang.String targetType,
           java.lang.String[] targetTypes,
           java.lang.String targetOp,
           java.lang.String[] targetOps,
           java.lang.String targetGroup,
           java.lang.String targetName,
           java.lang.String targetSubname,
           java.lang.String externalCode,
           java.lang.String externalService,
           java.lang.String text,
           java.lang.Integer maxReturn) {
           this.seqNo = seqNo;
           this.seqNoStart = seqNoStart;
           this.seqNoEnd = seqNoEnd;
           this.host = host;
           this.level = level;
           this.code = code;
           this.codes = codes;
           this.codeStart = codeStart;
           this.codeEnd = codeEnd;
           this.dateStart = dateStart;
           this.dateEnd = dateEnd;
           this.service = service;
           this.adminGroup = adminGroup;
           this.adminName = adminName;
           this.targetType = targetType;
           this.targetTypes = targetTypes;
           this.targetOp = targetOp;
           this.targetOps = targetOps;
           this.targetGroup = targetGroup;
           this.targetName = targetName;
           this.targetSubname = targetSubname;
           this.externalCode = externalCode;
           this.externalService = externalService;
           this.text = text;
           this.maxReturn = maxReturn;
    }


    /**
     * Gets the seqNo value for this AuditFilter.
     * 
     * @return seqNo
     */
    public java.lang.Long getSeqNo() {
        return seqNo;
    }


    /**
     * Sets the seqNo value for this AuditFilter.
     * 
     * @param seqNo
     */
    public void setSeqNo(java.lang.Long seqNo) {
        this.seqNo = seqNo;
    }


    /**
     * Gets the seqNoStart value for this AuditFilter.
     * 
     * @return seqNoStart
     */
    public java.lang.Long getSeqNoStart() {
        return seqNoStart;
    }


    /**
     * Sets the seqNoStart value for this AuditFilter.
     * 
     * @param seqNoStart
     */
    public void setSeqNoStart(java.lang.Long seqNoStart) {
        this.seqNoStart = seqNoStart;
    }


    /**
     * Gets the seqNoEnd value for this AuditFilter.
     * 
     * @return seqNoEnd
     */
    public java.lang.Long getSeqNoEnd() {
        return seqNoEnd;
    }


    /**
     * Sets the seqNoEnd value for this AuditFilter.
     * 
     * @param seqNoEnd
     */
    public void setSeqNoEnd(java.lang.Long seqNoEnd) {
        this.seqNoEnd = seqNoEnd;
    }


    /**
     * Gets the host value for this AuditFilter.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this AuditFilter.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the level value for this AuditFilter.
     * 
     * @return level
     */
    public java.lang.String getLevel() {
        return level;
    }


    /**
     * Sets the level value for this AuditFilter.
     * 
     * @param level
     */
    public void setLevel(java.lang.String level) {
        this.level = level;
    }


    /**
     * Gets the code value for this AuditFilter.
     * 
     * @return code
     */
    public java.lang.Integer getCode() {
        return code;
    }


    /**
     * Sets the code value for this AuditFilter.
     * 
     * @param code
     */
    public void setCode(java.lang.Integer code) {
        this.code = code;
    }


    /**
     * Gets the codes value for this AuditFilter.
     * 
     * @return codes
     */
    public int[] getCodes() {
        return codes;
    }


    /**
     * Sets the codes value for this AuditFilter.
     * 
     * @param codes
     */
    public void setCodes(int[] codes) {
        this.codes = codes;
    }


    /**
     * Gets the codeStart value for this AuditFilter.
     * 
     * @return codeStart
     */
    public java.lang.Integer getCodeStart() {
        return codeStart;
    }


    /**
     * Sets the codeStart value for this AuditFilter.
     * 
     * @param codeStart
     */
    public void setCodeStart(java.lang.Integer codeStart) {
        this.codeStart = codeStart;
    }


    /**
     * Gets the codeEnd value for this AuditFilter.
     * 
     * @return codeEnd
     */
    public java.lang.Integer getCodeEnd() {
        return codeEnd;
    }


    /**
     * Sets the codeEnd value for this AuditFilter.
     * 
     * @param codeEnd
     */
    public void setCodeEnd(java.lang.Integer codeEnd) {
        this.codeEnd = codeEnd;
    }


    /**
     * Gets the dateStart value for this AuditFilter.
     * 
     * @return dateStart
     */
    public java.util.Calendar getDateStart() {
        return dateStart;
    }


    /**
     * Sets the dateStart value for this AuditFilter.
     * 
     * @param dateStart
     */
    public void setDateStart(java.util.Calendar dateStart) {
        this.dateStart = dateStart;
    }


    /**
     * Gets the dateEnd value for this AuditFilter.
     * 
     * @return dateEnd
     */
    public java.util.Calendar getDateEnd() {
        return dateEnd;
    }


    /**
     * Sets the dateEnd value for this AuditFilter.
     * 
     * @param dateEnd
     */
    public void setDateEnd(java.util.Calendar dateEnd) {
        this.dateEnd = dateEnd;
    }


    /**
     * Gets the service value for this AuditFilter.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this AuditFilter.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the adminGroup value for this AuditFilter.
     * 
     * @return adminGroup
     */
    public java.lang.String getAdminGroup() {
        return adminGroup;
    }


    /**
     * Sets the adminGroup value for this AuditFilter.
     * 
     * @param adminGroup
     */
    public void setAdminGroup(java.lang.String adminGroup) {
        this.adminGroup = adminGroup;
    }


    /**
     * Gets the adminName value for this AuditFilter.
     * 
     * @return adminName
     */
    public java.lang.String getAdminName() {
        return adminName;
    }


    /**
     * Sets the adminName value for this AuditFilter.
     * 
     * @param adminName
     */
    public void setAdminName(java.lang.String adminName) {
        this.adminName = adminName;
    }


    /**
     * Gets the targetType value for this AuditFilter.
     * 
     * @return targetType
     */
    public java.lang.String getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this AuditFilter.
     * 
     * @param targetType
     */
    public void setTargetType(java.lang.String targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the targetTypes value for this AuditFilter.
     * 
     * @return targetTypes
     */
    public java.lang.String[] getTargetTypes() {
        return targetTypes;
    }


    /**
     * Sets the targetTypes value for this AuditFilter.
     * 
     * @param targetTypes
     */
    public void setTargetTypes(java.lang.String[] targetTypes) {
        this.targetTypes = targetTypes;
    }


    /**
     * Gets the targetOp value for this AuditFilter.
     * 
     * @return targetOp
     */
    public java.lang.String getTargetOp() {
        return targetOp;
    }


    /**
     * Sets the targetOp value for this AuditFilter.
     * 
     * @param targetOp
     */
    public void setTargetOp(java.lang.String targetOp) {
        this.targetOp = targetOp;
    }


    /**
     * Gets the targetOps value for this AuditFilter.
     * 
     * @return targetOps
     */
    public java.lang.String[] getTargetOps() {
        return targetOps;
    }


    /**
     * Sets the targetOps value for this AuditFilter.
     * 
     * @param targetOps
     */
    public void setTargetOps(java.lang.String[] targetOps) {
        this.targetOps = targetOps;
    }


    /**
     * Gets the targetGroup value for this AuditFilter.
     * 
     * @return targetGroup
     */
    public java.lang.String getTargetGroup() {
        return targetGroup;
    }


    /**
     * Sets the targetGroup value for this AuditFilter.
     * 
     * @param targetGroup
     */
    public void setTargetGroup(java.lang.String targetGroup) {
        this.targetGroup = targetGroup;
    }


    /**
     * Gets the targetName value for this AuditFilter.
     * 
     * @return targetName
     */
    public java.lang.String getTargetName() {
        return targetName;
    }


    /**
     * Sets the targetName value for this AuditFilter.
     * 
     * @param targetName
     */
    public void setTargetName(java.lang.String targetName) {
        this.targetName = targetName;
    }


    /**
     * Gets the targetSubname value for this AuditFilter.
     * 
     * @return targetSubname
     */
    public java.lang.String getTargetSubname() {
        return targetSubname;
    }


    /**
     * Sets the targetSubname value for this AuditFilter.
     * 
     * @param targetSubname
     */
    public void setTargetSubname(java.lang.String targetSubname) {
        this.targetSubname = targetSubname;
    }


    /**
     * Gets the externalCode value for this AuditFilter.
     * 
     * @return externalCode
     */
    public java.lang.String getExternalCode() {
        return externalCode;
    }


    /**
     * Sets the externalCode value for this AuditFilter.
     * 
     * @param externalCode
     */
    public void setExternalCode(java.lang.String externalCode) {
        this.externalCode = externalCode;
    }


    /**
     * Gets the externalService value for this AuditFilter.
     * 
     * @return externalService
     */
    public java.lang.String getExternalService() {
        return externalService;
    }


    /**
     * Sets the externalService value for this AuditFilter.
     * 
     * @param externalService
     */
    public void setExternalService(java.lang.String externalService) {
        this.externalService = externalService;
    }


    /**
     * Gets the text value for this AuditFilter.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this AuditFilter.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the maxReturn value for this AuditFilter.
     * 
     * @return maxReturn
     */
    public java.lang.Integer getMaxReturn() {
        return maxReturn;
    }


    /**
     * Sets the maxReturn value for this AuditFilter.
     * 
     * @param maxReturn
     */
    public void setMaxReturn(java.lang.Integer maxReturn) {
        this.maxReturn = maxReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditFilter)) return false;
        AuditFilter other = (AuditFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqNo==null && other.getSeqNo()==null) || 
             (this.seqNo!=null &&
              this.seqNo.equals(other.getSeqNo()))) &&
            ((this.seqNoStart==null && other.getSeqNoStart()==null) || 
             (this.seqNoStart!=null &&
              this.seqNoStart.equals(other.getSeqNoStart()))) &&
            ((this.seqNoEnd==null && other.getSeqNoEnd()==null) || 
             (this.seqNoEnd!=null &&
              this.seqNoEnd.equals(other.getSeqNoEnd()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.codes==null && other.getCodes()==null) || 
             (this.codes!=null &&
              java.util.Arrays.equals(this.codes, other.getCodes()))) &&
            ((this.codeStart==null && other.getCodeStart()==null) || 
             (this.codeStart!=null &&
              this.codeStart.equals(other.getCodeStart()))) &&
            ((this.codeEnd==null && other.getCodeEnd()==null) || 
             (this.codeEnd!=null &&
              this.codeEnd.equals(other.getCodeEnd()))) &&
            ((this.dateStart==null && other.getDateStart()==null) || 
             (this.dateStart!=null &&
              this.dateStart.equals(other.getDateStart()))) &&
            ((this.dateEnd==null && other.getDateEnd()==null) || 
             (this.dateEnd!=null &&
              this.dateEnd.equals(other.getDateEnd()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.adminGroup==null && other.getAdminGroup()==null) || 
             (this.adminGroup!=null &&
              this.adminGroup.equals(other.getAdminGroup()))) &&
            ((this.adminName==null && other.getAdminName()==null) || 
             (this.adminName!=null &&
              this.adminName.equals(other.getAdminName()))) &&
            ((this.targetType==null && other.getTargetType()==null) || 
             (this.targetType!=null &&
              this.targetType.equals(other.getTargetType()))) &&
            ((this.targetTypes==null && other.getTargetTypes()==null) || 
             (this.targetTypes!=null &&
              java.util.Arrays.equals(this.targetTypes, other.getTargetTypes()))) &&
            ((this.targetOp==null && other.getTargetOp()==null) || 
             (this.targetOp!=null &&
              this.targetOp.equals(other.getTargetOp()))) &&
            ((this.targetOps==null && other.getTargetOps()==null) || 
             (this.targetOps!=null &&
              java.util.Arrays.equals(this.targetOps, other.getTargetOps()))) &&
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
              this.text.equals(other.getText()))) &&
            ((this.maxReturn==null && other.getMaxReturn()==null) || 
             (this.maxReturn!=null &&
              this.maxReturn.equals(other.getMaxReturn())));
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
        if (getSeqNo() != null) {
            _hashCode += getSeqNo().hashCode();
        }
        if (getSeqNoStart() != null) {
            _hashCode += getSeqNoStart().hashCode();
        }
        if (getSeqNoEnd() != null) {
            _hashCode += getSeqNoEnd().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodeStart() != null) {
            _hashCode += getCodeStart().hashCode();
        }
        if (getCodeEnd() != null) {
            _hashCode += getCodeEnd().hashCode();
        }
        if (getDateStart() != null) {
            _hashCode += getDateStart().hashCode();
        }
        if (getDateEnd() != null) {
            _hashCode += getDateEnd().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
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
        if (getTargetTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetOp() != null) {
            _hashCode += getTargetOp().hashCode();
        }
        if (getTargetOps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetOps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetOps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getMaxReturn() != null) {
            _hashCode += getMaxReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuditFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNoStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqNoStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNoEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqNoEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("targetTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetOp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetOps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetOps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
