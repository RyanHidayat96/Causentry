package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakm extends zzbae implements zzbbm {
    private static final zzakm zzx;
    private static volatile zzbbt zzy;
    private int zzb;
    private int zze;
    private int zzf = 1;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private zzakh zzv;
    private int zzw;

    static {
        zzakm zzakmVar = new zzakm();
        zzx = zzakmVar;
        zzbae.zzbn(zzakm.class, zzakmVar);
    }

    private zzakm() {
    }

    public static zzaki zza() {
        return (zzaki) zzx.zzbj();
    }

    final /* synthetic */ void zzo(zzakh zzakhVar) {
        this.zzv = zzakhVar;
        this.zzb |= 131072;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzx, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\nဋ\t\u000bဋ\n\fဋ\u000b\rဇ\f\u000eဋ\r\u000fဋ\b\u0010ဋ\u000e\u0011᠌\u000f\u0012᠌\u0010\u0013ဉ\u0011\u0014င\u0012", new Object[]{"zzb", "zze", zzakl.zza, "zzf", zzake.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzm", "zzs", "zzt", zzakj.zza, "zzu", zzakk.zza, "zzv", "zzw"});
        }
        if (i2 == 3) {
            return new zzakm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaki(bArr);
        }
        if (i2 == 5) {
            return zzx;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzy;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzakm.class) {
            zzazzVar = zzy;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzx);
                zzy = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzb |= 32;
        this.zzj = i;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb |= 64;
        this.zzk = i;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzb |= 128;
        this.zzl = i;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzb |= 256;
        this.zzm = i;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzb |= 512;
        this.zzn = i;
    }

    final /* synthetic */ void zzk(int i) {
        this.zzb |= 1024;
        this.zzo = i;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzb |= 2048;
        this.zzp = i;
    }

    final /* synthetic */ void zzm(boolean z) {
        this.zzb |= 4096;
        this.zzq = z;
    }

    final /* synthetic */ void zzn(int i) {
        this.zzb |= 8192;
        this.zzr = i;
    }

    final /* synthetic */ void zzp(int i) {
        this.zzb |= 262144;
        this.zzw = i;
    }

    final /* synthetic */ void zzr(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzs(int i) {
        this.zzf = i;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzt(int i) {
        this.zzu = i - 1;
        this.zzb |= 65536;
    }
}
