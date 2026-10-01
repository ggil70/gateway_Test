/**
 * GroupParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class GroupParms  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean defaultGroup;

    private java.lang.String policy;

    private java.lang.String partition;

    private java.lang.Boolean useNoPartition;

    private java.lang.String[] repositories;

    private java.lang.String cardRepository;

    private java.lang.Boolean useNoCardRepository;

    private java.lang.String tokenRepository;

    private java.lang.Boolean useNoTokenRepository;

    private java.lang.String smartCredentialRepository;

    private java.lang.Boolean useNoSmartCredentialRepository;

    private java.lang.String comment;

    public GroupParms() {
    }

    public GroupParms(
           java.lang.String name,
           java.lang.Boolean defaultGroup,
           java.lang.String policy,
           java.lang.String partition,
           java.lang.Boolean useNoPartition,
           java.lang.String[] repositories,
           java.lang.String cardRepository,
           java.lang.Boolean useNoCardRepository,
           java.lang.String tokenRepository,
           java.lang.Boolean useNoTokenRepository,
           java.lang.String smartCredentialRepository,
           java.lang.Boolean useNoSmartCredentialRepository,
           java.lang.String comment) {
           this.name = name;
           this.defaultGroup = defaultGroup;
           this.policy = policy;
           this.partition = partition;
           this.useNoPartition = useNoPartition;
           this.repositories = repositories;
           this.cardRepository = cardRepository;
           this.useNoCardRepository = useNoCardRepository;
           this.tokenRepository = tokenRepository;
           this.useNoTokenRepository = useNoTokenRepository;
           this.smartCredentialRepository = smartCredentialRepository;
           this.useNoSmartCredentialRepository = useNoSmartCredentialRepository;
           this.comment = comment;
    }


    /**
     * Gets the name value for this GroupParms.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GroupParms.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the defaultGroup value for this GroupParms.
     * 
     * @return defaultGroup
     */
    public java.lang.Boolean getDefaultGroup() {
        return defaultGroup;
    }


    /**
     * Sets the defaultGroup value for this GroupParms.
     * 
     * @param defaultGroup
     */
    public void setDefaultGroup(java.lang.Boolean defaultGroup) {
        this.defaultGroup = defaultGroup;
    }


    /**
     * Gets the policy value for this GroupParms.
     * 
     * @return policy
     */
    public java.lang.String getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this GroupParms.
     * 
     * @param policy
     */
    public void setPolicy(java.lang.String policy) {
        this.policy = policy;
    }


    /**
     * Gets the partition value for this GroupParms.
     * 
     * @return partition
     */
    public java.lang.String getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this GroupParms.
     * 
     * @param partition
     */
    public void setPartition(java.lang.String partition) {
        this.partition = partition;
    }


    /**
     * Gets the useNoPartition value for this GroupParms.
     * 
     * @return useNoPartition
     */
    public java.lang.Boolean getUseNoPartition() {
        return useNoPartition;
    }


    /**
     * Sets the useNoPartition value for this GroupParms.
     * 
     * @param useNoPartition
     */
    public void setUseNoPartition(java.lang.Boolean useNoPartition) {
        this.useNoPartition = useNoPartition;
    }


    /**
     * Gets the repositories value for this GroupParms.
     * 
     * @return repositories
     */
    public java.lang.String[] getRepositories() {
        return repositories;
    }


    /**
     * Sets the repositories value for this GroupParms.
     * 
     * @param repositories
     */
    public void setRepositories(java.lang.String[] repositories) {
        this.repositories = repositories;
    }


    /**
     * Gets the cardRepository value for this GroupParms.
     * 
     * @return cardRepository
     */
    public java.lang.String getCardRepository() {
        return cardRepository;
    }


    /**
     * Sets the cardRepository value for this GroupParms.
     * 
     * @param cardRepository
     */
    public void setCardRepository(java.lang.String cardRepository) {
        this.cardRepository = cardRepository;
    }


    /**
     * Gets the useNoCardRepository value for this GroupParms.
     * 
     * @return useNoCardRepository
     */
    public java.lang.Boolean getUseNoCardRepository() {
        return useNoCardRepository;
    }


    /**
     * Sets the useNoCardRepository value for this GroupParms.
     * 
     * @param useNoCardRepository
     */
    public void setUseNoCardRepository(java.lang.Boolean useNoCardRepository) {
        this.useNoCardRepository = useNoCardRepository;
    }


    /**
     * Gets the tokenRepository value for this GroupParms.
     * 
     * @return tokenRepository
     */
    public java.lang.String getTokenRepository() {
        return tokenRepository;
    }


    /**
     * Sets the tokenRepository value for this GroupParms.
     * 
     * @param tokenRepository
     */
    public void setTokenRepository(java.lang.String tokenRepository) {
        this.tokenRepository = tokenRepository;
    }


    /**
     * Gets the useNoTokenRepository value for this GroupParms.
     * 
     * @return useNoTokenRepository
     */
    public java.lang.Boolean getUseNoTokenRepository() {
        return useNoTokenRepository;
    }


    /**
     * Sets the useNoTokenRepository value for this GroupParms.
     * 
     * @param useNoTokenRepository
     */
    public void setUseNoTokenRepository(java.lang.Boolean useNoTokenRepository) {
        this.useNoTokenRepository = useNoTokenRepository;
    }


    /**
     * Gets the smartCredentialRepository value for this GroupParms.
     * 
     * @return smartCredentialRepository
     */
    public java.lang.String getSmartCredentialRepository() {
        return smartCredentialRepository;
    }


    /**
     * Sets the smartCredentialRepository value for this GroupParms.
     * 
     * @param smartCredentialRepository
     */
    public void setSmartCredentialRepository(java.lang.String smartCredentialRepository) {
        this.smartCredentialRepository = smartCredentialRepository;
    }


    /**
     * Gets the useNoSmartCredentialRepository value for this GroupParms.
     * 
     * @return useNoSmartCredentialRepository
     */
    public java.lang.Boolean getUseNoSmartCredentialRepository() {
        return useNoSmartCredentialRepository;
    }


    /**
     * Sets the useNoSmartCredentialRepository value for this GroupParms.
     * 
     * @param useNoSmartCredentialRepository
     */
    public void setUseNoSmartCredentialRepository(java.lang.Boolean useNoSmartCredentialRepository) {
        this.useNoSmartCredentialRepository = useNoSmartCredentialRepository;
    }


    /**
     * Gets the comment value for this GroupParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this GroupParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupParms)) return false;
        GroupParms other = (GroupParms) obj;
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
            ((this.defaultGroup==null && other.getDefaultGroup()==null) || 
             (this.defaultGroup!=null &&
              this.defaultGroup.equals(other.getDefaultGroup()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition()))) &&
            ((this.useNoPartition==null && other.getUseNoPartition()==null) || 
             (this.useNoPartition!=null &&
              this.useNoPartition.equals(other.getUseNoPartition()))) &&
            ((this.repositories==null && other.getRepositories()==null) || 
             (this.repositories!=null &&
              java.util.Arrays.equals(this.repositories, other.getRepositories()))) &&
            ((this.cardRepository==null && other.getCardRepository()==null) || 
             (this.cardRepository!=null &&
              this.cardRepository.equals(other.getCardRepository()))) &&
            ((this.useNoCardRepository==null && other.getUseNoCardRepository()==null) || 
             (this.useNoCardRepository!=null &&
              this.useNoCardRepository.equals(other.getUseNoCardRepository()))) &&
            ((this.tokenRepository==null && other.getTokenRepository()==null) || 
             (this.tokenRepository!=null &&
              this.tokenRepository.equals(other.getTokenRepository()))) &&
            ((this.useNoTokenRepository==null && other.getUseNoTokenRepository()==null) || 
             (this.useNoTokenRepository!=null &&
              this.useNoTokenRepository.equals(other.getUseNoTokenRepository()))) &&
            ((this.smartCredentialRepository==null && other.getSmartCredentialRepository()==null) || 
             (this.smartCredentialRepository!=null &&
              this.smartCredentialRepository.equals(other.getSmartCredentialRepository()))) &&
            ((this.useNoSmartCredentialRepository==null && other.getUseNoSmartCredentialRepository()==null) || 
             (this.useNoSmartCredentialRepository!=null &&
              this.useNoSmartCredentialRepository.equals(other.getUseNoSmartCredentialRepository()))) &&
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
        if (getDefaultGroup() != null) {
            _hashCode += getDefaultGroup().hashCode();
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        if (getUseNoPartition() != null) {
            _hashCode += getUseNoPartition().hashCode();
        }
        if (getRepositories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepositories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepositories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardRepository() != null) {
            _hashCode += getCardRepository().hashCode();
        }
        if (getUseNoCardRepository() != null) {
            _hashCode += getUseNoCardRepository().hashCode();
        }
        if (getTokenRepository() != null) {
            _hashCode += getTokenRepository().hashCode();
        }
        if (getUseNoTokenRepository() != null) {
            _hashCode += getUseNoTokenRepository().hashCode();
        }
        if (getSmartCredentialRepository() != null) {
            _hashCode += getSmartCredentialRepository().hashCode();
        }
        if (getUseNoSmartCredentialRepository() != null) {
            _hashCode += getUseNoSmartCredentialRepository().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "GroupParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useNoPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useNoPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositories");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repositories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useNoCardRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useNoCardRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useNoTokenRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useNoTokenRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smartCredentialRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useNoSmartCredentialRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useNoSmartCredentialRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
