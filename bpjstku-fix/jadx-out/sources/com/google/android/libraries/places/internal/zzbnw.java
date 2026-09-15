package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbnw implements Runnable {
    final /* synthetic */ zzbip zza;
    final /* synthetic */ zzbny zzb;

    zzbnw(zzbny zzbnyVar, zzbip zzbipVar) {
        this.zza = zzbipVar;
        Objects.requireNonNull(zzbnyVar);
        this.zzb = zzbnyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf().zza(this.zza);
    }
}
