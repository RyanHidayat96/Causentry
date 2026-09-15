package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbuq implements Runnable {
    final /* synthetic */ zzbvl zza;

    zzbuq(zzbvl zzbvlVar) {
        Objects.requireNonNull(zzbvlVar);
        this.zza = zzbvlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar.zzad()) {
            return;
        }
        zzbvlVar.zzY().zzd();
    }
}
