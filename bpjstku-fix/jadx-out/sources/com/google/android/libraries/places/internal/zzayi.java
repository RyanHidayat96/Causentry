package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayi extends zzbae implements zzbbm {
    private static final zzayi zzw;
    private static volatile zzbbt zzx;
    private int zzb;
    private int zzh;
    private boolean zzj;
    private double zzk;
    private int zzl;
    private int zzm;
    private boolean zzp;
    private zzayd zzq;
    private zzayf zzr;
    private zzayb zzs;
    private zzaxm zzt;
    private zzayh zzu;
    private boolean zzv;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzn = "";
    private zzbam zzo = zzbr();

    static {
        zzayi zzayiVar = new zzayi();
        zzw = zzayiVar;
        zzbae.zzbn(zzayi.class, zzayiVar);
    }

    private zzayi() {
    }

    public static zzaxz zza() {
        return (zzaxz) zzw.zzbj();
    }

    final /* synthetic */ void zzd(String str) {
        this.zze = str;
    }

    final /* synthetic */ void zze(String str) {
        this.zzf = str;
    }

    final /* synthetic */ void zzk(Iterable iterable) {
        zzbam zzbamVar = this.zzo;
        if (!zzbamVar.zza()) {
            this.zzo = zzbae.zzbs(zzbamVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzo.zzh(((zzaxc) it.next()).zza());
        }
    }

    final /* synthetic */ void zzm(zzayd zzaydVar) {
        this.zzq = zzaydVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzn(zzayf zzayfVar) {
        this.zzr = zzayfVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzo(zzayb zzaybVar) {
        this.zzs = zzaybVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzp(zzaxm zzaxmVar) {
        this.zzt = zzaxmVar;
        this.zzb |= 8;
    }

    final /* synthetic */ void zzq(zzayh zzayhVar) {
        this.zzu = zzayhVar;
        this.zzb |= 16;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzw, "\u0000\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007\u0007\t\u0000\n\u0004\u000b,\f\u0007\rဉ\u0000\u000eဉ\u0001\u000fဉ\u0002\u0010ဉ\u0003\u0011ဉ\u0004\u0012\u0004\u0013Ȉ\u0014\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzm", "zzn", "zzv"});
        }
        if (i2 == 3) {
            return new zzayi();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxz(bArr);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzx;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzayi.class) {
            zzazzVar = zzx;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzw);
                zzx = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzayi zzc() {
        return zzw;
    }

    final /* synthetic */ void zzf(String str) {
        this.zzg = str;
    }

    final /* synthetic */ void zzg(String str) {
        this.zzi = str;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zzj = z;
    }

    final /* synthetic */ void zzi(double d) {
        this.zzk = d;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzl = i;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzp = z;
    }

    final /* synthetic */ void zzr(boolean z) {
        this.zzv = true;
    }

    final /* synthetic */ void zzt(int i) {
        this.zzh = i - 2;
    }
}
