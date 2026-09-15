package defpackage;

import android.content.Context;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class createCaptureBundle<T> implements Transformation<T> {
    private static final Transformation<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new createCaptureBundle();

    @Override // com.bumptech.glide.load.Transformation
    public final Resource<T> transform(Context context, Resource<T> resource, int i, int i2) {
        return resource;
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    public static <T> createCaptureBundle<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return (createCaptureBundle) TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    private createCaptureBundle() {
    }
}
