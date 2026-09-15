package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class updateCollectionBufferSizeAsync<T> extends notifySuspended<T, T> {
    private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public updateCollectionBufferSizeAsync(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = findqualityintargetqualities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T> implements deriveMediaType<T>, BufferProviderState {
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private boolean b;

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super T> derivemediatype, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = findqualityintargetqualities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.b) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(t);
                return;
            }
            try {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(t)) {
                    return;
                }
                this.b = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(t);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }
    }
}
