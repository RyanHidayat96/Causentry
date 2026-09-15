package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzanr extends zzbae implements zzbbm {
    private static final zzanr zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private int zze;
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzg = zzbu();
    private zzbao zzh = zzbu();

    static {
        zzanr zzanrVar = new zzanr();
        zzi = zzanrVar;
        zzbae.zzbn(zzanr.class, zzanrVar);
    }

    private zzanr() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001င\u0000\u0002\u001a\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzant.class, "zzh", zzaho.class});
        }
        if (i2 == 3) {
            return new zzanr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzanq(bArr);
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
        synchronized (zzanr.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
