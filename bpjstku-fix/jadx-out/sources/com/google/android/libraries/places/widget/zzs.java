package com.google.android.libraries.places.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzs implements Parcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzr();
    private final List zza;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public zzs(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzs) && Intrinsics.areEqual(this.zza, ((zzs) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(list).length() + 31);
        sb.append("ParcelableContentList(content=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List list = this.zza;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((PlaceDetailsFragment.Content) it.next()).name());
        }
    }

    public final List zza() {
        return this.zza;
    }
}
