package com.google.android.libraries.places.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbj implements Cloneable, ByteChannel, zzcbl, zzcbk {
    public zzcbu zza;
    private long zzb;

    public final /* synthetic */ Object clone() {
        zzcbj zzcbjVar = new zzcbj();
        if (this.zzb == 0) {
            return zzcbjVar;
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.checkNotNull(zzcbuVar);
        zzcbu zzcbuVarZza = zzcbuVar.zza();
        zzcbjVar.zza = zzcbuVarZza;
        zzcbuVarZza.zzg = zzcbuVarZza;
        zzcbuVarZza.zzf = zzcbuVarZza.zzg;
        for (zzcbu zzcbuVar2 = zzcbuVar.zzf; zzcbuVar2 != zzcbuVar; zzcbuVar2 = zzcbuVar2.zzf) {
            zzcbu zzcbuVar3 = zzcbuVarZza.zzg;
            Intrinsics.checkNotNull(zzcbuVar3);
            Intrinsics.checkNotNull(zzcbuVar2);
            zzcbuVar3.zzc(zzcbuVar2.zza());
        }
        zzcbjVar.zzb = this.zzb;
        return zzcbjVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcbz
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcbj)) {
            return false;
        }
        long j = this.zzb;
        zzcbj zzcbjVar = (zzcbj) obj;
        if (j != zzcbjVar.zzb) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.checkNotNull(zzcbuVar);
        zzcbu zzcbuVar2 = zzcbjVar.zza;
        Intrinsics.checkNotNull(zzcbuVar2);
        int i = zzcbuVar.zzb;
        int i2 = zzcbuVar2.zzb;
        long j3 = 0;
        while (j3 < this.zzb) {
            long jMin = Math.min(zzcbuVar.zzc - i, zzcbuVar2.zzc - i2);
            long j4 = j2;
            while (j4 < jMin) {
                if (zzcbuVar.zza[i] != zzcbuVar2.zza[i2]) {
                    return false;
                }
                j4++;
                i++;
                i2++;
            }
            if (i == zzcbuVar.zzc) {
                zzcbuVar = zzcbuVar.zzf;
                Intrinsics.checkNotNull(zzcbuVar);
                i = zzcbuVar.zzb;
            }
            if (i2 == zzcbuVar2.zzc) {
                zzcbuVar2 = zzcbuVar2.zzf;
                Intrinsics.checkNotNull(zzcbuVar2);
                i2 = zzcbuVar2.zzb;
            }
            j3 += jMin;
            j2 = 0;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk, com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zzcbuVar.zzc;
            for (int i3 = zzcbuVar.zzb; i3 < i2; i3++) {
                i = (i * 31) + zzcbuVar.zza[i3];
            }
            zzcbuVar = zzcbuVar.zzf;
            Intrinsics.checkNotNull(zzcbuVar);
        } while (zzcbuVar != this.zza);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), zzcbuVar.zzc - zzcbuVar.zzb);
        byteBuffer.put(zzcbuVar.zza, zzcbuVar.zzb, iMin);
        int i = zzcbuVar.zzb + iMin;
        zzcbuVar.zzb = i;
        this.zzb -= (long) iMin;
        if (i == zzcbuVar.zzc) {
            this.zza = zzcbuVar.zzb();
            zzcbv.zzb(zzcbuVar);
        }
        return iMin;
    }

    public final String toString() {
        return zzF().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            zzcbu zzcbuVarZzE = zzE(1);
            int iMin = Math.min(i, 8192 - zzcbuVarZzE.zzc);
            byteBuffer.get(zzcbuVarZzE.zza, zzcbuVarZzE.zzc, iMin);
            i -= iMin;
            zzcbuVarZzE.zzc += iMin;
        }
        this.zzb += (long) iRemaining;
        return iRemaining;
    }

    public final zzcbj zzA(int i) {
        zzcbu zzcbuVarZzE = zzE(1);
        byte[] bArr = zzcbuVarZzE.zza;
        int i2 = zzcbuVarZzE.zzc;
        zzcbuVarZzE.zzc = i2 + 1;
        bArr[i2] = (byte) i;
        this.zzb++;
        return this;
    }

    public final zzcbj zzB(int i) {
        zzcbu zzcbuVarZzE = zzE(2);
        byte[] bArr = zzcbuVarZzE.zza;
        int i2 = zzcbuVarZzE.zzc;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        zzcbuVarZzE.zzc = i2 + 2;
        this.zzb += 2;
        return this;
    }

    public final zzcbj zzC(int i) {
        zzcbu zzcbuVarZzE = zzE(4);
        byte[] bArr = zzcbuVarZzE.zza;
        int i2 = zzcbuVarZzE.zzc;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        zzcbuVarZzE.zzc = i2 + 4;
        this.zzb += 4;
        return this;
    }

    public final zzcbj zzD(long j) {
        if (j == 0) {
            zzA(48);
            return this;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 - ((j5 >>> 1) & 6148914691236517205L);
        long j7 = ((j6 >>> 2) & 3689348814741910323L) + (j6 & 3689348814741910323L);
        long j8 = ((j7 >>> 4) + j7) & 1085102592571150095L;
        long j9 = j8 + (j8 >>> 8);
        long j10 = j9 + (j9 >>> 16);
        int i = (int) ((((j10 & 63) + ((j10 >>> 32) & 63)) + 3) >> 2);
        zzcbu zzcbuVarZzE = zzE(i);
        byte[] bArr = zzcbuVarZzE.zza;
        int i2 = zzcbuVarZzE.zzc;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                zzcbuVarZzE.zzc += i;
                this.zzb += (long) i;
                return this;
            }
            bArr[i3] = zzccd.zza()[(int) (15 & j)];
            j >>>= 4;
        }
    }

    public final zzcbn zzF() {
        long j = this.zzb;
        if (j <= SieveCacheKt.NodeLinkMask) {
            return zzG((int) j);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22);
        sb.append("size > Int.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* synthetic */ zzcbk zzH(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* synthetic */ zzcbk zzI(byte[] bArr) {
        zzy(bArr);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* synthetic */ zzcbk zzJ(int i) {
        zzA(i);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* synthetic */ zzcbk zzK(int i) {
        zzB(i);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final /* synthetic */ zzcbk zzL(int i) {
        zzC(i);
        return this;
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
        long j2 = this.zzb;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        zzcbjVar.zzc(this, j);
        return j;
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj zzcbjVar, long j) {
        zzcbu zzcbuVar;
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        if (zzcbjVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        zzcbf.zza(zzcbjVar.zzb, 0L, j);
        while (j > 0) {
            zzcbu zzcbuVar2 = zzcbjVar.zza;
            Intrinsics.checkNotNull(zzcbuVar2);
            int i = zzcbuVar2.zzc;
            zzcbu zzcbuVar3 = zzcbjVar.zza;
            Intrinsics.checkNotNull(zzcbuVar3);
            long j2 = i - zzcbuVar3.zzb;
            int i2 = 0;
            if (j < j2) {
                zzcbu zzcbuVar4 = this.zza;
                if (zzcbuVar4 != null) {
                    Intrinsics.checkNotNull(zzcbuVar4);
                    zzcbuVar = zzcbuVar4.zzg;
                } else {
                    zzcbuVar = null;
                }
                int i3 = (int) j;
                if (zzcbuVar != null && zzcbuVar.zze) {
                    if ((((long) zzcbuVar.zzc) + j) - ((long) (zzcbuVar.zzd ? 0 : zzcbuVar.zzb)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        zzcbu zzcbuVar5 = zzcbjVar.zza;
                        Intrinsics.checkNotNull(zzcbuVar5);
                        zzcbuVar5.zze(zzcbuVar, i3);
                        zzcbjVar.zzb -= j;
                        this.zzb += j;
                        return;
                    }
                }
                zzcbu zzcbuVar6 = zzcbjVar.zza;
                Intrinsics.checkNotNull(zzcbuVar6);
                zzcbjVar.zza = zzcbuVar6.zzd(i3);
            }
            zzcbu zzcbuVar7 = zzcbjVar.zza;
            Intrinsics.checkNotNull(zzcbuVar7);
            int i4 = zzcbuVar7.zzc;
            int i5 = zzcbuVar7.zzb;
            zzcbjVar.zza = zzcbuVar7.zzb();
            zzcbu zzcbuVar8 = this.zza;
            if (zzcbuVar8 == null) {
                this.zza = zzcbuVar7;
                zzcbuVar7.zzg = zzcbuVar7;
                zzcbuVar7.zzf = zzcbuVar7.zzg;
            } else {
                Intrinsics.checkNotNull(zzcbuVar8);
                zzcbu zzcbuVar9 = zzcbuVar8.zzg;
                Intrinsics.checkNotNull(zzcbuVar9);
                zzcbuVar9.zzc(zzcbuVar7);
                zzcbu zzcbuVar10 = zzcbuVar7.zzg;
                if (zzcbuVar10 == zzcbuVar7) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.checkNotNull(zzcbuVar10);
                if (zzcbuVar10.zze) {
                    int i6 = zzcbuVar7.zzc - zzcbuVar7.zzb;
                    zzcbu zzcbuVar11 = zzcbuVar7.zzg;
                    Intrinsics.checkNotNull(zzcbuVar11);
                    int i7 = zzcbuVar11.zzc;
                    zzcbu zzcbuVar12 = zzcbuVar7.zzg;
                    Intrinsics.checkNotNull(zzcbuVar12);
                    if (!zzcbuVar12.zzd) {
                        zzcbu zzcbuVar13 = zzcbuVar7.zzg;
                        Intrinsics.checkNotNull(zzcbuVar13);
                        i2 = zzcbuVar13.zzb;
                    }
                    if (i6 <= (8192 - i7) + i2) {
                        zzcbu zzcbuVar14 = zzcbuVar7.zzg;
                        Intrinsics.checkNotNull(zzcbuVar14);
                        zzcbuVar7.zze(zzcbuVar14, i6);
                        zzcbuVar7.zzb();
                        zzcbv.zzb(zzcbuVar7);
                    }
                }
            }
            long j3 = i4 - i5;
            zzcbjVar.zzb -= j3;
            this.zzb += j3;
            j -= j3;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final zzcbj zze() {
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final void zzg(long j) throws EOFException {
        if (this.zzb < j) {
            throw new EOFException();
        }
    }

    public final zzcbj zzh(OutputStream outputStream, long j) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "");
        zzcbf.zza(this.zzb, 0L, j);
        zzcbu zzcbuVar = this.zza;
        while (j > 0) {
            Intrinsics.checkNotNull(zzcbuVar);
            int iMin = (int) Math.min(j, zzcbuVar.zzc - zzcbuVar.zzb);
            outputStream.write(zzcbuVar.zza, zzcbuVar.zzb, iMin);
            int i = zzcbuVar.zzb + iMin;
            zzcbuVar.zzb = i;
            long j2 = iMin;
            this.zzb -= j2;
            j -= j2;
            if (i == zzcbuVar.zzc) {
                zzcbu zzcbuVarZzb = zzcbuVar.zzb();
                this.zza = zzcbuVarZzb;
                zzcbv.zzb(zzcbuVar);
                zzcbuVar = zzcbuVarZzb;
            }
        }
        return this;
    }

    public final long zzi() {
        long j = this.zzb;
        if (j == 0) {
            return 0L;
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.checkNotNull(zzcbuVar);
        zzcbu zzcbuVar2 = zzcbuVar.zzg;
        Intrinsics.checkNotNull(zzcbuVar2);
        int i = zzcbuVar2.zzc;
        return (i >= 8192 || !zzcbuVar2.zze) ? j : j - ((long) (i - zzcbuVar2.zzb));
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final byte zzj() throws EOFException {
        if (this.zzb == 0) {
            throw new EOFException();
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.checkNotNull(zzcbuVar);
        int i = zzcbuVar.zzb;
        int i2 = zzcbuVar.zzc;
        int i3 = i + 1;
        byte b = zzcbuVar.zza[i];
        this.zzb--;
        if (i3 != i2) {
            zzcbuVar.zzb = i3;
            return b;
        }
        this.zza = zzcbuVar.zzb();
        zzcbv.zzb(zzcbuVar);
        return b;
    }

    public final byte zzk(long j) {
        zzcbf.zza(this.zzb, j, 1L);
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j2 = this.zzb;
        if (j2 - j < j) {
            while (j2 > j) {
                zzcbuVar = zzcbuVar.zzg;
                Intrinsics.checkNotNull(zzcbuVar);
                j2 -= (long) (zzcbuVar.zzc - zzcbuVar.zzb);
            }
            Intrinsics.checkNotNull(zzcbuVar);
            return zzcbuVar.zza[(int) ((((long) zzcbuVar.zzb) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (zzcbuVar.zzc - zzcbuVar.zzb)) + j3;
            if (j4 > j) {
                Intrinsics.checkNotNull(zzcbuVar);
                return zzcbuVar.zza[(int) ((((long) zzcbuVar.zzb) + j) - j3)];
            }
            zzcbuVar = zzcbuVar.zzf;
            Intrinsics.checkNotNull(zzcbuVar);
            j3 = j4;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final short zzl() throws EOFException {
        int iZzj;
        int iZzj2;
        if (this.zzb < 2) {
            throw new EOFException();
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.checkNotNull(zzcbuVar);
        int i = zzcbuVar.zzb;
        int i2 = zzcbuVar.zzc;
        if (i2 - i < 2) {
            iZzj = (zzj() & UByte.MAX_VALUE) << 8;
            iZzj2 = zzj() & UByte.MAX_VALUE;
        } else {
            byte[] bArr = zzcbuVar.zza;
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            this.zzb -= 2;
            int i3 = i + 2;
            if (i3 == i2) {
                this.zza = zzcbuVar.zzb();
                zzcbv.zzb(zzcbuVar);
            } else {
                zzcbuVar.zzb = i3;
            }
            iZzj = (b & UByte.MAX_VALUE) << 8;
            iZzj2 = b2 & UByte.MAX_VALUE;
        }
        return (short) (iZzj | iZzj2);
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final int zzm() throws EOFException {
        if (this.zzb < 4) {
            throw new EOFException();
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.checkNotNull(zzcbuVar);
        int i = zzcbuVar.zzb;
        int i2 = zzcbuVar.zzc;
        if (i2 - i < 4) {
            return ((zzj() & UByte.MAX_VALUE) << 24) | ((zzj() & UByte.MAX_VALUE) << 16) | ((zzj() & UByte.MAX_VALUE) << 8) | (zzj() & UByte.MAX_VALUE);
        }
        byte[] bArr = zzcbuVar.zza;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        this.zzb -= 4;
        int i3 = (b4 & UByte.MAX_VALUE) | ((b2 & UByte.MAX_VALUE) << 16) | ((b & UByte.MAX_VALUE) << 24) | ((b3 & UByte.MAX_VALUE) << 8);
        int i4 = i + 4;
        if (i4 != i2) {
            zzcbuVar.zzb = i4;
            return i3;
        }
        this.zza = zzcbuVar.zzb();
        zzcbv.zzb(zzcbuVar);
        return i3;
    }

    public final String zzo() {
        return zzp(this.zzb, Charsets.UTF_8);
    }

    public final int zzs(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        zzcbf.zza(bArr.length, i, i2);
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, zzcbuVar.zzc - zzcbuVar.zzb);
        int i3 = zzcbuVar.zzb;
        ArraysKt.copyInto(zzcbuVar.zza, bArr, i, i3, i3 + iMin);
        int i4 = zzcbuVar.zzb + iMin;
        zzcbuVar.zzb = i4;
        this.zzb -= (long) iMin;
        if (i4 != zzcbuVar.zzc) {
            return iMin;
        }
        this.zza = zzcbuVar.zzb();
        zzcbv.zzb(zzcbuVar);
        return iMin;
    }

    public final zzcbj zzu(zzcbn zzcbnVar) {
        Intrinsics.checkNotNullParameter(zzcbnVar, "");
        zzcbnVar.zzm(this, 0, zzcbnVar.zzj());
        return this;
    }

    public final zzcbj zzv(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        zzw(str, 0, str.length());
        return this;
    }

    public final zzcbj zzw(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 27);
            sb.append("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > str.length()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 29 + String.valueOf(length).length());
            sb2.append("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                zzcbu zzcbuVarZzE = zzE(1);
                byte[] bArr = zzcbuVarZzE.zza;
                int i5 = zzcbuVarZzE.zzc - i3;
                int iMin = Math.min(i2, 8192 - i5);
                bArr[i3 + i5] = (byte) cCharAt;
                i3 = i4;
                while (i3 < iMin) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i3 + i5] = (byte) cCharAt2;
                    i3++;
                }
                int i6 = zzcbuVarZzE.zzc;
                int i7 = (i5 + i3) - i6;
                zzcbuVarZzE.zzc = i6 + i7;
                this.zzb += (long) i7;
            } else {
                if (cCharAt < 2048) {
                    zzcbu zzcbuVarZzE2 = zzE(2);
                    byte[] bArr2 = zzcbuVarZzE2.zza;
                    int i8 = zzcbuVarZzE2.zzc;
                    bArr2[i8] = (byte) ((cCharAt >> 6) | DerHeader.TAG_CLASS_PRIVATE);
                    bArr2[i8 + 1] = (byte) ((cCharAt & '?') | 128);
                    zzcbuVarZzE2.zzc = i8 + 2;
                    this.zzb += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    zzcbu zzcbuVarZzE3 = zzE(3);
                    byte[] bArr3 = zzcbuVarZzE3.zza;
                    int i9 = zzcbuVarZzE3.zzc;
                    bArr3[i9] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt & '?') | 128);
                    zzcbuVarZzE3.zzc = i9 + 3;
                    this.zzb += 3;
                } else {
                    char cCharAt3 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        zzA(63);
                    } else {
                        zzcbu zzcbuVarZzE4 = zzE(4);
                        byte[] bArr4 = zzcbuVarZzE4.zza;
                        int i10 = zzcbuVarZzE4.zzc;
                        int i11 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i10] = (byte) ((i11 >> 18) | 240);
                        bArr4[i10 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i10 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i10 + 3] = (byte) ((i11 & 63) | 128);
                        zzcbuVarZzE4.zzc = i10 + 4;
                        this.zzb += 4;
                        i3 += 2;
                    }
                }
                i3 = i4;
            }
        }
        return this;
    }

    public final zzcbj zzx(int i) {
        if (i < 128) {
            zzA(i);
            return this;
        }
        if (i < 2048) {
            zzcbu zzcbuVarZzE = zzE(2);
            byte[] bArr = zzcbuVarZzE.zza;
            int i2 = zzcbuVarZzE.zzc;
            bArr[i2] = (byte) ((i >> 6) | DerHeader.TAG_CLASS_PRIVATE);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            zzcbuVarZzE.zzc = i2 + 2;
            this.zzb += 2;
            return this;
        }
        if (i >= 55296 && i < 57344) {
            zzA(63);
            return this;
        }
        if (i < 65536) {
            zzcbu zzcbuVarZzE2 = zzE(3);
            byte[] bArr2 = zzcbuVarZzE2.zza;
            int i3 = zzcbuVarZzE2.zzc;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            zzcbuVarZzE2.zzc = i3 + 3;
            this.zzb += 3;
            return this;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(String.valueOf(zzcbf.zzc(i))));
        }
        zzcbu zzcbuVarZzE3 = zzE(4);
        byte[] bArr3 = zzcbuVarZzE3.zza;
        int i4 = zzcbuVarZzE3.zzc;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        zzcbuVarZzE3.zzc = i4 + 4;
        this.zzb += 4;
        return this;
    }

    public final zzcbj zzy(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        zzz(bArr, 0, bArr.length);
        return this;
    }

    public final zzcbj zzz(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        long j = i2;
        zzcbf.zza(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.zzb += j;
                return this;
            }
            zzcbu zzcbuVarZzE = zzE(1);
            int iMin = Math.min(i4 - i3, 8192 - zzcbuVarZzE.zzc);
            int i5 = i3 + iMin;
            ArraysKt.copyInto(bArr, zzcbuVarZzE.zza, zzcbuVarZzE.zzc, i3, i5);
            zzcbuVarZzE.zzc += iMin;
            i3 = i5;
        }
    }

    public final zzcbu zzE(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        zzcbu zzcbuVar = this.zza;
        if (zzcbuVar == null) {
            zzcbu zzcbuVarZza = zzcbv.zza();
            this.zza = zzcbuVarZza;
            zzcbuVarZza.zzg = zzcbuVarZza;
            zzcbuVarZza.zzf = zzcbuVarZza;
            return zzcbuVarZza;
        }
        Intrinsics.checkNotNull(zzcbuVar);
        zzcbu zzcbuVar2 = zzcbuVar.zzg;
        Intrinsics.checkNotNull(zzcbuVar2);
        if (zzcbuVar2.zzc + i <= 8192 && zzcbuVar2.zze) {
            return zzcbuVar2;
        }
        zzcbu zzcbuVarZza2 = zzcbv.zza();
        zzcbuVar2.zzc(zzcbuVarZza2);
        return zzcbuVarZza2;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final zzcbn zzn(long j) throws EOFException {
        if (j < 0 || j > SieveCacheKt.NodeLinkMask) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 11);
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.zzb < j) {
            throw new EOFException();
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new zzcbn(zzr(j));
        }
        zzcbn zzcbnVarZzG = zzG((int) j);
        zzt(j);
        return zzcbnVarZzG;
    }

    public final String zzp(long j, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "");
        if (j < 0 || j > SieveCacheKt.NodeLinkMask) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 11);
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.zzb < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        zzcbu zzcbuVar = this.zza;
        Intrinsics.checkNotNull(zzcbuVar);
        int i = zzcbuVar.zzb;
        int i2 = zzcbuVar.zzc;
        if (((long) i) + j > i2) {
            return new String(zzr(j), charset);
        }
        int i3 = (int) j;
        String str = new String(zzcbuVar.zza, i, i3, charset);
        int i4 = i + i3;
        zzcbuVar.zzb = i4;
        this.zzb -= j;
        if (i4 == i2) {
            this.zza = zzcbuVar.zzb();
            zzcbv.zzb(zzcbuVar);
        }
        return str;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final byte[] zzr(long j) throws EOFException {
        if (j < 0 || j > SieveCacheKt.NodeLinkMask) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 11);
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.zzb < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        Intrinsics.checkNotNullParameter(bArr, "");
        int i2 = 0;
        while (i2 < i) {
            int iZzs = zzs(bArr, i2, i - i2);
            if (iZzs == -1) {
                throw new EOFException();
            }
            i2 += iZzs;
        }
        return bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final void zzt(long j) throws EOFException {
        while (j > 0) {
            zzcbu zzcbuVar = this.zza;
            if (zzcbuVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, zzcbuVar.zzc - zzcbuVar.zzb);
            long j2 = iMin;
            this.zzb -= j2;
            j -= j2;
            int i = zzcbuVar.zzb + iMin;
            zzcbuVar.zzb = i;
            if (i == zzcbuVar.zzc) {
                this.zza = zzcbuVar.zzb();
                zzcbv.zzb(zzcbuVar);
            }
        }
    }

    public final String zzq(long j) throws EOFException {
        long j2;
        long j3;
        zzcbu zzcbuVar;
        long j4;
        long j5 = this.zzb;
        long j6 = j5 < Long.MAX_VALUE ? j5 : Long.MAX_VALUE;
        if (j6 == 0 || (zzcbuVar = this.zza) == null) {
            j2 = -1;
            j3 = -1;
        } else if (j5 < 0) {
            while (j5 > 0) {
                zzcbuVar = zzcbuVar.zzg;
                Intrinsics.checkNotNull(zzcbuVar);
                j5 -= (long) (zzcbuVar.zzc - zzcbuVar.zzb);
            }
            if (zzcbuVar != null) {
                long j7 = 0;
                while (true) {
                    if (j5 < j6) {
                        byte[] bArr = zzcbuVar.zza;
                        int iMin = (int) Math.min(zzcbuVar.zzc, (((long) zzcbuVar.zzb) + j6) - j5);
                        int i = (int) ((((long) zzcbuVar.zzb) + j7) - j5);
                        while (true) {
                            if (i >= iMin) {
                                j7 = j5 + ((long) (zzcbuVar.zzc - zzcbuVar.zzb));
                                zzcbuVar = zzcbuVar.zzf;
                                Intrinsics.checkNotNull(zzcbuVar);
                                j5 = j7;
                            } else if (bArr[i] == 10) {
                                j4 = i - zzcbuVar.zzb;
                                j3 = j4 + j5;
                                j2 = -1;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            j2 = -1;
            j3 = -1;
        } else {
            j5 = 0;
            while (true) {
                long j8 = ((long) (zzcbuVar.zzc - zzcbuVar.zzb)) + j5;
                if (j8 > 0) {
                    break;
                }
                zzcbuVar = zzcbuVar.zzf;
                Intrinsics.checkNotNull(zzcbuVar);
                j5 = j8;
            }
            if (zzcbuVar != null) {
                long j9 = 0;
                while (true) {
                    if (j5 < j6) {
                        byte[] bArr2 = zzcbuVar.zza;
                        int iMin2 = (int) Math.min(zzcbuVar.zzc, (((long) zzcbuVar.zzb) + j6) - j5);
                        int i2 = (int) ((((long) zzcbuVar.zzb) + j9) - j5);
                        while (true) {
                            if (i2 >= iMin2) {
                                j9 = ((long) (zzcbuVar.zzc - zzcbuVar.zzb)) + j5;
                                zzcbuVar = zzcbuVar.zzf;
                                Intrinsics.checkNotNull(zzcbuVar);
                                j5 = j9;
                            } else if (bArr2[i2] == 10) {
                                j4 = i2 - zzcbuVar.zzb;
                                j3 = j4 + j5;
                                j2 = -1;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            j2 = -1;
            j3 = -1;
        }
        if (j3 != j2) {
            Intrinsics.checkNotNullParameter(this, "");
            if (j3 > 0) {
                long j10 = j3 - 1;
                if (zzk(j10) == 13) {
                    String strZzp = zzp(j10, Charsets.UTF_8);
                    zzt(2L);
                    return strZzp;
                }
            }
            String strZzp2 = zzp(j3, Charsets.UTF_8);
            zzt(1L);
            return strZzp2;
        }
        zzcbj zzcbjVar = new zzcbj();
        long jMin = Math.min(32L, this.zzb);
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        zzcbf.zza(this.zzb, 0L, jMin);
        if (jMin != 0) {
            zzcbjVar.zzb += jMin;
            zzcbu zzcbuVar2 = this.zza;
            long j11 = 0;
            while (true) {
                Intrinsics.checkNotNull(zzcbuVar2);
                long j12 = zzcbuVar2.zzc - zzcbuVar2.zzb;
                if (j11 < j12) {
                    break;
                }
                zzcbuVar2 = zzcbuVar2.zzf;
                j11 -= j12;
            }
            while (jMin > 0) {
                Intrinsics.checkNotNull(zzcbuVar2);
                zzcbu zzcbuVarZza = zzcbuVar2.zza();
                int i3 = zzcbuVarZza.zzb + ((int) j11);
                zzcbuVarZza.zzb = i3;
                zzcbuVarZza.zzc = Math.min(i3 + ((int) jMin), zzcbuVarZza.zzc);
                zzcbu zzcbuVar3 = zzcbjVar.zza;
                if (zzcbuVar3 == null) {
                    zzcbuVarZza.zzg = zzcbuVarZza;
                    zzcbuVarZza.zzf = zzcbuVarZza.zzg;
                    zzcbjVar.zza = zzcbuVarZza.zzf;
                } else {
                    Intrinsics.checkNotNull(zzcbuVar3);
                    zzcbu zzcbuVar4 = zzcbuVar3.zzg;
                    Intrinsics.checkNotNull(zzcbuVar4);
                    zzcbuVar4.zzc(zzcbuVarZza);
                }
                jMin -= (long) (zzcbuVarZza.zzc - zzcbuVarZza.zzb);
                zzcbuVar2 = zzcbuVar2.zzf;
                j11 = 0;
            }
        }
        long jMin2 = Math.min(this.zzb, Long.MAX_VALUE);
        String strZzg = zzcbjVar.zzn(zzcbjVar.zzb).zzg();
        StringBuilder sb = new StringBuilder(String.valueOf(jMin2).length() + 29 + String.valueOf(strZzg).length() + 1);
        sb.append("\\n not found: limit=");
        sb.append(jMin2);
        sb.append(" content=");
        sb.append(strZzg);
        sb.append("…");
        throw new EOFException(sb.toString());
    }

    public final zzcbn zzG(int i) {
        if (i == 0) {
            return zzcbn.zza;
        }
        zzcbf.zza(this.zzb, 0L, i);
        zzcbu zzcbuVar = this.zza;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.checkNotNull(zzcbuVar);
            int i5 = zzcbuVar.zzc;
            int i6 = zzcbuVar.zzb;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            zzcbuVar = zzcbuVar.zzf;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        zzcbu zzcbuVar2 = this.zza;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.checkNotNull(zzcbuVar2);
            bArr[i7] = zzcbuVar2.zza;
            i2 += zzcbuVar2.zzc - zzcbuVar2.zzb;
            iArr[i7] = Math.min(i2, i);
            iArr[bArr.length + i7] = zzcbuVar2.zzb;
            zzcbuVar2.zzd = true;
            i7++;
            zzcbuVar2 = zzcbuVar2.zzf;
        }
        return new zzcbw(bArr, iArr);
    }

    public final long zzb() {
        return this.zzb;
    }

    public final void zzd(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final boolean zzf() {
        return this.zzb == 0;
    }
}
