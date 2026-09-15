package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ParkingOptions implements Parcelable {

    public static abstract class Builder {
        public abstract ParkingOptions build();

        public abstract Place.BooleanPlaceAttributeValue getFreeGarageParking();

        public abstract Place.BooleanPlaceAttributeValue getFreeParkingLot();

        public abstract Place.BooleanPlaceAttributeValue getFreeStreetParking();

        public abstract Place.BooleanPlaceAttributeValue getPaidGarageParking();

        public abstract Place.BooleanPlaceAttributeValue getPaidParkingLot();

        public abstract Place.BooleanPlaceAttributeValue getPaidStreetParking();

        public abstract Place.BooleanPlaceAttributeValue getValetParking();

        public abstract Builder setFreeGarageParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setFreeParkingLot(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setFreeStreetParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setPaidGarageParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setPaidParkingLot(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setPaidStreetParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setValetParking(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    public static Builder builder() {
        zzai zzaiVar = new zzai();
        zzaiVar.setFreeParkingLot(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaiVar.setPaidParkingLot(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaiVar.setFreeStreetParking(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaiVar.setPaidStreetParking(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaiVar.setValetParking(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaiVar.setFreeGarageParking(Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzaiVar.setPaidGarageParking(Place.BooleanPlaceAttributeValue.UNKNOWN);
        return zzaiVar;
    }

    public abstract Place.BooleanPlaceAttributeValue getFreeGarageParking();

    public abstract Place.BooleanPlaceAttributeValue getFreeParkingLot();

    public abstract Place.BooleanPlaceAttributeValue getFreeStreetParking();

    public abstract Place.BooleanPlaceAttributeValue getPaidGarageParking();

    public abstract Place.BooleanPlaceAttributeValue getPaidParkingLot();

    public abstract Place.BooleanPlaceAttributeValue getPaidStreetParking();

    public abstract Place.BooleanPlaceAttributeValue getValetParking();
}
