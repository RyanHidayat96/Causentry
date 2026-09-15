package defpackage;

import io.reactivex.disposables.RunnableDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class blockUntilSystemTimeReached<T> extends deriveCodec<T> {
    private Callable<? extends T> TuitionPaymentFragmentbindingInflater1;

    public blockUntilSystemTimeReached(Callable<? extends T> callable) {
        this.TuitionPaymentFragmentbindingInflater1 = callable;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        Runnable runnable = Functions.b;
        share.b(runnable, "run is null");
        RunnableDisposable runnableDisposable = new RunnableDisposable(runnable);
        getdefaultvideoprofile.onSubscribe(runnableDisposable);
        if (runnableDisposable.isDisposed()) {
            return;
        }
        try {
            Absent absent = (Object) share.b(this.TuitionPaymentFragmentbindingInflater1.call(), "The callable returned a null value");
            if (runnableDisposable.isDisposed()) {
                return;
            }
            getdefaultvideoprofile.b(absent);
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (!runnableDisposable.isDisposed()) {
                getdefaultvideoprofile.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }
    }
}
