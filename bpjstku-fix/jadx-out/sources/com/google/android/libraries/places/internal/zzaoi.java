package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoi extends zzbae implements zzbbm {
    private static final zzaoi zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzcs zze;
    private zzbao zzf = zzbu();

    static {
        zzaoi zzaoiVar = new zzaoi();
        zzg = zzaoiVar;
        zzbae.zzbn(zzaoi.class, zzaoiVar);
    }

    private zzaoi() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzaod.class});
        }
        if (i2 == 3) {
            return new zzaoi();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaob(bArr);
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
        synchronized (zzaoi.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
