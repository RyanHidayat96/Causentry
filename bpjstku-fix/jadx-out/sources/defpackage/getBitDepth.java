package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getBitDepth implements Camera<Uri, Bitmap> {
    private final BitmapPool TuitionPaymentFragmentbindingInflater1;
    private final ExtendableBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.Camera
    public final /* bridge */ /* synthetic */ Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        Resource<Drawable> resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(uri, gettargetrotation);
        if (resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            return null;
        }
        return getRelativeCameraOrientation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, resourceTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(), i, i2);
    }

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Uri uri, getTargetRotation gettargetrotation) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    public getBitDepth(ExtendableBuilder extendableBuilder, BitmapPool bitmapPool) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = extendableBuilder;
        this.TuitionPaymentFragmentbindingInflater1 = bitmapPool;
    }
}
