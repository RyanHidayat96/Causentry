package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class DelegatingImageCapturedCallback implements Camera<ByteBuffer, Bitmap> {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final getCameras TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getCameras();

    @Override // defpackage.Camera
    public final /* synthetic */ Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(ImageDecoder.createSource(byteBuffer), i, i2, gettargetrotation);
    }

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, getTargetRotation gettargetrotation) throws IOException {
        return true;
    }

    public static /* synthetic */ void b() {
        getAttachedUseCaseInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = setUseCaseActive.TuitionPaymentFragmentbindingInflater1[0];
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 5424543;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        return i3;
    }
}
