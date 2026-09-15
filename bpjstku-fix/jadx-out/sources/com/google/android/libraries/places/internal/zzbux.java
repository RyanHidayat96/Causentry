package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbux implements Runnable {
    final zzbuv zza;
    final /* synthetic */ zzbvl zzb;

    zzbux(zzbvl zzbvlVar, zzbuv zzbuvVar) {
        Objects.requireNonNull(zzbvlVar);
        this.zzb = zzbvlVar;
        this.zza = zzbuvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvl zzbvlVar = this.zzb;
        zzbvj zzbvjVarZzq = zzbvlVar.zzq(zzbvlVar.zzQ().zze, false);
        if (zzbvjVarZzq == null) {
            return;
        }
        zzbvlVar.zzE().execute(new zzbuw(this, zzbvjVarZzq));
    }
}
