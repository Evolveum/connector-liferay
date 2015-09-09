/*
 * Copyright (c) 2015 Evolveum
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
import com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueServiceSoap;
import com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueServiceSoapServiceLocator;
import com.evolveum.polygon.connector.liferay.group.GroupServiceSoap;
import com.evolveum.polygon.connector.liferay.group.GroupServiceSoapServiceLocator;
import com.evolveum.polygon.connector.liferay.organization.*;
import com.evolveum.polygon.connector.liferay.role.RoleServiceSoap;
import com.evolveum.polygon.connector.liferay.role.RoleServiceSoapServiceLocator;
import com.evolveum.polygon.connector.liferay.user.*;
import com.evolveum.polygon.connector.liferay.user.ServiceContext;
import org.apache.axis.AxisProperties;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.identityconnectors.common.StringUtil;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.exceptions.AlreadyExistsException;
import org.identityconnectors.framework.common.exceptions.ConnectorIOException;
import org.identityconnectors.framework.common.exceptions.InvalidAttributeValueException;
import org.identityconnectors.framework.common.exceptions.UnknownUidException;
import org.identityconnectors.framework.common.objects.*;
import org.identityconnectors.framework.common.objects.filter.FilterTranslator;
import org.identityconnectors.framework.spi.Configuration;
import org.identityconnectors.framework.spi.ConnectorClass;
import org.identityconnectors.framework.spi.PoolableConnector;
import org.identityconnectors.framework.spi.operations.*;

import java.rmi.RemoteException;
import java.util.*;

@ConnectorClass(displayNameKey = "liferay.connector.display", configurationClass = LiferayConfiguration.class)
public class LiferayConnector implements PoolableConnector, TestOp, SchemaOp, CreateOp, DeleteOp, UpdateOp, SearchOp<LiferayFilter>, SyncOp {

    private static final Log LOG = Log.getLog(LiferayConnector.class);

    public static final String SERVICE_USERSERVICE = "Portal_UserService";
    public static final String SERVICE_CONTACTSERVICE = "Portal_ContactService";
    public static final String SERVICE_EXPANDOVALUESERVICE = "Portlet_Expando_ExpandoValueService";
    public static final String SERVICE_ROLESERVICE = "Portal_RoleService";
    public static final String SERVICE_ORGANIZATIONSERVICE = "Portal_OrganizationService";
    // not used now:
    public static final String SERVICE_GROUPSERVICE = "Portal_GroupService";
    public static final String SERVICE_USERGROUPSERVICE = "Portal_UserGroupService";
    public static final String SERVICE_USERGROUPROLESERVICE = "Portal_UserGroupRoleService";

    // not relevant params for MidPoint, password and screen name are mandatory params when creating Account
    private static final boolean AUTO_PASSWORD = false;
    private static final boolean AUTO_SCREEN_NAME = false;

    // not null defaults
    // in Liferay at first login user must reset password by default (value=true),
    // but when MidPoint manage account & passwords its useless and must set to 'false'
    private static final boolean ATTR_PASSWORD_RESET_DEFAULT = false;
    private static final long ATTR_FACEBOOK_ID_DEFAULT = 0L;
    private static final int ATTR_PREFIX_ID_DEFAULT = 0;
    private static final int ATTR_SUFFIX_ID_DEFAULT = 0;
    private static final boolean ATTR_MALE_DEFAULT = true;
    private static final int ATTR_BIRTHDAY_MONTH_DEFAULT = 0; //january
    private static final int ATTR_BIRTHDAY_DAY_DEFAULT = 1;
    private static final int ATTR_BIRTHDAY_YEAR_DEFAULT = 1970; // value from liferay GUI
    private static final boolean ATTR_SEND_EMAIL_DEFAULT = false;
    private static final String ATTR_STRING_DEFAULT = ""; //call trim() in liferay
    private static final int ATTR_STATUS_ENABLED = 0; //active user in liferay
    private static final int ATTR_STATUS_DEFAULT = 2; //default user status in liferay (not visible in GUI)
    private static final int ATTR_STATUS_DISABLED = 5; // when disabled in GUI manually

    // parameters in addUser()
    // autoPassword, autoScreenName - ignored, mandatory params in MidPoint see upper default
    private static final String ATTR_SCREEN_NAME = Name.NAME; //"screenName";
    public static final String ATTR_EMAIL_ADDRESS = "emailAddress";
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

    private static final String ATTR_ROLES = "roles";
    private static final String ATTR_ORGANIZATION_IDS = "organizationIds";

    // not implemented now
//    private static final String ATTR_GROUP_IDS = "groupIds";
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
    // implemented over attribute 'roles' with support Site and Organization roles also
//    private static final String ATTR_USER_GROUP_ROLES = "userGroupRoles";


    public static final String ORGANIZATION_NAME = "Organization";
    // organization attributes
    private static final String ATTR_ORG_NAME = Name.NAME; //"name";
    private static final String ATTR_ORG_TYPE = "type";
    private static final String ATTR_ORG_RECURSABLE = "recursable";
    public static final String ATTR_ORG_PARENT_ORGANIZATION_ID = "parentOrganizationId";
    private static final String ATTR_ORG_REGION_ID = "regionId";
    private static final String ATTR_ORG_COUNTRY_ID = "countryId";
    private static final String ATTR_ORG_COMMENTS = "comments";
    private static final String ATTR_ORG_STATUS_ID = "statusId";

    // organization defaults
    private static final String ATTR_ORG_TYPE_DEFAULT = "regular-organization";
    private static final boolean ATTR_ORG_RECURSABLE_DEFAULT = true;
    private static final long ATTR_ORG_ROOT_ORGANIZATION_ID = 0;
    private static final long ATTR_ORG_REGION_ID_DEFAULT = 0;
    private static final long ATTR_ORG_COUNTRY_ID_DEFAULT = 0;
    private static final int ATTR_ORG_STATUS_ID_DEFAULT = 12017; //ListTypeConstants.ORGANIZATION_STATUS_DEFAULT
    private static final String ATTR_ORG_COMMENTS_DEFAULT = null;


    private LiferayConfiguration configuration;

    private UserServiceSoap userService;
    private ContactServiceSoap contactService;
    private RoleServiceSoap roleService;
    private OrganizationServiceSoap organizationService;
    private ExpandoValueServiceSoap expandoValueService;
    private GroupServiceSoap groupService;

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

    @Override
    public void init(Configuration configuration) {
        LOG.ok("connector init");
        this.configuration = (LiferayConfiguration) configuration;
        this.configuration.parseCustomFields();

        if (this.configuration.getTrustingAllCertificates() != null && this.configuration.getTrustingAllCertificates()) {
            AxisProperties.setProperty("axis.socketSecureFactory", "org.apache.axis.components.net.SunFakeTrustSocketFactory");
        }

        UserServiceSoapServiceLocator locatorUser = new UserServiceSoapServiceLocator();
        ContactServiceSoapServiceLocator locatorContact = new ContactServiceSoapServiceLocator();
        RoleServiceSoapServiceLocator locatorRole = new RoleServiceSoapServiceLocator();
        OrganizationServiceSoapServiceLocator locatorOrganization = new OrganizationServiceSoapServiceLocator();
        ExpandoValueServiceSoapServiceLocator locatorExpandoValue = new ExpandoValueServiceSoapServiceLocator();
        GroupServiceSoapServiceLocator locatorGroup = new GroupServiceSoapServiceLocator();

        try {
            userService = locatorUser.getPortal_UserService(((LiferayConfiguration) configuration).getUrl(SERVICE_USERSERVICE));
            this.configuration.hackAsixAuth((Stub) userService);
            contactService = locatorContact.getPortal_ContactService(((LiferayConfiguration) configuration).getUrl(SERVICE_CONTACTSERVICE));
            this.configuration.hackAsixAuth((Stub) contactService);
            roleService = locatorRole.getPortal_RoleService(((LiferayConfiguration) configuration).getUrl(SERVICE_ROLESERVICE));
            this.configuration.hackAsixAuth((Stub) roleService);
            organizationService = locatorOrganization.getPortal_OrganizationService(((LiferayConfiguration) configuration).getUrl(SERVICE_ORGANIZATIONSERVICE));
            this.configuration.hackAsixAuth((Stub) organizationService);
            expandoValueService = locatorExpandoValue.getPortlet_Expando_ExpandoValueService(((LiferayConfiguration) configuration).getUrl(SERVICE_EXPANDOVALUESERVICE));
            this.configuration.hackAsixAuth((Stub) expandoValueService);
            groupService = locatorGroup.getPortal_GroupService(((LiferayConfiguration) configuration).getUrl(SERVICE_GROUPSERVICE));
            this.configuration.hackAsixAuth((Stub) groupService);
        } catch (Exception e) {
            LOG.error(e, "Connection failed to: " + ((LiferayConfiguration) configuration).getEndpoint());
            throw new ConnectorIOException(e.getMessage(), e);
        }

    }

    @Override
    public void dispose() {
        configuration = null;
        userService = null;
        contactService = null;
        roleService = null;
        organizationService = null;
        expandoValueService = null;
        groupService = null;
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
        builder.defineObjectClass(schemaOrganization());

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

        AttributeInfoBuilder attrMiddleNameBuilder = new AttributeInfoBuilder(ATTR_MIDDLE_NAME);
        attrMiddleNameBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attrMiddleNameBuilder.build());
        AttributeInfoBuilder attrLastNameBuilder = new AttributeInfoBuilder(ATTR_LAST_NAME);
        attrLastNameBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attrLastNameBuilder.build());
        AttributeInfoBuilder attrPrefixIdBuilder = new AttributeInfoBuilder(ATTR_PREFIX_ID, Integer.class);
        attrPrefixIdBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attrPrefixIdBuilder.build());
        AttributeInfoBuilder attrSufficIdBuilder = new AttributeInfoBuilder(ATTR_SUFFIX_ID, Integer.class);
        attrSufficIdBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attrSufficIdBuilder.build());
        AttributeInfoBuilder attrMaleBuilder = new AttributeInfoBuilder(ATTR_MALE, Boolean.class);
        attrMaleBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attrMaleBuilder.build());
        AttributeInfoBuilder attrBirthdayMontBuilder = new AttributeInfoBuilder(ATTR_BIRTHDAY_MONTH, Integer.class);
        attrBirthdayMontBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attrBirthdayMontBuilder.build());
        AttributeInfoBuilder attributeBirthdayDayBuilder = new AttributeInfoBuilder(ATTR_BIRTHDAY_DAY, Integer.class);
        attributeBirthdayDayBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeBirthdayDayBuilder.build());
        AttributeInfoBuilder attributeBirthdayYearBuilder = new AttributeInfoBuilder(ATTR_BIRTHDAY_YEAR, Integer.class);
        attributeBirthdayYearBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeBirthdayYearBuilder.build());
        AttributeInfoBuilder attributeJobTitleBuilder = new AttributeInfoBuilder(ATTR_JOB_TITLE);
        attributeJobTitleBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeJobTitleBuilder.build());

        AttributeInfoBuilder attributeRoleIdsBuilder = new AttributeInfoBuilder(ATTR_ROLES, String.class);
        attributeRoleIdsBuilder.setReturnedByDefault(false); // slower queries
        attributeRoleIdsBuilder.setMultiValued(true);
        objClassBuilder.addAttributeInfo(attributeRoleIdsBuilder.build());

        // Long --> String, because association uid require String...
        AttributeInfoBuilder attributeOrganizationIdsBuilder = new AttributeInfoBuilder(ATTR_ORGANIZATION_IDS, String.class);
        attributeOrganizationIdsBuilder.setReturnedByDefault(false); // slower queries
        attributeOrganizationIdsBuilder.setMultiValued(true);
        objClassBuilder.addAttributeInfo(attributeOrganizationIdsBuilder.build());

        //not implemented now:
//        private static final String ATTR_GROUP_IDS = "groupIds"; // long[]
//        private static final String ATTR_USER_GROUP_IDS = "userGroupIds"; // long[]

        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_SEND_EMAIL, Boolean.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_PASSWORD_RESET, Boolean.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_REMINDER_QUERY_QUESTION).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_REMINDER_QUERY_ANSWER).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_TIME_ZONE_ID).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_GREETING).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_COMMENTS).build());
        AttributeInfoBuilder attributeSmsSnBuilder = new AttributeInfoBuilder(ATTR_SMS_SN);
        attributeSmsSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeSmsSnBuilder.build());
        AttributeInfoBuilder attributeAimSnBuilder = new AttributeInfoBuilder(ATTR_AIM_SN);
        attributeSmsSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeAimSnBuilder.build());
        AttributeInfoBuilder attributeFacebookSnBuilder = new AttributeInfoBuilder(ATTR_FACEBOOK_SN);
        attributeFacebookSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeFacebookSnBuilder.build());
        AttributeInfoBuilder attributeIcqSnBuilder = new AttributeInfoBuilder(ATTR_ICQ_SN);
        attributeIcqSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeIcqSnBuilder.build());
        AttributeInfoBuilder attributeJabberSnBuilder = new AttributeInfoBuilder(ATTR_JABBER_SN);
        attributeJabberSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeJabberSnBuilder.build());
        AttributeInfoBuilder attributeMsnSnBuilder = new AttributeInfoBuilder(ATTR_MSN_SN);
        attributeMsnSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeMsnSnBuilder.build());
        AttributeInfoBuilder attributeMySpaceSnBuilder = new AttributeInfoBuilder(ATTR_MY_SPACE_SN);
        attributeMySpaceSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeMySpaceSnBuilder.build());
        AttributeInfoBuilder attributeSkypeSnBuilder = new AttributeInfoBuilder(ATTR_SKYPE_SN);
        attributeSkypeSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeSkypeSnBuilder.build());
        AttributeInfoBuilder attributeTwitterSnBuilder = new AttributeInfoBuilder(ATTR_TWITTER_SN);
        attributeTwitterSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeTwitterSnBuilder.build());
        AttributeInfoBuilder attributeYmSnBuilder = new AttributeInfoBuilder(ATTR_YM_SN);
        attributeYmSnBuilder.setReturnedByDefault(false); // included in Contacts, not in Liferay User
        objClassBuilder.addAttributeInfo(attributeYmSnBuilder.build());

        objClassBuilder.addAttributeInfo(OperationalAttributeInfos.ENABLE); //enabled/disabled - Administrative Status

        // __PASSWORD__ attribute
        objClassBuilder.addAttributeInfo(OperationalAttributeInfos.PASSWORD);

        if (configuration.getCustomFields() != null && configuration.getCustomFields().length > 0) {
            for (String fieldName : configuration.getCustomFieldNames()) {
                Class<?> type = LiferayExpando.liferayType2connectorType(configuration.getCustomFieldType(fieldName));
                AttributeInfoBuilder attributeCustomFieldBuilder = new AttributeInfoBuilder(fieldName, type);
                attributeCustomFieldBuilder.setReturnedByDefault(false);
                objClassBuilder.addAttributeInfo(attributeCustomFieldBuilder.build());
            }
        }

        return objClassBuilder.build();
    }

    private ObjectClassInfo schemaOrganization() {
        ObjectClassInfoBuilder objClassBuilder = new ObjectClassInfoBuilder();
        objClassBuilder.setType(ORGANIZATION_NAME);

        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_ORG_TYPE).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_ORG_RECURSABLE, Boolean.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_ORG_PARENT_ORGANIZATION_ID, String.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_ORG_REGION_ID, Long.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_ORG_COUNTRY_ID, Long.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_ORG_STATUS_ID, Integer.class).build());
        objClassBuilder.addAttributeInfo(new AttributeInfoBuilder(ATTR_ORG_COMMENTS).build());

        return objClassBuilder.build();
    }

    @Override
    public Uid create(ObjectClass objectClass, Set<Attribute> attributes, OperationOptions options) {
        if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {    // __ACCOUNT__
            return createUser(attributes);
        } else if (objectClass.is(ORGANIZATION_NAME)) {    // Organization -> CustomOrgObjectClass
                return createOrganization(attributes);
        } else {
            throw new UnsupportedOperationException("Unsupported object class " + objectClass);
        }
    }

    private Uid createUser(Set<Attribute> attributes) {
        LOG.ok("createUser attributes: {0}", attributes);
        String emailAddress = getStringAttr(attributes, ATTR_EMAIL_ADDRESS);
        if (StringUtil.isBlank(emailAddress)) {
            throw new InvalidAttributeValueException("Missing mandatory attribute " + ATTR_EMAIL_ADDRESS);
        }

        String screenName = getStringAttr(attributes, ATTR_SCREEN_NAME);
        if (StringUtil.isBlank(screenName)) {
            throw new InvalidAttributeValueException("Missing mandatory attribute " + ATTR_SCREEN_NAME);
        }

        String firstName = getStringAttr(attributes, ATTR_FIRST_NAME);
        if (StringUtil.isBlank(firstName)) {
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

        if (StringUtil.isBlank(password)) {
            throw new InvalidAttributeValueException("Missing mandatory attribute " + OperationalAttributes.PASSWORD_NAME);
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

        LiferayRoles lr;
        try {
            lr = new LiferayRoles(attributes, ATTR_ROLES, this.configuration.getDefaultRoles(), roleService, groupService, configuration.getCompanyId());
        } catch (RemoteException e) {
            throw new InvalidAttributeValueException("Not parsable roles in attributes " + attributes + ", " + e, e);
        }
        long[] roleIds = lr.getRegularRoles();

        long[] defaultOrganizations = null;
        long[] organizationIds = getMultiValAttr(attributes, ATTR_ORGANIZATION_IDS, defaultOrganizations);

        //not implemented now, only support to sitest
        long[] groupIds = lr.getSites();
        //not implemented now:
        long[] userGroupIds = null;
        // userGroupRoles - see down

        // updateUser params
        boolean passwordReset = getAttr(attributes, ATTR_PASSWORD_RESET, Boolean.class, ATTR_PASSWORD_RESET_DEFAULT, true);
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

        Map<String, Object> customValues = getCustomValues(attributes);

        try {
            ServiceContext serviceContext = new ServiceContext();

            LOG.ok("addUser args in createUser: companyId:{0}, screenName:{1}, emailAddress:{2}, facebookId:{3}, openId:{4}, locale:{5}, " +
                            "firstName:{6}, middleName:{7}, lastName:{8}, prefixId:{9}, suffixId:{10}, male:{11}, birthdayMonth:{12}, birthdayDay:{13}, " +
                            "birthdayYear:{14}, jobTitle:{15}, groupIds:{16}, organizationIds:{17}, roleIds:{18}, userGroupIds:{19}, sendEmail:{20}",
                    configuration.getCompanyId(), screenName, emailAddress, facebookId, openId, locale,
                    firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear,
                    jobTitle, Arrays.toString(groupIds), Arrays.toString(organizationIds), Arrays.toString(roleIds), userGroupIds, sendEmail);
            // create user
            UserSoap newUser = userService.addUser(configuration.getCompanyId(), AUTO_PASSWORD, password, password,
                    AUTO_SCREEN_NAME, screenName, emailAddress, facebookId, openId, locale,
                    firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear,
                    jobTitle, groupIds, organizationIds, roleIds, userGroupIds,
                    /*addresses, emailAddresses, phones, websites, announcementsDelivers,*/
                    sendEmail, serviceContext);

            // activate user if needed
            updateStatus(newUser.getUserId(), attributes);

            UserGroupRoleSoap[] userGroupRoles = lr.getUserGroupRoles(newUser.getUserId());

            //other not set parameters to call updateUser
            boolean callUpdateUser = false;
            if (passwordReset != ATTR_PASSWORD_RESET_DEFAULT || reminderQueryQuestion != null || reminderQueryAnswer != null
                    || timeZoneId != null || greeting != null || comments != null || smsSn != null || aimSn != null || facebookSn != null
                    || icqSn != null || jabberSn != null || msnSn != null || msnSn != null || mySpaceSn != null || skypeSn != null
                    || twitterSn != null || ymSn != null || userGroupRoles.length > 0) {
                callUpdateUser = true;
                String newPassword = null;

                LOG.ok("updateUser with additional args in createUser: userId:{0}, " +
                                "reminderQueryQuestion:{1}, reminderQueryAnswer:{2}, screenName:{3}, emailAddress:{4}, facebookId:{5}, openId:{6}, locale:{7}, " +
                                "timeZoneId:{8}, greeting:{9}, comments:{10}, firstName:{11}, middleName:{12}, lastName:{13}, prefixId:{14}, suffixId:{15}, male:{16}, " +
                                "birthdayMonth:{17}, birthdayDay:{18}, birthdayYear:{19}, smsSn:{20}, aimSn:{21}, facebookSn:{22}, icqSn:{23}, jabberSn:{24}, msnSn:{25}, " +
                                "mySpaceSn:{26}, skypeSn:{27}, twitterSn:{28}, ymSn:{29}, jobTitle:{30}, groupIds:{31}, organizationIds:{32}, roleIds:{33}, " +
                                "userGroupRoles:{34}, userGroupIds:{35}",
                        newUser.getUserId(),
                        reminderQueryQuestion, reminderQueryAnswer, screenName, emailAddress, facebookId, openId, locale,
                        timeZoneId, greeting, comments, firstName, middleName, lastName, prefixId, suffixId, male,
                        birthdayMonth, birthdayDay, birthdayYear, smsSn, aimSn, facebookSn, icqSn, jabberSn, msnSn,
                        mySpaceSn, skypeSn, twitterSn, ymSn, jobTitle, Arrays.toString(groupIds), Arrays.toString(organizationIds), Arrays.toString(roleIds),
                        LiferayRoles.userGroupRolesToString(userGroupRoles), userGroupIds);

                userService.updateUser(newUser.getUserId(), password, newPassword, newPassword, passwordReset,
                        reminderQueryQuestion, reminderQueryAnswer, screenName, emailAddress, facebookId, openId, locale,
                        timeZoneId, greeting, comments, firstName, middleName, lastName, prefixId, suffixId, male,
                        birthdayMonth, birthdayDay, birthdayYear, smsSn, aimSn, facebookSn, icqSn, jabberSn, msnSn,
                        mySpaceSn, skypeSn, twitterSn, ymSn, jobTitle, groupIds, organizationIds, roleIds,
                        userGroupRoles, userGroupIds, /*addresses, emailAddresses, phones, websites, announcementsDelivers,*/
                        serviceContext);
            }
            boolean callExpando = updateCustomValues(customValues, newUser.getUserId());

            long id = newUser.getUserId();

            LOG.ok("New user created, screenName: {0}, Uid: {1}, callUpdateUser: {2}, updateCustomValues: {3} ", screenName, id, callUpdateUser, callExpando);

            return toUid(id);
        } catch (java.rmi.RemoteException e) {
            // if(e instanceof AxisFault){ -- Liferay not send server exception to client :(((
            throw new ConnectorIOException(e.getMessage(), e);
        }
    }

    private void updateStatus(long userId, Set<Attribute> attributes) throws RemoteException {
        Boolean enable = getAttr(attributes, OperationalAttributes.ENABLE_NAME, Boolean.class);
        LOG.ok("updateStatus, userId: {0}, enabled: {1} (if null, not applied)", userId, enable);
        if (enable != null) {
            int newStatus = enable ? ATTR_STATUS_ENABLED : ATTR_STATUS_DISABLED;
            userService.updateStatus(userId, newStatus);
        }
    }

    private Uid createOrganization(Set<Attribute> attributes) {
        LOG.ok("createOrganization attributes: {0}", attributes);
        String name = getStringAttr(attributes, ATTR_ORG_NAME);
        if (StringUtil.isBlank(name)) {
            throw new InvalidAttributeValueException("Missing mandatory attribute "+ATTR_ORG_NAME);
        }

        String type = getStringAttr(attributes, ATTR_ORG_TYPE, ATTR_ORG_TYPE_DEFAULT, true);
        String parentOrganization = getStringAttr(attributes, ATTR_ORG_PARENT_ORGANIZATION_ID, String.valueOf(ATTR_ORG_ROOT_ORGANIZATION_ID), true);
        long parentOrganizationId = Long.valueOf(parentOrganization);
        long regionId = getAttr(attributes, ATTR_ORG_REGION_ID, Long.class, ATTR_ORG_REGION_ID_DEFAULT, true);
        long countryId = getAttr(attributes, ATTR_ORG_COUNTRY_ID, Long.class, ATTR_ORG_COUNTRY_ID_DEFAULT, true);
        int statusId = getAttr(attributes, ATTR_ORG_STATUS_ID, Integer.class, ATTR_ORG_STATUS_ID_DEFAULT, true);
        String comments = getStringAttr(attributes, ATTR_ORG_COMMENTS, ATTR_ORG_COMMENTS_DEFAULT);
        boolean recursable = getAttr(attributes, ATTR_ORG_RECURSABLE, Boolean.class, ATTR_ORG_RECURSABLE_DEFAULT, true);

        try {
            LOG.ok("addOrganization: parentOrganizationId: {0}, name: {1}, type: {2}, regionId: {3}, countryId: {4}, statusId: {5}, comments: {6}, recursable: {7}",
                    parentOrganizationId, name, type, regionId, countryId, statusId, comments, recursable);

            OrganizationSoap newOrg = organizationService.addOrganization(parentOrganizationId, name, type, recursable, regionId, countryId, statusId, comments, configuration.getAssociateOrganizationWithMainSite(), null);

            LOG.ok("addOrganization: new ID: {0}", newOrg.getOrganizationId());

            return toUid(newOrg.getOrganizationId());
        } catch (java.rmi.RemoteException e) {
            if (e.getMessage().contains("There is another organization named")) {
                throw new AlreadyExistsException(e.getMessage());
            }
            // if(e instanceof AxisFault){ -- Liferay not send server exception to client :(((
            throw new ConnectorIOException(e.getMessage(), e);
        }
    }

    @Override
    public void delete(ObjectClass objectClass, Uid uid, OperationOptions options) {
        if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {
            try {
                LOG.ok("delete user, Uid: {0}", uid);
                userService.deleteUser(toLong(uid));
            } catch (java.rmi.RemoteException e) {
                throw new ConnectorIOException(e.getMessage(), e);
            }
        } else if (objectClass.is(ORGANIZATION_NAME)) {
            try {
                LOG.ok("delete organization, Uid: {0}", uid);
                organizationService.deleteOrganization(toLong(uid));
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
        } else if (objectClass.is(ORGANIZATION_NAME)) {
            return updateOrganization(uid, attributes);
        } else {
            throw new UnsupportedOperationException("Unsupported object class " + objectClass);
        }
    }

    private Uid updateUser(Uid uid, Set<Attribute> attributes) {
        LOG.ok("updateUser, Uid: {0}, attributes: {1}", uid, attributes);
        if (attributes == null || attributes.isEmpty()) {
            LOG.ok("update ignored, nothing changed");
            return uid;
        }

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

        boolean passwordReset = getAttr(attributes, ATTR_PASSWORD_RESET, Boolean.class, ATTR_PASSWORD_RESET_DEFAULT, true);
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

        LiferayRoles lr;
        try {
            lr = new LiferayRoles(attributes, ATTR_ROLES, this.configuration.getDefaultRoles(), roleService, groupService, configuration.getCompanyId());
        } catch (RemoteException e) {
            throw new InvalidAttributeValueException("Not parsable roles in attributes " + attributes + ", " + e, e);
        }
        long[] roleIds = lr.getRegularRoles();

        long[] defaultOrganizationIds = null; // do nothing
        long[] organizationIds = getMultiValAttr(attributes, ATTR_ORGANIZATION_IDS, defaultOrganizationIds);

        //not implemented now, only support to sitest
        long[] groupIds = lr.getSites();
        long[] userGroupIds = null; // do nothing

        UserGroupRoleSoap[] userGroupRoles = lr.getUserGroupRoles(origUser.getUserId());

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

        Map<String, Object> customValues = getCustomValues(attributes);

        try {
            String newPassword = null; // set upper over method updatePassword(...)
            ServiceContext serviceContext = new ServiceContext();

            LOG.ok("updateUser args in updateUser: userId:{0}, passwordReset:{1}, " +
                            "reminderQueryQuestion:{2}, reminderQueryAnswer:{3}, screenName:{4}, emailAddress:{5}, facebookId:{6}, openId:{7}, " +
                            "languageId:{8}, timeZoneId:{9}, greeting:{10}, comments:{11}, firstName:{12}, middleName:{13}, lastName:{14}, prefixId:{15}, suffixId:{16}, " +
                            "male:{17}, birthdayMonth:{18}, birthdayDay:{19}, birthdayYear:{20}, smsSn:{21}, aimSn:{22}, facebookSn:{23}, icqSn:{24}, jabberSn:{25}, msnSn:{26}, " +
                            "mySpaceSn:{27}, skypeSn:{28}, twitterSn:{29}, ymSn:{30}, jobTitle:{31}, groupIds:{32}, organizationIds:{33}, roleIds:{34}, userGroupRoles:{35}, userGroupIds:{36}",
                    origUser.getUserId(), passwordReset,
                    reminderQueryQuestion, reminderQueryAnswer, screenName, emailAddress, facebookId, openId,
                    languageId, timeZoneId, greeting, comments, firstName, middleName, lastName, prefixId, suffixId,
                    male, birthdayMonth, birthdayDay, birthdayYear, smsSn, aimSn, facebookSn, icqSn, jabberSn, msnSn,
                    mySpaceSn, skypeSn, twitterSn, ymSn, jobTitle, Arrays.toString(groupIds), Arrays.toString(organizationIds), Arrays.toString(roleIds),
                    LiferayRoles.userGroupRolesToString(userGroupRoles), Arrays.toString(userGroupIds));

            userService.updateUser(origUser.getUserId(), password, newPassword, newPassword, passwordReset,
                    reminderQueryQuestion, reminderQueryAnswer, screenName, emailAddress, facebookId, openId,
                    languageId, timeZoneId, greeting, comments, firstName, middleName, lastName, prefixId, suffixId,
                    male, birthdayMonth, birthdayDay, birthdayYear, smsSn, aimSn, facebookSn, icqSn, jabberSn, msnSn,
                    mySpaceSn, skypeSn, twitterSn, ymSn, jobTitle, groupIds, organizationIds, roleIds, userGroupRoles, userGroupIds,
                    /*addresses, emailAddresses, phones, websites, announcementsDelivers,*/
                    serviceContext);

            // de/activate user if needed
            updateStatus(origUser.getUserId(), attributes);

            updateCustomValues(customValues, origUser.getUserId());

        } catch (java.rmi.RemoteException e) {
            throw new ConnectorIOException(e.getMessage(), e);
        }

        return uid;
    }

    private Uid updateOrganization(Uid uid, Set<Attribute> attributes) {
        LOG.ok("updateOrganization, Uid: {0}, attributes: {1}", uid, attributes);
        if (attributes == null || attributes.isEmpty()) {
            LOG.ok("update ignored, nothing changed");
            return uid;
        }

        Long targetOrgId = toLong(uid);

        OrganizationSoap origOrg;
        try {
            origOrg = organizationService.getOrganization(targetOrgId);
        } catch (java.rmi.RemoteException e) {
            throw new ConnectorIOException(e.getMessage(), e);
        }
        if (origOrg == null) {
            throw new UnknownUidException("Organization with ID " + targetOrgId + " does not exist");
        }

        String name = getStringAttr(attributes, ATTR_ORG_NAME, origOrg.getName());
        if (StringUtil.isBlank(name)) {
            throw new InvalidAttributeValueException("Missing mandatory attribute "+ATTR_ORG_NAME);
        }

        String type = getStringAttr(attributes, ATTR_ORG_TYPE, origOrg.getType());
        String parentOrganization = getStringAttr(attributes, ATTR_ORG_PARENT_ORGANIZATION_ID, String.valueOf(origOrg.getParentOrganizationId()), true);
        long parentOrganizationId = Long.valueOf(parentOrganization);
        long regionId = getAttr(attributes, ATTR_ORG_REGION_ID, Long.class, origOrg.getRegionId());
        long countryId = getAttr(attributes, ATTR_ORG_COUNTRY_ID, Long.class, origOrg.getCountryId());
        int statusId = getAttr(attributes, ATTR_ORG_STATUS_ID, Integer.class, origOrg.getStatusId());
        String comments = getStringAttr(attributes, ATTR_ORG_COMMENTS, origOrg.getComments());
        boolean recursable = getAttr(attributes, ATTR_ORG_RECURSABLE, Boolean.class, origOrg.isRecursable());

        try {
            LOG.ok("updateOrganization: parentOrganizationId: {0}, name: {1}, type: {2}, regionId: {3}, countryId: {4}, statusId: {5}, comments: {6}, organizationId: {7}, recursable: {8}",
                    parentOrganizationId, name, type, regionId, countryId, statusId, comments, origOrg.getOrganizationId(), recursable);

            organizationService.updateOrganization(origOrg.getOrganizationId(), parentOrganizationId, name, type, recursable, regionId, countryId, statusId, comments, configuration.getAssociateOrganizationWithMainSite(), null);

        } catch (java.rmi.RemoteException e) {
            throw new ConnectorIOException(e.getMessage(), e);
        }

        return uid;
    }


    @Override
    public FilterTranslator<LiferayFilter> createFilterTranslator(ObjectClass objectClass, OperationOptions options) {
        return new LiferayFilterTranslator();
    }

    @Override
    public void executeQuery(ObjectClass objectClass, LiferayFilter query, ResultsHandler handler, OperationOptions options) {

        if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {
            try {
                boolean contactsToGet = contactsToGet(options);
                boolean rolesToGet = attrToGet(options, ATTR_ROLES);
                boolean organizationsToGet = attrToGet(options, ATTR_ORGANIZATION_IDS);
                List<String> customFieldsToGet = attrsToGet(options, configuration.getCustomFieldNames());

                LOG.ok("executeQuery: {0}, options: {1}, contactsToGet: {2}, rolesToGet: {3}, organizationsToGet: {4}, customFieldsToGet: {5} ", query, options, contactsToGet, rolesToGet, organizationsToGet, customFieldsToGet);
                // find by screenName
                if (query != null && query.byName != null) {
                    UserSoap user = userService.getUserByScreenName(configuration.getCompanyId(), query.byName);
                    ConnectorObject connectorObject = convertUserToConnectorObject(user, contactsToGet, rolesToGet, organizationsToGet, customFieldsToGet);
                    handler.handle(connectorObject);

                    //find by Uid (user Primary Key)
                } else if (query != null && query.byUid != null) {
                    UserSoap user = userService.getUserById(query.byUid);
                    ConnectorObject connectorObject = convertUserToConnectorObject(user, contactsToGet, rolesToGet, organizationsToGet, customFieldsToGet);
                    handler.handle(connectorObject);

                    //find by emailAddress
                } else if (query != null && query.byEmailAddress != null) {
                    UserSoap user = userService.getUserByEmailAddress(configuration.getCompanyId(), query.byEmailAddress);
                    ConnectorObject connectorObject = convertUserToConnectorObject(user, contactsToGet, rolesToGet, organizationsToGet, customFieldsToGet);
                    handler.handle(connectorObject);

                    // find all
                } else {
                    UserSoap[] users;
                    int userCount = userService.getCompanyUsersCount(configuration.getCompanyId());
                    LOG.ok("Number of users in liferay: {0}", userCount);
                    users = userService.getCompanyUsers(configuration.getCompanyId(), 0, userCount);

                    int count = 0;
                    for (UserSoap user : users) {
                        if (++count % 10 == 0) {
                            LOG.ok("executeQuery: processing {0}. of {1} users", count, userCount);
                        }
                        ConnectorObject connectorObject = convertUserToConnectorObject(user, contactsToGet, rolesToGet, organizationsToGet, customFieldsToGet);
                        boolean finish = !handler.handle(connectorObject);
                        if (finish)
                            break;
                    }
                }

            } catch (java.rmi.RemoteException e) {
                throw new ConnectorIOException(e.getMessage(), e);
            }
        } else if (objectClass.is(ORGANIZATION_NAME)) {
            try {

                LOG.ok("executeQuery: {0}, options: {1}", query, options);
                // find by org name
                if (query != null && query.byName != null) {
                    long orgId = organizationService.getOrganizationId(configuration.getCompanyId(), query.byName);
                    OrganizationSoap org = organizationService.getOrganization(orgId);
                    ConnectorObject connectorObject = convertOrganizationToConnectorObject(org);
                    handler.handle(connectorObject);

                    //find by Uid (org Primary Key)
                } else if (query != null && query.byUid != null) {
                    OrganizationSoap org = organizationService.getOrganization(query.byUid);
                    ConnectorObject connectorObject = convertOrganizationToConnectorObject(org);
                    handler.handle(connectorObject);

                    //find by parentUid (user Primary Key)
                } else if (query != null && query.byParentUid != null) {
                    OrganizationSoap[] orgs = organizationService.getOrganizations(configuration.getCompanyId(), query.byParentUid);
                    int count = 0;
                    for (OrganizationSoap org : orgs) {
                        if (++count % 10 == 0) {
                            LOG.ok("executeQuery: processing {0}. of {1} organizations", count, orgs.length);
                        }
                        ConnectorObject connectorObject = convertOrganizationToConnectorObject(org);
                        boolean finish = !handler.handle(connectorObject);
                        if (finish)
                            break;
                    }

                    // find all - traverse
                } else {

                    List<OrganizationSoap> allOrgs = new LinkedList<OrganizationSoap>();
                    getChilds(ATTR_ORG_ROOT_ORGANIZATION_ID, allOrgs, handler);
                }

            } catch (java.rmi.RemoteException e) {
                throw new ConnectorIOException(e.getMessage(), e);
            }
        } else {
            throw new UnsupportedOperationException("Unsupported object class " + objectClass);
        }
    }

    private void getChilds(long parentOrgId, List<OrganizationSoap> ret, ResultsHandler handler) throws RemoteException {
        LOG.ok("reading Suborganizations for ID: {0}, actualSize: {1} ", parentOrgId, ret.size());
        OrganizationSoap[] orgs = organizationService.getOrganizations(configuration.getCompanyId(), parentOrgId);

        for (OrganizationSoap org : orgs) {
            ret.add(org);
            ConnectorObject connectorObject = convertOrganizationToConnectorObject(org);
            boolean finish = !handler.handle(connectorObject);
            if (finish)
                return;
        }

        for (OrganizationSoap org : orgs) {
            getChilds(org.getOrganizationId(), ret, handler);
        }
    }

    private boolean contactsToGet(OperationOptions options) {
        if (options == null) {
            // not configured, get all data
            return true;
        }
        String[] attrsToGet = options.getAttributesToGet();
        if (attrsToGet == null) {
            // not configured, get all data
            return true;
        }
        for (String attrToGet : attrsToGet) {
            ObjectClassInfo objectClassInfo = schemaAccount();
            Set<AttributeInfo> attributeInfos = objectClassInfo.getAttributeInfo();
            for (AttributeInfo attributeInfo : attributeInfos) {
                if (!attributeInfo.isReturnedByDefault() && attributeInfo.getName().equals(attrToGet)
                        && !ATTR_ROLES.equals(attrToGet)
                        && !ATTR_ORGANIZATION_IDS.equals(attrToGet)
                        && configuration.getCustomFieldNames() != null && !configuration.getCustomFieldNames().contains(attrToGet))
                    return true;
            }
        }

        return false;
    }

    private boolean attrToGet(OperationOptions options, String attribute) {
        if (options == null) {
            // not configured, get all data
            return true;
        }
        String[] attrsToGet = options.getAttributesToGet();
        if (attrsToGet == null) {
            // not configured, get all data
            return true;
        }
        for (String attrToGet : attrsToGet) {
            if (attribute.equals(attrToGet)) {
                return true;
            }
        }

        return false;
    }

    private List<String> attrsToGet(OperationOptions options, Set<String> attributes) {
        List<String> ret = new LinkedList<String>();
        if (attributes != null) {
            for (String attrName : attributes) {
                boolean attrToGet = attrToGet(options, attrName);
                if (attrToGet) {
                    ret.add(attrName);
                }
            }
        }
        return ret;
    }


    @Override
    public void sync(ObjectClass objectClass, SyncToken token, SyncResultsHandler handler, OperationOptions options) {
        if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {    // __ACCOUNT__
            syncAccount(token, handler, options);
        }else if (objectClass.is(ORGANIZATION_NAME)) {
            //TODO: implement when needed
            throw new UnsupportedOperationException("Synchronization Organizations not supported now");
        } else {
            throw new UnsupportedOperationException("Unsupported object class " + objectClass);
        }
    }

    private void syncAccount(SyncToken token, SyncResultsHandler handler, OperationOptions options) {
        LOG.ok("syncAccount, token: {0}, options: {1}", token, options);
        Date fromToken = null;
        if (token != null) {
            Object fromTokenValue = token.getValue();
            if (fromTokenValue instanceof Long) {
                fromToken = new Date((Long) fromTokenValue);
            } else {
                LOG.warn("Synchronization token is not long, ignoring");
            }
        }

        try {
            boolean contactsToGet = contactsToGet(options);
            boolean rolesToGet = attrToGet(options, ATTR_ROLES);
            boolean organizationsToGet = attrToGet(options, ATTR_ORGANIZATION_IDS);
            List<String> customFieldsToGet = attrsToGet(options, configuration.getCustomFieldNames());

            int userCount = userService.getCompanyUsersCount(configuration.getCompanyId());
            LOG.ok("number of users in Liferay to synchronize: {0}, contactsToGet: {1}, rolesToGet: {2}, organizationsToGet: {3}, customFieldsToGet: {4}",
                    userCount, contactsToGet, rolesToGet, organizationsToGet, customFieldsToGet);
            UserSoap[] users = userService.getCompanyUsers(configuration.getCompanyId(), 0, userCount);


            int changed = 0;
            for (UserSoap user : users) {
                Calendar lastModification = getLastModification(user);

                // synchronization needed
                if (fromToken == null || lastModification.getTime().after(fromToken)) {
                    if (++changed % 10 == 0) {
                        LOG.ok("syncAccount: processing {0}. of {1} users", changed, userCount);
                    }

                    SyncDeltaBuilder deltaBuilder = new SyncDeltaBuilder();
                    SyncToken deltaToken = toSyncToken(lastModification.getTime());
                    deltaBuilder.setToken(deltaToken);

                    // all users are updated or created, we can differentiate create from update over
                    // user.getCreateDate().after(fromToken), but it's not necessary to do this
                    SyncDeltaType deltaType = SyncDeltaType.CREATE_OR_UPDATE;

                    ConnectorObject targetObject = convertUserToConnectorObject(user, contactsToGet, rolesToGet, organizationsToGet, customFieldsToGet);
                    deltaBuilder.setObject(targetObject);
                    deltaBuilder.setUid(toUid(user.getUserId()));

                    deltaBuilder.setDeltaType(deltaType);

                    handler.handle(deltaBuilder.build());
                }
            }
            LOG.ok("{0} user(s) changed in Liferay from date {1}", changed, fromToken);
        } catch (RemoteException e) {
            throw new ConnectorIOException(e.getMessage(), e);
        }
    }

    @Override
    public SyncToken getLatestSyncToken(ObjectClass objectClass) {
        if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {    // __ACCOUNT__
            return getLatestSyncAccountToken();
        } else {
            throw new UnsupportedOperationException("Unsupported object class " + objectClass);
        }
    }

    private SyncToken getLatestSyncAccountToken() {
        Date lastChange = null;
        UserSoap lastChangedUser = null;
        try {
            int userCount = userService.getCompanyUsersCount(configuration.getCompanyId());
            UserSoap[] users = userService.getCompanyUsers(configuration.getCompanyId(), 0, userCount);

            for (UserSoap user : users) {
                Calendar lastModification = getLastModification(user);

                if (lastChange == null) {
                    lastChange = lastModification.getTime();
                    lastChangedUser = user;
                } else if (lastModification.getTime().after(lastChange)) {
                    lastChange = lastModification.getTime();
                    lastChangedUser = user;
                }
            }
        } catch (RemoteException e) {
            throw new ConnectorIOException(e.getMessage(), e);
        }

        LOG.ok("getLatestSyncAccountToken, last change was {0} on user {1} ", lastChange, lastChangedUser != null ? lastChangedUser.getScreenName() : null);

        if (lastChange == null)
            return null;

        return toSyncToken(lastChange);
    }

    private SyncToken toSyncToken(Date date) {
        if (date == null)
            return null;

        return new SyncToken(date.getTime());
    }

    private Calendar getLastModification(UserSoap user) {
        Calendar created = user.getCreateDate();

        // not changed when change user state :( - TODO
        // not changed when password modified (we use passwordModified for)
        Calendar modified = user.getModifiedDate();

        Calendar passwordModified = user.getPasswordModifiedDate();
        //after a specified number of failed logins (Password Policy, User Account Lockout)
//        user.getLockoutDate(); // not relevant, unlocking is automatized
//        user.getLastFailedLoginDate(); // not relevant
//        user.getLastLoginDate(); // not relevant
//        user.getLoginDate()// not relevant

        Calendar ret = created;

        if (modified.getTime().after(ret.getTime()))
            ret = modified;

        if (passwordModified != null && passwordModified.getTime().after(ret.getTime()))
            ret = passwordModified;

        return ret;
    }

    private ConnectorObject convertUserToConnectorObject(UserSoap user, boolean contactsToGet, boolean rolesToGet, boolean organizationsToGet, List<String> customFieldsToGet) throws RemoteException {
        ContactSoap contact = null;
        if (contactsToGet) {
            LOG.ok("starting reading contact from Liferay...");
            contact = contactService.getContact(user.getContactId());
        }
        LiferayRoles liferayRoles = null;
        if (rolesToGet) {
            LOG.ok("starting reading roles from Liferay...");
            liferayRoles = new LiferayRoles(user.getUserId(), roleService, groupService);
        }
        OrganizationSoap organizations[] = null;
        if (organizationsToGet) {
            LOG.ok("starting reading organizations from Liferay...");
            organizations = organizationService.getUserOrganizations(user.getUserId());
        }
        Map<String, String> customValues = null;
        if (!customFieldsToGet.isEmpty()) {
            LOG.ok("starting reading custom fields from Liferay...");
            customValues = LiferayExpando.getValues(expandoValueService, configuration.getCompanyId(), user.getUserId(), customFieldsToGet, this.configuration.getIgnoreJSONException());
        }

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
        addAttr(builder, ATTR_PASSWORD_RESET, user.isPasswordReset());

        if (contact != null) {
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
        }

        if (liferayRoles != null) {
            builder.addAttribute(AttributeBuilder.build(ATTR_ROLES, liferayRoles.getValues()));
        }

        if (organizations != null) {
            List<String> organizationsIds = new ArrayList<String>(organizations.length);
            for (OrganizationSoap organization : organizations) {
                organizationsIds.add(String.valueOf(organization.getOrganizationId()));
            }

            builder.addAttribute(AttributeBuilder.build(ATTR_ORGANIZATION_IDS, organizationsIds));
        }

        if (customValues != null && !customValues.isEmpty()) {
            for (String attr : customValues.keySet()) {
                String value = customValues.get(attr);
                Class liferayType = configuration.getCustomFieldType(attr);
                builder.addAttribute(AttributeBuilder.build(attr, LiferayExpando.convertToConnectorValue(value, liferayType)));
            }
        }


        boolean enable = ATTR_STATUS_ENABLED == user.getStatus() ? true : false;
        addAttr(builder, OperationalAttributes.ENABLE_NAME, enable);

        // password from Liferay are supported only when liferay configured as: passwords.encryption.algorithm=NONE
        if (!user.isPasswordEncrypted()) {

            GuardedString guardedPass = null;
            if (user.getPassword() != null)
                guardedPass = new GuardedString(user.getPassword().toCharArray());

            addAttr(builder, OperationalAttributes.PASSWORD_NAME, guardedPass);
        }

        // available interesting attributes: user.getModifiedDate(), user.getPasswordModifiedDate()

        ConnectorObject connectorObject = builder.build();
        LOG.ok("convertUserToConnectorObject, user: {0}:{1}, enable: {2}, " +
                        "\n\tconnectorObject: {3}, " +
                        "\n\tliferayRoles: {4}," +
                        "\n\torganizations: {5}," +
                        "\n\tcustomValues: {6}",
                user.getUserId(), user.getScreenName(), enable, connectorObject, liferayRoles, toString(organizations), customValues);
        return connectorObject;
    }

    private ConnectorObject convertOrganizationToConnectorObject(OrganizationSoap org) throws RemoteException {

        ConnectorObjectBuilder builder = new ConnectorObjectBuilder();
        builder.setUid(toUid(org.getOrganizationId()));
        builder.setName(org.getName());
        addAttr(builder, ATTR_ORG_TYPE, org.getType());
        addAttr(builder, ATTR_ORG_PARENT_ORGANIZATION_ID, String.valueOf(org.getParentOrganizationId()));
        addAttr(builder, ATTR_ORG_RECURSABLE, org.isRecursable());
        addAttr(builder, ATTR_ORG_REGION_ID, org.getRegionId());
        addAttr(builder, ATTR_ORG_COUNTRY_ID, org.getCountryId());
        addAttr(builder, ATTR_ORG_STATUS_ID, org.getStatusId());
        addAttr(builder, ATTR_ORG_COMMENTS, org.getComments());

        ConnectorObject connectorObject = builder.build();
        LOG.ok("convertOrganizationToConnectorObject, organization: {0}:{1}, type: {2}, " +
                        "parentId: {3}, regionId: {4}, countryId: {5}, status: {6}, comment: {7}, Recursable: {8}",
                org.getOrganizationId(), org.getName(), org.getType(), org.getParentOrganizationId(), org.getRegionId()
                , org.getCountryId(), org.getStatusId(), org.getComments(), org.isRecursable());

        return connectorObject;
    }

    private String toString(OrganizationSoap[] organizations) {
        if (organizations == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[");
        for (OrganizationSoap org : organizations) {
            sb.append("{" + org.getOrganizationId() + ":" + org.getName() + "}, ");
        }
        sb.append("]");

        return sb.toString();
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

    private long[] getMultiValAttr(Set<Attribute> attributes, String attrName, long[] defaultVal) {
        for (Attribute attr : attributes) {
            if (attrName.equals(attr.getName())) {
                List<Object> vals = attr.getValue();
                if (vals == null || vals.isEmpty()) {
                    // set empty value
                    return new long[0];
                }
                long[] ret = new long[vals.size()];
                for (int i = 0; i < vals.size(); i++) {
                    Object valAsObject = vals.get(i);
                    if (valAsObject == null)
                        throw new InvalidAttributeValueException("Value " + null + " must be not null for attribute " + attrName);

                    Long val;
                    if (valAsObject instanceof String) {
                        val = Long.parseLong((String) valAsObject);
                    } else {
                        val = (Long) valAsObject;
                    }
                    ret[i] = val;
                }
                return ret;
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

    private Long toLong(Uid uid) {
        return Long.parseLong(uid.getUidValue());
    }

    private Uid toUid(long uid) {
        return new Uid((new Long(uid)).toString());
    }

    public Map<String, Object> getCustomValues(Set<Attribute> attributes) {

        Map<String, Object> customValues = new HashMap<String, Object>();

        if (this.configuration.getCustomFieldNames() != null) {
            for (String customFieldName : this.configuration.getCustomFieldNames()) {
                Class liferayType = this.configuration.getCustomFieldType(customFieldName);
                Class connectorType = LiferayExpando.liferayType2connectorType(liferayType);
                Object connectorValue = getAttr(attributes, customFieldName, connectorType);
                Object liferayValue = LiferayExpando.convertToLiferayValue(connectorValue, liferayType);

                // set custom field when is in Attribute Set (because null values)
                for (Attribute attr : attributes) {
                    if (customFieldName.equals(attr.getName())) {
                        LOG.ok("getCustomValues, customFieldName: {0}, liferayType: {1}, connectorType: {2}, connectorValue: {3}, liferayValue: {4} ", customFieldName, liferayType, connectorType, connectorValue, liferayValue);
                        customValues.put(customFieldName, liferayValue);
                    }
                }
            }
        }
        return customValues;
    }

    private boolean updateCustomValues(Map<String, Object> customValues, long userId) throws RemoteException {
        boolean callExpando = false;
        if (!customValues.isEmpty()) {
            for (String fieldName : customValues.keySet()) {
                Object value = customValues.get(fieldName);
                expandoValueService.addValue(this.configuration.getCompanyId(), LiferayExpando.LIFERAY_USER_CLASSNAME,
                        LiferayExpando.LIFERAY_TABLE_NAME, fieldName, userId, value);
                callExpando = true;
            }
        }
        return callExpando;
    }

    @Override
    public void checkAlive() {
        test();
        // TODO quicker test?
    }
}
