package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauu extends zzbae implements zzbbm {
    private static final zzauu zzh;
    private static volatile zzbbt zzi;
    private String zzb = "";
    private int zze;
    private int zzf;
    private boolean zzg;

    static {
        zzauu zzauuVar = new zzauu();
        zzh = zzauuVar;
        zzbae.zzbn(zzauu.class, zzauuVar);
    }

    private zzauu() {
    }

    public static zzaut zza() {
        return (zzaut) zzh.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzauu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaut(bArr);
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
        synchronized (zzauu.class) {
            zzazzVar = zzi;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzh);
                zzi = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzauu zzc() {
        return zzh;
    }

    final /* synthetic */ void zzd(String str) {
        this.zzb = str;
    }

    final /* synthetic */ void zze(int i) {
        this.zze = i;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzf = i;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zzg = true;
    }
}
