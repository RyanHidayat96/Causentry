package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class AudioSourceExternalSyntheticLambda2<T, U> extends notifySuspended<T, U> {
    private dumpVideoCapabilities<? super U, ? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Callable<? extends U> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public AudioSourceExternalSyntheticLambda2(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, Callable<? extends U> callable, dumpVideoCapabilities<? super U, ? super T> dumpvideocapabilities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = callable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dumpvideocapabilities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        try {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(derivemediatype, share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.call(), "The initialSupplier returned a null value"), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        } catch (Throwable th) {
            EmptyDisposable.b(th, derivemediatype);
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1<T, U> implements deriveMediaType<T>, BufferProviderState {
        private dumpVideoCapabilities<? super U, ? super T> TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private U TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private deriveMediaType<? super U> b;

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super U> derivemediatype, U u, dumpVideoCapabilities<? super U, ? super T> dumpvideocapabilities) {
            this.b = derivemediatype;
            this.TuitionPaymentFragmentbindingInflater1 = dumpvideocapabilities;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = u;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bufferProviderState;
                this.b.onSubscribe(this);
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
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            try {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, t);
            } catch (Throwable th) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                this.b.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            this.b.onNext(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.b.onComplete();
        }
    }
}
