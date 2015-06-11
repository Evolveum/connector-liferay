package com.evolveum.polygon.connector.liferay;

/**
 * Created by gpalos on 6. 5. 2015.
 */
public class LiferayFilter {
    public String byName;
    public Long byUid;
    public Long byParentUid;
    public String byEmailAddress;

    @Override
    public String toString() {
        return "LiferayFilter{" +
                "byName='" + byName + '\'' +
                ", byUid=" + byUid +
                ", byParentUid=" + byParentUid +
                ", byEmailAddress='" + byEmailAddress + '\'' +
                '}';
    }
}
