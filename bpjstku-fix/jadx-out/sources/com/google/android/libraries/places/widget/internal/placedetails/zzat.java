package com.google.android.libraries.places.widget.internal.placedetails;

import android.app.Application;
import androidx.p002lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzat {
    public static final ViewModelProvider.Factory zza(Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return new zzas(application);
    }
}
