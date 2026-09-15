package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzdh extends zzbae implements zzbbm {
    private static final zzdh zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private zzbao zze = zzbu();
    private float zzf;
    private float zzg;

    static {
        zzdh zzdhVar = new zzdh();
        zzh = zzdhVar;
        zzbae.zzbn(zzdh.class, zzdhVar);
    }

    private zzdh() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ခ\u0000\u0003ခ\u0001", new Object[]{"zzb", "zze", zzdp.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzdh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzdg(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzdh.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
