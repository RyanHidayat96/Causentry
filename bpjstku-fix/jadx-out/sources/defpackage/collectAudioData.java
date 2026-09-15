package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class collectAudioData<T, R> extends notifySuspended<T, R> {
    private Callable<R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private dumpCodecCapabilities<R, ? super T, R> b;

    public collectAudioData(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, Callable<R> callable, dumpCodecCapabilities<R, ? super T, R> dumpcodeccapabilities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = dumpcodeccapabilities;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = callable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        try {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(derivemediatype, this.b, share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, derivemediatype);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R> implements deriveMediaType<T>, BufferProviderState {
        private dumpCodecCapabilities<R, ? super T, R> TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super R> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private R TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private BufferProviderState b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super R> derivemediatype, dumpCodecCapabilities<R, ? super T, R> dumpcodeccapabilities, R r) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.TuitionPaymentFragmentbindingInflater1 = dumpcodeccapabilities;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.b, bufferProviderState)) {
                this.b = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
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
                R r = (R) share.b(this.TuitionPaymentFragmentbindingInflater1.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, t), "The accumulator returned a null value");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(r);
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
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }
    }
}
