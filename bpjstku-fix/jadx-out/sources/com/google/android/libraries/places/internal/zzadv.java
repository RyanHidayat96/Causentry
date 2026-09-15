package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzadv extends zzbae implements zzbbm {
    private static final zzadv zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private float zzf;

    static {
        zzadv zzadvVar = new zzadv();
        zzg = zzadvVar;
        zzbae.zzbn(zzadv.class, zzadvVar);
    }

    private zzadv() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001", new Object[]{"zzb", "zze", zzadt.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzadv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzadu(bArr);
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
        synchronized (zzadv.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
