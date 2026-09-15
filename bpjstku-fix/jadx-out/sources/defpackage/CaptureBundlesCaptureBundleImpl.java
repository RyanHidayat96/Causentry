package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CaptureBundlesCaptureBundleImpl implements Transformation<Bitmap> {
    protected abstract Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2);

    @Override // com.bumptech.glide.load.Transformation
    public final Resource<Bitmap> transform(Context context, Resource<Bitmap> resource, int i, int i2) {
        if (!getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        BitmapPool bitmapPoolB = Glide.b(context).b();
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = resource.TuitionPaymentFragmentbindingInflater1();
        if (i == Integer.MIN_VALUE) {
            i = bitmapTuitionPaymentFragmentbindingInflater1.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmapTuitionPaymentFragmentbindingInflater1.getHeight();
        }
        Bitmap bitmapTransform = transform(bitmapPoolB, bitmapTuitionPaymentFragmentbindingInflater1, i, i2);
        return bitmapTuitionPaymentFragmentbindingInflater1.equals(bitmapTransform) ? resource : ConcurrentCameraSingleCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmapTransform, bitmapPoolB);
    }
}
