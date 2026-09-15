package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AccessibilityOptions implements Parcelable {

    public static abstract class Builder {
        public abstract AccessibilityOptions build();

        public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

        public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking();

        public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom();

        public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating();

        public abstract Builder setWheelchairAccessibleEntrance(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setWheelchairAccessibleParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setWheelchairAccessibleRestroom(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setWheelchairAccessibleSeating(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    public static Builder builder() {
        zza zzaVar = new zza();
        zzaVar.setWheelchairAccessibleEntrance(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaVar.setWheelchairAccessibleRestroom(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaVar.setWheelchairAccessibleParking(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaVar.setWheelchairAccessibleSeating(Place.BooleanPlaceAttributeValue.UNKNOWN);
        return zzaVar;
    }

    public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance();

    public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking();

    public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom();

    public abstract Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating();
}
