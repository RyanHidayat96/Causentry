package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayd extends zzbae implements zzbbm {
    private static final zzayd zzf;
    private static volatile zzbbt zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzayd zzaydVar = new zzayd();
        zzf = zzaydVar;
        zzbae.zzbn(zzayd.class, zzaydVar);
    }

    private zzayd() {
    }

    public static zzayc zza() {
        return (zzayc) zzf.zzbj();
    }

    final /* synthetic */ void zzc(zzaqo zzaqoVar) {
        this.zze = zzaqoVar;
        this.zzb = 1;
    }

    final /* synthetic */ void zzd(zzatq zzatqVar) {
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
            return zzbo(zzf, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzb", zzaqo.class, zzatq.class});
        }
        if (i2 == 3) {
            return new zzayd();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzayc(bArr);
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
        synchronized (zzayd.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
