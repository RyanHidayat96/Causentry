package com.google.android.libraries.places.internal;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class zzazf extends zzazi {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzazf(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i3;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzK(int i, int i2) throws IOException {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzL(int i, int i2) throws IOException {
        zzr(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzM(int i, int i2) throws IOException {
        zzr(i << 3);
        zzr(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzN(int i, int i2) throws IOException {
        zzr((i << 3) | 5);
        zzs(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzO(int i, long j) throws IOException {
        zzr(i << 3);
        zzt(j);
    }

    @Override // com.google.android.libraries.places.internal.zzazi, com.google.android.libraries.places.internal.zzays
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzv(bArr, 0, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzi(int i, long j) throws IOException {
        zzr((i << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzj(int i, boolean z) throws IOException {
        zzr(i << 3);
        zzp(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzk(int i, String str) throws IOException {
        zzr((i << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzl(int i, zzayz zzayzVar) throws IOException {
        zzr((i << 3) | 2);
        zzr(zzayzVar.zzc());
        zzayzVar.zzf(this);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    final void zzm(int i, zzbbl zzbblVar, zzbbz zzbbzVar) throws IOException {
        zzr((i << 3) | 2);
        zzr(((zzaym) zzbblVar).zzbb(zzbbzVar));
        zzbbzVar.zzf(zzbblVar, this.zze);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzn(int i, zzbbl zzbblVar) throws IOException {
        zzr(11);
        zzM(2, i);
        zzr(26);
        zzr(zzbblVar.zzbl());
        zzbblVar.zzbz(this);
        zzr(12);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzo(int i, zzayz zzayzVar) throws IOException {
        zzr(11);
        zzM(2, i);
        zzl(3, zzayzVar);
        zzr(12);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzp(byte b) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zzc;
        try {
            int i2 = i + 1;
            try {
                this.zza[i] = b;
                this.zzc = i2;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i = i2;
                throw new zzazg(i, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e3) {
            indexOutOfBoundsException = e3;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzq(int i) throws IOException {
        if (i >= 0) {
            zzr(i);
        } else {
            zzt(i);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzs(int i) throws IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzc = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzazg(i2, this.zzb, 4, e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzu(long j) throws IOException {
        int i = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzc = i + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzazg(i, this.zzb, 8, e2);
        }
    }

    public final void zzv(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzazg(this.zzc, this.zzb, i2, e2);
        }
    }

    public final void zzw(String str) throws IOException {
        int i = this.zzc;
        try {
            int iZzz = zzz(str.length() * 3);
            int iZzz2 = zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzbcw.zza(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = zzbcw.zzb(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + iZzz2;
            this.zzc = i3;
            int iZzb = zzbcw.zzb(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzr((iZzb - i) - iZzz2);
            this.zzc = iZzb;
        } catch (zzbcv e2) {
            this.zzc = i;
            zzF(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzazg(e3);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzx() {
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzr(int i) throws IOException {
        int i2;
        int i3 = this.zzc;
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zza[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i2;
                    throw new zzazg(i3, this.zzb, 1, e);
                }
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                throw new zzazg(i3, this.zzb, 1, e);
            }
        }
        i2 = i3 + 1;
        this.zza[i3] = (byte) i;
        this.zzc = i2;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzt(long j) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z = zzazi.zzb;
        int i2 = this.zzc;
        if (!z || this.zzb - i2 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i3 = i2 + 1;
                    try {
                        this.zza[i2] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i2 = i3;
                    } catch (IndexOutOfBoundsException e2) {
                        indexOutOfBoundsException = e2;
                        i2 = i3;
                        throw new zzazg(i2, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    indexOutOfBoundsException = e3;
                }
            }
            i = i2 + 1;
            try {
                this.zza[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i2 = i;
                throw new zzazg(i2, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzbct.zzp(this.zza, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzbct.zzp(this.zza, i2, (byte) j);
        }
        this.zzc = i;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final int zzc() {
        return this.zzb - this.zzc;
    }
}
