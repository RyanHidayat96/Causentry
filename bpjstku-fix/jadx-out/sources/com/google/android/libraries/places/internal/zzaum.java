package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaum extends zzbae implements zzbbm {
    private static final zzaum zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbao zze = zzbu();
    private zzbao zzf = zzbu();

    static {
        zzaum zzaumVar = new zzaum();
        zzg = zzaumVar;
        zzbae.zzbn(zzaum.class, zzaumVar);
    }

    private zzaum() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u001b", new Object[]{"zzb", "zze", zzauj.class, "zzf", zzaul.class});
        }
        if (i2 == 3) {
            return new zzaum();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzauh(bArr);
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
        synchronized (zzaum.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzaum zzd() {
        return zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zze;
    }
}
