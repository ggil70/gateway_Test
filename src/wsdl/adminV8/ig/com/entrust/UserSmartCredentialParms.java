/**
 * UserSmartCredentialParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserSmartCredentialParms  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String definitionId;

    private java.lang.String cloneId;

    private java.lang.String serialNumber;

    private java.lang.String cardUID;

    private java.lang.Boolean mobileSerialNumber;

    private java.lang.String state;

    private java.lang.String issueState;

    private java.lang.Boolean issueDate;

    private java.lang.String issueInfo;

    private java.lang.Boolean valid;

    private java.lang.Boolean approved;

    private java.lang.Boolean sealed;

    private commonV8.ig.com.entrust.NameValue[] enrollmentValues;

    private java.lang.Boolean rawEnrollmentValues;

    private java.lang.Boolean mergeEnrollmentValues;

    private java.lang.String[] removeEnrollmentValues;

    private java.lang.Boolean removeAllEnrollmentValues;

    private java.lang.String[] generateEnrollmentValues;

    private java.lang.String friendlyName;

    private java.lang.String comment;

    public UserSmartCredentialParms() {
    }

    public UserSmartCredentialParms(
           java.lang.String id,
           java.lang.String definitionId,
           java.lang.String cloneId,
           java.lang.String serialNumber,
           java.lang.String cardUID,
           java.lang.Boolean mobileSerialNumber,
           java.lang.String state,
           java.lang.String issueState,
           java.lang.Boolean issueDate,
           java.lang.String issueInfo,
           java.lang.Boolean valid,
           java.lang.Boolean approved,
           java.lang.Boolean sealed,
           commonV8.ig.com.entrust.NameValue[] enrollmentValues,
           java.lang.Boolean rawEnrollmentValues,
           java.lang.Boolean mergeEnrollmentValues,
           java.lang.String[] removeEnrollmentValues,
           java.lang.Boolean removeAllEnrollmentValues,
           java.lang.String[] generateEnrollmentValues,
           java.lang.String friendlyName,
           java.lang.String comment) {
           this.id = id;
           this.definitionId = definitionId;
           this.cloneId = cloneId;
           this.serialNumber = serialNumber;
           this.cardUID = cardUID;
           this.mobileSerialNumber = mobileSerialNumber;
           this.state = state;
           this.issueState = issueState;
           this.issueDate = issueDate;
           this.issueInfo = issueInfo;
           this.valid = valid;
           this.approved = approved;
           this.sealed = sealed;
           this.enrollmentValues = enrollmentValues;
           this.rawEnrollmentValues = rawEnrollmentValues;
           this.mergeEnrollmentValues = mergeEnrollmentValues;
           this.removeEnrollmentValues = removeEnrollmentValues;
           this.removeAllEnrollmentValues = removeAllEnrollmentValues;
           this.generateEnrollmentValues = generateEnrollmentValues;
           this.friendlyName = friendlyName;
           this.comment = comment;
    }


    /**
     * Gets the id value for this UserSmartCredentialParms.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this UserSmartCredentialParms.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the definitionId value for this UserSmartCredentialParms.
     * 
     * @return definitionId
     */
    public java.lang.String getDefinitionId() {
        return definitionId;
    }


    /**
     * Sets the definitionId value for this UserSmartCredentialParms.
     * 
     * @param definitionId
     */
    public void setDefinitionId(java.lang.String definitionId) {
        this.definitionId = definitionId;
    }


    /**
     * Gets the cloneId value for this UserSmartCredentialParms.
     * 
     * @return cloneId
     */
    public java.lang.String getCloneId() {
        return cloneId;
    }


    /**
     * Sets the cloneId value for this UserSmartCredentialParms.
     * 
     * @param cloneId
     */
    public void setCloneId(java.lang.String cloneId) {
        this.cloneId = cloneId;
    }


    /**
     * Gets the serialNumber value for this UserSmartCredentialParms.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this UserSmartCredentialParms.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the cardUID value for this UserSmartCredentialParms.
     * 
     * @return cardUID
     */
    public java.lang.String getCardUID() {
        return cardUID;
    }


    /**
     * Sets the cardUID value for this UserSmartCredentialParms.
     * 
     * @param cardUID
     */
    public void setCardUID(java.lang.String cardUID) {
        this.cardUID = cardUID;
    }


    /**
     * Gets the mobileSerialNumber value for this UserSmartCredentialParms.
     * 
     * @return mobileSerialNumber
     */
    public java.lang.Boolean getMobileSerialNumber() {
        return mobileSerialNumber;
    }


    /**
     * Sets the mobileSerialNumber value for this UserSmartCredentialParms.
     * 
     * @param mobileSerialNumber
     */
    public void setMobileSerialNumber(java.lang.Boolean mobileSerialNumber) {
        this.mobileSerialNumber = mobileSerialNumber;
    }


    /**
     * Gets the state value for this UserSmartCredentialParms.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this UserSmartCredentialParms.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the issueState value for this UserSmartCredentialParms.
     * 
     * @return issueState
     */
    public java.lang.String getIssueState() {
        return issueState;
    }


    /**
     * Sets the issueState value for this UserSmartCredentialParms.
     * 
     * @param issueState
     */
    public void setIssueState(java.lang.String issueState) {
        this.issueState = issueState;
    }


    /**
     * Gets the issueDate value for this UserSmartCredentialParms.
     * 
     * @return issueDate
     */
    public java.lang.Boolean getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this UserSmartCredentialParms.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.lang.Boolean issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the issueInfo value for this UserSmartCredentialParms.
     * 
     * @return issueInfo
     */
    public java.lang.String getIssueInfo() {
        return issueInfo;
    }


    /**
     * Sets the issueInfo value for this UserSmartCredentialParms.
     * 
     * @param issueInfo
     */
    public void setIssueInfo(java.lang.String issueInfo) {
        this.issueInfo = issueInfo;
    }


    /**
     * Gets the valid value for this UserSmartCredentialParms.
     * 
     * @return valid
     */
    public java.lang.Boolean getValid() {
        return valid;
    }


    /**
     * Sets the valid value for this UserSmartCredentialParms.
     * 
     * @param valid
     */
    public void setValid(java.lang.Boolean valid) {
        this.valid = valid;
    }


    /**
     * Gets the approved value for this UserSmartCredentialParms.
     * 
     * @return approved
     */
    public java.lang.Boolean getApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this UserSmartCredentialParms.
     * 
     * @param approved
     */
    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }


    /**
     * Gets the sealed value for this UserSmartCredentialParms.
     * 
     * @return sealed
     */
    public java.lang.Boolean getSealed() {
        return sealed;
    }


    /**
     * Sets the sealed value for this UserSmartCredentialParms.
     * 
     * @param sealed
     */
    public void setSealed(java.lang.Boolean sealed) {
        this.sealed = sealed;
    }


    /**
     * Gets the enrollmentValues value for this UserSmartCredentialParms.
     * 
     * @return enrollmentValues
     */
    public commonV8.ig.com.entrust.NameValue[] getEnrollmentValues() {
        return enrollmentValues;
    }


    /**
     * Sets the enrollmentValues value for this UserSmartCredentialParms.
     * 
     * @param enrollmentValues
     */
    public void setEnrollmentValues(commonV8.ig.com.entrust.NameValue[] enrollmentValues) {
        this.enrollmentValues = enrollmentValues;
    }


    /**
     * Gets the rawEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @return rawEnrollmentValues
     */
    public java.lang.Boolean getRawEnrollmentValues() {
        return rawEnrollmentValues;
    }


    /**
     * Sets the rawEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @param rawEnrollmentValues
     */
    public void setRawEnrollmentValues(java.lang.Boolean rawEnrollmentValues) {
        this.rawEnrollmentValues = rawEnrollmentValues;
    }


    /**
     * Gets the mergeEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @return mergeEnrollmentValues
     */
    public java.lang.Boolean getMergeEnrollmentValues() {
        return mergeEnrollmentValues;
    }


    /**
     * Sets the mergeEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @param mergeEnrollmentValues
     */
    public void setMergeEnrollmentValues(java.lang.Boolean mergeEnrollmentValues) {
        this.mergeEnrollmentValues = mergeEnrollmentValues;
    }


    /**
     * Gets the removeEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @return removeEnrollmentValues
     */
    public java.lang.String[] getRemoveEnrollmentValues() {
        return removeEnrollmentValues;
    }


    /**
     * Sets the removeEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @param removeEnrollmentValues
     */
    public void setRemoveEnrollmentValues(java.lang.String[] removeEnrollmentValues) {
        this.removeEnrollmentValues = removeEnrollmentValues;
    }


    /**
     * Gets the removeAllEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @return removeAllEnrollmentValues
     */
    public java.lang.Boolean getRemoveAllEnrollmentValues() {
        return removeAllEnrollmentValues;
    }


    /**
     * Sets the removeAllEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @param removeAllEnrollmentValues
     */
    public void setRemoveAllEnrollmentValues(java.lang.Boolean removeAllEnrollmentValues) {
        this.removeAllEnrollmentValues = removeAllEnrollmentValues;
    }


    /**
     * Gets the generateEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @return generateEnrollmentValues
     */
    public java.lang.String[] getGenerateEnrollmentValues() {
        return generateEnrollmentValues;
    }


    /**
     * Sets the generateEnrollmentValues value for this UserSmartCredentialParms.
     * 
     * @param generateEnrollmentValues
     */
    public void setGenerateEnrollmentValues(java.lang.String[] generateEnrollmentValues) {
        this.generateEnrollmentValues = generateEnrollmentValues;
    }


    /**
     * Gets the friendlyName value for this UserSmartCredentialParms.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this UserSmartCredentialParms.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the comment value for this UserSmartCredentialParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserSmartCredentialParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSmartCredentialParms)) return false;
        UserSmartCredentialParms other = (UserSmartCredentialParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.definitionId==null && other.getDefinitionId()==null) || 
             (this.definitionId!=null &&
              this.definitionId.equals(other.getDefinitionId()))) &&
            ((this.cloneId==null && other.getCloneId()==null) || 
             (this.cloneId!=null &&
              this.cloneId.equals(other.getCloneId()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.cardUID==null && other.getCardUID()==null) || 
             (this.cardUID!=null &&
              this.cardUID.equals(other.getCardUID()))) &&
            ((this.mobileSerialNumber==null && other.getMobileSerialNumber()==null) || 
             (this.mobileSerialNumber!=null &&
              this.mobileSerialNumber.equals(other.getMobileSerialNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.issueState==null && other.getIssueState()==null) || 
             (this.issueState!=null &&
              this.issueState.equals(other.getIssueState()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.issueInfo==null && other.getIssueInfo()==null) || 
             (this.issueInfo!=null &&
              this.issueInfo.equals(other.getIssueInfo()))) &&
            ((this.valid==null && other.getValid()==null) || 
             (this.valid!=null &&
              this.valid.equals(other.getValid()))) &&
            ((this.approved==null && other.getApproved()==null) || 
             (this.approved!=null &&
              this.approved.equals(other.getApproved()))) &&
            ((this.sealed==null && other.getSealed()==null) || 
             (this.sealed!=null &&
              this.sealed.equals(other.getSealed()))) &&
            ((this.enrollmentValues==null && other.getEnrollmentValues()==null) || 
             (this.enrollmentValues!=null &&
              java.util.Arrays.equals(this.enrollmentValues, other.getEnrollmentValues()))) &&
            ((this.rawEnrollmentValues==null && other.getRawEnrollmentValues()==null) || 
             (this.rawEnrollmentValues!=null &&
              this.rawEnrollmentValues.equals(other.getRawEnrollmentValues()))) &&
            ((this.mergeEnrollmentValues==null && other.getMergeEnrollmentValues()==null) || 
             (this.mergeEnrollmentValues!=null &&
              this.mergeEnrollmentValues.equals(other.getMergeEnrollmentValues()))) &&
            ((this.removeEnrollmentValues==null && other.getRemoveEnrollmentValues()==null) || 
             (this.removeEnrollmentValues!=null &&
              java.util.Arrays.equals(this.removeEnrollmentValues, other.getRemoveEnrollmentValues()))) &&
            ((this.removeAllEnrollmentValues==null && other.getRemoveAllEnrollmentValues()==null) || 
             (this.removeAllEnrollmentValues!=null &&
              this.removeAllEnrollmentValues.equals(other.getRemoveAllEnrollmentValues()))) &&
            ((this.generateEnrollmentValues==null && other.getGenerateEnrollmentValues()==null) || 
             (this.generateEnrollmentValues!=null &&
              java.util.Arrays.equals(this.generateEnrollmentValues, other.getGenerateEnrollmentValues()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDefinitionId() != null) {
            _hashCode += getDefinitionId().hashCode();
        }
        if (getCloneId() != null) {
            _hashCode += getCloneId().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getCardUID() != null) {
            _hashCode += getCardUID().hashCode();
        }
        if (getMobileSerialNumber() != null) {
            _hashCode += getMobileSerialNumber().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getIssueState() != null) {
            _hashCode += getIssueState().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getIssueInfo() != null) {
            _hashCode += getIssueInfo().hashCode();
        }
        if (getValid() != null) {
            _hashCode += getValid().hashCode();
        }
        if (getApproved() != null) {
            _hashCode += getApproved().hashCode();
        }
        if (getSealed() != null) {
            _hashCode += getSealed().hashCode();
        }
        if (getEnrollmentValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnrollmentValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnrollmentValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRawEnrollmentValues() != null) {
            _hashCode += getRawEnrollmentValues().hashCode();
        }
        if (getMergeEnrollmentValues() != null) {
            _hashCode += getMergeEnrollmentValues().hashCode();
        }
        if (getRemoveEnrollmentValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoveEnrollmentValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoveEnrollmentValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemoveAllEnrollmentValues() != null) {
            _hashCode += getRemoveAllEnrollmentValues().hashCode();
        }
        if (getGenerateEnrollmentValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGenerateEnrollmentValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGenerateEnrollmentValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserSmartCredentialParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSmartCredentialParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CloneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MobileSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssueState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssueInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sealed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sealed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollmentValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EnrollmentValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "NameValue"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rawEnrollmentValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RawEnrollmentValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeEnrollmentValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MergeEnrollmentValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeEnrollmentValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RemoveEnrollmentValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeAllEnrollmentValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RemoveAllEnrollmentValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateEnrollmentValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GenerateEnrollmentValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FriendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comment"));
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
