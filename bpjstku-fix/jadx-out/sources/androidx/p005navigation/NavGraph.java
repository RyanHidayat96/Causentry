package androidx.p005navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.common.R;
import androidx.p005navigation.p008internal.NavContext;
import androidx.p005navigation.p008internal.NavGraphImpl;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0017\u0018\u0000 Z2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001ZB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001c\u001a\u00020\n2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001e\"\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J7\u0010#\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b#\u0010$J\u0019\u0010!\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b!\u0010%J\u001a\u0010!\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010&\u0018\u0001H\u0086\b¢\u0006\u0004\b!\u0010'J\u001b\u0010!\u001a\u0004\u0018\u00010\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030(¢\u0006\u0004\b!\u0010)J\u001f\u0010!\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010&2\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b!\u0010*J!\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b!\u0010+J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010,H\u0087\u0002¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b1\u0010\u001aJ\r\u00102\u001a\u00020\n¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020 H\u0007¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020 ¢\u0006\u0004\b6\u00107J\u0015\u00106\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b6\u00108J\u001c\u00106\u001a\u00020\n\"\n\b\u0000\u0010&\u0018\u0001*\u000209H\u0086\b¢\u0006\u0004\b6\u00103J%\u00106\u001a\u00020\n\"\b\b\u0000\u0010&*\u0002092\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000(¢\u0006\u0004\b6\u0010:J\u001f\u00106\u001a\u00020\n\"\b\b\u0000\u0010&*\u0002092\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b6\u0010;J7\u00106\u001a\u00020\n\"\u0004\b\u0000\u0010&2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0=H\u0007¢\u0006\u0004\b6\u0010>J\u000f\u0010?\u001a\u00020\rH\u0017¢\u0006\u0004\b?\u0010@J\u001a\u0010A\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u000109H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020 H\u0016¢\u0006\u0004\bC\u00105R\u0014\u0010E\u001a\u00020D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR!\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010G8GX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bH\u0010I*\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010@R+\u0010R\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020 8G@CX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bO\u00105\"\u0004\bP\u00107*\u0004\bQ\u0010KR/\u0010V\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\r8G@CX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bS\u0010@\"\u0004\bT\u00108*\u0004\bU\u0010KR\u001b\u0010Y\u001a\u00020\r8GX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bW\u0010@*\u0004\bX\u0010K"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/Navigator;", "p0", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "Landroid/util/AttributeSet;", "p1", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "", "p2", "p3", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive", "(Ljava/lang/String;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "matchDeepLinkComprehensive", "(Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "addDestination", "(Landroidx/navigation/NavDestination;)V", "", "addDestinations", "(Ljava/util/Collection;)V", "", "([Landroidx/navigation/NavDestination;)V", "", "findNode", "(I)Landroidx/navigation/NavDestination;", "findNodeComprehensive", "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", ExifInterface.GPS_DIRECTION_TRUE, "()Landroidx/navigation/NavDestination;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Landroidx/navigation/NavDestination;", "(Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator", "()Ljava/util/Iterator;", "addAll", "(Landroidx/navigation/NavGraph;)V", "remove", "clear", "()V", "getStartDestination", "()I", "setStartDestination", "(I)V", "(Ljava/lang/String;)V", "", "(Lkotlin/reflect/KClass;)V", "(Ljava/lang/Object;)V", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/Function1;", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/navigation/internal/NavGraphImpl;", "impl", "Landroidx/navigation/internal/NavGraphImpl;", "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", "getNodes$delegate", "(Landroidx/navigation/NavGraph;)Ljava/lang/Object;", "nodes", "getDisplayName", "displayName", "getStartDestinationId", "setStartDestinationId", "getStartDestinationId$delegate", "startDestinationId", "getStartDestinationRoute", "setStartDestinationRoute", "getStartDestinationRoute$delegate", "startDestinationRoute", "getStartDestDisplayName", "getStartDestDisplayName$delegate", "startDestDisplayName", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavGraph extends NavDestination implements Iterable<NavDestination>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final NavGraphImpl impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navigator) {
        super(navigator);
        Intrinsics.checkNotNullParameter(navigator, "");
        this.impl = new NavGraphImpl(this);
    }

    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.impl.getNodes$navigation_common_release();
    }

    @Override // androidx.p005navigation.NavDestination
    public void onInflate(Context p0, AttributeSet p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.onInflate(p0, p1);
        TypedArray typedArrayObtainAttributes = p0.getResources().obtainAttributes(p1, R.styleable.NavGraphNavigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "");
        setStartDestinationId(typedArrayObtainAttributes.getResourceId(R.styleable.NavGraphNavigator_startDestination, 0));
        this.impl.setStartDestIdName$navigation_common_release(NavDestination.INSTANCE.getDisplayName(new NavContext(p0), this.impl.getStartDestId()));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final NavDestination.DeepLinkMatch matchRouteComprehensive(String p0, boolean p1, boolean p2, NavDestination p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return this.impl.matchRouteComprehensive$navigation_common_release(p0, p1, p2, p3);
    }

    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive(NavDeepLinkRequest p0, boolean p1, boolean p2, NavDestination p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return this.impl.matchDeepLinkComprehensive$navigation_common_release(super.matchDeepLink(p0), p0, p1, p2, p3);
    }

    @Override // androidx.p005navigation.NavDestination
    public NavDestination.DeepLinkMatch matchDeepLink(NavDeepLinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.matchDeepLink$navigation_common_release(super.matchDeepLink(p0), p0);
    }

    public final void addDestination(NavDestination p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.addDestination$navigation_common_release(p0);
    }

    public final void addDestinations(Collection<? extends NavDestination> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.addDestinations$navigation_common_release(p0);
    }

    public final void addDestinations(NavDestination... p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.addDestinations$navigation_common_release((NavDestination[]) Arrays.copyOf(p0, p0.length));
    }

    public final NavDestination findNode(int p0) {
        return this.impl.findNode$navigation_common_release(p0);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$default(NavGraph navGraph, int i, NavDestination navDestination, boolean z, NavDestination navDestination2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i2 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraph.findNodeComprehensive(i, navDestination, z, navDestination2);
    }

    public final NavDestination findNodeComprehensive(int p0, NavDestination p1, boolean p2, NavDestination p3) {
        return this.impl.findNodeComprehensive$navigation_common_release(p0, p1, p2, p3);
    }

    public final NavDestination findNode(String p0) {
        return this.impl.findNode$navigation_common_release(p0);
    }

    public final /* synthetic */ <T> NavDestination findNode() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return findNode(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final NavDestination findNode(KClass<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.findNode$navigation_common_release(p0);
    }

    public final <T> NavDestination findNode(T p0) {
        return this.impl.findNode$navigation_common_release(p0);
    }

    public final NavDestination findNode(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.findNode$navigation_common_release(p0, p1);
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return this.impl.iterator$navigation_common_release();
    }

    public final void addAll(NavGraph p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.addAll$navigation_common_release(p0);
    }

    public final void remove(NavDestination p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.remove$navigation_common_release(p0);
    }

    public final void clear() {
        this.impl.clear$navigation_common_release();
    }

    @Override // androidx.p005navigation.NavDestination
    public String getDisplayName() {
        return this.impl.getDisplayName$navigation_common_release(super.getDisplayName());
    }

    @Deprecated(message = "Use getStartDestinationId instead.", replaceWith = @ReplaceWith(expression = "startDestinationId", imports = {}))
    public final int getStartDestination() {
        return this.impl.getStartDestinationId$navigation_common_release();
    }

    private final void setStartDestinationId(int i) {
        this.impl.setStartDestinationId$navigation_common_release(i);
    }

    public final int getStartDestinationId() {
        return this.impl.getStartDestinationId$navigation_common_release();
    }

    public final void setStartDestination(int p0) {
        this.impl.setStartDestination$navigation_common_release(p0);
    }

    public final void setStartDestination(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.setStartDestination$navigation_common_release(p0);
    }

    public final /* synthetic */ <T> void setStartDestination() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        setStartDestination(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ void setStartDestination(KClass p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.setStartDestination$navigation_common_release(p0);
    }

    public final /* synthetic */ void setStartDestination(Object p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.setStartDestination$navigation_common_release(p0);
    }

    public final <T> void setStartDestination(videoProfileHdrFormatsToDynamicRangeEncoding<T> p0, Function1<? super NavDestination, String> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.impl.setStartDestination$navigation_common_release(p0, p1);
    }

    private final void setStartDestinationRoute(String str) {
        this.impl.setStartDestinationRoute$navigation_common_release(str);
    }

    public final String getStartDestinationRoute() {
        return this.impl.getStartDestinationRoute();
    }

    public final String getStartDestDisplayName() {
        return this.impl.getStartDestDisplayName$navigation_common_release();
    }

    @Override // androidx.p005navigation.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination navDestinationFindNode = findNode(getStartDestinationRoute());
        if (navDestinationFindNode == null) {
            navDestinationFindNode = findNode(getStartDestinationId());
        }
        sb.append(" startDestination=");
        if (navDestinationFindNode == null) {
            if (getStartDestinationRoute() != null) {
                sb.append(getStartDestinationRoute());
            } else if (this.impl.getStartDestIdName() != null) {
                sb.append(this.impl.getStartDestIdName());
            } else {
                StringBuilder sb2 = new StringBuilder("0x");
                sb2.append(Integer.toHexString(this.impl.getStartDestId()));
                sb.append(sb2.toString());
            }
        } else {
            sb.append("{");
            sb.append(navDestinationFindNode.toString());
            sb.append("}");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // androidx.p005navigation.NavDestination
    public boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof NavGraph) || !super.equals(p0)) {
            return false;
        }
        NavGraph navGraph = (NavGraph) p0;
        if (getNodes().size() != navGraph.getNodes().size() || getStartDestinationId() != navGraph.getStartDestinationId()) {
            return false;
        }
        for (NavDestination navDestination : SequencesKt.asSequence(SparseArrayKt.valueIterator(getNodes()))) {
            if (!Intrinsics.areEqual(navDestination, navGraph.getNodes().get(navDestination.getId()))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.p005navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> nodes = getNodes();
        int size = nodes.size();
        for (int i = 0; i < size; i++) {
            startDestinationId = (((startDestinationId * 31) + nodes.keyAt(i)) * 31) + nodes.valueAt(i).hashCode();
        }
        return startDestinationId;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "<init>", "()V", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "findStartDestination", "(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDestination;", "Lkotlin/sequences/Sequence;", "childHierarchy", "(Landroidx/navigation/NavGraph;)Lkotlin/sequences/Sequence;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final NavDestination findStartDestination(NavGraph navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "");
            return (NavDestination) SequencesKt.last(childHierarchy(navGraph));
        }

        public final Sequence<NavDestination> childHierarchy(NavGraph navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "");
            return SequencesKt.generateSequence(navGraph, (Function1<? super NavGraph, ? extends NavGraph>) new Function1() { // from class: androidx.navigation.NavGraph$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavGraph.Companion.childHierarchy$lambda$0((NavDestination) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavDestination childHierarchy$lambda$0(NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "");
            if (!(navDestination instanceof NavGraph)) {
                return null;
            }
            NavGraph navGraph = (NavGraph) navDestination;
            return navGraph.findNode(navGraph.getStartDestinationId());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final NavDestination findStartDestination(NavGraph navGraph) {
        return INSTANCE.findStartDestination(navGraph);
    }
}
