package androidx.p005navigation.p008internal;

import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.NavArgument;
import androidx.p005navigation.NavDeepLinkRequest;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.NavGraph;
import androidx.p005navigation.p009serialization.RouteSerializerKt;
import defpackage.CameraController2;
import defpackage.updateMirroringFlagInOutputFileOptions;
import defpackage.updatePreviewViewTransform;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\u00020\u00152\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u001b\"\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u001e\u0010\"J\u001d\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030#H\u0000¢\u0006\u0004\b\u001e\u0010$J!\u0010\u001e\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010%2\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u001e\u0010&J!\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u001e\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0(H\u0001¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b+\u0010\u0005J\u0017\u0010,\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u0010\u0017J\u000f\u0010-\u001a\u00020\u0015H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0001¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u001dH\u0000¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b1\u00103J'\u00101\u001a\u00020\u0015\"\b\b\u0000\u0010%*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0000¢\u0006\u0004\b1\u00104J!\u00101\u001a\u00020\u0015\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b1\u00105J7\u00101\u001a\u00020\u0015\"\u0004\b\u0000\u0010%2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000607H\u0000¢\u0006\u0004\b1\u00108R\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010>\u001a\b\u0012\u0004\u0012\u00020\n0=8AX\u0081\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\"\u0010B\u001a\u00020\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u00102R$\u0010G\u001a\u0004\u0018\u00010\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u00103R$\u0010N\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\bL\u0010E\"\u0004\bM\u00102R.\u0010O\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00068\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\bO\u0010H\u001a\u0004\bP\u0010J\"\u0004\bQ\u00103R\u0014\u0010S\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010J"}, d2 = {"Landroidx/navigation/internal/NavGraphImpl;", "", "Landroidx/navigation/NavGraph;", "p0", "<init>", "(Landroidx/navigation/NavGraph;)V", "", "", "p1", "p2", "Landroidx/navigation/NavDestination;", "p3", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive$navigation_common_release", "(Ljava/lang/String;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "p4", "matchDeepLinkComprehensive$navigation_common_release", "(Landroidx/navigation/NavDestination$DeepLinkMatch;Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink$navigation_common_release", "(Landroidx/navigation/NavDestination$DeepLinkMatch;Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "addDestination$navigation_common_release", "(Landroidx/navigation/NavDestination;)V", "", "addDestinations$navigation_common_release", "(Ljava/util/Collection;)V", "", "([Landroidx/navigation/NavDestination;)V", "", "findNode$navigation_common_release", "(I)Landroidx/navigation/NavDestination;", "findNodeComprehensive$navigation_common_release", "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Landroidx/navigation/NavDestination;", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator$navigation_common_release", "()Ljava/util/Iterator;", "addAll$navigation_common_release", "remove$navigation_common_release", "clear$navigation_common_release", "()V", "getDisplayName$navigation_common_release", "(Ljava/lang/String;)Ljava/lang/String;", "setStartDestination$navigation_common_release", "(I)V", "(Ljava/lang/String;)V", "(Lkotlin/reflect/KClass;)V", "(Ljava/lang/Object;)V", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/Function1;", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;Lkotlin/jvm/functions/Function1;)V", "graph", "Landroidx/navigation/NavGraph;", "getGraph", "()Landroidx/navigation/NavGraph;", "Landroidx/collection/SparseArrayCompat;", "nodes", "Landroidx/collection/SparseArrayCompat;", "getNodes$navigation_common_release", "()Landroidx/collection/SparseArrayCompat;", "startDestId", "I", "getStartDestId$navigation_common_release", "()I", "setStartDestId$navigation_common_release", "startDestIdName", "Ljava/lang/String;", "getStartDestIdName$navigation_common_release", "()Ljava/lang/String;", "setStartDestIdName$navigation_common_release", "getStartDestinationId$navigation_common_release", "setStartDestinationId$navigation_common_release", "startDestinationId", "startDestinationRoute", "getStartDestinationRoute$navigation_common_release", "setStartDestinationRoute$navigation_common_release", "getStartDestDisplayName$navigation_common_release", "startDestDisplayName"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavGraphImpl {
    private final NavGraph graph;
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;
    private String startDestIdName;
    private String startDestinationRoute;

    public NavGraphImpl(NavGraph navGraph) {
        Intrinsics.checkNotNullParameter(navGraph, "");
        this.graph = navGraph;
        this.nodes = new SparseArrayCompat<>(0, 1, null);
    }

    public final NavGraph getGraph() {
        return this.graph;
    }

    public final SparseArrayCompat<NavDestination> getNodes$navigation_common_release() {
        return this.nodes;
    }

    /* JADX INFO: renamed from: getStartDestId$navigation_common_release, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    public final void setStartDestId$navigation_common_release(int i) {
        this.startDestId = i;
    }

    /* JADX INFO: renamed from: getStartDestIdName$navigation_common_release, reason: from getter */
    public final String getStartDestIdName() {
        return this.startDestIdName;
    }

    public final void setStartDestIdName$navigation_common_release(String str) {
        this.startDestIdName = str;
    }

    public final NavDestination.DeepLinkMatch matchRouteComprehensive$navigation_common_release(String p0, boolean p1, boolean p2, NavDestination p3) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p3, "");
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute2 = this.graph.matchRoute(p0);
        NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive = null;
        if (p1) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : navGraph) {
                if (Intrinsics.areEqual(navDestination, p3)) {
                    deepLinkMatchMatchRoute = null;
                } else if (navDestination instanceof NavGraph) {
                    deepLinkMatchMatchRoute = ((NavGraph) navDestination).matchRouteComprehensive(p0, true, false, this.graph);
                } else {
                    deepLinkMatchMatchRoute = navDestination.matchRoute(p0);
                }
                if (deepLinkMatchMatchRoute != null) {
                    arrayList.add(deepLinkMatchMatchRoute);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && p2 && !Intrinsics.areEqual(parent, p3)) {
            deepLinkMatchMatchRouteComprehensive = parent.matchRouteComprehensive(p0, p1, true, this.graph);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new NavDestination.DeepLinkMatch[]{deepLinkMatchMatchRoute2, deepLinkMatch, deepLinkMatchMatchRouteComprehensive}));
    }

    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive$navigation_common_release(NavDestination.DeepLinkMatch p0, NavDeepLinkRequest p1, boolean p2, boolean p3, NavDestination p4) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p4, "");
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = null;
        if (p2) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : navGraph) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = !Intrinsics.areEqual(navDestination, p4) ? navDestination.matchDeepLink(p1) : null;
                if (deepLinkMatchMatchDeepLink != null) {
                    arrayList.add(deepLinkMatchMatchDeepLink);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && p3 && !Intrinsics.areEqual(parent, p4)) {
            deepLinkMatchMatchDeepLinkComprehensive = parent.matchDeepLinkComprehensive(p1, p2, true, this.graph);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new NavDestination.DeepLinkMatch[]{p0, deepLinkMatch, deepLinkMatchMatchDeepLinkComprehensive}));
    }

    public final NavDestination.DeepLinkMatch matchDeepLink$navigation_common_release(NavDestination.DeepLinkMatch p0, NavDeepLinkRequest p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return matchDeepLinkComprehensive$navigation_common_release(p0, p1, true, false, this.graph);
    }

    public final void addDestination$navigation_common_release(NavDestination p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int id2 = p0.getId();
        String route = p0.getRoute();
        if (id2 == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (this.graph.getRoute() != null && Intrinsics.areEqual(route, this.graph.getRoute())) {
            StringBuilder sb = new StringBuilder("Destination ");
            sb.append(p0);
            sb.append(" cannot have the same route as graph ");
            sb.append(this.graph);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (id2 == this.graph.getId()) {
            StringBuilder sb2 = new StringBuilder("Destination ");
            sb2.append(p0);
            sb2.append(" cannot have the same id as graph ");
            sb2.append(this.graph);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        NavDestination navDestination = this.nodes.get(id2);
        if (navDestination == p0) {
            return;
        }
        if (p0.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (navDestination != null) {
            navDestination.setParent(null);
        }
        p0.setParent(this.graph);
        this.nodes.put(p0.getId(), p0);
    }

    public final void addDestinations$navigation_common_release(Collection<? extends NavDestination> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (NavDestination navDestination : p0) {
            if (navDestination != null) {
                addDestination$navigation_common_release(navDestination);
            }
        }
    }

    public final void addDestinations$navigation_common_release(NavDestination... p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (NavDestination navDestination : p0) {
            addDestination$navigation_common_release(navDestination);
        }
    }

    public final NavDestination findNode$navigation_common_release(int p0) {
        return findNodeComprehensive$navigation_common_release$default(this, p0, this.graph, false, null, 8, null);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$navigation_common_release$default(NavGraphImpl navGraphImpl, int i, NavDestination navDestination, boolean z, NavDestination navDestination2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraphImpl.findNodeComprehensive$navigation_common_release(i, navDestination, z, navDestination2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.p005navigation.NavDestination findNodeComprehensive$navigation_common_release(int r6, androidx.p005navigation.NavDestination r7, boolean r8, androidx.p005navigation.NavDestination r9) {
        /*
            r5 = this;
            androidx.collection.SparseArrayCompat<androidx.navigation.NavDestination> r0 = r5.nodes
            java.lang.Object r0 = r0.get(r6)
            androidx.navigation.NavDestination r0 = (androidx.p005navigation.NavDestination) r0
            r1 = 0
            if (r9 == 0) goto L21
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r2 == 0) goto L1f
            androidx.navigation.NavGraph r2 = r0.getParent()
            androidx.navigation.NavGraph r3 = r9.getParent()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L23
        L1f:
            r0 = r1
            goto L24
        L21:
            if (r0 == 0) goto L24
        L23:
            return r0
        L24:
            if (r8 == 0) goto L5c
            androidx.collection.SparseArrayCompat<androidx.navigation.NavDestination> r0 = r5.nodes
            java.util.Iterator r0 = androidx.collection.SparseArrayKt.valueIterator(r0)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r0.next()
            androidx.navigation.NavDestination r2 = (androidx.p005navigation.NavDestination) r2
            boolean r3 = r2 instanceof androidx.p005navigation.NavGraph
            if (r3 == 0) goto L56
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r7)
            if (r3 != 0) goto L56
            androidx.navigation.NavGraph r2 = (androidx.p005navigation.NavGraph) r2
            androidx.navigation.NavGraph r3 = r5.graph
            androidx.navigation.NavDestination r3 = (androidx.p005navigation.NavDestination) r3
            r4 = 1
            androidx.navigation.NavDestination r2 = r2.findNodeComprehensive(r6, r3, r4, r9)
            goto L57
        L56:
            r2 = r1
        L57:
            if (r2 == 0) goto L34
            r0 = r2
            goto L5c
        L5b:
            r0 = r1
        L5c:
            if (r0 != 0) goto L85
            androidx.navigation.NavGraph r0 = r5.graph
            androidx.navigation.NavGraph r0 = r0.getParent()
            if (r0 == 0) goto L84
            androidx.navigation.NavGraph r0 = r5.graph
            androidx.navigation.NavGraph r0 = r0.getParent()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r7 != 0) goto L84
            androidx.navigation.NavGraph r7 = r5.graph
            androidx.navigation.NavGraph r7 = r7.getParent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            androidx.navigation.NavGraph r0 = r5.graph
            androidx.navigation.NavDestination r0 = (androidx.p005navigation.NavDestination) r0
            androidx.navigation.NavDestination r6 = r7.findNodeComprehensive(r6, r0, r8, r9)
            return r6
        L84:
            return r1
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p005navigation.p008internal.NavGraphImpl.findNodeComprehensive$navigation_common_release(int, androidx.navigation.NavDestination, boolean, androidx.navigation.NavDestination):androidx.navigation.NavDestination");
    }

    public final NavDestination findNode$navigation_common_release(String p0) {
        String str = p0;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return findNode$navigation_common_release(p0, true);
    }

    public final <T> NavDestination findNode$navigation_common_release(T p0) {
        if (p0 == null) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(p0.getClass());
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass(orCreateKotlinClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(orCreateKotlinClass);
        }
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            return findNode$navigation_common_release(RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1));
        }
        updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) orCreateKotlinClass);
        throw new KotlinNothingValueException();
    }

    public final NavDestination findNode$navigation_common_release(String p0, boolean p1) {
        Object next;
        NavDestination navDestination;
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator it = SequencesKt.asSequence(SparseArrayKt.valueIterator(this.nodes)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            navDestination = (NavDestination) next;
            if (StringsKt.equals$default(navDestination.getRoute(), p0, false, 2, null)) {
                break;
            }
        } while (navDestination.matchRoute(p0) == null);
        NavDestination navDestination2 = (NavDestination) next;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!p1 || this.graph.getParent() == null) {
            return null;
        }
        NavGraph parent = this.graph.getParent();
        Intrinsics.checkNotNull(parent);
        return parent.findNode(p0);
    }

    public final Iterator<NavDestination> iterator$navigation_common_release() {
        return new NavGraphImpl$iterator$1(this);
    }

    public final void addAll$navigation_common_release(NavGraph p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<NavDestination> it = p0.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination$navigation_common_release(next);
        }
    }

    public final void remove$navigation_common_release(NavDestination p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int iIndexOfKey = this.nodes.indexOfKey(p0.getId());
        if (iIndexOfKey >= 0) {
            this.nodes.valueAt(iIndexOfKey).setParent(null);
            this.nodes.removeAt(iIndexOfKey);
        }
    }

    public final void clear$navigation_common_release() {
        Iterator<NavDestination> itIterator$navigation_common_release = iterator$navigation_common_release();
        while (itIterator$navigation_common_release.hasNext()) {
            itIterator$navigation_common_release.next();
            itIterator$navigation_common_release.remove();
        }
    }

    public final String getDisplayName$navigation_common_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.graph.getId() != 0 ? p0 : "the root navigation";
    }

    public final int getStartDestinationId$navigation_common_release() {
        return this.startDestId;
    }

    public final void setStartDestinationId$navigation_common_release(int i) {
        if (i == this.graph.getId()) {
            StringBuilder sb = new StringBuilder("Start destination ");
            sb.append(i);
            sb.append(" cannot use the same id as the graph ");
            sb.append(this.graph);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this.startDestinationRoute != null) {
            setStartDestinationRoute$navigation_common_release(null);
        }
        this.startDestId = i;
        this.startDestIdName = null;
    }

    public final void setStartDestination$navigation_common_release(int p0) {
        setStartDestinationId$navigation_common_release(p0);
    }

    public final void setStartDestination$navigation_common_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        setStartDestinationRoute$navigation_common_release(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setStartDestination$lambda$12(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        String route = navDestination.getRoute();
        Intrinsics.checkNotNull(route);
        return route;
    }

    public final <T> void setStartDestination$navigation_common_release(final T p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(p0.getClass());
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass(orCreateKotlinClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(orCreateKotlinClass);
        }
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            setStartDestination$navigation_common_release(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1, new Function1() { // from class: androidx.navigation.internal.NavGraphImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavGraphImpl.setStartDestination$lambda$14(p0, (NavDestination) obj);
                }
            });
        } else {
            updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) orCreateKotlinClass);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setStartDestination$lambda$14(Object obj, NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        Map<String, NavArgument> arguments = navDestination.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(arguments.size()));
        Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(obj, linkedHashMap);
    }

    public final <T> void setStartDestination$navigation_common_release(videoProfileHdrFormatsToDynamicRangeEncoding<T> p0, Function1<? super NavDestination, String> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int iGenerateHashCode = RouteSerializerKt.generateHashCode(p0);
        NavDestination navDestinationFindNode$navigation_common_release = findNode$navigation_common_release(iGenerateHashCode);
        if (navDestinationFindNode$navigation_common_release == null) {
            StringBuilder sb = new StringBuilder("Cannot find startDestination ");
            sb.append(p0.getDescriptor().getINotificationSideChannel());
            sb.append(" from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
            throw new IllegalStateException(sb.toString().toString());
        }
        setStartDestinationRoute$navigation_common_release(p1.invoke(navDestinationFindNode$navigation_common_release));
        this.startDestId = iGenerateHashCode;
    }

    /* JADX INFO: renamed from: getStartDestinationRoute$navigation_common_release, reason: from getter */
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    public final void setStartDestinationRoute$navigation_common_release(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (Intrinsics.areEqual(str, this.graph.getRoute())) {
                StringBuilder sb = new StringBuilder("Start destination ");
                sb.append(str);
                sb.append(" cannot use the same route as the graph ");
                sb.append(this.graph);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            iHashCode = NavDestination.INSTANCE.createRoute(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    public final String getStartDestDisplayName$navigation_common_release() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final NavDestination findNode$navigation_common_release(KClass<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) p0), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        }
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            return findNode$navigation_common_release(RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1));
        }
        updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(p0);
        throw new KotlinNothingValueException();
    }

    public final <T> void setStartDestination$navigation_common_release(KClass<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) p0), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        }
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            setStartDestination$navigation_common_release(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1, new Function1() { // from class: androidx.navigation.internal.NavGraphImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavGraphImpl.setStartDestination$lambda$12((NavDestination) obj);
                }
            });
        } else {
            updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) p0);
            throw new KotlinNothingValueException();
        }
    }
}
