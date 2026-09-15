package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzatq extends zzbae implements zzbbm {
    private static final zzatq zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbee zze;
    private double zzf;

    static {
        zzatq zzatqVar = new zzatq();
        zzg = zzatqVar;
        zzbae.zzbn(zzatq.class, zzatqVar);
    }

    private zzatq() {
    }

    public static zzatp zza() {
        return (zzatp) zzg.zzbj();
    }

    final /* synthetic */ void zzc(zzbee zzbeeVar) {
        this.zze = zzbeeVar;
        this.zzb |= 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzatq();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzatp(bArr);
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
        synchronized (zzatq.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzd(double d) {
        this.zzf = d;
    }
}
