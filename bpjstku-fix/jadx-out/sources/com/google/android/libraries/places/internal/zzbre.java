package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbre implements Runnable {
    final /* synthetic */ zzbrf zza;

    zzbre(zzbrf zzbrfVar) {
        Objects.requireNonNull(zzbrfVar);
        this.zza = zzbrfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzn();
    }
}
