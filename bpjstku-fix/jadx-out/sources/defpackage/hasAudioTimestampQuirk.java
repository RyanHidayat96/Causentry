package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hasAudioTimestampQuirk<T> extends VideoEncoderSession1 implements newSharedInstance<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public hasAudioTimestampQuirk(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_VideoValidatedEncoderProfilesProxy;
    }

    @Override // defpackage.VideoEncoderSession1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(videoOutputSourceState));
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new onRecordingConfigChanged(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements deriveMediaType<T>, BufferProviderState {
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private VideoOutputSourceState TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoOutputSourceState;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bufferProviderState;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onSubscribe(this);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
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
