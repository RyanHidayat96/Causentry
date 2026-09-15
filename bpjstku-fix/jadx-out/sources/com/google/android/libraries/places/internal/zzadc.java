package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzadc extends zzbae implements zzbbm {
    private static final zzadc zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zzf;
    private String zze = "";
    private zzbao zzg = zzbu();

    static {
        zzadc zzadcVar = new zzadc();
        zzh = zzadcVar;
        zzbae.zzbn(zzadc.class, zzadcVar);
    }

    private zzadc() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzadb.class});
        }
        if (i2 == 3) {
            return new zzadc();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzacz(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzadc.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
