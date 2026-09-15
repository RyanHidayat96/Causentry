package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbpt implements Runnable {
    final /* synthetic */ zzbqg zza;

    zzbpt(zzbqg zzbqgVar) {
        Objects.requireNonNull(zzbqgVar);
        this.zza = zzbqgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbqg zzbqgVar = this.zza;
        zzbqgVar.zzo().zza(2, "Terminated");
        zzbrx zzbrxVar = ((zzbrt) zzbqgVar.zzl()).zzb.zzj;
        zzbrxVar.zzG().remove(zzbqgVar);
        zzbrxVar.zzW().zze(zzbqgVar);
        zzbrxVar.zzq();
    }
}
