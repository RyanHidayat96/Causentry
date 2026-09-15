package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaip extends zzbae implements zzbbm {
    private static final zzaip zzt;
    private static volatile zzbbt zzu;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzaid zzj;
    private zzahw zzk;
    private zzahs zzl;
    private zzanl zzm;
    private zzahy zzn;
    private zzaib zzo;
    private zzann zzp;
    private zzanv zzq;
    private zzanr zzr;
    private int zzs;

    static {
        zzaip zzaipVar = new zzaip();
        zzt = zzaipVar;
        zzbae.zzbn(zzaip.class, zzaipVar);
    }

    private zzaip() {
    }

    public static zzaik zza() {
        return (zzaik) zzt.zzbj();
    }

    final /* synthetic */ void zzd(zzaid zzaidVar) {
        this.zzj = zzaidVar;
        this.zzb |= 32;
    }

    final /* synthetic */ void zze(zzahs zzahsVar) {
        this.zzl = zzahsVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void zzf(zzahy zzahyVar) {
        this.zzn = zzahyVar;
        this.zzb |= 512;
    }

    final /* synthetic */ void zzg(zzanv zzanvVar) {
        this.zzq = zzanvVar;
        this.zzb |= 4096;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzt, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000f᠌\u000e", new Object[]{"zzb", "zze", zzaim.zza, "zzf", zzaio.zza, "zzg", "zzh", zzail.zza, "zzi", zzaij.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", zzain.zza});
        }
        if (i2 == 3) {
            return new zzaip();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaik(bArr);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzu;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaip.class) {
            zzazzVar = zzu;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzt);
                zzu = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(int i) {
        this.zzb |= 4;
        this.zzg = i;
    }

    final /* synthetic */ void zzi(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }
}
