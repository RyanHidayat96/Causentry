package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class singleDefaultCaptureBundle<DataType> implements Camera<DataType, BitmapDrawable> {
    private final Camera<DataType, Bitmap> TuitionPaymentFragmentbindingInflater1;
    private final Resources TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public singleDefaultCaptureBundle(Resources resources, Camera<DataType, Bitmap> camera) {
        if (resources == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = resources;
        if (camera == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.TuitionPaymentFragmentbindingInflater1 = camera;
    }

    @Override // defpackage.Camera
    public final boolean TuitionPaymentFragmentbindingInflater1(DataType datatype, getTargetRotation gettargetrotation) throws IOException {
        return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(datatype, gettargetrotation);
    }

    @Override // defpackage.Camera
    public final Resource<BitmapDrawable> TuitionPaymentFragmentbindingInflater1(DataType datatype, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        return convertPoint.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(datatype, i, i2, gettargetrotation));
    }
}
