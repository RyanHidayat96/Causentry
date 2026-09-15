package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzarh extends zzbae implements zzbbm {
    private static final zzarh zzu;
    private static volatile zzbbt zzv;
    private int zzb;
    private int zze;
    private zzaqr zzf;
    private zzaqr zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzaqr zzn;
    private zzaqt zzo;
    private zzaqx zzp;
    private int zzq;
    private int zzr;
    private zzaqv zzs;
    private byte zzt = 2;
    private zzbao zzh = zzbu();

    static {
        zzarh zzarhVar = new zzarh();
        zzu = zzarhVar;
        zzbae.zzbn(zzarh.class, zzarhVar);
    }

    private zzarh() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i2 == 2) {
            return zzbo(zzu, "\u0001\u000f\u0000\u0001\u0002\u0010\u000f\u0000\u0001\u0001\u0002ᔄ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006င\u0003\u0007င\u0004\bင\u0005\tင\u0006\nင\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eင\u000b\u000fင\f\u0010ဉ\r", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzarf.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new zzarh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzarg(bArr);
        }
        if (i2 == 5) {
            return zzu;
        }
        if (i2 != 6) {
            this.zzt = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzv;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzarh.class) {
            zzazzVar = zzv;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzu);
                zzv = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
