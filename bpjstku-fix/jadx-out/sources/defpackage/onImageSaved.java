package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class onImageSaved implements Transformation<Drawable> {
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Transformation<Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public onImageSaved(Transformation<Bitmap> transformation, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = transformation;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource<Drawable> transform(Context context, Resource<Drawable> resource, int i, int i2) {
        BitmapPool bitmapPool = Glide.b(context).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Drawable drawableTuitionPaymentFragmentbindingInflater1 = resource.TuitionPaymentFragmentbindingInflater1();
        Resource<Bitmap> resourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getRelativeCameraOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmapPool, drawableTuitionPaymentFragmentbindingInflater1, i, i2);
        if (resourceTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return resource;
            }
            StringBuilder sb = new StringBuilder("Unable to convert ");
            sb.append(drawableTuitionPaymentFragmentbindingInflater1);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
        Resource<Bitmap> resourceTransform = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.transform(context, resourceTuitionPaymentFragmentspecialinlinedviewModeldefault2, i, i2);
        if (resourceTransform.equals(resourceTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            resourceTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return resource;
        }
        return convertPoint.TuitionPaymentFragmentbindingInflater1(context.getResources(), resourceTransform);
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        if (obj instanceof onImageSaved) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(((onImageSaved) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return false;
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.updateDiskCacheKey(messageDigest);
    }
}
