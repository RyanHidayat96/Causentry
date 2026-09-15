package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbnd implements Runnable {
    final /* synthetic */ zzbsi zza;

    zzbnd(zzbnh zzbnhVar, zzbsi zzbsiVar) {
        this.zza = zzbsiVar;
        Objects.requireNonNull(zzbnhVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zze();
    }
}
