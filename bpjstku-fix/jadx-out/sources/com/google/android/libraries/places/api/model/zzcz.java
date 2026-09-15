package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class zzcz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        OpeningHours.HoursType hoursType = (OpeningHours.HoursType) parcel.readParcelable(OpeningHours.class.getClassLoader());
        ArrayList arrayList = parcel.readArrayList(OpeningHours.class.getClassLoader());
        ArrayList arrayList2 = parcel.readArrayList(OpeningHours.class.getClassLoader());
        ArrayList arrayList3 = parcel.readArrayList(OpeningHours.class.getClassLoader());
        if (parcel.readInt() == 0) {
            boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
        } else {
            boolValueOf = null;
        }
        return new zzda(hoursType, arrayList, arrayList2, arrayList3, boolValueOf, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzda[i];
    }

    zzcz() {
    }
}
