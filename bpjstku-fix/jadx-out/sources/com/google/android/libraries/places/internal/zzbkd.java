package com.google.android.libraries.places.internal;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbkd implements Executor {
    private final Thread.UncaughtExceptionHandler zza;
    private final Queue zzb = new ConcurrentLinkedQueue();
    private final AtomicReference zzc = new AtomicReference();

    public zzbkd(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            throw new NullPointerException("uncaughtExceptionHandler");
        }
        this.zza = uncaughtExceptionHandler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zzb(runnable);
        zza();
    }

    public final void zza() {
        while (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.zzc, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.zzb.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.zza.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.zzc.set(null);
                    throw th2;
                }
            }
            this.zzc.set(null);
            if (this.zzb.isEmpty()) {
                return;
            }
        }
    }

    public final void zzb(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable is null");
        }
        this.zzb.add(runnable);
    }

    public final void zzc() {
        if (!(Thread.currentThread() == this.zzc.get())) {
            throw new IllegalStateException("Not called from the SynchronizationContext");
        }
    }

    public final zzbkc zzd(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzbkb zzbkbVar = new zzbkb(runnable);
        return new zzbkc(zzbkbVar, scheduledExecutorService.schedule(new zzbka(this, zzbkbVar, runnable), j, timeUnit), null);
    }
}
