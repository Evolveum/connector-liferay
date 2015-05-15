/**
 * ExpandoValueSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.expandovalue;

public class ExpandoValueSoap  implements java.io.Serializable {
    private long classNameId;

    private long classPK;

    private long columnId;

    private long companyId;

    private java.lang.String data;

    private long primaryKey;

    private long rowId;

    private long tableId;

    private long valueId;

    public ExpandoValueSoap() {
    }

    public ExpandoValueSoap(
           long classNameId,
           long classPK,
           long columnId,
           long companyId,
           java.lang.String data,
           long primaryKey,
           long rowId,
           long tableId,
           long valueId) {
           this.classNameId = classNameId;
           this.classPK = classPK;
           this.columnId = columnId;
           this.companyId = companyId;
           this.data = data;
           this.primaryKey = primaryKey;
           this.rowId = rowId;
           this.tableId = tableId;
           this.valueId = valueId;
    }


    /**
     * Gets the classNameId value for this ExpandoValueSoap.
     * 
     * @return classNameId
     */
    public long getClassNameId() {
        return classNameId;
    }


    /**
     * Sets the classNameId value for this ExpandoValueSoap.
     * 
     * @param classNameId
     */
    public void setClassNameId(long classNameId) {
        this.classNameId = classNameId;
    }


    /**
     * Gets the classPK value for this ExpandoValueSoap.
     * 
     * @return classPK
     */
    public long getClassPK() {
        return classPK;
    }


    /**
     * Sets the classPK value for this ExpandoValueSoap.
     * 
     * @param classPK
     */
    public void setClassPK(long classPK) {
        this.classPK = classPK;
    }


    /**
     * Gets the columnId value for this ExpandoValueSoap.
     * 
     * @return columnId
     */
    public long getColumnId() {
        return columnId;
    }


    /**
     * Sets the columnId value for this ExpandoValueSoap.
     * 
     * @param columnId
     */
    public void setColumnId(long columnId) {
        this.columnId = columnId;
    }


    /**
     * Gets the companyId value for this ExpandoValueSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ExpandoValueSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the data value for this ExpandoValueSoap.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this ExpandoValueSoap.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the primaryKey value for this ExpandoValueSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this ExpandoValueSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the rowId value for this ExpandoValueSoap.
     * 
     * @return rowId
     */
    public long getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this ExpandoValueSoap.
     * 
     * @param rowId
     */
    public void setRowId(long rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the tableId value for this ExpandoValueSoap.
     * 
     * @return tableId
     */
    public long getTableId() {
        return tableId;
    }


    /**
     * Sets the tableId value for this ExpandoValueSoap.
     * 
     * @param tableId
     */
    public void setTableId(long tableId) {
        this.tableId = tableId;
    }


    /**
     * Gets the valueId value for this ExpandoValueSoap.
     * 
     * @return valueId
     */
    public long getValueId() {
        return valueId;
    }


    /**
     * Sets the valueId value for this ExpandoValueSoap.
     * 
     * @param valueId
     */
    public void setValueId(long valueId) {
        this.valueId = valueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpandoValueSoap)) return false;
        ExpandoValueSoap other = (ExpandoValueSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.classNameId == other.getClassNameId() &&
            this.classPK == other.getClassPK() &&
            this.columnId == other.getColumnId() &&
            this.companyId == other.getCompanyId() &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            this.primaryKey == other.getPrimaryKey() &&
            this.rowId == other.getRowId() &&
            this.tableId == other.getTableId() &&
            this.valueId == other.getValueId();
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
        _hashCode += new Long(getClassNameId()).hashCode();
        _hashCode += new Long(getClassPK()).hashCode();
        _hashCode += new Long(getColumnId()).hashCode();
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Long(getRowId()).hashCode();
        _hashCode += new Long(getTableId()).hashCode();
        _hashCode += new Long(getValueId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpandoValueSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.expando.portlet.liferay.com", "ExpandoValueSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classNameId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classNameId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
