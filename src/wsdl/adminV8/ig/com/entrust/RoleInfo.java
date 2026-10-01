/**
 * RoleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class RoleInfo  implements java.io.Serializable {
    private java.lang.String name;

    private boolean systemRole;

    private boolean allPermissions;

    private java.lang.String[] permissions;

    private boolean allPolicies;

    private java.lang.String[] policyList;

    private boolean allGroups;

    private boolean ownGroup;

    private java.lang.String[] groupList;

    private boolean allRoles;

    private java.lang.String[] roleList;

    private boolean allSmartCredentialDefinitions;

    private java.lang.String[] smartCredentialDefinitionList;

    private boolean allSmartCredentialPrintModules;

    private java.lang.String[] smartCredentialPrintModuleList;

    private java.lang.String[] rolesGrantingAccess;

    private java.lang.String comment;

    public RoleInfo() {
    }

    public RoleInfo(
           java.lang.String name,
           boolean systemRole,
           boolean allPermissions,
           java.lang.String[] permissions,
           boolean allPolicies,
           java.lang.String[] policyList,
           boolean allGroups,
           boolean ownGroup,
           java.lang.String[] groupList,
           boolean allRoles,
           java.lang.String[] roleList,
           boolean allSmartCredentialDefinitions,
           java.lang.String[] smartCredentialDefinitionList,
           boolean allSmartCredentialPrintModules,
           java.lang.String[] smartCredentialPrintModuleList,
           java.lang.String[] rolesGrantingAccess,
           java.lang.String comment) {
           this.name = name;
           this.systemRole = systemRole;
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
           this.rolesGrantingAccess = rolesGrantingAccess;
           this.comment = comment;
    }


    /**
     * Gets the name value for this RoleInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RoleInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the systemRole value for this RoleInfo.
     * 
     * @return systemRole
     */
    public boolean isSystemRole() {
        return systemRole;
    }


    /**
     * Sets the systemRole value for this RoleInfo.
     * 
     * @param systemRole
     */
    public void setSystemRole(boolean systemRole) {
        this.systemRole = systemRole;
    }


    /**
     * Gets the allPermissions value for this RoleInfo.
     * 
     * @return allPermissions
     */
    public boolean isAllPermissions() {
        return allPermissions;
    }


    /**
     * Sets the allPermissions value for this RoleInfo.
     * 
     * @param allPermissions
     */
    public void setAllPermissions(boolean allPermissions) {
        this.allPermissions = allPermissions;
    }


    /**
     * Gets the permissions value for this RoleInfo.
     * 
     * @return permissions
     */
    public java.lang.String[] getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this RoleInfo.
     * 
     * @param permissions
     */
    public void setPermissions(java.lang.String[] permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the allPolicies value for this RoleInfo.
     * 
     * @return allPolicies
     */
    public boolean isAllPolicies() {
        return allPolicies;
    }


    /**
     * Sets the allPolicies value for this RoleInfo.
     * 
     * @param allPolicies
     */
    public void setAllPolicies(boolean allPolicies) {
        this.allPolicies = allPolicies;
    }


    /**
     * Gets the policyList value for this RoleInfo.
     * 
     * @return policyList
     */
    public java.lang.String[] getPolicyList() {
        return policyList;
    }


    /**
     * Sets the policyList value for this RoleInfo.
     * 
     * @param policyList
     */
    public void setPolicyList(java.lang.String[] policyList) {
        this.policyList = policyList;
    }


    /**
     * Gets the allGroups value for this RoleInfo.
     * 
     * @return allGroups
     */
    public boolean isAllGroups() {
        return allGroups;
    }


    /**
     * Sets the allGroups value for this RoleInfo.
     * 
     * @param allGroups
     */
    public void setAllGroups(boolean allGroups) {
        this.allGroups = allGroups;
    }


    /**
     * Gets the ownGroup value for this RoleInfo.
     * 
     * @return ownGroup
     */
    public boolean isOwnGroup() {
        return ownGroup;
    }


    /**
     * Sets the ownGroup value for this RoleInfo.
     * 
     * @param ownGroup
     */
    public void setOwnGroup(boolean ownGroup) {
        this.ownGroup = ownGroup;
    }


    /**
     * Gets the groupList value for this RoleInfo.
     * 
     * @return groupList
     */
    public java.lang.String[] getGroupList() {
        return groupList;
    }


    /**
     * Sets the groupList value for this RoleInfo.
     * 
     * @param groupList
     */
    public void setGroupList(java.lang.String[] groupList) {
        this.groupList = groupList;
    }


    /**
     * Gets the allRoles value for this RoleInfo.
     * 
     * @return allRoles
     */
    public boolean isAllRoles() {
        return allRoles;
    }


    /**
     * Sets the allRoles value for this RoleInfo.
     * 
     * @param allRoles
     */
    public void setAllRoles(boolean allRoles) {
        this.allRoles = allRoles;
    }


    /**
     * Gets the roleList value for this RoleInfo.
     * 
     * @return roleList
     */
    public java.lang.String[] getRoleList() {
        return roleList;
    }


    /**
     * Sets the roleList value for this RoleInfo.
     * 
     * @param roleList
     */
    public void setRoleList(java.lang.String[] roleList) {
        this.roleList = roleList;
    }


    /**
     * Gets the allSmartCredentialDefinitions value for this RoleInfo.
     * 
     * @return allSmartCredentialDefinitions
     */
    public boolean isAllSmartCredentialDefinitions() {
        return allSmartCredentialDefinitions;
    }


    /**
     * Sets the allSmartCredentialDefinitions value for this RoleInfo.
     * 
     * @param allSmartCredentialDefinitions
     */
    public void setAllSmartCredentialDefinitions(boolean allSmartCredentialDefinitions) {
        this.allSmartCredentialDefinitions = allSmartCredentialDefinitions;
    }


    /**
     * Gets the smartCredentialDefinitionList value for this RoleInfo.
     * 
     * @return smartCredentialDefinitionList
     */
    public java.lang.String[] getSmartCredentialDefinitionList() {
        return smartCredentialDefinitionList;
    }


    /**
     * Sets the smartCredentialDefinitionList value for this RoleInfo.
     * 
     * @param smartCredentialDefinitionList
     */
    public void setSmartCredentialDefinitionList(java.lang.String[] smartCredentialDefinitionList) {
        this.smartCredentialDefinitionList = smartCredentialDefinitionList;
    }


    /**
     * Gets the allSmartCredentialPrintModules value for this RoleInfo.
     * 
     * @return allSmartCredentialPrintModules
     */
    public boolean isAllSmartCredentialPrintModules() {
        return allSmartCredentialPrintModules;
    }


    /**
     * Sets the allSmartCredentialPrintModules value for this RoleInfo.
     * 
     * @param allSmartCredentialPrintModules
     */
    public void setAllSmartCredentialPrintModules(boolean allSmartCredentialPrintModules) {
        this.allSmartCredentialPrintModules = allSmartCredentialPrintModules;
    }


    /**
     * Gets the smartCredentialPrintModuleList value for this RoleInfo.
     * 
     * @return smartCredentialPrintModuleList
     */
    public java.lang.String[] getSmartCredentialPrintModuleList() {
        return smartCredentialPrintModuleList;
    }


    /**
     * Sets the smartCredentialPrintModuleList value for this RoleInfo.
     * 
     * @param smartCredentialPrintModuleList
     */
    public void setSmartCredentialPrintModuleList(java.lang.String[] smartCredentialPrintModuleList) {
        this.smartCredentialPrintModuleList = smartCredentialPrintModuleList;
    }


    /**
     * Gets the rolesGrantingAccess value for this RoleInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this RoleInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the comment value for this RoleInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this RoleInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoleInfo)) return false;
        RoleInfo other = (RoleInfo) obj;
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
            this.systemRole == other.isSystemRole() &&
            this.allPermissions == other.isAllPermissions() &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              java.util.Arrays.equals(this.permissions, other.getPermissions()))) &&
            this.allPolicies == other.isAllPolicies() &&
            ((this.policyList==null && other.getPolicyList()==null) || 
             (this.policyList!=null &&
              java.util.Arrays.equals(this.policyList, other.getPolicyList()))) &&
            this.allGroups == other.isAllGroups() &&
            this.ownGroup == other.isOwnGroup() &&
            ((this.groupList==null && other.getGroupList()==null) || 
             (this.groupList!=null &&
              java.util.Arrays.equals(this.groupList, other.getGroupList()))) &&
            this.allRoles == other.isAllRoles() &&
            ((this.roleList==null && other.getRoleList()==null) || 
             (this.roleList!=null &&
              java.util.Arrays.equals(this.roleList, other.getRoleList()))) &&
            this.allSmartCredentialDefinitions == other.isAllSmartCredentialDefinitions() &&
            ((this.smartCredentialDefinitionList==null && other.getSmartCredentialDefinitionList()==null) || 
             (this.smartCredentialDefinitionList!=null &&
              java.util.Arrays.equals(this.smartCredentialDefinitionList, other.getSmartCredentialDefinitionList()))) &&
            this.allSmartCredentialPrintModules == other.isAllSmartCredentialPrintModules() &&
            ((this.smartCredentialPrintModuleList==null && other.getSmartCredentialPrintModuleList()==null) || 
             (this.smartCredentialPrintModuleList!=null &&
              java.util.Arrays.equals(this.smartCredentialPrintModuleList, other.getSmartCredentialPrintModuleList()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isSystemRole() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllPermissions() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        _hashCode += (isAllPolicies() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        _hashCode += (isAllGroups() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOwnGroup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        _hashCode += (isAllRoles() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        _hashCode += (isAllSmartCredentialDefinitions() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        _hashCode += (isAllSmartCredentialPrintModules() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        new org.apache.axis.description.TypeDesc(RoleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "RoleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
        elemField.setNillable(false);
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
        elemField.setNillable(false);
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
        elemField.setNillable(false);
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialPrintModuleList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCredentialPrintModuleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesGrantingAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rolesGrantingAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
