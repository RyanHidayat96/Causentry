package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzdv extends zzbae implements zzbbm {
    private static final zzdv zzC;
    private static volatile zzbbt zzD;
    private boolean zzA;
    private int zzB;
    private int zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private float zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        zzdv zzdvVar = new zzdv();
        zzC = zzdvVar;
        zzbae.zzbn(zzdv.class, zzdvVar);
    }

    private zzdv() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzC, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tင\b\nခ\t\u000bင\n\fင\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ဇ\u0012\u0014င\u0013\u0015င\u0014\u0016᠌\u0015\u0017ဇ\u0016\u0018င\u0017", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", zzdu.zza, "zzA", "zzB"});
        }
        if (i2 == 3) {
            return new zzdv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzdt(bArr);
        }
        if (i2 == 5) {
            return zzC;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzD;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzdv.class) {
            zzazzVar = zzD;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzC);
                zzD = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
