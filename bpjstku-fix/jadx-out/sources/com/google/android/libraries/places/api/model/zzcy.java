package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class zzcy extends zzaf {
    public static final Parcelable.Creator<zzcy> CREATOR = new zzcx();

    zzcy(String str, Long l, Integer num) {
        super(str, l, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getCurrencyCode());
        parcel.writeLong(getUnits().longValue());
        parcel.writeInt(getNanos().intValue());
    }
}
