package androidx.p005navigation.p009serialization;

import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.NamedNavArgument;
import androidx.p005navigation.NamedNavArgumentKt;
import androidx.p005navigation.NavArgumentBuilder;
import androidx.p005navigation.NavType;
import defpackage.CameraController2;
import defpackage.convertToUptimeUs;
import defpackage.createImageAnalysis;
import defpackage.getFirstVideoProfile;
import defpackage.isCameraAttached;
import defpackage.updateMirroringFlagInOutputFileOptions;
import defpackage.updatePreviewViewTransform;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u000f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0000*\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u00002\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0004*\u00020\u00152\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001ap\u0010\u001d\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u000225\u0010\u0007\u001a1\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u001c\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u001c\u0012\u0011\u0012\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u00120\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001ar\u0010\u001f\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u000225\u0010\u0007\u001a1\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u001c\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u001c\u0012\u0011\u0012\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u00120\u001bH\u0003¢\u0006\u0004\b\u001f\u0010\u001e\u001a/\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010%\u001a\u00020$*\u00020\u0015H\u0000¢\u0006\u0004\b%\u0010&"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "p0", "", "p1", "generateRoutePattern", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "", "Landroidx/navigation/NamedNavArgument;", "generateNavArguments", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;Ljava/util/Map;)Ljava/util/List;", "", "generateRouteWithArgs", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lkotlin/Function0;", "", "assertNotAbstractClass", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;Lkotlin/jvm/functions/Function0;)V", "LcreateImageAnalysis;", "computeNavType", "(LcreateImageAnalysis;Ljava/util/Map;)Landroidx/navigation/NavType;", "", "generateHashCode", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;)I", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "forEachIndexedKType", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)V", "forEachIndexedName", "p2", "p3", "unknownNavTypeErrorMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "isValueClass", "(LcreateImageAnalysis;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteSerializerKt {
    public static /* synthetic */ String generateRoutePattern$default(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return generateRoutePattern(videoprofilehdrformatstodynamicrangeencoding, map, str);
    }

    public static final <T> String generateRoutePattern(final videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, Map<KType, ? extends NavType<?>> map, String str) {
        final RouteBuilder routeBuilder;
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(map, "");
        assertNotAbstractClass(videoprofilehdrformatstodynamicrangeencoding, new Function0() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RouteSerializerKt.generateRoutePattern$lambda$0(videoprofilehdrformatstodynamicrangeencoding);
            }
        });
        if (str != null) {
            routeBuilder = new RouteBuilder(str, videoprofilehdrformatstodynamicrangeencoding);
        } else {
            routeBuilder = new RouteBuilder(videoprofilehdrformatstodynamicrangeencoding);
        }
        forEachIndexedKType(videoprofilehdrformatstodynamicrangeencoding, map, new Function3() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RouteSerializerKt.generateRoutePattern$lambda$1(routeBuilder, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
            }
        });
        return routeBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateRoutePattern$lambda$0(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding) {
        StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
        KClass<?> kClassTuitionPaymentFragmentbindingInflater1 = convertToUptimeUs.TuitionPaymentFragmentbindingInflater1(videoprofilehdrformatstodynamicrangeencoding.getDescriptor());
        sb.append(kClassTuitionPaymentFragmentbindingInflater1 != null ? kClassTuitionPaymentFragmentbindingInflater1.getSimpleName() : null);
        sb.append(". Routes can only be generated from concrete classes or objects.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateRoutePattern$lambda$1(RouteBuilder routeBuilder, int i, String str, NavType navType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(navType, "");
        routeBuilder.appendPattern(i, str, navType);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ List generateNavArguments$default(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        return generateNavArguments(videoprofilehdrformatstodynamicrangeencoding, map);
    }

    public static final <T> List<NamedNavArgument> generateNavArguments(final videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, final Map<KType, ? extends NavType<?>> map) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(map, "");
        assertNotAbstractClass(videoprofilehdrformatstodynamicrangeencoding, new Function0() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RouteSerializerKt.generateNavArguments$lambda$2(videoprofilehdrformatstodynamicrangeencoding);
            }
        });
        int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        ArrayList arrayList = new ArrayList(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        for (final int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            final String strTuitionPaymentFragmentbindingInflater1 = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().TuitionPaymentFragmentbindingInflater1(i);
            arrayList.add(NamedNavArgumentKt.navArgument(strTuitionPaymentFragmentbindingInflater1, new Function1() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RouteSerializerKt.generateNavArguments$lambda$4$lambda$3(videoprofilehdrformatstodynamicrangeencoding, i, map, strTuitionPaymentFragmentbindingInflater1, (NavArgumentBuilder) obj);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateNavArguments$lambda$2(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding) {
        StringBuilder sb = new StringBuilder("Cannot generate NavArguments for polymorphic serializer ");
        sb.append(videoprofilehdrformatstodynamicrangeencoding);
        sb.append(". Arguments can only be generated from concrete classes or objects.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateNavArguments$lambda$4$lambda$3(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, int i, Map map, String str, NavArgumentBuilder navArgumentBuilder) {
        Intrinsics.checkNotNullParameter(navArgumentBuilder, "");
        createImageAnalysis createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        boolean zD = createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.d();
        NavType<?> navTypeComputeNavType = computeNavType(createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3, map);
        if (navTypeComputeNavType != null) {
            navArgumentBuilder.setType(navTypeComputeNavType);
            navArgumentBuilder.setNullable(zD);
            if (videoprofilehdrformatstodynamicrangeencoding.getDescriptor().TuitionPaymentFragmentspecialinlinedviewModeldefault1(i)) {
                navArgumentBuilder.setUnknownDefaultValuePresent$navigation_common_release(true);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException(unknownNavTypeErrorMessage(str, createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.getINotificationSideChannel(), videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getINotificationSideChannel(), map.toString()));
    }

    public static final <T> String generateRouteWithArgs(T t, Map<String, ? extends NavType<Object>> map) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(map, "");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(t.getClass());
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
            final Map<String, List<String>> mapEncodeToArgMap = new RouteEncoder(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1, map).encodeToArgMap(t);
            final RouteBuilder routeBuilder = new RouteBuilder(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1);
            forEachIndexedName(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1, map, new Function3() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return RouteSerializerKt.generateRouteWithArgs$lambda$5(mapEncodeToArgMap, routeBuilder, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
                }
            });
            return routeBuilder.build();
        }
        updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) orCreateKotlinClass);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateRouteWithArgs$lambda$5(Map map, RouteBuilder routeBuilder, int i, String str, NavType navType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(navType, "");
        Object obj = map.get(str);
        Intrinsics.checkNotNull(obj);
        routeBuilder.appendArg(i, str, navType, (List) obj);
        return Unit.INSTANCE;
    }

    private static final <T> void assertNotAbstractClass(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, Function0<Unit> function0) {
        if (videoprofilehdrformatstodynamicrangeencoding instanceof getFirstVideoProfile) {
            function0.invoke();
        }
    }

    private static final NavType<Object> computeNavType(createImageAnalysis createimageanalysis, Map<KType, ? extends NavType<?>> map) {
        Object next;
        Iterator<T> it = map.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!NavTypeConverterKt.matchKType(createimageanalysis, (KType) next));
        KType kType = (KType) next;
        NavType<?> navType = kType != null ? map.get(kType) : null;
        if (!(navType instanceof NavType)) {
            navType = null;
        }
        if (navType == null) {
            navType = NavTypeConverterKt.getNavType(createimageanalysis);
        }
        if (Intrinsics.areEqual(navType, UNKNOWN.INSTANCE)) {
            return null;
        }
        Intrinsics.checkNotNull(navType, "");
        return navType;
    }

    public static final <T> int generateHashCode(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        int iHashCode = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getINotificationSideChannel().hashCode();
        int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            iHashCode = (iHashCode * 31) + videoprofilehdrformatstodynamicrangeencoding.getDescriptor().TuitionPaymentFragmentbindingInflater1(i).hashCode();
        }
        return iHashCode;
    }

    static /* synthetic */ void forEachIndexedKType$default(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, Map map, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        forEachIndexedKType(videoprofilehdrformatstodynamicrangeencoding, map, function3);
    }

    private static final <T> void forEachIndexedKType(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, Map<KType, ? extends NavType<?>> map, Function3<? super Integer, ? super String, ? super NavType<Object>, Unit> function3) {
        int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            String strTuitionPaymentFragmentbindingInflater1 = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().TuitionPaymentFragmentbindingInflater1(i);
            NavType<Object> navTypeComputeNavType = computeNavType(videoprofilehdrformatstodynamicrangeencoding.getDescriptor().TuitionPaymentFragmentspecialinlinedviewModeldefault3(i), map);
            if (navTypeComputeNavType == null) {
                throw new IllegalArgumentException(unknownNavTypeErrorMessage(strTuitionPaymentFragmentbindingInflater1, videoprofilehdrformatstodynamicrangeencoding.getDescriptor().TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).getINotificationSideChannel(), videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getINotificationSideChannel(), map.toString()));
            }
            function3.invoke(Integer.valueOf(i), strTuitionPaymentFragmentbindingInflater1, navTypeComputeNavType);
        }
    }

    private static final <T> void forEachIndexedName(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, Map<String, ? extends NavType<Object>> map, Function3<? super Integer, ? super String, ? super NavType<Object>, Unit> function3) {
        int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            String strTuitionPaymentFragmentbindingInflater1 = videoprofilehdrformatstodynamicrangeencoding.getDescriptor().TuitionPaymentFragmentbindingInflater1(i);
            NavType<Object> navType = map.get(strTuitionPaymentFragmentbindingInflater1);
            if (navType == null) {
                StringBuilder sb = new StringBuilder("Cannot locate NavType for argument [");
                sb.append(strTuitionPaymentFragmentbindingInflater1);
                sb.append(']');
                throw new IllegalStateException(sb.toString().toString());
            }
            function3.invoke(Integer.valueOf(i), strTuitionPaymentFragmentbindingInflater1, navType);
        }
    }

    private static final String unknownNavTypeErrorMessage(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("Route ");
        sb.append(str3);
        sb.append(" could not find any NavType for argument ");
        sb.append(str);
        sb.append(" of type ");
        sb.append(str2);
        sb.append(" - typeMap received was ");
        sb.append(str4);
        return sb.toString();
    }

    public static final boolean isValueClass(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return Intrinsics.areEqual(createimageanalysis.TuitionPaymentFragmentbindingInflater1(), isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE) && createimageanalysis.b() && createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() == 1;
    }
}
