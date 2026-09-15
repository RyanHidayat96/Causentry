package defpackage;

import android.content.Context;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final class needAbortCapture {
    private static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        Function1 function1 = new Function1() { // from class: SessionResetPolicy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return needAbortCapture.TuitionPaymentFragmentbindingInflater1((isLenovoTablet) obj);
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = islenovotablet;
    }

    public static final isLenovoTablet b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getOutputUri.TuitionPaymentFragmentbindingInflater1 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getOutputUri.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentbindingInflater1(Exception exc) throws IOException {
            Intrinsics.checkNotNullParameter(exc, "");
            exc.printStackTrace();
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                getContentPaddingRight.b("Analytics Exception Raised", new Object[0]);
            }
        }
    }

    public static /* synthetic */ getSupportedSizes TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new shouldStopRepeatingBeforeCapture((getOutputUri) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(getOutputUri.class), null, null));
    }

    public static /* synthetic */ getOutputUri b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        Context context = (Context) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        createTorchResetRequest createtorchresetrequest = new createTorchResetRequest(context);
        createtorchresetrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        getOutputUri getoutputuri = new getOutputUri(createtorchresetrequest, new SupportedRepeatingSurfaceSize(context));
        getoutputuri.b = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return getoutputuri;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: ResolutionCorrector
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return needAbortCapture.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(getOutputUri.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: StillCaptureFlow
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return needAbortCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(getSupportedSizes.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        return Unit.INSTANCE;
    }
}
