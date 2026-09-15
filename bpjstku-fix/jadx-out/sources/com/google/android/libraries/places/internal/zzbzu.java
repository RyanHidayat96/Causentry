package com.google.android.libraries.places.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzu extends InputStream implements zzbgk, zzbhl {
    private zzbbl zza;
    private final zzbbt zzb;
    private ByteArrayInputStream zzc;

    zzbzu(zzbbl zzbblVar, zzbbt zzbbtVar) {
        this.zza = zzbblVar;
        this.zzb = zzbbtVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            return zzbblVar.zzbl();
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            this.zzc = new ByteArrayInputStream(zzbblVar.zzaZ());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbgk
    public final int zza(OutputStream outputStream) throws IOException {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            int iZzbl = zzbblVar.zzbl();
            this.zza.zzba(outputStream);
            this.zza = null;
            return iZzbl;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream == null) {
            return 0;
        }
        if (byteArrayInputStream == null) {
            throw new NullPointerException("inputStream cannot be null!");
        }
        if (outputStream == null) {
            throw new NullPointerException("outputStream cannot be null!");
        }
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                this.zzc = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    final zzbbl zzb() {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            return zzbblVar;
        }
        throw new IllegalStateException("message not available");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            int iZzbl = zzbblVar.zzbl();
            if (iZzbl == 0) {
                this.zza = null;
                this.zzc = null;
                return -1;
            }
            if (i2 >= iZzbl) {
                zzazi zzaziVarZzy = zzazi.zzy(bArr, i, iZzbl);
                this.zza.zzbz(zzaziVarZzy);
                zzaziVarZzy.zzE();
                this.zza = null;
                this.zzc = null;
                return iZzbl;
            }
            this.zzc = new ByteArrayInputStream(this.zza.zzaZ());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    final zzbbt zzc() {
        return this.zzb;
    }
}
