package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvx extends zzbae implements zzbbm {
    private static final zzvx zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private int zze;
    private zzvz zzf;
    private zzwh zzg;
    private zzwc zzh;
    private zzwf zzi;

    static {
        zzvx zzvxVar = new zzvx();
        zzj = zzvxVar;
        zzbae.zzbn(zzvx.class, zzvxVar);
    }

    private zzvx() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", zzvw.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzvx();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzvv(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzvx.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
