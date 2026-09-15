package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class startCollectingAudioData<T> extends notifySuspended<T, T> {
    private dumpCodecCapabilities<T, T, T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public startCollectingAudioData(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, dumpCodecCapabilities<T, T, T> dumpcodeccapabilities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dumpcodeccapabilities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements deriveMediaType<T>, BufferProviderState {
        private boolean TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private T TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private dumpCodecCapabilities<T, T, T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private BufferProviderState b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType<? super T> derivemediatype, dumpCodecCapabilities<T, T, T> dumpcodeccapabilities) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dumpcodeccapabilities;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.b, bufferProviderState)) {
                this.b = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
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

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            deriveMediaType<? super T> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            T t2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (t2 == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
                derivemediatype.onNext(t);
                return;
            }
            try {
                ?? r4 = (T) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(t2, t), "The value returned by the accumulator is null");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r4;
                derivemediatype.onNext(r4);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.b.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentbindingInflater1 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }
    }
}
