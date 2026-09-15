package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzacu extends zzbae implements zzbbm {
    private static final zzacu zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private float zzf;

    static {
        zzacu zzacuVar = new zzacu();
        zzg = zzacuVar;
        zzbae.zzbn(zzacu.class, zzacuVar);
    }

    private zzacu() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0010\u0011\u0002\u0000\u0000\u0000\u0010᠌\u0000\u0011ခ\u0001", new Object[]{"zzb", "zze", zzwr.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzacu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzact(bArr);
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
        synchronized (zzacu.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
