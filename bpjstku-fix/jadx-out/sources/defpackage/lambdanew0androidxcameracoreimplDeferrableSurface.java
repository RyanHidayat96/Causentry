package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
class lambdanew0androidxcameracoreimplDeferrableSurface<V> implements ListenableFuture<V> {
    static final ListenableFuture<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new lambdanew0androidxcameracoreimplDeferrableSurface(null);
    private static final getPrescribedStreamFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getPrescribedStreamFormat(lambdanew0androidxcameracoreimplDeferrableSurface.class);
    private final V TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    lambdanew0androidxcameracoreimplDeferrableSurface(V v) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = v;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw new NullPointerException("Runnable was null.");
        }
        if (executor != null) {
            try {
                executor.execute(runnable);
                return;
            } catch (Exception e2) {
                Logger loggerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
                sb.append(runnable);
                sb.append(" with executor ");
                sb.append(executor);
                loggerTuitionPaymentFragmentspecialinlinedviewModeldefault2.log(level, sb.toString(), (Throwable) e2);
                return;
            }
        }
        throw new NullPointerException("Executor was null.");
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        return get();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("]]");
        return sb.toString();
    }
}
