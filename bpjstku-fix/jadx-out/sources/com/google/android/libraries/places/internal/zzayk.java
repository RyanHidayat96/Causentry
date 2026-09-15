package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayk extends zzbae implements zzbbm {
    private static final zzayk zzi;
    private static volatile zzbbt zzj;
    private zzbao zzb = zzbu();
    private zzbao zze = zzbu();
    private zzbao zzf = zzbu();
    private String zzg = "";
    private String zzh = "";

    static {
        zzayk zzaykVar = new zzayk();
        zzi = zzaykVar;
        zzbae.zzbn(zzayk.class, zzaykVar);
    }

    private zzayk() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"zzb", zzaww.class, "zze", zzaxq.class, "zzf", zzaug.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzayk();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzayj(bArr);
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
        synchronized (zzayk.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzayk zzd() {
        return zzi;
    }

    public final List zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zze;
    }
}
