package defpackage;

import com.rtchagas.pingplacepicker.inject.ViewModelModuleKt$viewModelModule$1;
import defpackage.AutoValue_FileOutputOptions_FileOutputOptionsInternal1;
import defpackage.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal;
import defpackage.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1;
import defpackage.CoordinateTransform;
import defpackage.FileTransformFactory;
import defpackage.ZoomGestureDetectorZoomEventBegin;
import defpackage.ZoomGestureDetectorZoomEventEnd;
import defpackage.ZoomGestureDetectorZoomEventMove;
import defpackage.ZoomGestureDetectorgestureDetector1;
import defpackage.isLenovoTablet;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_FileOutputOptions_FileOutputOptionsInternalBuilder {
    private static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static {
        ViewModelModuleKt$viewModelModule$1 viewModelModuleKt$viewModelModule$1 = new Function1<isLenovoTablet, Unit>() { // from class: com.rtchagas.pingplacepicker.inject.ViewModelModuleKt$viewModelModule$1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isLenovoTablet islenovotablet) {
                AnonymousClass1 anonymousClass1 = new Function2<FileTransformFactory, CoordinateTransform, AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal>() { // from class: com.rtchagas.pingplacepicker.inject.ViewModelModuleKt$viewModelModule$1.1
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                    public final AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal invoke(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
                        return new AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal((AutoValue_FileOutputOptions_FileOutputOptionsInternal1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(AutoValue_FileOutputOptions_FileOutputOptionsInternal1.class), null, null));
                    }
                };
                ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
                Kind kind = Kind.TuitionPaymentFragmentbindingInflater1;
                DefaultConstructorMarker defaultConstructorMarker = null;
                ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.class));
                zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = anonymousClass1;
                zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
                boolean z = false;
                int i = 1;
                islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(z, z, i, defaultConstructorMarker));
                islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
                ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin = zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Boolean bool = Boolean.TRUE;
                Map<String, Object> map = zoomGestureDetectorZoomEventBegin.b;
                if (bool != null) {
                    map.put("isViewModel", bool);
                    AnonymousClass2 anonymousClass2 = new Function2<FileTransformFactory, CoordinateTransform, AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1>() { // from class: com.rtchagas.pingplacepicker.inject.ViewModelModuleKt$viewModelModule$1.2
                        @Override // kotlin.jvm.functions.Function2
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1 invoke(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
                            return new AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1((AutoValue_FileOutputOptions_FileOutputOptionsInternal1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(AutoValue_FileOutputOptions_FileOutputOptionsInternal1.class), null, null));
                        }
                    };
                    ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
                    Kind kind2 = Kind.TuitionPaymentFragmentbindingInflater1;
                    ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.class));
                    zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = anonymousClass2;
                    zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
                    islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(z, z, i, defaultConstructorMarker));
                    islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
                    ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin2 = zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Boolean bool2 = Boolean.TRUE;
                    Map<String, Object> map2 = zoomGestureDetectorZoomEventBegin2.b;
                    if (bool2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
                    }
                    map2.put("isViewModel", bool2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(isLenovoTablet islenovotablet) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(islenovotablet);
                return Unit.INSTANCE;
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        viewModelModuleKt$viewModelModule$1.invoke(islenovotablet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
