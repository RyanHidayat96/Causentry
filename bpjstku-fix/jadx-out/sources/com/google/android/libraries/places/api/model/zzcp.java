package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes5.dex */
final class zzcp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzcq((FuelPrice.FuelType) parcel.readParcelable(FuelPrice.class.getClassLoader()), (Money) parcel.readParcelable(FuelPrice.class.getClassLoader()), (Instant) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcq[i];
    }

    zzcp() {
    }
}
