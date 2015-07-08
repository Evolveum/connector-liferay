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

import com.evolveum.polygon.connector.liferay.expandovalue.ExpandoValueServiceSoap;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.framework.common.FrameworkUtil;
import org.identityconnectors.framework.common.exceptions.InvalidAttributeValueException;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author gpalos
 */
public class LiferayExpando {
    private static final Log LOG = Log.getLog(LiferayExpando.class);

    /**
     * Supported custom fields types
     */
    private static final Set<Class<?>> SUPPORTED_CUSTOM_FIELDS_TYPES;

    public static final String LIFERAY_USER_CLASSNAME = "com.liferay.portal.model.User";
    public static final String LIFERAY_TABLE_NAME = "CUSTOM_FIELDS";

    static {
        SUPPORTED_CUSTOM_FIELDS_TYPES = new HashSet<Class<?>>();

        SUPPORTED_CUSTOM_FIELDS_TYPES.addAll(FrameworkUtil.getAllSupportedAttributeTypes());

        SUPPORTED_CUSTOM_FIELDS_TYPES.add(Date.class);
    }

    public static boolean isSupportedCustomFieldType(final Class<?> clazz) {
        return SUPPORTED_CUSTOM_FIELDS_TYPES.contains(clazz);
    }

    protected static Class<?> liferayType2connectorType(Class<?> customFieldType) {
        if (customFieldType.getName().equals(Date.class.getName())) {
            return Long.class;
        }

        return customFieldType;
    }

    @SuppressWarnings("unchecked")
    public static <T> T convertToLiferayValue(Object connectorValue, Class<T> liferayType) {
        if (liferayType.getName().equals(Date.class.getName())) {
            Date val = null;
            if (connectorValue!=null) {
                val = new Date();
                val.setTime((Long) connectorValue);
            }
            return (T) val;
        }

        if (liferayType.isAssignableFrom(connectorValue.getClass())) {
            return (T)connectorValue;
        }

        throw new InvalidAttributeValueException("not supported conversion from value: "+connectorValue+" to type :"+liferayType);
    }

    private static final DateFormat dfJson = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH);

    public static Object convertToConnectorValue(String liferayValue, Class liferayType) {
        Class connectorType = liferayType2connectorType(liferayType);

        if (liferayValue == null)
            return null;

        if (connectorType.isAssignableFrom(String.class)) {
            return connectorType.cast(liferayValue);
        }

        if (liferayType.getName().equals(Date.class.getName())) {
            try {
                Date value = dfJson.parse(liferayValue);
                LOG.ok("converting value '" + liferayValue + "' from type '" + liferayType + "' to type '" + connectorType + "', result: " + value.getTime() + " (" + value + ")");
                return value.getTime();
            } catch (ParseException e) {
                throw new InvalidAttributeValueException("not parsable date: '" + liferayValue + "', connectorType: " + connectorType, e);
            }
        }

        throw new InvalidAttributeValueException("NOT supported conversion to '" + connectorType + "', value: " + liferayValue);
    }

    public static Map<String, String> getValues(ExpandoValueServiceSoap expandoValueService, long companyId, long userId, List<String> customFieldsToGet, boolean ignoreJSONException) throws RemoteException {
        Map<String, String> ret = new HashMap<String, String>();
        for (String field : customFieldsToGet) {
            try {
                String value = expandoValueService.getJSONData(companyId, LIFERAY_USER_CLASSNAME, LIFERAY_TABLE_NAME, field, userId);
                value = value.replace("{\"data\":\"", "").replace("\"}", "");
                //TODO: better conversion? example output: '{"data":"Thu Jan 01 00:00:00 GMT 1970"}'
                ret.put(field, value);
            } catch (RemoteException e) {
                if (ignoreJSONException && e.getMessage().contains("JSONException")) {
                    LOG.error("ignoreJSONException: "+e);
                }
                else {
                    throw e;
                }
            }
        }
        return ret;
    }


}
