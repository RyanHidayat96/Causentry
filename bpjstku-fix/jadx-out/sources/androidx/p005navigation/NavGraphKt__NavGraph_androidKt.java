package androidx.p005navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/navigation/NavGraph;", "", "p0", "Landroidx/navigation/NavDestination;", "get", "(Landroidx/navigation/NavGraph;I)Landroidx/navigation/NavDestination;", "", "contains", "(Landroidx/navigation/NavGraph;I)Z"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavGraphKt")
final /* synthetic */ class NavGraphKt__NavGraph_androidKt {
    public static final NavDestination get(NavGraph navGraph, int i) {
        Intrinsics.checkNotNullParameter(navGraph, "");
        NavDestination navDestinationFindNode = navGraph.findNode(i);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        StringBuilder sb = new StringBuilder("No destination for ");
        sb.append(i);
        sb.append(" was found in ");
        sb.append(navGraph);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final boolean contains(NavGraph navGraph, int i) {
        Intrinsics.checkNotNullParameter(navGraph, "");
        return navGraph.findNode(i) != null;
    }
}
