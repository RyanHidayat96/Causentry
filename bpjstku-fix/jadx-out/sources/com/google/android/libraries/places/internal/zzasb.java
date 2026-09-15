package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzasb extends zzbae implements zzbbm {
    private static final zzasb zzj;
    private static volatile zzbbt zzk;
    private Object zze;
    private int zzb = 0;
    private String zzf = "";
    private String zzg = "";
    private zzbao zzh = zzbae.zzbu();
    private zzbam zzi = zzbr();

    static {
        zzasb zzasbVar = new zzasb();
        zzj = zzasbVar;
        zzbae.zzbn(zzasb.class, zzasbVar);
    }

    private zzasb() {
    }

    public static zzasa zza() {
        return (zzasa) zzj.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȼ\u0000\u0002<\u0000\u0003Ȉ\u0004Ȉ\u0005Ț\u0006,", new Object[]{"zze", "zzb", zzbee.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzasb();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzasa(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzasb.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzasb zzc() {
        return zzj;
    }

    final /* synthetic */ void zzd(String str) {
        this.zzb = 1;
        this.zze = str;
    }
}
