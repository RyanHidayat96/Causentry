package androidx.room.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Landroidx/room/concurrent/CloseBarrier;", "", "Landroidx/room/concurrent/SynchronizedObject;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "block$room_runtime_release", "()Z", "unblock$room_runtime_release", "()V", "close$room_runtime_release", "closeAction", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "blockers", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/TuitionPaymentFragmentbindingInflater1;", "closeInitiated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CloseBarrier {
    private final AtomicInteger blockers;
    private final Function0<Unit> closeAction;
    private final AtomicBoolean closeInitiated;

    public CloseBarrier(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.closeAction = function0;
        this.blockers = new AtomicInteger(0);
        this.closeInitiated = new AtomicBoolean(false);
    }

    private final boolean isClosed() {
        return this.closeInitiated.get();
    }

    public final boolean block$room_runtime_release() {
        synchronized (this) {
            if (isClosed()) {
                return false;
            }
            this.blockers.incrementAndGet();
            return true;
        }
    }

    public final void unblock$room_runtime_release() {
        synchronized (this) {
            this.blockers.decrementAndGet();
            if (this.blockers.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void close$room_runtime_release() {
        synchronized (this) {
            if (this.closeInitiated.compareAndSet(false, true)) {
                Unit unit = Unit.INSTANCE;
                while (this.blockers.get() != 0) {
                }
                this.closeAction.invoke();
            }
        }
    }
}
