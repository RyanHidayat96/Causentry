package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzbze {
    private final zzcbl zzf;
    private final List zze = new ArrayList();
    zzbzd[] zza = new zzbzd[8];
    int zzb = 7;
    int zzc = 0;
    int zzd = 0;
    private int zzg = 4096;
    private int zzh = 4096;

    zzbze(int i, int i2, zzcbz zzcbzVar) {
        this.zzf = zzcbp.zzc(zzcbzVar);
    }

    private final void zzf() {
        int i = this.zzh;
        int i2 = this.zzd;
        if (i < i2) {
            if (i == 0) {
                zzg();
            } else {
                zzh(i2 - i);
            }
        }
    }

    private final void zzg() {
        Arrays.fill(this.zza, (Object) null);
        this.zzb = this.zza.length - 1;
        this.zzc = 0;
        this.zzd = 0;
    }

    private final int zzh(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.zza.length;
            while (true) {
                length--;
                i2 = this.zzb;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.zza[length].zzh;
                i -= i4;
                this.zzd -= i4;
                this.zzc--;
                i3++;
            }
            zzbzd[] zzbzdVarArr = this.zza;
            int i5 = i2 + 1;
            System.arraycopy(zzbzdVarArr, i5, zzbzdVarArr, i5 + i3, this.zzc);
            this.zzb += i3;
        }
        return i3;
    }

    private final zzcbn zzj(int i) throws IOException {
        if (zzm(i)) {
            return zzbzg.zzb[i].zzf;
        }
        int length = zzbzg.zzb.length;
        int iZzi = zzi(i - 61);
        if (iZzi >= 0) {
            zzbzd[] zzbzdVarArr = this.zza;
            if (iZzi < zzbzdVarArr.length) {
                return zzbzdVarArr[iZzi].zzf;
            }
        }
        int i2 = i + 1;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 23);
        sb.append("Header index too large ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    private final void zzk(int i, zzbzd zzbzdVar) {
        this.zze.add(zzbzdVar);
        int i2 = zzbzdVar.zzh;
        int i3 = this.zzh;
        if (i2 > i3) {
            zzg();
            return;
        }
        zzh((this.zzd + i2) - i3);
        int i4 = this.zzc;
        zzbzd[] zzbzdVarArr = this.zza;
        int length = zzbzdVarArr.length;
        if (i4 + 1 > length) {
            zzbzd[] zzbzdVarArr2 = new zzbzd[length + length];
            System.arraycopy(zzbzdVarArr, 0, zzbzdVarArr2, length, length);
            this.zzb = this.zza.length - 1;
            this.zza = zzbzdVarArr2;
        }
        int i5 = this.zzb;
        this.zzb = i5 - 1;
        this.zza[i5] = zzbzdVar;
        this.zzc++;
        this.zzd += i2;
    }

    private final int zzl() throws IOException {
        return this.zzf.zzj() & UByte.MAX_VALUE;
    }

    private static final boolean zzm(int i) {
        if (i < 0) {
            return false;
        }
        int length = zzbzg.zzb.length;
        return i <= 60;
    }

    final void zza(int i) {
        this.zzg = i;
        this.zzh = i;
        zzf();
    }

    final void zzb() throws IOException {
        while (true) {
            zzcbl zzcblVar = this.zzf;
            if (zzcblVar.zzf()) {
                return;
            }
            byte bZzj = zzcblVar.zzj();
            int i = bZzj & UByte.MAX_VALUE;
            if (i == 128) {
                throw new IOException("index == 0");
            }
            if ((bZzj & ByteCompanionObject.MIN_VALUE) == 128) {
                int iZzd = zzd(i, 127);
                int i2 = iZzd - 1;
                if (!zzm(i2)) {
                    int length = zzbzg.zzb.length;
                    int iZzi = zzi(iZzd - 62);
                    if (iZzi >= 0) {
                        zzbzd[] zzbzdVarArr = this.zza;
                        if (iZzi <= zzbzdVarArr.length - 1) {
                            this.zze.add(zzbzdVarArr[iZzi]);
                        }
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzd).length() + 23);
                    sb.append("Header index too large ");
                    sb.append(iZzd);
                    throw new IOException(sb.toString());
                }
                this.zze.add(zzbzg.zzb[i2]);
            } else if (i == 64) {
                zzcbn zzcbnVarZze = zze();
                zzbzg.zza(zzcbnVarZze);
                zzk(-1, new zzbzd(zzcbnVarZze, zze()));
            } else if ((bZzj & 64) == 64) {
                zzk(-1, new zzbzd(zzj(zzd(i, 63) - 1), zze()));
            } else if ((bZzj & 32) == 32) {
                int iZzd2 = zzd(i, 31);
                this.zzh = iZzd2;
                if (iZzd2 < 0 || iZzd2 > this.zzg) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd2).length() + 34);
                    sb2.append("Invalid dynamic table size update ");
                    sb2.append(iZzd2);
                    throw new IOException(sb2.toString());
                }
                zzf();
            } else if (i == 16 || i == 0) {
                zzcbn zzcbnVarZze2 = zze();
                zzbzg.zza(zzcbnVarZze2);
                this.zze.add(new zzbzd(zzcbnVarZze2, zze()));
            } else {
                this.zze.add(new zzbzd(zzj(zzd(i, 15) - 1), zze()));
            }
        }
    }

    public final List zzc() {
        List list = this.zze;
        ArrayList arrayList = new ArrayList(list);
        list.clear();
        return arrayList;
    }

    final int zzd(int i, int i2) throws IOException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int iZzl = zzl();
            if ((iZzl & 128) == 0) {
                return i2 + (iZzl << i4);
            }
            i2 += (iZzl & 127) << i4;
            i4 += 7;
        }
    }

    final zzcbn zze() throws IOException {
        int iZzl = zzl();
        long jZzd = zzd(iZzl, 127);
        if ((iZzl & 128) != 128) {
            return this.zzf.zzn(jZzd);
        }
        return zzcbm.zzb(zzbzn.zza().zzb(this.zzf.zzr(jZzd)));
    }

    private final int zzi(int i) {
        return this.zzb + 1 + i;
    }
}
