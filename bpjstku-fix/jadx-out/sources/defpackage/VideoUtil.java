package defpackage;

import com.koushikdutta.async.ThreadQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class VideoUtil {
    public Semaphore b = new Semaphore(0);

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, TimeUnit timeUnit) throws InterruptedException {
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        ThreadQueue threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ThreadQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Thread.currentThread());
        VideoUtil videoUtil = threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.waiter;
        threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.waiter = this;
        Semaphore semaphore = threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.queueSemaphore;
        try {
            if (this.b.tryAcquire()) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (true) {
                Runnable runnableTuitionPaymentFragmentspecialinlinedviewModeldefault3 = threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove();
                if (runnableTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    runnableTuitionPaymentFragmentspecialinlinedviewModeldefault3.run();
                } else {
                    if (!semaphore.tryAcquire(Math.max(1, semaphore.availablePermits()), jConvert, TimeUnit.MILLISECONDS)) {
                        return false;
                    }
                    if (this.b.tryAcquire()) {
                        return true;
                    }
                    if (System.currentTimeMillis() - jCurrentTimeMillis >= jConvert) {
                        return false;
                    }
                }
            }
        } finally {
            threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.waiter = videoUtil;
        }
    }
}
