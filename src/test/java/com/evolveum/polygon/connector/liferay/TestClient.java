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

import com.evolveum.polygon.connector.liferay.user.*;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.common.security.GuardedString;
import org.identityconnectors.framework.common.objects.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.URL;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestClient {

    private static final Log LOG = Log.getLog(TestClient.class);

    public static final long COMPANY_ID = 20155L; // id in my instance
    public static final String HOST = "http://test:test@localhost:8080/api/axis/";

    private static String URL = HOST + LiferayConfiguration.SERVICE_USERSERVICE;
    private static UserServiceSoap userSoap;


    @BeforeClass
    public static void setUp() throws Exception {

        // Locate the User service
        UserServiceSoapServiceLocator locatorUser = new UserServiceSoapServiceLocator();
        userSoap = locatorUser.getPortal_UserService(new URL(URL));

    }

    @Test
    public void testCRUDOperations() throws Exception {

        // list of users
        int userCount = userSoap.getCompanyUsersCount(COMPANY_ID);
        System.out.println("User count: "+userCount);
        UserSoap[] users = userSoap.getCompanyUsers(COMPANY_ID, 0, userCount);
        for (UserSoap user : users)
            System.out.println("\t"+user.getPrimaryKey()+": "+user.getScreenName());

        // create user
        int rand = new Random().nextInt();
        String screenName = "randomScreenName."+rand;
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
        userSoap.updateStatus(newUser.getPrimaryKey(), 0, serviceContext);
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

        /*
        // delete
        lc.delete(objectClass, userUid, null);

        // searchAll
        ResultsHandler rh = new ResultsHandler() {
            @Override
            public boolean handle(ConnectorObject connectorObject) {
                System.out.println(connectorObject);
                return true;
            }
        };
        lc.executeQuery(objectClass, "", rh, null);*/
    }
}
