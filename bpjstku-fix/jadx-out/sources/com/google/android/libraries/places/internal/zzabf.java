package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzabf extends zzbae implements zzbbm {
    private static final zzabf zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzuq zzk;
    private zzbao zzl = zzbu();

    static {
        zzabf zzabfVar = new zzabf();
        zzm = zzabfVar;
        zzbae.zzbn(zzabf.class, zzabfVar);
    }

    private zzabf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဉ\u0006\b\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzuq.class});
        }
        if (i2 == 3) {
            return new zzabf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzabe(bArr);
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
        synchronized (zzabf.class) {
            zzazzVar = zzn;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzm);
                zzn = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
