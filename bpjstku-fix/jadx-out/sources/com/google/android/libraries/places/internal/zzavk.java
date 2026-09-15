package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzavk extends zzbae implements zzbbm {
    private static final zzavk zzf;
    private static volatile zzbbt zzg;
    private String zzb = "";
    private String zze = "";

    static {
        zzavk zzavkVar = new zzavk();
        zzf = zzavkVar;
        zzbae.zzbn(zzavk.class, zzavkVar);
    }

    private zzavk() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzavk();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzavj(bArr);
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
        synchronized (zzavk.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zze;
    }
}
