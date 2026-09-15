package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaxt extends zzbae implements zzbbm {
    private static final zzaxt zze;
    private static volatile zzbbt zzf;
    private zzban zzb = zzbt();

    static {
        zzaxt zzaxtVar = new zzaxt();
        zze = zzaxtVar;
        zzbae.zzbn(zzaxt.class, zzaxtVar);
    }

    private zzaxt() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001&", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new zzaxt();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxs(bArr);
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
        synchronized (zzaxt.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
