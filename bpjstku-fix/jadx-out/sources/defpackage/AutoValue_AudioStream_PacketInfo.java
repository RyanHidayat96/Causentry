package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_AudioStream_PacketInfo<T, R> extends deriveCodec<R> {
    private dumpCodecCapabilities<R, ? super T, R> TuitionPaymentFragmentbindingInflater1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private R TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AutoValue_AudioStream_PacketInfo(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, R r, dumpCodecCapabilities<R, ? super T, R> dumpcodeccapabilities) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r;
        this.TuitionPaymentFragmentbindingInflater1 = dumpcodeccapabilities;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super R> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(getdefaultvideoprofile, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, R> implements deriveMediaType<T>, BufferProviderState {
        private dumpCodecCapabilities<R, ? super T, R> TuitionPaymentFragmentbindingInflater1;
        private getDefaultVideoProfile<? super R> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private R TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(getDefaultVideoProfile<? super R> getdefaultvideoprofile, dumpCodecCapabilities<R, ? super T, R> dumpcodeccapabilities, R r) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getdefaultvideoprofile;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r;
            this.TuitionPaymentFragmentbindingInflater1 = dumpcodeccapabilities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            R r = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (r != null) {
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (R) share.b(this.TuitionPaymentFragmentbindingInflater1.b(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                    onError(th);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            R r = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (r != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(r);
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
    }
}
