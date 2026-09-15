package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzalh extends zzbae implements zzbbm {
    private static final zzalh zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzzw zze;
    private byte zzf = 2;

    static {
        zzalh zzalhVar = new zzalh();
        zzg = zzalhVar;
        zzbae.zzbn(zzalh.class, zzalhVar);
    }

    private zzalh() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzalh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzalg(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            this.zzf = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzalh.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
