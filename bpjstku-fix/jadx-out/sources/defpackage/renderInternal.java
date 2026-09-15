package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import com.koushikdutta.ion.ResponseServedFrom;
import java.net.URI;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class renderInternal extends lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor {
    @Override // defpackage.lambdainitGlRenderer6androidxcameracoreprocessingconcurrentDualSurfaceProcessor, defpackage.setUpRotationUpdates
    public final DefaultSurfaceProcessorExternalSyntheticLambda10<SurfaceProcessorNodeExternalSyntheticLambda2> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, final calculateInvertedTextureTransform calculateinvertedtexturetransform, final String str, final String str2, int i, int i2, boolean z) {
        if (str2 == null || !str2.startsWith("package:")) {
            return null;
        }
        final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
        calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(new Runnable() { // from class: renderInternal.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    URI uriCreate = URI.create(str2);
                    int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                    if (setSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
                        throw new RuntimeException(String.valueOf(iIntValue));
                    }
                    String host = uriCreate.getHost();
                    PackageManager packageManager = calculateinvertedtexturetransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPackageManager();
                    Bitmap bitmap = ((BitmapDrawable) packageManager.getPackageInfo(host, 0).applicationInfo.loadIcon(packageManager)).getBitmap();
                    if (bitmap == null) {
                        throw new Exception("package icon failed to load");
                    }
                    SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = new SurfaceProcessorNodeExternalSyntheticLambda2(str, null, bitmap, new Point(bitmap.getWidth(), bitmap.getHeight()));
                    surfaceProcessorNodeExternalSyntheticLambda2.notify = ResponseServedFrom.LOADED_FROM_CACHE;
                    defaultSurfaceProcessorExternalSyntheticLambda5.b((Exception) null, surfaceProcessorNodeExternalSyntheticLambda2, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                } catch (Exception e2) {
                    defaultSurfaceProcessorExternalSyntheticLambda5.b(e2, (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                }
            }
        });
        return defaultSurfaceProcessorExternalSyntheticLambda5;
    }
}
