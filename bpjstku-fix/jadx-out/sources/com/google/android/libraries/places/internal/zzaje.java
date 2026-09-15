package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaje extends zzbae implements zzbbm {
    private static final zzaje zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private int zze;
    private boolean zzi;
    private int zzk;
    private zzbao zzf = zzbae.zzbu();
    private String zzg = "";
    private String zzh = "";
    private zzbao zzj = zzbae.zzbu();

    static {
        zzaje zzajeVar = new zzaje();
        zzl = zzajeVar;
        zzbae.zzbn(zzaje.class, zzajeVar);
    }

    private zzaje() {
    }

    public static zzajd zza() {
        return (zzajd) zzl.zzbj();
    }

    final /* synthetic */ void zzc(String str) {
        zzbao zzbaoVar = this.zzf;
        if (!zzbaoVar.zza()) {
            this.zzf = zzbae.zzbv(zzbaoVar);
        }
        this.zzf.add(str);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006\u001a\u0007င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzaje();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzajd(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzm;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaje.class) {
            zzazzVar = zzm;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzl);
                zzm = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzb |= 16;
        this.zzk = i;
    }
}
