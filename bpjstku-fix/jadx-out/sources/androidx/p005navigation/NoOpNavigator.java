package androidx.p005navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Navigator.Name("NoOp")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/NoOpNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "<init>", "()V", "createDestination", "()Landroidx/navigation/NavDestination;", "p0", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p1", "Landroidx/navigation/NavOptions;", "p2", "Landroidx/navigation/Navigator$Extras;", "p3", "navigate", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "", "popBackStack", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoOpNavigator extends Navigator<NavDestination> {
    @Override // androidx.p005navigation.Navigator
    public final boolean popBackStack() {
        return true;
    }

    public NoOpNavigator() {
        super("NoOp");
    }

    @Override // androidx.p005navigation.Navigator
    public final NavDestination createDestination() {
        return new NavDestination(this);
    }

    @Override // androidx.p005navigation.Navigator
    public final NavDestination navigate(NavDestination p0, Bundle p1, NavOptions p2, Navigator.Extras p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0;
    }
}
