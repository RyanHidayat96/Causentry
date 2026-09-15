package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdastop1androidxcameravideointernalaudioBufferedAudioStream<T> extends notifySuspended<T, T> {
    private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public lambdastop1androidxcameravideointernalaudioBufferedAudioStream(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = findqualityintargetqualities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T> implements deriveMediaType<T>, BufferProviderState {
        private findQualityInTargetQualities<? super T> TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private BufferProviderState b;

        b(deriveMediaType<? super T> derivemediatype, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
            this.TuitionPaymentFragmentbindingInflater1 = findqualityintargetqualities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.b, bufferProviderState)) {
                this.b = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.b.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            try {
                if (!this.TuitionPaymentFragmentbindingInflater1.b(t)) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                    this.b.dispose();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(t);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.b.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
        }
    }
}
