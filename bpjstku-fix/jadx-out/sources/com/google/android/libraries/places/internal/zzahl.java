package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahl extends zzbae implements zzbbm {
    private static final zzahl zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private String zzf = "";

    static {
        zzahl zzahlVar = new zzahl();
        zzg = zzahlVar;
        zzbae.zzbn(zzahl.class, zzahlVar);
    }

    private zzahl() {
    }

    public static zzahk zza() {
        return (zzahk) zzg.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzahl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzahk(bArr);
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
        synchronized (zzahl.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }
}
