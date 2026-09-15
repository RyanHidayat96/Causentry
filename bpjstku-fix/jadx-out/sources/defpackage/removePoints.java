package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.Resource;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class removePoints implements Camera<InputStream, isAutoCancelEnabled> {
    private final Camera<ByteBuffer, isAutoCancelEnabled> TuitionPaymentFragmentbindingInflater1;
    private final List<ImageHeaderParser> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final CameraUnavailableException b;

    @Override // defpackage.Camera
    public final /* bridge */ /* synthetic */ Resource<isAutoCancelEnabled> TuitionPaymentFragmentbindingInflater1(InputStream inputStream, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        byte[] bArrB = b(inputStream);
        if (bArrB == null) {
            return null;
        }
        return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(ByteBuffer.wrap(bArrB), i, i2, gettargetrotation);
    }

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(InputStream inputStream, getTargetRotation gettargetrotation) throws IOException {
        InputStream inputStream2 = inputStream;
        isMirroring<Boolean> ismirroring = addPoint.TuitionPaymentFragmentbindingInflater1;
        return !((Boolean) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b)).booleanValue() && hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, inputStream2, this.b) == ImageHeaderParser.ImageType.GIF;
    }

    public removePoints(List<ImageHeaderParser> list, Camera<ByteBuffer, isAutoCancelEnabled> camera, CameraUnavailableException cameraUnavailableException) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        this.TuitionPaymentFragmentbindingInflater1 = camera;
        this.b = cameraUnavailableException;
    }

    private static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
