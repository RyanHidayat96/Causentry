package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class zzdd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzde((Place.BooleanPlaceAttributeValue) parcel.readParcelable(PaymentOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(PaymentOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(PaymentOptions.class.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel.readParcelable(PaymentOptions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzde[i];
    }

    zzdd() {
    }
}
