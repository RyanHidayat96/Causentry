package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zzash extends zzbae implements zzbbm {
    private static final zzash zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private zzbee zzg;
    private int zzh;
    private zzaqo zzi;
    private zzaqo zzj;
    private zzbek zzl;
    private zzasm zzp;
    private String zze = "";
    private String zzf = "";
    private String zzk = "";
    private zzbao zzm = zzbu();
    private zzbao zzn = zzbu();
    private zzbao zzo = zzbae.zzbu();

    static {
        zzash zzashVar = new zzash();
        zzq = zzashVar;
        zzbae.zzbn(zzash.class, zzashVar);
    }

    private zzash() {
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzq, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bဉ\u0003\t\u001b\u000b\u001b\fȚ\rဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzasf.class, "zzn", zzbeg.class, "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzash();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzasg(bArr);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzr;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzash.class) {
            zzazzVar = zzr;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzq);
                zzr = zzazzVar;
            }
        }
        return zzazzVar;
    }

    public final String zza() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzo;
    }
}
