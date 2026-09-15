package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxv extends zzbae implements zzbbm {
    private static final zzaxv zzf;
    private static volatile zzbbt zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzaxv zzaxvVar = new zzaxv();
        zzf = zzaxvVar;
        zzbae.zzbn(zzaxv.class, zzaxvVar);
    }

    private zzaxv() {
    }

    public static zzaxu zza() {
        return (zzaxu) zzf.zzbj();
    }

    final /* synthetic */ void zzc(zzatq zzatqVar) {
        this.zze = zzatqVar;
        this.zzb = 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005Ȼ\u0000", new Object[]{"zze", "zzb", zzauy.class, zzatq.class, zzaxt.class});
        }
        if (i2 == 3) {
            return new zzaxv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxu(bArr);
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
        synchronized (zzaxv.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
