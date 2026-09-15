package defpackage;

import com.bpjstku.data.registration.general.RegistrationDataStore;
import com.bpjstku.data.registration.general.RegistrationRepository;
import com.bpjstku.data.registration.general.remote.RegistrationApi;
import com.bpjstku.data.registration.general.remote.RegistrationApiClient;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.OkHttpClient;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final class d0ExternalSyntheticLambda0 {
    private static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        e0 e0Var = new e0();
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        e0Var.invoke(islenovotablet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ RegistrationRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new RegistrationDataStore((RegistrationApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(RegistrationApi.class), null, null));
    }

    public static /* synthetic */ RegistrationApi TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new RegistrationApi((RegistrationApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(RegistrationApiClient.class), null, null));
    }

    public static /* synthetic */ BackHandlerKtExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new dark((RegistrationRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(RegistrationRepository.class), null, null));
    }

    public static /* synthetic */ setSplitTrack TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new setSplitTrack((BackHandlerKtExternalSyntheticLambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(BackHandlerKtExternalSyntheticLambda1.class), null, null), (getDarkScrimactivity) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(getDarkScrimactivity.class), null, null), (registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ Unit b(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: getDownloadDate
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d0ExternalSyntheticLambda0.asInterface((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(RegistrationApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        boolean z = false;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: onDisplayRemoved
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d0ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(RegistrationApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: onAccessibilityStateChanged
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(RegistrationRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: f0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(BackHandlerKtExternalSyntheticLambda1.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function6 = new Function2() { // from class: getPolicyHash
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(setSplitTrack.class));
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function6;
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind5;
        int i = 1;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove5, new ZoomGestureDetectorgestureDetector1(z, z, i, defaultConstructorMarker));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove5);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin = zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool = Boolean.TRUE;
        Map<String, Object> map = zoomGestureDetectorZoomEventBegin.TuitionPaymentFragmentbindingInflater1;
        if (bool == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map.put("isViewModel", bool);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function7 = new Function2() { // from class: getPolicyName
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d0ExternalSyntheticLambda0.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd6 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind6 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove6 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class));
        zoomGestureDetectorZoomEventMove6.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function7;
        zoomGestureDetectorZoomEventMove6.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind6;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove6, new ZoomGestureDetectorgestureDetector1(z, z, i, defaultConstructorMarker));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove6);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin2 = zoomGestureDetectorZoomEventMove6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool2 = Boolean.TRUE;
        Map<String, Object> map2 = zoomGestureDetectorZoomEventBegin2.TuitionPaymentFragmentbindingInflater1;
        if (bool2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map2.put("isViewModel", bool2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getUntrustedCreatorPackageName b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new getUntrustedCreatorPackageName();
    }

    public static /* synthetic */ RegistrationApiClient asInterface(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (RegistrationApiClient) notifyStateDetached.b(RegistrationApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }
}
