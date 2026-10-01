/**
 * PreproducedCardListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class PreproducedCardListResult  implements java.io.Serializable {
    private wsdl.adminV8.ig.com.entrust.PreproducedCardInfo[] cards;

    private java.lang.String nextCard;

    public PreproducedCardListResult() {
    }

    public PreproducedCardListResult(
           wsdl.adminV8.ig.com.entrust.PreproducedCardInfo[] cards,
           java.lang.String nextCard) {
           this.cards = cards;
           this.nextCard = nextCard;
    }


    /**
     * Gets the cards value for this PreproducedCardListResult.
     * 
     * @return cards
     */
    public wsdl.adminV8.ig.com.entrust.PreproducedCardInfo[] getCards() {
        return cards;
    }


    /**
     * Sets the cards value for this PreproducedCardListResult.
     * 
     * @param cards
     */
    public void setCards(wsdl.adminV8.ig.com.entrust.PreproducedCardInfo[] cards) {
        this.cards = cards;
    }


    /**
     * Gets the nextCard value for this PreproducedCardListResult.
     * 
     * @return nextCard
     */
    public java.lang.String getNextCard() {
        return nextCard;
    }


    /**
     * Sets the nextCard value for this PreproducedCardListResult.
     * 
     * @param nextCard
     */
    public void setNextCard(java.lang.String nextCard) {
        this.nextCard = nextCard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreproducedCardListResult)) return false;
        PreproducedCardListResult other = (PreproducedCardListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cards==null && other.getCards()==null) || 
             (this.cards!=null &&
              java.util.Arrays.equals(this.cards, other.getCards()))) &&
            ((this.nextCard==null && other.getNextCard()==null) || 
             (this.nextCard!=null &&
              this.nextCard.equals(other.getNextCard())));
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
        if (getCards() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCards());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCards(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextCard() != null) {
            _hashCode += getNextCard().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreproducedCardListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PreproducedCardListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cards");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cards"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "PreproducedCardInfo"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextCard"));
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
