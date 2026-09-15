package io.reactivex.internal.schedulers;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.acquireBuffer;
import defpackage.appendBackupVideoProfile;
import defpackage.getQualityRange;
import defpackage.hasMatchedVideoProfileForDynamicRange;
import defpackage.isSamsungJ2;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorScheduler extends appendBackupVideoProfile {
    static final appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2 = isSamsungJ2.TuitionPaymentFragmentbindingInflater1();
    private boolean TuitionPaymentFragmentbindingInflater1 = false;
    private Executor TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ExecutorScheduler(Executor executor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = executor;
    }

    @Override // defpackage.appendBackupVideoProfile
    public final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new ExecutorWorker(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ScheduledExecutorService)) {
            return super.TuitionPaymentFragmentbindingInflater1(runnable, j, j2, timeUnit);
        }
        share.b(runnable, "run is null");
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable);
            scheduledDirectPeriodicTask.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((ScheduledExecutorService) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class ExecutorWorker extends appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
        private boolean TuitionPaymentFragmentbindingInflater1;
        private Executor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private volatile boolean b;
        private AtomicInteger g = new AtomicInteger();
        private acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new acquireBuffer();
        private MpscLinkedQueue<Runnable> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new MpscLinkedQueue<>();

        public ExecutorWorker(Executor executor, boolean z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = executor;
            this.TuitionPaymentFragmentbindingInflater1 = z;
        }

        @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
            BufferProviderState booleanRunnable;
            if (this.b) {
                return EmptyDisposable.INSTANCE;
            }
            share.b(runnable, "run is null");
            if (this.TuitionPaymentFragmentbindingInflater1) {
                booleanRunnable = new InterruptibleRunnable(runnable, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(booleanRunnable);
            } else {
                booleanRunnable = new BooleanRunnable(runnable);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(booleanRunnable);
            if (this.g.getAndIncrement() != 0) {
                return booleanRunnable;
            }
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.execute(this);
                return booleanRunnable;
            } catch (RejectedExecutionException e2) {
                this.b = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(runnable);
            }
            if (this.b) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            share.b(runnable, "run is null");
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(sequentialDisposable2, runnable), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scheduledRunnable);
            Executor executor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e2) {
                    this.b = true;
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new getQualityRange(ExecutorScheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(scheduledRunnable, j, timeUnit)));
            }
            DisposableHelper.b((AtomicReference<BufferProviderState>) sequentialDisposable, scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
            if (this.g.getAndIncrement() == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MpscLinkedQueue<Runnable> mpscLinkedQueue = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iAddAndGet = 1;
            while (!this.b) {
                while (true) {
                    Runnable runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2 = mpscLinkedQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                        break;
                    }
                    runnableTuitionPaymentFragmentspecialinlinedviewModeldefault2.run();
                    if (this.b) {
                        mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
                        return;
                    }
                }
                if (this.b) {
                    mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
                    return;
                } else {
                    iAddAndGet = this.g.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
        }

        static final class BooleanRunnable extends AtomicBoolean implements Runnable, BufferProviderState {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            BooleanRunnable(Runnable runnable) {
                this.actual = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.actual.run();
                } finally {
                    lazySet(true);
                }
            }

            @Override // defpackage.BufferProviderState
            public final void dispose() {
                lazySet(true);
            }

            @Override // defpackage.BufferProviderState
            public final boolean isDisposed() {
                return get();
            }
        }

        final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
            private final Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private final SequentialDisposable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            TuitionPaymentFragmentspecialinlinedviewModeldefault3(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sequentialDisposable;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DisposableHelper.b((AtomicReference<BufferProviderState>) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ExecutorWorker.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            }
        }

        static final class InterruptibleRunnable extends AtomicInteger implements Runnable, BufferProviderState {
            private static final long serialVersionUID = -3603436687413320876L;
            final Runnable run;
            final hasMatchedVideoProfileForDynamicRange tasks;
            volatile Thread thread;

            InterruptibleRunnable(Runnable runnable, hasMatchedVideoProfileForDynamicRange hasmatchedvideoprofilefordynamicrange) {
                this.run = runnable;
                this.tasks = hasmatchedvideoprofilefordynamicrange;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hasMatchedVideoProfileForDynamicRange hasmatchedvideoprofilefordynamicrange;
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.run.run();
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                if (hasmatchedvideoprofilefordynamicrange != null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        } finally {
                            this.thread = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                hasmatchedvideoprofilefordynamicrange = this.tasks;
                                if (hasmatchedvideoprofilefordynamicrange != null) {
                                    hasmatchedvideoprofilefordynamicrange.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                                }
                            }
                        }
                    }
                    this.thread = null;
                }
            }

            @Override // defpackage.BufferProviderState
            public final void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            hasMatchedVideoProfileForDynamicRange hasmatchedvideoprofilefordynamicrange = this.tasks;
                            if (hasmatchedvideoprofilefordynamicrange != null) {
                                hasmatchedvideoprofilefordynamicrange.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                                return;
                            }
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.thread;
                        if (thread != null) {
                            thread.interrupt();
                            this.thread = null;
                        }
                        set(4);
                        hasMatchedVideoProfileForDynamicRange hasmatchedvideoprofilefordynamicrange2 = this.tasks;
                        if (hasmatchedvideoprofilefordynamicrange2 != null) {
                            hasmatchedvideoprofilefordynamicrange2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // defpackage.BufferProviderState
            public final boolean isDisposed() {
                return get() >= 2;
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, BufferProviderState {
        private static final long serialVersionUID = -4101336210206799084L;
        final SequentialDisposable direct;
        final SequentialDisposable timed;

        DelayedRunnable(Runnable runnable) {
            super(runnable);
            this.timed = new SequentialDisposable();
            this.direct = new SequentialDisposable();
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    this.direct.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get() == null;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
        private final DelayedRunnable TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(DelayedRunnable delayedRunnable) {
            this.TuitionPaymentFragmentbindingInflater1 = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DisposableHelper.b((AtomicReference<BufferProviderState>) this.TuitionPaymentFragmentbindingInflater1.direct, ExecutorScheduler.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1));
        }
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3(Runnable runnable) {
        share.b(runnable, "run is null");
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((ExecutorService) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(runnable);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e2) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable, long j, TimeUnit timeUnit) {
        share.b(runnable, "run is null");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((ScheduledExecutorService) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e2) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                return EmptyDisposable.INSTANCE;
            }
        }
        DelayedRunnable delayedRunnable = new DelayedRunnable(runnable);
        DisposableHelper.b((AtomicReference<BufferProviderState>) delayedRunnable.timed, TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(delayedRunnable), j, timeUnit));
        return delayedRunnable;
    }
}
