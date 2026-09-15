package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdl extends zzbae implements zzbbm {
    private static final zzbdl zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private zzbck zzf;

    static {
        zzbdl zzbdlVar = new zzbdl();
        zzg = zzbdlVar;
        zzbae.zzbn(zzbdl.class, zzbdlVar);
    }

    private zzbdl() {
    }

    public final zzbck zze() {
        zzbck zzbckVar = this.zzf;
        return zzbckVar == null ? zzbck.zzg() : zzbckVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbdl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbdk(bArr);
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
        synchronized (zzbdl.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzbdl zzf() {
        return zzg;
    }

    public final int zzc() {
        return this.zze;
    }
}
