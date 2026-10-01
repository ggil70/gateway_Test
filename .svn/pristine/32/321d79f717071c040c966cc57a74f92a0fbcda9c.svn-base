/**
 * UserSmartCredentialIssueCallParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserSmartCredentialIssueCallParms  implements java.io.Serializable {
    private java.lang.String userid;

    private java.lang.String id;

    private java.lang.String printModule;

    private java.lang.String[] operation;

    public UserSmartCredentialIssueCallParms() {
    }

    public UserSmartCredentialIssueCallParms(
           java.lang.String userid,
           java.lang.String id,
           java.lang.String printModule,
           java.lang.String[] operation) {
           this.userid = userid;
           this.id = id;
           this.printModule = printModule;
           this.operation = operation;
    }


    /**
     * Gets the userid value for this UserSmartCredentialIssueCallParms.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this UserSmartCredentialIssueCallParms.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the id value for this UserSmartCredentialIssueCallParms.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this UserSmartCredentialIssueCallParms.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the printModule value for this UserSmartCredentialIssueCallParms.
     * 
     * @return printModule
     */
    public java.lang.String getPrintModule() {
        return printModule;
    }


    /**
     * Sets the printModule value for this UserSmartCredentialIssueCallParms.
     * 
     * @param printModule
     */
    public void setPrintModule(java.lang.String printModule) {
        this.printModule = printModule;
    }


    /**
     * Gets the operation value for this UserSmartCredentialIssueCallParms.
     * 
     * @return operation
     */
    public java.lang.String[] getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this UserSmartCredentialIssueCallParms.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String[] operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSmartCredentialIssueCallParms)) return false;
        UserSmartCredentialIssueCallParms other = (UserSmartCredentialIssueCallParms) obj;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.printModule==null && other.getPrintModule()==null) || 
             (this.printModule!=null &&
              this.printModule.equals(other.getPrintModule()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              java.util.Arrays.equals(this.operation, other.getOperation())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPrintModule() != null) {
            _hashCode += getPrintModule().hashCode();
        }
        if (getOperation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperation(), i);
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
        new org.apache.axis.description.TypeDesc(UserSmartCredentialIssueCallParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSmartCredentialIssueCallParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printModule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printModule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSmartCredentialIssueOp"));
        elemField.setNillable(false);
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
