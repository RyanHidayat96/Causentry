package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzxv extends zzbae implements zzbbm {
    private static final zzxv zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private double zze;
    private long zzf;
    private zzayz zzg;
    private zzayz zzh;
    private int zzi;
    private long zzj;

    static {
        zzxv zzxvVar = new zzxv();
        zzk = zzxvVar;
        zzbae.zzbn(zzxv.class, zzxvVar);
    }

    private zzxv() {
        zzayz zzayzVar = zzayz.zzb;
        this.zzg = zzayzVar;
        this.zzh = zzayzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001က\u0000\u0002ဂ\u0001\u0003ည\u0002\u0004ည\u0003\u0005᠌\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzxt.zza, "zzj"});
        }
        if (i2 == 3) {
            return new zzxv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzxu(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzxv.class) {
            zzazzVar = zzl;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzk);
                zzl = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
