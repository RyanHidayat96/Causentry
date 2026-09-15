package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzayb extends zzbae implements zzbbm {
    private static final zzayb zzg;
    private static volatile zzbbt zzh;
    private double zzb;
    private zzbam zze = zzbr();
    private zzbao zzf = zzbae.zzbu();

    static {
        zzayb zzaybVar = new zzayb();
        zzg = zzaybVar;
        zzbae.zzbn(zzayb.class, zzaybVar);
    }

    private zzayb() {
    }

    public static zzaya zza() {
        return (zzaya) zzg.zzbj();
    }

    final /* synthetic */ void zzd(Iterable iterable) {
        zzbam zzbamVar = this.zze;
        if (!zzbamVar.zza()) {
            this.zze = zzbae.zzbs(zzbamVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zze.zzh(((zzaun) it.next()).zza());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0000\u0002,\u0003Ț", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzayb();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzaya(bArr);
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
        synchronized (zzayb.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(double d) {
        this.zzb = d;
    }
}
