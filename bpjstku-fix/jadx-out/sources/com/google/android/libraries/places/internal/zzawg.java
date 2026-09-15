package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawg extends zzbae implements zzbbm {
    private static final zzawg zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private zzbec zzh;
    private boolean zzi;

    static {
        zzawg zzawgVar = new zzawg();
        zzj = zzawgVar;
        zzbae.zzbn(zzawg.class, zzawgVar);
    }

    private zzawg() {
    }

    public final zzbec zzf() {
        zzbec zzbecVar = this.zzh;
        return zzbecVar == null ? zzbec.zzg() : zzbecVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzj, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005\u0007\u0006ဉ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzi", "zzh"});
        }
        if (i2 == 3) {
            return new zzawg();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzawf(bArr);
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
        synchronized (zzawg.class) {
            zzazzVar = zzk;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzj);
                zzk = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public static zzawg zzh() {
        return zzj;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzg() {
        return this.zzi;
    }
}
