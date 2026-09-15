package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbck extends zzbae implements zzbbm {
    private static final zzbck zzf;
    private static volatile zzbbt zzg;
    private long zzb;
    private int zze;

    static {
        zzbck zzbckVar = new zzbck();
        zzf = zzbckVar;
        zzbae.zzbn(zzbck.class, zzbckVar);
    }

    private zzbck() {
    }

    public static zzbcj zzf() {
        return (zzbcj) zzf.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbbx(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzbck();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbcj(bArr);
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
        synchronized (zzbck.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzbck zzg() {
        return zzf;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final int zze() {
        return this.zze;
    }

    final /* synthetic */ void zzh(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzi(int i) {
        this.zze = i;
    }
}
