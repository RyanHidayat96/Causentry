package defpackage;

import com.bumptech.glide.load.Transformation;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraState implements getCameraControl {
    private static final getAdditionalTransformMatrixAppliedByProcessor<Class<?>, byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getAdditionalTransformMatrixAppliedByProcessor<>(50);
    private final CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Class<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final getCameraControl f113a;
    private final getCameraControl asBinder;
    private final Transformation<?> asInterface;
    private final int b;
    private final getTargetRotation d;
    private final int g;

    public CameraState(CameraUnavailableException cameraUnavailableException, getCameraControl getcameracontrol, getCameraControl getcameracontrol2, int i, int i2, Transformation<?> transformation, Class<?> cls, getTargetRotation gettargetrotation) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraUnavailableException;
        this.asBinder = getcameracontrol;
        this.f113a = getcameracontrol2;
        this.g = i;
        this.b = i2;
        this.asInterface = transformation;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cls;
        this.d = gettargetrotation;
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        return this.b == cameraState.b && this.g == cameraState.g && getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.asInterface, cameraState.asInterface) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(cameraState.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.asBinder.equals(cameraState.asBinder) && this.f113a.equals(cameraState.f113a) && this.d.equals(cameraState.d);
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        int iHashCode = this.asBinder.hashCode();
        int iHashCode2 = (((((iHashCode * 31) + this.f113a.hashCode()) * 31) + this.g) * 31) + this.b;
        Transformation<?> transformation = this.asInterface;
        if (transformation != null) {
            iHashCode2 = (iHashCode2 * 31) + transformation.hashCode();
        }
        return (((iHashCode2 * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.g).putInt(this.b).array();
        this.f113a.updateDiskCacheKey(messageDigest);
        this.asBinder.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        Transformation<?> transformation = this.asInterface;
        if (transformation != null) {
            transformation.updateDiskCacheKey(messageDigest);
        }
        this.d.updateDiskCacheKey(messageDigest);
        getAdditionalTransformMatrixAppliedByProcessor<Class<?>, byte[]> getadditionaltransformmatrixappliedbyprocessor = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getadditionaltransformmatrixappliedbyprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getName().getBytes(TuitionPaymentFragmentbindingInflater1);
            getadditionaltransformmatrixappliedbyprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        messageDigest.update(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceCacheKey{sourceKey=");
        sb.append(this.asBinder);
        sb.append(", signature=");
        sb.append(this.f113a);
        sb.append(", width=");
        sb.append(this.g);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", decodedResourceClass=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", transformation='");
        sb.append(this.asInterface);
        sb.append("', options=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
