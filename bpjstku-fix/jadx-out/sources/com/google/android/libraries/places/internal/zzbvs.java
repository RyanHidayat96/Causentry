package com.google.android.libraries.places.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class zzbvs implements Executor {
    private static final Logger zza = Logger.getLogger(zzbvs.class.getName());
    private boolean zzb;
    private ArrayDeque zzc;

    private final void zza() {
        while (true) {
            Runnable runnable = (Runnable) this.zzc.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                zza.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("'task' must not be null.");
        }
        if (this.zzb) {
            if (this.zzc == null) {
                this.zzc = new ArrayDeque(4);
            }
            this.zzc.add(runnable);
            return;
        }
        this.zzb = true;
        try {
            runnable.run();
            if (this.zzc != null) {
                zza();
            }
            this.zzb = false;
        } catch (Throwable th) {
            try {
                Logger logger = zza;
                Level level = Level.SEVERE;
                String strValueOf = String.valueOf(runnable);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 35);
                sb.append("Exception while executing runnable ");
                sb.append(strValueOf);
                logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", sb.toString(), th);
            } finally {
                if (this.zzc != null) {
                    zza();
                }
                this.zzb = false;
            }
        }
    }

    zzbvs() {
    }
}
