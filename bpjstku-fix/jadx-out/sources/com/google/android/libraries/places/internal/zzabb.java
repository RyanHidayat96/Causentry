package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzabb extends zzbae implements zzbbm {
    private static final zzabb zzs;
    private static volatile zzbbt zzt;
    private int zzb;
    private long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private zzban zzk = zzbt();
    private long zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private long zzr;

    static {
        zzabb zzabbVar = new zzabb();
        zzs = zzabbVar;
        zzbae.zzbn(zzabb.class, zzabbVar);
    }

    private zzabb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzbak zzbakVar = zzaay.zza;
            zzbak zzbakVar2 = zzaax.zza;
            zzbak zzbakVar3 = zzaav.zza;
            return zzbo(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006င\u0005\u0007\u0014\bဂ\u0006\t᠌\u0007\n᠌\b\u000b᠌\t\fဂ\n\rင\u000b\u000eဂ\f", new Object[]{"zzb", "zze", "zzf", "zzg", zzbakVar, "zzh", zzbakVar2, "zzi", zzbakVar3, "zzj", "zzk", "zzl", "zzm", zzbakVar, "zzn", zzbakVar2, "zzo", zzbakVar3, "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzabb();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaba(bArr);
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
        synchronized (zzabb.class) {
            zzazzVar = zzt;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzs);
                zzt = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
