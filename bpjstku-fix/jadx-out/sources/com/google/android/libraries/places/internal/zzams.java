package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzams extends zzbae implements zzbbm {
    private static final zzams zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private double zze;
    private zzbam zzf = zzbr();

    static {
        zzams zzamsVar = new zzams();
        zzg = zzamsVar;
        zzbae.zzbn(zzams.class, zzamsVar);
    }

    private zzams() {
    }

    public static zzamr zza() {
        return (zzamr) zzg.zzbj();
    }

    final /* synthetic */ void zzd(Iterable iterable) {
        zzbam zzbamVar = this.zzf;
        if (!zzbamVar.zza()) {
            this.zzf = zzbae.zzbs(zzbamVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzf.zzh(((zzahq) it.next()).zza());
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
            return zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001က\u0000\u0002ࠬ", new Object[]{"zzb", "zze", "zzf", zzahp.zza});
        }
        if (i2 == 3) {
            return new zzams();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzamr(bArr);
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
        synchronized (zzams.class) {
            zzazzVar = zzh;
            if (zzazzVar == null) {
                zzazzVar = new zzazz(zzg);
                zzh = zzazzVar;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(double d) {
        this.zzb |= 1;
        this.zze = d;
    }
}
