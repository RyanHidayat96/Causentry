package defpackage;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class getSizeInBytes<T> extends VideoRecordEventStart<T> {
    private Future<? extends T> TuitionPaymentFragmentbindingInflater1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private TimeUnit b;

    public getSizeInBytes(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.TuitionPaymentFragmentbindingInflater1 = future;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.b = timeUnit;
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
            TimeUnit timeUnit = this.b;
            deferredScalarDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(share.b(timeUnit != null ? this.TuitionPaymentFragmentbindingInflater1.get(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, timeUnit) : this.TuitionPaymentFragmentbindingInflater1.get(), "Future returned null"));
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            derivemediatype.onError(th);
        }
    }
}
