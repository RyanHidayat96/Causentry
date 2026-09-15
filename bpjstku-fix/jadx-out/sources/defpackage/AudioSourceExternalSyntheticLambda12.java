package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda12<T, U> extends deriveCodec<U> implements newSharedInstance<U> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private dumpVideoCapabilities<? super U, ? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Callable<? extends U> b;

    public AudioSourceExternalSyntheticLambda12(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, Callable<? extends U> callable, dumpVideoCapabilities<? super U, ? super T> dumpvideocapabilities) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.b = callable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dumpvideocapabilities;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super U> getdefaultvideoprofile) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(getdefaultvideoprofile, share.b(this.b.call(), "The initialSupplier returned a null value"), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        } catch (Throwable th) {
            EmptyDisposable.b(th, getdefaultvideoprofile);
        }
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<U> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new AudioSourceExternalSyntheticLambda2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T, U> implements deriveMediaType<T>, BufferProviderState {
        private U TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private getDefaultVideoProfile<? super U> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private dumpVideoCapabilities<? super U, ? super T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super U> getdefaultvideoprofile, U u, dumpVideoCapabilities<? super U, ? super T> dumpvideocapabilities) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getdefaultvideoprofile;
            this.b = dumpvideocapabilities;
            this.TuitionPaymentFragmentbindingInflater1 = u;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            try {
                this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, t);
            } catch (Throwable th) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    }
}
