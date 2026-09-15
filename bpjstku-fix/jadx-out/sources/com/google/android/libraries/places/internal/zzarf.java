package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzarf extends zzbae implements zzbbm {
    private static final zzarf zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private int zze;
    private int zzf = 1;
    private int zzg;
    private int zzh;

    static {
        zzarf zzarfVar = new zzarf();
        zzi = zzarfVar;
        zzbae.zzbn(zzarf.class, zzarfVar);
    }

    private zzarf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zze", zzard.zza, "zzf", zzare.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzarf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzarc(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzarf.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
