package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraXInternalInitState implements getSensorToBufferTransform<ByteBuffer> {
    @Override // defpackage.getSensorToBufferTransform
    public final /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteBuffer byteBuffer, File file, getTargetRotation gettargetrotation) {
        return b(byteBuffer, file);
    }

    private static boolean b(ByteBuffer byteBuffer, File file) throws Throwable {
        try {
            setOutputImageRotationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        createByte.TuitionPaymentFragmentbindingInflater1[0] = Class.forName("unregisterCamera").getDeclaredField("b");
    }
}
