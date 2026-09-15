package androidx.compose.runtime;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\fJ:\u0010\u0019\u001a\u00020\b2\u001f\u0010\u0003\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\b0\u0016¢\u0006\u0002\b\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010#\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "p0", "", "p1", "<init>", "(Landroidx/compose/runtime/Applier;I)V", "", EnabledPayment.STATUS_DOWN, "(Ljava/lang/Object;)V", EnabledPayment.STATUS_UP, "()V", "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", "remove", "(II)V", "p2", "move", "(III)V", "clear", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "apply", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "reuse", "applier", "Landroidx/compose/runtime/Applier;", TypedValues.CycleType.S_WAVE_OFFSET, "I", "nesting", "getCurrent", "()Ljava/lang/Object;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 8;
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(Applier<N> applier, int i) {
        this.applier = applier;
        this.offset = i;
    }

    @Override // androidx.compose.runtime.Applier
    public final N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public final void down(N p0) {
        this.nesting++;
        this.applier.down(p0);
    }

    @Override // androidx.compose.runtime.Applier
    public final void up() {
        if (this.nesting <= 0) {
            ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.up();
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int p0, N p1) {
        this.applier.insertTopDown(p0 + (this.nesting == 0 ? this.offset : 0), p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int p0, N p1) {
        this.applier.insertBottomUp(p0 + (this.nesting == 0 ? this.offset : 0), p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int p0, int p1) {
        this.applier.remove(p0 + (this.nesting == 0 ? this.offset : 0), p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int p0, int p1, int p2) {
        int i = this.nesting == 0 ? this.offset : 0;
        this.applier.move(p0 + i, p1 + i, p2);
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.Applier
    public final void apply(Function2<? super N, Object, Unit> p0, Object p1) {
        this.applier.apply(p0, p1);
    }

    @Override // androidx.compose.runtime.Applier
    public final void reuse() {
        this.applier.reuse();
    }
}
