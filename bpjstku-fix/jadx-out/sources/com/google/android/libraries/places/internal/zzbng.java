package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbng {
    final zzbhy zza;
    final zzbjv zzb;

    private zzbng(zzbhy zzbhyVar, zzbjv zzbjvVar) {
        this.zza = zzbhyVar;
        this.zzb = zzbjvVar;
    }

    /* synthetic */ zzbng(zzbhy zzbhyVar, zzbjv zzbjvVar, byte[] bArr) {
        this(null, null);
    }

    public final zzbng zza(zzbhy zzbhyVar) {
        return new zzbng(zzbhyVar, this.zzb);
    }

    public final zzbng zzb(zzbjv zzbjvVar) {
        return new zzbng(this.zza, zzbjvVar);
    }
}
