package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzalw extends zzbae implements zzbbm {
    private static final zzalw zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private int zzf;
    private boolean zzh;
    private zzbao zze = zzbae.zzbu();
    private String zzg = "";

    static {
        zzalw zzalwVar = new zzalw();
        zzi = zzalwVar;
        zzbae.zzbn(zzalw.class, zzalwVar);
    }

    private zzalw() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"zzb", "zze", "zzf", zzalt.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzalw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzalv(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzalw.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
