package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdw extends zzbae implements zzbbm {
    private static final zzbdw zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private long zze;
    private zzayz zzf = zzayz.zzb;
    private String zzg = "";
    private zzarz zzh;

    static {
        zzbdw zzbdwVar = new zzbdw();
        zzi = zzbdwVar;
        zzbae.zzbn(zzbdw.class, zzbdwVar);
    }

    private zzbdw() {
    }

    public static zzbdv zzc() {
        return (zzbdv) zzi.zzbj();
    }

    final /* synthetic */ void zze(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004ည\u0001", new Object[]{"zzb", "zze", "zzg", "zzh", "zzf"});
        }
        if (i2 == 3) {
            return new zzbdw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbdv(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbdw.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
