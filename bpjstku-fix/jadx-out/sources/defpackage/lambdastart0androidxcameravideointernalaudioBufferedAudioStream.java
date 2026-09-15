package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdastart0androidxcameravideointernalaudioBufferedAudioStream<T> extends VideoRecordEventResume<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public lambdastart0androidxcameravideointernalaudioBufferedAudioStream(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_VideoValidatedEncoderProfilesProxy;
    }

    @Override // defpackage.VideoRecordEventResume
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(errorToString<? super T> errortostring) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(errortostring));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements deriveMediaType<T>, BufferProviderState {
        private T TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private errorToString<? super T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(errorToString<? super T> errortostring) {
            this.b = errortostring;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                this.b.onSubscribe(this);
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
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
                this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = t;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                this.b.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            T t = this.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentbindingInflater1 = null;
            if (t == null) {
                this.b.onComplete();
            } else {
                this.b.b(t);
            }
        }
    }
}
