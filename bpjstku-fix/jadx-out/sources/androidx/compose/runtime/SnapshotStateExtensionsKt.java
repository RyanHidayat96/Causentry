package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/State;", "", "Landroidx/compose/runtime/IntState;", "asIntState", "(Landroidx/compose/runtime/State;)Landroidx/compose/runtime/IntState;", "", "Landroidx/compose/runtime/LongState;", "asLongState", "(Landroidx/compose/runtime/State;)Landroidx/compose/runtime/LongState;", "", "Landroidx/compose/runtime/FloatState;", "asFloatState", "(Landroidx/compose/runtime/State;)Landroidx/compose/runtime/FloatState;", "", "Landroidx/compose/runtime/DoubleState;", "asDoubleState", "(Landroidx/compose/runtime/State;)Landroidx/compose/runtime/DoubleState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SnapshotStateExtensionsKt {
    public static final IntState asIntState(State<Integer> state) {
        return state instanceof IntState ? (IntState) state : new UnboxedIntState(state);
    }

    public static final LongState asLongState(State<Long> state) {
        return state instanceof LongState ? (LongState) state : new UnboxedLongState(state);
    }

    public static final FloatState asFloatState(State<Float> state) {
        return state instanceof FloatState ? (FloatState) state : new UnboxedFloatState(state);
    }

    public static final DoubleState asDoubleState(State<Double> state) {
        return state instanceof DoubleState ? (DoubleState) state : new UnboxedDoubleState(state);
    }
}
