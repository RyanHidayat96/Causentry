package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaad extends zzbae implements zzbbm {
    private static final zzaad zzB;
    private static volatile zzbbt zzC;
    private int zzA;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private zzaak zzt;
    private zzaam zzu;
    private zzaaa zzv;
    private zzaaf zzw;
    private zzaah zzx;
    private int zzy;
    private int zzz;

    static {
        zzaad zzaadVar = new zzaad();
        zzB = zzaadVar;
        zzbae.zzbn(zzaad.class, zzaadVar);
    }

    private zzaad() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzB, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ဋ\u0001\u0002ဋ\u0002\u0003ဋ\u0003\u0004ဋ\u0004\u0005ဋ\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဋ\b\tဋ\t\nဋ\n\u000bဋ\u000b\fဋ\f\rဋ\r\u000eဋ\u000e\u000fဉ\u000f\u0010ဋ\u0000\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015᠌\u0014\u0016ဋ\u0015\u0017ဋ\u0016", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zze", "zzu", "zzv", "zzw", "zzx", "zzy", zzaac.zza, "zzz", "zzA"});
        }
        if (i2 == 3) {
            return new zzaad();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaab(bArr);
        }
        if (i2 == 5) {
            return zzB;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzC;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaad.class) {
            zzazzVar = zzC;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzB);
                zzC = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
