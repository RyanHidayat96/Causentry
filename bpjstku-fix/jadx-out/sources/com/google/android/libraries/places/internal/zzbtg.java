package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class zzbtg extends zzbhy {
    final /* synthetic */ zzbti zza;
    private final zzbti zzb;
    private final AtomicBoolean zzc;

    zzbtg(zzbti zzbtiVar, zzbti zzbtiVar2) {
        Objects.requireNonNull(zzbtiVar);
        this.zza = zzbtiVar;
        this.zzc = new AtomicBoolean(false);
        if (zzbtiVar2 == null) {
            throw new NullPointerException("pickFirstLeafLoadBalancer");
        }
        this.zzb = zzbtiVar2;
    }

    @Override // com.google.android.libraries.places.internal.zzbhy
    public final zzbht zza(zzbhu zzbhuVar) {
        if (this.zzc.compareAndSet(false, true)) {
            zzbti zzbtiVar = this.zza;
            final zzbti zzbtiVar2 = this.zzb;
            zzbkd zzbkdVarZzd = zzbtiVar.zzi().zzd();
            Objects.requireNonNull(zzbtiVar2);
            zzbkdVarZzd.zzb(new Runnable() { // from class: com.google.android.libraries.places.internal.zzbtf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbtiVar2.zzd();
                }
            });
            zzbkdVarZzd.zza();
        }
        return zzbht.zzd();
    }
}
