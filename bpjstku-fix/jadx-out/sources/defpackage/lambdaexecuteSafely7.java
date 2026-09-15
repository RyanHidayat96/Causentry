package defpackage;

import android.text.TextUtils;
import com.koushikdutta.ion.ResponseServedFrom;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaexecuteSafely7 extends lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor {
    @Override // defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<checkReadyToRelease> b(calculateInvertedTextureTransform calculateinvertedtexturetransform, Node node, final DefaultSurfaceProcessorExternalSyntheticLambda14<setUpRotationUpdates.TuitionPaymentFragmentspecialinlinedviewModeldefault3> defaultSurfaceProcessorExternalSyntheticLambda14) {
        if (node.INotificationSideChannel.getScheme() == null || !node.INotificationSideChannel.getScheme().startsWith("http")) {
            return null;
        }
        InternalImageProcessor internalImageProcessor = calculateinvertedtexturetransform.asBinder;
        createSurfaceOutputFuture createsurfaceoutputfuture = new createSurfaceOutputFuture() { // from class: lambdaexecuteSafely7.3
            @Override // defpackage.createSurfaceOutputFuture
            public final void TuitionPaymentFragmentbindingInflater1(Exception exc, safeProcess safeprocess) {
                long jB;
                ResponseServedFrom responseServedFrom;
                SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda2;
                Node node2;
                ResponseServedFrom responseServedFrom2 = ResponseServedFrom.LOADED_FROM_NETWORK;
                if (safeprocess != null) {
                    Node nodeAsInterface = safeprocess.asInterface();
                    SurfaceEdgeSettableSurfaceExternalSyntheticLambda2 surfaceEdgeSettableSurfaceExternalSyntheticLambda3 = new SurfaceEdgeSettableSurfaceExternalSyntheticLambda2(safeprocess.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), safeprocess.asBinder(), safeprocess.b());
                    jB = render.b(surfaceEdgeSettableSurfaceExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    String strTuitionPaymentFragmentbindingInflater1 = safeprocess.b().TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("X-Served-From".toLowerCase(Locale.US));
                    if (TextUtils.equals(strTuitionPaymentFragmentbindingInflater1, "cache")) {
                        responseServedFrom2 = ResponseServedFrom.LOADED_FROM_CACHE;
                    } else if (TextUtils.equals(strTuitionPaymentFragmentbindingInflater1, "conditional-cache")) {
                        responseServedFrom2 = ResponseServedFrom.LOADED_FROM_CONDITIONAL_CACHE;
                    }
                    responseServedFrom = responseServedFrom2;
                    node2 = nodeAsInterface;
                    surfaceEdgeSettableSurfaceExternalSyntheticLambda2 = surfaceEdgeSettableSurfaceExternalSyntheticLambda3;
                } else {
                    jB = -1;
                    responseServedFrom = responseServedFrom2;
                    surfaceEdgeSettableSurfaceExternalSyntheticLambda2 = null;
                    node2 = null;
                }
                defaultSurfaceProcessorExternalSyntheticLambda14.TuitionPaymentFragmentbindingInflater1(exc, new setUpRotationUpdates.TuitionPaymentFragmentspecialinlinedviewModeldefault3(safeprocess, jB, responseServedFrom, surfaceEdgeSettableSurfaceExternalSyntheticLambda2, node2));
            }
        };
        InternalImageProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new InternalImageProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(internalImageProcessor, (byte) 0);
        internalImageProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(node, 0, tuitionPaymentFragmentspecialinlinedviewModeldefault1, createsurfaceoutputfuture);
        return tuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
