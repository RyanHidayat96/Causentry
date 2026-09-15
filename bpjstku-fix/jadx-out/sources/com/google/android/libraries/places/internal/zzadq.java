package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzadq extends zzbae implements zzbbm {
    private static final zzadq zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private long zzf;
    private zzbao zze = zzbu();
    private zzbam zzg = zzbr();
    private zzbam zzh = zzbr();

    static {
        zzadq zzadqVar = new zzadq();
        zzi = zzadqVar;
        zzbae.zzbn(zzadq.class, zzadqVar);
    }

    private zzadq() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzbak zzbakVar = zzwr.zza;
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002ဂ\u0000\u0003ࠬ\u0004ࠬ", new Object[]{"zzb", "zze", zzadp.class, "zzf", "zzg", zzbakVar, "zzh", zzbakVar});
        }
        if (i2 == 3) {
            return new zzadq();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzadn(bArr);
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
        synchronized (zzadq.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
