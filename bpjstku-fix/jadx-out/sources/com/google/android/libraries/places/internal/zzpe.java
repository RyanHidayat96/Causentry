package com.google.android.libraries.places.internal;

import android.view.View;
import defpackage.Exif;
import defpackage.createDeviceContext;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzpe implements Runnable {
    private final /* synthetic */ zzpi zza;
    private final /* synthetic */ View zzb;

    /* synthetic */ zzpe(zzpi zzpiVar, View view) {
        this.zza = zzpiVar;
        this.zzb = view;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        zzpi zzpiVar = this.zza;
        View view = this.zzb;
        zzpiVar.zzk = (int) (view.getWidth() / view.getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Exif.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = createDeviceContext.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
    }
}
