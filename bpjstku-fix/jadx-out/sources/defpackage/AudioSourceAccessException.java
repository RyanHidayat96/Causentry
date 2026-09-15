package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSourceAccessException<T> extends VideoRecordEventStart<T> {
    private Callable<? extends Throwable> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public AudioSourceAccessException(Callable<? extends Throwable> callable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = callable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        try {
            th = (Throwable) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            dumpMediaCodecListForFormat.b(th);
        }
        EmptyDisposable.b(th, derivemediatype);
    }
}
