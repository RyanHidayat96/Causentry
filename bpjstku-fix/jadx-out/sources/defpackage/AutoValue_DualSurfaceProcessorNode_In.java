package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import com.koushikdutta.ion.ResponseServedFrom;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_DualSurfaceProcessorNode_In extends lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor {

    static final class TuitionPaymentFragmentbindingInflater1 extends DefaultSurfaceProcessorExternalSyntheticLambda5<checkReadyToRelease> {
        private TuitionPaymentFragmentbindingInflater1() {
        }

        /* synthetic */ TuitionPaymentFragmentbindingInflater1(byte b) {
            this();
        }
    }

    @Override // defpackage.lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<SurfaceProcessorNodeExternalSyntheticLambda2> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, final calculateInvertedTextureTransform calculateinvertedtexturetransform, final String str, final String str2, final int i, final int i2, final boolean z) {
        if (str2 == null || !str2.startsWith("file:/")) {
            return null;
        }
        final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(new Runnable() { // from class: AutoValue_DualSurfaceProcessorNode_In.2
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2;
                if (defaultSurfaceProcessorExternalSyntheticLambda5.isCancelled()) {
                    return;
                }
                try {
                    File file = new File(URI.create(str2));
                    BitmapFactory.Options optionsTuitionPaymentFragmentbindingInflater1 = calculateinvertedtexturetransform.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(file, i, i2);
                    Point point = new Point(optionsTuitionPaymentFragmentbindingInflater1.outWidth, optionsTuitionPaymentFragmentbindingInflater1.outHeight);
                    if (z && TextUtils.equals("image/gif", optionsTuitionPaymentFragmentbindingInflater1.outMimeType)) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            surfaceProcessorNodeExternalSyntheticLambda2 = AutoValue_DualSurfaceProcessorNode_In.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, point, fileInputStream, optionsTuitionPaymentFragmentbindingInflater1);
                            SurfaceEdgeExternalSyntheticLambda3.b(fileInputStream);
                        } catch (Throwable th) {
                            SurfaceEdgeExternalSyntheticLambda3.b(fileInputStream);
                            throw th;
                        }
                    } else {
                        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor.TuitionPaymentFragmentbindingInflater1(file, optionsTuitionPaymentFragmentbindingInflater1);
                        if (bitmapTuitionPaymentFragmentbindingInflater1 == null) {
                            throw new Exception("Bitmap failed to load");
                        }
                        surfaceProcessorNodeExternalSyntheticLambda2 = new SurfaceProcessorNodeExternalSyntheticLambda2(str, optionsTuitionPaymentFragmentbindingInflater1.outMimeType, bitmapTuitionPaymentFragmentbindingInflater1, point);
                    }
                    surfaceProcessorNodeExternalSyntheticLambda2.notify = ResponseServedFrom.LOADED_FROM_CACHE;
                    defaultSurfaceProcessorExternalSyntheticLambda5.b((Exception) null, surfaceProcessorNodeExternalSyntheticLambda2, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                } catch (Exception e2) {
                    defaultSurfaceProcessorExternalSyntheticLambda5.b(e2, (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                } catch (OutOfMemoryError e3) {
                    defaultSurfaceProcessorExternalSyntheticLambda5.b(new Exception(e3), (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                }
            }
        });
        return defaultSurfaceProcessorExternalSyntheticLambda5;
    }

    @Override // defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<checkReadyToRelease> b(final calculateInvertedTextureTransform calculateinvertedtexturetransform, final Node node, final DefaultSurfaceProcessorExternalSyntheticLambda14<setUpRotationUpdates.TuitionPaymentFragmentspecialinlinedviewModeldefault3> defaultSurfaceProcessorExternalSyntheticLambda14) {
        if (node.INotificationSideChannel.getScheme() == null || !node.INotificationSideChannel.getScheme().startsWith("file")) {
            return null;
        }
        final TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1((byte) 0);
        calculateinvertedtexturetransform.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: AutoValue_DualSurfaceProcessorNode_In.1
            @Override // java.lang.Runnable
            public final void run() {
                File file = new File(URI.create(node.INotificationSideChannel.toString()));
                takeSnapshotAndDrawJpeg takesnapshotanddrawjpeg = new takeSnapshotAndDrawJpeg(calculateinvertedtexturetransform.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3, file);
                tuitionPaymentFragmentbindingInflater1.b((Exception) null, takesnapshotanddrawjpeg, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                defaultSurfaceProcessorExternalSyntheticLambda14.TuitionPaymentFragmentbindingInflater1(null, new setUpRotationUpdates.TuitionPaymentFragmentspecialinlinedviewModeldefault3(takesnapshotanddrawjpeg, (int) file.length(), ResponseServedFrom.LOADED_FROM_CACHE, null, node));
            }
        }, 0L);
        return tuitionPaymentFragmentbindingInflater1;
    }
}
