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
import com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueServiceSoap;
import com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueServiceSoapServiceLocator;
import com.evolveum.polygon.connector.liferay.organization.OrganizationServiceSoap;
import com.evolveum.polygon.connector.liferay.organization.OrganizationServiceSoapServiceLocator;
import com.evolveum.polygon.connector.liferay.organization.OrganizationSoap;
import com.evolveum.polygon.connector.liferay.role.RoleServiceSoap;
import com.evolveum.polygon.connector.liferay.role.RoleServiceSoapServiceLocator;
import com.evolveum.polygon.connector.liferay.role.RoleSoap;
import com.evolveum.polygon.connector.liferay.user.*;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.objects.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.*;

public class TestClient {

    private static final Log LOG = Log.getLog(TestClient.class);

    public static final long COMPANY_ID = 20155L; // id in my instance
    public static final String HOST = "http://test:test@localhost:8080/api/axis/";

    private static String URL_USER_SERVICE = HOST + LiferayConnector.SERVICE_USERSERVICE;
    private static String URL_CONTACT_SERVICE = HOST + LiferayConnector.SERVICE_CONTACTSERVICE;
    private static String URL_EXPANDOVALUE_SERVICE = HOST + LiferayConnector.SERVICE_EXPANDOVALUESERVICE;
    private static String URL_ROLE_SERVICE = HOST + LiferayConnector.SERVICE_ROLESERVICE;
    private static String URL_ORGANIZATION_SERVICE = HOST + LiferayConnector.SERVICE_ORGANIZATIONSERVICE;
    private static UserServiceSoap userSoap;
    private static ContactServiceSoap contactSoap;
    private static RoleServiceSoap roleSoap;
    private static ExpandoValueServiceSoap expandoValueSoap;
    private static OrganizationServiceSoap organizationSoap;


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

        long rootOrganizationId =0;
        long regionId = 0;
        long countryId = 0;
        int statusId = 12017; // ListTypeConstants.ORGANIZATION_STATUS_DEFAULT
        String comments = null;
        boolean site = false; // create site
        String type = "regular-organization";
        OrganizationSoap ret = organizationSoap.addOrganization(rootOrganizationId, "testOrg", type, regionId, countryId, statusId, comments, site, null);
        System.out.println("ret.getOrganizationId() = " + ret.getOrganizationId());
//
//
//        updateOrganization(long organizationId, long parentOrganizationId, String name, String type, long regionId, long countryId, int statusId, String comments, boolean site, ServiceContext serviceContext)
//
//        getOrganizationId(long companyId, String name)


    }
}