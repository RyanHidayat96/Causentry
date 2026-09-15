package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmv implements Runnable {
    final /* synthetic */ zzbip zza;
    final /* synthetic */ zzbmz zzb;

    zzbmv(zzbmz zzbmzVar, zzbip zzbipVar) {
        this.zza = zzbipVar;
        Objects.requireNonNull(zzbmzVar);
        this.zzb = zzbmzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf().zza(this.zza);
    }
}
