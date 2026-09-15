package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceExternalSyntheticLambda6<T, U> extends VideoRecordEventStart<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<U> TuitionPaymentFragmentbindingInflater1;
    final AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AudioSourceExternalSyntheticLambda6(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_VideoValidatedEncoderProfilesProxy2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        derivemediatype.onSubscribe(sequentialDisposable);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(sequentialDisposable, derivemediatype));
    }

    /* JADX INFO: loaded from: classes7.dex */
    final class b implements deriveMediaType<U> {
        private boolean TuitionPaymentFragmentbindingInflater1;
        final deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final SequentialDisposable b;

        b(SequentialDisposable sequentialDisposable, deriveMediaType<? super T> derivemediatype) {
            this.b = sequentialDisposable;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(U u) {
            onComplete();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentbindingInflater1 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            AudioSourceExternalSyntheticLambda6.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }

        final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements deriveMediaType<T> {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            }

            @Override // defpackage.deriveMediaType
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b.this.b, bufferProviderState);
            }

            @Override // defpackage.deriveMediaType
            public final void onNext(T t) {
                b.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onNext(t);
            }

            @Override // defpackage.deriveMediaType
            public final void onError(Throwable th) {
                b.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th);
            }

            @Override // defpackage.deriveMediaType
            public final void onComplete() {
                b.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
            }
        }
    }
}
