package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzch extends zzbae implements zzbbm {
    private static final zzch zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private zzbao zze = zzbu();
    private zzbao zzf = zzbu();
    private zzbao zzg = zzbu();
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        zzch zzchVar = new zzch();
        zzl = zzchVar;
        zzbae.zzbn(zzch.class, zzchVar);
    }

    private zzch() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzl, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0003\u0000\u0002\u001b\u0003\u001b\u0004င\u0000\u0005င\u0001\u0006င\u0002\u0007ဂ\u0003\b\u001b", new Object[]{"zzb", "zzf", zzcg.class, "zzg", zzce.class, "zzh", "zzi", "zzj", "zzk", "zze", zzbs.class});
        }
        if (i2 == 3) {
            return new zzch();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzcc(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzm;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzch.class) {
            zzazzVar = zzm;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzl);
                zzm = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
