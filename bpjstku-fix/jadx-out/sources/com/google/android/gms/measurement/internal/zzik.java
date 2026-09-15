package com.google.android.gms.measurement.internal;

import defpackage.Threads;
import defpackage.isBackgroundThread;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzik implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzjd zzd;

    zzik(zzjd zzjdVar, String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        Objects.requireNonNull(zzjdVar);
        this.zzd = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        zzjd zzjdVar = this.zzd;
        zzjdVar.zzL().zzZ();
        return zzjdVar.zzL().zzj().zzo(this.zza, this.zzb, this.zzc);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
        Threads.TuitionPaymentFragmentbindingInflater1[0] = isBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
    }
}
