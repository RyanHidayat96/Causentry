package defpackage;

import io.reactivex.disposables.RunnableDisposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioTimestampFramePositionIncorrectQuirk extends appendBackupVideoProfile {
    private static final AudioTimestampFramePositionIncorrectQuirk TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AudioTimestampFramePositionIncorrectQuirk();

    public static AudioTimestampFramePositionIncorrectQuirk b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.appendBackupVideoProfile
    public final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new TuitionPaymentFragmentbindingInflater1();
    }

    AudioTimestampFramePositionIncorrectQuirk() {
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            share.b(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
        }
        return EmptyDisposable.INSTANCE;
    }

    static final class TuitionPaymentFragmentbindingInflater1 extends appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final PriorityBlockingQueue<TuitionPaymentFragmentspecialinlinedviewModeldefault3> b = new PriorityBlockingQueue<>();
        private final AtomicInteger TuitionPaymentFragmentbindingInflater1 = new AtomicInteger();
        private AtomicInteger TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicInteger();

        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(runnable, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TimeUnit.MILLISECONDS));
        }

        @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, TimeUnit timeUnit) {
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(runnable, this, jTuitionPaymentFragmentspecialinlinedviewModeldefault1), jTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2(Runnable runnable, long j) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return EmptyDisposable.INSTANCE;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(runnable, Long.valueOf(j), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.incrementAndGet());
            this.b.add(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (this.TuitionPaymentFragmentbindingInflater1.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3Poll = this.b.poll();
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3Poll != null) {
                        if (!tuitionPaymentFragmentspecialinlinedviewModeldefault3Poll.b) {
                            tuitionPaymentFragmentspecialinlinedviewModeldefault3Poll.TuitionPaymentFragmentspecialinlinedviewModeldefault2.run();
                        }
                    } else {
                        iAddAndGet = this.TuitionPaymentFragmentbindingInflater1.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return EmptyDisposable.INSTANCE;
                        }
                    }
                }
                this.b.clear();
                return EmptyDisposable.INSTANCE;
            }
            RunnableC0001TuitionPaymentFragmentbindingInflater1 runnableC0001TuitionPaymentFragmentbindingInflater1 = new RunnableC0001TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            share.b(runnableC0001TuitionPaymentFragmentbindingInflater1, "run is null");
            return new RunnableDisposable(runnableC0001TuitionPaymentFragmentbindingInflater1);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX INFO: renamed from: AudioTimestampFramePositionIncorrectQuirk$TuitionPaymentFragmentbindingInflater1$TuitionPaymentFragmentbindingInflater1, reason: collision with other inner class name */
        final class RunnableC0001TuitionPaymentFragmentbindingInflater1 implements Runnable {
            private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            RunnableC0001TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b = true;
                TuitionPaymentFragmentbindingInflater1.this.b.remove(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Comparable<TuitionPaymentFragmentspecialinlinedviewModeldefault3> {
        private long TuitionPaymentFragmentbindingInflater1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        volatile boolean b;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1);
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0 ? share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Runnable runnable, Long l, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = runnable;
            this.TuitionPaymentFragmentbindingInflater1 = l.longValue();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Runnable {
        private final Runnable TuitionPaymentFragmentbindingInflater1;
        private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, long j) {
            this.TuitionPaymentFragmentbindingInflater1 = runnable;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            long jB = TuitionPaymentFragmentbindingInflater1.b(TimeUnit.MILLISECONDS);
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (j > jB) {
                try {
                    Thread.sleep(j - jB);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                    return;
                }
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1.run();
        }
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3(Runnable runnable) {
        share.b(runnable, "run is null");
        runnable.run();
        return EmptyDisposable.INSTANCE;
    }
}
