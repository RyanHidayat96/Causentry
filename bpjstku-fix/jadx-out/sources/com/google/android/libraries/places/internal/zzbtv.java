package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
final class zzbtv extends InputStream implements zzbhl {
    private final zzbtu zza;

    public zzbtv(zzbtu zzbtuVar) {
        if (zzbtuVar == null) {
            throw new NullPointerException("buffer");
        }
        this.zza = zzbtuVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.zza.zzf();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.zza.zzb();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zza.zza();
    }

    @Override // java.io.InputStream
    public final int read() {
        zzbtu zzbtuVar = this.zza;
        if (zzbtuVar.zzf() == 0) {
            return -1;
        }
        return zzbtuVar.zzg();
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.zza.zzc();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        zzbtu zzbtuVar = this.zza;
        int iMin = (int) Math.min(zzbtuVar.zzf(), j);
        zzbtuVar.zzh(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        zzbtu zzbtuVar = this.zza;
        if (zzbtuVar.zzf() == 0) {
            return -1;
        }
        int iMin = Math.min(zzbtuVar.zzf(), i2);
        zzbtuVar.zzi(bArr, i, iMin);
        return iMin;
    }
}
