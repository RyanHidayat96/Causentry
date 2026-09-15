package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzj extends zzbae implements zzbbm {
    private static final zzzj zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzcs zze;
    private zzzf zzf;
    private zzbao zzg = zzbu();
    private int zzh;
    private int zzi;

    static {
        zzzj zzzjVar = new zzzj();
        zzj = zzzjVar;
        zzbae.zzbn(zzzj.class, zzzjVar);
    }

    private zzzj() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0001\u0002\u001b\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0000", new Object[]{"zzb", "zzf", "zzg", zzyq.class, "zzh", zzzi.zza, "zzi", zzzh.zza, "zze"});
        }
        if (i2 == 3) {
            return new zzzj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzzg(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzzj.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
