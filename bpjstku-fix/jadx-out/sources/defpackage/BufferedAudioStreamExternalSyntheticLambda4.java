package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class BufferedAudioStreamExternalSyntheticLambda4<T, U extends Collection<? super T>> extends deriveCodec<U> implements newSharedInstance<U> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Callable<U> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public BufferedAudioStreamExternalSyntheticLambda4(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
    }

    public BufferedAudioStreamExternalSyntheticLambda4(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, Callable<U> callable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = callable;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super U> getdefaultvideoprofile) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(new TuitionPaymentFragmentbindingInflater1(getdefaultvideoprofile, (Collection) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, getdefaultvideoprofile);
        }
    }

    @Override // defpackage.newSharedInstance
    public final VideoRecordEventStart<U> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new BufferedAudioStreamAudioData(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T, U extends Collection<? super T>> implements deriveMediaType<T>, BufferProviderState {
        private U TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private getDefaultVideoProfile<? super U> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(getDefaultVideoProfile<? super U> getdefaultvideoprofile, U u) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getdefaultvideoprofile;
            this.TuitionPaymentFragmentbindingInflater1 = u;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed();
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentbindingInflater1.add(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            U u = this.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(u);
        }
    }
}
