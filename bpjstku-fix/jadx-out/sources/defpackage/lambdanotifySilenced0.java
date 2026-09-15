package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdanotifySilenced0<T> extends VideoRecordEventResume<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public lambdanotifySilenced0(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_VideoValidatedEncoderProfilesProxy;
    }

    @Override // defpackage.VideoRecordEventResume
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(errorToString<? super T> errortostring) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(errortostring));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements deriveMediaType<T>, BufferProviderState {
        private BufferProviderState TuitionPaymentFragmentbindingInflater1;
        private T TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private errorToString<? super T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(errorToString<? super T> errortostring) {
            this.b = errortostring;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentbindingInflater1.dispose();
            this.TuitionPaymentFragmentbindingInflater1 = DisposableHelper.DISPOSED;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1 == DisposableHelper.DISPOSED;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentbindingInflater1, bufferProviderState)) {
                this.TuitionPaymentFragmentbindingInflater1 = bufferProviderState;
                this.b.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1 = DisposableHelper.DISPOSED;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            this.b.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentbindingInflater1 = DisposableHelper.DISPOSED;
            T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (t != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                this.b.b(t);
            } else {
                this.b.onComplete();
            }
        }
    }
}
