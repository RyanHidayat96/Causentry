package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class zzdq extends zzaw {
    public static final Parcelable.Creator<zzdq> CREATOR = new zzdp();

    zzdq(Money money, Money money2) {
        super(money, money2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(zza(), i);
        parcel.writeParcelable(zzb(), i);
    }
}
