package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzk extends zzbae implements zzbbm {
    private static final zzk zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzcj zze;
    private int zzf;

    static {
        zzk zzkVar = new zzk();
        zzg = zzkVar;
        zzbae.zzbn(zzk.class, zzkVar);
    }

    private zzk() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", "zzf", zzj.zza});
        }
        if (i2 == 3) {
            return new zzk();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzi(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzk.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
