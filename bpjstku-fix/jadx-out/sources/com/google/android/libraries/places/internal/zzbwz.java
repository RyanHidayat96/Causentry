package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class zzbwz implements zzbzc {
    private static final Logger zza = Logger.getLogger(zzbxt.class.getName());
    private final zzbwy zzb;
    private final zzbzc zzc;
    private final zzbxw zzd = new zzbxw(Level.FINE, zzbxt.class);

    zzbwz(zzbwy zzbwyVar, zzbzc zzbzcVar) {
        if (zzbwyVar == null) {
            throw new NullPointerException("transportExceptionHandler");
        }
        this.zzb = zzbwyVar;
        if (zzbzcVar == null) {
            throw new NullPointerException("frameWriter");
        }
        this.zzc = zzbzcVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (IOException e2) {
            zza.logp(e2.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zza(zzbzo zzbzoVar) {
        this.zzd.zzd(2);
        try {
            this.zzc.zza(zzbzoVar);
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzb(int i, zzbyz zzbyzVar) {
        this.zzd.zzc(2, i, zzbyzVar);
        try {
            this.zzc.zzb(i, zzbyzVar);
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzc(boolean z, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (z) {
            this.zzd.zzg(2, j);
        } else {
            this.zzd.zzf(2, j);
        }
        try {
            this.zzc.zzc(z, i, i2);
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzd() {
        try {
            this.zzc.zzd();
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zze() {
        try {
            this.zzc.zze();
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzf(boolean z, boolean z2, int i, int i2, List list) {
        try {
            this.zzc.zzf(false, false, i, 0, list);
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final int zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzh(boolean z, int i, zzcbj zzcbjVar, int i2) {
        this.zzd.zza(2, i, zzcbjVar, i2, z);
        try {
            this.zzc.zzh(z, i, zzcbjVar, i2);
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzi(zzbzo zzbzoVar) {
        this.zzd.zze(2, zzbzoVar);
        try {
            this.zzc.zzi(zzbzoVar);
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzj(int i, zzbyz zzbyzVar, byte[] bArr) {
        this.zzd.zzi(2, 0, zzbyzVar, zzcbm.zzb(bArr));
        try {
            zzbzc zzbzcVar = this.zzc;
            zzbzcVar.zzj(0, zzbyzVar, bArr);
            zzbzcVar.zze();
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzk(int i, long j) {
        this.zzd.zzj(2, i, j);
        try {
            this.zzc.zzk(i, j);
        } catch (IOException e2) {
            this.zzb.zzg(e2);
        }
    }
}
