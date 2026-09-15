package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zzasd extends zzbae implements zzbbm {
    private static final zzasd zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbao zze = zzbu();
    private zzasm zzf;

    static {
        zzasd zzasdVar = new zzasd();
        zzg = zzasdVar;
        zzbae.zzbn(zzasd.class, zzasdVar);
    }

    private zzasd() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", zzash.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzasd();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzasc(bArr);
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
        synchronized (zzasd.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzasd zzc() {
        return zzg;
    }

    public final List zza() {
        return this.zze;
    }
}
