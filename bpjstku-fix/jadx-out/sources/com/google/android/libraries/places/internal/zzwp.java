package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwp extends zzbae implements zzbbm {
    private static final zzwp zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private zzwo zzf;

    static {
        zzwp zzwpVar = new zzwp();
        zzg = zzwpVar;
        zzbae.zzbn(zzwp.class, zzwpVar);
    }

    private zzwp() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", zzwl.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzwp();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzwk(bArr);
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
        synchronized (zzwp.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
