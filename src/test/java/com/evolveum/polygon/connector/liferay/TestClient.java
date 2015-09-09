/*
 * Copyright (c) 2010-2015 Evolveum
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
import com.evolveum.polygon.connector.liferay.group.GroupSoap;
import com.evolveum.polygon.connector.liferay.organization.OrganizationServiceSoap;
import com.evolveum.polygon.connector.liferay.organization.OrganizationServiceSoapServiceLocator;
import com.evolveum.polygon.connector.liferay.organization.OrganizationSoap;
import com.evolveum.polygon.connector.liferay.role.RoleServiceSoap;
import com.evolveum.polygon.connector.liferay.role.RoleServiceSoapServiceLocator;
import com.evolveum.polygon.connector.liferay.role.RoleSoap;
import com.evolveum.polygon.connector.liferay.user.*;
import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.objects.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Element;

import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestClient {

    private static final Log LOG = Log.getLog(TestClient.class);

    public static final long COMPANY_ID = 20155L; // id in my instance
    //public static final String HOST = "http://test:test@localhost:8080/api/axis/";
//    public static final String HOST = "http://midpoint%40liferay.sk:heslo123@localhost:4480/api/axis/";
//    public static final String HOST = "http://midpoint@liferay.sk:heslo123@localhost:4480/api/axis/";
    public static final String HOST = "http://localhost:4480/api/axis/";

    private static String URL_USER_SERVICE = HOST + LiferayConnector.SERVICE_USERSERVICE;
    private static String URL_CONTACT_SERVICE = HOST + LiferayConnector.SERVICE_CONTACTSERVICE;
    private static String URL_EXPANDOVALUE_SERVICE = HOST + LiferayConnector.SERVICE_EXPANDOVALUESERVICE;
    private static String URL_ROLE_SERVICE = HOST + LiferayConnector.SERVICE_ROLESERVICE;
    private static String URL_ORGANIZATION_SERVICE = HOST + LiferayConnector.SERVICE_ORGANIZATIONSERVICE;
    private static String URL_GROUP_SERVICE = HOST + LiferayConnector.SERVICE_GROUPSERVICE;
    private static UserServiceSoap userSoap;
    private static ContactServiceSoap contactSoap;
    private static RoleServiceSoap roleSoap;
    private static ExpandoValueServiceSoap expandoValueSoap;
    private static OrganizationServiceSoap organizationSoap;
    private static GroupServiceSoap groupSoap;


    @BeforeClass
    public static void setUp() throws Exception {
        // Locate the User service
        UserServiceSoapServiceLocator locatorUser = new UserServiceSoapServiceLocator();
        userSoap = locatorUser.getPortal_UserService(new URL(URL_USER_SERVICE));

        ContactServiceSoapServiceLocator locatorContact = new ContactServiceSoapServiceLocator();
        contactSoap = locatorContact.getPortal_ContactService(new URL(URL_CONTACT_SERVICE));

        ExpandoValueServiceSoapServiceLocator locatorExpandoValuue = new ExpandoValueServiceSoapServiceLocator();
        expandoValueSoap = locatorExpandoValuue.getPortlet_Expando_ExpandoValueService(new URL(URL_EXPANDOVALUE_SERVICE));

        RoleServiceSoapServiceLocator locatorRole = new RoleServiceSoapServiceLocator();
        roleSoap = locatorRole.getPortal_RoleService(new URL(URL_ROLE_SERVICE));

        OrganizationServiceSoapServiceLocator locatorOrganization = new OrganizationServiceSoapServiceLocator();
        organizationSoap = locatorOrganization.getPortal_OrganizationService(new URL(URL_ORGANIZATION_SERVICE));

        GroupServiceSoapServiceLocator locatorGroup = new GroupServiceSoapServiceLocator();
        groupSoap = locatorGroup.getPortal_GroupService(new URL(URL_GROUP_SERVICE));

    }

    @Test
    public void testOrganizationRoles() throws Exception {
        String user = "midpoint@liferay.sk";
        String password = "XXX";

        ((Stub)userSoap)._setProperty(Call.USERNAME_PROPERTY, user);
        ((Stub)userSoap)._setProperty(Call.PASSWORD_PROPERTY, password);

        ((Stub)organizationSoap)._setProperty(Call.USERNAME_PROPERTY, user);
        ((Stub)organizationSoap)._setProperty(Call.PASSWORD_PROPERTY, password);

        ((Stub)roleSoap)._setProperty(Call.USERNAME_PROPERTY, user);
        ((Stub)roleSoap)._setProperty(Call.PASSWORD_PROPERTY, password);

        ((Stub)groupSoap)._setProperty(Call.USERNAME_PROPERTY, user);
        ((Stub)groupSoap)._setProperty(Call.PASSWORD_PROPERTY, password);


        UserSoap u = userSoap.getUserByEmailAddress(COMPANY_ID, "midpoint@liferay.sk");
        System.out.println("User: " + u);

        int userCount = userSoap.getCompanyUsersCount(COMPANY_ID);
        System.out.println("User count: " + userCount);

        long userId = 23644; //mspRedaktorId = 23701; mspadmin=23644

        GroupSoap orgGroup = groupSoap.getGroup(COMPANY_ID, "MSP LFR_ORGANIZATION");
        System.out.println("orgGroup.getPrimaryKey() = " + orgGroup.getPrimaryKey());
        System.out.println("orgGroup.getName() = " + orgGroup.getName());
        
        GroupSoap[] orgGroups = groupSoap.getUserOrganizationsGroups(userId, 0, -1);
        for (GroupSoap og : orgGroups) {
            System.out.println("og.getName() = " + og.getName());
            System.out.println("og.getType() = " + og.getType());
            System.out.println("og.getPrimaryKey() = " + og.getPrimaryKey());

            RoleSoap[] orgRoles = roleSoap.getUserGroupRoles(userId, og.getGroupId());
            for (RoleSoap roleSoap : orgRoles) {
                System.out.println("    roleSoap.getName() = " + roleSoap.getName());
                System.out.println("    roleSoap.getRoleId() = " + roleSoap.getRoleId());
                System.out.println("    roleSoap.getType() = " + roleSoap.getType());
            }
        }
        

        OrganizationSoap[] orgs = organizationSoap.getOrganizations(COMPANY_ID, 0/*root*/);
        for (OrganizationSoap org : orgs) {
            System.out.println("org.getType() = " + org.getType());
            System.out.println("org.getName() = " + org.getName());
            System.out.println("org.getOrganizationId() = " + org.getOrganizationId());


            RoleSoap[] orgRoles = roleSoap.getUserGroupRoles(userId, org.getOrganizationId());
            for (RoleSoap role : orgRoles) {
                System.out.println("    role.getRoleId() = " + role.getRoleId());
                System.out.println("    role.getName() = " + role.getName());
            }
        }

        //long[] ogrs = new long[] {23738}; // MSP
        long[] ogrs = new long[] {}; // MSP
        long[] roleIds = new long[] {};// bez regular role
        long siteId = 23739;//MSP LFR_ORGANIZATION
        long[] groupIds = new long[] {siteId};
        long[] userGroupIds = null;

        UserGroupRoleSoap[] userGroupRoles = new UserGroupRoleSoap[1];
        UserGroupRoleSoap ugr = new UserGroupRoleSoap();
        long userID = 24700;
        ugr.setUserId(userID);
        ugr.setGroupId(siteId);
        ugr.setRoleId(20167); // Organization Administrator
        userGroupRoles[0] = ugr;

        userSoap.updateUser(userID, null, null, null, false, "", "", "mspadminevo",
                "mspadmin@evolveum.com", 1l, "", "", "", "", "",
                "msp", "", "Admin evolveum", 0, 0, true, 3, 22, 1981,
                "", "", "", "", "", "", "", "", "", "",
                "", groupIds, ogrs, roleIds, userGroupRoles, userGroupIds, new ServiceContext());

//        LiferayConfiguration config = new LiferayConfiguration();
//        config.setCompanyId(TestClient.COMPANY_ID);
//        config.setEndpoint(TestClient.HOST);
//        config.setUsername(user);
//        config.setPlainPassword(password);
//
//        LiferayConnector lc = new LiferayConnector();
//        lc.init(config);
//        lc.test();
//        ObjectClass objectClass = new ObjectClass(ObjectClass.ACCOUNT_NAME);
//        Set<Attribute> attributesUpdate = new HashSet<Attribute>();
//        attributesUpdate.add(AttributeBuilder.build("roles", "Organization Administrator,3,MSP LFR_ORGANIZATION"));
//
//        Uid userUid = new Uid("24700");
//        lc.update(objectClass, userUid, attributesUpdate, null);


    }

    @Test
    public void testCRUDOperations() throws Exception {

        // list of users
        int userCount = userSoap.getCompanyUsersCount(COMPANY_ID);
        System.out.println("User count: " + userCount);
        UserSoap[] users = userSoap.getCompanyUsers(COMPANY_ID, 0, userCount);
        for (UserSoap user : users)
            System.out.println("\t" + user.getPrimaryKey() + ": " + user.getScreenName());

        // create user
        int rand = new Random().nextInt();
        String screenName = "randomScreenName." + rand;
        long groupIds[] = null;
        long organizationIds[] = null; // root
        long roleIds[] = null; //{20162};// admin
        long userGroupIds[] = null;


        ServiceContext serviceContext = new ServiceContext();

        UserSoap newUser = userSoap.addUser(COMPANY_ID, false, "password", "password",
                false, screenName, screenName + "@liferay.com", 0L, "", null,
                "firstName_" + rand, "middleName_" + rand, "lastName_" + rand, 0, 0, true, 3, 22, 1981,
                "Identity Engineer", groupIds, organizationIds, roleIds, userGroupIds, false,
                serviceContext);

        LOG.ok("new user created: " + newUser.getPrimaryKey() + ": " + newUser.getScreenName());


        //update user
        UserGroupRoleSoap[] userGroupRoles = null;
        userSoap.updateUser(newUser.getPrimaryKey(), "password", null, null, false, "", "", newUser.getScreenName(),
                newUser.getEmailAddress(), 1l, "", "", "", "", "",
                newUser.getFirstName(), newUser.getMiddleName(), newUser.getLastName(), 0, 0, true, 3, 22, 1981,
                "", "", "", "", "", "", "", "", "", "",
                newUser.getJobTitle(), groupIds, organizationIds, roleIds, userGroupRoles, userGroupIds, serviceContext);

        LOG.ok("new user updated: " + newUser.getPrimaryKey() + ": " + newUser.getScreenName());


        // activate user
        int enabledStatus = 0;
        userSoap.updateStatus(newUser.getPrimaryKey(), enabledStatus, serviceContext);
        LOG.ok("user activated: " + newUser.getPrimaryKey() + ": " + newUser.getScreenName());

        // delete new user
        userSoap.deleteUser(newUser.getPrimaryKey());
        LOG.ok("user deleted: " + newUser.getPrimaryKey() + ": " + newUser.getScreenName());

    }

    @Test
    public void testConnectorCRUDOperations() throws Exception {
        LiferayConfiguration config = new LiferayConfiguration();
        config.setCompanyId(TestClient.COMPANY_ID);
        config.setEndpoint(TestClient.HOST);

        LiferayConnector lc = new LiferayConnector();
        lc.init(config);

        //test
        lc.test();

        //create
        ObjectClass objectClass = new ObjectClass(ObjectClass.ACCOUNT_NAME);

        /*
        Set<Attribute> attributes = new HashSet<Attribute>();
        String randName = "random-22201"; //"random"+(new Random()).nextInt();
        attributes.add(AttributeBuilder.build("emailAddress", randName + "@evolveom.com"));
        attributes.add(AttributeBuilder.build(Name.NAME, randName));
        attributes.add(AttributeBuilder.build("firstName", randName));
        GuardedString gs = new GuardedString("test".toCharArray());
//        attributes.add(AttributeBuilder.build(OperationalAttributeInfos.PASSWORD.getName(), gs));
        attributes.add(AttributeBuilder.build("locale", "hu_HU"));
        attributes.add(AttributeBuilder.build("passwordReset", false));

        Uid userUid = lc.create(objectClass, attributes, null);
//        LOG.ok("New user Uid is: {0}, name: {1}", userUid.getUidValue(), randName);


        GuardedString gsNew = new GuardedString("test2".toCharArray());
//        attributes.add(AttributeBuilder.build(OperationalAttributeInfos.PASSWORD.getName(), gsNew));
        attributes.add(AttributeBuilder.build("locale", "en_US"));
        //update without password ??

//        Set<Attribute> attributesUpdate = new HashSet<Attribute>();
//        Uid userUid = new Uid("22201");
//        lc.update(objectClass, userUid, attributesUpdate, null);


        // delete
        //lc.delete(objectClass, userUid, null);
        */

    }


    @Test
    public void testConnectorQueryOperation() throws Exception {
        LiferayConfiguration config = new LiferayConfiguration();
        config.setCompanyId(TestClient.COMPANY_ID);
        config.setEndpoint(TestClient.HOST);

        LiferayConnector lc = new LiferayConnector();
        lc.init(config);

        //create
        ObjectClass objectClass = new ObjectClass(ObjectClass.ACCOUNT_NAME);


        ResultsHandler rh = new ResultsHandler() {
            @Override
            public boolean handle(ConnectorObject connectorObject) {
                System.out.println(connectorObject);
                return true;
            }
        };

        // searchByUId
        LiferayFilter searchByUid = new LiferayFilter();
        searchByUid.byUid = 20199l;
        lc.executeQuery(objectClass, searchByUid, rh, null);

        // searchByScreenName
        LiferayFilter searchByName = new LiferayFilter();
        searchByName.byName = "test";
        lc.executeQuery(objectClass, searchByName, rh, null);

        // searchByEMail
        LiferayFilter searchByEmail = new LiferayFilter();
        searchByEmail.byEmailAddress = "test@liferay.com";
        lc.executeQuery(objectClass, searchByEmail, rh, null);

        // searchAll
        lc.executeQuery(objectClass, null, rh, null);
    }

    @Test
    public void testgetAllContacts() throws Exception {
        UserSoap user = userSoap.getUserById(20199l);
        long contactId = user.getContactId();
        System.out.println("contactId = " + contactId);
        ContactSoap contact = contactSoap.getContact(contactId);

        long classNameId = contact.getClassNameId();
        long classPK = contact.getClassPK();
        long primaryKey = contact.getPrimaryKey();
        long userPK = user.getPrimaryKey();
        System.out.println("contact.getCompanyId() = " + contact.getCompanyId());
        System.out.println("TestClient.COMPANY_ID = " + TestClient.COMPANY_ID);
        System.out.println("userPK = " + userPK);
        System.out.println("primaryKey = " + primaryKey);
        System.out.println("classNameId = " + classNameId);
        System.out.println("classPK = " + classPK);
//
//
//        user = userSoap.getUserById(22515l);
//        contactId = user.getContactId();
//        System.out.println("contactId = " + contactId);
//        contact = contactSoap.getContact(contactId);
//
//        classNameId = contact.getClassNameId();
//        classPK = contact.getClassPK();
//        userPK = user.getPrimaryKey();
//        System.out.println("userPK = " + userPK);
//        System.out.println("primaryKey = " + primaryKey);
//        System.out.println("classNameId = " + classNameId);
//        System.out.println("classPK = " + classPK);

        ContactSoap[] contacts = contactSoap.getContacts(classNameId, classPK, -1, -1, null);
        System.out.println("contacts.length = " + contacts.length);
    }

    @Test
    public void testPrintUserDetails() throws Exception {
        UserSoap u = userSoap.getUserById(22828l);

        if (u != null)
            System.out.println("UserSoap{" +
                    "agreedToTermsOfUse=" + u.isAgreedToTermsOfUse() +
                    ", comments='" + u.getComments() + '\'' +
                    ", companyId=" + u.getCompanyId() +
                    ", contactId=" + u.getContactId() +
                    ", createDate=" + u.getCreateDate() +
                    ", defaultUser=" + u.isDefaultUser() +
                    ", digest='" + u.getDigest() + '\'' +
                    ", emailAddress='" + u.getEmailAddress() + '\'' +
                    ", emailAddressVerified=" + u.isEmailAddressVerified() +
                    ", facebookId=" + u.getFacebookId() +
                    ", failedLoginAttempts=" + u.getFailedLoginAttempts() +
                    ", firstName='" + u.getFirstName() + '\'' +
                    ", graceLoginCount=" + u.getGraceLoginCount() +
                    ", greeting='" + u.getGreeting() + '\'' +
                    ", jobTitle='" + u.getJobTitle() + '\'' +
                    ", languageId='" + u.getLanguageId() + '\'' +
                    ", lastFailedLoginDate=" + u.getLastFailedLoginDate() +
                    ", lastLoginDate=" + u.getLastLoginDate() +
                    ", lastLoginIP='" + u.getLastLoginIP() + '\'' +
                    ", lastName='" + u.getLastName() + '\'' +
                    ", ldapServerId=" + u.getLdapServerId() +
                    ", lockout=" + u.isLockout() +
                    ", lockoutDate=" + u.getLockoutDate() +
                    ", loginDate=" + u.getLoginDate() +
                    ", loginIP='" + u.getLoginIP() + '\'' +
                    ", middleName='" + u.getMiddleName() + '\'' +
                    ", modifiedDate=" + u.getModifiedDate() +
                    ", openId='" + u.getOpenId() + '\'' +
                    ", password='" + u.getPassword() + '\'' +
                    ", passwordEncrypted=" + u.isPasswordEncrypted() +
                    ", passwordModifiedDate=" + u.getPasswordModifiedDate() +
                    ", passwordReset=" + u.isPasswordReset() +
                    ", portraitId=" + u.getPortraitId() +
                    ", primaryKey=" + u.getPrimaryKey() +
                    ", reminderQueryAnswer='" + u.getReminderQueryAnswer() + '\'' +
                    ", reminderQueryQuestion='" + u.getReminderQueryQuestion() + '\'' +
                    ", screenName='" + u.getScreenName() + '\'' +
                    ", status=" + u.getStatus() +
                    ", timeZoneId='" + u.getTimeZoneId() + '\'' +
                    ", userId=" + u.getUserId() +
                    ", uuid='" + u.getUuid() + '\'' +
                    '}');
    }

    @Test
    public void testConnectorSyncOperations() throws Exception {
        LiferayConfiguration config = new LiferayConfiguration();
        config.setCompanyId(TestClient.COMPANY_ID);
        config.setEndpoint(TestClient.HOST);

        LiferayConnector lc = new LiferayConnector();
        lc.init(config);

        ObjectClass objectClass = new ObjectClass(ObjectClass.ACCOUNT_NAME);

        SyncToken token = lc.getLatestSyncToken(objectClass);

        SyncResultsHandler handler = new SyncResultsHandler() {
            @Override
            public boolean handle(SyncDelta delta) {
                return false;
            }
        };
        lc.sync(objectClass, token, handler, null);

        Calendar cal = GregorianCalendar.getInstance();
        cal.set(2015, 4, 4);
        token = new SyncToken(cal.getTime().getTime());
        lc.sync(objectClass, token, handler, null);

        token = null;
        lc.sync(objectClass, token, handler, null);
    }

    @Test
    public void testExpandoValue() throws Exception {
        expandoValueSoap.addValue(COMPANY_ID, "com.liferay.portal.model.User", "CUSTOM_FIELDS", "CustomBoolean", 20542, Boolean.FALSE);
        String dataBool = expandoValueSoap.getJSONData(COMPANY_ID, "com.liferay.portal.model.User", "CUSTOM_FIELDS", "CustomBoolean", 20542);
        System.out.println("dataBool = " + dataBool);

        expandoValueSoap.addValue(COMPANY_ID, "com.liferay.portal.model.User", "CUSTOM_FIELDS", "CustomDate", 20542, new Date());
        String dataDate = expandoValueSoap.getJSONData(COMPANY_ID, "com.liferay.portal.model.User", "CUSTOM_FIELDS", "CustomDate", 20542);
        System.out.println("dataDate = " + dataDate);
    }

    @Test
    public void testConnectorCreateUser() {

        LiferayConfiguration config = new LiferayConfiguration();
        config.setCompanyId(TestClient.COMPANY_ID);
        config.setUsername("test");
        config.setPlainPassword("test");
        config.setEndpoint("http://localhost:8080/api/axis/");

        LiferayConnector lc = new LiferayConnector();
        lc.init(config);


        //create
        ObjectClass objectClass = new ObjectClass(ObjectClass.ACCOUNT_NAME);

        Set<Attribute> attributes = new HashSet<Attribute>();
        String randName = "random" + (new Random()).nextInt();
        attributes.add(AttributeBuilder.build("emailAddress", randName + "@evolveom.com"));
        attributes.add(AttributeBuilder.build(Name.NAME, randName));
        attributes.add(AttributeBuilder.build("firstName", randName));
        attributes.add(AttributeBuilder.build("facebookId", 12345l));
        attributes.add(AttributeBuilder.build("facebookSn", "facebookSn"));
        GuardedString gs = new GuardedString("test".toCharArray());
        attributes.add(AttributeBuilder.build(OperationalAttributeInfos.PASSWORD.getName(), gs));

        attributes.add(AttributeBuilder.build(OperationalAttributeInfos.ENABLE.getName(), true));

        Uid userUid = lc.create(objectClass, attributes, null);
        LOG.ok("New user Uid is: {0}, name: {1}", userUid.getUidValue(), randName);
    }


    @Test
    public void testGetRoles() throws RemoteException {
        RoleSoap testRole = roleSoap.getRole(TestClient.COMPANY_ID, "testRole");
        System.out.println("testRole.getRoleId() = " + testRole.getRoleId());
        RoleSoap powerUserRole = roleSoap.getRole(TestClient.COMPANY_ID, "Power User");
        System.out.println("powerUserRole.getRoleId() = " + powerUserRole.getRoleId());

        RoleSoap[] roles = roleSoap.getUserRoles(23511l);

        for (RoleSoap role : roles) {
            System.out.println("roles = " + role.getRoleId() + ": " + role.getName());
        }
    }

    @Test
    public void testuserGroupRoleUpdate() throws RemoteException {
        long[] ogrs = new long[] {23983};
        long[] roleIds = new long[] {20166};
        long siteId = 23906;
        long[] groupIds = new long[] {siteId};
        long[] userGroupIds = null;

        UserGroupRoleSoap[] userGroupRoles = new UserGroupRoleSoap[1];
        UserGroupRoleSoap ugr = new UserGroupRoleSoap();
//        long userID = 24221l;
        long userID = 23406;
        ugr.setUserId(userID);
        ugr.setGroupId(siteId);
        ugr.setRoleId(23905);
        userGroupRoles[0] = ugr;

        userSoap.updateUser(userID, null, null, null, false, "", "", "userrole01",
                "userrole01@evolveum.com", 1l, "", "", "", "", "",
                "userrole01", "", "userrole01", 0, 0, true, 3, 22, 1981,
                "", "", "", "", "", "", "", "", "", "",
                "", groupIds, ogrs, roleIds, userGroupRoles, userGroupIds, new ServiceContext());


    }

    @Test
    public void testOrganization() throws Exception {
        Long test2Org = 24200l;
        OrganizationSoap org = organizationSoap.getOrganization(23983l);
        System.out.println("org.getName() = " + org.getName());
        System.out.println("org.getType() = " + org.getType());
        System.out.println("org.getTreePath() = " + org.getTreePath());
        System.out.println("org.getParentOrganizationId() = " + org.getParentOrganizationId());
        System.out.println("org.getRegionId() = " + org.getRegionId());
        System.out.println("org.getCountryId() = " + org.getCountryId());
        System.out.println("org.getStatusId() = " + org.getStatusId());
        System.out.println("org.getComments() = " + org.getComments());
        System.out.println("org.isRecursable() = " + org.isRecursable()); // whether the permissions of the organization are to be inherited by its sub-organizations

        long rootOrganizationId =0;
        long regionId = 0;
        long countryId = 0;
        int statusId = 12017; // ListTypeConstants.ORGANIZATION_STATUS_DEFAULT
        String comments = null;
        boolean site = false; // create site
        String type = "regular-organization";
//        OrganizationSoap ret = organizationSoap.addOrganization(rootOrganizationId, "testOrg", type, regionId, countryId, statusId, comments, site, null);
//        System.out.println("ret.getOrganizationId() = " + ret.getOrganizationId());
//
//
//        updateOrganization(long organizationId, long parentOrganizationId, String name, String type, long regionId, long countryId, int statusId, String comments, boolean site, ServiceContext serviceContext)
//
//        getOrganizationId(long companyId, String name)

        LiferayConfiguration config = new LiferayConfiguration();
        config.setCompanyId(TestClient.COMPANY_ID);
        config.setEndpoint("http://localhost:8080/api/axis/");
        config.setUsername("test");
        config.setPlainPassword("test");

        LiferayConnector lc = new LiferayConnector();
        lc.init(config);

        //create
        ObjectClass objectClass = new ObjectClass(LiferayConnector.ORGANIZATION_NAME);
        Set<Attribute> attributes = new HashSet<Attribute>();
        String randName = "test"; //"random"+(new Random()).nextInt();
        attributes.add(AttributeBuilder.build(Name.NAME, randName));

        try {
//            Uid userUid = lc.create(objectClass, attributes, null);
//            LOG.ok("New org Uid is: {0}, name: {1}", userUid.getUidValue(), randName);
            OrganizationSoap ret = organizationSoap.addOrganization(rootOrganizationId, "testOrg", type, regionId, countryId, statusId, comments, site, null);
        }
        catch (Exception e) {
            System.out.println("e = " + e);
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("e.getLocalizedMessage() = " + e.getLocalizedMessage());
            System.out.println("e.getCause() = " + e.getCause());
            System.out.println("e.fillInStackTrace() = " + e.fillInStackTrace());
            System.out.println("e.getStackTrace() = " + e.getStackTrace());

            AxisFault af = (AxisFault) e;
            HandleAxisFault(af);
            System.out.println("af.getFaultDetails() = " + af.getFaultDetails());
            System.out.println("af.getFaultString() = " + af.getFaultString());
            System.out.println("af.getFaultCode() = " + af.getFaultCode());
            System.out.println("af.getFaultActor() = " + af.getFaultActor());
            System.out.println("af.dumpToString() = " + af.dumpToString());

//            e = java.rmi.RemoteException: There is another organization named testOrg
//            e.getMessage() = java.rmi.RemoteException: There is another organization named testOrg
//            e.getLocalizedMessage() = java.rmi.RemoteException: There is another organization named testOrg
//            e.getCause() = null
//            e.fillInStackTrace() = java.rmi.RemoteException: There is another organization named testOrg
//            e.getStackTrace() = [Ljava.lang.StackTraceElement;@59d69ffc
//                    sResult = Error: [0] AxisFault
//            faultCode: {http://schemas.xmlsoap.org/soap/envelope/}Server.userException
//            faultSubcode:
//            faultString: java.rmi.RemoteException: There is another organization named testOrg
//                faultActor:
//                faultNode:
//                faultDetail:
//                {http://xml.apache.org/axis/}hostname:RUKBIBUFNTB
//
//
//                Stack Trace: null
//                    af.getFaultDetails() = [Lorg.w3c.dom.Element;@1171fa02
//                    af.getFaultString() = java.rmi.RemoteException: There is another organization named testOrg
//                    af.getFaultCode() = {http://schemas.xmlsoap.org/soap/envelope/}Server.userException
//                    af.getFaultActor() = null
//                    af.dumpToString() = AxisFault
//                    faultCode: {http://schemas.xmlsoap.org/soap/envelope/}Server.userException
//                    faultSubcode:
//                    faultString: java.rmi.RemoteException: There is another organization named testOrg
//                        faultActor:
//                        faultNode:
//                        faultDetail:
//                        {http://xml.apache.org/axis/}hostname:RUKBIBUFNTB
        }


    }

    private static String HandleAxisFault(AxisFault af)
    {
        String sResult = null;


        //defaults
        String sErrorString = af.dumpToString();
        String sErrorCode = "0";
        String sStackTrace = null;


        Element[] details = af.getFaultDetails();
        if(details != null)
        {
            for(int i = 0; i < details.length; i++)
            {
                String elementName = details[i].getTagName();
                if(elementName.equals("MWSErrorString"))
                {
                    sErrorString = details[i].getAttribute("mws:String");
                }
                else if (elementName.equals("MWSErrorCode"))
                {
                    sErrorCode = details[i].getAttribute("mws:Code");
                }
                else if (elementName.equals("StackTrace"))
                {
                    sStackTrace = details[i].getAttribute("mws:String");
                }
            }
        }

        sResult = "Error: [" + sErrorCode + "] " + sErrorString + "\n";
        sResult += "\n" + "Stack Trace: " + sStackTrace;
        System.out.println("sResult = " + sResult);
        return sResult;
    } // end HandleAxisFault

    @Test
    public void testTraverse() throws RemoteException {

        List<OrganizationSoap> allOrgs = new LinkedList<OrganizationSoap>();
        getChild(0l, allOrgs);

        for (OrganizationSoap org : allOrgs) {
            System.out.println("org = " + org);
        }
//        System.out.println("allOrgs = " + allOrgs);
    }

    private void getChild(long parentOrgId, List<OrganizationSoap> ret) throws RemoteException {
        OrganizationSoap[] orgs = organizationSoap.getOrganizations(COMPANY_ID, parentOrgId);

        for (OrganizationSoap org : orgs) {
            ret.add(org);
        }

        for (OrganizationSoap org : orgs) {
            getChild(org.getOrganizationId(), ret);
        }
    }


    @Test
    public void testParseDate() throws RemoteException, ParseException {

        String target = "04.06.1975";
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Date result =  df.parse(target);
        System.out.println("result = " + result);
    }

    @Test
    public void testSplit() throws RemoteException, ParseException {

        String uid = "ROF_EXP_CAT|1|2015-01-07 00:00:00|UP_IT9";
//        uid = "ROF_EXP_CAT;1;2015-01-07 00:00:00;UP_IT9";
        List<String> pks = Arrays.asList(uid.split("\\|"));
        System.out.println("pks = " + pks);
        System.out.println("pks(0) = " + pks.get(0));

    }
}