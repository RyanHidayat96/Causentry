package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzany extends zzbae implements zzbbm {
    private static final zzany zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private zzane zzf;

    static {
        zzany zzanyVar = new zzany();
        zzg = zzanyVar;
        zzbae.zzbn(zzany.class, zzanyVar);
    }

    private zzany() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", zzanx.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzany();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzanw(bArr);
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
        synchronized (zzany.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
