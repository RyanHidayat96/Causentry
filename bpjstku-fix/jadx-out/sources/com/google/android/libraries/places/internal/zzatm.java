package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzatm extends zzbae implements zzbbm {
    private static final zzatm zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzate zze;
    private zzate zzf;

    static {
        zzatm zzatmVar = new zzatm();
        zzg = zzatmVar;
        zzbae.zzbn(zzatm.class, zzatmVar);
    }

    private zzatm() {
    }

    public final zzate zza() {
        zzate zzateVar = this.zze;
        return zzateVar == null ? zzate.zzd() : zzateVar;
    }

    public final zzate zzc() {
        zzate zzateVar = this.zzf;
        return zzateVar == null ? zzate.zzd() : zzateVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzatm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzatl(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzatm.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzatm zzd() {
        return zzg;
    }
}
