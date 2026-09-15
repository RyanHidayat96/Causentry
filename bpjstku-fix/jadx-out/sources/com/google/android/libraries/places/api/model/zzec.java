package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
final class zzec extends zzbg {
    public static final Parcelable.Creator<zzec> CREATOR = new zzeb();

    zzec(Polyline polyline) {
        super(polyline);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getPolyline(), i);
    }
}
