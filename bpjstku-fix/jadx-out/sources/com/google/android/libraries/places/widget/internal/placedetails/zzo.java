package com.google.android.libraries.places.widget.internal.placedetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzaiw;
import com.google.android.libraries.places.internal.zzaiz;
import com.google.android.libraries.places.internal.zzajb;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        zzajb zzajbVar = (zzajb) Enum.valueOf(zzajb.class, parcel.readString());
        zzaiz zzaizVar = (zzaiz) Enum.valueOf(zzaiz.class, parcel.readString());
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 != i; i2++) {
            arrayList.add((zzaiw) Enum.valueOf(zzaiw.class, parcel.readString()));
        }
        return new zzp(zzajbVar, zzaizVar, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }
}
