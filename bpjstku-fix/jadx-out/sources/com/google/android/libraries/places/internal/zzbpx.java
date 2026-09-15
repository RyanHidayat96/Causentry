package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbpx extends zzbor {
    final /* synthetic */ zzblr zza;
    final /* synthetic */ zzbpy zzb;

    zzbpx(zzbpy zzbpyVar, zzblr zzblrVar) {
        this.zza = zzblrVar;
        Objects.requireNonNull(zzbpyVar);
        this.zzb = zzbpyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbor, com.google.android.libraries.places.internal.zzblr
    public final void zzf(zzblt zzbltVar) {
        this.zzb.zzg().zza();
        this.zza.zzf(new zzbpw(this, zzbltVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbor
    protected final zzblr zze() {
        return this.zza;
    }
}
