package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzh extends zzbae implements zzbbm {
    private static final zzh zzn;
    private static volatile zzbbt zzo;
    private int zzb;
    private zzcj zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private zzao zzm;

    static {
        zzh zzhVar = new zzh();
        zzn = zzhVar;
        zzbae.zzbn(zzh.class, zzhVar);
    }

    private zzh() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဇ\u0007\tဉ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzap.zza, "zzi", zzn.zza, "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzg(bArr);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzo;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzh.class) {
            zzazzVar = zzo;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzn);
                zzo = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
