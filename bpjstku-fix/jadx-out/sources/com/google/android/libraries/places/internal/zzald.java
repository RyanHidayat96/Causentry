package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzald extends zzbae implements zzbbm {
    private static final zzald zze;
    private static volatile zzbbt zzf;
    private zzbam zzb = zzbr();

    static {
        zzald zzaldVar = new zzald();
        zze = zzaldVar;
        zzbae.zzbn(zzald.class, zzaldVar);
    }

    private zzald() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"zzb", zzahj.zza});
        }
        if (i2 == 3) {
            return new zzald();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzalc(bArr);
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
        synchronized (zzald.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
