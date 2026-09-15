package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxq implements Runnable {
    final /* synthetic */ zzbxt zza;

    zzbxq(zzbxt zzbxtVar) {
        Objects.requireNonNull(zzbxtVar);
        this.zza = zzbxtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbxt zzbxtVar = this.zza;
        zzbxtVar.zzI().execute(zzbxtVar.zzL());
        synchronized (zzbxtVar.zzG()) {
            zzbxtVar.zzW(Integer.MAX_VALUE);
            zzbxtVar.zzr();
        }
    }
}
