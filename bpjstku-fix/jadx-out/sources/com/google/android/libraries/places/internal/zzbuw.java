package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzbuw implements Runnable {
    final /* synthetic */ zzbvj zza;
    final /* synthetic */ zzbux zzb;

    zzbuw(zzbux zzbuxVar, zzbvj zzbvjVar) {
        this.zza = zzbvjVar;
        Objects.requireNonNull(zzbuxVar);
        this.zzb = zzbuxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbuv zzbuvVar;
        boolean z;
        zzbux zzbuxVar = this.zzb;
        zzbvl zzbvlVar = zzbuxVar.zzb;
        synchronized (zzbvlVar.zzK()) {
            zzbuvVar = null;
            if (zzbuxVar.zza.zzc) {
                z = true;
            } else {
                zzbvlVar.zzR(zzbvlVar.zzQ().zzc(this.zza));
                if (zzbvlVar.zzz(zzbvlVar.zzQ()) && (zzbvlVar.zzO() == null || zzbvlVar.zzO().zza())) {
                    zzbuvVar = new zzbuv(zzbvlVar.zzK());
                    zzbvlVar.zzaa(zzbuvVar);
                } else {
                    zzbvlVar.zzR(zzbvlVar.zzQ().zzb());
                    zzbvlVar.zzaa(null);
                }
                z = false;
            }
        }
        if (z) {
            zzbvj zzbvjVar = this.zza;
            zzbvjVar.zza.zzf(new zzbvi(this.zzb.zzb, zzbvjVar));
            zzbvjVar.zza.zzl(zzbjv.zzb.zze("Unneeded hedging"));
            return;
        }
        if (zzbuvVar != null) {
            zzbvl zzbvlVar2 = this.zzb.zzb;
            zzbuvVar.zza(zzbvlVar2.zzG().schedule(new zzbux(zzbvlVar2, zzbuvVar), zzbvlVar2.zzI().zzb, TimeUnit.NANOSECONDS));
        }
        zzbux zzbuxVar2 = this.zzb;
        zzbuxVar2.zzb.zzx(this.zza);
    }
}
