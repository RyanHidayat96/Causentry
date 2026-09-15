package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaih extends zzbae implements zzbbm {
    private static final zzaih zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzbam zze = zzbr();
    private zzbao zzf = zzbae.zzbu();
    private String zzg = "";
    private boolean zzh;
    private int zzi;

    static {
        zzaih zzaihVar = new zzaih();
        zzj = zzaihVar;
        zzbae.zzbn(zzaih.class, zzaihVar);
    }

    private zzaih() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0016\u0002\u001a\u0003ဈ\u0000\u0004ဇ\u0001\u0005ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzaih();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaig(bArr);
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
        synchronized (zzaih.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
