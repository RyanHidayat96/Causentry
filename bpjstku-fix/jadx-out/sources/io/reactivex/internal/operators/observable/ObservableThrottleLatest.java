package io.reactivex.internal.operators.observable;

import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableThrottleLatest<T> extends notifySuspended<T, T> {
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public ObservableThrottleLatest(VideoRecordEventStart<T> videoRecordEventStart, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        super(videoRecordEventStart);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendbackupvideoprofile;
        this.b = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new ThrottleLatestObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ThrottleLatestObserver<T> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final deriveMediaType<? super T> downstream;
        final boolean emitLast;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        BufferProviderState upstream;
        final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 worker;

        ThrottleLatestObserver(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, boolean z) {
            this.downstream = derivemediatype;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.emitLast = z;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.latest.set(t);
            b();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.error = th;
            this.done = true;
            b();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            b();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.timerFired = true;
            b();
        }

        private void b() {
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.latest;
                deriveMediaType<? super T> derivemediatype = this.downstream;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    boolean z = this.done;
                    if (z && this.error != null) {
                        atomicReference.lazySet(null);
                        derivemediatype.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        T andSet = atomicReference.getAndSet(null);
                        if (!z2 && this.emitLast) {
                            derivemediatype.onNext(andSet);
                        }
                        derivemediatype.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    if (z2) {
                        if (this.timerFired) {
                            this.timerRunning = false;
                            this.timerFired = false;
                        }
                    } else if (!this.timerRunning || this.timerFired) {
                        derivemediatype.onNext(atomicReference.getAndSet(null));
                        this.timerFired = false;
                        this.timerRunning = true;
                        this.worker.TuitionPaymentFragmentbindingInflater1(this, this.timeout, this.unit);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }
    }
}
