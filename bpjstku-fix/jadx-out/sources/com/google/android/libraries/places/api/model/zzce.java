package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes4.dex */
final class zzce extends zzn {
    public static final Parcelable.Creator<zzce> CREATOR = new zzcd();

    zzce(LatLng latLng, double d) {
        super(latLng, d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getCenter(), i);
        parcel.writeDouble(getRadius());
    }
}
