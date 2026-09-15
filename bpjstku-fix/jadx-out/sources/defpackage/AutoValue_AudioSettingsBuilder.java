package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_AudioSettingsBuilder<T> extends VideoRecordEventResume<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentbindingInflater1;
    private dumpCodecCapabilities<T, T, T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AutoValue_AudioSettingsBuilder(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, dumpCodecCapabilities<T, T, T> dumpcodeccapabilities) {
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dumpcodeccapabilities;
    }

    @Override // defpackage.VideoRecordEventResume
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(errorToString<? super T> errortostring) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(errortostring, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T> implements deriveMediaType<T>, BufferProviderState {
        private BufferProviderState TuitionPaymentFragmentbindingInflater1;
        private errorToString<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private T TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private dumpCodecCapabilities<T, T, T> b;

        b(errorToString<? super T> errortostring, dumpCodecCapabilities<T, T, T> dumpcodeccapabilities) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = errortostring;
            this.b = dumpcodeccapabilities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentbindingInflater1, bufferProviderState)) {
                this.TuitionPaymentFragmentbindingInflater1 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            T t2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (t2 == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = t;
                return;
            }
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (T) share.b(this.b.b(t2, t), "The reducer returned a null value");
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
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (t != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(t);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
            }
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
