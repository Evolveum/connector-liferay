package com.evolveum.polygon.connector.liferay;

import com.evolveum.polygon.connector.liferay.LiferayConnector;
import com.evolveum.polygon.connector.liferay.LiferayFilter;
import org.identityconnectors.common.logging.Log;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.Name;
import org.identityconnectors.framework.common.objects.Uid;
import org.identityconnectors.framework.common.objects.filter.AbstractFilterTranslator;
import org.identityconnectors.framework.common.objects.filter.EqualsFilter;

/**
 * Created by gpalos on 6. 5. 2015.
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
        }

        return null;            // not supported
    }
}
