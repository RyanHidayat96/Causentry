package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdr extends zzbae implements zzbbm {
    private static final zzbdr zzf;
    private static volatile zzbbt zzg;
    private int zzb;
    private String zze = "";

    static {
        zzbdr zzbdrVar = new zzbdr();
        zzf = zzbdrVar;
        zzbae.zzbn(zzbdr.class, zzbdrVar);
    }

    private zzbdr() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzbdr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbdq(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbdr.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzbdr zze() {
        return zzf;
    }

    public final String zzc() {
        return this.zze;
    }
}
