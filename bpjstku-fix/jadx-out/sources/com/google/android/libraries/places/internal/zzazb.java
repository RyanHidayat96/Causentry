package com.google.android.libraries.places.internal;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzazb extends zzazc {
    private final InputStream zzg;
    private final byte[] zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    /* synthetic */ zzazb(InputStream inputStream, int i, byte[] bArr) {
        super(null);
        this.zzn = Integer.MAX_VALUE;
        this.zzg = inputStream;
        this.zzh = new byte[4096];
        this.zzi = 0;
        this.zzk = 0;
        this.zzm = 0;
    }

    private final void zzP(int i) throws IOException {
        if (zzQ(i)) {
            return;
        }
        if (i <= (this.zzd - this.zzm) - this.zzk) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzbar("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzQ(int i) throws IOException {
        int i2 = this.zzk;
        int i3 = this.zzi;
        if (i2 + i <= i3) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i4 = this.zzd;
        int i5 = this.zzm;
        if (i > (i4 - i5) - i2 || i5 + i2 + i > this.zzn) {
            return false;
        }
        if (i2 > 0) {
            if (i3 > i2) {
                byte[] bArr = this.zzh;
                System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
            }
            i5 = this.zzm + i2;
            this.zzm = i5;
            i3 = this.zzi - i2;
            this.zzi = i3;
            this.zzk = 0;
        }
        try {
            int i6 = this.zzg.read(this.zzh, i3, Math.min(4096 - i3, (this.zzd - i5) - i3));
            if (i6 != 0 && i6 >= -1 && i6 <= 4096) {
                if (i6 <= 0) {
                    return false;
                }
                this.zzi += i6;
                zzO();
                return this.zzi >= i || zzQ(i);
            }
            String strValueOf = String.valueOf(this.zzg.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 39 + String.valueOf(i6).length() + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i6);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (zzbar e2) {
            e2.zza();
            throw e2;
        }
    }

    private final byte[] zzR(int i, boolean z) throws IOException {
        byte[] bArrZzS = zzS(i);
        if (bArrZzS != null) {
            return bArrZzS;
        }
        int i2 = this.zzk;
        int i3 = this.zzi;
        int i4 = i3 - i2;
        this.zzm += i3;
        this.zzk = 0;
        this.zzi = 0;
        List<byte[]> listZzT = zzT(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzh, i2, bArr, 0, i4);
        for (byte[] bArr2 : listZzT) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] zzS(int i) throws IOException {
        if (i == 0) {
            return zzbap.zzb;
        }
        int i2 = this.zzm;
        int i3 = this.zzk;
        int i4 = i2 + i3 + i;
        if (i4 - this.zzd > 0) {
            throw new zzbar("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.zzn;
        if (i4 > i5) {
            zzE((i5 - i2) - i3);
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.zzi - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.zzg.available()) {
                    return null;
                }
            } catch (zzbar e2) {
                e2.zza();
                throw e2;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzh, this.zzk, bArr, 0, i6);
        this.zzm += this.zzi;
        this.zzk = 0;
        this.zzi = 0;
        while (i6 < i) {
            try {
                int i8 = this.zzg.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzm += i8;
                i6 += i8;
            } catch (zzbar e3) {
                e3.zza();
                throw e3;
            }
        }
        return bArr;
    }

    private final List zzT(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.zzg.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzm += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final void zzA(int i) {
        this.zzn = i;
        zzO();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzB() throws IOException {
        return this.zzk == this.zzi && !zzQ(1);
    }

    public final byte zzD() throws IOException {
        if (this.zzk == this.zzi) {
            zzP(1);
        }
        byte[] bArr = this.zzh;
        int i = this.zzk;
        this.zzk = i + 1;
        return bArr[i];
    }

    public final void zzE(int i) throws IOException {
        int i2 = this.zzi;
        int i3 = this.zzk;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzk = i3 + i;
            return;
        }
        if (i < 0) {
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.zzm;
        int i6 = i5 + i3;
        int i7 = this.zzn;
        if (i6 + i > i7) {
            zzE((i7 - i5) - i3);
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i6;
        this.zzi = 0;
        this.zzk = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.zzg.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } else {
                        String strValueOf = String.valueOf(this.zzg.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                } catch (zzbar e2) {
                    e2.zza();
                    throw e2;
                }
            } catch (Throwable th) {
                this.zzm += i4;
                zzO();
                throw th;
            }
        }
        this.zzm += i4;
        zzO();
        if (i4 >= i) {
            return;
        }
        int i8 = this.zzi;
        int i9 = i8 - this.zzk;
        this.zzk = i8;
        zzP(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.zzi;
            if (i10 <= i11) {
                this.zzk = i10;
                return;
            } else {
                i9 += i11;
                this.zzk = i11;
                zzP(1);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzl = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzl = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzbar("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final void zzb(int i) throws zzbar {
        if (this.zzl != i) {
            throw new zzbar("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i = this.zzi;
            int i2 = this.zzk;
            if (iZzu <= i - i2) {
                String str = new String(this.zzh, i2, iZzu, zzbap.zza);
                this.zzk += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzu > this.zzi) {
            return new String(zzR(iZzu, false), zzbap.zza);
        }
        zzP(iZzu);
        String str2 = new String(this.zzh, this.zzk, iZzu, zzbap.zza);
        this.zzk += iZzu;
        return str2;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final String zzm() throws IOException {
        byte[] bArrZzR;
        int iZzu = zzu();
        int i = this.zzk;
        int i2 = this.zzi;
        if (iZzu <= i2 - i && iZzu > 0) {
            bArrZzR = this.zzh;
            this.zzk = i + iZzu;
        } else {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu < 0) {
                throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iZzu <= i2) {
                zzP(iZzu);
                bArrZzR = this.zzh;
                this.zzk = iZzu;
            } else {
                bArrZzR = zzR(iZzu, false);
            }
        }
        return zzbcw.zzc(bArrZzR, i, iZzu);
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final zzayz zzn() throws IOException {
        int iZzu = zzu();
        int i = this.zzi;
        int i2 = this.zzk;
        if (iZzu <= i - i2 && iZzu > 0) {
            zzayz zzayzVarZzh = zzayz.zzh(this.zzh, i2, iZzu);
            this.zzk += iZzu;
            return zzayzVarZzh;
        }
        if (iZzu == 0) {
            return zzayz.zzb;
        }
        if (iZzu < 0) {
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzS = zzS(iZzu);
        if (bArrZzS != null) {
            return zzayz.zzh(bArrZzS, 0, bArrZzS.length);
        }
        int i3 = this.zzk;
        int i4 = this.zzi;
        int i5 = i4 - i3;
        this.zzm += i4;
        this.zzk = 0;
        this.zzi = 0;
        List<byte[]> listZzT = zzT(iZzu - i5);
        byte[] bArr = new byte[iZzu];
        System.arraycopy(this.zzh, i3, bArr, 0, i5);
        for (byte[] bArr2 : listZzT) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return new zzayy(bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzs() throws IOException {
        return zzM(zzu());
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzt() throws IOException {
        return zzN(zzv());
    }

    final long zzw() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZzD = zzD();
            j |= ((long) (bZzD & ByteCompanionObject.MAX_VALUE)) << i;
            if ((bZzD & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw new zzbar("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws IOException {
        int i = this.zzk;
        if (this.zzi - i < 4) {
            zzP(4);
            i = this.zzk;
        }
        byte[] bArr = this.zzh;
        this.zzk = i + 4;
        byte b = bArr[i];
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | (b & UByte.MAX_VALUE) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long zzy() throws IOException {
        int i = this.zzk;
        if (this.zzi - i < 8) {
            zzP(8);
            i = this.zzk;
        }
        byte[] bArr = this.zzh;
        this.zzk = i + 8;
        return ((((long) bArr[i + 6]) & 255) << 48) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzz(int i) throws zzbar {
        if (i < 0) {
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.zzm + this.zzk;
        if (i2 < 0) {
            throw new zzbar("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.zzn;
        if (i2 > i3) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzn = i2;
        zzO();
        return i3;
    }

    public final int zzu() throws IOException {
        int i;
        int i2 = this.zzk;
        int i3 = this.zzi;
        if (i3 != i2) {
            byte[] bArr = this.zzh;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzk = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                if (bArr[i7] >= 0) {
                                                    i5 = i2 + 10;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzk = i5;
                return i;
            }
        }
        return (int) zzw();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzc(int i) throws IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzi - this.zzk < 10) {
                while (i3 < 10) {
                    if (zzD() < 0) {
                        i3++;
                    }
                }
                throw new zzbar("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.zzh;
                int i4 = this.zzk;
                this.zzk = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new zzbar("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            zzE(8);
            return true;
        }
        if (i2 == 2) {
            zzE(zzu());
            return true;
        }
        if (i2 == 3) {
            zzK();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            zzJ();
            return false;
        }
        if (i2 != 5) {
            throw new zzbaq("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.zzk;
        int i2 = this.zzi;
        if (i2 != i) {
            byte[] bArr = this.zzh;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzk = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j3 = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = (((long) bArr[i8]) << 28) ^ ((long) i9);
                            if (j5 >= 0) {
                                j3 = 266354560 ^ j5;
                            } else {
                                i4 = i + 6;
                                long j6 = (((long) bArr[i6]) << 35) ^ j5;
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 42);
                                    if (j7 >= 0) {
                                        j = 4363953127296L ^ j7;
                                    } else {
                                        i4 = i + 8;
                                        j6 = j7 ^ (((long) bArr[i10]) << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j8 = (j6 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j8;
                                                }
                                            } else {
                                                j = j8;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j6 ^ j2;
                            }
                        }
                    }
                    j = j3;
                    i4 = i6;
                }
                this.zzk = i4;
                return j;
            }
        }
        return zzw();
    }

    private final void zzO() {
        int i = this.zzi + this.zzj;
        this.zzi = i;
        int i2 = this.zzm + i;
        int i3 = this.zzn;
        if (i2 <= i3) {
            this.zzj = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzj = i4;
        this.zzi = i - i4;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzC() {
        return this.zzm + this.zzk;
    }
}
