package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzagy extends zzbae implements zzbbm {
    private static final zzagy zzf;
    private static volatile zzbbt zzg;
    private int zzb;
    private int zze;

    static {
        zzagy zzagyVar = new zzagy();
        zzf = zzagyVar;
        zzbae.zzbn(zzagy.class, zzagyVar);
    }

    private zzagy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zze", zzagx.zza});
        }
        if (i2 == 3) {
            return new zzagy();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzagw(bArr);
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
        synchronized (zzagy.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
