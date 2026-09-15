package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final class DeferrableSurface<V> extends removeObserver<V> {
    private final ListenableFuture<V> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    DeferrableSurface(ListenableFuture<V> listenableFuture) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = listenableFuture;
    }

    @Override // defpackage.withValue, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.addListener(runnable, executor);
    }

    @Override // defpackage.withValue, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel(z);
    }

    @Override // defpackage.withValue, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isCancelled();
    }

    @Override // defpackage.withValue, java.util.concurrent.Future
    public final boolean isDone() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDone();
    }

    @Override // defpackage.withValue, java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
    }

    @Override // defpackage.withValue, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(j, timeUnit);
    }

    @Override // defpackage.withValue
    public final String toString() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString();
    }
}
