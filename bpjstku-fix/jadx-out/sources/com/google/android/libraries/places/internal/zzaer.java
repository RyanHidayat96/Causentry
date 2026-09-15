package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaer extends zzbae implements zzbbm {
    private static final zzaer zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private String zze = "";
    private int zzf;
    private long zzg;

    static {
        zzaer zzaerVar = new zzaer();
        zzh = zzaerVar;
        zzbae.zzbn(zzaer.class, zzaerVar);
    }

    private zzaer() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zze", "zzf", zzaeq.zza, "zzg"});
        }
        if (i2 == 3) {
            return new zzaer();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaep(bArr);
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
        synchronized (zzaer.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
