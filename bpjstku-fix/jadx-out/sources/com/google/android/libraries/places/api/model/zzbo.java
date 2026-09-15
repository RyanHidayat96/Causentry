package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class zzbo extends zzb {
    public static final Parcelable.Creator<zzbo> CREATOR = new zzbn();

    zzbo(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        super(booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getWheelchairAccessibleParking(), i);
        parcel.writeParcelable(getWheelchairAccessibleEntrance(), i);
        parcel.writeParcelable(getWheelchairAccessibleRestroom(), i);
        parcel.writeParcelable(getWheelchairAccessibleSeating(), i);
    }
}
