package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class updateCollectionBufferSize<T> extends deriveCodec<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> TuitionPaymentFragmentbindingInflater1;
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public updateCollectionBufferSize(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, T t) {
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements deriveMediaType<T>, BufferProviderState {
        private T TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private getDefaultVideoProfile<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private T b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile, T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getdefaultvideoprofile;
            this.TuitionPaymentFragmentbindingInflater1 = t;
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
            if (this.b != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.b = t;
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
            T t = this.b;
            this.b = null;
            if (t == null) {
                t = this.TuitionPaymentFragmentbindingInflater1;
            }
            if (t != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(t);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(new NoSuchElementException());
            }
        }
    }
}
