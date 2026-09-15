package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class getMeteringPointsAf implements Transformation<isAutoCancelEnabled> {
    private final Transformation<Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getMeteringPointsAf(Transformation<Bitmap> transformation) {
        if (transformation == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = transformation;
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource<isAutoCancelEnabled> transform(Context context, Resource<isAutoCancelEnabled> resource, int i, int i2) {
        isAutoCancelEnabled isautocancelenabledTuitionPaymentFragmentbindingInflater1 = resource.TuitionPaymentFragmentbindingInflater1();
        Resource<Bitmap> concurrentCameraSingleCameraConfig = new ConcurrentCameraSingleCameraConfig(isautocancelenabledTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, Glide.b(context).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Resource<Bitmap> resourceTransform = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.transform(context, concurrentCameraSingleCameraConfig, i, i2);
        if (!concurrentCameraSingleCameraConfig.equals(resourceTransform)) {
            concurrentCameraSingleCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = resourceTransform.TuitionPaymentFragmentbindingInflater1();
        isautocancelenabledTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bitmapTuitionPaymentFragmentbindingInflater1);
        return resource;
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        if (obj instanceof getMeteringPointsAf) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(((getMeteringPointsAf) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return false;
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.updateDiskCacheKey(messageDigest);
    }
}
