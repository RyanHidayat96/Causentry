package defpackage;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class checkStartedOrThrow<T> extends VideoRecordEventStart<T> {
    private ImageProxyTransformFactory<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public checkStartedOrThrow(ImageProxyTransformFactory<? extends T> imageProxyTransformFactory) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageProxyTransformFactory;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements VideoRecordEventPause<T>, BufferProviderState {
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private OutputTransform b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super T> derivemediatype) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
        }

        @Override // defpackage.AudioConfig
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }

        @Override // defpackage.AudioConfig
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.AudioConfig
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(t);
        }

        @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
        public final void b(OutputTransform outputTransform) {
            if (SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, outputTransform)) {
                this.b = outputTransform;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
                outputTransform.b(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.b.b();
            this.b = SubscriptionHelper.CANCELLED;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.b == SubscriptionHelper.CANCELLED;
        }
    }
}
