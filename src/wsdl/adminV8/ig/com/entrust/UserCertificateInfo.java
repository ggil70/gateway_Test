/**
 * UserCertificateInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserCertificateInfo  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String userName;

    private java.lang.String group;

    private java.lang.String issuerDN;

    private java.lang.String subjectDN;

    private java.lang.String serialNumber;

    private java.lang.String state;

    private boolean selfSigned;

    private java.lang.String CA;

    private java.util.Calendar assignDate;

    private java.util.Calendar issueDate;

    private java.util.Calendar expiryDate;

    private java.util.Calendar lastUsedDate;

    private java.lang.String comment;

    private java.lang.String[] rolesGrantingAccess;

    public UserCertificateInfo() {
    }

    public UserCertificateInfo(
           java.lang.String userid,
           java.lang.String userName,
           java.lang.String group,
           java.lang.String issuerDN,
           java.lang.String subjectDN,
           java.lang.String serialNumber,
           java.lang.String state,
           boolean selfSigned,
           java.lang.String CA,
           java.util.Calendar assignDate,
           java.util.Calendar issueDate,
           java.util.Calendar expiryDate,
           java.util.Calendar lastUsedDate,
           java.lang.String comment,
           java.lang.String[] rolesGrantingAccess) {
           this.userid = userid;
           this.userName = userName;
           this.group = group;
           this.issuerDN = issuerDN;
           this.subjectDN = subjectDN;
           this.serialNumber = serialNumber;
           this.state = state;
           this.selfSigned = selfSigned;
           this.CA = CA;
           this.assignDate = assignDate;
           this.issueDate = issueDate;
           this.expiryDate = expiryDate;
           this.lastUsedDate = lastUsedDate;
           this.comment = comment;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the userid value for this UserCertificateInfo.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserCertificateInfo.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the userName value for this UserCertificateInfo.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserCertificateInfo.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the group value for this UserCertificateInfo.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this UserCertificateInfo.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the issuerDN value for this UserCertificateInfo.
     * 
     * @return issuerDN
     */
    public java.lang.String getIssuerDN() {
        return issuerDN;
    }


    /**
     * Sets the issuerDN value for this UserCertificateInfo.
     * 
     * @param issuerDN
     */
    public void setIssuerDN(java.lang.String issuerDN) {
        this.issuerDN = issuerDN;
    }


    /**
     * Gets the subjectDN value for this UserCertificateInfo.
     * 
     * @return subjectDN
     */
    public java.lang.String getSubjectDN() {
        return subjectDN;
    }


    /**
     * Sets the subjectDN value for this UserCertificateInfo.
     * 
     * @param subjectDN
     */
    public void setSubjectDN(java.lang.String subjectDN) {
        this.subjectDN = subjectDN;
    }


    /**
     * Gets the serialNumber value for this UserCertificateInfo.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this UserCertificateInfo.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the state value for this UserCertificateInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this UserCertificateInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the selfSigned value for this UserCertificateInfo.
     * 
     * @return selfSigned
     */
    public boolean isSelfSigned() {
        return selfSigned;
    }


    /**
     * Sets the selfSigned value for this UserCertificateInfo.
     * 
     * @param selfSigned
     */
    public void setSelfSigned(boolean selfSigned) {
        this.selfSigned = selfSigned;
    }


    /**
     * Gets the CA value for this UserCertificateInfo.
     * 
     * @return CA
     */
    public java.lang.String getCA() {
        return CA;
    }


    /**
     * Sets the CA value for this UserCertificateInfo.
     * 
     * @param CA
     */
    public void setCA(java.lang.String CA) {
        this.CA = CA;
    }


    /**
     * Gets the assignDate value for this UserCertificateInfo.
     * 
     * @return assignDate
     */
    public java.util.Calendar getAssignDate() {
        return assignDate;
    }


    /**
     * Sets the assignDate value for this UserCertificateInfo.
     * 
     * @param assignDate
     */
    public void setAssignDate(java.util.Calendar assignDate) {
        this.assignDate = assignDate;
    }


    /**
     * Gets the issueDate value for this UserCertificateInfo.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this UserCertificateInfo.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the expiryDate value for this UserCertificateInfo.
     * 
     * @return expiryDate
     */
    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this UserCertificateInfo.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the lastUsedDate value for this UserCertificateInfo.
     * 
     * @return lastUsedDate
     */
    public java.util.Calendar getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this UserCertificateInfo.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.util.Calendar lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the comment value for this UserCertificateInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserCertificateInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the rolesGrantingAccess value for this UserCertificateInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this UserCertificateInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserCertificateInfo)) return false;
        UserCertificateInfo other = (UserCertificateInfo) obj;
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
            ((this.issuerDN==null && other.getIssuerDN()==null) || 
             (this.issuerDN!=null &&
              this.issuerDN.equals(other.getIssuerDN()))) &&
            ((this.subjectDN==null && other.getSubjectDN()==null) || 
             (this.subjectDN!=null &&
              this.subjectDN.equals(other.getSubjectDN()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.selfSigned == other.isSelfSigned() &&
            ((this.CA==null && other.getCA()==null) || 
             (this.CA!=null &&
              this.CA.equals(other.getCA()))) &&
            ((this.assignDate==null && other.getAssignDate()==null) || 
             (this.assignDate!=null &&
              this.assignDate.equals(other.getAssignDate()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.lastUsedDate==null && other.getLastUsedDate()==null) || 
             (this.lastUsedDate!=null &&
              this.lastUsedDate.equals(other.getLastUsedDate()))) &&
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
        if (getIssuerDN() != null) {
            _hashCode += getIssuerDN().hashCode();
        }
        if (getSubjectDN() != null) {
            _hashCode += getSubjectDN().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += (isSelfSigned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCA() != null) {
            _hashCode += getCA().hashCode();
        }
        if (getAssignDate() != null) {
            _hashCode += getAssignDate().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getLastUsedDate() != null) {
            _hashCode += getLastUsedDate().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(UserCertificateInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserCertificateInfo"));
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
        elemField.setFieldName("issuerDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssuerDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubjectDN"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SelfSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AssignDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUsedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastUsedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
