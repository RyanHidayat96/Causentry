package androidx.p005navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.p002lifecycle.Lifecycle;
import androidx.p005navigation.p008internal.NavBackStackEntryStateImpl;
import androidx.p005navigation.p008internal.NavContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0013\u0010\t\u001a\u00060\u0006j\u0002`\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\u0003\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001f\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\nR\u0015\u0010!\u001a\u00060\u0006j\u0002`\u00078G¢\u0006\u0006\u001a\u0004\b \u0010\nR\u0014\u0010#\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "", "Landroidx/navigation/NavBackStackEntry;", "p0", "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "(Landroid/os/Bundle;)V", "writeToState", "()Landroid/os/Bundle;", "Landroidx/navigation/internal/NavContext;", "Landroidx/navigation/NavDestination;", "p1", "Landroidx/lifecycle/Lifecycle$State;", "p2", "Landroidx/navigation/NavControllerViewModel;", "p3", "instantiate", "(Landroidx/navigation/internal/NavContext;Landroidx/navigation/NavDestination;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavControllerViewModel;)Landroidx/navigation/NavBackStackEntry;", "prepareArgs", "(Landroid/os/Bundle;Landroidx/navigation/internal/NavContext;)Landroid/os/Bundle;", "", "getId", "()Ljava/lang/String;", "id", "", "getDestinationId", "()I", "destinationId", "getArgs", "args", "getSavedState", "savedState", "Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "impl", "Landroidx/navigation/internal/NavBackStackEntryStateImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavBackStackEntryState {
    private final NavBackStackEntryStateImpl impl;

    public final String getId() {
        return this.impl.getId();
    }

    public final int getDestinationId() {
        return this.impl.getDestinationId();
    }

    public final Bundle getArgs() {
        return this.impl.getArgs();
    }

    public final Bundle getSavedState() {
        return this.impl.getSavedState();
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        this.impl = new NavBackStackEntryStateImpl(navBackStackEntry, navBackStackEntry.getDestination().getId());
    }

    public NavBackStackEntryState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.setClassLoader(getClass().getClassLoader());
        this.impl = new NavBackStackEntryStateImpl(bundle);
    }

    public final Bundle writeToState() {
        return this.impl.writeToState$navigation_runtime_release();
    }

    public final NavBackStackEntry instantiate(NavContext p0, NavDestination p1, Lifecycle.State p2, NavControllerViewModel p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Bundle args = getArgs();
        return this.impl.instantiate(p0, p1, args != null ? prepareArgs(args, p0) : null, p2, p3);
    }

    public final Bundle prepareArgs(Bundle p0, NavContext p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Context context = p1.getContext();
        p0.setClassLoader(context != null ? context.getClassLoader() : null);
        return p0;
    }
}
