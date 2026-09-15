package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaeo extends zzbae implements zzbbm {
    private static final zzaeo zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzaeo zzaeoVar = new zzaeo();
        zzh = zzaeoVar;
        zzbae.zzbn(zzaeo.class, zzaeoVar);
    }

    private zzaeo() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", zzaen.zza});
        }
        if (i2 == 3) {
            return new zzaeo();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaem(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaeo.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
