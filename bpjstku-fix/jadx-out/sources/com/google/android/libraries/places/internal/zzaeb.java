package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaeb extends zzbae implements zzbbm {
    private static final zzaeb zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private boolean zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private long zzk;
    private double zzl;

    static {
        zzaeb zzaebVar = new zzaeb();
        zzm = zzaebVar;
        zzbae.zzbn(zzaeb.class, zzaebVar);
    }

    private zzaeb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဂ\u0006\bက\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzaeb();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaea(bArr);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzn;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaeb.class) {
            zzazzVar = zzn;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzm);
                zzn = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
