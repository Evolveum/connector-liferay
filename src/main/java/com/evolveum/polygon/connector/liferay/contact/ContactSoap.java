/**
 * ContactSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evolveum.polygon.connector.liferay.contact;

public class ContactSoap  implements java.io.Serializable {
    private long accountId;

    private java.lang.String aimSn;

    private java.util.Calendar birthday;

    private long classNameId;

    private long classPK;

    private long companyId;

    private long contactId;

    private java.util.Calendar createDate;

    private java.lang.String emailAddress;

    private java.lang.String employeeNumber;

    private java.lang.String employeeStatusId;

    private java.lang.String facebookSn;

    private java.lang.String firstName;

    private java.lang.String hoursOfOperation;

    private java.lang.String icqSn;

    private java.lang.String jabberSn;

    private java.lang.String jobClass;

    private java.lang.String jobTitle;

    private java.lang.String lastName;

    private boolean male;

    private java.lang.String middleName;

    private java.util.Calendar modifiedDate;

    private java.lang.String msnSn;

    private java.lang.String mySpaceSn;

    private long parentContactId;

    private int prefixId;

    private long primaryKey;

    private java.lang.String skypeSn;

    private java.lang.String smsSn;

    private int suffixId;

    private java.lang.String twitterSn;

    private long userId;

    private java.lang.String userName;

    private java.lang.String ymSn;

    public ContactSoap() {
    }

    public ContactSoap(
           long accountId,
           java.lang.String aimSn,
           java.util.Calendar birthday,
           long classNameId,
           long classPK,
           long companyId,
           long contactId,
           java.util.Calendar createDate,
           java.lang.String emailAddress,
           java.lang.String employeeNumber,
           java.lang.String employeeStatusId,
           java.lang.String facebookSn,
           java.lang.String firstName,
           java.lang.String hoursOfOperation,
           java.lang.String icqSn,
           java.lang.String jabberSn,
           java.lang.String jobClass,
           java.lang.String jobTitle,
           java.lang.String lastName,
           boolean male,
           java.lang.String middleName,
           java.util.Calendar modifiedDate,
           java.lang.String msnSn,
           java.lang.String mySpaceSn,
           long parentContactId,
           int prefixId,
           long primaryKey,
           java.lang.String skypeSn,
           java.lang.String smsSn,
           int suffixId,
           java.lang.String twitterSn,
           long userId,
           java.lang.String userName,
           java.lang.String ymSn) {
           this.accountId = accountId;
           this.aimSn = aimSn;
           this.birthday = birthday;
           this.classNameId = classNameId;
           this.classPK = classPK;
           this.companyId = companyId;
           this.contactId = contactId;
           this.createDate = createDate;
           this.emailAddress = emailAddress;
           this.employeeNumber = employeeNumber;
           this.employeeStatusId = employeeStatusId;
           this.facebookSn = facebookSn;
           this.firstName = firstName;
           this.hoursOfOperation = hoursOfOperation;
           this.icqSn = icqSn;
           this.jabberSn = jabberSn;
           this.jobClass = jobClass;
           this.jobTitle = jobTitle;
           this.lastName = lastName;
           this.male = male;
           this.middleName = middleName;
           this.modifiedDate = modifiedDate;
           this.msnSn = msnSn;
           this.mySpaceSn = mySpaceSn;
           this.parentContactId = parentContactId;
           this.prefixId = prefixId;
           this.primaryKey = primaryKey;
           this.skypeSn = skypeSn;
           this.smsSn = smsSn;
           this.suffixId = suffixId;
           this.twitterSn = twitterSn;
           this.userId = userId;
           this.userName = userName;
           this.ymSn = ymSn;
    }


    /**
     * Gets the accountId value for this ContactSoap.
     * 
     * @return accountId
     */
    public long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ContactSoap.
     * 
     * @param accountId
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the aimSn value for this ContactSoap.
     * 
     * @return aimSn
     */
    public java.lang.String getAimSn() {
        return aimSn;
    }


    /**
     * Sets the aimSn value for this ContactSoap.
     * 
     * @param aimSn
     */
    public void setAimSn(java.lang.String aimSn) {
        this.aimSn = aimSn;
    }


    /**
     * Gets the birthday value for this ContactSoap.
     * 
     * @return birthday
     */
    public java.util.Calendar getBirthday() {
        return birthday;
    }


    /**
     * Sets the birthday value for this ContactSoap.
     * 
     * @param birthday
     */
    public void setBirthday(java.util.Calendar birthday) {
        this.birthday = birthday;
    }


    /**
     * Gets the classNameId value for this ContactSoap.
     * 
     * @return classNameId
     */
    public long getClassNameId() {
        return classNameId;
    }


    /**
     * Sets the classNameId value for this ContactSoap.
     * 
     * @param classNameId
     */
    public void setClassNameId(long classNameId) {
        this.classNameId = classNameId;
    }


    /**
     * Gets the classPK value for this ContactSoap.
     * 
     * @return classPK
     */
    public long getClassPK() {
        return classPK;
    }


    /**
     * Sets the classPK value for this ContactSoap.
     * 
     * @param classPK
     */
    public void setClassPK(long classPK) {
        this.classPK = classPK;
    }


    /**
     * Gets the companyId value for this ContactSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ContactSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the contactId value for this ContactSoap.
     * 
     * @return contactId
     */
    public long getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this ContactSoap.
     * 
     * @param contactId
     */
    public void setContactId(long contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the createDate value for this ContactSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ContactSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the emailAddress value for this ContactSoap.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this ContactSoap.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the employeeNumber value for this ContactSoap.
     * 
     * @return employeeNumber
     */
    public java.lang.String getEmployeeNumber() {
        return employeeNumber;
    }


    /**
     * Sets the employeeNumber value for this ContactSoap.
     * 
     * @param employeeNumber
     */
    public void setEmployeeNumber(java.lang.String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    /**
     * Gets the employeeStatusId value for this ContactSoap.
     * 
     * @return employeeStatusId
     */
    public java.lang.String getEmployeeStatusId() {
        return employeeStatusId;
    }


    /**
     * Sets the employeeStatusId value for this ContactSoap.
     * 
     * @param employeeStatusId
     */
    public void setEmployeeStatusId(java.lang.String employeeStatusId) {
        this.employeeStatusId = employeeStatusId;
    }


    /**
     * Gets the facebookSn value for this ContactSoap.
     * 
     * @return facebookSn
     */
    public java.lang.String getFacebookSn() {
        return facebookSn;
    }


    /**
     * Sets the facebookSn value for this ContactSoap.
     * 
     * @param facebookSn
     */
    public void setFacebookSn(java.lang.String facebookSn) {
        this.facebookSn = facebookSn;
    }


    /**
     * Gets the firstName value for this ContactSoap.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this ContactSoap.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the hoursOfOperation value for this ContactSoap.
     * 
     * @return hoursOfOperation
     */
    public java.lang.String getHoursOfOperation() {
        return hoursOfOperation;
    }


    /**
     * Sets the hoursOfOperation value for this ContactSoap.
     * 
     * @param hoursOfOperation
     */
    public void setHoursOfOperation(java.lang.String hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }


    /**
     * Gets the icqSn value for this ContactSoap.
     * 
     * @return icqSn
     */
    public java.lang.String getIcqSn() {
        return icqSn;
    }


    /**
     * Sets the icqSn value for this ContactSoap.
     * 
     * @param icqSn
     */
    public void setIcqSn(java.lang.String icqSn) {
        this.icqSn = icqSn;
    }


    /**
     * Gets the jabberSn value for this ContactSoap.
     * 
     * @return jabberSn
     */
    public java.lang.String getJabberSn() {
        return jabberSn;
    }


    /**
     * Sets the jabberSn value for this ContactSoap.
     * 
     * @param jabberSn
     */
    public void setJabberSn(java.lang.String jabberSn) {
        this.jabberSn = jabberSn;
    }


    /**
     * Gets the jobClass value for this ContactSoap.
     * 
     * @return jobClass
     */
    public java.lang.String getJobClass() {
        return jobClass;
    }


    /**
     * Sets the jobClass value for this ContactSoap.
     * 
     * @param jobClass
     */
    public void setJobClass(java.lang.String jobClass) {
        this.jobClass = jobClass;
    }


    /**
     * Gets the jobTitle value for this ContactSoap.
     * 
     * @return jobTitle
     */
    public java.lang.String getJobTitle() {
        return jobTitle;
    }


    /**
     * Sets the jobTitle value for this ContactSoap.
     * 
     * @param jobTitle
     */
    public void setJobTitle(java.lang.String jobTitle) {
        this.jobTitle = jobTitle;
    }


    /**
     * Gets the lastName value for this ContactSoap.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this ContactSoap.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the male value for this ContactSoap.
     * 
     * @return male
     */
    public boolean isMale() {
        return male;
    }


    /**
     * Sets the male value for this ContactSoap.
     * 
     * @param male
     */
    public void setMale(boolean male) {
        this.male = male;
    }


    /**
     * Gets the middleName value for this ContactSoap.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this ContactSoap.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the modifiedDate value for this ContactSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this ContactSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the msnSn value for this ContactSoap.
     * 
     * @return msnSn
     */
    public java.lang.String getMsnSn() {
        return msnSn;
    }


    /**
     * Sets the msnSn value for this ContactSoap.
     * 
     * @param msnSn
     */
    public void setMsnSn(java.lang.String msnSn) {
        this.msnSn = msnSn;
    }


    /**
     * Gets the mySpaceSn value for this ContactSoap.
     * 
     * @return mySpaceSn
     */
    public java.lang.String getMySpaceSn() {
        return mySpaceSn;
    }


    /**
     * Sets the mySpaceSn value for this ContactSoap.
     * 
     * @param mySpaceSn
     */
    public void setMySpaceSn(java.lang.String mySpaceSn) {
        this.mySpaceSn = mySpaceSn;
    }


    /**
     * Gets the parentContactId value for this ContactSoap.
     * 
     * @return parentContactId
     */
    public long getParentContactId() {
        return parentContactId;
    }


    /**
     * Sets the parentContactId value for this ContactSoap.
     * 
     * @param parentContactId
     */
    public void setParentContactId(long parentContactId) {
        this.parentContactId = parentContactId;
    }


    /**
     * Gets the prefixId value for this ContactSoap.
     * 
     * @return prefixId
     */
    public int getPrefixId() {
        return prefixId;
    }


    /**
     * Sets the prefixId value for this ContactSoap.
     * 
     * @param prefixId
     */
    public void setPrefixId(int prefixId) {
        this.prefixId = prefixId;
    }


    /**
     * Gets the primaryKey value for this ContactSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this ContactSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the skypeSn value for this ContactSoap.
     * 
     * @return skypeSn
     */
    public java.lang.String getSkypeSn() {
        return skypeSn;
    }


    /**
     * Sets the skypeSn value for this ContactSoap.
     * 
     * @param skypeSn
     */
    public void setSkypeSn(java.lang.String skypeSn) {
        this.skypeSn = skypeSn;
    }


    /**
     * Gets the smsSn value for this ContactSoap.
     * 
     * @return smsSn
     */
    public java.lang.String getSmsSn() {
        return smsSn;
    }


    /**
     * Sets the smsSn value for this ContactSoap.
     * 
     * @param smsSn
     */
    public void setSmsSn(java.lang.String smsSn) {
        this.smsSn = smsSn;
    }


    /**
     * Gets the suffixId value for this ContactSoap.
     * 
     * @return suffixId
     */
    public int getSuffixId() {
        return suffixId;
    }


    /**
     * Sets the suffixId value for this ContactSoap.
     * 
     * @param suffixId
     */
    public void setSuffixId(int suffixId) {
        this.suffixId = suffixId;
    }


    /**
     * Gets the twitterSn value for this ContactSoap.
     * 
     * @return twitterSn
     */
    public java.lang.String getTwitterSn() {
        return twitterSn;
    }


    /**
     * Sets the twitterSn value for this ContactSoap.
     * 
     * @param twitterSn
     */
    public void setTwitterSn(java.lang.String twitterSn) {
        this.twitterSn = twitterSn;
    }


    /**
     * Gets the userId value for this ContactSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ContactSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this ContactSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ContactSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the ymSn value for this ContactSoap.
     * 
     * @return ymSn
     */
    public java.lang.String getYmSn() {
        return ymSn;
    }


    /**
     * Sets the ymSn value for this ContactSoap.
     * 
     * @param ymSn
     */
    public void setYmSn(java.lang.String ymSn) {
        this.ymSn = ymSn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactSoap)) return false;
        ContactSoap other = (ContactSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountId == other.getAccountId() &&
            ((this.aimSn==null && other.getAimSn()==null) || 
             (this.aimSn!=null &&
              this.aimSn.equals(other.getAimSn()))) &&
            ((this.birthday==null && other.getBirthday()==null) || 
             (this.birthday!=null &&
              this.birthday.equals(other.getBirthday()))) &&
            this.classNameId == other.getClassNameId() &&
            this.classPK == other.getClassPK() &&
            this.companyId == other.getCompanyId() &&
            this.contactId == other.getContactId() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.employeeNumber==null && other.getEmployeeNumber()==null) || 
             (this.employeeNumber!=null &&
              this.employeeNumber.equals(other.getEmployeeNumber()))) &&
            ((this.employeeStatusId==null && other.getEmployeeStatusId()==null) || 
             (this.employeeStatusId!=null &&
              this.employeeStatusId.equals(other.getEmployeeStatusId()))) &&
            ((this.facebookSn==null && other.getFacebookSn()==null) || 
             (this.facebookSn!=null &&
              this.facebookSn.equals(other.getFacebookSn()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.hoursOfOperation==null && other.getHoursOfOperation()==null) || 
             (this.hoursOfOperation!=null &&
              this.hoursOfOperation.equals(other.getHoursOfOperation()))) &&
            ((this.icqSn==null && other.getIcqSn()==null) || 
             (this.icqSn!=null &&
              this.icqSn.equals(other.getIcqSn()))) &&
            ((this.jabberSn==null && other.getJabberSn()==null) || 
             (this.jabberSn!=null &&
              this.jabberSn.equals(other.getJabberSn()))) &&
            ((this.jobClass==null && other.getJobClass()==null) || 
             (this.jobClass!=null &&
              this.jobClass.equals(other.getJobClass()))) &&
            ((this.jobTitle==null && other.getJobTitle()==null) || 
             (this.jobTitle!=null &&
              this.jobTitle.equals(other.getJobTitle()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            this.male == other.isMale() &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.msnSn==null && other.getMsnSn()==null) || 
             (this.msnSn!=null &&
              this.msnSn.equals(other.getMsnSn()))) &&
            ((this.mySpaceSn==null && other.getMySpaceSn()==null) || 
             (this.mySpaceSn!=null &&
              this.mySpaceSn.equals(other.getMySpaceSn()))) &&
            this.parentContactId == other.getParentContactId() &&
            this.prefixId == other.getPrefixId() &&
            this.primaryKey == other.getPrimaryKey() &&
            ((this.skypeSn==null && other.getSkypeSn()==null) || 
             (this.skypeSn!=null &&
              this.skypeSn.equals(other.getSkypeSn()))) &&
            ((this.smsSn==null && other.getSmsSn()==null) || 
             (this.smsSn!=null &&
              this.smsSn.equals(other.getSmsSn()))) &&
            this.suffixId == other.getSuffixId() &&
            ((this.twitterSn==null && other.getTwitterSn()==null) || 
             (this.twitterSn!=null &&
              this.twitterSn.equals(other.getTwitterSn()))) &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.ymSn==null && other.getYmSn()==null) || 
             (this.ymSn!=null &&
              this.ymSn.equals(other.getYmSn())));
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
        _hashCode += new Long(getAccountId()).hashCode();
        if (getAimSn() != null) {
            _hashCode += getAimSn().hashCode();
        }
        if (getBirthday() != null) {
            _hashCode += getBirthday().hashCode();
        }
        _hashCode += new Long(getClassNameId()).hashCode();
        _hashCode += new Long(getClassPK()).hashCode();
        _hashCode += new Long(getCompanyId()).hashCode();
        _hashCode += new Long(getContactId()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getEmployeeNumber() != null) {
            _hashCode += getEmployeeNumber().hashCode();
        }
        if (getEmployeeStatusId() != null) {
            _hashCode += getEmployeeStatusId().hashCode();
        }
        if (getFacebookSn() != null) {
            _hashCode += getFacebookSn().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getHoursOfOperation() != null) {
            _hashCode += getHoursOfOperation().hashCode();
        }
        if (getIcqSn() != null) {
            _hashCode += getIcqSn().hashCode();
        }
        if (getJabberSn() != null) {
            _hashCode += getJabberSn().hashCode();
        }
        if (getJobClass() != null) {
            _hashCode += getJobClass().hashCode();
        }
        if (getJobTitle() != null) {
            _hashCode += getJobTitle().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        _hashCode += (isMale() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getMsnSn() != null) {
            _hashCode += getMsnSn().hashCode();
        }
        if (getMySpaceSn() != null) {
            _hashCode += getMySpaceSn().hashCode();
        }
        _hashCode += new Long(getParentContactId()).hashCode();
        _hashCode += getPrefixId();
        _hashCode += new Long(getPrimaryKey()).hashCode();
        if (getSkypeSn() != null) {
            _hashCode += getSkypeSn().hashCode();
        }
        if (getSmsSn() != null) {
            _hashCode += getSmsSn().hashCode();
        }
        _hashCode += getSuffixId();
        if (getTwitterSn() != null) {
            _hashCode += getTwitterSn().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getYmSn() != null) {
            _hashCode += getYmSn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.portal.liferay.com", "ContactSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aimSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aimSn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactId"));
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
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facebookSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "facebookSn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursOfOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hoursOfOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icqSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icqSn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jabberSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jabberSn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("male");
        elemField.setXmlName(new javax.xml.namespace.QName("", "male"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msnSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msnSn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mySpaceSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mySpaceSn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefixId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skypeSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skypeSn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsSn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffixId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suffixId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twitterSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "twitterSn"));
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
        elemField.setFieldName("ymSn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ymSn"));
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
