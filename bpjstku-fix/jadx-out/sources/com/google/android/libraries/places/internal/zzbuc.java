package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbuc implements Thread.UncaughtExceptionHandler {
    zzbuc(zzbvl zzbvlVar) {
        Objects.requireNonNull(zzbvlVar);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new zzbjy(zzbjv.zzb(th).zze("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
