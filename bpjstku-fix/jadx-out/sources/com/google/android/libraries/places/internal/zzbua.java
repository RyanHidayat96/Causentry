package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbua implements Runnable {
    final /* synthetic */ zzbub zza;

    /* synthetic */ zzbua(zzbub zzbubVar, byte[] bArr) {
        Objects.requireNonNull(zzbubVar);
        this.zza = zzbubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbub zzbubVar = this.zza;
        zzbtz zzbtzVar = new zzbtz(zzbubVar, null);
        zzbkd zzbkdVar = (zzbkd) zzbubVar.zze();
        zzbkdVar.zzb(zzbtzVar);
        zzbkdVar.zza();
    }
}
