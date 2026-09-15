package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaud extends zzbae implements zzbbm {
    private static final zzaud zzf;
    private static volatile zzbbt zzg;
    private String zzb = "";
    private zzbao zze = zzbu();

    static {
        zzaud zzaudVar = new zzaud();
        zzf = zzaudVar;
        zzbae.zzbn(zzaud.class, zzaudVar);
    }

    private zzaud() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", zzauc.class});
        }
        if (i2 == 3) {
            return new zzaud();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaua(bArr);
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
        synchronized (zzaud.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
