package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzvc extends zzbae implements zzbbm {
    private static final zzvc zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzuw zze;
    private zzvn zzf;
    private zzvs zzg;
    private zzaad zzh;
    private int zzi;

    static {
        zzvc zzvcVar = new zzvc();
        zzj = zzvcVar;
        zzbae.zzbn(zzvc.class, zzvcVar);
    }

    private zzvc() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဋ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzvc();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzvb(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzvc.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
