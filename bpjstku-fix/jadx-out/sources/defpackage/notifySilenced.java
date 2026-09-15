package defpackage;

import io.reactivex.disposables.RunnableDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class notifySilenced<T> extends VideoRecordEventResume<T> implements Callable<T> {
    private Callable<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public notifySilenced(Callable<? extends T> callable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = callable;
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.call();
    }

    @Override // defpackage.VideoRecordEventResume
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(errorToString<? super T> errortostring) {
        Runnable runnable = Functions.b;
        share.b(runnable, "run is null");
        RunnableDisposable runnableDisposable = new RunnableDisposable(runnable);
        errortostring.onSubscribe(runnableDisposable);
        if (runnableDisposable.isDisposed()) {
            return;
        }
        try {
            T tCall = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.call();
            if (runnableDisposable.isDisposed()) {
                return;
            }
            if (tCall == null) {
                errortostring.onComplete();
            } else {
                errortostring.b(tCall);
            }
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (!runnableDisposable.isDisposed()) {
                errortostring.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }
    }
}
