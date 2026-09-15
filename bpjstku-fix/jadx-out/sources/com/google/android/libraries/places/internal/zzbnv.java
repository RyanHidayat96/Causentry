package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbnv implements Runnable {
    final /* synthetic */ zzbny zza;

    zzbnv(zzbny zzbnyVar) {
        Objects.requireNonNull(zzbnyVar);
        this.zza = zzbnyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf().zzd();
    }
}
