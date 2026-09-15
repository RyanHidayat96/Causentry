package com.google.android.libraries.places.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzri {
    private final zzra zza;

    public static zzri zza() {
        return new zzri(zzqj.zzb(false));
    }

    public static Runnable zzb(zzri zzriVar, Runnable runnable) {
        zzra zzraVar = zzriVar.zza;
        if (zzraVar == null) {
            throw new NullPointerException("Trying to propagate null trace");
        }
        Intrinsics.checkNotNullParameter(zzraVar, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        return new zzrf(zzraVar, runnable);
    }

    public final String toString() {
        return this.zza.toString();
    }

    private zzri(zzra zzraVar) {
        this.zza = zzraVar;
    }
}
