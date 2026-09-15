package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Duration;

/* JADX INFO: loaded from: classes6.dex */
final class zzcs extends zzz {
    public static final Parcelable.Creator<zzcs> CREATOR = new zzcr();

    zzcs(Duration duration, int i) {
        super(duration, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(getDuration());
        parcel.writeInt(getDistanceMeters());
    }
}
