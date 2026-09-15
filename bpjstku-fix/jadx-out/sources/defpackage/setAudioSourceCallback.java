package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class setAudioSourceCallback<T> extends deriveCodec<Boolean> implements newSharedInstance<Boolean> {
    private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public setAudioSourceCallback(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = findqualityintargetqualities;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super Boolean> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new sendNextAudio(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements deriveMediaType<T>, BufferProviderState {
        private BufferProviderState TuitionPaymentFragmentbindingInflater1;
        private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private getDefaultVideoProfile<? super Boolean> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(getDefaultVideoProfile<? super Boolean> getdefaultvideoprofile, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
            this.b = getdefaultvideoprofile;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = findqualityintargetqualities;
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
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            try {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(t)) {
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.TuitionPaymentFragmentbindingInflater1.dispose();
                this.b.b(Boolean.FALSE);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentbindingInflater1.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.b.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.b.b(Boolean.TRUE);
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
