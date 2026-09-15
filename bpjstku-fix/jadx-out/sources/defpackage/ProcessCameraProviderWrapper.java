package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0018\u0010\u0003J'\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"LProcessCameraProviderWrapper;", "LcancelPreviousRequest;", "<init>", "()V", "Ljava/io/IOException;", "p0", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "", "cancel", "enter", "", "exit", "()Z", "newTimeoutException", "", "remainingNanos", "(J)J", "LSurfaceViewImplementationApi24Impl;", "sink", "(LSurfaceViewImplementationApi24Impl;)LSurfaceViewImplementationApi24Impl;", "LtryToComplete;", "source", "(LtryToComplete;)LtryToComplete;", "timedOut", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "next", "LProcessCameraProviderWrapper;", "", RemoteConfigConstants.ResponseFieldKey.STATE, "I", "timeoutAt", "J", "Companion", "b"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ProcessCameraProviderWrapper extends cancelPreviousRequest {
    private static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static ProcessCameraProviderWrapper head;
    private static final ReentrantLock lock;
    private ProcessCameraProviderWrapper next;
    private int state;
    private long timeoutAt;

    protected void timedOut() {
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.state = 1;
                Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Companion, this, timeoutNanos, hasDeadline);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.cancelPreviousRequest
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                this.state = 3;
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long p0) {
        return this.timeoutAt - p0;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements SurfaceViewImplementationApi24Impl {
        private /* synthetic */ SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = surfaceViewImplementationApi24Impl;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() throws IOException {
            ProcessCameraProviderWrapper processCameraProviderWrapper = ProcessCameraProviderWrapper.this;
            SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            processCameraProviderWrapper.enter();
            try {
                try {
                    surfaceViewImplementationApi24Impl.flush();
                    Unit unit = Unit.INSTANCE;
                    if (processCameraProviderWrapper.exit()) {
                        throw processCameraProviderWrapper.access$newTimeoutException(null);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (processCameraProviderWrapper.exit()) {
                        e = processCameraProviderWrapper.access$newTimeoutException(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                processCameraProviderWrapper.exit();
                throw th;
            }
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            ProcessCameraProviderWrapper processCameraProviderWrapper = ProcessCameraProviderWrapper.this;
            SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            processCameraProviderWrapper.enter();
            try {
                try {
                    surfaceViewImplementationApi24Impl.close();
                    Unit unit = Unit.INSTANCE;
                    if (processCameraProviderWrapper.exit()) {
                        throw processCameraProviderWrapper.access$newTimeoutException(null);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (processCameraProviderWrapper.exit()) {
                        e = processCameraProviderWrapper.access$newTimeoutException(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                processCameraProviderWrapper.exit();
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(')');
            return sb.toString();
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final /* synthetic */ cancelPreviousRequest timeout() {
            return ProcessCameraProviderWrapper.this;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
            recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper.size, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = rotationProviderListenerWrapper.head;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                while (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    j2 += (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                    }
                }
                ProcessCameraProviderWrapper processCameraProviderWrapper = ProcessCameraProviderWrapper.this;
                SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                processCameraProviderWrapper.enter();
                try {
                    try {
                        surfaceViewImplementationApi24Impl.write(rotationProviderListenerWrapper, j2);
                        Unit unit = Unit.INSTANCE;
                        if (processCameraProviderWrapper.exit()) {
                            throw processCameraProviderWrapper.access$newTimeoutException(null);
                        }
                        j -= j2;
                    } catch (IOException e2) {
                        e = e2;
                        if (processCameraProviderWrapper.exit()) {
                            e = processCameraProviderWrapper.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    processCameraProviderWrapper.exit();
                    throw th;
                }
            }
        }
    }

    public final SurfaceViewImplementationApi24Impl sink(SurfaceViewImplementationApi24Impl p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements tryToComplete {
        private /* synthetic */ tryToComplete b;

        TuitionPaymentFragmentbindingInflater1(tryToComplete trytocomplete) {
            this.b = trytocomplete;
        }

        @Override // defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
            ProcessCameraProviderWrapper processCameraProviderWrapper = ProcessCameraProviderWrapper.this;
            tryToComplete trytocomplete = this.b;
            processCameraProviderWrapper.enter();
            try {
                try {
                    long j2 = trytocomplete.read(rotationProviderListenerWrapper, j);
                    if (processCameraProviderWrapper.exit()) {
                        throw processCameraProviderWrapper.access$newTimeoutException(null);
                    }
                    return j2;
                } catch (IOException e2) {
                    e = e2;
                    if (processCameraProviderWrapper.exit()) {
                        e = processCameraProviderWrapper.access$newTimeoutException(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                processCameraProviderWrapper.exit();
                throw th;
            }
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            ProcessCameraProviderWrapper processCameraProviderWrapper = ProcessCameraProviderWrapper.this;
            tryToComplete trytocomplete = this.b;
            processCameraProviderWrapper.enter();
            try {
                try {
                    trytocomplete.close();
                    Unit unit = Unit.INSTANCE;
                    if (processCameraProviderWrapper.exit()) {
                        throw processCameraProviderWrapper.access$newTimeoutException(null);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (processCameraProviderWrapper.exit()) {
                        e = processCameraProviderWrapper.access$newTimeoutException(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                processCameraProviderWrapper.exit();
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }

        @Override // defpackage.tryToComplete
        public final /* synthetic */ cancelPreviousRequest timeout() {
            return ProcessCameraProviderWrapper.this;
        }
    }

    public final tryToComplete source(tryToComplete p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new TuitionPaymentFragmentbindingInflater1(p0);
    }

    public final <T> T withTimeout(Function0<? extends T> p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        enter();
        try {
            try {
                T tInvoke = p0.invoke();
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                return tInvoke;
            } catch (IOException e2) {
                e = e2;
                if (exit()) {
                    e = access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            exit();
            throw th;
        }
    }

    public final IOException access$newTimeoutException(IOException p0) {
        return newTimeoutException(p0);
    }

    protected IOException newTimeoutException(IOException p0) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (p0 != null) {
            interruptedIOException.initCause(p0);
        }
        return interruptedIOException;
    }

    static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    ReentrantLock lock = ProcessCameraProviderWrapper.Companion.getLock();
                    lock.lock();
                    try {
                        Companion companion = ProcessCameraProviderWrapper.Companion;
                        ProcessCameraProviderWrapper processCameraProviderWrapper = ProcessCameraProviderWrapper.head;
                        Intrinsics.checkNotNull(processCameraProviderWrapper);
                        ProcessCameraProviderWrapper processCameraProviderWrapper2 = processCameraProviderWrapper.next;
                        if (processCameraProviderWrapper2 != null) {
                            long jRemainingNanos = processCameraProviderWrapper2.remainingNanos(System.nanoTime());
                            if (jRemainingNanos <= 0) {
                                ProcessCameraProviderWrapper processCameraProviderWrapper3 = ProcessCameraProviderWrapper.head;
                                Intrinsics.checkNotNull(processCameraProviderWrapper3);
                                processCameraProviderWrapper3.next = processCameraProviderWrapper2.next;
                                processCameraProviderWrapper2.next = null;
                                processCameraProviderWrapper2.state = 2;
                            } else {
                                companion.getCondition().await(jRemainingNanos, TimeUnit.NANOSECONDS);
                            }
                        } else {
                            long jNanoTime = System.nanoTime();
                            companion.getCondition().await(ProcessCameraProviderWrapper.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                            ProcessCameraProviderWrapper processCameraProviderWrapper4 = ProcessCameraProviderWrapper.head;
                            Intrinsics.checkNotNull(processCameraProviderWrapper4);
                            processCameraProviderWrapper2 = (processCameraProviderWrapper4.next != null || System.nanoTime() - jNanoTime < ProcessCameraProviderWrapper.IDLE_TIMEOUT_NANOS) ? null : ProcessCameraProviderWrapper.head;
                        }
                        if (processCameraProviderWrapper2 == ProcessCameraProviderWrapper.head) {
                            Companion unused = ProcessCameraProviderWrapper.Companion;
                            ProcessCameraProviderWrapper.head = null;
                            return;
                        } else {
                            Unit unit = Unit.INSTANCE;
                            lock.unlock();
                            if (processCameraProviderWrapper2 != null) {
                                processCameraProviderWrapper2.timedOut();
                            }
                        }
                    } finally {
                        lock.unlock();
                    }
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"LProcessCameraProviderWrapper$Companion;", "", "<init>", "()V", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "STATE_CANCELED", "I", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "TIMEOUT_WRITE_SIZE", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "LProcessCameraProviderWrapper;", "head", "LProcessCameraProviderWrapper;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public final ReentrantLock getLock() {
            return ProcessCameraProviderWrapper.lock;
        }

        public final Condition getCondition() {
            return ProcessCameraProviderWrapper.condition;
        }

        public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Companion companion, ProcessCameraProviderWrapper processCameraProviderWrapper, long j, boolean z) {
            if (ProcessCameraProviderWrapper.head == null) {
                ProcessCameraProviderWrapper.head = new ProcessCameraProviderWrapper();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z) {
                processCameraProviderWrapper.timeoutAt = Math.min(j, processCameraProviderWrapper.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                processCameraProviderWrapper.timeoutAt = j + jNanoTime;
            } else if (z) {
                processCameraProviderWrapper.timeoutAt = processCameraProviderWrapper.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long jRemainingNanos = processCameraProviderWrapper.remainingNanos(jNanoTime);
            ProcessCameraProviderWrapper processCameraProviderWrapper2 = ProcessCameraProviderWrapper.head;
            Intrinsics.checkNotNull(processCameraProviderWrapper2);
            while (processCameraProviderWrapper2.next != null) {
                ProcessCameraProviderWrapper processCameraProviderWrapper3 = processCameraProviderWrapper2.next;
                Intrinsics.checkNotNull(processCameraProviderWrapper3);
                if (jRemainingNanos < processCameraProviderWrapper3.remainingNanos(jNanoTime)) {
                    break;
                }
                processCameraProviderWrapper2 = processCameraProviderWrapper2.next;
                Intrinsics.checkNotNull(processCameraProviderWrapper2);
            }
            processCameraProviderWrapper.next = processCameraProviderWrapper2.next;
            processCameraProviderWrapper2.next = processCameraProviderWrapper;
            if (processCameraProviderWrapper2 == ProcessCameraProviderWrapper.head) {
                companion.getCondition().signal();
            }
        }

        public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ProcessCameraProviderWrapper processCameraProviderWrapper) {
            for (ProcessCameraProviderWrapper processCameraProviderWrapper2 = ProcessCameraProviderWrapper.head; processCameraProviderWrapper2 != null; processCameraProviderWrapper2 = processCameraProviderWrapper2.next) {
                if (processCameraProviderWrapper2.next == processCameraProviderWrapper) {
                    processCameraProviderWrapper2.next = processCameraProviderWrapper.next;
                    processCameraProviderWrapper.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue".toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }
}
