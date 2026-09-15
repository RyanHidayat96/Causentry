package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalf extends zzbae implements zzbbm {
    private static final zzalf zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzbao zze = zzbae.zzbu();
    private int zzf;
    private int zzg;
    private zzamd zzh;

    static {
        zzalf zzalfVar = new zzalf();
        zzi = zzalfVar;
        zzbae.zzbn(zzalf.class, zzalfVar);
    }

    private zzalf() {
    }

    public static zzale zza() {
        return (zzale) zzi.zzbj();
    }

    final /* synthetic */ void zzd(zzamd zzamdVar) {
        this.zzh = zzamdVar;
        this.zzb |= 4;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzahz.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzalf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzale(bArr);
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
        synchronized (zzalf.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(int i) {
        this.zzb |= 2;
        this.zzg = 1;
    }
}
