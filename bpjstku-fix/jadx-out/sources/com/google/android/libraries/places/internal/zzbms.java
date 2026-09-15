package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbms implements Runnable {
    final /* synthetic */ zzbna zza;

    zzbms(zzbna zzbnaVar) {
        Objects.requireNonNull(zzbnaVar);
        this.zza = zzbnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzk().zzd();
    }
}
