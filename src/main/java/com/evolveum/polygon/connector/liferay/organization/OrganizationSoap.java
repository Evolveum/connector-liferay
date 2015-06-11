/**
 * OrganizationSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.organization;

public class OrganizationSoap  implements java.io.Serializable {
    private java.lang.String comments;

    private long companyId;

    private long countryId;

    private java.util.Calendar createDate;

    private java.util.Calendar modifiedDate;

    private java.lang.String name;

    private long organizationId;

    private long parentOrganizationId;

    private long primaryKey;

    private boolean recursable;

    private long regionId;

    private int statusId;

    private java.lang.String treePath;

    private java.lang.String type;

    private long userId;

    private java.lang.String userName;

    private java.lang.String uuid;

    public OrganizationSoap() {
    }

    public OrganizationSoap(
           java.lang.String comments,
           long companyId,
           long countryId,
           java.util.Calendar createDate,
           java.util.Calendar modifiedDate,
           java.lang.String name,
           long organizationId,
           long parentOrganizationId,
           long primaryKey,
           boolean recursable,
           long regionId,
           int statusId,
           java.lang.String treePath,
           java.lang.String type,
           long userId,
           java.lang.String userName,
           java.lang.String uuid) {
           this.comments = comments;
           this.companyId = companyId;
           this.countryId = countryId;
           this.createDate = createDate;
           this.modifiedDate = modifiedDate;
           this.name = name;
           this.organizationId = organizationId;
           this.parentOrganizationId = parentOrganizationId;
           this.primaryKey = primaryKey;
           this.recursable = recursable;
           this.regionId = regionId;
           this.statusId = statusId;
           this.treePath = treePath;
           this.type = type;
           this.userId = userId;
           this.userName = userName;
           this.uuid = uuid;
    }


    /**
     * Gets the comments value for this OrganizationSoap.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this OrganizationSoap.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the companyId value for this OrganizationSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this OrganizationSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the countryId value for this OrganizationSoap.
     * 
     * @return countryId
     */
    public long getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this OrganizationSoap.
     * 
     * @param countryId
     */
    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the createDate value for this OrganizationSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this OrganizationSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the modifiedDate value for this OrganizationSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this OrganizationSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the name value for this OrganizationSoap.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OrganizationSoap.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the organizationId value for this OrganizationSoap.
     * 
     * @return organizationId
     */
    public long getOrganizationId() {
        return organizationId;
    }


    /**
     * Sets the organizationId value for this OrganizationSoap.
     * 
     * @param organizationId
     */
    public void setOrganizationId(long organizationId) {
        this.organizationId = organizationId;
    }


    /**
     * Gets the parentOrganizationId value for this OrganizationSoap.
     * 
     * @return parentOrganizationId
     */
    public long getParentOrganizationId() {
        return parentOrganizationId;
    }


    /**
     * Sets the parentOrganizationId value for this OrganizationSoap.
     * 
     * @param parentOrganizationId
     */
    public void setParentOrganizationId(long parentOrganizationId) {
        this.parentOrganizationId = parentOrganizationId;
    }


    /**
     * Gets the primaryKey value for this OrganizationSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this OrganizationSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the recursable value for this OrganizationSoap.
     * 
     * @return recursable
     */
    public boolean isRecursable() {
        return recursable;
    }


    /**
     * Sets the recursable value for this OrganizationSoap.
     * 
     * @param recursable
     */
    public void setRecursable(boolean recursable) {
        this.recursable = recursable;
    }


    /**
     * Gets the regionId value for this OrganizationSoap.
     * 
     * @return regionId
     */
    public long getRegionId() {
        return regionId;
    }


    /**
     * Sets the regionId value for this OrganizationSoap.
     * 
     * @param regionId
     */
    public void setRegionId(long regionId) {
        this.regionId = regionId;
    }


    /**
     * Gets the statusId value for this OrganizationSoap.
     * 
     * @return statusId
     */
    public int getStatusId() {
        return statusId;
    }


    /**
     * Sets the statusId value for this OrganizationSoap.
     * 
     * @param statusId
     */
    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }


    /**
     * Gets the treePath value for this OrganizationSoap.
     * 
     * @return treePath
     */
    public java.lang.String getTreePath() {
        return treePath;
    }


    /**
     * Sets the treePath value for this OrganizationSoap.
     * 
     * @param treePath
     */
    public void setTreePath(java.lang.String treePath) {
        this.treePath = treePath;
    }


    /**
     * Gets the type value for this OrganizationSoap.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OrganizationSoap.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the userId value for this OrganizationSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this OrganizationSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this OrganizationSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this OrganizationSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the uuid value for this OrganizationSoap.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this OrganizationSoap.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationSoap)) return false;
        OrganizationSoap other = (OrganizationSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            this.companyId == other.getCompanyId() &&
            this.countryId == other.getCountryId() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.organizationId == other.getOrganizationId() &&
            this.parentOrganizationId == other.getParentOrganizationId() &&
            this.primaryKey == other.getPrimaryKey() &&
            this.recursable == other.isRecursable() &&
            this.regionId == other.getRegionId() &&
            this.statusId == other.getStatusId() &&
            ((this.treePath==null && other.getTreePath()==null) || 
             (this.treePath!=null &&
              this.treePath.equals(other.getTreePath()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
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
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        _hashCode += new Long(getCountryId()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Long(getOrganizationId()).hashCode();
        _hashCode += new Long(getParentOrganizationId()).hashCode();
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += (isRecursable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getRegionId()).hashCode();
        _hashCode += getStatusId();
        if (getTreePath() != null) {
            _hashCode += getTreePath().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.portal.liferay.com", "OrganizationSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentOrganizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentOrganizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recursable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "treePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uuid"));
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

    @Override
    public String toString() {
        return "OrganizationSoap{" +
                "organizationId=" + organizationId +
                ", name='" + name + '\'' +
                ", parent='" + parentOrganizationId + '\'' +
                '}';
    }
}
