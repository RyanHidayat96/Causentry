package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.koushikdutta.ion.ResponseServedFrom;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class getSecondarySurfaceEdge extends lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor {
    @Override // defpackage.lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<SurfaceProcessorNodeExternalSyntheticLambda2> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, calculateInvertedTextureTransform calculateinvertedtexturetransform, String str, String str2, int i, int i2, boolean z) {
        if (str2.startsWith("file:///android_asset/")) {
            return super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, calculateinvertedtexturetransform, str, str2, i, i2, z);
        }
        return null;
    }

    @Override // defpackage.lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor
    protected final InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, String str) throws Exception {
        int length = str != null ? str.length() : 0;
        if (throwIfTerminated.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
            Toast.makeText((Context) null, length / (((length - 1) * length) % 2), 0).show();
        }
        return context.getAssets().open(Uri.parse(str).getPath().replaceFirst("^/android_asset/", ""));
    }

    @Override // defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<checkReadyToRelease> b(final calculateInvertedTextureTransform calculateinvertedtexturetransform, final Node node, final DefaultSurfaceProcessorExternalSyntheticLambda14<setUpRotationUpdates.TuitionPaymentFragmentspecialinlinedviewModeldefault3> defaultSurfaceProcessorExternalSyntheticLambda14) {
        if (node.INotificationSideChannel.getScheme() == null || !node.INotificationSideChannel.toString().startsWith("file:///android_asset/")) {
            return null;
        }
        final DualOutConfig dualOutConfig = new DualOutConfig();
        calculateinvertedtexturetransform.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: getSecondarySurfaceEdge.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSecondarySurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(calculateinvertedtexturetransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3, node.INotificationSideChannel.toString());
                    if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        throw new Exception("Unable to load content stream");
                    }
                    int iAvailable = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3.available();
                    updateTransformation updatetransformation = new updateTransformation(calculateinvertedtexturetransform.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3, inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault3);
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
