package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class sendCommand<T> {
    private static Executor TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Executors.newCachedThreadPool();
    private final Set<removeQueueItemAt<Throwable>> TuitionPaymentFragmentbindingInflater1;
    private final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private volatile rateWithExtras<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Set<removeQueueItemAt<T>> b;

    static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(sendCommand sendcommand, Object obj) {
        synchronized (sendcommand) {
            Iterator it = new ArrayList(sendcommand.b).iterator();
            while (it.hasNext()) {
                ((removeQueueItemAt) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj);
            }
        }
    }

    static /* synthetic */ void b(sendCommand sendcommand, Throwable th) {
        synchronized (sendcommand) {
            ArrayList arrayList = new ArrayList(sendcommand.TuitionPaymentFragmentbindingInflater1);
            if (arrayList.isEmpty()) {
                onSetCaptioningEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((removeQueueItemAt) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
            }
        }
    }

    public sendCommand(Callable<rateWithExtras<T>> callable) {
        this(callable, (byte) 0);
    }

    private sendCommand(Callable<rateWithExtras<T>> callable, byte b) {
        this.b = new LinkedHashSet(1);
        this.TuitionPaymentFragmentbindingInflater1 = new LinkedHashSet(1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Handler(Looper.getMainLooper());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2.execute(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(callable));
    }

    public final sendCommand<T> b(removeQueueItemAt<T> removequeueitemat) {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                removequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            this.b.add(removequeueitemat);
        }
        return this;
    }

    public final sendCommand<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(removeQueueItemAt<T> removequeueitemat) {
        synchronized (this) {
            this.b.remove(removequeueitemat);
        }
        return this;
    }

    public final sendCommand<T> TuitionPaymentFragmentbindingInflater1(removeQueueItemAt<Throwable> removequeueitemat) {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 != null) {
                removequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
            }
            this.TuitionPaymentFragmentbindingInflater1.add(removequeueitemat);
        }
        return this;
    }

    public final sendCommand<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(removeQueueItemAt<Throwable> removequeueitemat) {
        synchronized (this) {
            this.TuitionPaymentFragmentbindingInflater1.remove(removequeueitemat);
        }
        return this;
    }

    /* JADX INFO: loaded from: classes4.dex */
    class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends FutureTask<rateWithExtras<T>> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Callable<rateWithExtras<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            if (isCancelled()) {
                return;
            }
            try {
                sendCommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sendCommand.this, get());
            } catch (InterruptedException | ExecutionException e2) {
                sendCommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sendCommand.this, new rateWithExtras(e2));
            }
        }
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(sendCommand sendcommand, rateWithExtras ratewithextras) {
        if (sendcommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        sendcommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ratewithextras;
        sendcommand.TuitionPaymentFragmentspecialinlinedviewModeldefault1.post(new Runnable() { // from class: sendCommand.4
            @Override // java.lang.Runnable
            public final void run() {
                if (sendCommand.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    return;
                }
                rateWithExtras ratewithextras2 = sendCommand.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (ratewithextras2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    sendCommand.TuitionPaymentFragmentbindingInflater1(sendCommand.this, ratewithextras2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    sendCommand.b(sendCommand.this, ratewithextras2.TuitionPaymentFragmentbindingInflater1);
                }
            }
        });
    }
}
