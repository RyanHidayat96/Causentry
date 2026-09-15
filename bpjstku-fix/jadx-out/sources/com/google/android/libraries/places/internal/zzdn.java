package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzdn extends zzbae implements zzbbm {
    private static final zzdn zzr;
    private static volatile zzbbt zzs;
    private int zzb;
    private int zze;
    private float zzf;
    private int zzg;
    private int zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private float zzn;
    private float zzo;
    private float zzp;
    private int zzq;

    static {
        zzdn zzdnVar = new zzdn();
        zzr = zzdnVar;
        zzbae.zzbn(zzdn.class, zzdnVar);
    }

    private zzdn() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzr, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b\rင\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new zzdn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzdm(bArr);
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
        synchronized (zzdn.class) {
            zzazzVar = zzs;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzr);
                zzs = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
