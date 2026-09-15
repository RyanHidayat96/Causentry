package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzani extends zzbae implements zzbbm {
    private static final zzani zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private zzang zzf;
    private int zzg;

    static {
        zzani zzaniVar = new zzani();
        zzh = zzaniVar;
        zzbae.zzbn(zzani.class, zzaniVar);
    }

    private zzani() {
    }

    public static zzanh zza() {
        return (zzanh) zzh.zzbj();
    }

    final /* synthetic */ void zzc(zzang zzangVar) {
        this.zzf = zzangVar;
        this.zzb |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", zzanz.zza, "zzf", "zzg", zzanj.zza});
        }
        if (i2 == 3) {
            return new zzani();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzanh(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzani.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }
}
