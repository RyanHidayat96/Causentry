package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzatn extends zzbae implements zzbbm {
    private static final zzatn zzf;
    private static volatile zzbbt zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzatn zzatnVar = new zzatn();
        zzf = zzatnVar;
        zzbae.zzbn(zzatn.class, zzatnVar);
    }

    private zzatn() {
    }

    public final zzatg zzc() {
        return this.zzb == 1 ? (zzatg) this.zze : zzatg.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzf, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzb", zzatg.class, zzati.class});
        }
        if (i2 == 3) {
            return new zzatn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzatc(bArr);
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
        synchronized (zzatn.class) {
            zzazzVar = zzg;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzf);
                zzg = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public final boolean zza() {
        return this.zzb == 1;
    }
}
