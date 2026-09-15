package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzvj extends zzbae implements zzbbm {
    private static final zzvj zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbao zze = zzbu();
    private int zzf;

    static {
        zzvj zzvjVar = new zzvj();
        zzg = zzvjVar;
        zzbae.zzbn(zzvj.class, zzvjVar);
    }

    private zzvj() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဋ\u0000", new Object[]{"zzb", "zze", zzvh.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzvj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzvi(bArr);
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
        synchronized (zzvj.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
