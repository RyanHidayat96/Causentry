package androidx.p005navigation.p008internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.p005navigation.NavArgument;
import androidx.p005navigation.NavArgumentKt;
import androidx.p005navigation.NavDeepLink;
import androidx.p005navigation.NavDeepLinkRequest;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.NavUriKt;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00062\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\u000e\u0010\u0003\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0000¢\u0006\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010!R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R.\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0015028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010:\u001a\u0002092\u0006\u0010\u0003\u001a\u0002098\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R.\u0010@\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n8\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b@\u0010)\u001a\u0004\bA\u0010+\"\u0004\bB\u0010!R\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010E"}, d2 = {"Landroidx/navigation/internal/NavDestinationImpl;", "", "Landroidx/navigation/NavDestination;", "p0", "<init>", "(Landroidx/navigation/NavDestination;)V", "Landroidx/navigation/NavDeepLink;", "", "addDeepLink$navigation_common_release", "(Landroidx/navigation/NavDeepLink;)V", "", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRoute$navigation_common_release", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "matchDeepLink$navigation_common_release", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroid/net/Uri;", "Landroidx/navigation/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p1", "", "Landroidx/navigation/NavArgument;", "p2", "", "hasRequiredArguments", "(Landroidx/navigation/NavDeepLink;Landroid/net/Uri;Ljava/util/Map;)Z", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "hasRoute$navigation_common_release", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "addArgument$navigation_common_release", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "removeArgument$navigation_common_release", "(Ljava/lang/String;)V", "addInDefaultArgs$navigation_common_release", "(Landroid/os/Bundle;)Landroid/os/Bundle;", FirebaseAnalytics.Param.DESTINATION, "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "idName", "Ljava/lang/String;", "getIdName$navigation_common_release", "()Ljava/lang/String;", "setIdName$navigation_common_release", "", "deepLinks", "Ljava/util/List;", "getDeepLinks$navigation_common_release", "()Ljava/util/List;", "", "arguments", "Ljava/util/Map;", "getArguments$navigation_common_release", "()Ljava/util/Map;", "setArguments$navigation_common_release", "(Ljava/util/Map;)V", "", "id", "I", "getId$navigation_common_release", "()I", "setId$navigation_common_release", "(I)V", PlaceTypes.ROUTE, "getRoute$navigation_common_release", "setRoute$navigation_common_release", "Lkotlin/Lazy;", "routeDeepLink", "Lkotlin/Lazy;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavDestinationImpl {
    private Map<String, NavArgument> arguments;
    private final List<NavDeepLink> deepLinks;
    private final NavDestination destination;
    private int id;
    private String idName;
    private String route;
    private Lazy<NavDeepLink> routeDeepLink;

    public NavDestinationImpl(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        this.destination = navDestination;
        this.deepLinks = new ArrayList();
        this.arguments = new LinkedHashMap();
    }

    public final NavDestination getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: getIdName$navigation_common_release, reason: from getter */
    public final String getIdName() {
        return this.idName;
    }

    public final void setIdName$navigation_common_release(String str) {
        this.idName = str;
    }

    public final List<NavDeepLink> getDeepLinks$navigation_common_release() {
        return this.deepLinks;
    }

    public final Map<String, NavArgument> getArguments$navigation_common_release() {
        return this.arguments;
    }

    public final void setArguments$navigation_common_release(Map<String, NavArgument> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.arguments = map;
    }

    /* JADX INFO: renamed from: getId$navigation_common_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final void setId$navigation_common_release(int i) {
        this.id = i;
        this.idName = null;
    }

    /* JADX INFO: renamed from: getRoute$navigation_common_release, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final void setRoute$navigation_common_release(String str) {
        if (str == null) {
            setId$navigation_common_release(0);
        } else {
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            final String strCreateRoute = NavDestination.INSTANCE.createRoute(str);
            final NavDeepLink navDeepLinkBuild = new NavDeepLink.Builder().setUriPattern(strCreateRoute).build();
            List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(this.arguments, new Function1() { // from class: androidx.navigation.internal.NavDestinationImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(NavDestinationImpl._set_route_$lambda$1(navDeepLinkBuild, (String) obj));
                }
            });
            if (!listMissingRequiredArguments.isEmpty()) {
                StringBuilder sb = new StringBuilder("Cannot set route \"");
                sb.append(str);
                sb.append("\" for destination ");
                sb.append(this.destination);
                sb.append(". Following required arguments are missing: ");
                sb.append(listMissingRequiredArguments);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            this.routeDeepLink = LazyKt.lazy(new Function0() { // from class: androidx.navigation.internal.NavDestinationImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavDestinationImpl._set_route_$lambda$3(strCreateRoute);
                }
            });
            setId$navigation_common_release(strCreateRoute.hashCode());
        }
        this.route = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _set_route_$lambda$1(NavDeepLink navDeepLink, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !navDeepLink.getArgumentsNames$navigation_common_release().contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDeepLink _set_route_$lambda$3(String str) {
        return new NavDeepLink.Builder().setUriPattern(str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addDeepLink$lambda$4(NavDeepLink navDeepLink, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !navDeepLink.getArgumentsNames$navigation_common_release().contains(str);
    }

    public final void addDeepLink$navigation_common_release(final NavDeepLink p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<String> listMissingRequiredArguments = NavArgumentKt.missingRequiredArguments(this.arguments, new Function1() { // from class: androidx.navigation.internal.NavDestinationImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavDestinationImpl.addDeepLink$lambda$4(p0, (String) obj));
            }
        });
        if (!listMissingRequiredArguments.isEmpty()) {
            StringBuilder sb = new StringBuilder("Deep link ");
            sb.append(p0.getUriPattern());
            sb.append(" can't be used to open destination ");
            sb.append(this.destination);
            sb.append(".\nFollowing required arguments are missing: ");
            sb.append(listMissingRequiredArguments);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        this.deepLinks.add(p0);
    }

    public final NavDestination.DeepLinkMatch matchRoute$navigation_common_release(String p0) {
        NavDeepLink value;
        Uri uriNavUri;
        Bundle matchingArguments;
        Intrinsics.checkNotNullParameter(p0, "");
        Lazy<NavDeepLink> lazy = this.routeDeepLink;
        if (lazy == null || (value = lazy.getValue()) == null || (matchingArguments = value.getMatchingArguments((uriNavUri = NavUriKt.NavUri(NavDestination.INSTANCE.createRoute(p0))), this.arguments)) == null) {
            return null;
        }
        return new NavDestination.DeepLinkMatch(this.destination, matchingArguments, value.getIsExactDeepLink(), value.calculateMatchingPathSegments$navigation_common_release(uriNavUri), false, -1);
    }

    public final NavDestination.DeepLinkMatch matchDeepLink$navigation_common_release(NavDeepLinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        NavDestination.DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = p0.getUri();
            if (navDeepLink.matches$navigation_common_release(p0)) {
                Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, this.arguments) : null;
                int iCalculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri);
                String action = p0.getAction();
                boolean z = action != null && Intrinsics.areEqual(action, navDeepLink.getAction());
                String mimeType = p0.getMimeType();
                int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
                if (matchingArguments == null) {
                    if (z || mimeTypeMatchRating >= 0) {
                        if (hasRequiredArguments(navDeepLink, uri, this.arguments)) {
                        }
                    }
                }
                NavDestination.DeepLinkMatch deepLinkMatch2 = new NavDestination.DeepLinkMatch(this.destination, matchingArguments, navDeepLink.getIsExactDeepLink(), iCalculateMatchingPathSegments$navigation_common_release, z, mimeTypeMatchRating);
                if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                    deepLinkMatch = deepLinkMatch2;
                }
            }
        }
        return deepLinkMatch;
    }

    private final boolean hasRequiredArguments(NavDeepLink p0, Uri p1, Map<String, NavArgument> p2) {
        final Bundle matchingPathAndQueryArgs$navigation_common_release = p0.getMatchingPathAndQueryArgs$navigation_common_release(p1, p2);
        return NavArgumentKt.missingRequiredArguments(p2, new Function1() { // from class: androidx.navigation.internal.NavDestinationImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavDestinationImpl.hasRequiredArguments$lambda$7(matchingPathAndQueryArgs$navigation_common_release, (String) obj));
            }
        }).isEmpty();
    }

    public final boolean hasRoute$navigation_common_release(String p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(this.route, p0)) {
            return true;
        }
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute$navigation_common_release = matchRoute$navigation_common_release(p0);
        if (Intrinsics.areEqual(this.destination, deepLinkMatchMatchRoute$navigation_common_release != null ? deepLinkMatchMatchRoute$navigation_common_release.getDestination() : null)) {
            return deepLinkMatchMatchRoute$navigation_common_release.hasMatchingArgs(p1);
        }
        return false;
    }

    public final void addArgument$navigation_common_release(String p0, NavArgument p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.arguments.put(p0, p1);
    }

    public final void removeArgument$navigation_common_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.arguments.remove(p0);
    }

    public final Bundle addInDefaultArgs$navigation_common_release(Bundle p0) {
        Pair[] pairArr;
        if (p0 == null && this.arguments.isEmpty()) {
            return null;
        }
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
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        for (Map.Entry<String, NavArgument> entry2 : this.arguments.entrySet()) {
            entry2.getValue().putDefaultValue(entry2.getKey(), bundleBundleOf);
        }
        if (p0 != null) {
            SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), p0);
            for (Map.Entry<String, NavArgument> entry3 : this.arguments.entrySet()) {
                String key = entry3.getKey();
                NavArgument value = entry3.getValue();
                if (!value.getIsDefaultValueUnknown() && !value.verify(key, bundleBundleOf)) {
                    StringBuilder sb = new StringBuilder("Wrong argument type for '");
                    sb.append(key);
                    sb.append("' in argument savedState. ");
                    sb.append(value.getType().getName());
                    sb.append(" expected.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }
        return bundleBundleOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasRequiredArguments$lambda$7(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl(bundle), str);
    }
}
