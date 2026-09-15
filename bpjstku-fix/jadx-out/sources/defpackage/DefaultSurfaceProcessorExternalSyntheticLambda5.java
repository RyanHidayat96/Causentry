package defpackage;

import com.koushikdutta.async.ThreadQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultSurfaceProcessorExternalSyntheticLambda5<T> extends DefaultSurfaceProcessorExternalSyntheticLambda13 implements snapshot<T> {
    private VideoUtil TuitionPaymentFragmentbindingInflater1;
    private b<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Exception b;

    protected interface b<T> {
        void b(Exception exc, T t, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public DefaultSurfaceProcessorExternalSyntheticLambda5() {
    }

    private DefaultSurfaceProcessorExternalSyntheticLambda5(T t) {
        b((Exception) null, t, (TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) {
        b<T> bVar;
        if (!super.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            return false;
        }
        synchronized (this) {
            this.b = new CancellationException();
            VideoUtil videoUtil = this.TuitionPaymentFragmentbindingInflater1;
            if (videoUtil != null) {
                videoUtil.b.release();
                ThreadQueue.TuitionPaymentFragmentbindingInflater1(videoUtil);
                this.TuitionPaymentFragmentbindingInflater1 = null;
            }
            bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((TuitionPaymentFragmentspecialinlinedviewModeldefault2) null, bVar);
        return true;
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda13, defpackage.lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        synchronized (this) {
            if (!isCancelled() && !isDone()) {
                if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                    this.TuitionPaymentFragmentbindingInflater1 = new VideoUtil();
                }
                VideoUtil videoUtil = this.TuitionPaymentFragmentbindingInflater1;
                ThreadQueue threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ThreadQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Thread.currentThread());
                VideoUtil videoUtil2 = threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.waiter;
                threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.waiter = videoUtil;
                Semaphore semaphore = threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.queueSemaphore;
                try {
                    if (!videoUtil.b.tryAcquire()) {
                        while (true) {
                            Runnable runnableTuitionPaymentFragmentspecialinlinedviewModeldefault3 = threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove();
                            if (runnableTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                runnableTuitionPaymentFragmentspecialinlinedviewModeldefault3.run();
                            } else {
                                semaphore.acquire(Math.max(1, semaphore.availablePermits()));
                                if (videoUtil.b.tryAcquire()) {
                                    break;
                                }
                            }
                        }
                    }
                    threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.waiter = videoUtil2;
                    if (this.b != null) {
                        throw new ExecutionException(this.b);
                    }
                    return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } catch (Throwable th) {
                    threadQueueTuitionPaymentFragmentspecialinlinedviewModeldefault2.waiter = videoUtil2;
                    throw th;
                }
            }
            if (this.b != null) {
                throw new ExecutionException(this.b);
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        synchronized (this) {
            if (!isCancelled() && !isDone()) {
                if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                    this.TuitionPaymentFragmentbindingInflater1 = new VideoUtil();
                }
                VideoUtil videoUtil = this.TuitionPaymentFragmentbindingInflater1;
                if (!videoUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j, timeUnit)) {
                    throw new TimeoutException();
                }
                if (this.b != null) {
                    throw new ExecutionException(this.b);
                }
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (this.b != null) {
                throw new ExecutionException(this.b);
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        b TuitionPaymentFragmentbindingInflater1;
        Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Exception b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            while (true) {
                b bVar = this.TuitionPaymentFragmentbindingInflater1;
                if (bVar == 0) {
                    return;
                }
                Exception exc = this.b;
                Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                this.TuitionPaymentFragmentbindingInflater1 = null;
                this.b = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                bVar.b(exc, obj, this);
            }
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, b<T> bVar) {
        boolean z;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || bVar == null) {
            return;
        }
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            z = true;
        } else {
            z = false;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 = bVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = this.b;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (z) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    public final boolean b(Exception exc, T t, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        synchronized (this) {
            if (!super.b()) {
                return false;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = t;
            this.b = exc;
            VideoUtil videoUtil = this.TuitionPaymentFragmentbindingInflater1;
            if (videoUtil != null) {
                videoUtil.b.release();
                ThreadQueue.TuitionPaymentFragmentbindingInflater1(videoUtil);
                this.TuitionPaymentFragmentbindingInflater1 = null;
            }
            b<T> bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault2, bVar);
            return true;
        }
    }

    public void TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, b<T> bVar) {
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
            if (isDone() || isCancelled()) {
                b<T> bVar2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault2, bVar2);
            }
        }
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda10
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DefaultSurfaceProcessorExternalSyntheticLambda14<T> defaultSurfaceProcessorExternalSyntheticLambda14) {
        TuitionPaymentFragmentbindingInflater1(null, new DefaultSurfaceProcessorExternalSyntheticLambda4(defaultSurfaceProcessorExternalSyntheticLambda14));
    }

    public final DefaultSurfaceProcessorExternalSyntheticLambda10<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(DefaultSurfaceProcessorExternalSyntheticLambda10<T> defaultSurfaceProcessorExternalSyntheticLambda10, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(defaultSurfaceProcessorExternalSyntheticLambda10);
        final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        if (defaultSurfaceProcessorExternalSyntheticLambda10 instanceof DefaultSurfaceProcessorExternalSyntheticLambda5) {
            ((DefaultSurfaceProcessorExternalSyntheticLambda5) defaultSurfaceProcessorExternalSyntheticLambda10).TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault2, new b() { // from class: DefaultSurfaceProcessorExternalSyntheticLambda7
                @Override // DefaultSurfaceProcessorExternalSyntheticLambda5.b
                public final void b(Exception exc, Object obj, DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    defaultSurfaceProcessorExternalSyntheticLambda5.b(this.b.b(exc, obj, tuitionPaymentFragmentspecialinlinedviewModeldefault3) ? null : new CancellationException(), obj, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            });
            return defaultSurfaceProcessorExternalSyntheticLambda5;
        }
        defaultSurfaceProcessorExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DefaultSurfaceProcessorExternalSyntheticLambda14() { // from class: setSupplier
            @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
            public final void TuitionPaymentFragmentbindingInflater1(Exception exc, Object obj) {
                defaultSurfaceProcessorExternalSyntheticLambda5.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(exc, obj, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null) ? null : new CancellationException(), (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
            }
        });
        return defaultSurfaceProcessorExternalSyntheticLambda5;
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda10
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(final DefaultSurfaceProcessorExternalSyntheticLambda9<T> defaultSurfaceProcessorExternalSyntheticLambda9) {
        final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        TuitionPaymentFragmentbindingInflater1(null, new b() { // from class: DefaultSurfaceProcessorFactory
            @Override // DefaultSurfaceProcessorExternalSyntheticLambda5.b
            public final void b(Exception exc, Object obj, DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                DefaultSurfaceProcessorExternalSyntheticLambda5.b(defaultSurfaceProcessorExternalSyntheticLambda9, defaultSurfaceProcessorExternalSyntheticLambda5, exc, obj, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        return defaultSurfaceProcessorExternalSyntheticLambda5;
    }

    static /* synthetic */ void b(DefaultSurfaceProcessorExternalSyntheticLambda9 defaultSurfaceProcessorExternalSyntheticLambda9, DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5, Exception e2, Object obj, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        if (e2 == null) {
            try {
                defaultSurfaceProcessorExternalSyntheticLambda9.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj);
            } catch (Exception e3) {
                e2 = e3;
            }
        }
        defaultSurfaceProcessorExternalSyntheticLambda5.b(e2, obj, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda10
    public final <R> DefaultSurfaceProcessorExternalSyntheticLambda10<R> TuitionPaymentFragmentspecialinlinedviewModeldefault2(final DefaultSurfaceProcessorPendingSnapshot<R, T> defaultSurfaceProcessorPendingSnapshot) {
        final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        TuitionPaymentFragmentbindingInflater1(null, new b() { // from class: DefaultSurfaceProcessorExternalSyntheticLambda6
            @Override // DefaultSurfaceProcessorExternalSyntheticLambda5.b
            public final void b(Exception exc, Object obj, DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, defaultSurfaceProcessorPendingSnapshot, exc, obj, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        return defaultSurfaceProcessorExternalSyntheticLambda5;
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5, DefaultSurfaceProcessorPendingSnapshot defaultSurfaceProcessorPendingSnapshot, Exception exc, Object obj, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        if (exc != null) {
            defaultSurfaceProcessorExternalSyntheticLambda5.b(exc, (Object) null, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return;
        }
        try {
            defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(defaultSurfaceProcessorPendingSnapshot.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj), tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } catch (Exception e2) {
            defaultSurfaceProcessorExternalSyntheticLambda5.b(e2, (Object) null, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    static /* synthetic */ DefaultSurfaceProcessorExternalSyntheticLambda10 TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasafeProcess0androidxcameracoreprocessingInternalImageProcessor lambdasafeprocess0androidxcameracoreprocessinginternalimageprocessor, Object obj) throws Exception {
        return new DefaultSurfaceProcessorExternalSyntheticLambda5(lambdasafeprocess0androidxcameracoreprocessinginternalimageprocessor.TuitionPaymentFragmentbindingInflater1(obj));
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda10
    public final <R> DefaultSurfaceProcessorExternalSyntheticLambda10<R> TuitionPaymentFragmentspecialinlinedviewModeldefault2(final lambdasafeProcess0androidxcameracoreprocessingInternalImageProcessor<R, T> lambdasafeprocess0androidxcameracoreprocessinginternalimageprocessor) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(new DefaultSurfaceProcessorPendingSnapshot() { // from class: DefaultSurfaceProcessorFactoryExternalSyntheticLambda0
            @Override // defpackage.DefaultSurfaceProcessorPendingSnapshot
            public final DefaultSurfaceProcessorExternalSyntheticLambda10 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
                return DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasafeprocess0androidxcameracoreprocessinginternalimageprocessor, obj);
            }
        });
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda10
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<T> TuitionPaymentFragmentbindingInflater1(final onFrameAvailable onframeavailable) {
        final DefaultSurfaceProcessorExternalSyntheticLambda0 defaultSurfaceProcessorExternalSyntheticLambda0 = new DefaultSurfaceProcessorExternalSyntheticLambda0() { // from class: DefaultSurfaceProcessorExternalSyntheticLambda3
            @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda0
            public final DefaultSurfaceProcessorExternalSyntheticLambda10 TuitionPaymentFragmentbindingInflater1(Exception exc) {
                return DefaultSurfaceProcessorExternalSyntheticLambda5.b(onframeavailable, exc);
            }
        };
        final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        TuitionPaymentFragmentbindingInflater1(null, new b() { // from class: DefaultSurfaceProcessorExternalSyntheticLambda8
            @Override // DefaultSurfaceProcessorExternalSyntheticLambda5.b
            public final void b(Exception exc, Object obj, DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                DefaultSurfaceProcessorExternalSyntheticLambda5.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, defaultSurfaceProcessorExternalSyntheticLambda0, exc, obj, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        return defaultSurfaceProcessorExternalSyntheticLambda5;
    }

    static /* synthetic */ DefaultSurfaceProcessorExternalSyntheticLambda10 b(onFrameAvailable onframeavailable, Exception exc) throws Exception {
        onframeavailable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
        return new DefaultSurfaceProcessorExternalSyntheticLambda5(null);
    }

    static /* synthetic */ void b(DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5, DefaultSurfaceProcessorExternalSyntheticLambda0 defaultSurfaceProcessorExternalSyntheticLambda0, Exception exc, Object obj, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        if (exc == null) {
            defaultSurfaceProcessorExternalSyntheticLambda5.b(exc, obj, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return;
        }
        try {
            defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(defaultSurfaceProcessorExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(exc), tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } catch (Exception e2) {
            defaultSurfaceProcessorExternalSyntheticLambda5.b(e2, (Object) null, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda13
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor) {
        return super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor);
    }

    public final DefaultSurfaceProcessorExternalSyntheticLambda5<T> asInterface() {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        this.b = null;
        this.TuitionPaymentFragmentbindingInflater1 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        return this;
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda13
    public final /* bridge */ /* synthetic */ lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        this.b = null;
        this.TuitionPaymentFragmentbindingInflater1 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        return this;
    }

    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda13
    public final boolean b() {
        return b((Exception) null, (Object) null, (TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
    }
}
