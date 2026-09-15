package defpackage;

import com.bpjstku.data.danasiaga.DanaSiagaDataStore;
import com.bpjstku.data.danasiaga.DanaSiagaRepository;
import com.bpjstku.data.danasiaga.remote.DanaSiagaApi;
import com.bpjstku.data.danasiaga.remote.DanaSiagaApiClient;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.OkHttpClient;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final class getIcon {
    private static final isLenovoTablet b;

    static {
        Function1 function1 = new Function1() { // from class: PlaybackStateCompatCustomAction1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault3((isLenovoTablet) obj);
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        b = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return b;
    }

    public static /* synthetic */ _init_lambda2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28((DanaSiagaRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(DanaSiagaRepository.class), null, null));
    }

    public static /* synthetic */ createPopupWindow b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new createPopupWindow((acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null), (_init_lambda2) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(_init_lambda2.class), null, null), (registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null));
    }

    public static /* synthetic */ DanaSiagaApi TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new DanaSiagaApi((DanaSiagaApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(DanaSiagaApiClient.class), null, null));
    }

    public static /* synthetic */ DanaSiagaApiClient TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (DanaSiagaApiClient) notifyStateDetached.b(DanaSiagaApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }

    public static /* synthetic */ DanaSiagaRepository TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new DanaSiagaDataStore((DanaSiagaApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(DanaSiagaApi.class), null, null));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: PlaybackStateCompatRepeatMode
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(DanaSiagaApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: PlaybackStateCompatErrorCode
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(DanaSiagaApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: PlaybackStateCompatShuffleMode
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getIcon.TuitionPaymentFragmentbindingInflater1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(DanaSiagaRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: PlaybackStateCompatCustomActionBuilder
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(_init_lambda2.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function6 = new Function2() { // from class: PlaybackStateCompatMediaKeyAction
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getIcon.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(createPopupWindow.class));
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function6;
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind5;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove5, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove5);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin = zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool = Boolean.TRUE;
        Map<String, Object> map = zoomGestureDetectorZoomEventBegin.TuitionPaymentFragmentbindingInflater1;
        if (bool == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map.put("isViewModel", bool);
        return Unit.INSTANCE;
    }
}
