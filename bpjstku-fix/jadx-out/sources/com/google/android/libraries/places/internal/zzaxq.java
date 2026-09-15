package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxq extends zzbae implements zzbbm {
    private static final zzaxq zzf;
    private static volatile zzbbt zzg;
    private zzbao zzb = zzbu();
    private String zze = "";

    static {
        zzaxq zzaxqVar = new zzaxq();
        zzf = zzaxqVar;
        zzbae.zzbn(zzaxq.class, zzaxqVar);
    }

    private zzaxq() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"zzb", zzaxp.class, "zze"});
        }
        if (i2 == 3) {
            return new zzaxq();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxn(bArr);
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
        synchronized (zzaxq.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public final List zza() {
        return this.zzb;
    }
}
