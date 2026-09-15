package com.google.android.libraries.places.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvw implements Executor, Runnable {
    private static final Logger zza = Logger.getLogger(zzbvw.class.getName());
    private static final zzbvt zzb;
    private final Executor zzc;
    private final Queue zzd = new ConcurrentLinkedQueue();
    private volatile int zze = 0;

    static {
        zzbvt zzbvvVar;
        byte[] bArr = null;
        try {
            zzbvvVar = new zzbvu(AtomicIntegerFieldUpdater.newUpdater(zzbvw.class, "zze"), bArr);
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            zzbvvVar = new zzbvv(bArr);
        }
        zzb = zzbvvVar;
    }

    public zzbvw(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("'executor' must not be null.");
        }
        this.zzc = executor;
    }

    private final void zzc(Runnable runnable) {
        if (zzb.zza(this, 0, -1)) {
            try {
                this.zzc.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.zzd.remove(runnable);
                }
                zzb.zzb(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("'r' must not be null.");
        }
        this.zzd.add(runnable);
        zzc(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Runnable runnable = (Runnable) this.zzd.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    Logger logger = zza;
                    Level level = Level.SEVERE;
                    String string = runnable.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(string);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), (Throwable) e2);
                }
            } catch (Throwable th) {
                zzb.zzb(this, 0);
                throw th;
            }
        }
        zzb.zzb(this, 0);
        if (this.zzd.isEmpty()) {
            return;
        }
        zzc(null);
    }

    final /* synthetic */ int zza() {
        return this.zze;
    }

    final /* synthetic */ void zzb(int i) {
        this.zze = i;
    }
}
