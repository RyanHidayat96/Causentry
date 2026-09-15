package com.google.android.libraries.places.internal;

import android.app.Application;
import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpj implements ViewModelProvider.Factory {
    final /* synthetic */ Application zza;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return new zzpw(this.zza);
    }

    zzpj(Application application) {
        this.zza = application;
    }
}
