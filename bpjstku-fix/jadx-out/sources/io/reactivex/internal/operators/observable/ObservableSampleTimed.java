package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.ExcludeStretchedVideoQualityQuirk;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSampleTimed<T> extends notifySuspended<T, T> {
    private TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private appendBackupVideoProfile b;

    public ObservableSampleTimed(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = timeUnit;
        this.b = appendbackupvideoprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk = new ExcludeStretchedVideoQualityQuirk(derivemediatype);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new SampleTimedEmitLast(excludeStretchedVideoQualityQuirk, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b));
        } else {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new SampleTimedNoLast(excludeStretchedVideoQualityQuirk, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements deriveMediaType<T>, BufferProviderState, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final deriveMediaType<? super T> downstream;
        final long period;
        final appendBackupVideoProfile scheduler;
        final AtomicReference<BufferProviderState> timer = new AtomicReference<>();
        final TimeUnit unit;
        BufferProviderState upstream;

        abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        SampleTimedObserver(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            this.downstream = derivemediatype;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = appendbackupvideoprofile;
        }

        @Override // defpackage.deriveMediaType
        public void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
                appendBackupVideoProfile appendbackupvideoprofile = this.scheduler;
                long j = this.period;
                DisposableHelper.b(this.timer, appendbackupvideoprofile.TuitionPaymentFragmentbindingInflater1(this, j, j, this.unit));
            }
        }

        @Override // defpackage.deriveMediaType
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // defpackage.BufferProviderState
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // defpackage.BufferProviderState
        public void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.timer);
            this.upstream.dispose();
        }

        @Override // defpackage.deriveMediaType
        public void onComplete() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.timer);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // defpackage.deriveMediaType
        public void onError(Throwable th) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.timer);
            this.downstream.onError(th);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            super(derivemediatype, j, timeUnit, appendbackupvideoprofile);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        SampleTimedEmitLast(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            super(derivemediatype, j, timeUnit, appendbackupvideoprofile);
            this.wip = new AtomicInteger(1);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.wip.incrementAndGet() == 2) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    this.downstream.onNext(andSet);
                }
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }
    }
}
