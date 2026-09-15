package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class Api31Impl {
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static AtomicReference<ScheduledExecutorService> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> b = new ConcurrentHashMap();

    static {
        b bVar = new b();
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3("rx2.purge-enabled", bVar);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = zTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(zTuitionPaymentFragmentspecialinlinedviewModeldefault3, "rx2.purge-period-seconds", bVar);
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                long j = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(tuitionPaymentFragmentspecialinlinedviewModeldefault2, j, j, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, String str, readableMs<String, String> readablems) {
        if (z) {
            try {
                String strApply = readablems.apply(str);
                if (strApply != null) {
                    return Integer.parseInt(strApply);
                }
            } catch (Throwable unused) {
            }
        }
        return 1;
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, readableMs<String, String> readablems) {
        try {
            String strApply = readablems.apply(str);
            if (strApply != null) {
                return "true".equals(strApply);
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    static final class b implements readableMs<String, String> {
        b() {
        }

        @Override // defpackage.readableMs
        public final /* synthetic */ String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    public static ScheduledExecutorService TuitionPaymentFragmentbindingInflater1(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1 && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            b.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Runnable {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(Api31Impl.b.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    Api31Impl.b.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
