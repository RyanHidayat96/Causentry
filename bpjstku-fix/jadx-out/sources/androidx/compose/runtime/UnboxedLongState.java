package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/UnboxedLongState;", "Landroidx/compose/runtime/LongState;", "Landroidx/compose/runtime/State;", "", "p0", "<init>", "(Landroidx/compose/runtime/State;)V", "", "toString", "()Ljava/lang/String;", "baseState", "Landroidx/compose/runtime/State;", "getLongValue", "()J", "longValue", "getValue", "()Ljava/lang/Long;", "value"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnboxedLongState implements LongState {
    public static final int $stable = 0;
    private final State<Long> baseState;

    public UnboxedLongState(State<Long> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.LongState
    public final long getLongValue() {
        return this.baseState.getValue().longValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    public final Long getValue() {
        return this.baseState.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnboxedLongState(baseState=");
        sb.append(this.baseState);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
