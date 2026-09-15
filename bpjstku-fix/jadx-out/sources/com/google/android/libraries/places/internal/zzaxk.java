package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxk extends zzbae implements zzbbm {
    private static final zzaxk zzh;
    private static volatile zzbbt zzi;
    private boolean zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;

    static {
        zzaxk zzaxkVar = new zzaxk();
        zzh = zzaxkVar;
        zzbae.zzbn(zzaxk.class, zzaxkVar);
    }

    private zzaxk() {
    }

    public static zzaxj zza() {
        return (zzaxj) zzh.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaxk();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxj(bArr);
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
        synchronized (zzaxk.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(boolean z) {
        this.zzb = z;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zze = z;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzf = z;
    }

    final /* synthetic */ void zzf(boolean z) {
        this.zzg = z;
    }
}
