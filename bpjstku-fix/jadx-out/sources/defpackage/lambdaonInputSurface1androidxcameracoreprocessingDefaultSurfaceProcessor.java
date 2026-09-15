package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.Selector;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor implements Closeable {
    public Selector b;
    public AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AtomicBoolean(false);
    public Semaphore TuitionPaymentFragmentbindingInflater1 = new Semaphore(0);

    public lambdaonInputSurface1androidxcameracoreprocessingDefaultSurfaceProcessor(Selector selector) {
        this.b = selector;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) throws IOException {
        try {
            this.TuitionPaymentFragmentbindingInflater1.drainPermits();
            this.b.select(j);
        } finally {
            this.TuitionPaymentFragmentbindingInflater1.release(Integer.MAX_VALUE);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        for (int i = 0; i < 100; i++) {
            try {
                this.TuitionPaymentFragmentbindingInflater1.tryAcquire(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return true;
            }
        }
        return false;
    }
}
