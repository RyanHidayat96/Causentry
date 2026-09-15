package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbne implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbnh zzb;

    zzbne(zzbnh zzbnhVar, zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
        Objects.requireNonNull(zzbnhVar);
        this.zzb = zzbnhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzm().zzd(this.zza);
    }
}
