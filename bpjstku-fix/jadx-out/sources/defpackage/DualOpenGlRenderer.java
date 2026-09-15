package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.koushikdutta.ion.ResponseServedFrom;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class DualOpenGlRenderer extends lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor {
    @Override // defpackage.lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<SurfaceProcessorNodeExternalSyntheticLambda2> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, calculateInvertedTextureTransform calculateinvertedtexturetransform, String str, String str2, int i, int i2, boolean z) {
        if (str2.startsWith("content:/")) {
            return super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, calculateinvertedtexturetransform, str, str2, i, i2, z);
        }
        return null;
    }

    @Override // defpackage.lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor
    protected final InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, String str) throws Exception {
        return context.getContentResolver().openInputStream(Uri.parse(str));
    }

    @Override // defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<checkReadyToRelease> b(final calculateInvertedTextureTransform calculateinvertedtexturetransform, final Node node, final DefaultSurfaceProcessorExternalSyntheticLambda14<setUpRotationUpdates.TuitionPaymentFragmentspecialinlinedviewModeldefault3> defaultSurfaceProcessorExternalSyntheticLambda14) {
        if (node.INotificationSideChannel.getScheme() == null || !node.INotificationSideChannel.getScheme().startsWith(FirebaseAnalytics.Param.CONTENT)) {
            return null;
        }
        final DualOutConfig dualOutConfig = new DualOutConfig();
        calculateinvertedtexturetransform.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: DualOpenGlRenderer.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    InputStream inputStreamOpenInputStream = calculateinvertedtexturetransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getContentResolver().openInputStream(Uri.parse(node.INotificationSideChannel.toString()));
                    if (inputStreamOpenInputStream == null) {
                        throw new Exception("Unable to load content stream");
                    }
                    int iAvailable = inputStreamOpenInputStream.available();
                    updateTransformation updatetransformation = new updateTransformation(calculateinvertedtexturetransform.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3, inputStreamOpenInputStream);
                    dualOutConfig.b((Exception) null, updatetransformation, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                    defaultSurfaceProcessorExternalSyntheticLambda14.TuitionPaymentFragmentbindingInflater1(null, new setUpRotationUpdates.TuitionPaymentFragmentspecialinlinedviewModeldefault3(updatetransformation, iAvailable, ResponseServedFrom.LOADED_FROM_CACHE, null, null));
                } catch (Exception e2) {
                    dualOutConfig.b(e2, (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                    defaultSurfaceProcessorExternalSyntheticLambda14.TuitionPaymentFragmentbindingInflater1(e2, null);
                }
            }
        }, 0L);
        return dualOutConfig;
    }
}
