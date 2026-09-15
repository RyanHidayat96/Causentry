package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class BufferedAudioStreamAudioData<T, U extends Collection<? super T>> extends notifySuspended<T, U> {
    private Callable<U> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public BufferedAudioStreamAudioData(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(16);
    }

    public BufferedAudioStreamAudioData(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, Callable<U> callable) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = callable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        try {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(derivemediatype, (Collection) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, derivemediatype);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T, U extends Collection<? super T>> implements deriveMediaType<T>, BufferProviderState {
        private deriveMediaType<? super U> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private U b;

        b(deriveMediaType<? super U> derivemediatype, U u) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.b = u;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(this);
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
            this.b.add(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.b = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            U u = this.b;
            this.b = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(u);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
        }
    }
}
