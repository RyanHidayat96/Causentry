package androidx.p002lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "p0", "Landroidx/lifecycle/Lifecycle$State;", "p1", "p2", "", "checkLifecycleStateTransition", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/Lifecycle$State;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LifecycleRegistryKt {
    public static final void checkLifecycleStateTransition(LifecycleOwner lifecycleOwner, Lifecycle.State state, Lifecycle.State state2) {
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(state2, "");
        if (state == Lifecycle.State.INITIALIZED && state2 == Lifecycle.State.DESTROYED) {
            StringBuilder sb = new StringBuilder("State must be at least '");
            sb.append(Lifecycle.State.CREATED);
            sb.append("' to be moved to '");
            sb.append(state2);
            sb.append("' in component ");
            sb.append(lifecycleOwner);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (state != Lifecycle.State.DESTROYED || state == state2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("State is '");
        sb2.append(Lifecycle.State.DESTROYED);
        sb2.append("' and cannot be moved to `");
        sb2.append(state2);
        sb2.append("` in component ");
        sb2.append(lifecycleOwner);
        throw new IllegalStateException(sb2.toString().toString());
    }
}
