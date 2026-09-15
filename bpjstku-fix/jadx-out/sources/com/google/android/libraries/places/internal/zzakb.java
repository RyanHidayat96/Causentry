package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzakb extends zzbae implements zzbbm {
    private static final zzakb zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private zzzw zzf;
    private byte zzk = 2;
    private String zze = "";
    private String zzg = "";
    private zzbao zzh = zzbae.zzbu();
    private String zzi = "";
    private String zzj = "";

    static {
        zzakb zzakbVar = new zzakb();
        zzl = zzakbVar;
        zzbae.zzbn(zzakb.class, zzakbVar);
    }

    private zzakb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return zzbo(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzakb();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaka(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            this.zzk = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzm;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzakb.class) {
            zzazzVar = zzm;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzl);
                zzm = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
