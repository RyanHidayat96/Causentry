package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class getUseCaseGroup extends CaptureBundlesCaptureBundleImpl {
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(TuitionPaymentFragmentbindingInflater1);

    @Override // defpackage.CaptureBundlesCaptureBundleImpl
    protected final Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return ExperimentalCameraInfo.TuitionPaymentFragmentbindingInflater1(bitmapPool, bitmap, i, i2);
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        return obj instanceof getUseCaseGroup;
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".hashCode();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
