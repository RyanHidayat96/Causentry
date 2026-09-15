package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqo extends zzbae implements zzbbm {
    private static final zzaqo zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbee zze;
    private zzbee zzf;

    static {
        zzaqo zzaqoVar = new zzaqo();
        zzg = zzaqoVar;
        zzbae.zzbn(zzaqo.class, zzaqoVar);
    }

    private zzaqo() {
    }

    public static zzaqn zzd() {
        return (zzaqn) zzg.zzbj();
    }

    public final zzbee zza() {
        zzbee zzbeeVar = this.zze;
        return zzbeeVar == null ? zzbee.zzg() : zzbeeVar;
    }

    public final zzbee zzc() {
        zzbee zzbeeVar = this.zzf;
        return zzbeeVar == null ? zzbee.zzg() : zzbeeVar;
    }

    final /* synthetic */ void zzf(zzbee zzbeeVar) {
        this.zze = zzbeeVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzg(zzbee zzbeeVar) {
        this.zzf = zzbeeVar;
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
            return zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzaqo();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaqn(bArr);
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
        synchronized (zzaqo.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzaqo zze() {
        return zzg;
    }
}
