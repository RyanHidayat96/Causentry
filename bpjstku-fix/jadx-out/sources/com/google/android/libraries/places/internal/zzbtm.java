package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbtm implements Runnable {
    final /* synthetic */ zzbtn zza;

    zzbtm(zzbtn zzbtnVar) {
        Objects.requireNonNull(zzbtnVar);
        this.zza = zzbtnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb().zzc();
    }
}
