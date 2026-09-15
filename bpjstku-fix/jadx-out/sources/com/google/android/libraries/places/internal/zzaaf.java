package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaaf extends zzbae implements zzbbm {
    private static final zzaaf zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzaaf zzaafVar = new zzaaf();
        zzh = zzaafVar;
        zzbae.zzbn(zzaaf.class, zzaafVar);
    }

    private zzaaf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaaf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaae(bArr);
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
        synchronized (zzaaf.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
