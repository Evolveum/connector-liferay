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

import org.identityconnectors.common.logging.Log;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.Name;
import org.identityconnectors.framework.common.objects.Uid;
import org.identityconnectors.framework.common.objects.filter.AbstractFilterTranslator;
import org.identityconnectors.framework.common.objects.filter.EqualsFilter;

/**
 * @author gpalos
 */
public class LiferayFilterTranslator extends AbstractFilterTranslator<LiferayFilter> {
    private static final Log LOG = Log.getLog(LiferayFilterTranslator.class);

    @Override
    protected LiferayFilter createEqualsExpression(EqualsFilter filter, boolean not) {
        LOG.ok("createEqualsExpression, filter: {0}, not: {1}", filter, not);

        if (not) {
            return null;            // not supported
        }

        Attribute attr = filter.getAttribute();
        LOG.ok("attr.getName:  {0}, attr.getValue: {1}, Uid.NAME: {2}, Name.NAME: {3}", attr.getName(), attr.getValue(), Uid.NAME, Name.NAME);
        if (Name.NAME.equals(attr.getName())) {
            if (attr.getValue() != null && attr.getValue().get(0) != null) {
                LiferayFilter lf = new LiferayFilter();
                lf.byName = String.valueOf(attr.getValue().get(0));
                return lf;
            }
        } else if (Uid.NAME.equals(attr.getName())) {
            if (attr.getValue() != null && attr.getValue().get(0) != null) {
                LiferayFilter lf = new LiferayFilter();
                lf.byUid = Long.valueOf(String.valueOf(attr.getValue().get(0)));
                LOG.ok("lf.byUid: {0}, attr.getValue().get(0): {1}", lf.byUid, attr.getValue().get(0));
                return lf;
            }
        } else if (LiferayConnector.ATTR_EMAIL_ADDRESS.equals(attr.getName())) {
            if (attr.getValue() != null && attr.getValue().get(0) != null) {
                LiferayFilter lf = new LiferayFilter();
                lf.byEmailAddress = (String) attr.getValue().get(0);
                return lf;
            }
        } else if (LiferayConnector.ATTR_ORG_PARENT_ORGANIZATION_ID.equals(attr.getName())) {
            if (attr.getValue() != null && attr.getValue().get(0) != null) {
                LiferayFilter lf = new LiferayFilter();
                lf.byParentUid = Long.valueOf(String.valueOf(attr.getValue().get(0)));
                return lf;
            }
        }

        return null;            // not supported
    }
}
