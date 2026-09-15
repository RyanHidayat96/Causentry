package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class postMaxAmplitude<T> extends notifySuspended<T, Boolean> {
    private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public postMaxAmplitude(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = findqualityintargetqualities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Boolean> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements deriveMediaType<T>, BufferProviderState {
        private boolean TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private deriveMediaType<? super Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private findQualityInTargetQualities<? super T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super Boolean> derivemediatype, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
            this.b = findqualityintargetqualities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            try {
                if (this.b.b(t)) {
                    this.TuitionPaymentFragmentbindingInflater1 = true;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(Boolean.TRUE);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentbindingInflater1 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(Boolean.FALSE);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
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
