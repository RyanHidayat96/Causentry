package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzal extends zzbae implements zzbbm {
    private static final zzal zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private zzcs zze;
    private zzah zzf;
    private zzaj zzg;

    static {
        zzal zzalVar = new zzal();
        zzh = zzalVar;
        zzbae.zzbn(zzal.class, zzalVar);
    }

    private zzal() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000", new Object[]{"zzb", "zzf", "zzg", "zze"});
        }
        if (i2 == 3) {
            return new zzal();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzak(bArr);
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
        synchronized (zzal.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
