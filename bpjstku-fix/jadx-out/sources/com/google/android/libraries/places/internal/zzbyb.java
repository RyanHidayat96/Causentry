package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbyb implements zzbwq {
    private final zzcbj zza;
    private int zzb;
    private int zzc;

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final void zza(byte[] bArr, int i, int i2) {
        this.zza.zzz(bArr, i, i2);
        this.zzb -= i2;
        this.zzc += i2;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final void zzb(byte b) {
        this.zza.zzA(b);
        this.zzb--;
        this.zzc++;
    }

    zzbyb(zzcbj zzcbjVar, int i) {
        this.zza = zzcbjVar;
        this.zzb = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final int zzd() {
        return this.zzc;
    }

    final zzcbj zze() {
        return this.zza;
    }
}
