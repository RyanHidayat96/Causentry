package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioUtils<T> extends notifySuspended<T, VideoRecordEventStatus<T>> {
    public AudioUtils(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super VideoRecordEventStatus<T>> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(derivemediatype));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements deriveMediaType<T>, BufferProviderState {
        private deriveMediaType<? super VideoRecordEventStatus<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super VideoRecordEventStatus<T>> derivemediatype) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(VideoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault2(t));
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(VideoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(VideoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }
    }
}
