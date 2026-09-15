package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class registerAudioRecordingCallback extends appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    public volatile boolean TuitionPaymentFragmentbindingInflater1;
    public final ScheduledExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public registerAudioRecordingCallback(ThreadFactory threadFactory) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Api31Impl.TuitionPaymentFragmentbindingInflater1(threadFactory);
    }

    @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
        return TuitionPaymentFragmentbindingInflater1(runnable, 0L, null);
    }

    @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
    public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            return EmptyDisposable.INSTANCE;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(runnable, j, timeUnit, (hasMatchedVideoProfileForDynamicRange) null);
    }

    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        share.b(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            if (j <= 0) {
                futureSchedule = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.submit(scheduledDirectTask);
            } else {
                futureSchedule = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.TuitionPaymentFragmentspecialinlinedviewModeldefault1(futureSchedule);
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // defpackage.BufferProviderState
    public void dispose() {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.shutdownNow();
    }

    @Override // defpackage.BufferProviderState
    public boolean isDisposed() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public final ScheduledRunnable TuitionPaymentFragmentspecialinlinedviewModeldefault2(Runnable runnable, long j, TimeUnit timeUnit, hasMatchedVideoProfileForDynamicRange hasmatchedvideoprofilefordynamicrange) {
        Future<?> futureSchedule;
        share.b(runnable, "run is null");
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, hasmatchedvideoprofilefordynamicrange);
        if (hasmatchedvideoprofilefordynamicrange == null || hasmatchedvideoprofilefordynamicrange.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scheduledRunnable)) {
            try {
                if (j <= 0) {
                    futureSchedule = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.submit((Callable) scheduledRunnable);
                } else {
                    futureSchedule = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.schedule((Callable) scheduledRunnable, j, timeUnit);
                }
                scheduledRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(futureSchedule);
                return scheduledRunnable;
            } catch (RejectedExecutionException e2) {
                if (hasmatchedvideoprofilefordynamicrange != null) {
                    hasmatchedvideoprofilefordynamicrange.TuitionPaymentFragmentspecialinlinedviewModeldefault1(scheduledRunnable);
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            }
        }
        return scheduledRunnable;
    }

    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        share.b(runnable, "run is null");
        if (j2 <= 0) {
            Api28Impl api28Impl = new Api28Impl(runnable, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            try {
                if (j <= 0) {
                    futureSchedule = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.submit(api28Impl);
                } else {
                    futureSchedule = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.schedule(api28Impl, j, timeUnit);
                }
                api28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(futureSchedule);
                return api28Impl;
            } catch (RejectedExecutionException e2) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
        try {
            scheduledDirectPeriodicTask.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e3) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e3);
            return EmptyDisposable.INSTANCE;
        }
    }
}
