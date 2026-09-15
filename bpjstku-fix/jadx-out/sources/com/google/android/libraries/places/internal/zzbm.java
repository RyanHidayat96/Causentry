package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbm extends zzbae implements zzbbm {
    private static final zzbm zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private int zze = 1;
    private zzbo zzf;
    private zzbh zzg;
    private zzcs zzh;
    private zzbj zzi;
    private zzbq zzj;

    static {
        zzbm zzbmVar = new zzbm();
        zzk = zzbmVar;
        zzbae.zzbn(zzbm.class, zzbmVar);
    }

    private zzbm() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzb", "zze", zzbl.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzbm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbk(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbm.class) {
            zzazzVar = zzl;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzk);
                zzl = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
