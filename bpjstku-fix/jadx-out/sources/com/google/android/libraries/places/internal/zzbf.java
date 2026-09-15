package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzbf extends zzbae implements zzbbm {
    private static final zzbf zzn;
    private static volatile zzbbt zzo;
    private int zzb;
    private zzbam zze = zzbr();
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private float zzj;
    private float zzk;
    private int zzl;
    private zzbb zzm;

    static {
        zzbf zzbfVar = new zzbf();
        zzn = zzbfVar;
        zzbae.zzbn(zzbf.class, zzbfVar);
    }

    private zzbf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzbak zzbakVar = zzap.zza;
            zzbak zzbakVar2 = zzaz.zza;
            return zzbo(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ࠬ\u0002᠌\u0000\u0003᠌\u0001\u0004င\u0002\u0005ဂ\u0003\u0006ခ\u0004\u0007ခ\u0005\b᠌\u0006\tဉ\u0007", new Object[]{"zzb", "zze", zzbakVar, "zzf", zzbakVar2, "zzg", zzbakVar2, "zzh", "zzi", "zzj", "zzk", "zzl", zzbakVar, "zzm"});
        }
        if (i2 == 3) {
            return new zzbf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbe(bArr);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzo;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbf.class) {
            zzazzVar = zzo;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzn);
                zzo = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
