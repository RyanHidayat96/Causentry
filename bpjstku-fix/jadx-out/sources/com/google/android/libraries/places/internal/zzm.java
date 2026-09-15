package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzm extends zzbae implements zzbbm {
    private static final zzm zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzcj zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private zzao zzi;

    static {
        zzm zzmVar = new zzm();
        zzj = zzmVar;
        zzbae.zzbn(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", zzn.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzl(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzm.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
