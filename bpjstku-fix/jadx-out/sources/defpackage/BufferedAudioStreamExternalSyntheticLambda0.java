package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class BufferedAudioStreamExternalSyntheticLambda0<T> extends notifySuspended<T, T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> b;

    public BufferedAudioStreamExternalSyntheticLambda0(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = autoValue_VideoValidatedEncoderProfilesProxy2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype, this.b);
        derivemediatype.onSubscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements deriveMediaType<T> {
        private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private boolean TuitionPaymentFragmentbindingInflater1 = true;
        final SequentialDisposable b = new SequentialDisposable();

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super T> derivemediatype, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                this.TuitionPaymentFragmentbindingInflater1 = false;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentbindingInflater1) {
                this.TuitionPaymentFragmentbindingInflater1 = false;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(this);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
            }
        }
    }
}
