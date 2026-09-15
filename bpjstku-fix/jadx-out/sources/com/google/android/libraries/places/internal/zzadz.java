package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzadz extends zzbae implements zzbbm {
    private static final zzadz zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private float zzf;
    private float zzg;

    static {
        zzadz zzadzVar = new zzadz();
        zzh = zzadzVar;
        zzbae.zzbn(zzadz.class, zzadzVar);
    }

    private zzadz() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zzb", "zze", zzadt.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzadz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzady(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzadz.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
