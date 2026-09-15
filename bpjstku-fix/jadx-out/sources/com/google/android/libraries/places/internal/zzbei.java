package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbei extends zzbae implements zzbbm {
    private static final zzbei zzg;
    private static volatile zzbbt zzh;
    private String zzb = "";
    private long zze;
    private int zzf;

    static {
        zzbei zzbeiVar = new zzbei();
        zzg = zzbeiVar;
        zzbae.zzbn(zzbei.class, zzbeiVar);
    }

    private zzbei() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbei();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbeh(bArr);
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
        synchronized (zzbei.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzbei zzg() {
        return zzg;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final long zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzf;
    }
}
