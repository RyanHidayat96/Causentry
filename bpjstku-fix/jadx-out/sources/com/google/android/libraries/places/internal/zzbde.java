package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbde extends zzbae implements zzbbm {
    private static final zzbde zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzbde zzbdeVar = new zzbde();
        zzi = zzbdeVar;
        zzbae.zzbn(zzbde.class, zzbdeVar);
    }

    private zzbde() {
    }

    public static zzbdc zzc() {
        return (zzbdc) zzi.zzbj();
    }

    final /* synthetic */ void zzf(zzbdd zzbddVar) {
        this.zzb = zzbddVar.zza();
    }

    final /* synthetic */ void zzg(String str) {
        this.zze = str;
    }

    final /* synthetic */ void zzh(String str) {
        this.zzg = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbde();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbdc(bArr);
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
        synchronized (zzbde.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzbde zze() {
        return zzi;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzh = 2;
    }
}
