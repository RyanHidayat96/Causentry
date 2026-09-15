package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class setImageReaderProxyProvider implements getCameraControl {
    private final getCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static getCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) throws Throwable {
        return new setImageReaderProxyProvider(context.getResources().getConfiguration().uiMode & 48, setSupportedResolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context));
    }

    private setImageReaderProxyProvider(int i, getCameraControl getcameracontrol) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getcameracontrol;
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        if (!(obj instanceof setImageReaderProxyProvider)) {
            return false;
        }
        setImageReaderProxyProvider setimagereaderproxyprovider = (setImageReaderProxyProvider) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == setimagereaderproxyprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(setimagereaderproxyprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).array());
    }
}
