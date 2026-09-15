package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class zzazh extends zzaze {
    private final OutputStream zzg;

    zzazh(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzI(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzJ();
        }
    }

    private final void zzJ() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzK(int i, int i2) throws IOException {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzL(int i, int i2) throws IOException {
        zzI(20);
        zze(i << 3);
        if (i2 >= 0) {
            zze(i2);
        } else {
            zzf(i2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzM(int i, int i2) throws IOException {
        zzI(20);
        zze(i << 3);
        zze(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzN(int i, int i2) throws IOException {
        zzI(14);
        zze((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzO(int i, long j) throws IOException {
        zzI(20);
        zze(i << 3);
        zzf(j);
    }

    @Override // com.google.android.libraries.places.internal.zzazi, com.google.android.libraries.places.internal.zzays
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzw(bArr, 0, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzi(int i, long j) throws IOException {
        zzI(18);
        zze((i << 3) | 1);
        zzh(j);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzj(int i, boolean z) throws IOException {
        zzI(11);
        zze(i << 3);
        zzd(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzk(int i, String str) throws IOException {
        zzr((i << 3) | 2);
        zzv(str);
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
        if (this.zzc == this.zzb) {
            zzJ();
        }
        zzd(b);
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
    public final void zzr(int i) throws IOException {
        zzI(5);
        zze(i);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzs(int i) throws IOException {
        zzI(4);
        zzg(i);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzt(long j) throws IOException {
        zzI(10);
        zzf(j);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzu(long j) throws IOException {
        zzI(8);
        zzh(j);
    }

    public final void zzv(String str) throws IOException {
        int iZza;
        try {
            int length = str.length() * 3;
            int iZzz = zzz(length);
            int i = iZzz + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iZzb = zzbcw.zzb(str, bArr, 0, length);
                zzr(iZzb);
                zzw(bArr, 0, iZzb);
                return;
            }
            if (i > i2 - this.zzc) {
                zzJ();
            }
            int iZzz2 = zzz(str.length());
            int i3 = this.zzc;
            try {
                if (iZzz2 == iZzz) {
                    int i4 = i3 + iZzz2;
                    this.zzc = i4;
                    int iZzb2 = zzbcw.zzb(str, this.zza, i4, i2 - i4);
                    this.zzc = i3;
                    iZza = (iZzb2 - i3) - iZzz2;
                    zze(iZza);
                    this.zzc = iZzb2;
                } else {
                    iZza = zzbcw.zza(str);
                    zze(iZza);
                    this.zzc = zzbcw.zzb(str, this.zza, this.zzc, iZza);
                }
                this.zzd += iZza;
            } catch (zzbcv e2) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new zzazg(e3);
            }
        } catch (zzbcv e4) {
            zzF(str, e4);
        }
    }

    public final void zzw(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, 0, bArr2, i4, i5);
        this.zzc = i3;
        this.zzd += i5;
        zzJ();
        int i6 = i2 - i5;
        if (i6 <= i3) {
            System.arraycopy(bArr, i5, bArr2, 0, i6);
            this.zzc = i6;
        } else {
            this.zzg.write(bArr, i5, i6);
        }
        this.zzd += i6;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzx() throws IOException {
        if (this.zzc > 0) {
            zzJ();
        }
    }
}
