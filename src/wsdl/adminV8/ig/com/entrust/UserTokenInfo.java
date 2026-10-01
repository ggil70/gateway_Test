/**
 * UserTokenInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserTokenInfo  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String userName;

    private java.lang.String group;

    private java.lang.String vendorId;

    private java.lang.String serialNumber;

    private java.lang.String set;

    private java.lang.String state;

    private java.lang.String tokenType;

    private boolean responseSupported;

    private boolean challengeSupported;

    private boolean unlockSupported;

    private boolean signatureSupported;

    private boolean deliveryAndSignatureSupported;

    private java.util.Calendar loadDate;

    private boolean createdForUser;

    private boolean usesLicense;

    private java.lang.String activationState;

    private java.lang.String currentActivationType;

    private java.lang.String[] availableActivationTypes;

    private java.util.Calendar lastUsedDate;

    private commonV8.ig.com.entrust.NameValue[] tokenParameters;

    private java.lang.String[] rolesGrantingAccess;

    private java.lang.String comment;

    public UserTokenInfo() {
    }

    public UserTokenInfo(
           java.lang.String userid,
           java.lang.String userName,
           java.lang.String group,
           java.lang.String vendorId,
           java.lang.String serialNumber,
           java.lang.String set,
           java.lang.String state,
           java.lang.String tokenType,
           boolean responseSupported,
           boolean challengeSupported,
           boolean unlockSupported,
           boolean signatureSupported,
           boolean deliveryAndSignatureSupported,
           java.util.Calendar loadDate,
           boolean createdForUser,
           boolean usesLicense,
           java.lang.String activationState,
           java.lang.String currentActivationType,
           java.lang.String[] availableActivationTypes,
           java.util.Calendar lastUsedDate,
           commonV8.ig.com.entrust.NameValue[] tokenParameters,
           java.lang.String[] rolesGrantingAccess,
           java.lang.String comment) {
           this.userid = userid;
           this.userName = userName;
           this.group = group;
           this.vendorId = vendorId;
           this.serialNumber = serialNumber;
           this.set = set;
           this.state = state;
           this.tokenType = tokenType;
           this.responseSupported = responseSupported;
           this.challengeSupported = challengeSupported;
           this.unlockSupported = unlockSupported;
           this.signatureSupported = signatureSupported;
           this.deliveryAndSignatureSupported = deliveryAndSignatureSupported;
           this.loadDate = loadDate;
           this.createdForUser = createdForUser;
           this.usesLicense = usesLicense;
           this.activationState = activationState;
           this.currentActivationType = currentActivationType;
           this.availableActivationTypes = availableActivationTypes;
           this.lastUsedDate = lastUsedDate;
           this.tokenParameters = tokenParameters;
           this.rolesGrantingAccess = rolesGrantingAccess;
           this.comment = comment;
    }


    /**
     * Gets the userid value for this UserTokenInfo.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserTokenInfo.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the userName value for this UserTokenInfo.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserTokenInfo.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the group value for this UserTokenInfo.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this UserTokenInfo.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the vendorId value for this UserTokenInfo.
     * 
     * @return vendorId
     */
    public java.lang.String getVendorId() {
        return vendorId;
    }


    /**
     * Sets the vendorId value for this UserTokenInfo.
     * 
     * @param vendorId
     */
    public void setVendorId(java.lang.String vendorId) {
        this.vendorId = vendorId;
    }


    /**
     * Gets the serialNumber value for this UserTokenInfo.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this UserTokenInfo.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the set value for this UserTokenInfo.
     * 
     * @return set
     */
    public java.lang.String getSet() {
        return set;
    }


    /**
     * Sets the set value for this UserTokenInfo.
     * 
     * @param set
     */
    public void setSet(java.lang.String set) {
        this.set = set;
    }


    /**
     * Gets the state value for this UserTokenInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this UserTokenInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the tokenType value for this UserTokenInfo.
     * 
     * @return tokenType
     */
    public java.lang.String getTokenType() {
        return tokenType;
    }


    /**
     * Sets the tokenType value for this UserTokenInfo.
     * 
     * @param tokenType
     */
    public void setTokenType(java.lang.String tokenType) {
        this.tokenType = tokenType;
    }


    /**
     * Gets the responseSupported value for this UserTokenInfo.
     * 
     * @return responseSupported
     */
    public boolean isResponseSupported() {
        return responseSupported;
    }


    /**
     * Sets the responseSupported value for this UserTokenInfo.
     * 
     * @param responseSupported
     */
    public void setResponseSupported(boolean responseSupported) {
        this.responseSupported = responseSupported;
    }


    /**
     * Gets the challengeSupported value for this UserTokenInfo.
     * 
     * @return challengeSupported
     */
    public boolean isChallengeSupported() {
        return challengeSupported;
    }


    /**
     * Sets the challengeSupported value for this UserTokenInfo.
     * 
     * @param challengeSupported
     */
    public void setChallengeSupported(boolean challengeSupported) {
        this.challengeSupported = challengeSupported;
    }


    /**
     * Gets the unlockSupported value for this UserTokenInfo.
     * 
     * @return unlockSupported
     */
    public boolean isUnlockSupported() {
        return unlockSupported;
    }


    /**
     * Sets the unlockSupported value for this UserTokenInfo.
     * 
     * @param unlockSupported
     */
    public void setUnlockSupported(boolean unlockSupported) {
        this.unlockSupported = unlockSupported;
    }


    /**
     * Gets the signatureSupported value for this UserTokenInfo.
     * 
     * @return signatureSupported
     */
    public boolean isSignatureSupported() {
        return signatureSupported;
    }


    /**
     * Sets the signatureSupported value for this UserTokenInfo.
     * 
     * @param signatureSupported
     */
    public void setSignatureSupported(boolean signatureSupported) {
        this.signatureSupported = signatureSupported;
    }


    /**
     * Gets the deliveryAndSignatureSupported value for this UserTokenInfo.
     * 
     * @return deliveryAndSignatureSupported
     */
    public boolean isDeliveryAndSignatureSupported() {
        return deliveryAndSignatureSupported;
    }


    /**
     * Sets the deliveryAndSignatureSupported value for this UserTokenInfo.
     * 
     * @param deliveryAndSignatureSupported
     */
    public void setDeliveryAndSignatureSupported(boolean deliveryAndSignatureSupported) {
        this.deliveryAndSignatureSupported = deliveryAndSignatureSupported;
    }


    /**
     * Gets the loadDate value for this UserTokenInfo.
     * 
     * @return loadDate
     */
    public java.util.Calendar getLoadDate() {
        return loadDate;
    }


    /**
     * Sets the loadDate value for this UserTokenInfo.
     * 
     * @param loadDate
     */
    public void setLoadDate(java.util.Calendar loadDate) {
        this.loadDate = loadDate;
    }


    /**
     * Gets the createdForUser value for this UserTokenInfo.
     * 
     * @return createdForUser
     */
    public boolean isCreatedForUser() {
        return createdForUser;
    }


    /**
     * Sets the createdForUser value for this UserTokenInfo.
     * 
     * @param createdForUser
     */
    public void setCreatedForUser(boolean createdForUser) {
        this.createdForUser = createdForUser;
    }


    /**
     * Gets the usesLicense value for this UserTokenInfo.
     * 
     * @return usesLicense
     */
    public boolean isUsesLicense() {
        return usesLicense;
    }


    /**
     * Sets the usesLicense value for this UserTokenInfo.
     * 
     * @param usesLicense
     */
    public void setUsesLicense(boolean usesLicense) {
        this.usesLicense = usesLicense;
    }


    /**
     * Gets the activationState value for this UserTokenInfo.
     * 
     * @return activationState
     */
    public java.lang.String getActivationState() {
        return activationState;
    }


    /**
     * Sets the activationState value for this UserTokenInfo.
     * 
     * @param activationState
     */
    public void setActivationState(java.lang.String activationState) {
        this.activationState = activationState;
    }


    /**
     * Gets the currentActivationType value for this UserTokenInfo.
     * 
     * @return currentActivationType
     */
    public java.lang.String getCurrentActivationType() {
        return currentActivationType;
    }


    /**
     * Sets the currentActivationType value for this UserTokenInfo.
     * 
     * @param currentActivationType
     */
    public void setCurrentActivationType(java.lang.String currentActivationType) {
        this.currentActivationType = currentActivationType;
    }


    /**
     * Gets the availableActivationTypes value for this UserTokenInfo.
     * 
     * @return availableActivationTypes
     */
    public java.lang.String[] getAvailableActivationTypes() {
        return availableActivationTypes;
    }


    /**
     * Sets the availableActivationTypes value for this UserTokenInfo.
     * 
     * @param availableActivationTypes
     */
    public void setAvailableActivationTypes(java.lang.String[] availableActivationTypes) {
        this.availableActivationTypes = availableActivationTypes;
    }


    /**
     * Gets the lastUsedDate value for this UserTokenInfo.
     * 
     * @return lastUsedDate
     */
    public java.util.Calendar getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this UserTokenInfo.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.util.Calendar lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the tokenParameters value for this UserTokenInfo.
     * 
     * @return tokenParameters
     */
    public commonV8.ig.com.entrust.NameValue[] getTokenParameters() {
        return tokenParameters;
    }


    /**
     * Sets the tokenParameters value for this UserTokenInfo.
     * 
     * @param tokenParameters
     */
    public void setTokenParameters(commonV8.ig.com.entrust.NameValue[] tokenParameters) {
        this.tokenParameters = tokenParameters;
    }


    /**
     * Gets the rolesGrantingAccess value for this UserTokenInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this UserTokenInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the comment value for this UserTokenInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserTokenInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserTokenInfo)) return false;
        UserTokenInfo other = (UserTokenInfo) obj;
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
            ((this.vendorId==null && other.getVendorId()==null) || 
             (this.vendorId!=null &&
              this.vendorId.equals(other.getVendorId()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.set==null && other.getSet()==null) || 
             (this.set!=null &&
              this.set.equals(other.getSet()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.tokenType==null && other.getTokenType()==null) || 
             (this.tokenType!=null &&
              this.tokenType.equals(other.getTokenType()))) &&
            this.responseSupported == other.isResponseSupported() &&
            this.challengeSupported == other.isChallengeSupported() &&
            this.unlockSupported == other.isUnlockSupported() &&
            this.signatureSupported == other.isSignatureSupported() &&
            this.deliveryAndSignatureSupported == other.isDeliveryAndSignatureSupported() &&
            ((this.loadDate==null && other.getLoadDate()==null) || 
             (this.loadDate!=null &&
              this.loadDate.equals(other.getLoadDate()))) &&
            this.createdForUser == other.isCreatedForUser() &&
            this.usesLicense == other.isUsesLicense() &&
            ((this.activationState==null && other.getActivationState()==null) || 
             (this.activationState!=null &&
              this.activationState.equals(other.getActivationState()))) &&
            ((this.currentActivationType==null && other.getCurrentActivationType()==null) || 
             (this.currentActivationType!=null &&
              this.currentActivationType.equals(other.getCurrentActivationType()))) &&
            ((this.availableActivationTypes==null && other.getAvailableActivationTypes()==null) || 
             (this.availableActivationTypes!=null &&
              java.util.Arrays.equals(this.availableActivationTypes, other.getAvailableActivationTypes()))) &&
            ((this.lastUsedDate==null && other.getLastUsedDate()==null) || 
             (this.lastUsedDate!=null &&
              this.lastUsedDate.equals(other.getLastUsedDate()))) &&
            ((this.tokenParameters==null && other.getTokenParameters()==null) || 
             (this.tokenParameters!=null &&
              java.util.Arrays.equals(this.tokenParameters, other.getTokenParameters()))) &&
            ((this.rolesGrantingAccess==null && other.getRolesGrantingAccess()==null) || 
             (this.rolesGrantingAccess!=null &&
              java.util.Arrays.equals(this.rolesGrantingAccess, other.getRolesGrantingAccess()))) &&
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
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getVendorId() != null) {
            _hashCode += getVendorId().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSet() != null) {
            _hashCode += getSet().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTokenType() != null) {
            _hashCode += getTokenType().hashCode();
        }
        _hashCode += (isResponseSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isChallengeSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUnlockSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSignatureSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeliveryAndSignatureSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLoadDate() != null) {
            _hashCode += getLoadDate().hashCode();
        }
        _hashCode += (isCreatedForUser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUsesLicense() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getActivationState() != null) {
            _hashCode += getActivationState().hashCode();
        }
        if (getCurrentActivationType() != null) {
            _hashCode += getCurrentActivationType().hashCode();
        }
        if (getAvailableActivationTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableActivationTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableActivationTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastUsedDate() != null) {
            _hashCode += getLastUsedDate().hashCode();
        }
        if (getTokenParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTokenParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTokenParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTokenInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserTokenInfo"));
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
        elemField.setFieldName("vendorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VendorId"));
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
        elemField.setFieldName("set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Set"));
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
        elemField.setFieldName("tokenType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TokenType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChallengeSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlockSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnlockSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SignatureSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAndSignatureSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryAndSignatureSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdForUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedForUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UsesLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActivationState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentActivationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrentActivationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableActivationTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AvailableActivationTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "TokenActivationType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUsedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastUsedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "NameValue"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesGrantingAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RolesGrantingAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
