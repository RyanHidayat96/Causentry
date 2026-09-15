package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaqt extends zzbae implements zzbbm {
    private static final zzaqt zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbu();

    static {
        zzaqt zzaqtVar = new zzaqt();
        zze = zzaqtVar;
        zzbae.zzbn(zzaqt.class, zzaqtVar);
    }

    private zzaqt() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzarb.class});
        }
        if (i2 == 3) {
            return new zzaqt();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaqs(bArr);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzf;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaqt.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
