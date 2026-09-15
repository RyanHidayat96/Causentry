package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamicRange implements Camera<InputStream, Bitmap> {
    private final getCameras TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getCameras();

    @Override // defpackage.Camera
    public final /* synthetic */ Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(InputStream inputStream, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(ImageDecoder.createSource(setOutputImageRotationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1(inputStream)), i, i2, gettargetrotation);
    }

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(InputStream inputStream, getTargetRotation gettargetrotation) throws IOException {
        return true;
    }
}
