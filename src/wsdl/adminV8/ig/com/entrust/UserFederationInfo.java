/**
 * UserFederationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserFederationInfo  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String userName;

    private java.lang.String group;

    private java.lang.String type;

    private java.lang.String partnerID;

    private java.lang.String originatorFederationName;

    private java.lang.String receiverFederationName;

    private boolean originator;

    private java.lang.String comment;

    private java.lang.String[] rolesGrantingAccess;

    public UserFederationInfo() {
    }

    public UserFederationInfo(
           java.lang.String userid,
           java.lang.String userName,
           java.lang.String group,
           java.lang.String type,
           java.lang.String partnerID,
           java.lang.String originatorFederationName,
           java.lang.String receiverFederationName,
           boolean originator,
           java.lang.String comment,
           java.lang.String[] rolesGrantingAccess) {
           this.userid = userid;
           this.userName = userName;
           this.group = group;
           this.type = type;
           this.partnerID = partnerID;
           this.originatorFederationName = originatorFederationName;
           this.receiverFederationName = receiverFederationName;
           this.originator = originator;
           this.comment = comment;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the userid value for this UserFederationInfo.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserFederationInfo.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the userName value for this UserFederationInfo.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserFederationInfo.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the group value for this UserFederationInfo.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this UserFederationInfo.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the type value for this UserFederationInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this UserFederationInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the partnerID value for this UserFederationInfo.
     * 
     * @return partnerID
     */
    public java.lang.String getPartnerID() {
        return partnerID;
    }


    /**
     * Sets the partnerID value for this UserFederationInfo.
     * 
     * @param partnerID
     */
    public void setPartnerID(java.lang.String partnerID) {
        this.partnerID = partnerID;
    }


    /**
     * Gets the originatorFederationName value for this UserFederationInfo.
     * 
     * @return originatorFederationName
     */
    public java.lang.String getOriginatorFederationName() {
        return originatorFederationName;
    }


    /**
     * Sets the originatorFederationName value for this UserFederationInfo.
     * 
     * @param originatorFederationName
     */
    public void setOriginatorFederationName(java.lang.String originatorFederationName) {
        this.originatorFederationName = originatorFederationName;
    }


    /**
     * Gets the receiverFederationName value for this UserFederationInfo.
     * 
     * @return receiverFederationName
     */
    public java.lang.String getReceiverFederationName() {
        return receiverFederationName;
    }


    /**
     * Sets the receiverFederationName value for this UserFederationInfo.
     * 
     * @param receiverFederationName
     */
    public void setReceiverFederationName(java.lang.String receiverFederationName) {
        this.receiverFederationName = receiverFederationName;
    }


    /**
     * Gets the originator value for this UserFederationInfo.
     * 
     * @return originator
     */
    public boolean isOriginator() {
        return originator;
    }


    /**
     * Sets the originator value for this UserFederationInfo.
     * 
     * @param originator
     */
    public void setOriginator(boolean originator) {
        this.originator = originator;
    }


    /**
     * Gets the comment value for this UserFederationInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserFederationInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the rolesGrantingAccess value for this UserFederationInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this UserFederationInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFederationInfo)) return false;
        UserFederationInfo other = (UserFederationInfo) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.partnerID==null && other.getPartnerID()==null) || 
             (this.partnerID!=null &&
              this.partnerID.equals(other.getPartnerID()))) &&
            ((this.originatorFederationName==null && other.getOriginatorFederationName()==null) || 
             (this.originatorFederationName!=null &&
              this.originatorFederationName.equals(other.getOriginatorFederationName()))) &&
            ((this.receiverFederationName==null && other.getReceiverFederationName()==null) || 
             (this.receiverFederationName!=null &&
              this.receiverFederationName.equals(other.getReceiverFederationName()))) &&
            this.originator == other.isOriginator() &&
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPartnerID() != null) {
            _hashCode += getPartnerID().hashCode();
        }
        if (getOriginatorFederationName() != null) {
            _hashCode += getOriginatorFederationName().hashCode();
        }
        if (getReceiverFederationName() != null) {
            _hashCode += getReceiverFederationName().hashCode();
        }
        _hashCode += (isOriginator() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        new org.apache.axis.description.TypeDesc(UserFederationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserFederationInfo"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatorFederationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OriginatorFederationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverFederationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReceiverFederationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Originator"));
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
