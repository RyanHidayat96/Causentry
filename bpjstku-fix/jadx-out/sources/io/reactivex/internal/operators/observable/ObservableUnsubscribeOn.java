package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableUnsubscribeOn<T> extends notifySuspended<T, T> {
    private appendBackupVideoProfile b;

    public ObservableUnsubscribeOn(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, appendBackupVideoProfile appendbackupvideoprofile) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = appendbackupvideoprofile;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new UnsubscribeObserver(derivemediatype, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class UnsubscribeObserver<T> extends AtomicBoolean implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = 1015244841293359600L;
        final deriveMediaType<? super T> downstream;
        final appendBackupVideoProfile scheduler;
        BufferProviderState upstream;

        UnsubscribeObserver(deriveMediaType<? super T> derivemediatype, appendBackupVideoProfile appendbackupvideoprofile) {
            this.downstream = derivemediatype;
            this.scheduler = appendbackupvideoprofile;
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
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (get()) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get();
        }

        final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Runnable {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UnsubscribeObserver.this.upstream.dispose();
            }
        }
    }
}
