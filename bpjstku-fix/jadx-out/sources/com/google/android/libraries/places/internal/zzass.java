package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzass extends zzbae implements zzbbm {
    private static final zzass zzf;
    private static volatile zzbbt zzg;
    private zzbao zzb = zzbu();
    private zzbao zze = zzbu();

    static {
        zzass zzassVar = new zzass();
        zzf = zzassVar;
        zzbae.zzbn(zzass.class, zzassVar);
    }

    private zzass() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzb", zzasr.class, "zze", zzaso.class});
        }
        if (i2 == 3) {
            return new zzass();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzasp(bArr);
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
        synchronized (zzass.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
