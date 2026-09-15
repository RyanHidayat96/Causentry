package com.google.android.libraries.places.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzof {
    public static final Parcelable zza(Bundle bundle, String str, Class cls) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(str, cls) : bundle.getParcelable(str);
        if (parcelable != null) {
            return parcelable;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
