package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraXThreads implements CameraEffect<BitmapDrawable> {
    private final BitmapPool TuitionPaymentFragmentbindingInflater1;
    private final CameraEffect<Bitmap> b;

    @Override // defpackage.getSensorToBufferTransform
    public final /* bridge */ /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, File file, getTargetRotation gettargetrotation) {
        return this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Bitmap) new ConcurrentCameraSingleCameraConfig(((BitmapDrawable) ((Resource) obj).TuitionPaymentFragmentbindingInflater1()).getBitmap(), this.TuitionPaymentFragmentbindingInflater1), file, gettargetrotation);
    }

    public CameraXThreads(BitmapPool bitmapPool, CameraEffect<Bitmap> cameraEffect) {
        this.TuitionPaymentFragmentbindingInflater1 = bitmapPool;
        this.b = cameraEffect;
    }

    @Override // defpackage.CameraEffect
    public final EncodeStrategy TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTargetRotation gettargetrotation) {
        return this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(gettargetrotation);
    }
}
