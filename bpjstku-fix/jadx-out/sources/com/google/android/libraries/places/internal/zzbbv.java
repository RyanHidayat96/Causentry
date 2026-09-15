package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzbbv {
    public static final /* synthetic */ int zza = 0;
    private static final zzbbv zzb = new zzbbv();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzbca zzc = new zzbbd();

    private zzbbv() {
    }

    public final zzbbz zzb(Class cls) {
        zzbap.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzd;
        zzbbz zzbbzVarZza = (zzbbz) concurrentMap.get(cls);
        if (zzbbzVarZza == null) {
            zzbbzVarZza = this.zzc.zza(cls);
            zzbap.zza(cls, "messageType");
            zzbbz zzbbzVar = (zzbbz) concurrentMap.putIfAbsent(cls, zzbbzVarZza);
            if (zzbbzVar != null) {
                return zzbbzVar;
            }
        }
        return zzbbzVarZza;
    }

    public static zzbbv zza() {
        return zzb;
    }
}
