package defpackage;

import androidx.compose.animation.core.AnimationKt;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0012\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u001f\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"LcancelPreviousRequest;", "", "<init>", "()V", "Ljava/util/concurrent/locks/Condition;", "p0", "", "awaitSignal", "(Ljava/util/concurrent/locks/Condition;)V", "cancel", "clearDeadline", "()LcancelPreviousRequest;", "clearTimeout", "", "Ljava/util/concurrent/TimeUnit;", "p1", "deadline", "(JLjava/util/concurrent/TimeUnit;)LcancelPreviousRequest;", "deadlineNanoTime", "()J", "(J)LcancelPreviousRequest;", "", "hasDeadline", "()Z", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "intersectWith", "(LcancelPreviousRequest;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "throwIfReached", "timeout", "timeoutNanos", "waitUntilNotified", "(Ljava/lang/Object;)V", "cancelMark", "Ljava/lang/Object;", "J", "Z", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class cancelPreviousRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final cancelPreviousRequest NONE = new TuitionPaymentFragmentbindingInflater1();
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public cancelPreviousRequest timeout(long p0, TimeUnit p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(p0)).toString());
        }
        this.timeoutNanos = p1.toNanos(p0);
        return this;
    }

    /* JADX INFO: renamed from: timeoutNanos, reason: from getter */
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    /* JADX INFO: renamed from: hasDeadline, reason: from getter */
    public boolean getHasDeadline() {
        return this.hasDeadline;
    }

    public long deadlineNanoTime() {
        if (!this.hasDeadline) {
            throw new IllegalStateException("No deadline".toString());
        }
        return this.deadlineNanoTime;
    }

    public cancelPreviousRequest deadlineNanoTime(long p0) {
        this.hasDeadline = true;
        this.deadlineNanoTime = p0;
        return this;
    }

    public final cancelPreviousRequest deadline(long p0, TimeUnit p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 <= 0) {
            throw new IllegalArgumentException("duration <= 0: ".concat(String.valueOf(p0)).toString());
        }
        return deadlineNanoTime(System.nanoTime() + p1.toNanos(p0));
    }

    public cancelPreviousRequest clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public cancelPreviousRequest clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public void awaitSignal(Condition p0) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                p0.await();
                return;
            }
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (timeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.cancelMark;
            if (p0.awaitNanos(timeoutNanos) <= 0 && this.cancelMark == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void waitUntilNotified(Object p0) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                p0.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - jNanoTime;
            }
            if (timeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.cancelMark;
            long j = timeoutNanos / AnimationKt.MillisToNanos;
            p0.wait(j, (int) (timeoutNanos - (AnimationKt.MillisToNanos * j)));
            if (System.nanoTime() - jNanoTime >= timeoutNanos && this.cancelMark == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public final <T> T intersectWith(cancelPreviousRequest p0, Function0<? extends T> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        long timeoutNanos = getTimeoutNanos();
        timeout(Companion.b(p0.getTimeoutNanos(), getTimeoutNanos()), TimeUnit.NANOSECONDS);
        if (getHasDeadline()) {
            long jDeadlineNanoTime = deadlineNanoTime();
            if (p0.getHasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), p0.deadlineNanoTime()));
            }
            try {
                return p1.invoke();
            } finally {
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (p0.getHasDeadline()) {
                    deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }
        if (p0.getHasDeadline()) {
            deadlineNanoTime(p0.deadlineNanoTime());
        }
        try {
            return p1.invoke();
        } finally {
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (p0.getHasDeadline()) {
                clearDeadline();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"LcancelPreviousRequest$Companion;", "", "<init>", "()V", "", "p0", "p1", "b", "(JJ)J", "LcancelPreviousRequest;", "NONE", "LcancelPreviousRequest;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static long b(long p0, long p1) {
            return (p0 == 0 || (p1 != 0 && p0 >= p1)) ? p1 : p0;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends cancelPreviousRequest {
        @Override // defpackage.cancelPreviousRequest
        public final void throwIfReached() {
        }

        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // defpackage.cancelPreviousRequest
        public final cancelPreviousRequest timeout(long j, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "");
            return this;
        }

        @Override // defpackage.cancelPreviousRequest
        public final cancelPreviousRequest deadlineNanoTime(long j) {
            return this;
        }
    }
}
