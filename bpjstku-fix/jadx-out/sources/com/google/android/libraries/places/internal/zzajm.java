package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajm extends zzbae implements zzbbm {
    private static final zzajm zzf;
    private static volatile zzbbt zzg;
    private int zzb;
    private int zze;

    static {
        zzajm zzajmVar = new zzajm();
        zzf = zzajmVar;
        zzbae.zzbn(zzajm.class, zzajmVar);
    }

    private zzajm() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zze", zzajl.zza});
        }
        if (i2 == 3) {
            return new zzajm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzajk(bArr);
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
        synchronized (zzajm.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
