package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfv {
    public static final /* synthetic */ int zza = 0;
    private static final zzbfv zzb = new zzbfv(new zzbfr(), zzbfs.zza);
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    zzbfv(zzbfu... zzbfuVarArr) {
        for (int i = 0; i < 2; i++) {
            zzbfu zzbfuVar = zzbfuVarArr[i];
            this.zzc.put(zzbfuVar.zza(), zzbfuVar);
        }
    }

    public static zzbfv zza() {
        return zzb;
    }
}
