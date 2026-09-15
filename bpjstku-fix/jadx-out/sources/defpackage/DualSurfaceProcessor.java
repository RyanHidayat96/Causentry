package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import com.koushikdutta.ion.ResponseServedFrom;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class DualSurfaceProcessor extends lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor {

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        Resources TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int b;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte b) {
            this();
        }
    }

    @Override // defpackage.lambdaonInputSurface1androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<SurfaceProcessorNodeExternalSyntheticLambda2> TuitionPaymentFragmentspecialinlinedviewModeldefault3(final Context context, final calculateInvertedTextureTransform calculateinvertedtexturetransform, final String str, final String str2, final int i, final int i2, final boolean z) {
        if (str2 == null || !str2.startsWith("android.resource:/")) {
            return null;
        }
        final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(new Runnable() { // from class: DualSurfaceProcessor.5
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2;
                try {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = DualSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, str2);
                    lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor lambdaonoutputsurface1androidxcameracoreprocessingsurfaceprocessorwithexecutor = calculateinvertedtexturetransform.TuitionPaymentFragmentbindingInflater1;
                    Resources resources = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                    int i4 = i;
                    int i5 = i2;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeResource(resources, i3, options);
                    BitmapFactory.Options optionsB = lambdaonoutputsurface1androidxcameracoreprocessingsurfaceprocessorwithexecutor.b(options, i4, i5);
                    Point point = new Point(optionsB.outWidth, optionsB.outHeight);
                    if (z && TextUtils.equals("image/gif", optionsB.outMimeType)) {
                        InputStream inputStreamOpenRawResource = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.openRawResource(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
                        try {
                            surfaceProcessorNodeExternalSyntheticLambda2 = DualSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, point, inputStreamOpenRawResource, optionsB);
                            SurfaceEdgeExternalSyntheticLambda3.b(inputStreamOpenRawResource);
                        } catch (Throwable th) {
                            SurfaceEdgeExternalSyntheticLambda3.b(inputStreamOpenRawResource);
                            throw th;
                        }
                    } else {
                        Bitmap bitmapB = lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor.b(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.b, optionsB);
                        if (bitmapB == null) {
                            throw new Exception("Bitmap failed to load");
                        }
                        surfaceProcessorNodeExternalSyntheticLambda2 = new SurfaceProcessorNodeExternalSyntheticLambda2(str, optionsB.outMimeType, bitmapB, point);
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

    static /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str) throws Exception {
        int identifier;
        Uri uri = Uri.parse(str);
        if (uri.getPathSegments() == null) {
            throw new IllegalArgumentException("uri is not a valid resource uri");
        }
        String authority = uri.getAuthority();
        byte b = 0;
        Resources resources = context.createPackageContext(authority, 0).getResources();
        if (uri.getPathSegments().size() == 1) {
            identifier = Integer.valueOf(uri.getPathSegments().get(0)).intValue();
        } else if (uri.getPathSegments().size() == 2) {
            identifier = resources.getIdentifier(uri.getPathSegments().get(1), uri.getPathSegments().get(0), authority);
            if (identifier == 0) {
                throw new IllegalArgumentException("resource not found in given package");
            }
        } else {
            throw new IllegalArgumentException("uri is not a valid resource uri");
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(b);
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = resources;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = identifier;
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<checkReadyToRelease> b(final calculateInvertedTextureTransform calculateinvertedtexturetransform, final Node node, final DefaultSurfaceProcessorExternalSyntheticLambda14<setUpRotationUpdates.TuitionPaymentFragmentspecialinlinedviewModeldefault3> defaultSurfaceProcessorExternalSyntheticLambda14) {
        if (node.INotificationSideChannel.getScheme() == null || !node.INotificationSideChannel.getScheme().equals("android.resource")) {
            return null;
        }
        final DualOutConfig dualOutConfig = new DualOutConfig();
        calculateinvertedtexturetransform.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: DualSurfaceProcessor.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = DualSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(calculateinvertedtexturetransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3, node.INotificationSideChannel.toString());
                    InputStream inputStreamOpenRawResource = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.openRawResource(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
                    if (inputStreamOpenRawResource == null) {
                        throw new Exception("Unable to load content stream");
                    }
                    int iAvailable = inputStreamOpenRawResource.available();
                    updateTransformation updatetransformation = new updateTransformation(calculateinvertedtexturetransform.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3, inputStreamOpenRawResource);
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
