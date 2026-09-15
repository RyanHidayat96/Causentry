package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzyb extends zzbae implements zzbbm {
    private static final zzyb zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private long zze;
    private zzayz zzf = zzayz.zzb;
    private int zzg;
    private long zzh;
    private long zzi;

    static {
        zzyb zzybVar = new zzyb();
        zzj = zzybVar;
        zzbae.zzbn(zzyb.class, zzybVar);
    }

    private zzyb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", zzb.zza(), "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzyb();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzya(bArr);
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
        synchronized (zzyb.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
