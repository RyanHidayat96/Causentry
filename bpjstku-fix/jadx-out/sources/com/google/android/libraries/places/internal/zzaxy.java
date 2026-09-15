package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxy extends zzbae implements zzbbm {
    private static final zzaxy zzf;
    private static volatile zzbbt zzg;
    private zzbao zzb = zzbu();
    private zzbao zze = zzbu();

    static {
        zzaxy zzaxyVar = new zzaxy();
        zzf = zzaxyVar;
        zzbae.zzbn(zzaxy.class, zzaxyVar);
    }

    private zzaxy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzb", zzaww.class, "zze", zzaxq.class});
        }
        if (i2 == 3) {
            return new zzaxy();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxx(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaxy.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzaxy zzd() {
        return zzf;
    }

    public final List zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zze;
    }
}
