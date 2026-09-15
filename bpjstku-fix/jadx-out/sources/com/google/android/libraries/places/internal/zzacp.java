package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzacp extends zzbae implements zzbbm {
    private static final zzacp zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private int zze;
    private float zzf;
    private int zzg;
    private float zzh;
    private int zzi;

    static {
        zzacp zzacpVar = new zzacp();
        zzj = zzacpVar;
        zzbae.zzbn(zzacp.class, zzacpVar);
    }

    private zzacp() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003င\u0002\u0004ခ\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzacp();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaco(bArr);
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
        synchronized (zzacp.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
