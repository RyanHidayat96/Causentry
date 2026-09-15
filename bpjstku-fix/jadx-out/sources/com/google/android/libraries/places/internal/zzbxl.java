package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxl extends zzbpk {
    final /* synthetic */ zzbxt zza;

    zzbxl(zzbxt zzbxtVar) {
        Objects.requireNonNull(zzbxtVar);
        this.zza = zzbxtVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbpk
    protected final void zzd() {
        this.zza.zzD().zzc(true);
    }

    @Override // com.google.android.libraries.places.internal.zzbpk
    protected final void zze() {
        this.zza.zzD().zzc(false);
    }
}
