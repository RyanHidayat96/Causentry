package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzf {
    int zzb;
    private final zzcbj zzc;
    private int zze;
    zzbzd[] zza = new zzbzd[8];
    private int zzd = 7;

    zzbzf(int i, boolean z, zzcbj zzcbjVar) {
        this.zzc = zzcbjVar;
    }

    private final void zzd(zzbzd zzbzdVar) {
        int i;
        int i2 = zzbzdVar.zzh;
        if (i2 > 4096) {
            Arrays.fill(this.zza, (Object) null);
            this.zzd = this.zza.length - 1;
            this.zzb = 0;
            this.zze = 0;
            return;
        }
        int i3 = (this.zze + i2) - 4096;
        if (i3 > 0) {
            int length = this.zza.length - 1;
            int i4 = 0;
            while (true) {
                i = this.zzd;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.zza[length].zzh;
                i3 -= i5;
                this.zze -= i5;
                this.zzb--;
                i4++;
                length--;
            }
            zzbzd[] zzbzdVarArr = this.zza;
            int i6 = i + 1;
            System.arraycopy(zzbzdVarArr, i6, zzbzdVarArr, i6 + i4, this.zzb);
            this.zzd += i4;
        }
        int i7 = this.zzb;
        zzbzd[] zzbzdVarArr2 = this.zza;
        int length2 = zzbzdVarArr2.length;
        if (i7 + 1 > length2) {
            zzbzd[] zzbzdVarArr3 = new zzbzd[length2 + length2];
            System.arraycopy(zzbzdVarArr2, 0, zzbzdVarArr3, length2, length2);
            this.zzd = this.zza.length - 1;
            this.zza = zzbzdVarArr3;
        }
        int i8 = this.zzd;
        this.zzd = i8 - 1;
        this.zza[i8] = zzbzdVar;
        this.zzb++;
        this.zze += i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    final void zza(List list) throws IOException {
        int i;
        int i2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzbzd zzbzdVar = (zzbzd) list.get(i3);
            zzcbn zzcbnVarZzh = zzbzdVar.zzf.zzh();
            zzcbn zzcbnVar = zzbzdVar.zzg;
            Integer num = (Integer) zzbzg.zzc.get(zzcbnVarZzh);
            if (num != null) {
                int iIntValue = num.intValue();
                i2 = iIntValue + 1;
                if (i2 < 2 || i2 > 7) {
                    i = -1;
                } else if (zzbzg.zzb[iIntValue].zzg.equals(zzcbnVar)) {
                    i = i2;
                } else if (zzbzg.zzb[i2].zzg.equals(zzcbnVar)) {
                    i = iIntValue + 2;
                } else {
                    i = -1;
                }
            } else {
                i = -1;
                i2 = -1;
            }
            if (i == -1) {
                int i4 = this.zzd;
                while (true) {
                    i4++;
                    zzbzd[] zzbzdVarArr = this.zza;
                    if (i4 >= zzbzdVarArr.length) {
                        i = -1;
                        break;
                    }
                    if (zzbzdVarArr[i4].zzf.equals(zzcbnVarZzh)) {
                        if (this.zza[i4].zzg.equals(zzcbnVar)) {
                            int i5 = this.zzd;
                            int length = zzbzg.zzb.length;
                            i = (i4 - i5) + 61;
                            break;
                        } else if (i2 == -1) {
                            int i6 = this.zzd;
                            int length2 = zzbzg.zzb.length;
                            i2 = (i4 - i6) + 61;
                        }
                    }
                }
            }
            if (i != -1) {
                zzb(i, 127, 128);
            } else if (i2 == -1) {
                this.zzc.zzA(64);
                zzc(zzcbnVarZzh);
                zzc(zzcbnVar);
                zzd(zzbzdVar);
            } else if (!zzcbnVarZzh.zzp(zzbzg.zza) || zzbzd.zze.equals(zzcbnVarZzh)) {
                zzb(i2, 63, 64);
                zzc(zzcbnVar);
                zzd(zzbzdVar);
            } else {
                zzb(i2, 15, 0);
                zzc(zzcbnVar);
            }
        }
    }

    final void zzb(int i, int i2, int i3) throws IOException {
        if (i < i2) {
            this.zzc.zzA(i | i3);
            return;
        }
        zzcbj zzcbjVar = this.zzc;
        zzcbjVar.zzA(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            zzcbjVar.zzA(128 | (i4 & 127));
            i4 >>>= 7;
        }
        zzcbjVar.zzA(i4);
    }

    final void zzc(zzcbn zzcbnVar) throws IOException {
        zzb(zzcbnVar.zzj(), 127, 0);
        this.zzc.zzu(zzcbnVar);
    }
}
