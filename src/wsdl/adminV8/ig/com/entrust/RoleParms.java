/**
 * RoleParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class RoleParms  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean allPermissions;

    private java.lang.String[] permissions;

    private java.lang.Boolean allPolicies;

    private java.lang.String[] policyList;

    private java.lang.Boolean allGroups;

    private java.lang.Boolean ownGroup;

    private java.lang.String[] groupList;

    private java.lang.Boolean allRoles;

    private java.lang.String[] roleList;

    private java.lang.Boolean allSmartCredentialDefinitions;

    private java.lang.String[] smartCredentialDefinitionList;

    private java.lang.Boolean allSmartCredentialPrintModules;

    private java.lang.String[] smartCredentialPrintModuleList;

    private java.lang.String comment;

    public RoleParms() {
    }

    public RoleParms(
           java.lang.String name,
           java.lang.Boolean allPermissions,
           java.lang.String[] permissions,
           java.lang.Boolean allPolicies,
           java.lang.String[] policyList,
           java.lang.Boolean allGroups,
           java.lang.Boolean ownGroup,
           java.lang.String[] groupList,
           java.lang.Boolean allRoles,
           java.lang.String[] roleList,
           java.lang.Boolean allSmartCredentialDefinitions,
           java.lang.String[] smartCredentialDefinitionList,
           java.lang.Boolean allSmartCredentialPrintModules,
           java.lang.String[] smartCredentialPrintModuleList,
           java.lang.String comment) {
           this.name = name;
           this.allPermissions = allPermissions;
           this.permissions = permissions;
           this.allPolicies = allPolicies;
           this.policyList = policyList;
           this.allGroups = allGroups;
           this.ownGroup = ownGroup;
           this.groupList = groupList;
           this.allRoles = allRoles;
           this.roleList = roleList;
           this.allSmartCredentialDefinitions = allSmartCredentialDefinitions;
           this.smartCredentialDefinitionList = smartCredentialDefinitionList;
           this.allSmartCredentialPrintModules = allSmartCredentialPrintModules;
           this.smartCredentialPrintModuleList = smartCredentialPrintModuleList;
           this.comment = comment;
    }


    /**
     * Gets the name value for this RoleParms.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RoleParms.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the allPermissions value for this RoleParms.
     * 
     * @return allPermissions
     */
    public java.lang.Boolean getAllPermissions() {
        return allPermissions;
    }


    /**
     * Sets the allPermissions value for this RoleParms.
     * 
     * @param allPermissions
     */
    public void setAllPermissions(java.lang.Boolean allPermissions) {
        this.allPermissions = allPermissions;
    }


    /**
     * Gets the permissions value for this RoleParms.
     * 
     * @return permissions
     */
    public java.lang.String[] getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this RoleParms.
     * 
     * @param permissions
     */
    public void setPermissions(java.lang.String[] permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the allPolicies value for this RoleParms.
     * 
     * @return allPolicies
     */
    public java.lang.Boolean getAllPolicies() {
        return allPolicies;
    }


    /**
     * Sets the allPolicies value for this RoleParms.
     * 
     * @param allPolicies
     */
    public void setAllPolicies(java.lang.Boolean allPolicies) {
        this.allPolicies = allPolicies;
    }


    /**
     * Gets the policyList value for this RoleParms.
     * 
     * @return policyList
     */
    public java.lang.String[] getPolicyList() {
        return policyList;
    }


    /**
     * Sets the policyList value for this RoleParms.
     * 
     * @param policyList
     */
    public void setPolicyList(java.lang.String[] policyList) {
        this.policyList = policyList;
    }


    /**
     * Gets the allGroups value for this RoleParms.
     * 
     * @return allGroups
     */
    public java.lang.Boolean getAllGroups() {
        return allGroups;
    }


    /**
     * Sets the allGroups value for this RoleParms.
     * 
     * @param allGroups
     */
    public void setAllGroups(java.lang.Boolean allGroups) {
        this.allGroups = allGroups;
    }


    /**
     * Gets the ownGroup value for this RoleParms.
     * 
     * @return ownGroup
     */
    public java.lang.Boolean getOwnGroup() {
        return ownGroup;
    }


    /**
     * Sets the ownGroup value for this RoleParms.
     * 
     * @param ownGroup
     */
    public void setOwnGroup(java.lang.Boolean ownGroup) {
        this.ownGroup = ownGroup;
    }


    /**
     * Gets the groupList value for this RoleParms.
     * 
     * @return groupList
     */
    public java.lang.String[] getGroupList() {
        return groupList;
    }


    /**
     * Sets the groupList value for this RoleParms.
     * 
     * @param groupList
     */
    public void setGroupList(java.lang.String[] groupList) {
        this.groupList = groupList;
    }


    /**
     * Gets the allRoles value for this RoleParms.
     * 
     * @return allRoles
     */
    public java.lang.Boolean getAllRoles() {
        return allRoles;
    }


    /**
     * Sets the allRoles value for this RoleParms.
     * 
     * @param allRoles
     */
    public void setAllRoles(java.lang.Boolean allRoles) {
        this.allRoles = allRoles;
    }


    /**
     * Gets the roleList value for this RoleParms.
     * 
     * @return roleList
     */
    public java.lang.String[] getRoleList() {
        return roleList;
    }


    /**
     * Sets the roleList value for this RoleParms.
     * 
     * @param roleList
     */
    public void setRoleList(java.lang.String[] roleList) {
        this.roleList = roleList;
    }


    /**
     * Gets the allSmartCredentialDefinitions value for this RoleParms.
     * 
     * @return allSmartCredentialDefinitions
     */
    public java.lang.Boolean getAllSmartCredentialDefinitions() {
        return allSmartCredentialDefinitions;
    }


    /**
     * Sets the allSmartCredentialDefinitions value for this RoleParms.
     * 
     * @param allSmartCredentialDefinitions
     */
    public void setAllSmartCredentialDefinitions(java.lang.Boolean allSmartCredentialDefinitions) {
        this.allSmartCredentialDefinitions = allSmartCredentialDefinitions;
    }


    /**
     * Gets the smartCredentialDefinitionList value for this RoleParms.
     * 
     * @return smartCredentialDefinitionList
     */
    public java.lang.String[] getSmartCredentialDefinitionList() {
        return smartCredentialDefinitionList;
    }


    /**
     * Sets the smartCredentialDefinitionList value for this RoleParms.
     * 
     * @param smartCredentialDefinitionList
     */
    public void setSmartCredentialDefinitionList(java.lang.String[] smartCredentialDefinitionList) {
        this.smartCredentialDefinitionList = smartCredentialDefinitionList;
    }


    /**
     * Gets the allSmartCredentialPrintModules value for this RoleParms.
     * 
     * @return allSmartCredentialPrintModules
     */
    public java.lang.Boolean getAllSmartCredentialPrintModules() {
        return allSmartCredentialPrintModules;
    }


    /**
     * Sets the allSmartCredentialPrintModules value for this RoleParms.
     * 
     * @param allSmartCredentialPrintModules
     */
    public void setAllSmartCredentialPrintModules(java.lang.Boolean allSmartCredentialPrintModules) {
        this.allSmartCredentialPrintModules = allSmartCredentialPrintModules;
    }


    /**
     * Gets the smartCredentialPrintModuleList value for this RoleParms.
     * 
     * @return smartCredentialPrintModuleList
     */
    public java.lang.String[] getSmartCredentialPrintModuleList() {
        return smartCredentialPrintModuleList;
    }


    /**
     * Sets the smartCredentialPrintModuleList value for this RoleParms.
     * 
     * @param smartCredentialPrintModuleList
     */
    public void setSmartCredentialPrintModuleList(java.lang.String[] smartCredentialPrintModuleList) {
        this.smartCredentialPrintModuleList = smartCredentialPrintModuleList;
    }


    /**
     * Gets the comment value for this RoleParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this RoleParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoleParms)) return false;
        RoleParms other = (RoleParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.allPermissions==null && other.getAllPermissions()==null) || 
             (this.allPermissions!=null &&
              this.allPermissions.equals(other.getAllPermissions()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              java.util.Arrays.equals(this.permissions, other.getPermissions()))) &&
            ((this.allPolicies==null && other.getAllPolicies()==null) || 
             (this.allPolicies!=null &&
              this.allPolicies.equals(other.getAllPolicies()))) &&
            ((this.policyList==null && other.getPolicyList()==null) || 
             (this.policyList!=null &&
              java.util.Arrays.equals(this.policyList, other.getPolicyList()))) &&
            ((this.allGroups==null && other.getAllGroups()==null) || 
             (this.allGroups!=null &&
              this.allGroups.equals(other.getAllGroups()))) &&
            ((this.ownGroup==null && other.getOwnGroup()==null) || 
             (this.ownGroup!=null &&
              this.ownGroup.equals(other.getOwnGroup()))) &&
            ((this.groupList==null && other.getGroupList()==null) || 
             (this.groupList!=null &&
              java.util.Arrays.equals(this.groupList, other.getGroupList()))) &&
            ((this.allRoles==null && other.getAllRoles()==null) || 
             (this.allRoles!=null &&
              this.allRoles.equals(other.getAllRoles()))) &&
            ((this.roleList==null && other.getRoleList()==null) || 
             (this.roleList!=null &&
              java.util.Arrays.equals(this.roleList, other.getRoleList()))) &&
            ((this.allSmartCredentialDefinitions==null && other.getAllSmartCredentialDefinitions()==null) || 
             (this.allSmartCredentialDefinitions!=null &&
              this.allSmartCredentialDefinitions.equals(other.getAllSmartCredentialDefinitions()))) &&
            ((this.smartCredentialDefinitionList==null && other.getSmartCredentialDefinitionList()==null) || 
             (this.smartCredentialDefinitionList!=null &&
              java.util.Arrays.equals(this.smartCredentialDefinitionList, other.getSmartCredentialDefinitionList()))) &&
            ((this.allSmartCredentialPrintModules==null && other.getAllSmartCredentialPrintModules()==null) || 
             (this.allSmartCredentialPrintModules!=null &&
              this.allSmartCredentialPrintModules.equals(other.getAllSmartCredentialPrintModules()))) &&
            ((this.smartCredentialPrintModuleList==null && other.getSmartCredentialPrintModuleList()==null) || 
             (this.smartCredentialPrintModuleList!=null &&
              java.util.Arrays.equals(this.smartCredentialPrintModuleList, other.getSmartCredentialPrintModuleList()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAllPermissions() != null) {
            _hashCode += getAllPermissions().hashCode();
        }
        if (getPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllPolicies() != null) {
            _hashCode += getAllPolicies().hashCode();
        }
        if (getPolicyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllGroups() != null) {
            _hashCode += getAllGroups().hashCode();
        }
        if (getOwnGroup() != null) {
            _hashCode += getOwnGroup().hashCode();
        }
        if (getGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllRoles() != null) {
            _hashCode += getAllRoles().hashCode();
        }
        if (getRoleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllSmartCredentialDefinitions() != null) {
            _hashCode += getAllSmartCredentialDefinitions().hashCode();
        }
        if (getSmartCredentialDefinitionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartCredentialDefinitionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmartCredentialDefinitionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllSmartCredentialPrintModules() != null) {
            _hashCode += getAllSmartCredentialPrintModules().hashCode();
        }
        if (getSmartCredentialPrintModuleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartCredentialPrintModuleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmartCredentialPrintModuleList(), i);
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
        new org.apache.axis.description.TypeDesc(RoleParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "RoleParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allPolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allPolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allSmartCredentialDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allSmartCredentialDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialDefinitionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCredentialDefinitionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allSmartCredentialPrintModules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allSmartCredentialPrintModules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialPrintModuleList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCredentialPrintModuleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
