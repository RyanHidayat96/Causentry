package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzasu extends zzbae implements zzbbm {
    private static final zzasu zzg;
    private static volatile zzbbt zzh;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzasu zzasuVar = new zzasu();
        zzg = zzasuVar;
        zzbae.zzbn(zzasu.class, zzasuVar);
    }

    private zzasu() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzasu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzast(bArr);
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
        synchronized (zzasu.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzasu zze() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzf;
    }
}
