package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzbz extends zzbae implements zzbbm {
    private static final zzbz zzs;
    private static volatile zzbbt zzt;
    private int zzb;
    private zzcj zze;
    private zzbs zzf;
    private zzbao zzg = zzbu();
    private zzbao zzh = zzbu();
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    static {
        zzbz zzbzVar = new zzbz();
        zzs = zzbzVar;
        zzbae.zzbn(zzbz.class, zzbzVar);
    }

    private zzbz() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006င\u0003\u0007င\u0004\bင\u0005\tဂ\u0006\nဂ\u0007\u000bဂ\b\fဂ\t\rဂ\n\u000e᠌\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", zzbx.class, "zzh", zzbx.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", zzby.zza});
        }
        if (i2 == 3) {
            return new zzbz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbv(bArr);
        }
        if (i2 == 5) {
            return zzs;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzt;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbz.class) {
            zzazzVar = zzt;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzs);
                zzt = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
