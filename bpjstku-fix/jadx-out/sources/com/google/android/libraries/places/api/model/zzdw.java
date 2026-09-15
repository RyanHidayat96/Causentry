package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
final class zzdw extends zzbc {
    public static final Parcelable.Creator<zzdw> CREATOR = new zzdv();

    zzdw(boolean z, boolean z2, boolean z3, boolean z4) {
        super(z, z2, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(isTollAvoided() ? 1 : 0);
        parcel.writeInt(isHighwayAvoided() ? 1 : 0);
        parcel.writeInt(isFerryAvoided() ? 1 : 0);
        parcel.writeInt(isIndoorAvoided() ? 1 : 0);
    }
}
