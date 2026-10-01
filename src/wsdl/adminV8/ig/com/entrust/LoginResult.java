/**
 * LoginResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class LoginResult  implements java.io.Serializable {
    private java.lang.String state;

    private java.lang.String groupName;

    private java.lang.String userName;

    private wsdl.adminV8.ig.com.entrust.LoginChallenge loginChallenge;

    private java.util.Calendar passwordExpiryDate;

    private java.util.Calendar passwordAllowChangeAfterDate;

    private commonV8.ig.com.entrust.CardData card;

    private commonV8.ig.com.entrust.TokenData token;

    private wsdl.adminV8.ig.com.entrust.AdminServiceFault loginFault;

    public LoginResult() {
    }

    public LoginResult(
           java.lang.String state,
           java.lang.String groupName,
           java.lang.String userName,
           wsdl.adminV8.ig.com.entrust.LoginChallenge loginChallenge,
           java.util.Calendar passwordExpiryDate,
           java.util.Calendar passwordAllowChangeAfterDate,
           commonV8.ig.com.entrust.CardData card,
           commonV8.ig.com.entrust.TokenData token,
           wsdl.adminV8.ig.com.entrust.AdminServiceFault loginFault) {
           this.state = state;
           this.groupName = groupName;
           this.userName = userName;
           this.loginChallenge = loginChallenge;
           this.passwordExpiryDate = passwordExpiryDate;
           this.passwordAllowChangeAfterDate = passwordAllowChangeAfterDate;
           this.card = card;
           this.token = token;
           this.loginFault = loginFault;
    }


    /**
     * Gets the state value for this LoginResult.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this LoginResult.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the groupName value for this LoginResult.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this LoginResult.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the userName value for this LoginResult.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this LoginResult.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the loginChallenge value for this LoginResult.
     * 
     * @return loginChallenge
     */
    public wsdl.adminV8.ig.com.entrust.LoginChallenge getLoginChallenge() {
        return loginChallenge;
    }


    /**
     * Sets the loginChallenge value for this LoginResult.
     * 
     * @param loginChallenge
     */
    public void setLoginChallenge(wsdl.adminV8.ig.com.entrust.LoginChallenge loginChallenge) {
        this.loginChallenge = loginChallenge;
    }


    /**
     * Gets the passwordExpiryDate value for this LoginResult.
     * 
     * @return passwordExpiryDate
     */
    public java.util.Calendar getPasswordExpiryDate() {
        return passwordExpiryDate;
    }


    /**
     * Sets the passwordExpiryDate value for this LoginResult.
     * 
     * @param passwordExpiryDate
     */
    public void setPasswordExpiryDate(java.util.Calendar passwordExpiryDate) {
        this.passwordExpiryDate = passwordExpiryDate;
    }


    /**
     * Gets the passwordAllowChangeAfterDate value for this LoginResult.
     * 
     * @return passwordAllowChangeAfterDate
     */
    public java.util.Calendar getPasswordAllowChangeAfterDate() {
        return passwordAllowChangeAfterDate;
    }


    /**
     * Sets the passwordAllowChangeAfterDate value for this LoginResult.
     * 
     * @param passwordAllowChangeAfterDate
     */
    public void setPasswordAllowChangeAfterDate(java.util.Calendar passwordAllowChangeAfterDate) {
        this.passwordAllowChangeAfterDate = passwordAllowChangeAfterDate;
    }


    /**
     * Gets the card value for this LoginResult.
     * 
     * @return card
     */
    public commonV8.ig.com.entrust.CardData getCard() {
        return card;
    }


    /**
     * Sets the card value for this LoginResult.
     * 
     * @param card
     */
    public void setCard(commonV8.ig.com.entrust.CardData card) {
        this.card = card;
    }


    /**
     * Gets the token value for this LoginResult.
     * 
     * @return token
     */
    public commonV8.ig.com.entrust.TokenData getToken() {
        return token;
    }


    /**
     * Sets the token value for this LoginResult.
     * 
     * @param token
     */
    public void setToken(commonV8.ig.com.entrust.TokenData token) {
        this.token = token;
    }


    /**
     * Gets the loginFault value for this LoginResult.
     * 
     * @return loginFault
     */
    public wsdl.adminV8.ig.com.entrust.AdminServiceFault getLoginFault() {
        return loginFault;
    }


    /**
     * Sets the loginFault value for this LoginResult.
     * 
     * @param loginFault
     */
    public void setLoginFault(wsdl.adminV8.ig.com.entrust.AdminServiceFault loginFault) {
        this.loginFault = loginFault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginResult)) return false;
        LoginResult other = (LoginResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.loginChallenge==null && other.getLoginChallenge()==null) || 
             (this.loginChallenge!=null &&
              this.loginChallenge.equals(other.getLoginChallenge()))) &&
            ((this.passwordExpiryDate==null && other.getPasswordExpiryDate()==null) || 
             (this.passwordExpiryDate!=null &&
              this.passwordExpiryDate.equals(other.getPasswordExpiryDate()))) &&
            ((this.passwordAllowChangeAfterDate==null && other.getPasswordAllowChangeAfterDate()==null) || 
             (this.passwordAllowChangeAfterDate!=null &&
              this.passwordAllowChangeAfterDate.equals(other.getPasswordAllowChangeAfterDate()))) &&
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.loginFault==null && other.getLoginFault()==null) || 
             (this.loginFault!=null &&
              this.loginFault.equals(other.getLoginFault())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getLoginChallenge() != null) {
            _hashCode += getLoginChallenge().hashCode();
        }
        if (getPasswordExpiryDate() != null) {
            _hashCode += getPasswordExpiryDate().hashCode();
        }
        if (getPasswordAllowChangeAfterDate() != null) {
            _hashCode += getPasswordAllowChangeAfterDate().hashCode();
        }
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getLoginFault() != null) {
            _hashCode += getLoginFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "LoginResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "LoginChallenge"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordAllowChangeAfterDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordAllowChangeAfterDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card");
        elemField.setXmlName(new javax.xml.namespace.QName("", "card"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "CardData"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "TokenData"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginFault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginFault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "AdminServiceFault"));
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
