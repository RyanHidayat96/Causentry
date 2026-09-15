package com.google.android.libraries.places.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbt implements zzcbl {
    public final zzcbz zza;
    public final zzcbj zzb;
    public boolean zzc;

    public zzcbt(zzcbz zzcbzVar) {
        Intrinsics.checkNotNullParameter(zzcbzVar, "");
        this.zza = zzcbzVar;
        this.zzb = new zzcbj();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcbz
    public final void close() throws IOException {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        this.zza.close();
        zzcbj zzcbjVar = this.zzb;
        zzcbjVar.zzt(zzcbjVar.zzb());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        zzcbj zzcbjVar = this.zzb;
        if (zzcbjVar.zzb() == 0 && this.zza.zza(zzcbjVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return zzcbjVar.read(byteBuffer);
    }

    public final String toString() {
        zzcbz zzcbzVar = this.zza;
        StringBuilder sb = new StringBuilder(zzcbzVar.toString().length() + 8);
        sb.append("buffer(");
        sb.append(zzcbzVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbz
    public final long zza(zzcbj zzcbjVar, long j) {
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        if (j < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 15);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        zzcbj zzcbjVar2 = this.zzb;
        if (zzcbjVar2.zzb() == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.zza.zza(zzcbjVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
        }
        return zzcbjVar2.zza(zzcbjVar, Math.min(j, zzcbjVar2.zzb()));
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final boolean zzf() {
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        zzcbj zzcbjVar = this.zzb;
        return zzcbjVar.zzf() && this.zza.zza(zzcbjVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final void zzg(long j) throws EOFException {
        zzcbj zzcbjVar;
        if (j < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 15);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        do {
            zzcbjVar = this.zzb;
            if (zzcbjVar.zzb() >= j) {
                return;
            }
        } while (this.zza.zza(zzcbjVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        throw new EOFException();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final byte zzj() throws EOFException {
        zzg(1L);
        return this.zzb.zzj();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final short zzl() throws EOFException {
        zzg(2L);
        return this.zzb.zzl();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final int zzm() throws EOFException {
        zzg(4L);
        return this.zzb.zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final zzcbn zzn(long j) throws EOFException {
        zzg(j);
        return this.zzb.zzn(j);
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final byte[] zzr(long j) throws EOFException {
        zzg(j);
        return this.zzb.zzr(j);
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final void zzt(long j) throws EOFException {
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            zzcbj zzcbjVar = this.zzb;
            if (zzcbjVar.zzb() == 0 && this.zza.zza(zzcbjVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, zzcbjVar.zzb());
            zzcbjVar.zzt(jMin);
            j -= jMin;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final zzcbj zze() {
        return this.zzb;
    }
}
