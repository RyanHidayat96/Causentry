package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class AudioSourceExternalSyntheticLambda4<T> extends notifySuspended<T, Long> {
    public AudioSourceExternalSyntheticLambda4(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Long> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(derivemediatype));
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements deriveMediaType<Object>, BufferProviderState {
        private BufferProviderState TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super Long> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private long b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super Long> derivemediatype) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentbindingInflater1, bufferProviderState)) {
                this.TuitionPaymentFragmentbindingInflater1 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentbindingInflater1.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(Object obj) {
            this.b++;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onNext(Long.valueOf(this.b));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
        }
    }
}
