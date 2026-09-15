package defpackage;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioStreamFactory<T> extends VideoRecordEventStart<T> implements Callable<T> {
    private Callable<? extends T> TuitionPaymentFragmentbindingInflater1;

    public AudioStreamFactory(Callable<? extends T> callable) {
        this.TuitionPaymentFragmentbindingInflater1 = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(derivemediatype);
        derivemediatype.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            deferredScalarDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(share.b(this.TuitionPaymentFragmentbindingInflater1.call(), "Callable returned null"));
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (!deferredScalarDisposable.isDisposed()) {
                derivemediatype.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        return (T) share.b(this.TuitionPaymentFragmentbindingInflater1.call(), "The callable returned a null value");
    }
}
