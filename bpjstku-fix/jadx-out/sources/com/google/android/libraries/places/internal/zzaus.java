package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaus extends zzbae implements zzbbm {
    private static final zzaus zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbu();

    static {
        zzaus zzausVar = new zzaus();
        zze = zzausVar;
        zzbae.zzbn(zzaus.class, zzausVar);
    }

    private zzaus() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzaur.class});
        }
        if (i2 == 3) {
            return new zzaus();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzauo(bArr);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzf;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaus.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzaus zzc() {
        return zze;
    }

    public final List zza() {
        return this.zzb;
    }
}
