package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzalq extends zzbae implements zzbbm {
    private static final zzalq zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private boolean zzk;
    private zzbao zzf = zzbae.zzbu();
    private String zzj = "";

    static {
        zzalq zzalqVar = new zzalq();
        zzl = zzalqVar;
        zzbae.zzbn(zzalq.class, zzalqVar);
    }

    private zzalq() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a\u0003င\u0001\u0004᠌\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"zzb", "zze", zzaii.zza, "zzf", "zzg", "zzh", zzalt.zza, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzalq();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzalp(bArr);
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
        synchronized (zzalq.class) {
            zzazzVar = zzm;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzl);
                zzm = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
