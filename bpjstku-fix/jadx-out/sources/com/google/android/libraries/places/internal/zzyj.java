package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzyj extends zzbae implements zzbbm {
    private static final zzyj zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbu();

    static {
        zzyj zzyjVar = new zzyj();
        zze = zzyjVar;
        zzbae.zzbn(zzyj.class, zzyjVar);
    }

    private zzyj() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzyh.class});
        }
        if (i2 == 3) {
            return new zzyj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzyi(bArr);
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
        synchronized (zzyj.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
