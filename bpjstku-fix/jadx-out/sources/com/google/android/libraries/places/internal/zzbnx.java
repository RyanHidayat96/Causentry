package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnx implements Runnable {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1254815943;
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbls zzb;
    final /* synthetic */ zzbip zzc;
    final /* synthetic */ zzbny zzd;

    zzbnx(zzbny zzbnyVar, zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        this.zza = zzbjvVar;
        this.zzb = zzblsVar;
        this.zzc = zzbipVar;
        Objects.requireNonNull(zzbnyVar);
        this.zzd = zzbnyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzf().zzc(this.zza, this.zzb, this.zzc);
    }
}
