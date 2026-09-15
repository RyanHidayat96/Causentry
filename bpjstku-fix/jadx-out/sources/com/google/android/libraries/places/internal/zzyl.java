package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzyl extends zzbae implements zzbbm {
    private static final zzyl zzo;
    private static volatile zzbbt zzp;
    private int zzb;
    private int zzf;
    private long zzg;
    private float zzh;
    private int zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private String zze = "";
    private String zzj = "";
    private zzayz zzk = zzayz.zzb;

    static {
        zzyl zzylVar = new zzyl();
        zzo = zzylVar;
        zzbae.zzbn(zzyl.class, zzylVar);
    }

    private zzyl() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ည\u0006\bဇ\u0007\tဇ\b\n᠌\t", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzyn.zza});
        }
        if (i2 == 3) {
            return new zzyl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzyk(bArr);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzp;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzyl.class) {
            zzazzVar = zzp;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzo);
                zzp = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
