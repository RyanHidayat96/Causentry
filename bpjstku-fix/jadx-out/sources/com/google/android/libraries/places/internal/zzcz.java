package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcz extends zzbae implements zzbbm {
    private static final zzcz zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zze;
    private zzbao zzf = zzbu();
    private zzbao zzg = zzbu();
    private zzbao zzh = zzbu();
    private zzbao zzi = zzbu();
    private zzbao zzj = zzbu();
    private zzbao zzk = zzbu();
    private zzbao zzl = zzbu();

    static {
        zzcz zzczVar = new zzcz();
        zzm = zzczVar;
        zzbae.zzbn(zzcz.class, zzczVar);
    }

    private zzcz() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzm, "\u0001\b\u0000\u0001\u0001✐\b\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b✐᠌\u0000", new Object[]{"zzb", "zzf", zzdd.class, "zzg", zzdf.class, "zzh", zzdv.class, "zzi", zzdn.class, "zzj", zzdx.class, "zzk", zzdl.class, "zzl", zzdj.class, "zze", zzcy.zza});
        }
        if (i2 == 3) {
            return new zzcz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzcx(bArr);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzn;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzcz.class) {
            zzazzVar = zzn;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzm);
                zzn = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
