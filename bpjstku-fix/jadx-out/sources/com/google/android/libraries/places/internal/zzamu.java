package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzamu extends zzbae implements zzbbm {
    private static final zzamu zzp;
    private static volatile zzbbt zzq;
    private int zzb;
    private int zze;
    private boolean zzg;
    private double zzh;
    private int zzi;
    private boolean zzk;
    private zzamd zzl;
    private zzams zzm;
    private zzani zzn;
    private boolean zzo;
    private String zzf = "";
    private zzbam zzj = zzbr();

    static {
        zzamu zzamuVar = new zzamu();
        zzp = zzamuVar;
        zzbae.zzbn(zzamu.class, zzamuVar);
    }

    private zzamu() {
    }

    public static zzamq zza() {
        return (zzamq) zzp.zzbj();
    }

    final /* synthetic */ void zzg(Iterable iterable) {
        zzbam zzbamVar = this.zzj;
        if (!zzbamVar.zza()) {
            this.zzj = zzbae.zzbs(zzbamVar);
        }
        zzaym.zzbc(iterable, this.zzj);
    }

    final /* synthetic */ void zzi(zzamd zzamdVar) {
        this.zzl = zzamdVar;
        this.zzb |= 64;
    }

    final /* synthetic */ void zzj(zzams zzamsVar) {
        this.zzm = zzamsVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void zzk(zzani zzaniVar) {
        this.zzn = zzaniVar;
        this.zzb |= 256;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004က\u0003\u0005င\u0004\u0006'\u0007ဇ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဇ\t", new Object[]{"zzb", "zze", zzamt.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new zzamu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzamq(bArr);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzq;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzamu.class) {
            zzazzVar = zzq;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzp);
                zzq = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    final /* synthetic */ void zze(double d) {
        this.zzb |= 8;
        this.zzh = d;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzb |= 16;
        this.zzi = i;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zzb |= 32;
        this.zzk = z;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzb |= 512;
        this.zzo = z;
    }

    final /* synthetic */ void zzn(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
