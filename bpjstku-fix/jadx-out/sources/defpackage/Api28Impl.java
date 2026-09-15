package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
final class Api28Impl implements Callable<Void>, BufferProviderState {
    private static FutureTask<Void> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new FutureTask<>(Functions.b, null);
    private ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Runnable asInterface;
    private Thread b;
    private AtomicReference<Future<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicReference<>();
    private AtomicReference<Future<?>> TuitionPaymentFragmentbindingInflater1 = new AtomicReference<>();

    Api28Impl(Runnable runnable, ExecutorService executorService) {
        this.asInterface = runnable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        Future<?> future;
        this.b = Thread.currentThread();
        try {
            this.asInterface.run();
            Future futureSubmit = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.submit(this);
            do {
                future = this.TuitionPaymentFragmentbindingInflater1.get();
                if (future == TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    futureSubmit.cancel(this.b != Thread.currentThread());
                    break;
                }
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentbindingInflater1, future, futureSubmit));
            this.b = null;
        } catch (Throwable th) {
            this.b = null;
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
        return null;
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        AtomicReference<Future<?>> atomicReference = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        FutureTask<Void> futureTask = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.b != Thread.currentThread());
        }
        Future<?> andSet2 = this.TuitionPaymentFragmentbindingInflater1.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.b != Thread.currentThread());
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get() == TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (future2 == TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                future.cancel(this.b != Thread.currentThread());
                return;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, future2, future));
    }
}
