package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaupdateCollectionBufferSizeAsync4androidxcameravideointernalaudioBufferedAudioStream<T> extends notifySuspended<T, T> {
    public lambdaupdateCollectionBufferSizeAsync4androidxcameravideointernalaudioBufferedAudioStream(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(derivemediatype));
    }

    public static final class b<T> implements deriveMediaType<T>, BufferProviderState {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -363771633;
        private T TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private deriveMediaType<? super T> b;

        b(deriveMediaType<? super T> derivemediatype) {
            this.b = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                this.b.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            this.b.onError(th);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (t != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                this.b.onNext(t);
            }
            this.b.onComplete();
        }
    }
}
