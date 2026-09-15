package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzalj extends zzbae implements zzbbm {
    private static final zzalj zzb;
    private static volatile zzbbt zze;

    static {
        zzalj zzaljVar = new zzalj();
        zzb = zzaljVar;
        zzbae.zzbn(zzalj.class, zzaljVar);
    }

    private zzalj() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (i2 == 2) {
            return zzbo(zzb, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new zzalj();
        }
        if (i2 == 4) {
            return new zzali(bArr);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zze;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzalj.class) {
            zzazzVar = zze;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzb);
                zze = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
