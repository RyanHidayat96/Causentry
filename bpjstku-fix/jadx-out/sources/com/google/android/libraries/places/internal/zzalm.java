package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalm extends zzbae implements zzbbm {
    private static final zzalm zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzaje zze;
    private int zzf;
    private int zzg;
    private zzamd zzh;

    static {
        zzalm zzalmVar = new zzalm();
        zzi = zzalmVar;
        zzbae.zzbn(zzalm.class, zzalmVar);
    }

    private zzalm() {
    }

    public static zzalk zza() {
        return (zzalk) zzi.zzbj();
    }

    final /* synthetic */ void zzd(zzamd zzamdVar) {
        this.zzh = zzamdVar;
        this.zzb |= 8;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", zzall.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzalm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzalk(bArr);
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
        synchronized (zzalm.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(int i) {
        this.zzb |= 4;
        this.zzg = i;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }
}
