/**
 * OrderByComparator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.contact;

public abstract class OrderByComparator  implements java.io.Serializable {
    private boolean ascending;

    private java.lang.String orderBy;

    private java.lang.String[] orderByConditionFields;

    private java.lang.String[] orderByFields;

    public OrderByComparator() {
    }

    public OrderByComparator(
           boolean ascending,
           java.lang.String orderBy,
           java.lang.String[] orderByConditionFields,
           java.lang.String[] orderByFields) {
           this.ascending = ascending;
           this.orderBy = orderBy;
           this.orderByConditionFields = orderByConditionFields;
           this.orderByFields = orderByFields;
    }


    /**
     * Gets the ascending value for this OrderByComparator.
     * 
     * @return ascending
     */
    public boolean isAscending() {
        return ascending;
    }


    /**
     * Sets the ascending value for this OrderByComparator.
     * 
     * @param ascending
     */
    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }


    /**
     * Gets the orderBy value for this OrderByComparator.
     * 
     * @return orderBy
     */
    public java.lang.String getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this OrderByComparator.
     * 
     * @param orderBy
     */
    public void setOrderBy(java.lang.String orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the orderByConditionFields value for this OrderByComparator.
     * 
     * @return orderByConditionFields
     */
    public java.lang.String[] getOrderByConditionFields() {
        return orderByConditionFields;
    }


    /**
     * Sets the orderByConditionFields value for this OrderByComparator.
     * 
     * @param orderByConditionFields
     */
    public void setOrderByConditionFields(java.lang.String[] orderByConditionFields) {
        this.orderByConditionFields = orderByConditionFields;
    }


    /**
     * Gets the orderByFields value for this OrderByComparator.
     * 
     * @return orderByFields
     */
    public java.lang.String[] getOrderByFields() {
        return orderByFields;
    }


    /**
     * Sets the orderByFields value for this OrderByComparator.
     * 
     * @param orderByFields
     */
    public void setOrderByFields(java.lang.String[] orderByFields) {
        this.orderByFields = orderByFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderByComparator)) return false;
        OrderByComparator other = (OrderByComparator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ascending == other.isAscending() &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              this.orderBy.equals(other.getOrderBy()))) &&
            ((this.orderByConditionFields==null && other.getOrderByConditionFields()==null) || 
             (this.orderByConditionFields!=null &&
              java.util.Arrays.equals(this.orderByConditionFields, other.getOrderByConditionFields()))) &&
            ((this.orderByFields==null && other.getOrderByFields()==null) || 
             (this.orderByFields!=null &&
              java.util.Arrays.equals(this.orderByFields, other.getOrderByFields())));
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
        _hashCode += (isAscending() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOrderBy() != null) {
            _hashCode += getOrderBy().hashCode();
        }
        if (getOrderByConditionFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderByConditionFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderByConditionFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderByFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderByFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderByFields(), i);
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
        new org.apache.axis.description.TypeDesc(OrderByComparator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://util.kernel.portal.liferay.com", "OrderByComparator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ascending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ascending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderByConditionFields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderByConditionFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderByFields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderByFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
