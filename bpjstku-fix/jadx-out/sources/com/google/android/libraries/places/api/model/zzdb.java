package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class zzdb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzdc((Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(ParkingOptions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdc[i];
    }

    zzdb() {
    }
}
