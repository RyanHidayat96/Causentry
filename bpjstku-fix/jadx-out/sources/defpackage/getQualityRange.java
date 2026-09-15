package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public final class getQualityRange implements Future<Object> {
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    public getQualityRange(BufferProviderState bufferProviderState) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bufferProviderState;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
        return false;
    }
}
