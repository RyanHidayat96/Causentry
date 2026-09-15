package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_AudioSettings<T> extends notifySuspended<T, T> {
    private readableMs<? super Throwable, ? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public AutoValue_AudioSettings(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super Throwable, ? extends T> readablems) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T> implements deriveMediaType<T>, BufferProviderState {
        private BufferProviderState TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private readableMs<? super Throwable, ? extends T> b;

        b(deriveMediaType<? super T> derivemediatype, readableMs<? super Throwable, ? extends T> readablems) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = derivemediatype;
            this.b = readablems;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentbindingInflater1, bufferProviderState)) {
                this.TuitionPaymentFragmentbindingInflater1 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onSubscribe(this);
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

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            try {
                T tApply = this.b.apply(th);
                if (tApply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(nullPointerException);
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onNext(tApply);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
                }
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onComplete();
        }
    }
}
