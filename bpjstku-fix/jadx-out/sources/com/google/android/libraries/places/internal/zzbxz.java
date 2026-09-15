package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxz extends zzbkn {
    private final zzcbj zza;

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        zzcbj zzcbjVar = this.zza;
        zzcbjVar.zzt(zzcbjVar.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzg() {
        try {
            return this.zza.zzj() & UByte.MAX_VALUE;
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzi(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iZzs = this.zza.zzs(bArr, i, i2);
            if (iZzs == -1) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 25);
                sb.append("EOF trying to read ");
                sb.append(i2);
                sb.append(" bytes");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            i2 -= iZzs;
            i += iZzs;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzj(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzk(OutputStream outputStream, int i) throws IOException {
        this.zza.zzh(outputStream, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final zzbtu zzl(int i) {
        zzcbj zzcbjVar = new zzcbj();
        zzcbjVar.zzc(this.zza, i);
        return new zzbxz(zzcbjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzh(int i) {
        try {
            this.zza.zzt(i);
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }

    zzbxz(zzcbj zzcbjVar) {
        this.zza = zzcbjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzf() {
        return (int) this.zza.zzb();
    }
}
