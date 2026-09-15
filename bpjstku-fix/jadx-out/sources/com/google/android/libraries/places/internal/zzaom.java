package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaom extends zzbae implements zzbbm {
    private static final zzaom zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzcs zze;
    private zzbao zzf = zzbu();

    static {
        zzaom zzaomVar = new zzaom();
        zzg = zzaomVar;
        zzbae.zzbn(zzaom.class, zzaomVar);
    }

    private zzaom() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzaol.class});
        }
        if (i2 == 3) {
            return new zzaom();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaoj(bArr);
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
        synchronized (zzaom.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
