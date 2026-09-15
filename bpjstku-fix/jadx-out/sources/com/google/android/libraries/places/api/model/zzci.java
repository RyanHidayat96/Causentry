package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzci extends zzr {
    public static final Parcelable.Creator<zzci> CREATOR = new zzch();

    zzci(Integer num, List list) {
        super(num, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getConnectorCount().intValue());
        parcel.writeList(getConnectorAggregations());
    }
}
