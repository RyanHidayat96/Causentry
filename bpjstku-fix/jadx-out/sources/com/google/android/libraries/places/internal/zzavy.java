package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavy extends zzbae implements zzbbm {
    private static final zzavy zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private zzbeg zze;
    private zzbeg zzg;
    private zzaxg zzi;
    private zzbeg zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        zzavy zzavyVar = new zzavy();
        zzk = zzavyVar;
        zzbae.zzbn(zzavy.class, zzavyVar);
    }

    private zzavy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005Ȉ\u0006ဉ\u0003", new Object[]{"zzb", "zze", "zzg", "zzi", "zzf", "zzh", "zzj"});
        }
        if (i2 == 3) {
            return new zzavy();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzavx(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzavy.class) {
            zzazzVar = zzl;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzk);
                zzl = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
