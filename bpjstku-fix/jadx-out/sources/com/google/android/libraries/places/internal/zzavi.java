package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavi extends zzbae implements zzbbm {
    private static final zzavi zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzbeg zze;
    private zzbeg zzf;
    private zzaxg zzg;
    private zzbao zzh = zzbu();
    private String zzi = "";

    static {
        zzavi zzaviVar = new zzavi();
        zzj = zzaviVar;
        zzbae.zzbn(zzavi.class, zzaviVar);
    }

    private zzavi() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0001\u0004\u001b\u0005Ȉ", new Object[]{"zzb", "zze", "zzg", "zzf", "zzh", zzats.class, "zzi"});
        }
        if (i2 == 3) {
            return new zzavi();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzavh(bArr);
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
        synchronized (zzavi.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
