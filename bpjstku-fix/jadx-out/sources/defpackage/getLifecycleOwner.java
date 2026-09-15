package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class getLifecycleOwner extends CaptureBundlesCaptureBundleImpl {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(TuitionPaymentFragmentbindingInflater1);

    @Override // defpackage.CaptureBundlesCaptureBundleImpl
    protected final Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return ExperimentalCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmapPool, bitmap, i, i2);
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        return obj instanceof getLifecycleOwner;
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterInside".hashCode();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
