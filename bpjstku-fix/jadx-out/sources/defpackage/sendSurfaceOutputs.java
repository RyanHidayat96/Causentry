package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes4.dex */
public final class sendSurfaceOutputs extends lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface {
    public sendSurfaceOutputs(calculateInvertedTextureTransform calculateinvertedtexturetransform, final String str, final BitmapRegionDecoder bitmapRegionDecoder, final Rect rect, final int i) {
        super(calculateinvertedtexturetransform, str, true);
        calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(new Runnable() { // from class: sendSurfaceOutputs.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    BitmapRegionDecoder bitmapRegionDecoder2 = bitmapRegionDecoder;
                    Rect rect2 = rect;
                    int i2 = i;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = i2;
                    Bitmap bitmapDecodeRegion = bitmapRegionDecoder2.decodeRegion(rect2, options);
                    if (bitmapDecodeRegion == null) {
                        throw new Exception("failed to load bitmap region");
                    }
                    sendSurfaceOutputs.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, new SurfaceProcessorNodeExternalSyntheticLambda2(str, null, bitmapDecodeRegion, new Point(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight())));
                } catch (Exception e2) {
                    sendSurfaceOutputs.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, null);
                }
            }
        });
    }
}
