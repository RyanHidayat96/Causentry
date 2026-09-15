package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class appendBackupVideoProfile {
    private static boolean TuitionPaymentFragmentbindingInflater1 = Boolean.getBoolean("rx2.scheduler.use-nanotime");
    static final long b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public static long TuitionPaymentFragmentspecialinlinedviewModeldefault1(TimeUnit timeUnit) {
        if (!TuitionPaymentFragmentbindingInflater1) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
        return timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3(Runnable runnable) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable, long j, TimeUnit timeUnit) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        share.b(runnable, "run is null");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(runnable, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault2, j, timeUnit);
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        share.b(runnable, "run is null");
        b bVar = new b(runnable, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        BufferProviderState bufferProviderStateB = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(bVar, j, j2, timeUnit);
        return bufferProviderStateB == EmptyDisposable.INSTANCE ? bufferProviderStateB : bVar;
    }

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements BufferProviderState {
        public abstract BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, TimeUnit timeUnit);

        public BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
            return TuitionPaymentFragmentbindingInflater1(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public final BufferProviderState b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            share.b(runnable, "run is null");
            long nanos = timeUnit.toNanos(j2);
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TimeUnit.NANOSECONDS);
            BufferProviderState bufferProviderStateTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentspecialinlinedviewModeldefault1 + timeUnit.toNanos(j), runnable, jTuitionPaymentFragmentspecialinlinedviewModeldefault1, sequentialDisposable2, nanos), j, timeUnit);
            if (bufferProviderStateTuitionPaymentFragmentbindingInflater1 == EmptyDisposable.INSTANCE) {
                return bufferProviderStateTuitionPaymentFragmentbindingInflater1;
            }
            DisposableHelper.b((AtomicReference<BufferProviderState>) sequentialDisposable, bufferProviderStateTuitionPaymentFragmentbindingInflater1);
            return sequentialDisposable2;
        }

        public static long b(TimeUnit timeUnit) {
            return appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault1(timeUnit);
        }

        /* JADX INFO: loaded from: classes5.dex */
        final class TuitionPaymentFragmentbindingInflater1 implements Runnable {
            private SequentialDisposable TuitionPaymentFragmentbindingInflater1;
            private Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f339a;
            private long b;

            TuitionPaymentFragmentbindingInflater1(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = runnable;
                this.TuitionPaymentFragmentbindingInflater1 = sequentialDisposable;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j3;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j2;
                this.f339a = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.run();
                if (this.TuitionPaymentFragmentbindingInflater1.isDisposed()) {
                    return;
                }
                long jB = TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(TimeUnit.NANOSECONDS);
                long j2 = appendBackupVideoProfile.b;
                long j3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (j2 + jB < j3 || jB >= j3 + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + appendBackupVideoProfile.b) {
                    long j4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    long j5 = jB + j4;
                    long j6 = this.b + 1;
                    this.b = j6;
                    this.f339a = j5 - (j4 * j6);
                    j = j5;
                } else {
                    long j7 = this.f339a;
                    long j8 = this.b + 1;
                    this.b = j8;
                    j = j7 + (j8 * this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jB;
                DisposableHelper.b((AtomicReference<BufferProviderState>) this.TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.TuitionPaymentFragmentbindingInflater1(this, j - jB, TimeUnit.NANOSECONDS));
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class b implements BufferProviderState, Runnable {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private volatile boolean b;

        b(Runnable runnable, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = runnable;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b) {
                return;
            }
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.run();
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.b;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements BufferProviderState, Runnable {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private Thread TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Runnable b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Runnable runnable, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.b = runnable;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Thread.currentThread();
            try {
                this.b.run();
            } finally {
                dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == Thread.currentThread()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof registerAudioRecordingCallback) {
                    registerAudioRecordingCallback registeraudiorecordingcallback = (registerAudioRecordingCallback) tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (registeraudiorecordingcallback.TuitionPaymentFragmentbindingInflater1) {
                        return;
                    }
                    registeraudiorecordingcallback.TuitionPaymentFragmentbindingInflater1 = true;
                    registeraudiorecordingcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2.shutdown();
                    return;
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed();
        }
    }

    public static long TuitionPaymentFragmentspecialinlinedviewModeldefault2(TimeUnit timeUnit) {
        if (!TuitionPaymentFragmentbindingInflater1) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
        return timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
