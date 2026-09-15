package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
final class zzbtw extends zzbkn {
    int zza;
    final int zzb;
    final byte[] zzc;
    int zzd = -1;

    zzbtw(byte[] bArr, int i, int i2) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("offset must be >= 0");
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("length must be >= 0");
        }
        int i3 = i2 + i;
        if (!(i3 <= bArr.length)) {
            throw new IllegalArgumentException("offset + length exceeds array boundary");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        this.zzc = bArr;
        this.zza = i;
        this.zzb = i3;
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final void zzc() {
        int i = this.zzd;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.zza = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzg() {
        zzd(1);
        int i = this.zza;
        this.zza = i + 1;
        return this.zzc[i] & UByte.MAX_VALUE;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzh(int i) {
        zzd(i);
        this.zza += i;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzi(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zzc, this.zza, bArr, i, i2);
        this.zza += i2;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzk(OutputStream outputStream, int i) throws IOException {
        zzd(i);
        outputStream.write(this.zzc, this.zza, i);
        this.zza += i;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final /* synthetic */ zzbtu zzl(int i) {
        zzd(i);
        int i2 = this.zza;
        this.zza = i2 + i;
        return new zzbtw(this.zzc, i2, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzj(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new NullPointerException("dest");
        }
        int iRemaining = byteBuffer.remaining();
        zzd(iRemaining);
        byteBuffer.put(this.zzc, this.zza, iRemaining);
        this.zza += iRemaining;
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final void zzb() {
        this.zzd = this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzf() {
        return this.zzb - this.zza;
    }
}
