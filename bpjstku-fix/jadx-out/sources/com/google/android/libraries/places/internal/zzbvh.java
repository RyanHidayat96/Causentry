package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbvh implements Runnable {
    final /* synthetic */ zzbvi zza;

    zzbvh(zzbvi zzbviVar) {
        Objects.requireNonNull(zzbviVar);
        this.zza = zzbviVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvl zzbvlVar = this.zza.zzb;
        if (zzbvlVar.zzad()) {
            return;
        }
        zzbvlVar.zzY().zzd();
    }
}
