package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbpq implements Runnable {
    final /* synthetic */ zzbpr zza;

    zzbpq(zzbpr zzbprVar) {
        Objects.requireNonNull(zzbprVar);
        this.zza = zzbprVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbqg zzbqgVar = this.zza.zzb;
        zzbqgVar.zzv(null);
        zzbqgVar.zzx(null);
        zzbqgVar.zzw().zzd(zzbjv.zzi.zze("InternalSubchannel closed transport due to address change"));
    }
}
