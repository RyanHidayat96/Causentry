package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0001H\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00018\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"LScreenFlashViewExternalSyntheticLambda0;", "LcancelPreviousRequest;", "p0", "<init>", "(LcancelPreviousRequest;)V", "Ljava/util/concurrent/locks/Condition;", "", "awaitSignal", "(Ljava/util/concurrent/locks/Condition;)V", "cancel", "()V", "clearDeadline", "()LcancelPreviousRequest;", "clearTimeout", "", "deadlineNanoTime", "()J", "(J)LcancelPreviousRequest;", "", "hasDeadline", "()Z", "throwIfReached", "Ljava/util/concurrent/TimeUnit;", "p1", "timeout", "(JLjava/util/concurrent/TimeUnit;)LcancelPreviousRequest;", "timeoutNanos", "", "waitUntilNotified", "(Ljava/lang/Object;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LcancelPreviousRequest;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ScreenFlashViewExternalSyntheticLambda0 extends cancelPreviousRequest {
    public cancelPreviousRequest TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ScreenFlashViewExternalSyntheticLambda0(cancelPreviousRequest cancelpreviousrequest) {
        Intrinsics.checkNotNullParameter(cancelpreviousrequest, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancelpreviousrequest;
    }

    @Override // defpackage.cancelPreviousRequest
    public cancelPreviousRequest timeout(long p0, TimeUnit p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.timeout(p0, p1);
    }

    @Override // defpackage.cancelPreviousRequest
    /* JADX INFO: renamed from: timeoutNanos */
    public long getTimeoutNanos() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTimeoutNanos();
    }

    @Override // defpackage.cancelPreviousRequest
    /* JADX INFO: renamed from: hasDeadline */
    public boolean getHasDeadline() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getHasDeadline();
    }

    @Override // defpackage.cancelPreviousRequest
    public long deadlineNanoTime() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.deadlineNanoTime();
    }

    @Override // defpackage.cancelPreviousRequest
    public cancelPreviousRequest deadlineNanoTime(long p0) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.deadlineNanoTime(p0);
    }

    @Override // defpackage.cancelPreviousRequest
    public cancelPreviousRequest clearTimeout() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clearTimeout();
    }

    @Override // defpackage.cancelPreviousRequest
    public cancelPreviousRequest clearDeadline() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clearDeadline();
    }

    @Override // defpackage.cancelPreviousRequest
    public void throwIfReached() throws IOException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.throwIfReached();
    }

    @Override // defpackage.cancelPreviousRequest
    public void cancel() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
    }

    @Override // defpackage.cancelPreviousRequest
    public void awaitSignal(Condition p0) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(p0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.awaitSignal(p0);
    }

    @Override // defpackage.cancelPreviousRequest
    public void waitUntilNotified(Object p0) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(p0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.waitUntilNotified(p0);
    }
}
