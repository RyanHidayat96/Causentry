package defpackage;

import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getMeteringPointsAe implements CameraEffect<isAutoCancelEnabled> {
    @Override // defpackage.getSensorToBufferTransform
    public final /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, File file, getTargetRotation gettargetrotation) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3((Resource) obj, file);
    }

    @Override // defpackage.CameraEffect
    public final EncodeStrategy TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTargetRotation gettargetrotation) {
        return EncodeStrategy.SOURCE;
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resource<isAutoCancelEnabled> resource, File file) throws Throwable {
        try {
            setOutputImageRotationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(resource.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder.TuitionPaymentFragmentbindingInflater1().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
