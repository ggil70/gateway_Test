/**
 * ReportInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class ReportInfo  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String displayName;

    private java.lang.String description;

    private java.lang.String dataSource;

    private java.lang.String serviceType;

    private java.lang.String creatorUserid;

    private java.lang.String creatorUserName;

    private java.lang.String creatorGroup;

    private java.util.Calendar requestDate;

    private java.util.Calendar startDate;

    private boolean removable;

    private int records;

    private wsdl.adminV8.ig.com.entrust.ReportQueueInfo queueInfo;

    private wsdl.adminV8.ig.com.entrust.ReportSuccessInfo successInfo;

    private wsdl.adminV8.ig.com.entrust.ReportFailureInfo failureInfo;

    private java.lang.String[] rolesGrantingAccess;

    public ReportInfo() {
    }

    public ReportInfo(
           java.lang.String id,
           java.lang.String name,
           java.lang.String displayName,
           java.lang.String description,
           java.lang.String dataSource,
           java.lang.String serviceType,
           java.lang.String creatorUserid,
           java.lang.String creatorUserName,
           java.lang.String creatorGroup,
           java.util.Calendar requestDate,
           java.util.Calendar startDate,
           boolean removable,
           int records,
           wsdl.adminV8.ig.com.entrust.ReportQueueInfo queueInfo,
           wsdl.adminV8.ig.com.entrust.ReportSuccessInfo successInfo,
           wsdl.adminV8.ig.com.entrust.ReportFailureInfo failureInfo,
           java.lang.String[] rolesGrantingAccess) {
           this.id = id;
           this.name = name;
           this.displayName = displayName;
           this.description = description;
           this.dataSource = dataSource;
           this.serviceType = serviceType;
           this.creatorUserid = creatorUserid;
           this.creatorUserName = creatorUserName;
           this.creatorGroup = creatorGroup;
           this.requestDate = requestDate;
           this.startDate = startDate;
           this.removable = removable;
           this.records = records;
           this.queueInfo = queueInfo;
           this.successInfo = successInfo;
           this.failureInfo = failureInfo;
           this.rolesGrantingAccess = rolesGrantingAccess;
    }


    /**
     * Gets the id value for this ReportInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ReportInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ReportInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ReportInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this ReportInfo.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ReportInfo.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the description value for this ReportInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ReportInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dataSource value for this ReportInfo.
     * 
     * @return dataSource
     */
    public java.lang.String getDataSource() {
        return dataSource;
    }


    /**
     * Sets the dataSource value for this ReportInfo.
     * 
     * @param dataSource
     */
    public void setDataSource(java.lang.String dataSource) {
        this.dataSource = dataSource;
    }


    /**
     * Gets the serviceType value for this ReportInfo.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this ReportInfo.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the creatorUserid value for this ReportInfo.
     * 
     * @return creatorUserid
     */
    public java.lang.String getCreatorUserid() {
        return creatorUserid;
    }


    /**
     * Sets the creatorUserid value for this ReportInfo.
     * 
     * @param creatorUserid
     */
    public void setCreatorUserid(java.lang.String creatorUserid) {
        this.creatorUserid = creatorUserid;
    }


    /**
     * Gets the creatorUserName value for this ReportInfo.
     * 
     * @return creatorUserName
     */
    public java.lang.String getCreatorUserName() {
        return creatorUserName;
    }


    /**
     * Sets the creatorUserName value for this ReportInfo.
     * 
     * @param creatorUserName
     */
    public void setCreatorUserName(java.lang.String creatorUserName) {
        this.creatorUserName = creatorUserName;
    }


    /**
     * Gets the creatorGroup value for this ReportInfo.
     * 
     * @return creatorGroup
     */
    public java.lang.String getCreatorGroup() {
        return creatorGroup;
    }


    /**
     * Sets the creatorGroup value for this ReportInfo.
     * 
     * @param creatorGroup
     */
    public void setCreatorGroup(java.lang.String creatorGroup) {
        this.creatorGroup = creatorGroup;
    }


    /**
     * Gets the requestDate value for this ReportInfo.
     * 
     * @return requestDate
     */
    public java.util.Calendar getRequestDate() {
        return requestDate;
    }


    /**
     * Sets the requestDate value for this ReportInfo.
     * 
     * @param requestDate
     */
    public void setRequestDate(java.util.Calendar requestDate) {
        this.requestDate = requestDate;
    }


    /**
     * Gets the startDate value for this ReportInfo.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ReportInfo.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the removable value for this ReportInfo.
     * 
     * @return removable
     */
    public boolean isRemovable() {
        return removable;
    }


    /**
     * Sets the removable value for this ReportInfo.
     * 
     * @param removable
     */
    public void setRemovable(boolean removable) {
        this.removable = removable;
    }


    /**
     * Gets the records value for this ReportInfo.
     * 
     * @return records
     */
    public int getRecords() {
        return records;
    }


    /**
     * Sets the records value for this ReportInfo.
     * 
     * @param records
     */
    public void setRecords(int records) {
        this.records = records;
    }


    /**
     * Gets the queueInfo value for this ReportInfo.
     * 
     * @return queueInfo
     */
    public wsdl.adminV8.ig.com.entrust.ReportQueueInfo getQueueInfo() {
        return queueInfo;
    }


    /**
     * Sets the queueInfo value for this ReportInfo.
     * 
     * @param queueInfo
     */
    public void setQueueInfo(wsdl.adminV8.ig.com.entrust.ReportQueueInfo queueInfo) {
        this.queueInfo = queueInfo;
    }


    /**
     * Gets the successInfo value for this ReportInfo.
     * 
     * @return successInfo
     */
    public wsdl.adminV8.ig.com.entrust.ReportSuccessInfo getSuccessInfo() {
        return successInfo;
    }


    /**
     * Sets the successInfo value for this ReportInfo.
     * 
     * @param successInfo
     */
    public void setSuccessInfo(wsdl.adminV8.ig.com.entrust.ReportSuccessInfo successInfo) {
        this.successInfo = successInfo;
    }


    /**
     * Gets the failureInfo value for this ReportInfo.
     * 
     * @return failureInfo
     */
    public wsdl.adminV8.ig.com.entrust.ReportFailureInfo getFailureInfo() {
        return failureInfo;
    }


    /**
     * Sets the failureInfo value for this ReportInfo.
     * 
     * @param failureInfo
     */
    public void setFailureInfo(wsdl.adminV8.ig.com.entrust.ReportFailureInfo failureInfo) {
        this.failureInfo = failureInfo;
    }


    /**
     * Gets the rolesGrantingAccess value for this ReportInfo.
     * 
     * @return rolesGrantingAccess
     */
    public java.lang.String[] getRolesGrantingAccess() {
        return rolesGrantingAccess;
    }


    /**
     * Sets the rolesGrantingAccess value for this ReportInfo.
     * 
     * @param rolesGrantingAccess
     */
    public void setRolesGrantingAccess(java.lang.String[] rolesGrantingAccess) {
        this.rolesGrantingAccess = rolesGrantingAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportInfo)) return false;
        ReportInfo other = (ReportInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dataSource==null && other.getDataSource()==null) || 
             (this.dataSource!=null &&
              this.dataSource.equals(other.getDataSource()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.creatorUserid==null && other.getCreatorUserid()==null) || 
             (this.creatorUserid!=null &&
              this.creatorUserid.equals(other.getCreatorUserid()))) &&
            ((this.creatorUserName==null && other.getCreatorUserName()==null) || 
             (this.creatorUserName!=null &&
              this.creatorUserName.equals(other.getCreatorUserName()))) &&
            ((this.creatorGroup==null && other.getCreatorGroup()==null) || 
             (this.creatorGroup!=null &&
              this.creatorGroup.equals(other.getCreatorGroup()))) &&
            ((this.requestDate==null && other.getRequestDate()==null) || 
             (this.requestDate!=null &&
              this.requestDate.equals(other.getRequestDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            this.removable == other.isRemovable() &&
            this.records == other.getRecords() &&
            ((this.queueInfo==null && other.getQueueInfo()==null) || 
             (this.queueInfo!=null &&
              this.queueInfo.equals(other.getQueueInfo()))) &&
            ((this.successInfo==null && other.getSuccessInfo()==null) || 
             (this.successInfo!=null &&
              this.successInfo.equals(other.getSuccessInfo()))) &&
            ((this.failureInfo==null && other.getFailureInfo()==null) || 
             (this.failureInfo!=null &&
              this.failureInfo.equals(other.getFailureInfo()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDataSource() != null) {
            _hashCode += getDataSource().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getCreatorUserid() != null) {
            _hashCode += getCreatorUserid().hashCode();
        }
        if (getCreatorUserName() != null) {
            _hashCode += getCreatorUserName().hashCode();
        }
        if (getCreatorGroup() != null) {
            _hashCode += getCreatorGroup().hashCode();
        }
        if (getRequestDate() != null) {
            _hashCode += getRequestDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        _hashCode += (isRemovable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getRecords();
        if (getQueueInfo() != null) {
            _hashCode += getQueueInfo().hashCode();
        }
        if (getSuccessInfo() != null) {
            _hashCode += getSuccessInfo().hashCode();
        }
        if (getFailureInfo() != null) {
            _hashCode += getFailureInfo().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReportInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorUserid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatorUserid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatorUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatorGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Removable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("records");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Records"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueueInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportQueueInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SuccessInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportSuccessInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FailureInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ReportFailureInfo"));
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
