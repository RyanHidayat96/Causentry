package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getCameras implements Camera<ImageDecoder.Source, Bitmap> {
    private final BitmapPool TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CameraX();

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(ImageDecoder.Source source, getTargetRotation gettargetrotation) throws IOException {
        return true;
    }

    @Override // defpackage.Camera
    /* JADX INFO: renamed from: z_, reason: merged with bridge method [inline-methods] */
    public final Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(ImageDecoder.Source source, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new CameraXConfigProvider(i, i2, gettargetrotation));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new ConcurrentCameraSingleCameraConfig(bitmapDecodeBitmap, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
