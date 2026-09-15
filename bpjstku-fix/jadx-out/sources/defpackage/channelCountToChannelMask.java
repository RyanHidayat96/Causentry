package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class channelCountToChannelMask<T, R> extends notifySuspended<T, AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> {
    private readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> b;

    public channelCountToChannelMask(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems2, Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> callable) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = callable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentbindingInflater1(derivemediatype, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T, R> implements deriveMediaType<T>, BufferProviderState {
        private Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private BufferProviderState b;

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems2, Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> callable) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems2;
            this.TuitionPaymentFragmentbindingInflater1 = callable;
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

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext((AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.apply(t), "The onNext ObservableSource returned is null"));
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext((AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.apply(th), "The onError ObservableSource returned is null"));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext((AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentbindingInflater1.call(), "The onComplete ObservableSource returned is null"));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }
    }
}
