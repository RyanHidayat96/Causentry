package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class sendNextAudio<T> extends notifySuspended<T, Boolean> {
    private findQualityInTargetQualities<? super T> b;

    public sendNextAudio(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = findqualityintargetqualities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Boolean> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype, this.b));
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements deriveMediaType<T>, BufferProviderState {
        private deriveMediaType<? super Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private boolean b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super Boolean> derivemediatype, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = findqualityintargetqualities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.b) {
                return;
            }
            try {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(t)) {
                    return;
                }
                this.b = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(Boolean.FALSE);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.b) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.b = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(Boolean.TRUE);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed();
        }
    }
}
