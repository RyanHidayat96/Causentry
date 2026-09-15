package androidx.p005navigation;

import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.p009serialization.RouteSerializerKt;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.messaging.Constants;
import defpackage.CameraController2;
import defpackage.updateMirroringFlagInOutputFileOptions;
import defpackage.updatePreviewViewTransform;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes.dex */
@NavDestinationDsl
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B+\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fB#\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\rBD\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e\u0012\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0010\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0011¢\u0006\u0002\b\u00120\u000f¢\u0006\u0004\b\n\u0010\u0013J.\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\b2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001f\u001a\u00020\u0016\"\n\b\u0001\u0010\u001e\u0018\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\bH\u0087\b¢\u0006\u0004\b\u001f\u0010\u001dJ&\u0010\u001c\u001a\u00020\u00162\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001c\u0010!JB\u0010\u001c\u001a\u00020\u0016\"\n\b\u0001\u0010\u001e\u0018\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\b2\u0019\b\b\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019JF\u0010\u001c\u001a\u00020\u0016\"\b\b\u0001\u0010\u001e*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001c\u0010\"J\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020#¢\u0006\u0004\b\u001c\u0010$J0\u0010&\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00028\u0000H\u0015¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00028\u0000H\u0017¢\u0006\u0004\b*\u0010)R\"\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R&\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u00108R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020#0B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020E0@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u00108\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavDestination;", "D", "", "Landroidx/navigation/Navigator;", "p0", "", "p1", "", "p2", "<init>", "(Landroidx/navigation/Navigator;ILjava/lang/String;)V", "(Landroidx/navigation/Navigator;I)V", "(Landroidx/navigation/Navigator;Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/navigation/Navigator;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "", "Lkotlin/ExtensionFunctionType;", "argument", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavArgument;", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "deepLink", "(Ljava/lang/String;)V", ExifInterface.GPS_DIRECTION_TRUE, "deepLinkSafeArgs", "Landroidx/navigation/NavDeepLinkDslBuilder;", "(Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavDeepLink;", "(Landroidx/navigation/NavDeepLink;)V", "Landroidx/navigation/NavActionBuilder;", "action", "(ILkotlin/jvm/functions/Function1;)V", "instantiateDestination", "()Landroidx/navigation/NavDestination;", "build", "navigator", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "id", "I", "getId", "()I", PlaceTypes.ROUTE, "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "typeMap", "Ljava/util/Map;", "", Constants.ScionAnalytics.PARAM_LABEL, "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "", "arguments", "", "deepLinks", "Ljava/util/List;", "Landroidx/navigation/NavAction;", "actions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavDestinationBuilder<D extends NavDestination> {
    private Map<Integer, NavAction> actions;
    private Map<String, NavArgument> arguments;
    private List<NavDeepLink> deepLinks;
    private final int id;
    private CharSequence label;
    private final Navigator<? extends D> navigator;
    private final String route;
    private Map<KType, ? extends NavType<?>> typeMap;

    public NavDestinationBuilder(Navigator<? extends D> navigator, int i, String str) {
        Intrinsics.checkNotNullParameter(navigator, "");
        this.navigator = navigator;
        this.id = i;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    protected final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    public final int getId() {
        return this.id;
    }

    public final String getRoute() {
        return this.route;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to build your NavDestination instead", replaceWith = @ReplaceWith(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public NavDestinationBuilder(Navigator<? extends D> navigator, int i) {
        this(navigator, i, (String) null);
        Intrinsics.checkNotNullParameter(navigator, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, String str) {
        this(navigator, -1, str);
        Intrinsics.checkNotNullParameter(navigator, "");
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void argument(String p0, Function1<? super NavArgumentBuilder, Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        p1.invoke(navArgumentBuilder);
        map.put(p0, navArgumentBuilder.build());
    }

    public final void argument(String p0, NavArgument p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.arguments.put(p0, p1);
    }

    public final void deepLink(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.deepLinks.add(new NavDeepLink(p0));
    }

    public final /* synthetic */ <T> void deepLinkSafeArgs(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        deepLink(Reflection.getOrCreateKotlinClass(Object.class), p0, new Function1<NavDeepLinkDslBuilder, Unit>() { // from class: androidx.navigation.NavDestinationBuilder.deepLink.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                invoke2(navDeepLinkDslBuilder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                Intrinsics.checkNotNullParameter(navDeepLinkDslBuilder, "");
            }
        });
    }

    public final void deepLink(Function1<? super NavDeepLinkDslBuilder, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        p0.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_release());
    }

    public final /* synthetic */ <T> void deepLink(String p0, Function1<? super NavDeepLinkDslBuilder, Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        deepLink(Reflection.getOrCreateKotlinClass(Object.class), p0, p1);
    }

    public final <T> void deepLink(KClass<T> p0, String p1, Function1<? super NavDeepLinkDslBuilder, Unit> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (this.typeMap == null) {
            StringBuilder sb = new StringBuilder("Cannot add deeplink from KClass [");
            sb.append(p0);
            sb.append("]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.");
            throw new IllegalStateException(sb.toString().toString());
        }
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
            Map<KType, ? extends NavType<?>> map = this.typeMap;
            Map<KType, ? extends NavType<?>> map2 = null;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                map = null;
            }
            for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1, map)) {
                NavArgument navArgument = this.arguments.get(namedNavArgument.getName());
                if (navArgument == null || !Intrinsics.areEqual(navArgument.getType(), namedNavArgument.getArgument().getType())) {
                    StringBuilder sb2 = new StringBuilder("Cannot add deeplink from KClass [");
                    sb2.append(p0);
                    sb2.append("]. DeepLink contains unknown argument [");
                    sb2.append(namedNavArgument.getName());
                    sb2.append("]. Ensure deeplink arguments matches the destination's route from KClass");
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
            Map<KType, ? extends NavType<?>> map3 = this.typeMap;
            if (map3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                map2 = map3;
            }
            deepLink(NavDeepLinkDslBuilderKt.navDeepLink(p0, p1, map2, p2));
            return;
        }
        updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) p0);
        throw new KotlinNothingValueException();
    }

    public final void deepLink(NavDeepLink p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.deepLinks.add(p0);
    }

    @Deprecated(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void action(int p0, Function1<? super NavActionBuilder, Unit> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        Map<Integer, NavAction> map = this.actions;
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        p1.invoke(navActionBuilder);
        map.put(Integer.valueOf(p0), navActionBuilder.build$navigation_common_release());
    }

    protected D instantiateDestination() {
        return (D) this.navigator.createDestination();
    }

    public D build() {
        D d = (D) instantiateDestination();
        d.setLabel(this.label);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            d.addArgument(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            d.addDeepLink((NavDeepLink) it.next());
        }
        for (Map.Entry<Integer, NavAction> entry2 : this.actions.entrySet()) {
            d.putAction(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            d.setRoute(str);
        }
        int i = this.id;
        if (i != -1) {
            d.setId(i);
        }
        return d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Illegal instructions before constructor call */
    public NavDestinationBuilder(Navigator<? extends D> navigator, KClass<?> kClass, Map<KType, NavType<?>> map) {
        int iGenerateHashCode;
        Intrinsics.checkNotNullParameter(navigator, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (kClass != null) {
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1((KClass) kClass, (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) new videoProfileHdrFormatsToDynamicRangeEncoding[0]);
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null ? CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(kClass) : videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1;
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
                updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(kClass);
                throw new KotlinNothingValueException();
            }
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
                iGenerateHashCode = RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1);
            } else {
                iGenerateHashCode = -1;
            }
        } else {
            iGenerateHashCode = -1;
        }
        String strGenerateRoutePattern$default = null;
        if (kClass != null) {
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater2 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1((KClass) kClass, (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) new videoProfileHdrFormatsToDynamicRangeEncoding[0]);
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater2 = videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater2 == null ? CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(kClass) : videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater2;
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater2 == null) {
                updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(kClass);
                throw new KotlinNothingValueException();
            }
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater2 != null) {
                strGenerateRoutePattern$default = RouteSerializerKt.generateRoutePattern$default(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater2, map, null, 2, null);
            }
        }
        this(navigator, iGenerateHashCode, strGenerateRoutePattern$default);
        if (kClass != null) {
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
            videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater3 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) kClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater3 = videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater3 == null ? CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(kClass) : videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater3;
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater3 != null) {
                for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater3, map)) {
                    this.arguments.put(namedNavArgument.getName(), namedNavArgument.getArgument());
                }
            } else {
                updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(kClass);
                throw new KotlinNothingValueException();
            }
        }
        this.typeMap = map;
    }
}
