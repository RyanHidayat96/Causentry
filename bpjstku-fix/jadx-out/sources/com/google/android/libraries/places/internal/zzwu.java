package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwu extends zzbae implements zzbbm {
    private static final zzwu zzt;
    private static volatile zzbbt zzu;
    private int zzb;
    private zzxg zzf;
    private zzxi zzg;
    private zzarh zzh;
    private zzyd zzi;
    private zzyo zzj;
    private zzyf zzk;
    private zzxk zzl;
    private zzxe zzm;
    private zzxx zzn;
    private zzxz zzo;
    private zzxq zzp;
    private zzwy zzq;
    private zzyj zzr;
    private byte zzs = 2;
    private int zze = 1;

    static {
        zzwu zzwuVar = new zzwu();
        zzt = zzwuVar;
        zzbae.zzbn(zzwu.class, zzwuVar);
    }

    private zzwu() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzs);
        }
        if (i2 == 2) {
            return zzbo(zzt, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r", new Object[]{"zzb", "zze", zzwt.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzwu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzws(bArr);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            this.zzs = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzu;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzwu.class) {
            zzazzVar = zzu;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzt);
                zzu = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
