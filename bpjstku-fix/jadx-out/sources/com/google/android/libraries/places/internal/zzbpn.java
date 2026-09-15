package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbpn extends zzbpk {
    final /* synthetic */ zzbqg zza;

    zzbpn(zzbqg zzbqgVar) {
        Objects.requireNonNull(zzbqgVar);
        this.zza = zzbqgVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbpk
    protected final void zzd() {
        zzbqg zzbqgVar = this.zza;
        ((zzbrt) zzbqgVar.zzl()).zzb.zzj.zzf.zza(zzbqgVar, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbpk
    protected final void zze() {
        zzbqg zzbqgVar = this.zza;
        ((zzbrt) zzbqgVar.zzl()).zzb.zzj.zzf.zza(zzbqgVar, false);
    }
}
