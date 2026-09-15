package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class onRecordingConfigChanged<T> extends notifySuspended<T, T> {
    public onRecordingConfigChanged(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(derivemediatype));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T> implements deriveMediaType<T>, BufferProviderState {
        private deriveMediaType<? super T> TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
        }

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super T> derivemediatype) {
            this.TuitionPaymentFragmentbindingInflater1 = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bufferProviderState;
            this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentbindingInflater1.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed();
        }
    }
}
