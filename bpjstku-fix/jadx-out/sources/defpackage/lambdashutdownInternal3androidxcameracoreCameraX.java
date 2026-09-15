package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdashutdownInternal3androidxcameracoreCameraX implements ExecutorService {
    private static volatile int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TimeUnit.SECONDS.toMillis(10);
    private final ExecutorService b;

    public static lambdashutdownInternal3androidxcameracoreCameraX TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new lambdashutdownInternal3androidxcameracoreCameraX(new ThreadPoolExecutor(0, Integer.MAX_VALUE, TuitionPaymentFragmentspecialinlinedviewModeldefault3, TimeUnit.MILLISECONDS, new SynchronousQueue(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0), "source-unlimited", TuitionPaymentFragmentspecialinlinedviewModeldefault1.b, false)));
    }

    lambdashutdownInternal3androidxcameracoreCameraX(ExecutorService executorService) {
        this.b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.b.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.b.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.b.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.b.awaitTermination(j, timeUnit);
    }

    public final String toString() {
        return this.b.toString();
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 b;

        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th);

        static {
            new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault1.3
                @Override // lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
                }
            };
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault1.4
                @Override // lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
                }
            };
            new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault1.2
                @Override // lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            };
            b = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements ThreadFactory {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable) { // from class: lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault3.3
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    Process.setThreadPriority(9);
                    super.run();
                }
            };
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements ThreadFactory {
        private final String TuitionPaymentFragmentbindingInflater1;
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final AtomicInteger TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicInteger();
        private final ThreadFactory b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ThreadFactory threadFactory, String str, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, boolean z) {
            this.b = threadFactory;
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            Thread threadNewThread = this.b.newThread(new Runnable() { // from class: lambdashutdownInternal3androidxcameracoreCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault2.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                    }
                }
            });
            StringBuilder sb = new StringBuilder("glide-");
            sb.append(this.TuitionPaymentFragmentbindingInflater1);
            sb.append("-thread-");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndIncrement());
            threadNewThread.setName(sb.toString());
            return threadNewThread;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1264a;
        String b;
        private final ThreadFactory TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1 asBinder = TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;

        TuitionPaymentFragmentbindingInflater1(boolean z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        }

        public final lambdashutdownInternal3androidxcameracoreCameraX TuitionPaymentFragmentbindingInflater1() {
            if (TextUtils.isEmpty(this.b)) {
                StringBuilder sb = new StringBuilder("Name must be non-null and non-empty, but given: ");
                sb.append(this.b);
                throw new IllegalArgumentException(sb.toString());
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.f1264a, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, this.b, this.asBinder, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            if (this.f1264a != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new lambdashutdownInternal3androidxcameracoreCameraX(threadPoolExecutor);
        }
    }

    public static lambdashutdownInternal3androidxcameracoreCameraX TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 >= 4 ? 2 : 1;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(true);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        tuitionPaymentFragmentbindingInflater1.b = "animation";
        return tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
    }

    public static lambdashutdownInternal3androidxcameracoreCameraX TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(true);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        tuitionPaymentFragmentbindingInflater1.b = "disk-cache";
        return tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
    }

    public static lambdashutdownInternal3androidxcameracoreCameraX b() {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(false);
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        tuitionPaymentFragmentbindingInflater1.b = "source";
        return tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
    }
}
