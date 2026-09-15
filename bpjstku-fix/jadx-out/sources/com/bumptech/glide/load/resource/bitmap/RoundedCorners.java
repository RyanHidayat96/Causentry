package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import defpackage.CaptureBundlesCaptureBundleImpl;
import defpackage.ExperimentalCameraInfo;
import defpackage.getUpdatedCropRect;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class RoundedCorners extends CaptureBundlesCaptureBundleImpl {
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(TuitionPaymentFragmentbindingInflater1);
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public RoundedCorners(int i) {
        if (i > 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            return;
        }
        throw new IllegalArgumentException("roundingRadius must be greater than 0.");
    }

    @Override // defpackage.CaptureBundlesCaptureBundleImpl
    public final Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return ExperimentalCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmapPool, bitmap, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        return (obj instanceof RoundedCorners) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == ((RoundedCorners) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1("com.bumptech.glide.load.resource.bitmap.RoundedCorners".hashCode(), getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).array());
    }
}
