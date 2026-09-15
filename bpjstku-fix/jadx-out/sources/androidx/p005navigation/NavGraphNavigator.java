package androidx.p005navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import defpackage.stopMediaCodec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Navigator.Name("navigation")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "p0", "<init>", "(Landroidx/navigation/NavigatorProvider;)V", "createDestination", "()Landroidx/navigation/NavGraph;", "", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/NavOptions;", "p1", "Landroidx/navigation/Navigator$Extras;", "p2", "", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "LstopMediaCodec;", "getBackStack", "()LstopMediaCodec;", "backStack", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavGraphNavigator extends Navigator<NavGraph> {
    public static final String NAME = "navigation";
    private final NavigatorProvider navigatorProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        super("navigation");
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        this.navigatorProvider = navigatorProvider;
    }

    public final stopMediaCodec<List<NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    @Override // androidx.p005navigation.Navigator
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    @Override // androidx.p005navigation.Navigator
    public void navigate(List<NavBackStackEntry> p0, NavOptions p1, Navigator.Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<NavBackStackEntry> it = p0.iterator();
        while (it.hasNext()) {
            navigate(it.next(), p1, p2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, android.os.Bundle] */
    private final void navigate(NavBackStackEntry p0, NavOptions p1, Navigator.Extras p2) {
        NavDestination navDestinationFindNode;
        Pair[] pairArr;
        NavDestination destination = p0.getDestination();
        Intrinsics.checkNotNull(destination, "");
        NavGraph navGraph = (NavGraph) destination;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = p0.getArguments();
        int startDestinationId = navGraph.getStartDestinationId();
        String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (startDestinationId == 0 && startDestinationRoute == null) {
            StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
            sb.append(navGraph.getDisplayName());
            throw new IllegalStateException(sb.toString().toString());
        }
        if (startDestinationRoute != null) {
            navDestinationFindNode = navGraph.findNode(startDestinationRoute, false);
        } else {
            navDestinationFindNode = navGraph.getNodes().get(startDestinationId);
        }
        if (navDestinationFindNode == null) {
            String startDestDisplayName = navGraph.getStartDestDisplayName();
            StringBuilder sb2 = new StringBuilder("navigation destination ");
            sb2.append(startDestDisplayName);
            sb2.append(" is not a direct child of this NavGraph");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (startDestinationRoute != null) {
            if (!Intrinsics.areEqual(startDestinationRoute, navDestinationFindNode.getRoute())) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = navDestinationFindNode.matchRoute(startDestinationRoute);
                Bundle matchingArgs = deepLinkMatchMatchRoute != null ? deepLinkMatchMatchRoute.getMatchingArgs() : null;
                if (matchingArgs != null && !SavedStateReader.m7446isEmptyimpl(SavedStateReader.m7368constructorimpl(matchingArgs))) {
                    Map mapEmptyMap = MapsKt.emptyMap();
                    if (mapEmptyMap.isEmpty()) {
                        pairArr = new Pair[0];
                    } else {
                        ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                        for (Map.Entry entry : mapEmptyMap.entrySet()) {
                            arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                        }
                        pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    }
                    ?? BundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(BundleOf);
                    SavedStateWriter.m7458putAllimpl(bundleM7454constructorimpl, matchingArgs);
                    Bundle bundle = (Bundle) objectRef.element;
                    if (bundle != null) {
                        SavedStateWriter.m7458putAllimpl(bundleM7454constructorimpl, bundle);
                    }
                    objectRef.element = BundleOf;
                }
            }
            if (!navDestinationFindNode.getArguments().isEmpty()) {
                List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(navDestinationFindNode.getArguments(), new Function1() { // from class: androidx.navigation.NavGraphNavigator$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(NavGraphNavigator.navigate$lambda$6(objectRef, (String) obj));
                    }
                });
                if (!listMissingRequiredArguments.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder("Cannot navigate to startDestination ");
                    sb3.append(navDestinationFindNode);
                    sb3.append(". Missing required arguments [");
                    sb3.append(listMissingRequiredArguments);
                    sb3.append(']');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
            }
        }
        this.navigatorProvider.getNavigator(navDestinationFindNode.getNavigatorName()).navigate(CollectionsKt.listOf(getState().createBackStackEntry(navDestinationFindNode, navDestinationFindNode.addInDefaultArgs((Bundle) objectRef.element))), p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean navigate$lambda$6(Ref.ObjectRef objectRef, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return objectRef.element == null || !SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl((Bundle) objectRef.element), str);
    }
}
