package com.google.android.libraries.places.internal;

import android.app.Application;
import androidx.p002lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpk {
    public static final ViewModelProvider.Factory zza(Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return new zzpj(application);
    }
}
