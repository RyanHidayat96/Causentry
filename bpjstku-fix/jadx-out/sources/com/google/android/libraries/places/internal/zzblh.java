package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzblh {
    private final zzbwk zza;
    private final zzbqm zzb = zzbqn.zza();
    private final zzbqm zzc = zzbqn.zza();
    private final zzbqm zzd = zzbqn.zza();
    private volatile long zze;

    zzblh(zzbwk zzbwkVar) {
        this.zza = zzbwkVar;
    }

    public final void zza() {
        this.zzb.zza(1L);
        this.zze = this.zza.zza();
    }

    public final void zzb(boolean z) {
        if (z) {
            this.zzc.zza(1L);
        } else {
            this.zzd.zza(1L);
        }
    }
}
