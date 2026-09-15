package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbop implements zzblu {
    final zzbjv zza;
    private final zzbls zzb;

    zzbop(zzbjv zzbjvVar, zzbls zzblsVar) {
        if (!(!zzbjvVar.zzj())) {
            throw new IllegalArgumentException("error must not be OK");
        }
        this.zza = zzbjvVar;
        this.zzb = zzblsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzblu
    public final zzblr zzb(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbfp[] zzbfpVarArr) {
        return new zzboo(this.zza, this.zzb, zzbfpVarArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
