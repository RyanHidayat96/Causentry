package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayh extends zzbae implements zzbbm {
    private static final zzayh zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private zzaxb zze;
    private int zzf;
    private zzazm zzg;
    private zzazm zzh;
    private zzazm zzi;
    private int zzj;

    static {
        zzayh zzayhVar = new zzayh();
        zzk = zzayhVar;
        zzbae.zzbn(zzayh.class, zzayhVar);
    }

    private zzayh() {
    }

    public static zzayg zza() {
        return (zzayg) zzk.zzbj();
    }

    final /* synthetic */ void zzc(zzaxb zzaxbVar) {
        this.zze = zzaxbVar;
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
            return zzbo(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005င\u0005\u0006ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzh", "zzi", "zzj", "zzg"});
        }
        if (i2 == 3) {
            return new zzayh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzayg(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzayh.class) {
            zzazzVar = zzl;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzk);
                zzl = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
