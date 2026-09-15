package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class zzacn extends zzbae implements zzbbm {
    private static final zzacn zzo;
    private static volatile zzbbt zzp;
    private int zzb;
    private long zze;
    private long zzf;
    private zzbao zzg = zzbu();
    private zzbao zzh = zzbu();
    private zzbao zzi = zzbu();
    private zzbao zzj = zzbu();
    private zzacw zzk;
    private zzacw zzl;
    private zzacw zzm;
    private zzacw zzn;

    static {
        zzacn zzacnVar = new zzacn();
        zzo = zzacnVar;
        zzbae.zzbn(zzacn.class, zzacnVar);
    }

    private zzacn() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", zzacp.class, "zzh", zzacp.class, "zzi", zzacp.class, "zzj", zzacp.class, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzacn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzacm(bArr);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzp;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzacn.class) {
            zzazzVar = zzp;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzo);
                zzp = zzazzVar;
            }
        }
        return zzazzVar;
    }
}
