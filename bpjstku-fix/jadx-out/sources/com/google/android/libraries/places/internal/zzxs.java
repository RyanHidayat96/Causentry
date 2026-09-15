package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzxs extends zzbae implements zzbbm {
    private static final zzxs zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private zzww zzf;
    private long zzg;

    static {
        zzxs zzxsVar = new zzxs();
        zzh = zzxsVar;
        zzbae.zzbn(zzxs.class, zzxsVar);
    }

    private zzxs() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zze", zzxo.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzxs();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzxr(bArr);
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
        synchronized (zzxs.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
