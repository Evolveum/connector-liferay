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
import org.identityconnectors.framework.common.objects.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.URL;
import java.util.*;

public class TestClient {

    private static final Log LOG = Log.getLog(TestClient.class);

    public static final long COMPANY_ID = 20155L; // id in my instance
    public static final String HOST = "http://test:test@localhost:8080/api/axis/";

    private static String URL_USER_SERVICE = HOST + LiferayConfiguration.SERVICE_USERSERVICE;
    private static String URL_CONTACT_SERVICE = HOST + LiferayConfiguration.SERVICE_CONTACTSERVICE;
    private static UserServiceSoap userSoap;
    private static ContactServiceSoap contactSoap;


    @BeforeClass
    public static void setUp() throws Exception {

        // Locate the User service
        UserServiceSoapServiceLocator locatorUser = new UserServiceSoapServiceLocator();
        userSoap = locatorUser.getPortal_UserService(new URL(URL_USER_SERVICE));

        ContactServiceSoapServiceLocator locatorContact = new ContactServiceSoapServiceLocator();
        contactSoap = locatorContact.getPortal_ContactService(new URL(URL_CONTACT_SERVICE));
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
        config.setHostUrl(TestClient.HOST);

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
        config.setHostUrl(TestClient.HOST);

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
        config.setHostUrl(TestClient.HOST);

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
        token = new SyncToken((Long) cal.getTime().getTime());
        lc.sync(objectClass, token, handler, null);

        token = null;
        lc.sync(objectClass, token, handler, null);
    }
}
