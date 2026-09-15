package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzagn extends zzbae implements zzbbm {
    private static final zzagn zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzbao zzm = zzbu();
    private int zzn;
    private int zzo;
    private int zzp;

    static {
        zzagn zzagnVar = new zzagn();
        zzq = zzagnVar;
        zzbae.zzbn(zzagn.class, zzagnVar);
    }

    private zzagn() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\t\u001b\nင\b\u000b᠌\t\fင\n", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzagm.class, "zzn", "zzo", zzafq.zza, "zzp"});
        }
        if (i2 == 3) {
            return new zzagn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzagk(bArr);
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
        synchronized (zzagn.class) {
            zzazzVar = zzr;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzq);
                zzr = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
