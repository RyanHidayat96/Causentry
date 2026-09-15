package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakd extends zzbae implements zzbbm {
    private static final zzakd zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzzy zzf;
    private zzaje zzg;
    private byte zzh = 2;
    private String zze = "";

    static {
        zzakd zzakdVar = new zzakd();
        zzi = zzakdVar;
        zzbae.zzbn(zzakd.class, zzakdVar);
    }

    private zzakd() {
    }

    public static zzakc zza() {
        return (zzakc) zzi.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzakd();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzakc(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            this.zzh = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzakd.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(zzaje zzajeVar) {
        this.zzg = zzajeVar;
        this.zzb |= 4;
    }
}
