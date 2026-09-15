package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxm extends zzbae implements zzbbm {
    private static final zzaxm zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzbee zze;
    private int zzf;
    private zzaxk zzg;
    private int zzh;

    static {
        zzaxm zzaxmVar = new zzaxm();
        zzi = zzaxmVar;
        zzbae.zzbn(zzaxm.class, zzaxmVar);
    }

    private zzaxm() {
    }

    public static zzaxl zza() {
        return (zzaxl) zzi.zzbj();
    }

    final /* synthetic */ void zzc(zzbee zzbeeVar) {
        this.zze = zzbeeVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzd(zzaxk zzaxkVar) {
        this.zzg = zzaxkVar;
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
            return zzbo(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzaxm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxl(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaxm.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzf = i - 2;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzh = i - 2;
    }
}
