package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzacy extends zzbae implements zzbbm {
    private static final zzacy zzf;
    private static volatile zzbbt zzg;
    private int zzb;
    private int zze;

    static {
        zzacy zzacyVar = new zzacy();
        zzf = zzacyVar;
        zzbae.zzbn(zzacy.class, zzacyVar);
    }

    private zzacy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zze", zzaee.zza});
        }
        if (i2 == 3) {
            return new zzacy();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzacx(bArr);
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
        synchronized (zzacy.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
