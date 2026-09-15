package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbye {
    final /* synthetic */ zzbyh zza;
    private final zzcbj zzb;
    private final int zzc;
    private int zzd;
    private int zze;
    private final zzbyd zzf;
    private boolean zzg;

    zzbye(zzbyh zzbyhVar, int i, int i2, zzbyd zzbydVar) {
        Objects.requireNonNull(zzbyhVar);
        this.zza = zzbyhVar;
        this.zzb = new zzcbj();
        this.zzg = false;
        this.zzc = i;
        this.zzd = i2;
        this.zzf = zzbydVar;
    }

    final int zzd() {
        return Math.max(0, Math.min(this.zzd, (int) this.zzb.zzb())) - this.zze;
    }

    final int zzf(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.zzd) {
            int i2 = this.zzd + i;
            this.zzd = i2;
            return i2;
        }
        int i3 = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 33);
        sb.append("Window size overflow for stream: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    final int zzg() {
        return Math.min(this.zzd, this.zza.zzh().zzd);
    }

    final int zzi(int i, zzbyg zzbygVar) {
        int iMin = Math.min(i, zzg());
        int iZzb = 0;
        while (zzh() && iMin > 0) {
            zzcbj zzcbjVar = this.zzb;
            if (iMin >= zzcbjVar.zzb()) {
                iZzb += (int) zzcbjVar.zzb();
                zzj(zzcbjVar, (int) zzcbjVar.zzb(), this.zzg);
            } else {
                iZzb += iMin;
                zzj(zzcbjVar, iMin, false);
            }
            zzbygVar.zza++;
            iMin = Math.min(i - iZzb, zzg());
        }
        return iZzb;
    }

    final void zzj(zzcbj zzcbjVar, int i, boolean z) {
        do {
            zzbyh zzbyhVar = this.zza;
            int iMin = Math.min(i, zzbyhVar.zzg().zzg());
            int i2 = -iMin;
            zzbyhVar.zzh().zzf(i2);
            zzf(i2);
            try {
                boolean z2 = false;
                if (zzcbjVar.zzb() == iMin && z) {
                    z2 = true;
                }
                zzbyhVar.zzg().zzh(z2, this.zzc, zzcbjVar, iMin);
                this.zzf.zzt(iMin);
                i -= iMin;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } while (i > 0);
    }

    final void zzk(zzcbj zzcbjVar, int i, boolean z) {
        this.zzb.zzc(zzcbjVar, i);
        this.zzg |= z;
    }

    final int zza() {
        return this.zzd;
    }

    final void zzb(int i) {
        this.zze += i;
    }

    final int zzc() {
        return this.zze;
    }

    final void zze() {
        this.zze = 0;
    }

    final boolean zzh() {
        return this.zzb.zzb() > 0;
    }
}
