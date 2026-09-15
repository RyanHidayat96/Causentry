package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxe extends zzbae implements zzbbm {
    private static final zzaxe zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbei zze;
    private zzbei zzf;

    static {
        zzaxe zzaxeVar = new zzaxe();
        zzg = zzaxeVar;
        zzbae.zzbn(zzaxe.class, zzaxeVar);
    }

    private zzaxe() {
    }

    public final zzbei zzc() {
        zzbei zzbeiVar = this.zze;
        return zzbeiVar == null ? zzbei.zzg() : zzbeiVar;
    }

    public final zzbei zze() {
        zzbei zzbeiVar = this.zzf;
        return zzbeiVar == null ? zzbei.zzg() : zzbeiVar;
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
            return new zzaxe();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaxd(bArr);
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
        synchronized (zzaxe.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzaxe zzf() {
        return zzg;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }
}
