package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmm implements Runnable {
    final /* synthetic */ StringBuilder zza;
    final /* synthetic */ zzbna zzb;

    zzbmm(zzbna zzbnaVar, StringBuilder sb) {
        this.zza = sb;
        Objects.requireNonNull(zzbnaVar);
        this.zzb = zzbnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzh(zzbjv.zzd.zze(this.zza.toString()), true);
    }
}
