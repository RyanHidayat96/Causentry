package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbve implements Runnable {
    final /* synthetic */ zzbvi zza;

    zzbve(zzbvi zzbviVar) {
        Objects.requireNonNull(zzbviVar);
        this.zza = zzbviVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvl zzbvlVar = this.zza.zzb;
        zzbvlVar.zzae(true);
        zzbuy zzbuyVarZzV = zzbvlVar.zzV();
        zzbuy zzbuyVarZzV2 = zzbvlVar.zzV();
        zzbvlVar.zzY().zzc(zzbvlVar.zzV().zza(), zzbuyVarZzV2.zzb(), zzbuyVarZzV.zzc());
    }
}
