package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class zzbqu implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbrx zza;

    zzbqu(zzbrx zzbrxVar) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        zzbrx zzbrxVar = this.zza;
        Logger logger = zzbrx.zza;
        Level level = Level.SEVERE;
        String strValueOf = String.valueOf(zzbrxVar.zzc());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 59);
        sb.append("[");
        sb.append(strValueOf);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", sb.toString(), th);
        try {
            zzbrxVar.zzh(th);
        } catch (Throwable th2) {
            zzbrx zzbrxVar2 = this.zza;
            Logger logger2 = zzbrx.zza;
            Level level2 = Level.SEVERE;
            String strValueOf2 = String.valueOf(zzbrxVar2.zzc());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 37);
            sb2.append("[");
            sb2.append(strValueOf2);
            sb2.append("] Uncaught exception while panicking");
            logger2.logp(level2, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", sb2.toString(), th2);
        }
    }
}
