package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes5.dex */
final class zzcq extends zzy {
    public static final Parcelable.Creator<zzcq> CREATOR = new zzcp();

    zzcq(FuelPrice.FuelType fuelType, Money money, Instant instant) {
        super(fuelType, money, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getType(), i);
        parcel.writeParcelable(getPrice(), i);
        parcel.writeSerializable(getUpdateTime());
    }
}
