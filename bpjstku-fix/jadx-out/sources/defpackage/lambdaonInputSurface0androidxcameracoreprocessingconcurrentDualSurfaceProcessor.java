package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.Build;
import com.koushikdutta.ion.ResponseServedFrom;
import java.io.File;
import java.net.URI;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaonInputSurface0androidxcameracoreprocessingconcurrentDualSurfaceProcessor extends lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor {
    public static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws Exception {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        try {
            return mediaMetadataRetriever.getFrameAtTime();
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<SurfaceProcessorNodeExternalSyntheticLambda2> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, calculateInvertedTextureTransform calculateinvertedtexturetransform, final String str, final String str2, final int i, final int i2, boolean z) {
        final getTransformMatrix.b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (!str2.startsWith("file") || (bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2)) == null || !getTransformMatrix.TuitionPaymentFragmentbindingInflater1(bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return null;
        }
        final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(new Runnable() { // from class: lambdaonInputSurface0androidxcameracoreprocessingconcurrentDualSurfaceProcessor.4
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmapCreateVideoThumbnail;
                File file = new File(URI.create(str2));
                if (defaultSurfaceProcessorExternalSyntheticLambda5.isCancelled()) {
                    return;
                }
                try {
                    if (Build.MANUFACTURER.toLowerCase().contains("samsung")) {
                        bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(file.getAbsolutePath(), 1);
                    } else {
                        bitmapCreateVideoThumbnail = lambdaonInputSurface0androidxcameracoreprocessingconcurrentDualSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file.getAbsolutePath());
                    }
                    if (bitmapCreateVideoThumbnail == null) {
                        throw new Exception("video bitmap failed to load");
                    }
                    Point point = new Point(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight());
                    if (bitmapCreateVideoThumbnail.getWidth() > i * 2 && bitmapCreateVideoThumbnail.getHeight() > i2 * 2) {
                        float fMin = Math.min(i / bitmapCreateVideoThumbnail.getWidth(), i2 / bitmapCreateVideoThumbnail.getHeight());
                        if (fMin != 0.0f) {
                            bitmapCreateVideoThumbnail = Bitmap.createScaledBitmap(bitmapCreateVideoThumbnail, (int) (bitmapCreateVideoThumbnail.getWidth() * fMin), (int) (bitmapCreateVideoThumbnail.getHeight() * fMin), true);
                        }
                    }
                    SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = new SurfaceProcessorNodeExternalSyntheticLambda2(str, bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bitmapCreateVideoThumbnail, point);
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
}
