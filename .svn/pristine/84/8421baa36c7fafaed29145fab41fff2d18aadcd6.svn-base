/**
 * UserLockoutInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserLockoutInfo  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String userName;

    private java.lang.String group;

    private int failureCount;

    private java.util.Calendar lockoutDate;

    private wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutEx[] authenticatorLockouts;

    public UserLockoutInfo() {
    }

    public UserLockoutInfo(
           java.lang.String userid,
           java.lang.String userName,
           java.lang.String group,
           int failureCount,
           java.util.Calendar lockoutDate,
           wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutEx[] authenticatorLockouts) {
           this.userid = userid;
           this.userName = userName;
           this.group = group;
           this.failureCount = failureCount;
           this.lockoutDate = lockoutDate;
           this.authenticatorLockouts = authenticatorLockouts;
    }


    /**
     * Gets the userid value for this UserLockoutInfo.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserLockoutInfo.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the userName value for this UserLockoutInfo.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserLockoutInfo.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the group value for this UserLockoutInfo.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this UserLockoutInfo.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the failureCount value for this UserLockoutInfo.
     * 
     * @return failureCount
     */
    public int getFailureCount() {
        return failureCount;
    }


    /**
     * Sets the failureCount value for this UserLockoutInfo.
     * 
     * @param failureCount
     */
    public void setFailureCount(int failureCount) {
        this.failureCount = failureCount;
    }


    /**
     * Gets the lockoutDate value for this UserLockoutInfo.
     * 
     * @return lockoutDate
     */
    public java.util.Calendar getLockoutDate() {
        return lockoutDate;
    }


    /**
     * Sets the lockoutDate value for this UserLockoutInfo.
     * 
     * @param lockoutDate
     */
    public void setLockoutDate(java.util.Calendar lockoutDate) {
        this.lockoutDate = lockoutDate;
    }


    /**
     * Gets the authenticatorLockouts value for this UserLockoutInfo.
     * 
     * @return authenticatorLockouts
     */
    public wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutEx[] getAuthenticatorLockouts() {
        return authenticatorLockouts;
    }


    /**
     * Sets the authenticatorLockouts value for this UserLockoutInfo.
     * 
     * @param authenticatorLockouts
     */
    public void setAuthenticatorLockouts(wsdl.adminV8.ig.com.entrust.AuthenticatorLockoutEx[] authenticatorLockouts) {
        this.authenticatorLockouts = authenticatorLockouts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserLockoutInfo)) return false;
        UserLockoutInfo other = (UserLockoutInfo) obj;
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
            this.failureCount == other.getFailureCount() &&
            ((this.lockoutDate==null && other.getLockoutDate()==null) || 
             (this.lockoutDate!=null &&
              this.lockoutDate.equals(other.getLockoutDate()))) &&
            ((this.authenticatorLockouts==null && other.getAuthenticatorLockouts()==null) || 
             (this.authenticatorLockouts!=null &&
              java.util.Arrays.equals(this.authenticatorLockouts, other.getAuthenticatorLockouts())));
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
        _hashCode += getFailureCount();
        if (getLockoutDate() != null) {
            _hashCode += getLockoutDate().hashCode();
        }
        if (getAuthenticatorLockouts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthenticatorLockouts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthenticatorLockouts(), i);
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
        new org.apache.axis.description.TypeDesc(UserLockoutInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserLockoutInfo"));
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
        elemField.setFieldName("failureCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FailureCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LockoutDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticatorLockouts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthenticatorLockouts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AuthenticatorLockoutEx"));
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
