package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdarelease2androidxcameravideointernalaudioBufferedAudioStream<T> extends notifySuspended<T, T> {
    private long b;

    public lambdarelease2androidxcameravideointernalaudioBufferedAudioStream(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = j;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(derivemediatype, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements deriveMediaType<T>, BufferProviderState {
        private long TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private deriveMediaType<? super T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super T> derivemediatype, long j) {
            this.b = derivemediatype;
            this.TuitionPaymentFragmentbindingInflater1 = j;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bufferProviderState;
                this.b.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            long j = this.TuitionPaymentFragmentbindingInflater1;
            if (j != 0) {
                this.TuitionPaymentFragmentbindingInflater1 = j - 1;
            } else {
                this.b.onNext(t);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.b.onComplete();
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
