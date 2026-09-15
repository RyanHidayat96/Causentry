package io.reactivex.internal.schedulers;

import defpackage.BufferProviderState;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements BufferProviderState {
    protected static final FutureTask<Void> TuitionPaymentFragmentbindingInflater1 = new FutureTask<>(Functions.b, null);
    private static FutureTask<Void> b = new FutureTask<>(Functions.b, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    AbstractDirectTask(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == TuitionPaymentFragmentbindingInflater1 || future == (futureTask = b) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.runner != Thread.currentThread());
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == TuitionPaymentFragmentbindingInflater1 || future == b;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            if (future2 == b) {
                future.cancel(this.runner != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
