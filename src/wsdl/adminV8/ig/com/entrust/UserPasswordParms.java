/**
 * UserPasswordParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserPasswordParms  implements java.io.Serializable {
    private java.lang.String password;

    private java.lang.Boolean autoGenerate;

    private java.lang.String importedPassword;

    private java.lang.Integer daysToExpiry;

    private java.lang.Boolean changeRequired;

    private java.lang.Boolean clearPasswordHistory;

    private java.lang.Boolean clearRetrievablePassword;

    public UserPasswordParms() {
    }

    public UserPasswordParms(
           java.lang.String password,
           java.lang.Boolean autoGenerate,
           java.lang.String importedPassword,
           java.lang.Integer daysToExpiry,
           java.lang.Boolean changeRequired,
           java.lang.Boolean clearPasswordHistory,
           java.lang.Boolean clearRetrievablePassword) {
           this.password = password;
           this.autoGenerate = autoGenerate;
           this.importedPassword = importedPassword;
           this.daysToExpiry = daysToExpiry;
           this.changeRequired = changeRequired;
           this.clearPasswordHistory = clearPasswordHistory;
           this.clearRetrievablePassword = clearRetrievablePassword;
    }


    /**
     * Gets the password value for this UserPasswordParms.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserPasswordParms.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the autoGenerate value for this UserPasswordParms.
     * 
     * @return autoGenerate
     */
    public java.lang.Boolean getAutoGenerate() {
        return autoGenerate;
    }


    /**
     * Sets the autoGenerate value for this UserPasswordParms.
     * 
     * @param autoGenerate
     */
    public void setAutoGenerate(java.lang.Boolean autoGenerate) {
        this.autoGenerate = autoGenerate;
    }


    /**
     * Gets the importedPassword value for this UserPasswordParms.
     * 
     * @return importedPassword
     */
    public java.lang.String getImportedPassword() {
        return importedPassword;
    }


    /**
     * Sets the importedPassword value for this UserPasswordParms.
     * 
     * @param importedPassword
     */
    public void setImportedPassword(java.lang.String importedPassword) {
        this.importedPassword = importedPassword;
    }


    /**
     * Gets the daysToExpiry value for this UserPasswordParms.
     * 
     * @return daysToExpiry
     */
    public java.lang.Integer getDaysToExpiry() {
        return daysToExpiry;
    }


    /**
     * Sets the daysToExpiry value for this UserPasswordParms.
     * 
     * @param daysToExpiry
     */
    public void setDaysToExpiry(java.lang.Integer daysToExpiry) {
        this.daysToExpiry = daysToExpiry;
    }


    /**
     * Gets the changeRequired value for this UserPasswordParms.
     * 
     * @return changeRequired
     */
    public java.lang.Boolean getChangeRequired() {
        return changeRequired;
    }


    /**
     * Sets the changeRequired value for this UserPasswordParms.
     * 
     * @param changeRequired
     */
    public void setChangeRequired(java.lang.Boolean changeRequired) {
        this.changeRequired = changeRequired;
    }


    /**
     * Gets the clearPasswordHistory value for this UserPasswordParms.
     * 
     * @return clearPasswordHistory
     */
    public java.lang.Boolean getClearPasswordHistory() {
        return clearPasswordHistory;
    }


    /**
     * Sets the clearPasswordHistory value for this UserPasswordParms.
     * 
     * @param clearPasswordHistory
     */
    public void setClearPasswordHistory(java.lang.Boolean clearPasswordHistory) {
        this.clearPasswordHistory = clearPasswordHistory;
    }


    /**
     * Gets the clearRetrievablePassword value for this UserPasswordParms.
     * 
     * @return clearRetrievablePassword
     */
    public java.lang.Boolean getClearRetrievablePassword() {
        return clearRetrievablePassword;
    }


    /**
     * Sets the clearRetrievablePassword value for this UserPasswordParms.
     * 
     * @param clearRetrievablePassword
     */
    public void setClearRetrievablePassword(java.lang.Boolean clearRetrievablePassword) {
        this.clearRetrievablePassword = clearRetrievablePassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPasswordParms)) return false;
        UserPasswordParms other = (UserPasswordParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.autoGenerate==null && other.getAutoGenerate()==null) || 
             (this.autoGenerate!=null &&
              this.autoGenerate.equals(other.getAutoGenerate()))) &&
            ((this.importedPassword==null && other.getImportedPassword()==null) || 
             (this.importedPassword!=null &&
              this.importedPassword.equals(other.getImportedPassword()))) &&
            ((this.daysToExpiry==null && other.getDaysToExpiry()==null) || 
             (this.daysToExpiry!=null &&
              this.daysToExpiry.equals(other.getDaysToExpiry()))) &&
            ((this.changeRequired==null && other.getChangeRequired()==null) || 
             (this.changeRequired!=null &&
              this.changeRequired.equals(other.getChangeRequired()))) &&
            ((this.clearPasswordHistory==null && other.getClearPasswordHistory()==null) || 
             (this.clearPasswordHistory!=null &&
              this.clearPasswordHistory.equals(other.getClearPasswordHistory()))) &&
            ((this.clearRetrievablePassword==null && other.getClearRetrievablePassword()==null) || 
             (this.clearRetrievablePassword!=null &&
              this.clearRetrievablePassword.equals(other.getClearRetrievablePassword())));
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getAutoGenerate() != null) {
            _hashCode += getAutoGenerate().hashCode();
        }
        if (getImportedPassword() != null) {
            _hashCode += getImportedPassword().hashCode();
        }
        if (getDaysToExpiry() != null) {
            _hashCode += getDaysToExpiry().hashCode();
        }
        if (getChangeRequired() != null) {
            _hashCode += getChangeRequired().hashCode();
        }
        if (getClearPasswordHistory() != null) {
            _hashCode += getClearPasswordHistory().hashCode();
        }
        if (getClearRetrievablePassword() != null) {
            _hashCode += getClearRetrievablePassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPasswordParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserPasswordParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoGenerate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoGenerate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importedPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ImportedPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysToExpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DaysToExpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChangeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearPasswordHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClearPasswordHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearRetrievablePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClearRetrievablePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
