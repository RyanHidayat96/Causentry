package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class FocusMeteringActionMeteringMode implements ForwardingImageProxy<Bitmap, byte[]> {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Bitmap.CompressFormat b;

    public FocusMeteringActionMeteringMode() {
        this(Bitmap.CompressFormat.JPEG);
    }

    private FocusMeteringActionMeteringMode(Bitmap.CompressFormat compressFormat) {
        this.b = compressFormat;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 100;
    }

    @Override // defpackage.ForwardingImageProxy
    public final Resource<byte[]> b(Resource<Bitmap> resource, getTargetRotation gettargetrotation) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        resource.TuitionPaymentFragmentbindingInflater1().compress(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, byteArrayOutputStream);
        resource.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return new isFullySpecified(byteArrayOutputStream.toByteArray());
    }
}
