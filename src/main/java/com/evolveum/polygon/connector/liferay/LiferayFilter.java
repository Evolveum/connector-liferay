package com.evolveum.polygon.connector.liferay;

import org.identityconnectors.framework.common.objects.Uid;

/**
 * Created by gpalos on 6. 5. 2015.
 */
public class LiferayFilter {
    public String byName;
    public Long byUid;
    public String byEmailAddress;

    @Override
    public String toString() {
        return "LiferayFilter{" +
                "byName='" + byName + '\'' +
                ", byUid=" + byUid +
                ", byEmailAddress='" + byEmailAddress + '\'' +
                '}';
    }
}
