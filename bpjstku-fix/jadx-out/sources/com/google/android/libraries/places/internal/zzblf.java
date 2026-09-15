package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
final class zzblf implements zzblw {
    private final zzblw zza;

    zzblf(zzblw zzblwVar, zzbfa zzbfaVar, Executor executor) {
        if (zzblwVar == null) {
            throw new NullPointerException("delegate");
        }
        this.zza = zzblwVar;
        if (executor == null) {
            throw new NullPointerException("appExecutor");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzblw
    public final zzbmg zza(SocketAddress socketAddress, zzblv zzblvVar, zzbfg zzbfgVar) {
        return new zzble(this, this.zza.zza(socketAddress, zzblvVar, zzbfgVar), zzblvVar.zza());
    }

    @Override // com.google.android.libraries.places.internal.zzblw
    public final ScheduledExecutorService zzb() {
        return this.zza.zzb();
    }
}
