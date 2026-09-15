package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmy implements Runnable {
    final /* synthetic */ zzbmz zza;

    zzbmy(zzbmz zzbmzVar) {
        Objects.requireNonNull(zzbmzVar);
        this.zza = zzbmzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf().zzd();
    }
}
