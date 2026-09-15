package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzahf extends zzbae implements zzbbm {
    private static final zzahf zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private int zze;
    private zzahc zzf;
    private zzahc zzg;
    private int zzh;
    private zzahh zzi;
    private zzafz zzj;

    static {
        zzahf zzahfVar = new zzahf();
        zzk = zzahfVar;
        zzbae.zzbn(zzahf.class, zzahfVar);
    }

    private zzahf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzb", "zze", zzahd.zza, "zzf", "zzg", "zzh", zzahe.zza, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzahf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzagz(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzahf.class) {
            zzazzVar = zzl;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzk);
                zzl = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
