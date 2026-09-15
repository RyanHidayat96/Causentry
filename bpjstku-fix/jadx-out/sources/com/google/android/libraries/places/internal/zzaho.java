package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaho extends zzbae implements zzbbm {
    private static final zzaho zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private String zze = "";
    private int zzf;

    static {
        zzaho zzahoVar = new zzaho();
        zzg = zzahoVar;
        zzbae.zzbn(zzaho.class, zzahoVar);
    }

    private zzaho() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", "zzf", zzahn.zza});
        }
        if (i2 == 3) {
            return new zzaho();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzahm(bArr);
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
        synchronized (zzaho.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
