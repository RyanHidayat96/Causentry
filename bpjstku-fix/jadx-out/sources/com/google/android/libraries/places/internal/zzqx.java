package com.google.android.libraries.places.internal;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzqx {
    private final int[] zza;
    private final zzqv zzb;
    private zzqv zzc;
    private int zzd;
    private int zze;
    private int zzf;

    private zzqx(int[] iArr) {
        this.zza = iArr;
        zzqv zzqvVar = new zzqv(-1, -1, null);
        this.zzb = zzqvVar;
        this.zzc = zzqvVar;
    }

    static zzqx zza(int[] iArr) {
        zzqx zzqxVar = new zzqx(iArr);
        for (int i = 0; i < iArr.length; i++) {
            zzqxVar.zzf++;
            int[] iArr2 = zzqxVar.zza;
            int i2 = iArr2[i];
            while (true) {
                zzqv zzqvVar = null;
                while (true) {
                    if (zzqxVar.zzf <= 0) {
                        break;
                    }
                    if (zzqxVar.zze == 0) {
                        break;
                    }
                    int i3 = ((zzqv) zzqxVar.zzc.zzd.get(Integer.valueOf(iArr2[zzqxVar.zzd]))).zza;
                    int i4 = zzqxVar.zze;
                    if (iArr2[i3 + i4] == i2) {
                        if (zzqvVar != null) {
                            zzqvVar.zzc = zzqxVar.zzc;
                        }
                        zzqxVar.zze = i4 + 1;
                        zzqxVar.zzb();
                        break;
                    }
                    zzqv zzqvVar2 = (zzqv) zzqxVar.zzc.zzd.get(Integer.valueOf(iArr2[zzqxVar.zzd]));
                    int i5 = zzqvVar2.zza;
                    zzqv zzqvVar3 = new zzqv(i5, (zzqxVar.zze + i5) - 1, null);
                    zzqxVar.zzc.zzd.put(Integer.valueOf(iArr2[zzqxVar.zzd]), zzqvVar3);
                    Map map = zzqvVar3.zzd;
                    int i6 = zzqvVar3.zzb + 1;
                    map.put(Integer.valueOf(iArr2[i6]), zzqvVar2);
                    zzqvVar2.zza = i6;
                    if (zzqvVar != null) {
                        zzqvVar.zzc = zzqvVar3;
                    }
                    map.put(Integer.valueOf(i2), new zzqv(i, BasicMeasure.EXACTLY, null));
                    zzqxVar.zzf--;
                    zzqxVar.zzc();
                    zzqvVar = zzqvVar3;
                }
                Map map2 = zzqxVar.zzc.zzd;
                Integer numValueOf = Integer.valueOf(i2);
                if (map2.containsKey(numValueOf)) {
                    if (zzqvVar != null) {
                        zzqvVar.zzc = zzqxVar.zzc;
                    }
                    zzqxVar.zzd = i;
                    zzqxVar.zze++;
                    zzqxVar.zzb();
                    break;
                }
                zzqxVar.zzc.zzd.put(numValueOf, new zzqv(i, BasicMeasure.EXACTLY, null));
                if (zzqvVar != null) {
                    zzqvVar.zzc = zzqxVar.zzc;
                }
                zzqxVar.zzf--;
                zzqxVar.zzc();
            }
        }
        return zzqxVar;
    }

    private final void zze(zzqv zzqvVar, StringBuilder sb) {
        for (zzqv zzqvVar2 : zzqvVar.zzd.values()) {
            sb.append("  ");
            sb.append(zzqvVar);
            sb.append(" -> ");
            sb.append(zzqvVar2);
            sb.append(" [label=\"");
            int[] iArr = this.zza;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, zzqvVar2.zza, Math.min(iArr.length, zzqvVar2.zzb + 1))));
            sb.append("\"]\n");
            zze(zzqvVar2, sb);
        }
    }

    private final boolean zzf(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.zza;
            int length = iArr.length;
            int iMin = Math.min(length, i2);
            if (iMin - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= iMin; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        zze(this.zzb, sb);
        sb.append("}");
        return sb.toString();
    }

    final void zzb() {
        if (this.zze == 0) {
            return;
        }
        Map map = this.zzc.zzd;
        int[] iArr = this.zza;
        zzqv zzqvVar = (zzqv) map.get(Integer.valueOf(iArr[this.zzd]));
        while (true) {
            int i = (zzqvVar.zzb - zzqvVar.zza) + 1;
            int i2 = this.zze;
            if (i > i2) {
                return;
            }
            int i3 = this.zzd + i;
            this.zzd = i3;
            this.zzc = zzqvVar;
            int i4 = i2 - i;
            this.zze = i4;
            if (i4 > 0) {
                zzqvVar = (zzqv) zzqvVar.zzd.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    final void zzc() {
        zzqv zzqvVar = this.zzc.zzc;
        if (zzqvVar != null) {
            this.zzc = zzqvVar;
        } else {
            this.zzc = this.zzb;
            int i = this.zze;
            if (i > 0) {
                this.zze = i - 1;
            }
            if (this.zzf > 0) {
                this.zzd++;
            }
        }
        zzb();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    public final zzqw zzd() {
        int i;
        int i2;
        zzqu zzquVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        zzqv zzqvVar = this.zzb;
        zzqu zzquVar2 = new zzqu(zzqvVar, 0, -1, -1, null);
        arrayDeque.push(zzquVar2);
        while (!arrayDeque.isEmpty()) {
            zzqu zzquVar3 = (zzqu) arrayDeque.pop();
            for (zzqv zzqvVar2 : zzquVar3.zzd.zzd.values()) {
                int i3 = zzquVar3.zzb;
                int i4 = zzquVar3.zzc;
                int i5 = zzqvVar2.zza;
                int i6 = zzqvVar2.zzb;
                if (zzf(i3, i4, i5, i6)) {
                    zzquVar = new zzqu(zzqvVar2, zzquVar3.zza + 1, i3, i4, null);
                } else {
                    if (zzqvVar2.zzd.isEmpty()) {
                        int i7 = zzqvVar2.zza;
                        if (zzf(i3, i4, i7, (i7 + i4) - i3)) {
                            zzquVar = new zzqu(zzqvVar2, zzquVar3.zza + 1, i3, i4, null);
                        }
                    }
                    zzquVar = new zzqu(zzqvVar2, 1, zzqvVar2.zza, i6, null);
                }
                if (zzquVar2.zza < zzquVar.zza) {
                    zzquVar2 = zzquVar;
                }
                arrayDeque.push(zzquVar);
            }
        }
        int[] iArr = this.zza;
        int iMin = Math.min(iArr.length, zzquVar2.zzc + 1);
        int i8 = 0;
        loop2: while (true) {
            i = zzquVar2.zzb;
            i2 = iMin - i;
            zzqvVar = (zzqv) zzqvVar.zzd.get(Integer.valueOf(iArr[(i8 % i2) + i]));
            if (zzqvVar == null) {
                break;
            }
            for (int i9 = zzqvVar.zza; i9 < zzqvVar.zzb + 1 && i9 < iArr.length; i9++) {
                if (iArr[(i8 % i2) + i] != iArr[i9]) {
                    break loop2;
                }
                i8++;
            }
        }
        return new zzqw(i, iMin, i8 / i2);
    }
}
