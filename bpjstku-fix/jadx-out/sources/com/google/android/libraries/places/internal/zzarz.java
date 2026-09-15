package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzarz extends zzbae implements zzbbm {
    private static final zzarz zzp;
    private static volatile zzbbt zzq;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzbao zzk = zzbae.zzbu();
    private zzarn zzl;
    private zzaru zzm;
    private zzary zzn;
    private zzarr zzo;

    static {
        zzarz zzarzVar = new zzarz();
        zzp = zzarzVar;
        zzbae.zzbn(zzarz.class, zzarzVar);
        zzbae.zzbp(zzbdy.zzc(), zzarzVar, zzarzVar, null, 525004180, zzbcx.MESSAGE, zzarz.class);
    }

    private zzarz() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006\u001a\u0007ဉ\u0006\bဉ\u0007\tဉ\b\n᠌\u0002\u000bဉ\t", new Object[]{"zzb", "zze", zzarp.zza, "zzf", zzars.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzg", zzarv.zza, "zzo"});
        }
        if (i2 == 3) {
            return new zzarz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaro(bArr);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzq;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzarz.class) {
            zzazzVar = zzq;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzp);
                zzq = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
