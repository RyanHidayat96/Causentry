package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda11<T> extends deriveCodec<Boolean> implements newSharedInstance<Boolean> {
    private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> b;

    public AudioSourceExternalSyntheticLambda11(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        this.b = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = findqualityintargetqualities;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super Boolean> getdefaultvideoprofile) {
        this.b.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new postMaxAmplitude(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements deriveMediaType<T>, BufferProviderState {
        private BufferProviderState TuitionPaymentFragmentbindingInflater1;
        private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private getDefaultVideoProfile<? super Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private boolean b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super Boolean> getdefaultvideoprofile, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getdefaultvideoprofile;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = findqualityintargetqualities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentbindingInflater1, bufferProviderState)) {
                this.TuitionPaymentFragmentbindingInflater1 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.b) {
                return;
            }
            try {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(t)) {
                    this.b = true;
                    this.TuitionPaymentFragmentbindingInflater1.dispose();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(Boolean.TRUE);
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentbindingInflater1.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.b) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.b = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(Boolean.FALSE);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentbindingInflater1.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1.isDisposed();
        }
    }
}
