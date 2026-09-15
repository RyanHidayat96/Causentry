package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaif extends zzbae implements zzbbm {
    private static final zzaif zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        zzaif zzaifVar = new zzaif();
        zzg = zzaifVar;
        zzbae.zzbn(zzaif.class, zzaifVar);
    }

    private zzaif() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzaif();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaie(bArr);
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
        synchronized (zzaif.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
