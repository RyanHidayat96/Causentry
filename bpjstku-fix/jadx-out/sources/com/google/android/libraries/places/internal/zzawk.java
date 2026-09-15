package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawk extends zzbae implements zzbbm {
    private static final zzawk zzf;
    private static volatile zzbbt zzg;
    private int zzb;
    private zzbec zze;

    static {
        zzawk zzawkVar = new zzawk();
        zzf = zzawkVar;
        zzbae.zzbn(zzawk.class, zzawkVar);
    }

    private zzawk() {
    }

    public final zzbec zza() {
        zzbec zzbecVar = this.zze;
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
            return zzbo(zzf, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzawk();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzawj(bArr);
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
        synchronized (zzawk.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
