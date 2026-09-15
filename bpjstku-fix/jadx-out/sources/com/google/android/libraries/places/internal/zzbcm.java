package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzbcm {
    private static volatile int zza = 100;

    abstract void zza(Object obj, int i, long j);

    abstract void zzb(Object obj, int i, int i2);

    abstract void zzc(Object obj, int i, long j);

    abstract void zzd(Object obj, int i, zzayz zzayzVar);

    abstract void zze(Object obj, int i, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzbby zzbbyVar, int i) throws IOException {
        int iZzc = zzbbyVar.zzc();
        int i2 = iZzc >>> 3;
        int i3 = iZzc & 7;
        if (i3 == 0) {
            zza(obj, i2, zzbbyVar.zzh());
            return true;
        }
        if (i3 == 1) {
            zzc(obj, i2, zzbbyVar.zzj());
            return true;
        }
        if (i3 == 2) {
            zzd(obj, i2, zzbbyVar.zzs());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzbar("Protocol message end-group tag did not match expected tag.");
            }
            if (i3 != 5) {
                throw new zzbaq("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i2, zzbbyVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i4 = i + 1;
        if (i4 >= zza) {
            throw new zzbar("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzbbyVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzbbyVar, i4)) {
        }
        if (((i2 << 3) | 4) != zzbbyVar.zzc()) {
            throw new zzbar("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i2, zzg(objZzf));
        return true;
    }

    zzbcm() {
    }
}
