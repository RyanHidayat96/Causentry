package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* JADX INFO: loaded from: classes3.dex */
public final class FocusMeteringResult implements ForwardingImageProxy<Drawable, byte[]> {
    private final BitmapPool TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ForwardingImageProxy<isAutoCancelEnabled, byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final ForwardingImageProxy<Bitmap, byte[]> b;

    public FocusMeteringResult(BitmapPool bitmapPool, ForwardingImageProxy<Bitmap, byte[]> forwardingImageProxy, ForwardingImageProxy<isAutoCancelEnabled, byte[]> forwardingImageProxy2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmapPool;
        this.b = forwardingImageProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = forwardingImageProxy2;
    }

    @Override // defpackage.ForwardingImageProxy
    public final Resource<byte[]> b(Resource<Drawable> resource, getTargetRotation gettargetrotation) {
        Drawable drawableTuitionPaymentFragmentbindingInflater1 = resource.TuitionPaymentFragmentbindingInflater1();
        if (drawableTuitionPaymentFragmentbindingInflater1 instanceof BitmapDrawable) {
            return this.b.b(ConcurrentCameraSingleCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(((BitmapDrawable) drawableTuitionPaymentFragmentbindingInflater1).getBitmap(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), gettargetrotation);
        }
        if (drawableTuitionPaymentFragmentbindingInflater1 instanceof isAutoCancelEnabled) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(resource, gettargetrotation);
        }
        return null;
    }
}
