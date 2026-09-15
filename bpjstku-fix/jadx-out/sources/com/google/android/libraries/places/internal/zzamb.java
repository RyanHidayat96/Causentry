package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamb extends zzbae implements zzbbm {
    private static final zzamb zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private boolean zzg;

    static {
        zzamb zzambVar = new zzamb();
        zzh = zzambVar;
        zzbae.zzbn(zzamb.class, zzambVar);
    }

    private zzamb() {
    }

    public static zzalz zza() {
        return (zzalz) zzh.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"zzb", "zze", zzama.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzamb();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzalz(bArr);
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
        synchronized (zzamb.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzd(int i) {
        this.zze = 1;
        this.zzb = 1 | this.zzb;
    }
}
