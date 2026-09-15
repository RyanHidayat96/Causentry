package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzalo extends zzbae implements zzbbm {
    private static final zzalo zze;
    private static volatile zzbbt zzf;
    private zzbam zzb = zzbr();

    static {
        zzalo zzaloVar = new zzalo();
        zze = zzaloVar;
        zzbae.zzbn(zzalo.class, zzaloVar);
    }

    private zzalo() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"zzb", zzaoa.zza});
        }
        if (i2 == 3) {
            return new zzalo();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaln(bArr);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzf;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzalo.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
