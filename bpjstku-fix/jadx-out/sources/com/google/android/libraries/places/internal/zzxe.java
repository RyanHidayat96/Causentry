package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzxe extends zzbae implements zzbbm {
    private static final zzxe zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbu();

    static {
        zzxe zzxeVar = new zzxe();
        zze = zzxeVar;
        zzbae.zzbn(zzxe.class, zzxeVar);
    }

    private zzxe() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzxc.class});
        }
        if (i2 == 3) {
            return new zzxe();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzxd(bArr);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzf;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzxe.class) {
            zzazzVar = zzf;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zze);
                zzf = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
