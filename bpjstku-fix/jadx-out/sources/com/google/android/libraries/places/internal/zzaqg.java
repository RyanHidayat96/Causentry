package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqg {
    private static final zzaqg zza = new zzaqg(zzaqe.PROCEED, null, null, null, null);
    private final zzaqe zzb;
    private final ListenableFuture zzc;

    static {
        new zzaqg(zzaqe.DELAY_START, null, null, null, null);
    }

    private zzaqg(zzaqe zzaqeVar, zzaqf zzaqfVar, zzaqb zzaqbVar, ListenableFuture listenableFuture, zzbfd zzbfdVar) {
        this.zzb = zzaqeVar;
        this.zzc = listenableFuture;
    }

    public static zzaqg zzb(ListenableFuture listenableFuture) {
        return new zzaqg(zzaqe.CONTINUE_AFTER, null, null, listenableFuture, null);
    }

    public final ListenableFuture zzd() {
        if (this.zzb == zzaqe.CONTINUE_AFTER) {
            return this.zzc;
        }
        throw new IllegalStateException();
    }

    public static zzaqg zza() {
        return zza;
    }

    public final zzaqe zzc() {
        return this.zzb;
    }
}
