package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    static final Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    static final Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    abstract void TuitionPaymentFragmentbindingInflater1(Throwable th);

    abstract T TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Exception;

    abstract String TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    abstract void b(T t);

    abstract boolean b();

    InterruptibleTask() {
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b) {
            this();
        }
    }

    static {
        byte b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(b);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        T tTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zB = b();
            if (!zB) {
                try {
                    tTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3(threadCurrentThread);
                        }
                        if (zB) {
                            return;
                        }
                        TuitionPaymentFragmentbindingInflater1(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3(threadCurrentThread);
                        }
                        if (!zB) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(threadCurrentThread);
            }
            if (zB) {
                return;
            }
            b(tTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        int i = 0;
        boolean z = false;
        while (true) {
            boolean z2 = runnable instanceof Blocker;
            if (!z2 && runnable != TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                break;
            }
            if (z2) {
                blocker = (Blocker) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        private final InterruptibleTask<?> task;

        @Override // java.lang.Runnable
        public final void run() {
        }

        /* synthetic */ Blocker(InterruptibleTask interruptibleTask, byte b) {
            this(interruptibleTask);
        }

        private Blocker(InterruptibleTask<?> interruptibleTask) {
            this.task = interruptibleTask;
        }

        public final String toString() {
            return this.task.toString();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            string = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            StringBuilder sb = new StringBuilder("running=[RUNNING ON ");
            sb.append(((Thread) runnable).getName());
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(", ");
        sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        return sb2.toString();
    }
}
