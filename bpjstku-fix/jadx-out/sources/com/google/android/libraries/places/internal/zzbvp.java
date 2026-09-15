package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbvp extends zzbjb {
    final /* synthetic */ zzbvq zza;
    private final zzbjb zzb;

    zzbvp(zzbvq zzbvqVar, zzbjb zzbjbVar) {
        Objects.requireNonNull(zzbvqVar);
        this.zza = zzbvqVar;
        this.zzb = zzbjbVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjb
    public final zzbjv zza(zzbjd zzbjdVar) {
        zzbjv zzbjvVarZza = this.zzb.zza(zzbjdVar);
        if (zzbjvVarZza.zzj()) {
            this.zza.zze().zzb();
            return zzbjvVarZza;
        }
        zzbvq zzbvqVar = this.zza;
        zzbvqVar.zze().zza(new zzbvo(zzbvqVar));
        return zzbjvVarZza;
    }
}
