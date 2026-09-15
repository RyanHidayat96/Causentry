package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    public RxThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.prefix);
        sb.append('-');
        sb.append(incrementAndGet());
        String string = sb.toString();
        Thread tuitionPaymentFragmentbindingInflater1 = this.nonBlocking ? new TuitionPaymentFragmentbindingInflater1(runnable, string) : new Thread(runnable, string);
        tuitionPaymentFragmentbindingInflater1.setPriority(this.priority);
        tuitionPaymentFragmentbindingInflater1.setDaemon(true);
        return tuitionPaymentFragmentbindingInflater1;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        StringBuilder sb = new StringBuilder("RxThreadFactory[");
        sb.append(this.prefix);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class TuitionPaymentFragmentbindingInflater1 extends Thread {
        TuitionPaymentFragmentbindingInflater1(Runnable runnable, String str) {
            super(runnable, str);
        }
    }
}
