package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbee extends zzbae implements zzbbm {
    private static final zzbee zzf;
    private static volatile zzbbt zzg;
    private double zzb;
    private double zze;

    static {
        zzbee zzbeeVar = new zzbee();
        zzf = zzbeeVar;
        zzbae.zzbn(zzbee.class, zzbeeVar);
    }

    private zzbee() {
    }

    public static zzbed zzf() {
        return (zzbed) zzf.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzbee();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzbed(bArr);
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
        synchronized (zzbee.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzbee zzg() {
        return zzf;
    }

    public final double zzc() {
        return this.zzb;
    }

    public final double zze() {
        return this.zze;
    }

    final /* synthetic */ void zzh(double d) {
        this.zzb = d;
    }

    final /* synthetic */ void zzi(double d) {
        this.zze = d;
    }
}
