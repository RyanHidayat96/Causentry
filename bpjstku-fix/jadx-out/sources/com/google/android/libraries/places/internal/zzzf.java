package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzzf extends zzbae implements zzbbm {
    private static final zzzf zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private double zzl;
    private zzbam zze = zzbr();
    private zzbam zzf = zzbr();
    private zzbao zzk = zzbu();

    static {
        zzzf zzzfVar = new zzzf();
        zzm = zzzfVar;
        zzbae.zzbn(zzzf.class, zzzfVar);
    }

    private zzzf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0016\u0002\u0016\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006င\u0003\u0007\u001b\bက\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzze.class, "zzl"});
        }
        if (i2 == 3) {
            return new zzzf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzyr(bArr);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzn;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzzf.class) {
            zzazzVar = zzn;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzm);
                zzn = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
