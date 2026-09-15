package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxp extends zzbae implements zzbbm {
    private static final zzaxp zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzazm zze;
    private int zzf;

    static {
        zzaxp zzaxpVar = new zzaxp();
        zzg = zzaxpVar;
        zzbae.zzbn(zzaxp.class, zzaxpVar);
    }

    private zzaxp() {
    }

    public final zzazm zza() {
        zzazm zzazmVar = this.zze;
        return zzazmVar == null ? zzazm.zzf() : zzazmVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzaxp();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxo(bArr);
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
        synchronized (zzaxp.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public final int zzc() {
        return this.zzf;
    }
}
