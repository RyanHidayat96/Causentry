package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzamg extends zzbae implements zzbbm {
    private static final zzamg zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        zzamg zzamgVar = new zzamg();
        zzh = zzamgVar;
        zzbae.zzbn(zzamg.class, zzamgVar);
    }

    private zzamg() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\b᠌\u0002", new Object[]{"zzb", "zze", zzamf.zza, "zzf", "zzg", zzahi.zza});
        }
        if (i2 == 3) {
            return new zzamg();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzame(bArr);
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
        synchronized (zzamg.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
