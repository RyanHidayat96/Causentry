package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioStreamAudioStreamCallback<T> extends VideoRecordEventResume<T> implements newSharedInstance<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentbindingInflater1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public AudioStreamAudioStreamCallback(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j) {
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
    }

    @Override // defpackage.VideoRecordEventResume
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(errorToString<? super T> errortostring) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(errortostring, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new AudioStreamAudioStreamException(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, false);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T> implements deriveMediaType<T>, BufferProviderState {
        private long TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private errorToString<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private boolean b;

        b(errorToString<? super T> errortostring, long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = errortostring;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.b) {
                return;
            }
            long j = this.TuitionPaymentFragmentbindingInflater1;
            if (j == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.b = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(t);
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = j + 1;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.b) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.b = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
        }
    }
}
