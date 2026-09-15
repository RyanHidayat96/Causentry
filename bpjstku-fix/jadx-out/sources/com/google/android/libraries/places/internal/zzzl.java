package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzl extends zzbae implements zzbbm {
    private static final zzzl zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzcs zze;
    private int zzf;

    static {
        zzzl zzzlVar = new zzzl();
        zzg = zzzlVar;
        zzbae.zzbn(zzzl.class, zzzlVar);
    }

    private zzzl() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", "zzf", zzzm.zza});
        }
        if (i2 == 3) {
            return new zzzl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzzk(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzzl.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
