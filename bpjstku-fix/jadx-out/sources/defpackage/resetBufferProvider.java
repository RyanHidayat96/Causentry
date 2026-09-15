package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class resetBufferProvider<T> implements deriveMediaType<T>, BufferProviderState {
    private BufferProviderState TuitionPaymentFragmentbindingInflater1;
    private formatInterval TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private logToString<? super BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private deriveMediaType<? super T> b;

    public resetBufferProvider(deriveMediaType<? super T> derivemediatype, logToString<? super BufferProviderState> logtostring, formatInterval formatinterval) {
        this.b = derivemediatype;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = logtostring;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = formatinterval;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.accept(bufferProviderState);
            if (DisposableHelper.b(this.TuitionPaymentFragmentbindingInflater1, bufferProviderState)) {
                this.TuitionPaymentFragmentbindingInflater1 = bufferProviderState;
                this.b.onSubscribe(this);
            }
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            bufferProviderState.dispose();
            this.TuitionPaymentFragmentbindingInflater1 = DisposableHelper.DISPOSED;
            EmptyDisposable.b(th, this.b);
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        this.b.onNext(t);
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        if (this.TuitionPaymentFragmentbindingInflater1 != DisposableHelper.DISPOSED) {
            this.TuitionPaymentFragmentbindingInflater1 = DisposableHelper.DISPOSED;
            this.b.onError(th);
        } else {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        if (this.TuitionPaymentFragmentbindingInflater1 != DisposableHelper.DISPOSED) {
            this.TuitionPaymentFragmentbindingInflater1 = DisposableHelper.DISPOSED;
            this.b.onComplete();
        }
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        BufferProviderState bufferProviderState = this.TuitionPaymentFragmentbindingInflater1;
        if (bufferProviderState != DisposableHelper.DISPOSED) {
            this.TuitionPaymentFragmentbindingInflater1 = DisposableHelper.DISPOSED;
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.run();
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
            bufferProviderState.dispose();
        }
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.TuitionPaymentFragmentbindingInflater1.isDisposed();
    }
}
