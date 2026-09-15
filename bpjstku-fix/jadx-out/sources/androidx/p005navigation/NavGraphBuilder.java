package androidx.p005navigation;

import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.CameraController2;
import defpackage.updateMirroringFlagInOutputFileOptions;
import defpackage.updatePreviewViewTransform;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes.dex */
@NavDestinationDsl
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\u000bBH\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\f\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f\u0012\u001b\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r¢\u0006\u0004\b\b\u0010\u0012BD\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f\u0012\u001b\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r¢\u0006\u0004\b\b\u0010\u0014J%\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u0017*\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "p0", "", "p1", "p2", "<init>", "(Landroidx/navigation/NavigatorProvider;II)V", "", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "p3", "(Landroidx/navigation/NavigatorProvider;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "Landroidx/navigation/NavDestination;", "D", "", FirebaseAnalytics.Param.DESTINATION, "(Landroidx/navigation/NavDestinationBuilder;)V", "unaryPlus", "(Landroidx/navigation/NavDestination;)V", "addDestination", "build", "()Landroidx/navigation/NavGraph;", "provider", "Landroidx/navigation/NavigatorProvider;", "getProvider", "()Landroidx/navigation/NavigatorProvider;", "startDestinationId", "I", "startDestinationRoute", "Ljava/lang/String;", "startDestinationClass", "Lkotlin/reflect/KClass;", "startDestinationObject", "Ljava/lang/Object;", "", "destinations", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    private final List<NavDestination> destinations;
    private final NavigatorProvider provider;
    private KClass<?> startDestinationClass;
    private int startDestinationId;
    private Object startDestinationObject;
    private String startDestinationRoute;

    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final <D extends NavDestination> void destination(NavDestinationBuilder<? extends D> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.destinations.add(p0.build());
    }

    public final void unaryPlus(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        addDestination(navDestination);
    }

    public final void addDestination(NavDestination p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.destinations.add(p0);
    }

    @Override // androidx.p005navigation.NavDestinationBuilder
    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations(this.destinations);
        int i = this.startDestinationId;
        if (i == 0 && this.startDestinationRoute == null && this.startDestinationClass == null && this.startDestinationObject == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            navGraph.setStartDestination(str);
            return navGraph;
        }
        KClass<?> kClass = this.startDestinationClass;
        if (kClass != null) {
            Intrinsics.checkNotNull(kClass);
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
            videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) kClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
                videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(kClass);
            }
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
                navGraph.setStartDestination(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1, new Function1() { // from class: androidx.navigation.NavGraphBuilder$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavGraphBuilder.build$lambda$1$lambda$0((NavDestination) obj);
                    }
                });
                return navGraph;
            }
            updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(kClass);
            throw new KotlinNothingValueException();
        }
        Object obj = this.startDestinationObject;
        if (obj != null) {
            Intrinsics.checkNotNull(obj);
            navGraph.setStartDestination(obj);
            return navGraph;
        }
        navGraph.setStartDestination(i);
        return navGraph;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String build$lambda$1$lambda$0(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        String route = navDestination.getRoute();
        Intrinsics.checkNotNull(route);
        return route;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to build your NavGraph instead", replaceWith = @ReplaceWith(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public NavGraphBuilder(NavigatorProvider navigatorProvider, int i, int i2) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), i);
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationId = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, String str, String str2) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), str2);
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationRoute = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, KClass<?> kClass, KClass<?> kClass2, Map<KType, NavType<?>> map) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), kClass2, map);
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationClass = kClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, Object obj, KClass<?> kClass, Map<KType, NavType<?>> map) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), kClass, map);
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationObject = obj;
    }
}
