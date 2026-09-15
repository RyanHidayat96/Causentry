package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class zzdc extends zzaj {
    public static final Parcelable.Creator<zzdc> CREATOR = new zzdb();

    zzdc(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7) {
        super(booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getFreeParkingLot(), i);
        parcel.writeParcelable(getPaidParkingLot(), i);
        parcel.writeParcelable(getFreeStreetParking(), i);
        parcel.writeParcelable(getPaidStreetParking(), i);
        parcel.writeParcelable(getValetParking(), i);
        parcel.writeParcelable(getFreeGarageParking(), i);
        parcel.writeParcelable(getPaidGarageParking(), i);
    }
}
