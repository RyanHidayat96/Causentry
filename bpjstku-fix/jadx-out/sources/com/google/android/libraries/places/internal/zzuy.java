package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzuy extends zzbae implements zzbbm {
    private static final zzuy zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzvc zze;
    private zzva zzf;
    private zzuu zzg;
    private zzus zzh;

    static {
        zzuy zzuyVar = new zzuy();
        zzi = zzuyVar;
        zzbae.zzbn(zzuy.class, zzuyVar);
    }

    private zzuy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzuy();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzux(bArr);
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
        synchronized (zzuy.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
