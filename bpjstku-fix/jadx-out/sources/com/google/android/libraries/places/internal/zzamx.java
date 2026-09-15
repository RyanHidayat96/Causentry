package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzamx extends zzbae implements zzbbm {
    private static final zzamx zzn;
    private static volatile zzbbt zzo;
    private int zzb;
    private int zze;
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzg = zzbae.zzbu();
    private zzbao zzh = zzbae.zzbu();
    private zzbao zzi = zzbae.zzbu();
    private int zzj;
    private zzamd zzk;
    private zzani zzl;
    private boolean zzm;

    static {
        zzamx zzamxVar = new zzamx();
        zzn = zzamxVar;
        zzbae.zzbn(zzamx.class, zzamxVar);
    }

    private zzamx() {
    }

    public static zzamv zza() {
        return (zzamv) zzn.zzbj();
    }

    final /* synthetic */ void zzc(Iterable iterable) {
        zzbao zzbaoVar = this.zzf;
        if (!zzbaoVar.zza()) {
            this.zzf = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzf);
    }

    final /* synthetic */ void zzd(Iterable iterable) {
        zzbao zzbaoVar = this.zzg;
        if (!zzbaoVar.zza()) {
            this.zzg = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzg);
    }

    final /* synthetic */ void zze(Iterable iterable) {
        zzbao zzbaoVar = this.zzh;
        if (!zzbaoVar.zza()) {
            this.zzh = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzh);
    }

    final /* synthetic */ void zzf(Iterable iterable) {
        zzbao zzbaoVar = this.zzi;
        if (!zzbaoVar.zza()) {
            this.zzi = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzi);
    }

    final /* synthetic */ void zzh(zzamd zzamdVar) {
        this.zzk = zzamdVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzi(zzani zzaniVar) {
        this.zzl = zzaniVar;
        this.zzb |= 8;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001᠌\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0006င\u0001\u0007ဉ\u0002\bဉ\u0003\tဇ\u0004", new Object[]{"zzb", "zze", zzamw.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzamx();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzamv(bArr);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzo;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzamx.class) {
            zzazzVar = zzo;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzn);
                zzo = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb |= 2;
        this.zzj = i;
    }

    final /* synthetic */ void zzj(boolean z) {
        this.zzb |= 16;
        this.zzm = z;
    }

    final /* synthetic */ void zzl(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
