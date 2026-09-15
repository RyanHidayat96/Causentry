package androidx.p010navigationevent;

import androidx.core.viewtree.ViewTree;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.navigationevent.ViewTreeNavigationEventDispatcherOwner, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "Landroidx/navigationevent/NavigationEventDispatcherOwner;", "p0", "", "set", "(Landroid/view/View;Landroidx/navigationevent/NavigationEventDispatcherOwner;)V", "get", "(Landroid/view/View;)Landroidx/navigationevent/NavigationEventDispatcherOwner;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class View {
    public static final void set(android.view.View view, NavigationEventDispatcherOwner navigationEventDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setTag(R.id.view_tree_navigation_event_dispatcher_owner, navigationEventDispatcherOwner);
    }

    public static final NavigationEventDispatcherOwner get(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            NavigationEventDispatcherOwner navigationEventDispatcherOwner = tag instanceof NavigationEventDispatcherOwner ? (NavigationEventDispatcherOwner) tag : null;
            if (navigationEventDispatcherOwner != null) {
                return navigationEventDispatcherOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof android.view.View ? (android.view.View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }
}
