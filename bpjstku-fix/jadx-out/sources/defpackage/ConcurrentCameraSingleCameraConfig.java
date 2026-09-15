package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* JADX INFO: loaded from: classes3.dex */
public final class ConcurrentCameraSingleCameraConfig implements Resource<Bitmap>, requireLensFacing {
    private final BitmapPool TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Bitmap b;

    public static ConcurrentCameraSingleCameraConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap bitmap, BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new ConcurrentCameraSingleCameraConfig(bitmap, bitmapPool);
    }

    public ConcurrentCameraSingleCameraConfig(Bitmap bitmap, BitmapPool bitmapPool) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.b = bitmap;
        if (bitmapPool == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bitmapPool;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class<Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(this.b);
    }

    @Override // defpackage.requireLensFacing
    public final void b() {
        this.b.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final /* synthetic */ Bitmap TuitionPaymentFragmentbindingInflater1() {
        return this.b;
    }
}
