package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zzbdy extends zzbab implements zzbbm {
    private static final zzbdy zzf;
    private static volatile zzbbt zzg;
    private byte zze = 2;

    static {
        zzbdy zzbdyVar = new zzbdy();
        zzf = zzbdyVar;
        zzbae.zzbn(zzbdy.class, zzbdyVar);
    }

    private zzbdy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        byte[] bArr = null;
        if (i2 == 2) {
            return zzbo(zzf, "\u0003\u0000", null);
        }
        if (i2 == 3) {
            return new zzbdy();
        }
        if (i2 == 4) {
            return new zzbdx(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            this.zze = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbdy.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzbdy zzc() {
        return zzf;
    }
}
