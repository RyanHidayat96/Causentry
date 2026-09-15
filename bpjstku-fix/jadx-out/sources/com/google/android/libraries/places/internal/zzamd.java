package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamd extends zzbae implements zzbbm {
    private static final zzamd zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbae.zzbu();

    static {
        zzamd zzamdVar = new zzamd();
        zze = zzamdVar;
        zzbae.zzbn(zzamd.class, zzamdVar);
    }

    private zzamd() {
    }

    public static zzamc zza() {
        return (zzamc) zze.zzbj();
    }

    final /* synthetic */ void zzc(Iterable iterable) {
        zzbao zzbaoVar = this.zzb;
        if (!zzbaoVar.zza()) {
            this.zzb = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new zzamd();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzamc(bArr);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzf;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzamd.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
