package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmr implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbna zzb;

    zzbmr(zzbna zzbnaVar, int i) {
        this.zza = i;
        Objects.requireNonNull(zzbnaVar);
        this.zzb = zzbnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk().zzc(this.zza);
    }
}
