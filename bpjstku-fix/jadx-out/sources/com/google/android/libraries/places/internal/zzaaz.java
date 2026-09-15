package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaaz extends zzbae implements zzbbm {
    private static final zzaaz zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private zzban zze = zzbt();
    private zzban zzf = zzbt();
    private zzban zzg = zzbt();
    private zzban zzh = zzbt();
    private zzban zzi = zzbt();
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzaao zzo;
    private int zzp;

    static {
        zzaaz zzaazVar = new zzaaz();
        zzq = zzaazVar;
        zzbae.zzbn(zzaaz.class, zzaazVar);
    }

    private zzaaz() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0005\u0000\u0001\u0014\u0002\u0014\u0003\u0014\u0004\u0014\u0005\u0014\u0006င\u0000\u0007᠌\u0001\b᠌\u0002\t᠌\u0003\nင\u0004\u000bဉ\u0005\fင\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzaay.zza, "zzl", zzaax.zza, "zzm", zzaav.zza, "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzaaz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaaw(bArr);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzr;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaaz.class) {
            zzazzVar = zzr;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzq);
                zzr = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
