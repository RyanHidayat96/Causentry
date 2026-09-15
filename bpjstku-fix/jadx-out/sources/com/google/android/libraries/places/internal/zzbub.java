package com.google.android.libraries.places.internal;

import defpackage.isCameraClosing;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzbub {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Runnable zzc;
    private final isCameraClosing zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    zzbub(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, isCameraClosing iscameraclosing) {
        this.zzc = runnable;
        this.zzb = executor;
        this.zza = scheduledExecutorService;
        this.zzd = iscameraclosing;
        if (!(!iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iscameraclosing.b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final long zzc() {
        isCameraClosing iscameraclosing = this.zzd;
        return TimeUnit.NANOSECONDS.convert(iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? (iscameraclosing.b.b() - iscameraclosing.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + iscameraclosing.TuitionPaymentFragmentbindingInflater1 : iscameraclosing.TuitionPaymentFragmentbindingInflater1, TimeUnit.NANOSECONDS);
    }

    final void zza(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long jZzc = zzc() + nanos;
        this.zzf = true;
        if (jZzc - this.zze < 0 || this.zzg == null) {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzg = this.zza.schedule(new zzbua(this, null), nanos, TimeUnit.NANOSECONDS);
        }
        this.zze = jZzc;
    }

    final void zzb(boolean z) {
        ScheduledFuture scheduledFuture;
        this.zzf = false;
        if (!z || (scheduledFuture = this.zzg) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.zzg = null;
    }

    final /* synthetic */ ScheduledExecutorService zzd() {
        return this.zza;
    }

    final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ Runnable zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zze;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzf;
    }

    final /* synthetic */ void zzi(boolean z) {
        this.zzf = false;
    }

    final /* synthetic */ void zzj(ScheduledFuture scheduledFuture) {
        this.zzg = scheduledFuture;
    }
}
