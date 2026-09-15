package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaao extends zzbae implements zzbbm {
    private static final zzaao zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbu();

    static {
        zzaao zzaaoVar = new zzaao();
        zze = zzaaoVar;
        zzbae.zzbn(zzaao.class, zzaaoVar);
    }

    private zzaao() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzabb.class});
        }
        if (i2 == 3) {
            return new zzaao();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaan(bArr);
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
        synchronized (zzaao.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
