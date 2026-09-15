package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzdl extends zzbae implements zzbbm {
    private static final zzdl zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzdl zzdlVar = new zzdl();
        zzm = zzdlVar;
        zzbae.zzbn(zzdl.class, zzdlVar);
    }

    private zzdl() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bင\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzds.zza, "zzj", zzdr.zza, "zzk", zzdq.zza, "zzl"});
        }
        if (i2 == 3) {
            return new zzdl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzdk(bArr);
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
        synchronized (zzdl.class) {
            zzazzVar = zzn;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzm);
                zzn = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
