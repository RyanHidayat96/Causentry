package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmx implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbip zzb;
    final /* synthetic */ zzbmz zzc;

    zzbmx(zzbmz zzbmzVar, zzbjv zzbjvVar, zzbip zzbipVar) {
        this.zza = zzbjvVar;
        this.zzb = zzbipVar;
        Objects.requireNonNull(zzbmzVar);
        this.zzc = zzbmzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzf().zzc(this.zza, this.zzb);
    }
}
