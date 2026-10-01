/**
 * UserSmartCredentialInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserSmartCredentialInfo  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String userName;

    private java.lang.String group;

    private java.lang.String id;

    private java.lang.String definitionId;

    private java.lang.String cloneId;

    private java.lang.String serialNumber;

    private java.lang.Boolean mobile;

    private java.lang.String cardUID;

    private java.lang.String state;

    private byte[][] cardManagerKeys;

    private java.lang.Integer cardManagerKeyVersion;

    private java.lang.String issueState;

    private java.util.Calendar issueDate;

    private java.lang.String issueInfo;

    private boolean sealed;

    private boolean approved;

    private boolean valid;

    private java.util.Calendar createDate;

    private commonV8.ig.com.entrust.NameValue[] enrollmentValues;

    private java.lang.String[] unblockVariables;

    private java.lang.String[] digitalIds;

    private java.lang.String tokenVendorId;

    private java.lang.String tokenSerialNumber;

    private java.lang.String friendlyName;

    private boolean supportsPACS;

    private java.lang.String comment;

    private java.lang.String[] rolesGrantingAccess;

    public UserSmartCredentialInfo() {
    }

    public UserSmartCredentialInfo(
           java.lang.String userid,
           java.lang.String userName,
           java.lang.String group,
           java.lang.String id,
           java.lang.String definitionId,
           java.lang.String cloneId,
           java.lang.String serialNumber,
           java.lang.Boolean mobile,
           java.lang.String cardUID,
           java.lang.String state,
           byte[][] cardManagerKeys,
           java.lang.Integer cardManagerKeyVersion,
           java.lang.String issueState,
           java.util.Calendar issueDate,
           java.lang.String issueInfo,
           boolean sealed,
           boolean approved,
           boolean valid,
           java.util.Calendar createDate,
           commonV8.ig.com.entrust.NameValue[] enrollmentValues,
           java.lang.String[] unblockVariables,
           java.lang.String[] digitalIds,
           java.lang.String tokenVendorId,
           java.lang.String tokenSerialNumber,
           java.lang.String friendlyName,
           boolean supportsPACS,
           java.lang.String comment,
           java.lang.String[] rolesGrantingAccess) {
           this.userid = userid;
           this.userName = userName;
           this.group = group;
           this.id = id;
           this.definitionId = definitionId;
           this.cloneId = cloneId;
           this.serialNumber = serialNumber;
           this.mobile = mobile;
           this.cardUID = cardUID;
           this.state = state;
           this.cardManagerKeys = cardManagerKeys;
           this.cardManagerKeyVersion = cardManagerKeyVersion;
           this.issueState = issueState;
           this.issueDate = issueDate;
           this.issueInfo = issueInfo;
           this.sealed = sealed;
           this.approved = approved;
           this.valid = valid;
           this.createDate = createDate;
           this.enrollmentValues = enrollmentValues;
           this.unblockVariables = unblockVariables;
           this.digitalIds = digitalIds;
           this.tokenVendorId = tokenVendorId;
           this.tokenSerialNumber = tokenSerialNumber;
           this.friendlyName = friendlyName;
           this.supportsPACS = supportsPACS;
           this.comment = comment;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the userid value for this UserSmartCredentialInfo.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserSmartCredentialInfo.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the userName value for this UserSmartCredentialInfo.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserSmartCredentialInfo.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the group value for this UserSmartCredentialInfo.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this UserSmartCredentialInfo.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the id value for this UserSmartCredentialInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this UserSmartCredentialInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the definitionId value for this UserSmartCredentialInfo.
     * 
     * @return definitionId
     */
    public java.lang.String getDefinitionId() {
        return definitionId;
    }


    /**
     * Sets the definitionId value for this UserSmartCredentialInfo.
     * 
     * @param definitionId
     */
    public void setDefinitionId(java.lang.String definitionId) {
        this.definitionId = definitionId;
    }


    /**
     * Gets the cloneId value for this UserSmartCredentialInfo.
     * 
     * @return cloneId
     */
    public java.lang.String getCloneId() {
        return cloneId;
    }


    /**
     * Sets the cloneId value for this UserSmartCredentialInfo.
     * 
     * @param cloneId
     */
    public void setCloneId(java.lang.String cloneId) {
        this.cloneId = cloneId;
    }


    /**
     * Gets the serialNumber value for this UserSmartCredentialInfo.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this UserSmartCredentialInfo.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the mobile value for this UserSmartCredentialInfo.
     * 
     * @return mobile
     */
    public java.lang.Boolean getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this UserSmartCredentialInfo.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.Boolean mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the cardUID value for this UserSmartCredentialInfo.
     * 
     * @return cardUID
     */
    public java.lang.String getCardUID() {
        return cardUID;
    }


    /**
     * Sets the cardUID value for this UserSmartCredentialInfo.
     * 
     * @param cardUID
     */
    public void setCardUID(java.lang.String cardUID) {
        this.cardUID = cardUID;
    }


    /**
     * Gets the state value for this UserSmartCredentialInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this UserSmartCredentialInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the cardManagerKeys value for this UserSmartCredentialInfo.
     * 
     * @return cardManagerKeys
     */
    public byte[][] getCardManagerKeys() {
        return cardManagerKeys;
    }


    /**
     * Sets the cardManagerKeys value for this UserSmartCredentialInfo.
     * 
     * @param cardManagerKeys
     */
    public void setCardManagerKeys(byte[][] cardManagerKeys) {
        this.cardManagerKeys = cardManagerKeys;
    }


    /**
     * Gets the cardManagerKeyVersion value for this UserSmartCredentialInfo.
     * 
     * @return cardManagerKeyVersion
     */
    public java.lang.Integer getCardManagerKeyVersion() {
        return cardManagerKeyVersion;
    }


    /**
     * Sets the cardManagerKeyVersion value for this UserSmartCredentialInfo.
     * 
     * @param cardManagerKeyVersion
     */
    public void setCardManagerKeyVersion(java.lang.Integer cardManagerKeyVersion) {
        this.cardManagerKeyVersion = cardManagerKeyVersion;
    }


    /**
     * Gets the issueState value for this UserSmartCredentialInfo.
     * 
     * @return issueState
     */
    public java.lang.String getIssueState() {
        return issueState;
    }


    /**
     * Sets the issueState value for this UserSmartCredentialInfo.
     * 
     * @param issueState
     */
    public void setIssueState(java.lang.String issueState) {
        this.issueState = issueState;
    }


    /**
     * Gets the issueDate value for this UserSmartCredentialInfo.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this UserSmartCredentialInfo.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the issueInfo value for this UserSmartCredentialInfo.
     * 
     * @return issueInfo
     */
    public java.lang.String getIssueInfo() {
        return issueInfo;
    }


    /**
     * Sets the issueInfo value for this UserSmartCredentialInfo.
     * 
     * @param issueInfo
     */
    public void setIssueInfo(java.lang.String issueInfo) {
        this.issueInfo = issueInfo;
    }


    /**
     * Gets the sealed value for this UserSmartCredentialInfo.
     * 
     * @return sealed
     */
    public boolean isSealed() {
        return sealed;
    }


    /**
     * Sets the sealed value for this UserSmartCredentialInfo.
     * 
     * @param sealed
     */
    public void setSealed(boolean sealed) {
        this.sealed = sealed;
    }


    /**
     * Gets the approved value for this UserSmartCredentialInfo.
     * 
     * @return approved
     */
    public boolean isApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this UserSmartCredentialInfo.
     * 
     * @param approved
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }


    /**
     * Gets the valid value for this UserSmartCredentialInfo.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this UserSmartCredentialInfo.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }


    /**
     * Gets the createDate value for this UserSmartCredentialInfo.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this UserSmartCredentialInfo.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the enrollmentValues value for this UserSmartCredentialInfo.
     * 
     * @return enrollmentValues
     */
    public commonV8.ig.com.entrust.NameValue[] getEnrollmentValues() {
        return enrollmentValues;
    }


    /**
     * Sets the enrollmentValues value for this UserSmartCredentialInfo.
     * 
     * @param enrollmentValues
     */
    public void setEnrollmentValues(commonV8.ig.com.entrust.NameValue[] enrollmentValues) {
        this.enrollmentValues = enrollmentValues;
    }


    /**
     * Gets the unblockVariables value for this UserSmartCredentialInfo.
     * 
     * @return unblockVariables
     */
    public java.lang.String[] getUnblockVariables() {
        return unblockVariables;
    }


    /**
     * Sets the unblockVariables value for this UserSmartCredentialInfo.
     * 
     * @param unblockVariables
     */
    public void setUnblockVariables(java.lang.String[] unblockVariables) {
        this.unblockVariables = unblockVariables;
    }


    /**
     * Gets the digitalIds value for this UserSmartCredentialInfo.
     * 
     * @return digitalIds
     */
    public java.lang.String[] getDigitalIds() {
        return digitalIds;
    }


    /**
     * Sets the digitalIds value for this UserSmartCredentialInfo.
     * 
     * @param digitalIds
     */
    public void setDigitalIds(java.lang.String[] digitalIds) {
        this.digitalIds = digitalIds;
    }


    /**
     * Gets the tokenVendorId value for this UserSmartCredentialInfo.
     * 
     * @return tokenVendorId
     */
    public java.lang.String getTokenVendorId() {
        return tokenVendorId;
    }


    /**
     * Sets the tokenVendorId value for this UserSmartCredentialInfo.
     * 
     * @param tokenVendorId
     */
    public void setTokenVendorId(java.lang.String tokenVendorId) {
        this.tokenVendorId = tokenVendorId;
    }


    /**
     * Gets the tokenSerialNumber value for this UserSmartCredentialInfo.
     * 
     * @return tokenSerialNumber
     */
    public java.lang.String getTokenSerialNumber() {
        return tokenSerialNumber;
    }


    /**
     * Sets the tokenSerialNumber value for this UserSmartCredentialInfo.
     * 
     * @param tokenSerialNumber
     */
    public void setTokenSerialNumber(java.lang.String tokenSerialNumber) {
        this.tokenSerialNumber = tokenSerialNumber;
    }


    /**
     * Gets the friendlyName value for this UserSmartCredentialInfo.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this UserSmartCredentialInfo.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the supportsPACS value for this UserSmartCredentialInfo.
     * 
     * @return supportsPACS
     */
    public boolean isSupportsPACS() {
        return supportsPACS;
    }


    /**
     * Sets the supportsPACS value for this UserSmartCredentialInfo.
     * 
     * @param supportsPACS
     */
    public void setSupportsPACS(boolean supportsPACS) {
        this.supportsPACS = supportsPACS;
    }


    /**
     * Gets the comment value for this UserSmartCredentialInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserSmartCredentialInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the rolesGrantingAccess value for this UserSmartCredentialInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this UserSmartCredentialInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSmartCredentialInfo)) return false;
        UserSmartCredentialInfo other = (UserSmartCredentialInfo) obj;
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
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
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
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.cardUID==null && other.getCardUID()==null) || 
             (this.cardUID!=null &&
              this.cardUID.equals(other.getCardUID()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.cardManagerKeys==null && other.getCardManagerKeys()==null) || 
             (this.cardManagerKeys!=null &&
              java.util.Arrays.equals(this.cardManagerKeys, other.getCardManagerKeys()))) &&
            ((this.cardManagerKeyVersion==null && other.getCardManagerKeyVersion()==null) || 
             (this.cardManagerKeyVersion!=null &&
              this.cardManagerKeyVersion.equals(other.getCardManagerKeyVersion()))) &&
            ((this.issueState==null && other.getIssueState()==null) || 
             (this.issueState!=null &&
              this.issueState.equals(other.getIssueState()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.issueInfo==null && other.getIssueInfo()==null) || 
             (this.issueInfo!=null &&
              this.issueInfo.equals(other.getIssueInfo()))) &&
            this.sealed == other.isSealed() &&
            this.approved == other.isApproved() &&
            this.valid == other.isValid() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.enrollmentValues==null && other.getEnrollmentValues()==null) || 
             (this.enrollmentValues!=null &&
              java.util.Arrays.equals(this.enrollmentValues, other.getEnrollmentValues()))) &&
            ((this.unblockVariables==null && other.getUnblockVariables()==null) || 
             (this.unblockVariables!=null &&
              java.util.Arrays.equals(this.unblockVariables, other.getUnblockVariables()))) &&
            ((this.digitalIds==null && other.getDigitalIds()==null) || 
             (this.digitalIds!=null &&
              java.util.Arrays.equals(this.digitalIds, other.getDigitalIds()))) &&
            ((this.tokenVendorId==null && other.getTokenVendorId()==null) || 
             (this.tokenVendorId!=null &&
              this.tokenVendorId.equals(other.getTokenVendorId()))) &&
            ((this.tokenSerialNumber==null && other.getTokenSerialNumber()==null) || 
             (this.tokenSerialNumber!=null &&
              this.tokenSerialNumber.equals(other.getTokenSerialNumber()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName()))) &&
            this.supportsPACS == other.isSupportsPACS() &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
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
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
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
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getCardUID() != null) {
            _hashCode += getCardUID().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCardManagerKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardManagerKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardManagerKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardManagerKeyVersion() != null) {
            _hashCode += getCardManagerKeyVersion().hashCode();
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
        _hashCode += (isSealed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isApproved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
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
        if (getUnblockVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnblockVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnblockVariables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDigitalIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDigitalIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDigitalIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTokenVendorId() != null) {
            _hashCode += getTokenVendorId().hashCode();
        }
        if (getTokenSerialNumber() != null) {
            _hashCode += getTokenSerialNumber().hashCode();
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        _hashCode += (isSupportsPACS() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
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
        new org.apache.axis.description.TypeDesc(UserSmartCredentialInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSmartCredentialInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardManagerKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardManagerKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardManagerKeyVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardManagerKeyVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssueInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sealed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sealed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollmentValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enrollmentValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "NameValue"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unblockVariables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnblockVariables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DigitalIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenVendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TokenVendorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TokenSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FriendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsPACS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SupportsPACS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
