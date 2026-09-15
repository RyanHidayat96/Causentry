package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/runtime/Invalidation;", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "p0", "", "p1", "p2", "<init>", "(Landroidx/compose/runtime/RecomposeScopeImpl;ILjava/lang/Object;)V", "", "isInvalid", "()Z", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getScope", "()Landroidx/compose/runtime/RecomposeScopeImpl;", FirebaseAnalytics.Param.LOCATION, "I", "getLocation", "()I", "setLocation", "(I)V", "instances", "Ljava/lang/Object;", "getInstances", "()Ljava/lang/Object;", "setInstances", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Invalidation {
    private Object instances;
    private int location;
    private final RecomposeScopeImpl scope;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i, Object obj) {
        this.scope = recomposeScopeImpl;
        this.location = i;
        this.instances = obj;
    }

    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final int getLocation() {
        return this.location;
    }

    public final void setLocation(int i) {
        this.location = i;
    }

    public final Object getInstances() {
        return this.instances;
    }

    public final void setInstances(Object obj) {
        this.instances = obj;
    }

    public final boolean isInvalid() {
        return this.scope.isInvalidFor(this.instances);
    }
}
