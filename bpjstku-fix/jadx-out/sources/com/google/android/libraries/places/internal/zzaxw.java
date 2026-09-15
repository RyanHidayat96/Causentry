package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxw extends zzbae implements zzbbm {
    private static final zzaxw zzs;
    private static volatile zzbbt zzt;
    private int zzb;
    private int zzk;
    private zzaxv zzl;
    private int zzm;
    private zzaxm zzn;
    private boolean zzo;
    private double zzp;
    private boolean zzr;
    private String zze = "";
    private String zzf = "";
    private zzbao zzg = zzbae.zzbu();
    private zzbao zzh = zzbae.zzbu();
    private zzbao zzi = zzbae.zzbu();
    private zzbao zzj = zzbae.zzbu();
    private zzbam zzq = zzbr();

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzs = zzaxwVar;
        zzbae.zzbn(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    public static zzaxr zza() {
        return (zzaxr) zzs.zzbj();
    }

    final /* synthetic */ void zzd(String str) {
        this.zze = str;
    }

    final /* synthetic */ void zzf(Iterable iterable) {
        zzbao zzbaoVar = this.zzg;
        if (!zzbaoVar.zza()) {
            this.zzg = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzg);
    }

    final /* synthetic */ void zzg(Iterable iterable) {
        zzbao zzbaoVar = this.zzh;
        if (!zzbaoVar.zza()) {
            this.zzh = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzh);
    }

    final /* synthetic */ void zzh(Iterable iterable) {
        zzbao zzbaoVar = this.zzi;
        if (!zzbaoVar.zza()) {
            this.zzi = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzi);
    }

    final /* synthetic */ void zzi(Iterable iterable) {
        zzbao zzbaoVar = this.zzj;
        if (!zzbaoVar.zza()) {
            this.zzj = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzj);
    }

    final /* synthetic */ void zzk(zzaxv zzaxvVar) {
        this.zzl = zzaxvVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzl(zzaxm zzaxmVar) {
        this.zzn = zzaxmVar;
        this.zzb |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzs, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ț\u0005Ț\u0006Ț\u0007\u0004\bဉ\u0000\t\f\nဉ\u0001\u000b\u0007\f\u0000\r,\u000e\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzaxw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxr(bArr);
        }
        if (i2 == 5) {
            return zzs;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzt;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaxw.class) {
            zzazzVar = zzt;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzs);
                zzt = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzaxw zzc() {
        return zzs;
    }

    final /* synthetic */ void zze(String str) {
        this.zzf = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzk = i;
    }

    final /* synthetic */ void zzn(int i) {
        this.zzm = i - 2;
    }
}
