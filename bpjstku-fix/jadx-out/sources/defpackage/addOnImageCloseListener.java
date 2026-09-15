package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes3.dex */
public final class addOnImageCloseListener implements ForwardingImageProxy<Bitmap, BitmapDrawable> {
    private final Resources TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public addOnImageCloseListener(Resources resources) {
        if (resources == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = resources;
    }

    @Override // defpackage.ForwardingImageProxy
    public final Resource<BitmapDrawable> b(Resource<Bitmap> resource, getTargetRotation gettargetrotation) {
        return convertPoint.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, resource);
    }
}
