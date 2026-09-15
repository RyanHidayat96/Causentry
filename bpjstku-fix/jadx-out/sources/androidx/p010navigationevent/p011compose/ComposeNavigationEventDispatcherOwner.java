package androidx.p010navigationevent.p011compose;

import androidx.p010navigationevent.NavigationEventDispatcher;
import androidx.p010navigationevent.NavigationEventDispatcherOwner;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/navigationevent/compose/ComposeNavigationEventDispatcherOwner;", "Landroidx/navigationevent/NavigationEventDispatcherOwner;", "Landroidx/navigationevent/NavigationEventDispatcher;", "p0", "<init>", "(Landroidx/navigationevent/NavigationEventDispatcher;)V", "navigationEventDispatcher", "Landroidx/navigationevent/NavigationEventDispatcher;", "getNavigationEventDispatcher", "()Landroidx/navigationevent/NavigationEventDispatcher;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ComposeNavigationEventDispatcherOwner implements NavigationEventDispatcherOwner {
    private final NavigationEventDispatcher navigationEventDispatcher;

    public ComposeNavigationEventDispatcherOwner(NavigationEventDispatcher navigationEventDispatcher) {
        this.navigationEventDispatcher = navigationEventDispatcher;
    }

    @Override // androidx.p010navigationevent.NavigationEventDispatcherOwner
    public final NavigationEventDispatcher getNavigationEventDispatcher() {
        return this.navigationEventDispatcher;
    }
}
