package defpackage;

import com.bpjstku.data.lib.OtherPreferences;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.otpverification.OtpVerificationRepository;
import com.bpjstku.data.user.UserDataStore;
import com.bpjstku.data.user.UserRepository;
import com.bpjstku.data.user.remote.UserApi;
import com.bpjstku.data.user.remote.UserApiClient;
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
public final class l0ExternalSyntheticLambda0 {
    private static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        Function1 function1 = new Function1() { // from class: n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2((isLenovoTablet) obj);
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static /* synthetic */ getOpticalInsets TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new getOpticalInsets((registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (PreferenceManager) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new ActivityResultContractsPickVisualMediaMediaCapabilities((registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ createStaticLayoutForMeasuring TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new createStaticLayoutForMeasuring((registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ UserApi TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new UserApi((UserApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(UserApiClient.class), null, null));
    }

    public static /* synthetic */ cleanupAutoSizePresetSizes TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new cleanupAutoSizePresetSizes((registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ UserRepository a(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new UserDataStore((UserApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(UserApi.class), null, null), (PreferenceManager) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), null, null));
    }

    public static /* synthetic */ forLanguageTags asInterface(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new forLanguageTags((registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ UserApiClient asBinder(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (UserApiClient) notifyStateDetached.b(UserApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: getSdkVersion
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.asBinder((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(UserApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: deregister
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(UserApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: l0ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.a((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(UserRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: m0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.cancelAll((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(registerlambda1.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function6 = new Function2() { // from class: o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(getOpticalInsets.class));
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
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function7 = new Function2() { // from class: o0ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd6 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind6 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove6 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(createStaticLayoutForMeasuring.class));
        zoomGestureDetectorZoomEventMove6.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function7;
        zoomGestureDetectorZoomEventMove6.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind6;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove6, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove6);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin2 = zoomGestureDetectorZoomEventMove6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool2 = Boolean.TRUE;
        Map<String, Object> map2 = zoomGestureDetectorZoomEventBegin2.TuitionPaymentFragmentbindingInflater1;
        if (bool2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map2.put("isViewModel", bool2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function8 = new Function2() { // from class: o0ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.g((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd7 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind7 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove7 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(setCompoundDrawablesRelativeWithIntrinsicBounds.class));
        zoomGestureDetectorZoomEventMove7.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function8;
        zoomGestureDetectorZoomEventMove7.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind7;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove7, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove7);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin3 = zoomGestureDetectorZoomEventMove7.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool3 = Boolean.TRUE;
        Map<String, Object> map3 = zoomGestureDetectorZoomEventBegin3.TuitionPaymentFragmentbindingInflater1;
        if (bool3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map3.put("isViewModel", bool3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function9 = new Function2() { // from class: l0ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd8 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind8 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove8 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(cleanupAutoSizePresetSizes.class));
        zoomGestureDetectorZoomEventMove8.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function9;
        zoomGestureDetectorZoomEventMove8.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind8;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove8, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove8);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin4 = zoomGestureDetectorZoomEventMove8.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool4 = Boolean.TRUE;
        Map<String, Object> map4 = zoomGestureDetectorZoomEventBegin4.TuitionPaymentFragmentbindingInflater1;
        if (bool4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map4.put("isViewModel", bool4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function10 = new Function2() { // from class: l0ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.d((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd9 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind9 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove9 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(setCompoundDrawableTintMode.class));
        zoomGestureDetectorZoomEventMove9.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function10;
        zoomGestureDetectorZoomEventMove9.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind9;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove9, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove9);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin5 = zoomGestureDetectorZoomEventMove9.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool5 = Boolean.TRUE;
        Map<String, Object> map5 = zoomGestureDetectorZoomEventBegin5.TuitionPaymentFragmentbindingInflater1;
        if (bool5 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map5.put("isViewModel", bool5);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function11 = new Function2() { // from class: getStatusDate
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.asInterface((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd10 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind10 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove10 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(forLanguageTags.class));
        zoomGestureDetectorZoomEventMove10.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function11;
        zoomGestureDetectorZoomEventMove10.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind10;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove10, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove10);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin6 = zoomGestureDetectorZoomEventMove10.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool6 = Boolean.TRUE;
        Map<String, Object> map6 = zoomGestureDetectorZoomEventBegin6.TuitionPaymentFragmentbindingInflater1;
        if (bool6 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map6.put("isViewModel", bool6);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function12 = new Function2() { // from class: l0ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return l0ExternalSyntheticLambda0.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd11 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind11 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove11 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class));
        zoomGestureDetectorZoomEventMove11.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function12;
        zoomGestureDetectorZoomEventMove11.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind11;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove11, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove11);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin7 = zoomGestureDetectorZoomEventMove11.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool7 = Boolean.TRUE;
        Map<String, Object> map7 = zoomGestureDetectorZoomEventBegin7.TuitionPaymentFragmentbindingInflater1;
        if (bool7 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map7.put("isViewModel", bool7);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ registerlambda1 cancelAll(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new getData((UserRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(UserRepository.class), null, null), (OtpVerificationRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OtpVerificationRepository.class), null, null), (PreferenceManager) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), null, null), (OtherPreferences) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OtherPreferences.class), null, null), (r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.class), null, null));
    }

    public static /* synthetic */ setCompoundDrawablesRelativeWithIntrinsicBounds g(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new setCompoundDrawablesRelativeWithIntrinsicBounds((registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ setCompoundDrawableTintMode d(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new setCompoundDrawableTintMode((registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }
}
