package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaxb extends zzbae implements zzbbm {
    private static final zzaxb zzf;
    private static volatile zzbbt zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzaxb zzaxbVar = new zzaxb();
        zzf = zzaxbVar;
        zzbae.zzbn(zzaxb.class, zzaxbVar);
    }

    private zzaxb() {
    }

    public static zzaxa zza() {
        return (zzaxa) zzf.zzbj();
    }

    final /* synthetic */ void zzc(String str) {
        this.zzb = 1;
        this.zze = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȼ\u0000", new Object[]{"zze", "zzb"});
        }
        if (i2 == 3) {
            return new zzaxb();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxa(bArr);
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
        synchronized (zzaxb.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
