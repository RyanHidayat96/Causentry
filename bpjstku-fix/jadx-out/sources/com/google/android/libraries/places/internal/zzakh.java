package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakh extends zzbae implements zzbbm {
    private static final zzakh zzf;
    private static volatile zzbbt zzg;
    private int zzb;
    private int zze;

    static {
        zzakh zzakhVar = new zzakh();
        zzf = zzakhVar;
        zzbae.zzbn(zzakh.class, zzakhVar);
    }

    private zzakh() {
    }

    public static zzakg zza() {
        return (zzakg) zzf.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zze", zzakf.zza});
        }
        if (i2 == 3) {
            return new zzakh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzakg(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzakh.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzd(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
