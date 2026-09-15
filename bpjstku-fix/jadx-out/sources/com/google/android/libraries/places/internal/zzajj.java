package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajj extends zzbae implements zzbbm {
    private static final zzajj zzp;
    private static volatile zzbbt zzq;
    private int zzb;
    private zzaje zzg;
    private zzzy zzh;
    private int zzk;
    private int zzl;
    private int zzn;
    private byte zzo = 2;
    private String zze = "";
    private String zzf = "";
    private int zzi = 1;
    private String zzj = "";
    private String zzm = "";

    static {
        zzajj zzajjVar = new zzajj();
        zzp = zzajjVar;
        zzbae.zzbn(zzajj.class, zzajjVar);
    }

    private zzajj() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i2 == 2) {
            return zzbo(zzp, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007᠌\u0006\bင\u0007\tဈ\b\n᠌\t", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzajg.zza, "zzj", "zzk", zzaji.zza, "zzl", "zzm", "zzn", zzajh.zza});
        }
        if (i2 == 3) {
            return new zzajj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzajf(bArr);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            this.zzo = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzq;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzajj.class) {
            zzazzVar = zzq;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzp);
                zzq = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
