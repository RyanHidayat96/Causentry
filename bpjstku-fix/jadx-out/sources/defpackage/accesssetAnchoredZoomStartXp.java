package defpackage;

import android.app.Application;
import android.content.Context;
import defpackage.CoordinateTransform;
import defpackage.FileTransformFactory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.Kind;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class accesssetAnchoredZoomStartXp {
    public static final getFocusX b(getFocusX getfocusx, final Context context) {
        getFocusX.Companion companion = getFocusX.INSTANCE;
        isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.compareTo(Level.INFO) <= 0) {
            getFocusX.Companion companion2 = getFocusX.INSTANCE;
            getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.INFO, "[init] declare Android Context");
        }
        mapRect maprect = getfocusx.b.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Function2<FileTransformFactory, CoordinateTransform, Context> function2 = new Function2<FileTransformFactory, CoordinateTransform, Context>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$1
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final Context invoke(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
                return context;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        };
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(Context.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        maprect.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove);
        if (context instanceof Application) {
            mapRect maprect2 = getfocusx.b.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
            Function2<FileTransformFactory, CoordinateTransform, Application> function3 = new Function2<FileTransformFactory, CoordinateTransform, Application>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$2
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final Application invoke(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
                    return (Application) context;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            };
            Kind kind2 = Kind.Single;
            ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(Application.class));
            zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
            zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
            maprect2.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2);
        }
        return getfocusx;
    }
}
