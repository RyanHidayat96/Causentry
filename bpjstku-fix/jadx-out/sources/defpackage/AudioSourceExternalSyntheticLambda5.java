package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda5<T> extends deriveCodec<Long> implements newSharedInstance<Long> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public AudioSourceExternalSyntheticLambda5(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super Long> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(getdefaultvideoprofile));
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<Long> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new AudioSourceExternalSyntheticLambda4(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements deriveMediaType<Object>, BufferProviderState {
        private getDefaultVideoProfile<? super Long> TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private long b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getDefaultVideoProfile<? super Long> getdefaultvideoprofile) {
            this.TuitionPaymentFragmentbindingInflater1 = getdefaultvideoprofile;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DisposableHelper.DISPOSED;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(Object obj) {
            this.b++;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DisposableHelper.DISPOSED;
            this.TuitionPaymentFragmentbindingInflater1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DisposableHelper.DISPOSED;
            this.TuitionPaymentFragmentbindingInflater1.b(Long.valueOf(this.b));
        }
    }
}
