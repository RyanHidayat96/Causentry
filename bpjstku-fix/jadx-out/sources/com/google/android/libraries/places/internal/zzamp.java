package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzamp extends zzbae implements zzbbm {
    private static final zzamp zzf;
    private static volatile zzbbt zzg;
    private zzbao zzb = zzbae.zzbu();
    private zzbao zze = zzbu();

    static {
        zzamp zzampVar = new zzamp();
        zzf = zzampVar;
        zzbae.zzbn(zzamp.class, zzampVar);
    }

    private zzamp() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"zzb", "zze", zzaho.class});
        }
        if (i2 == 3) {
            return new zzamp();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzamo(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzamp.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
