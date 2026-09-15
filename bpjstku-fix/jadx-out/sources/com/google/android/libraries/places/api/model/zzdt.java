package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
final class zzdt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readInt() == 0 ? parcel.readString() : null;
        String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
        String string3 = parcel.readInt() == 0 ? parcel.readString() : null;
        String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
        String string5 = parcel.readInt() == 0 ? parcel.readString() : null;
        double d = parcel.readDouble();
        return new zzdu(string, string2, string3, string4, string5, Double.valueOf(d), (AuthorAttribution) parcel.readParcelable(Review.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (Uri) parcel.readParcelable(Review.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdu[i];
    }

    zzdt() {
    }
}
