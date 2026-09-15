package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
final class zzbyh {
    private final zzbyf zza;
    private final zzbzc zzb;
    private int zzc;
    private final zzbye zzd;

    public zzbyh(zzbyf zzbyfVar, zzbzc zzbzcVar) {
        if (zzbyfVar == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_TRANSPORT);
        }
        this.zza = zzbyfVar;
        if (zzbzcVar == null) {
            throw new NullPointerException("frameWriter");
        }
        this.zzb = zzbzcVar;
        this.zzc = 65535;
        this.zzd = new zzbye(this, 0, 65535, null);
    }

    public final boolean zza(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 29);
            sb.append("Invalid initial window size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = i - this.zzc;
        this.zzc = i;
        for (zzbye zzbyeVar : this.zza.zzm()) {
            zzbyeVar.zzf(i2);
        }
        return i2 > 0;
    }

    public final int zzb(zzbye zzbyeVar, int i) {
        if (zzbyeVar == null) {
            int iZzf = this.zzd.zzf(i);
            zzf();
            return iZzf;
        }
        int iZzf2 = zzbyeVar.zzf(i);
        zzbyg zzbygVar = new zzbyg(null);
        zzbyeVar.zzi(zzbyeVar.zzg(), zzbygVar);
        if (!zzbygVar.zza()) {
            return iZzf2;
        }
        zzd();
        return iZzf2;
    }

    public final zzbye zze(zzbyd zzbydVar, int i) {
        int i2 = this.zzc;
        if (zzbydVar != null) {
            return new zzbye(this, i, i2, zzbydVar);
        }
        throw new NullPointerException("stream");
    }

    public final void zzf() {
        int i;
        zzbyf zzbyfVar = this.zza;
        zzbye[] zzbyeVarArrZzm = zzbyfVar.zzm();
        Collections.shuffle(Arrays.asList(zzbyeVarArrZzm));
        int length = zzbyeVarArrZzm.length;
        int iZza = this.zzd.zza();
        while (true) {
            i = 0;
            if (length <= 0 || iZza <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iZza / length);
            for (int i2 = 0; i2 < length && iZza > 0; i2++) {
                zzbye zzbyeVar = zzbyeVarArrZzm[i2];
                int iMin = Math.min(iZza, Math.min(zzbyeVar.zzd(), iCeil));
                if (iMin > 0) {
                    zzbyeVar.zzb(iMin);
                    iZza -= iMin;
                }
                if (zzbyeVar.zzd() > 0) {
                    zzbyeVarArrZzm[i] = zzbyeVar;
                    i++;
                }
            }
            length = i;
        }
        zzbyg zzbygVar = new zzbyg(null);
        zzbye[] zzbyeVarArrZzm2 = zzbyfVar.zzm();
        int length2 = zzbyeVarArrZzm2.length;
        while (i < length2) {
            zzbye zzbyeVar2 = zzbyeVarArrZzm2[i];
            zzbyeVar2.zzi(zzbyeVar2.zzc(), zzbygVar);
            zzbyeVar2.zze();
            i++;
        }
        if (zzbygVar.zza()) {
            zzd();
        }
    }

    public final void zzc(boolean z, zzbye zzbyeVar, zzcbj zzcbjVar, boolean z2) {
        if (zzcbjVar == null) {
            throw new NullPointerException("source");
        }
        int iZzg = zzbyeVar.zzg();
        boolean zZzh = zzbyeVar.zzh();
        int iZzb = (int) zzcbjVar.zzb();
        if (zZzh || iZzg < iZzb) {
            if (!zZzh && iZzg > 0) {
                zzbyeVar.zzj(zzcbjVar, iZzg, false);
            }
            zzbyeVar.zzk(zzcbjVar, (int) zzcbjVar.zzb(), z);
        } else {
            zzbyeVar.zzj(zzcbjVar, iZzb, z);
        }
        if (z2) {
            zzd();
        }
    }

    public final void zzd() {
        try {
            this.zzb.zze();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    final /* synthetic */ zzbzc zzg() {
        return this.zzb;
    }

    final /* synthetic */ zzbye zzh() {
        return this.zzd;
    }
}
