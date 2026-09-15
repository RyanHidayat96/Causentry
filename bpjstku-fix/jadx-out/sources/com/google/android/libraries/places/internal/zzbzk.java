package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzk implements zzbzc {
    private final zzcbk zza;
    private final zzcbj zzb;
    private final zzbzf zzc;
    private int zzd;
    private boolean zze;

    zzbzk(zzcbk zzcbkVar, boolean z) {
        this.zza = zzcbkVar;
        zzcbj zzcbjVar = new zzcbj();
        this.zzb = zzcbjVar;
        this.zzc = new zzbzf(4096, false, zzcbjVar);
        this.zzd = 16384;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            this.zze = true;
            this.zza.close();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zza(zzbzo zzbzoVar) throws IOException {
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            this.zzd = zzbzoVar.zzf(this.zzd);
            zzl(0, 0, (byte) 4, (byte) 1);
            this.zza.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzb(int i, zzbyz zzbyzVar) throws IOException {
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            int i2 = zzbyzVar.zzs;
            if (i2 == -1) {
                throw new IllegalArgumentException();
            }
            zzl(i, 4, (byte) 3, (byte) 0);
            zzcbk zzcbkVar = this.zza;
            zzcbkVar.zzL(i2);
            zzcbkVar.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzc(boolean z, int i, int i2) throws IOException {
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            zzl(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            zzcbk zzcbkVar = this.zza;
            zzcbkVar.zzL(i);
            zzcbkVar.zzL(i2);
            zzcbkVar.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzd() throws IOException {
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            if (zzbzl.zza.isLoggable(Level.FINE)) {
                zzbzl.zza.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", zzbzl.zzb.zzg()));
            }
            zzcbk zzcbkVar = this.zza;
            zzcbkVar.zzI(zzbzl.zzb.zzk());
            zzcbkVar.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zze() throws IOException {
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            this.zza.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzf(boolean z, boolean z2, int i, int i2, List list) throws IOException {
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            this.zzc.zza(list);
            zzcbj zzcbjVar = this.zzb;
            long jZzb = zzcbjVar.zzb();
            int iMin = (int) Math.min(this.zzd, jZzb);
            long j = iMin;
            zzl(i, iMin, (byte) 1, jZzb == j ? (byte) 4 : (byte) 0);
            zzcbk zzcbkVar = this.zza;
            zzcbkVar.zzc(zzcbjVar, j);
            if (jZzb > j) {
                long j2 = jZzb - j;
                while (j2 > 0) {
                    int iMin2 = (int) Math.min(this.zzd, j2);
                    long j3 = iMin2;
                    j2 -= j3;
                    zzl(i, iMin2, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
                    zzcbkVar.zzc(zzcbjVar, j3);
                }
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzh(boolean z, int i, zzcbj zzcbjVar, int i2) throws IOException {
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            zzl(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.zza.zzc(zzcbjVar, i2);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzi(zzbzo zzbzoVar) throws IOException {
        int i;
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            int i2 = 0;
            zzl(0, zzbzoVar.zzd() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (zzbzoVar.zzb(i2)) {
                    if (i2 == 4) {
                        int i3 = i2;
                        i2 = 3;
                        i = i3;
                    } else {
                        i = 7;
                        if (i2 == 7) {
                            i2 = 4;
                        } else {
                            i = i2;
                        }
                    }
                    zzcbk zzcbkVar = this.zza;
                    zzcbkVar.zzK(i2);
                    zzcbkVar.zzL(zzbzoVar.zzc(i));
                    i2 = i;
                }
                i2++;
            }
            this.zza.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzj(int i, zzbyz zzbyzVar, byte[] bArr) throws IOException {
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            int i2 = zzbyzVar.zzs;
            if (i2 == -1) {
                throw zzbzl.zzc("errorCode.httpCode == -1", new Object[0]);
            }
            zzl(0, 8, (byte) 7, (byte) 0);
            zzcbk zzcbkVar = this.zza;
            zzcbkVar.zzL(0);
            zzcbkVar.zzL(i2);
            zzcbkVar.flush();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzk(int i, long j) throws IOException {
        synchronized (this) {
            if (this.zze) {
                throw new IOException("closed");
            }
            if (j == 0) {
                throw zzbzl.zzc("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{0L});
            }
            zzl(i, 4, (byte) 8, (byte) 0);
            zzcbk zzcbkVar = this.zza;
            zzcbkVar.zzL((int) j);
            zzcbkVar.flush();
        }
    }

    final void zzl(int i, int i2, byte b, byte b2) throws IOException {
        if (zzbzl.zza.isLoggable(Level.FINE)) {
            zzbzl.zza.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", zzbzi.zza(false, i, i2, b, b2));
        }
        int i3 = this.zzd;
        if (i2 > i3) {
            throw zzbzl.zzc("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw zzbzl.zzc("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
        }
        zzcbk zzcbkVar = this.zza;
        zzcbkVar.zzJ((i2 >>> 16) & 255);
        zzcbkVar.zzJ((i2 >>> 8) & 255);
        zzcbkVar.zzJ(i2 & 255);
        zzcbkVar.zzJ(b);
        zzcbkVar.zzJ(b2);
        zzcbkVar.zzL(i & Integer.MAX_VALUE);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final int zzg() {
        return this.zzd;
    }
}
