package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzang extends zzbae implements zzbbm {
    private static final zzang zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzang zzangVar = new zzang();
        zzi = zzangVar;
        zzbae.zzbn(zzang.class, zzangVar);
    }

    private zzang() {
    }

    public static zzanf zza() {
        return (zzanf) zzi.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzang();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzanf(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzang.class) {
            zzazzVar = zzj;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzi);
                zzj = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    final /* synthetic */ void zzf(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }
}
