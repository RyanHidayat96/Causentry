package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzblo extends zzbmj {
    final /* synthetic */ zzblp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzblo(zzblp zzblpVar, zzcaz zzcazVar) {
        super(zzblpVar.zza.zzl());
        Objects.requireNonNull(zzblpVar);
        this.zza = zzblpVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbmj
    public final void zza() {
        zzblp zzblpVar = this.zza;
        if (zzblpVar.zzg() == null) {
            try {
                zzblpVar.zzf().zzd();
            } catch (Throwable th) {
                this.zza.zze(zzbjv.zzb.zzd(th).zze("Failed to call onReady."));
            }
        }
    }
}
