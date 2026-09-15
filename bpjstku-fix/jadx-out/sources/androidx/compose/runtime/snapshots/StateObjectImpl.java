package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/StateObject;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/ReaderKind;", "p0", "", "recordReadIn-h_f27i8$runtime", "(I)V", "recordReadIn", "", "isReadIn-h_f27i8$runtime", "(I)Z", "isReadIn", "Landroidx/compose/runtime/internal/AtomicInt;", "readerKind", "Landroidx/compose/runtime/internal/AtomicInt;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 8;
    private final AtomicInt readerKind = new AtomicInt(0);

    /* JADX INFO: renamed from: recordReadIn-h_f27i8$runtime, reason: not valid java name */
    public final void m3695recordReadInh_f27i8$runtime(int p0) {
        int iM3677constructorimpl;
        do {
            iM3677constructorimpl = ReaderKind.m3677constructorimpl(this.readerKind.get());
            if ((iM3677constructorimpl & p0) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(iM3677constructorimpl, ReaderKind.m3677constructorimpl(iM3677constructorimpl | p0)));
    }

    /* JADX INFO: renamed from: isReadIn-h_f27i8$runtime, reason: not valid java name */
    public final boolean m3694isReadInh_f27i8$runtime(int p0) {
        return (p0 & ReaderKind.m3677constructorimpl(this.readerKind.get())) != 0;
    }
}
