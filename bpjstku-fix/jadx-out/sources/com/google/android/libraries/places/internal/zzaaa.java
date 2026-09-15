package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaaa extends zzbae implements zzbbm {
    private static final zzaaa zzr;
    private static volatile zzbbt zzs;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
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

    static {
        zzaaa zzaaaVar = new zzaaa();
        zzr = zzaaaVar;
        zzbae.zzbn(zzaaa.class, zzaaaVar);
    }

    private zzaaa() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzr, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rဋ\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new zzaaa();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzzz(bArr);
        }
        if (i2 == 5) {
            return zzr;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzs;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaaa.class) {
            zzazzVar = zzs;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzr);
                zzs = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
