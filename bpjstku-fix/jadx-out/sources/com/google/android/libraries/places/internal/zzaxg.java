package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaxg extends zzbae implements zzbbm {
    private static final zzaxg zzf;
    private static volatile zzbbt zzg;
    private zzbao zzb = zzbu();
    private zzbao zze = zzbae.zzbu();

    static {
        zzaxg zzaxgVar = new zzaxg();
        zzf = zzaxgVar;
        zzbae.zzbn(zzaxg.class, zzaxgVar);
    }

    private zzaxg() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"zzb", zzaxi.class, "zze"});
        }
        if (i2 == 3) {
            return new zzaxg();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxf(bArr);
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
        synchronized (zzaxg.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
