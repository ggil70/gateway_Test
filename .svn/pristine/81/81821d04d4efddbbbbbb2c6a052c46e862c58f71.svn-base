/**
 * Grid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class Grid  implements java.io.Serializable {
    private int numRows;

    private int numColumns;

    private wsdl.adminV8.ig.com.entrust.GridCell[] cells;

    public Grid() {
    }

    public Grid(
           int numRows,
           int numColumns,
           wsdl.adminV8.ig.com.entrust.GridCell[] cells) {
           this.numRows = numRows;
           this.numColumns = numColumns;
           this.cells = cells;
    }


    /**
     * Gets the numRows value for this Grid.
     * 
     * @return numRows
     */
    public int getNumRows() {
        return numRows;
    }


    /**
     * Sets the numRows value for this Grid.
     * 
     * @param numRows
     */
    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }


    /**
     * Gets the numColumns value for this Grid.
     * 
     * @return numColumns
     */
    public int getNumColumns() {
        return numColumns;
    }


    /**
     * Sets the numColumns value for this Grid.
     * 
     * @param numColumns
     */
    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }


    /**
     * Gets the cells value for this Grid.
     * 
     * @return cells
     */
    public wsdl.adminV8.ig.com.entrust.GridCell[] getCells() {
        return cells;
    }


    /**
     * Sets the cells value for this Grid.
     * 
     * @param cells
     */
    public void setCells(wsdl.adminV8.ig.com.entrust.GridCell[] cells) {
        this.cells = cells;
    }

    public wsdl.adminV8.ig.com.entrust.GridCell getCells(int i) {
        return this.cells[i];
    }

    public void setCells(int i, wsdl.adminV8.ig.com.entrust.GridCell _value) {
        this.cells[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Grid)) return false;
        Grid other = (Grid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.numRows == other.getNumRows() &&
            this.numColumns == other.getNumColumns() &&
            ((this.cells==null && other.getCells()==null) || 
             (this.cells!=null &&
              java.util.Arrays.equals(this.cells, other.getCells())));
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
        _hashCode += getNumRows();
        _hashCode += getNumColumns();
        if (getCells() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCells());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCells(), i);
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
        new org.apache.axis.description.TypeDesc(Grid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "Grid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cells");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cells"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "GridCell"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
