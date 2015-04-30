/*
 * Copyright (c) 2010-2014 Evolveum
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evolveum.polygon.connector.liferay;

import com.evolveum.polygon.connector.liferay.contact.ContactServiceSoap;
import com.evolveum.polygon.connector.liferay.contact.ContactServiceSoapServiceLocator;
import com.evolveum.polygon.connector.liferay.contact.ContactSoap;
import com.evolveum.polygon.connector.liferay.user.*;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.exceptions.AlreadyExistsException;
import org.identityconnectors.framework.common.exceptions.ConnectorIOException;
import org.identityconnectors.framework.common.exceptions.InvalidAttributeValueException;
import org.identityconnectors.framework.common.exceptions.UnknownUidException;
import org.identityconnectors.framework.common.objects.*;
import org.identityconnectors.framework.common.objects.filter.AbstractFilterTranslator;
import org.identityconnectors.framework.common.objects.filter.FilterTranslator;
import org.identityconnectors.framework.spi.Configuration;
import org.identityconnectors.framework.spi.Connector;
import org.identityconnectors.framework.spi.ConnectorClass;
import org.identityconnectors.framework.spi.operations.*;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

@ConnectorClass(displayNameKey = "liferay.connector.display", configurationClass = LiferayConfiguration.class)
public class LiferayConnector implements Connector, TestOp, SchemaOp, CreateOp, DeleteOp, UpdateOp, SearchOp<String> {

    private static final Log LOG = Log.getLog(LiferayConnector.class);

    // not relevant params for MidPoint, password and screen name are mandatory params when creating Account
    private static final boolean AUTO_PASSWORD = false;
    private static final boolean AUTO_SCREEN_NAME = false;

    // not null defaults
    private static final long ATTR_FACEBOOK_ID_DEFAULT = 0L;
    private static final int ATTR_PREFIX_ID_DEFAULT = 0;
    private static final int ATTR_SUFFIX_ID_DEFAULT = 0;
    private static final boolean ATTR_MALE_DEFAULT = true;
    private static final int ATTR_BIRTHDAY_MONTH_DEFAULT = 0; //january
    private static final int ATTR_BIRTHDAY_DAY_DEFAULT = 1;
    private static final int ATTR_BIRTHDAY_YEAR_DEFAULT = 1970; // value from liferay GUI
    private static final boolean ATTR_SEND_EMAIL_DEFAULT = false;
    private static final String ATTR_STRING_DEFAULT = ""; //call trim() in liferay

    // parameters in addUser()
    // autoPassword, autoScreenName - ignored, mandatory params in MidPoint see upper default
    private static final String ATTR_SCREEN_NAME = Name.NAME; //"screenName";
    private static final String ATTR_EMAIL_ADDRESS = "emailAddress";
    private static final String ATTR_FACEBOOK_ID = "facebookId";
    private static final String ATTR_OPEN_ID = "openId";
    private static final String ATTR_LOCALE = "locale"; // same as languageId in updateUser
    private static final String ATTR_FIRST_NAME = "firstName";
    private static final String ATTR_MIDDLE_NAME = "middleName";
    private static final String ATTR_LAST_NAME = "lastName";
    private static final String ATTR_PREFIX_ID = "prefixId";
    private static final String ATTR_SUFFIX_ID = "suffixId";
    private static final String ATTR_MALE = "male";
    private static final String ATTR_BIRTHDAY_MONTH = "birthdayMonth";
    private static final String ATTR_BIRTHDAY_DAY = "birthdayDay";
    private static final String ATTR_BIRTHDAY_YEAR = "birthdayYear";
    private static final String ATTR_JOB_TITLE = "jobTitle";
    // not implemented now
//    private static final String ATTR_GROUP_IDS = "groupIds";
//    private static final String ATTR_ORGANIZATION_IDS = "organizationIds";
//    private static final String ATTR_ROLE_IDS = "roleIds";
//    private static final String ATTR_USER_GROUP_IDS = "userGroupIds";

    private static final String ATTR_SEND_EMAIL = "sendEmail";

    // additional parameters in addUser() - not implemented now
//    private static final String ATTR_ADDRESSES = "addresses";
//    private static final String ATTR_EMAIL_ADDRESSES = "emailAddresses";
//    private static final String ATTR_PHONES = "phones";
//    private static final String ATTR_WEBSITES = "websites";
//    private static final String ATTR_ANNOUNCEMENTS_DELIVERS = "announcementsDelivers";

    //additional parameters in updateUser()
    private static final String ATTR_PASSWORD_RESET = "passwordReset";
    private static final String ATTR_REMINDER_QUERY_QUESTION = "reminderQueryQuestion";
    private static final String ATTR_REMINDER_QUERY_ANSWER = "reminderQueryAnswer";
    private static final String ATTR_TIME_ZONE_ID = "timeZoneId";
    private static final String ATTR_GREETING = "greeting";
    private static final String ATTR_COMMENTS = "comments";
    private static final String ATTR_SMS_SN = "smsSn";
    private static final String ATTR_AIM_SN = "aimSn";
    private static final String ATTR_FACEBOOK_SN = "facebookSn";
    private static final String ATTR_ICQ_SN = "icqSn";
    private static final String ATTR_JABBER_SN = "jabberSn";
    private static final String ATTR_MSN_SN = "msnSn";
    private static final String ATTR_MY_SPACE_SN = "mySpaceSn";
    private static final String ATTR_SKYPE_SN = "skypeSn";
    private static final String ATTR_TWITTER_SN = "twitterSn";
    private static final String ATTR_YM_SN = "ymSn";
    // not implemented now
//    private static final String ATTR_USER_GROUP_ROLES = "userGroupRoles";

    private LiferayConfiguration configuration;
    private LiferayConnection connection;

    UserServiceSoap userService;
    ContactServiceSoap contactService;

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

    @Override
    public void init(Configuration configuration) {
        this.configuration = (LiferayConfiguration) configuration;
        this.connection = new LiferayConnection(this.configuration);

        UserServiceSoapServiceLocator locatorUser = new UserServiceSoapServiceLocator();
        ContactServiceSoapServiceLocator locatorContact = new ContactServiceSoapServiceLocator();
        try {
            userService = locatorUser.getPortal_UserService(new URL(((LiferayConfiguration) configuration).getHostUrl() + LiferayConfiguration.SERVICE_USERSERVICE));
            contactService = locatorContact.getPortal_ContactService(new URL(((LiferayConfiguration) configuration).getHostUrl() + LiferayConfiguration.SERVICE_CONTACTSERVICE));
        } catch (Exception e) {
            LOG.error(e, "Connection failed to: " + ((LiferayConfiguration) configuration).getHostUrl());
            throw new ConnectorIOException(e.getMessage(), e);
        }

    }

    @Override
    public void dispose() {
        configuration = null;
        if (connection != null) {
            connection.dispose();
            connection = null;
        }
        userService = null;
        contactService = null;
    }

    @Override
    public void test() {
        try {
            userService.getCompanyUsersCount(configuration.getCompanyId());
        } catch (RemoteException e) {
            throw new ConnectorIOException(e.getMessage(), e);
        }
    }

    @Override
    public Schema schema() {
        SchemaBuilder builder = new SchemaBuilder(LiferayConnector.class);

        builder.defineObjectClass(schemaAccount());
        // other schemas ?

        return builder.build();
    }

    private ObjectClassInfo schemaAccount() {
        ObjectClassInfoBuilder objClassBuilder = new ObjectClassInfoBuilder();

        AttributeInfoBuilder attrEmailAddressBuilder = new AttributeInfoBuilder(ATTR_EMAIL_ADDRESS);
        attrEmailAddressBuilder.setRequired(true);
        objClassBuilder.addAttributeInfo(attrEmailAddressBuilder.build());

        AttributeInfoBuilder attrScreenNameBuilder = new AttributeInfoBuilder(ATTR_SCREEN_NAME);
        attrScreenNameBuilder.setRequired(true);
        objClassBuilder.addAttributeInfo(attrScreenNameBuilder.build());

        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_FACEBOOK_ID, Long.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_OPEN_ID).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_LOCALE).build());

        AttributeInfoBuilder attrFirstNameBuilder = new AttributeInfoBuilder(ATTR_FIRST_NAME);
        attrFirstNameBuilder.setRequired(true);
        objClassBuilder.addAttributeInfo(attrFirstNameBuilder.build());

        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_MIDDLE_NAME).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_LAST_NAME).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_PREFIX_ID, Integer.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_SUFFIX_ID, Integer.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_MALE, Boolean.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_BIRTHDAY_MONTH, Integer.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_BIRTHDAY_DAY, Integer.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_BIRTHDAY_YEAR, Integer.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_JOB_TITLE).build());

        //not implemented now:
//        private static final String ATTR_GROUP_IDS = "groupIds"; // long[]
//        private static final String ATTR_ORGANIZATION_IDS = "organizationIds"; // long[]
//        private static final String ATTR_ROLE_IDS = "roleIds"; // long[]
//        private static final String ATTR_USER_GROUP_IDS = "userGroupIds"; // long[]

        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_SEND_EMAIL, Boolean.class).build());

        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_PASSWORD_RESET, Boolean.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_REMINDER_QUERY_QUESTION).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_REMINDER_QUERY_ANSWER).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_TIME_ZONE_ID).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_GREETING).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_COMMENTS).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_SMS_SN).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_AIM_SN).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_FACEBOOK_SN).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_ICQ_SN).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_JABBER_SN).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_MSN_SN).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_MY_SPACE_SN).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_SKYPE_SN).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_TWITTER_SN).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_YM_SN).build());
        //not implemented now:
//        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_USER_GROUP_ROLES).build()); //List<UserGroupRole>

        // __PASSWORD__ attribute
        objClassBuilder.addAttributeInfo(OperationalAttributeInfos.PASSWORD);

        return objClassBuilder.build();
    }


    @Override
    public Uid create(ObjectClass objectClass, Set<Attribute> attributes, OperationOptions options) {
        if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {    // __ACCOUNT__
            return createUser(attributes);
        } else {
            throw new UnsupportedOperationException("Unsupported object class " + objectClass);
        }
    }

    private Uid createUser(Set<Attribute> attributes) {
        String emailAddress = getStringAttr(attributes, ATTR_EMAIL_ADDRESS);
        if (isBlank(emailAddress)) {
            throw new InvalidAttributeValueException("Missing mandatory attribute " + ATTR_EMAIL_ADDRESS);
        }

        String screenName = getStringAttr(attributes, ATTR_SCREEN_NAME);
        if (isBlank(screenName)) {
            throw new InvalidAttributeValueException("Missing mandatory attribute " + ATTR_SCREEN_NAME);
        }

        String firstName = getStringAttr(attributes, ATTR_FIRST_NAME);
        if (isBlank(firstName)) {
            throw new InvalidAttributeValueException("Missing mandatory attribute " + ATTR_FIRST_NAME);
        }

        // I hate this GuardedString!
        final List<String> passwordList = new ArrayList<String>(1);
        GuardedString guardedPassword = getAttr(attributes, OperationalAttributeInfos.PASSWORD.getName(), GuardedString.class);
        if (guardedPassword != null) {
            guardedPassword.access(new GuardedString.Accessor() {
                @Override
                public void access(char[] chars) {
                    passwordList.add(new String(chars));
                }
            });
        }
        String password = null;
        if (!passwordList.isEmpty()) {
            password = passwordList.get(0);
        }

        // check if user already exists, AsixFault not transfer these information from liferay server exception
        try {
            UserSoap existUser = userService.getUserByScreenName(configuration.getCompanyId(), screenName);
            if (existUser != null)
                throw new AlreadyExistsException("User with screen name '" + screenName + "' already exists ");

            existUser = userService.getUserByEmailAddress(configuration.getCompanyId(), emailAddress);
            if (existUser != null)
                throw new AlreadyExistsException("User with email adress '" + emailAddress + "' already exists ");

        } catch (RemoteException e) {
            // its OK
        }

        long facebookId = getAttr(attributes, ATTR_FACEBOOK_ID, Long.class, ATTR_FACEBOOK_ID_DEFAULT, true);
        String openId = getStringAttr(attributes, ATTR_OPEN_ID, ATTR_STRING_DEFAULT, true);
        String locale = getStringAttr(attributes, ATTR_LOCALE);
        String middleName = getStringAttr(attributes, ATTR_MIDDLE_NAME);
        String lastName = getStringAttr(attributes, ATTR_LAST_NAME);
        int prefixId = getAttr(attributes, ATTR_PREFIX_ID, Integer.class, ATTR_PREFIX_ID_DEFAULT, true);
        int suffixId = getAttr(attributes, ATTR_SUFFIX_ID, Integer.class, ATTR_SUFFIX_ID_DEFAULT, true);
        boolean male = getAttr(attributes, ATTR_MALE, Boolean.class, ATTR_MALE_DEFAULT, true);
        int birthdayMonth = getAttr(attributes, ATTR_BIRTHDAY_MONTH, Integer.class, ATTR_BIRTHDAY_MONTH_DEFAULT, true);
        int birthdayDay = getAttr(attributes, ATTR_BIRTHDAY_DAY, Integer.class, ATTR_BIRTHDAY_DAY_DEFAULT, true);
        int birthdayYear = getAttr(attributes, ATTR_BIRTHDAY_YEAR, Integer.class, ATTR_BIRTHDAY_YEAR_DEFAULT, true);
        String jobTitle = getStringAttr(attributes, ATTR_JOB_TITLE);
        boolean sendEmail = getAttr(attributes, ATTR_SEND_EMAIL, Boolean.class, ATTR_SEND_EMAIL_DEFAULT, true);

        //not implemented now:
        long[] groupIds = null;
        long[] organizationIds = null;
        long[] roleIds = null;
        long[] userGroupIds = null;
        UserGroupRoleSoap[] userGroupRoles = new UserGroupRoleSoap[0];

        // updateUser params
        boolean passwordReset = getAttr(attributes, ATTR_PASSWORD_RESET, Boolean.class, configuration.getPasswordResetDefault(), true);
        String reminderQueryQuestion = getStringAttr(attributes, ATTR_REMINDER_QUERY_QUESTION);
        String reminderQueryAnswer = getStringAttr(attributes, ATTR_REMINDER_QUERY_ANSWER);
        String timeZoneId = getStringAttr(attributes, ATTR_TIME_ZONE_ID);
        String greeting = getStringAttr(attributes, ATTR_GREETING);
        String comments = getStringAttr(attributes, ATTR_COMMENTS);
        String smsSn = getStringAttr(attributes, ATTR_SMS_SN);
        String aimSn = getStringAttr(attributes, ATTR_AIM_SN, ATTR_STRING_DEFAULT);
        String facebookSn = getStringAttr(attributes, ATTR_FACEBOOK_SN, ATTR_STRING_DEFAULT);
        String icqSn = getStringAttr(attributes, ATTR_ICQ_SN, ATTR_STRING_DEFAULT);
        String jabberSn = getStringAttr(attributes, ATTR_JABBER_SN, ATTR_STRING_DEFAULT);
        String msnSn = getStringAttr(attributes, ATTR_MSN_SN, ATTR_STRING_DEFAULT);
        String mySpaceSn = getStringAttr(attributes, ATTR_MY_SPACE_SN, ATTR_STRING_DEFAULT);
        String skypeSn = getStringAttr(attributes, ATTR_SKYPE_SN, ATTR_STRING_DEFAULT);
        String twitterSn = getStringAttr(attributes, ATTR_TWITTER_SN, ATTR_STRING_DEFAULT);
        String ymSn = getStringAttr(attributes, ATTR_YM_SN, ATTR_STRING_DEFAULT);

        try {
            ServiceContext serviceContext = new ServiceContext();

            // create user
            UserSoap newUser = userService.addUser(configuration.getCompanyId(), AUTO_PASSWORD, password, password,
                    AUTO_SCREEN_NAME, screenName, emailAddress, facebookId, openId, locale,
                    firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear,
                    jobTitle, groupIds, organizationIds, roleIds, userGroupIds,
                    /*addresses, emailAddresses, phones, websites, announcementsDelivers,*/
                    sendEmail, serviceContext);

            // activate user
            int stateActive = 0;
            userService.updateStatus(newUser.getUserId(), stateActive, serviceContext);

            //other not set parameters to call updateUser
            boolean callUpdateUser = false;
            if (passwordReset != configuration.getPasswordResetDefault() || reminderQueryQuestion != null || reminderQueryAnswer != null
                    || timeZoneId != null || greeting != null || comments != null || smsSn != null || aimSn != null || facebookSn != null
                    || icqSn != null || jabberSn != null || msnSn != null || msnSn != null || mySpaceSn != null || skypeSn != null
                    || twitterSn != null || ymSn != null || userGroupRoles.length > 0) {
                callUpdateUser = true;
                String newPassword = null;
                userService.updateUser(newUser.getUserId(), password, newPassword, newPassword, passwordReset,
                        reminderQueryQuestion, reminderQueryAnswer, screenName, emailAddress, facebookId, openId, locale,
                        timeZoneId, greeting, comments, firstName, middleName, lastName, prefixId, suffixId, male,
                        birthdayMonth, birthdayDay, birthdayYear, smsSn, aimSn, facebookSn, icqSn, jabberSn, msnSn,
                        mySpaceSn, skypeSn, twitterSn, ymSn, jobTitle, groupIds, organizationIds, roleIds,
                        userGroupRoles, userGroupIds, /*addresses, emailAddresses, phones, websites, announcementsDelivers,*/
                        serviceContext);
            }

            Long id = newUser.getUserId();

            LOG.info("New user created, screenName: {0}, Uid: {1}, callUpdateUser: {2} ", screenName, id, callUpdateUser);

            return new Uid(id.toString());
        } catch (java.rmi.RemoteException e) {
            // if(e instanceof AxisFault){ -- Liferay not send server exception to client :(((
            throw new ConnectorIOException(e.getMessage(), e);
        }
    }


    @Override
    public void delete(ObjectClass objectClass, Uid uid, OperationOptions options) {
        if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {
            try {
                userService.deleteUser(toLong(uid));
            } catch (java.rmi.RemoteException e) {
                throw new ConnectorIOException(e.getMessage(), e);
            }
        } else {
            throw new UnsupportedOperationException("Unsupported object class " + objectClass);
        }
    }

    @Override
    public Uid update(ObjectClass objectClass, Uid uid, Set<Attribute> attributes, OperationOptions options) {
        if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {
            return updateUser(uid, attributes);
        } else {
            throw new UnsupportedOperationException("Unsupported object class " + objectClass);
        }
    }

    private Uid updateUser(Uid uid, Set<Attribute> attributes) {
        Long targetUserId = toLong(uid);

        UserSoap origUser;
        ContactSoap origContact;
        try {
            origUser = userService.getUserById(targetUserId);
            origContact = new ContactSoap();// contactService.getContact(origUser.getContactId());
        } catch (java.rmi.RemoteException e) {
            throw new ConnectorIOException(e.getMessage(), e);
        }
        if (origUser == null) {
            throw new UnknownUidException("User with ID " + targetUserId + " does not exist");
        }

        // I hate this GuardedString!
        final List<String> passwordList = new ArrayList<String>(1);
        GuardedString guardedPassword = getAttr(attributes, OperationalAttributeInfos.PASSWORD.getName(), GuardedString.class);
        if (guardedPassword != null) {
            guardedPassword.access(new GuardedString.Accessor() {
                @Override
                public void access(char[] chars) {
                    passwordList.add(new String(chars));
                }
            });
        }
        String password = null;
        if (!passwordList.isEmpty()) {
            password = passwordList.get(0);
        }

//        LOG.ok("userPass: "+origUser.getPassword()+", encrypted: "+origUser.isPasswordEncrypted()+", password from MidPoint: "+password); //hash

        boolean passwordReset = getAttr(attributes, ATTR_PASSWORD_RESET, Boolean.class, configuration.getPasswordResetDefault(), true);
        if (password != null) {
            try {
                userService.updatePassword(toLong(uid), password, password, passwordReset);
                LOG.ok("Password for Uid {0} was changed", uid.getUidValue());
            } catch (java.rmi.RemoteException e) {
                LOG.error("SEE Liferay log, when UserPasswordException exceed, compare old vs. new password, Liferay don't accept password same as current");
                throw new ConnectorIOException(e.getMessage(), e);
            }
        }

        String screenName = getStringAttr(attributes, ATTR_SCREEN_NAME, origUser.getScreenName());
        String emailAddress = getStringAttr(attributes, ATTR_EMAIL_ADDRESS, origUser.getEmailAddress());
        long facebookId = getAttr(attributes, ATTR_FACEBOOK_ID, Long.class, origUser.getFacebookId());
        String openId = getStringAttr(attributes, ATTR_OPEN_ID, origUser.getOpenId(), ATTR_STRING_DEFAULT, true);
        String firstName = getStringAttr(attributes, ATTR_FIRST_NAME, origUser.getFirstName());
        String middleName = getStringAttr(attributes, ATTR_MIDDLE_NAME, origUser.getMiddleName());
        String lastName = getStringAttr(attributes, ATTR_LAST_NAME, origUser.getLastName());
        int prefixId = getAttr(attributes, ATTR_PREFIX_ID, Integer.class, origContact.getPrefixId());
        int suffixId = getAttr(attributes, ATTR_SUFFIX_ID, Integer.class, origContact.getSuffixId());
        boolean male = getAttr(attributes, ATTR_MALE, Boolean.class, origContact.isMale());

        Calendar origBirthday = origContact.getBirthday();
        int origBirthdayMonth = origBirthday == null ? ATTR_BIRTHDAY_MONTH_DEFAULT : origBirthday.get(Calendar.MONTH);
        int origBirthdayDay = origBirthday == null ? ATTR_BIRTHDAY_DAY_DEFAULT : origBirthday.get(Calendar.DAY_OF_MONTH);
        int origBirthdayYear = origBirthday == null ? ATTR_BIRTHDAY_YEAR_DEFAULT : origBirthday.get(Calendar.YEAR);
        int birthdayMonth = getAttr(attributes, ATTR_BIRTHDAY_MONTH, Integer.class, origBirthdayMonth);
        int birthdayDay = getAttr(attributes, ATTR_BIRTHDAY_DAY, Integer.class, origBirthdayDay);
        int birthdayYear = getAttr(attributes, ATTR_BIRTHDAY_YEAR, Integer.class, origBirthdayYear);

        String jobTitle = getStringAttr(attributes, ATTR_JOB_TITLE, origUser.getJobTitle());

        Boolean sendEmail = getAttr(attributes, ATTR_SEND_EMAIL, Boolean.class);
        if (sendEmail != null && sendEmail)
            LOG.warn("In operation update() for user {0}:{1} is not supported sending email notification about their new account, attribute: sendEmail is true", origUser.getUserId(), origUser.getScreenName());


        long[] groupIds = null; // do nothing, see Liferay src
        long[] organizationIds = null; // do nothing
        long[] roleIds = null; // do nothing
        long[] userGroupIds = null; // do nothing
        UserGroupRoleSoap[] userGroupRoles = null; // do nothing

        String reminderQueryQuestion = getStringAttr(attributes, ATTR_REMINDER_QUERY_QUESTION, origUser.getReminderQueryQuestion());
        String reminderQueryAnswer = getStringAttr(attributes, ATTR_REMINDER_QUERY_ANSWER, origUser.getReminderQueryAnswer());
        String languageId = getStringAttr(attributes, ATTR_LOCALE, origUser.getLanguageId());
        String timeZoneId = getStringAttr(attributes, ATTR_TIME_ZONE_ID, origUser.getTimeZoneId());
        String greeting = getStringAttr(attributes, ATTR_GREETING, origUser.getGreeting());
        String comments = getStringAttr(attributes, ATTR_COMMENTS, origUser.getComments());
        String smsSn = getStringAttr(attributes, ATTR_SMS_SN, origContact.getSmsSn(), ATTR_STRING_DEFAULT, true);
        String aimSn = getStringAttr(attributes, ATTR_AIM_SN, origContact.getAimSn(), ATTR_STRING_DEFAULT, true);
        String facebookSn = getStringAttr(attributes, ATTR_FACEBOOK_SN, origContact.getFacebookSn(), ATTR_STRING_DEFAULT, true);
        String icqSn = getStringAttr(attributes, ATTR_ICQ_SN, origContact.getIcqSn(), ATTR_STRING_DEFAULT, true);
        String jabberSn = getStringAttr(attributes, ATTR_JABBER_SN, origContact.getJabberSn(), ATTR_STRING_DEFAULT, true);
        String msnSn = getStringAttr(attributes, ATTR_MSN_SN, origContact.getMsnSn(), ATTR_STRING_DEFAULT, true);
        String mySpaceSn = getStringAttr(attributes, ATTR_MY_SPACE_SN, origContact.getMySpaceSn(), ATTR_STRING_DEFAULT, true);
        String skypeSn = getStringAttr(attributes, ATTR_SKYPE_SN, origContact.getSkypeSn(), ATTR_STRING_DEFAULT, true);
        String twitterSn = getStringAttr(attributes, ATTR_TWITTER_SN, origContact.getTwitterSn(), ATTR_STRING_DEFAULT, true);
        String ymSn = getStringAttr(attributes, ATTR_YM_SN, origContact.getYmSn(), ATTR_STRING_DEFAULT, true);

        try {
            String newPassword = null; // set upper over method updatePassword(...)
            ServiceContext serviceContext = new ServiceContext();

            userService.updateUser(origUser.getUserId(), password, newPassword, newPassword, passwordReset,
                    reminderQueryQuestion, reminderQueryAnswer, screenName, emailAddress, facebookId, openId,
                    languageId, timeZoneId, greeting, comments, firstName, middleName, lastName, prefixId, suffixId,
                    male, birthdayMonth, birthdayDay, birthdayYear, smsSn, aimSn, facebookSn, icqSn, jabberSn, msnSn,
                    mySpaceSn, skypeSn, twitterSn, ymSn, jobTitle, groupIds, organizationIds, roleIds, userGroupRoles, userGroupIds,
                    /*addresses, emailAddresses, phones, websites, announcementsDelivers,*/
                    serviceContext);
        } catch (java.rmi.RemoteException e) {
            throw new ConnectorIOException(e.getMessage(), e);
        }

        return uid;
    }

    @Override
    public FilterTranslator<String> createFilterTranslator(ObjectClass objectClass, OperationOptions options) {
        return new AbstractFilterTranslator<String>() {
        };
    }

    @Override
    public void executeQuery(ObjectClass objectClass, String query, ResultsHandler handler, OperationOptions options) {
        if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {
            UserSoap[] users;
            try {
                int userCount = userService.getCompanyUsersCount(configuration.getCompanyId());
                LOG.ok("Number of users in liferay: {0}", userCount);
                users = userService.getCompanyUsers(configuration.getCompanyId(), 0, userCount);

                for (UserSoap user : users) {
                    ContactSoap contact = contactService.getContact(user.getContactId());
                    ConnectorObject connectorObject = convertUserToConnectorObject(user, contact);
                    handler.handle(connectorObject);
                }

            } catch (java.rmi.RemoteException e) {
                throw new ConnectorIOException(e.getMessage(), e);
            }
        } else {
            throw new UnsupportedOperationException("Unsupported object class " + objectClass);
        }
    }

    private ConnectorObject convertUserToConnectorObject(UserSoap user, ContactSoap contact) {
        ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
        builder.setUid(toUid(user.getUserId()));
        builder.setName(user.getScreenName());
        addAttr(builder, ATTR_EMAIL_ADDRESS, user.getEmailAddress());
        addAttr(builder, ATTR_FACEBOOK_ID, user.getFacebookId());
        addAttr(builder, ATTR_OPEN_ID, user.getOpenId());
        addAttr(builder, ATTR_FIRST_NAME, user.getFirstName());
        addAttr(builder, ATTR_MIDDLE_NAME, user.getMiddleName());
        addAttr(builder, ATTR_LAST_NAME, user.getLastName());
        addAttr(builder, ATTR_JOB_TITLE, user.getJobTitle());
        addAttr(builder, ATTR_LOCALE, user.getLanguageId());
        addAttr(builder, ATTR_COMMENTS, user.getComments());
        addAttr(builder, ATTR_TIME_ZONE_ID, user.getTimeZoneId());
        addAttr(builder, ATTR_REMINDER_QUERY_QUESTION, user.getReminderQueryQuestion());
        addAttr(builder, ATTR_REMINDER_QUERY_ANSWER, user.getReminderQueryAnswer());

        addAttr(builder, ATTR_PREFIX_ID, contact.getPrefixId());
        addAttr(builder, ATTR_SUFFIX_ID, contact.getSuffixId());
        addAttr(builder, ATTR_MALE, contact.isMale());
        Calendar birthday = contact.getBirthday();
        addAttr(builder, ATTR_BIRTHDAY_MONTH, birthday.get(Calendar.MONTH));
        addAttr(builder, ATTR_BIRTHDAY_DAY, birthday.get(Calendar.DAY_OF_MONTH));
        addAttr(builder, ATTR_BIRTHDAY_YEAR, birthday.get(Calendar.YEAR));
        addAttr(builder, ATTR_SMS_SN, contact.getSmsSn());
        addAttr(builder, ATTR_AIM_SN, contact.getAimSn());
        addAttr(builder, ATTR_FACEBOOK_SN, contact.getFacebookSn());
        addAttr(builder, ATTR_ICQ_SN, contact.getIcqSn());
        addAttr(builder, ATTR_JABBER_SN, contact.getJabberSn());
        addAttr(builder, ATTR_MSN_SN, contact.getMsnSn());
        addAttr(builder, ATTR_MY_SPACE_SN, contact.getMySpaceSn());
        addAttr(builder, ATTR_SKYPE_SN, contact.getSkypeSn());
        addAttr(builder, ATTR_TWITTER_SN, contact.getTwitterSn());
        addAttr(builder, ATTR_YM_SN, contact.getYmSn());

        // available interesting attributes: user.getModifiedDate(), user.getPasswordModifiedDate()

        return builder.build();
    }


    private String getStringAttr(Set<Attribute> attributes, String attrName) throws InvalidAttributeValueException {
        return getAttr(attributes, attrName, String.class);
    }

    private String getStringAttr(Set<Attribute> attributes, String attrName, String defaultVal) throws InvalidAttributeValueException {
        return getAttr(attributes, attrName, String.class, defaultVal);
    }

    private String getStringAttr(Set<Attribute> attributes, String attrName, String defaultVal, String defaultVal2, boolean notNull) throws InvalidAttributeValueException {
        String ret = getAttr(attributes, attrName, String.class, defaultVal);
        if (notNull && ret == null) {
            if (notNull && defaultVal == null)
                return defaultVal2;
            return defaultVal;
        }
        return ret;
    }

    private String getStringAttr(Set<Attribute> attributes, String attrName, String defaultVal, boolean notNull) throws InvalidAttributeValueException {
        String ret = getAttr(attributes, attrName, String.class, defaultVal);
        if (notNull && ret == null)
            return defaultVal;
        return ret;
    }

    private <T> T getAttr(Set<Attribute> attributes, String attrName, Class<T> type) throws InvalidAttributeValueException {
        return getAttr(attributes, attrName, type, null);
    }

    private <T> T getAttr(Set<Attribute> attributes, String attrName, Class<T> type, T defaultVal, boolean notNull) throws InvalidAttributeValueException {
        T ret = getAttr(attributes, attrName, type, defaultVal);
        if (notNull && ret == null)
            return defaultVal;
        return ret;
    }

    @SuppressWarnings("unchecked")
    public <T> T getAttr(Set<Attribute> attributes, String attrName, Class<T> type, T defaultVal) throws InvalidAttributeValueException {
        for (Attribute attr : attributes) {
            if (attrName.equals(attr.getName())) {
                List<Object> vals = attr.getValue();
                if (vals == null || vals.isEmpty()) {
                    // set empty value
                    return null;
                }
                if (vals.size() == 1) {
                    Object val = vals.get(0);
                    if (val == null) {
                        // set empty value
                        return null;
                    }
                    if (type.isAssignableFrom(val.getClass())) {
                        return (T) val;
                    }
                    throw new InvalidAttributeValueException("Unsupported type " + val.getClass() + " for attribute " + attrName);
                }
                throw new InvalidAttributeValueException("More than one value for attribute " + attrName);
            }
        }
        // set default value when attrName not in changed attributes
        return defaultVal;
    }

    private <T> void addAttr(ConnectorObjectBuilder builder, String attrName, T attrVal) {
        if (attrVal != null) {
            builder.addAttribute(attrName, attrVal);
        }
    }

    public static boolean isEmpty(String val) {
        return val == null ? true : "".equals(val);
    }

    public static boolean isBlank(String val) {
        return val == null ? true : isEmpty(val.trim());
    }

    private Long toLong(Uid uid) {
        return Long.parseLong(uid.getUidValue());
    }

    private Uid toUid(long uid) {
        return new Uid((new Long(uid)).toString());
    }

}
