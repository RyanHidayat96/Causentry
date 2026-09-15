package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdn extends zzbae implements zzbbm {
    private static final zzbdn zzg;
    private static volatile zzbbt zzh;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzbdn zzbdnVar = new zzbdn();
        zzg = zzbdnVar;
        zzbae.zzbn(zzbdn.class, zzbdnVar);
    }

    private zzbdn() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbdn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbdm(bArr);
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
        synchronized (zzbdn.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzbdn zze() {
        return zzg;
    }

    public final String zzc() {
        return this.zzb;
    }
}
