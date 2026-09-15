package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzatv extends zzbae implements zzbbm {
    private static final zzatv zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbeg zze;
    private zzbao zzf = zzbu();

    static {
        zzatv zzatvVar = new zzatv();
        zzg = zzatvVar;
        zzbae.zzbn(zzatv.class, zzatvVar);
    }

    private zzatv() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzaxi.class});
        }
        if (i2 == 3) {
            return new zzatv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzatu(bArr);
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
        synchronized (zzatv.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
