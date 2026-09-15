package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzate extends zzbae implements zzbbm {
    private static final zzate zzf;
    private static volatile zzbbt zzg;
    private String zzb = "";
    private zzbao zze = zzbu();

    static {
        zzate zzateVar = new zzate();
        zzf = zzateVar;
        zzbae.zzbn(zzate.class, zzateVar);
    }

    private zzate() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", zzatk.class});
        }
        if (i2 == 3) {
            return new zzate();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzatd(bArr);
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
        synchronized (zzate.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzate zzd() {
        return zzf;
    }

    public final String zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zze;
    }
}
