package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzato extends zzbae implements zzbbm {
    private static final zzato zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbu();

    static {
        zzato zzatoVar = new zzato();
        zze = zzatoVar;
        zzbae.zzbn(zzato.class, zzatoVar);
    }

    private zzato() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzatn.class});
        }
        if (i2 == 3) {
            return new zzato();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzatb(bArr);
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
        synchronized (zzato.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzato zzc() {
        return zze;
    }

    public final List zza() {
        return this.zzb;
    }
}
