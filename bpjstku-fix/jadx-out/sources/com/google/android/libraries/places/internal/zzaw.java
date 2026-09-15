package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaw extends zzbae implements zzbbm {
    private static final zzaw zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzbam zzj = zzbr();
    private int zzk;

    static {
        zzaw zzawVar = new zzaw();
        zzl = zzawVar;
        zzbae.zzbn(zzaw.class, zzawVar);
    }

    private zzaw() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzbak zzbakVar = zzap.zza;
            zzbak zzbakVar2 = zzav.zza;
            return zzbo(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ࠞ\u0007᠌\u0005", new Object[]{"zzb", "zze", zzbakVar, "zzf", "zzg", "zzh", "zzi", "zzj", zzbakVar2, "zzk", zzbakVar2});
        }
        if (i2 == 3) {
            return new zzaw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzau(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzm;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaw.class) {
            zzazzVar = zzm;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzl);
                zzm = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
