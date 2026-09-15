package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdj extends zzbae implements zzbbm {
    private static final zzbdj zzf;
    private static volatile zzbbt zzg;
    private String zzb = "";
    private String zze = "";

    static {
        zzbdj zzbdjVar = new zzbdj();
        zzf = zzbdjVar;
        zzbae.zzbn(zzbdj.class, zzbdjVar);
    }

    private zzbdj() {
    }

    public static zzbdi zzc() {
        return (zzbdi) zzf.zzbj();
    }

    final /* synthetic */ void zzf(String str) {
        this.zze = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzbdj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbdi(bArr);
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
        synchronized (zzbdj.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzbdj zze() {
        return zzf;
    }
}
