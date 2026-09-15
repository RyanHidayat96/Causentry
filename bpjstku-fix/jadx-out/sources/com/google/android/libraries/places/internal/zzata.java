package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzata extends zzbae implements zzbbm {
    private static final zzata zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private zzasx zzf;
    private zzasz zzg;
    private zzbee zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private String zze = "";
    private zzbao zzh = zzbae.zzbu();
    private zzbao zzi = zzbae.zzbu();
    private String zzj = "";
    private String zzk = "";
    private String zzo = "";

    static {
        zzata zzataVar = new zzata();
        zzq = zzataVar;
        zzbae.zzbn(zzata.class, zzataVar);
    }

    private zzata() {
    }

    public static zzasv zza() {
        return (zzasv) zzq.zzbj();
    }

    final /* synthetic */ void zzd(String str) {
        this.zze = str;
    }

    final /* synthetic */ void zze(zzasx zzasxVar) {
        this.zzf = zzasxVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzf(zzasz zzaszVar) {
        this.zzg = zzaszVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzg(String str) {
        zzbao zzbaoVar = this.zzh;
        if (!zzbaoVar.zza()) {
            this.zzh = zzbae.zzbv(zzbaoVar);
        }
        this.zzh.add(str);
    }

    final /* synthetic */ void zzh(String str) {
        zzbao zzbaoVar = this.zzi;
        if (!zzbaoVar.zza()) {
            this.zzi = zzbae.zzbv(zzbaoVar);
        }
        this.zzi.add(str);
    }

    final /* synthetic */ void zzi(String str) {
        this.zzj = str;
    }

    final /* synthetic */ void zzk(zzbee zzbeeVar) {
        this.zzl = zzbeeVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzm(String str) {
        this.zzo = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzq, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ț\u0005Ț\u0006Ȉ\u0007Ȉ\bဉ\u0002\t\u0004\n\u0007\u000bȈ\f\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzata();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzasv(bArr);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzr;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzata.class) {
            zzazzVar = zzr;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzq);
                zzr = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzata zzc() {
        return zzq;
    }

    final /* synthetic */ void zzj(String str) {
        this.zzk = str;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzm = i;
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zzp = true;
    }
}
