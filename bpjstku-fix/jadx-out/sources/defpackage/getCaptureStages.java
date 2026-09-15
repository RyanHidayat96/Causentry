package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class getCaptureStages implements Camera<ByteBuffer, Bitmap> {
    private final getLayoutSettings TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.Camera
    public final /* synthetic */ Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        getLayoutSettings getlayoutsettings = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return getlayoutsettings.b(new getEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBuffer, getlayoutsettings.f950a, getlayoutsettings.TuitionPaymentFragmentbindingInflater1), i, i2, gettargetrotation, getLayoutSettings.b);
    }

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, getTargetRotation gettargetrotation) throws IOException {
        return getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public getCaptureStages(getLayoutSettings getlayoutsettings) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getlayoutsettings;
    }
}
