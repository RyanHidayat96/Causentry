package com.google.android.libraries.places.internal;

import defpackage.getContainerClass;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzjc implements getContainerClass {
    final /* synthetic */ zzjf zza;

    zzjc(zzjf zzjfVar) {
        Objects.requireNonNull(zzjfVar);
        this.zza = zzjfVar;
    }

    @Override // defpackage.getContainerClass
    public final /* synthetic */ void onSuccess(Object obj) {
        zzbdl zzbdlVar = (zzbdl) obj;
        long jZzc = zzbdlVar.zzc();
        final zzjf zzjfVar = this.zza;
        zzjfVar.zzd = Long.valueOf(jZzc & 4294967295L);
        zzjfVar.zze = zzbdlVar.zze();
        Long l = zzjfVar.zzd;
        if (l != null) {
            zzjfVar.zzf = zzjfVar.zzc(l.longValue());
        }
        zzbck zzbckVar = zzjfVar.zze;
        if (zzbckVar != null) {
            long jZzc2 = (zzbckVar.zzc() - 3600) - Instant.now().getEpochSecond();
            if (jZzc2 > 0) {
                zzjfVar.zzb.schedule(new Callable() { // from class: com.google.android.libraries.places.internal.zzjd
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzjfVar.zzb();
                    }
                }, jZzc2, TimeUnit.SECONDS);
            }
        }
    }

    @Override // defpackage.getContainerClass
    public final void onFailure(Throwable th) {
        zzjf zzjfVar = this.zza;
        zzjfVar.zzd = null;
        zzjfVar.zze = null;
        zzjfVar.zzf = null;
    }
}
