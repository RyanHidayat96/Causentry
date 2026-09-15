package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaaq extends zzbae implements zzbbm {
    private static final zzaaq zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbu();

    static {
        zzaaq zzaaqVar = new zzaaq();
        zze = zzaaqVar;
        zzbae.zzbn(zzaaq.class, zzaaqVar);
    }

    private zzaaq() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzacn.class});
        }
        if (i2 == 3) {
            return new zzaaq();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaap(bArr);
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
        synchronized (zzaaq.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
