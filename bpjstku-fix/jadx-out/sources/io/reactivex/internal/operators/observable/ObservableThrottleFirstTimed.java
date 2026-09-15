package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.ExcludeStretchedVideoQualityQuirk;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableThrottleFirstTimed<T> extends notifySuspended<T, T> {
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private long b;

    public ObservableThrottleFirstTimed(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendbackupvideoprofile;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new DebounceTimedObserver(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
    }

    static final class DebounceTimedObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        boolean done;
        final deriveMediaType<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        BufferProviderState upstream;
        final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 worker;

        DebounceTimedObserver(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.downstream = derivemediatype;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
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
            if (this.gate || this.done) {
                return;
            }
            this.gate = true;
            this.downstream.onNext(t);
            BufferProviderState bufferProviderState = get();
            if (bufferProviderState != null) {
                bufferProviderState.dispose();
            }
            DisposableHelper.b((AtomicReference<BufferProviderState>) this, this.worker.TuitionPaymentFragmentbindingInflater1(this, this.timeout, this.unit));
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.gate = false;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.done) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.worker.isDisposed();
        }
    }
}
