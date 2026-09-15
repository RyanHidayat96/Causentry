package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class zzbxa implements zzbzc {
    private final zzbzc zza;

    public zzbxa(zzbzc zzbzcVar) {
        if (zzbzcVar == null) {
            throw new NullPointerException("delegate");
        }
        this.zza = zzbzcVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public void zza(zzbzo zzbzoVar) throws IOException {
        this.zza.zza(zzbzoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public void zzb(int i, zzbyz zzbyzVar) throws IOException {
        this.zza.zzb(i, zzbyzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public void zzc(boolean z, int i, int i2) throws IOException {
        this.zza.zzc(z, i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zze() throws IOException {
        this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzf(boolean z, boolean z2, int i, int i2, List list) throws IOException {
        this.zza.zzf(false, false, i, 0, list);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final int zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzh(boolean z, int i, zzcbj zzcbjVar, int i2) throws IOException {
        this.zza.zzh(z, i, zzcbjVar, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzi(zzbzo zzbzoVar) throws IOException {
        this.zza.zzi(zzbzoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzj(int i, zzbyz zzbyzVar, byte[] bArr) throws IOException {
        this.zza.zzj(0, zzbyzVar, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzk(int i, long j) throws IOException {
        this.zza.zzk(i, j);
    }
}
