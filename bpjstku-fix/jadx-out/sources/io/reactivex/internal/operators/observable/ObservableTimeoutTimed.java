package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTimeoutTimed<T> extends notifySuspended<T, T> {
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> b;

    /* JADX INFO: loaded from: classes7.dex */
    interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        void b(long j);
    }

    public ObservableTimeoutTimed(VideoRecordEventStart<T> videoRecordEventStart, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        super(videoRecordEventStart);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
        this.b = autoValue_VideoValidatedEncoderProfilesProxy;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        if (this.b == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            derivemediatype.onSubscribe(timeoutObserver);
            timeoutObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0L);
            this.TuitionPaymentFragmentbindingInflater1.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this.b);
        derivemediatype.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(timeoutFallbackObserver);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TimeoutObserver<T> extends AtomicLong implements deriveMediaType<T>, BufferProviderState, TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private static final long serialVersionUID = 3764492702657003550L;
        final deriveMediaType<? super T> downstream;
        final long timeout;
        final TimeUnit unit;
        final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 worker;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();

        TimeoutObserver(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.downstream = derivemediatype;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(j2);
                }
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) {
            DisposableHelper.b((AtomicReference<BufferProviderState>) this.task, this.worker.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentbindingInflater1(j, this), this.timeout, this.unit));
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final void b(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            this.worker.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream.get());
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1 implements Runnable {
        private long TuitionPaymentFragmentbindingInflater1;
        private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(long j, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.TuitionPaymentFragmentbindingInflater1 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TimeoutFallbackObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState, TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private static final long serialVersionUID = 3764492702657003550L;
        final deriveMediaType<? super T> downstream;
        AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> fallback;
        final long timeout;
        final TimeUnit unit;
        final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 worker;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicLong index = new AtomicLong();
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();

        TimeoutFallbackObserver(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
            this.downstream = derivemediatype;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.fallback = autoValue_VideoValidatedEncoderProfilesProxy;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2);
                }
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
            DisposableHelper.b((AtomicReference<BufferProviderState>) this.task, this.worker.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentbindingInflater1(j, this), this.timeout, this.unit));
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.worker.dispose();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final void b(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
                AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy = this.fallback;
                this.fallback = null;
                autoValue_VideoValidatedEncoderProfilesProxy.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.downstream, this));
                this.worker.dispose();
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            this.worker.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements deriveMediaType<T> {
        private AtomicReference<BufferProviderState> TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType<? super T> derivemediatype, AtomicReference<BufferProviderState> atomicReference) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
            this.TuitionPaymentFragmentbindingInflater1 = atomicReference;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.b(this.TuitionPaymentFragmentbindingInflater1, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
        }
    }
}
