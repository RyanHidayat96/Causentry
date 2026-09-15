package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaug extends zzbae implements zzbbm {
    private static final zzaug zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzbao zze = zzbu();
    private zzbao zzf = zzbu();
    private zzbao zzg = zzbu();
    private zzatv zzh;

    static {
        zzaug zzaugVar = new zzaug();
        zzi = zzaugVar;
        zzbae.zzbn(zzaug.class, zzaugVar);
    }

    private zzaug() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000", new Object[]{"zzb", "zze", zzaxi.class, "zzf", zzava.class, "zzg", zzauf.class, "zzh"});
        }
        if (i2 == 3) {
            return new zzaug();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzatt(bArr);
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
        synchronized (zzaug.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
