package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbsy implements Runnable {
    final /* synthetic */ zzbti zza;

    zzbsy(zzbti zzbtiVar) {
        Objects.requireNonNull(zzbtiVar);
        this.zza = zzbtiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbti zzbtiVar = this.zza;
        zzbtiVar.zzl(null);
        if (zzbtiVar.zzk().zzb()) {
            zzbtiVar.zzd();
        }
    }
}
