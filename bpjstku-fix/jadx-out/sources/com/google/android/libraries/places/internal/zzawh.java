package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawh extends zzbae implements zzbbm {
    private static final zzawh zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzawg zze;
    private zzawg zzf;

    static {
        zzawh zzawhVar = new zzawh();
        zzg = zzawhVar;
        zzbae.zzbn(zzawh.class, zzawhVar);
    }

    private zzawh() {
    }

    public final zzawg zzc() {
        zzawg zzawgVar = this.zze;
        return zzawgVar == null ? zzawg.zzh() : zzawgVar;
    }

    public final zzawg zze() {
        zzawg zzawgVar = this.zzf;
        return zzawgVar == null ? zzawg.zzh() : zzawgVar;
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
            return new zzawh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzawe(bArr);
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
        synchronized (zzawh.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }
}
