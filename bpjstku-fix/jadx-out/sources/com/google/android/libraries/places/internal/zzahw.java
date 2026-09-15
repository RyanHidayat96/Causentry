package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahw extends zzbae implements zzbbm {
    private static final zzahw zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbam zze = zzbr();
    private int zzf;

    static {
        zzahw zzahwVar = new zzahw();
        zzg = zzahwVar;
        zzbae.zzbn(zzahw.class, zzahwVar);
    }

    private zzahw() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠞ\u0002င\u0000", new Object[]{"zzb", "zze", zzahu.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzahw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzahv(bArr);
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
        synchronized (zzahw.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
