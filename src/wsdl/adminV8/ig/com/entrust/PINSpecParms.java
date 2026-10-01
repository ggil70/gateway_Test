/**
 * PINSpecParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class PINSpecParms  implements java.io.Serializable {
    private java.lang.Integer cellSize;

    private java.lang.String[] cellAlphabet;

    private wsdl.adminV8.ig.com.entrust.CellReplacement[] cellReplacements;

    private java.lang.Integer challengeSize;

    private java.lang.Long lifetime;

    private java.lang.Integer maxUses;

    private java.lang.Boolean autoDelete;

    private java.lang.String comment;

    public PINSpecParms() {
    }

    public PINSpecParms(
           java.lang.Integer cellSize,
           java.lang.String[] cellAlphabet,
           wsdl.adminV8.ig.com.entrust.CellReplacement[] cellReplacements,
           java.lang.Integer challengeSize,
           java.lang.Long lifetime,
           java.lang.Integer maxUses,
           java.lang.Boolean autoDelete,
           java.lang.String comment) {
           this.cellSize = cellSize;
           this.cellAlphabet = cellAlphabet;
           this.cellReplacements = cellReplacements;
           this.challengeSize = challengeSize;
           this.lifetime = lifetime;
           this.maxUses = maxUses;
           this.autoDelete = autoDelete;
           this.comment = comment;
    }


    /**
     * Gets the cellSize value for this PINSpecParms.
     * 
     * @return cellSize
     */
    public java.lang.Integer getCellSize() {
        return cellSize;
    }


    /**
     * Sets the cellSize value for this PINSpecParms.
     * 
     * @param cellSize
     */
    public void setCellSize(java.lang.Integer cellSize) {
        this.cellSize = cellSize;
    }


    /**
     * Gets the cellAlphabet value for this PINSpecParms.
     * 
     * @return cellAlphabet
     */
    public java.lang.String[] getCellAlphabet() {
        return cellAlphabet;
    }


    /**
     * Sets the cellAlphabet value for this PINSpecParms.
     * 
     * @param cellAlphabet
     */
    public void setCellAlphabet(java.lang.String[] cellAlphabet) {
        this.cellAlphabet = cellAlphabet;
    }


    /**
     * Gets the cellReplacements value for this PINSpecParms.
     * 
     * @return cellReplacements
     */
    public wsdl.adminV8.ig.com.entrust.CellReplacement[] getCellReplacements() {
        return cellReplacements;
    }


    /**
     * Sets the cellReplacements value for this PINSpecParms.
     * 
     * @param cellReplacements
     */
    public void setCellReplacements(wsdl.adminV8.ig.com.entrust.CellReplacement[] cellReplacements) {
        this.cellReplacements = cellReplacements;
    }


    /**
     * Gets the challengeSize value for this PINSpecParms.
     * 
     * @return challengeSize
     */
    public java.lang.Integer getChallengeSize() {
        return challengeSize;
    }


    /**
     * Sets the challengeSize value for this PINSpecParms.
     * 
     * @param challengeSize
     */
    public void setChallengeSize(java.lang.Integer challengeSize) {
        this.challengeSize = challengeSize;
    }


    /**
     * Gets the lifetime value for this PINSpecParms.
     * 
     * @return lifetime
     */
    public java.lang.Long getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this PINSpecParms.
     * 
     * @param lifetime
     */
    public void setLifetime(java.lang.Long lifetime) {
        this.lifetime = lifetime;
    }


    /**
     * Gets the maxUses value for this PINSpecParms.
     * 
     * @return maxUses
     */
    public java.lang.Integer getMaxUses() {
        return maxUses;
    }


    /**
     * Sets the maxUses value for this PINSpecParms.
     * 
     * @param maxUses
     */
    public void setMaxUses(java.lang.Integer maxUses) {
        this.maxUses = maxUses;
    }


    /**
     * Gets the autoDelete value for this PINSpecParms.
     * 
     * @return autoDelete
     */
    public java.lang.Boolean getAutoDelete() {
        return autoDelete;
    }


    /**
     * Sets the autoDelete value for this PINSpecParms.
     * 
     * @param autoDelete
     */
    public void setAutoDelete(java.lang.Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }


    /**
     * Gets the comment value for this PINSpecParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this PINSpecParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PINSpecParms)) return false;
        PINSpecParms other = (PINSpecParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cellSize==null && other.getCellSize()==null) || 
             (this.cellSize!=null &&
              this.cellSize.equals(other.getCellSize()))) &&
            ((this.cellAlphabet==null && other.getCellAlphabet()==null) || 
             (this.cellAlphabet!=null &&
              java.util.Arrays.equals(this.cellAlphabet, other.getCellAlphabet()))) &&
            ((this.cellReplacements==null && other.getCellReplacements()==null) || 
             (this.cellReplacements!=null &&
              java.util.Arrays.equals(this.cellReplacements, other.getCellReplacements()))) &&
            ((this.challengeSize==null && other.getChallengeSize()==null) || 
             (this.challengeSize!=null &&
              this.challengeSize.equals(other.getChallengeSize()))) &&
            ((this.lifetime==null && other.getLifetime()==null) || 
             (this.lifetime!=null &&
              this.lifetime.equals(other.getLifetime()))) &&
            ((this.maxUses==null && other.getMaxUses()==null) || 
             (this.maxUses!=null &&
              this.maxUses.equals(other.getMaxUses()))) &&
            ((this.autoDelete==null && other.getAutoDelete()==null) || 
             (this.autoDelete!=null &&
              this.autoDelete.equals(other.getAutoDelete()))) &&
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
        if (getCellSize() != null) {
            _hashCode += getCellSize().hashCode();
        }
        if (getCellAlphabet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCellAlphabet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCellAlphabet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCellReplacements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCellReplacements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCellReplacements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChallengeSize() != null) {
            _hashCode += getChallengeSize().hashCode();
        }
        if (getLifetime() != null) {
            _hashCode += getLifetime().hashCode();
        }
        if (getMaxUses() != null) {
            _hashCode += getMaxUses().hashCode();
        }
        if (getAutoDelete() != null) {
            _hashCode += getAutoDelete().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PINSpecParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PINSpecParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cellSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellAlphabet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cellAlphabet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellReplacements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cellReplacements"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "CellReplacement"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "challengeSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxUses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxUses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoDelete"));
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
