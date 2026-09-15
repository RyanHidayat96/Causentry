package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class isClientSilenced extends appendBackupVideoProfile {
    private static ScheduledExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static RxThreadFactory TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private AtomicReference<ScheduledExecutorService> TuitionPaymentFragmentbindingInflater1;
    private ThreadFactory TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public isClientSilenced() {
        this(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private isClientSilenced(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.TuitionPaymentFragmentbindingInflater1 = atomicReference;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = threadFactory;
        atomicReference.lazySet(Api31Impl.TuitionPaymentFragmentbindingInflater1(threadFactory));
    }

    @Override // defpackage.appendBackupVideoProfile
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceTuitionPaymentFragmentbindingInflater1 = null;
        do {
            scheduledExecutorService = this.TuitionPaymentFragmentbindingInflater1.get();
            if (scheduledExecutorService != TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                if (scheduledExecutorServiceTuitionPaymentFragmentbindingInflater1 != null) {
                    scheduledExecutorServiceTuitionPaymentFragmentbindingInflater1.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceTuitionPaymentFragmentbindingInflater1 == null) {
                scheduledExecutorServiceTuitionPaymentFragmentbindingInflater1 = Api31Impl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentbindingInflater1, scheduledExecutorService, scheduledExecutorServiceTuitionPaymentFragmentbindingInflater1));
    }

    @Override // defpackage.appendBackupVideoProfile
    public final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.get());
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        share.b(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            if (j <= 0) {
                futureSchedule = this.TuitionPaymentFragmentbindingInflater1.get().submit(scheduledDirectTask);
            } else {
                futureSchedule = this.TuitionPaymentFragmentbindingInflater1.get().schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.TuitionPaymentFragmentspecialinlinedviewModeldefault1(futureSchedule);
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 extends appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new acquireBuffer();
        private ScheduledExecutorService b;

        TuitionPaymentFragmentbindingInflater1(ScheduledExecutorService scheduledExecutorService) {
            this.b = scheduledExecutorService;
        }

        @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> futureSchedule;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return EmptyDisposable.INSTANCE;
            }
            share.b(runnable, "run is null");
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scheduledRunnable);
            try {
                if (j <= 0) {
                    futureSchedule = this.b.submit((Callable) scheduledRunnable);
                } else {
                    futureSchedule = this.b.schedule((Callable) scheduledRunnable, j, timeUnit);
                }
                scheduledRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(futureSchedule);
                return scheduledRunnable;
            } catch (RejectedExecutionException e2) {
                dispose();
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        share.b(runnable, "run is null");
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.TuitionPaymentFragmentbindingInflater1.get();
            Api28Impl api28Impl = new Api28Impl(runnable, scheduledExecutorService);
            try {
                if (j <= 0) {
                    futureSchedule = scheduledExecutorService.submit(api28Impl);
                } else {
                    futureSchedule = scheduledExecutorService.schedule(api28Impl, j, timeUnit);
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
            scheduledDirectPeriodicTask.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e3) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e3);
            return EmptyDisposable.INSTANCE;
        }
    }
}
