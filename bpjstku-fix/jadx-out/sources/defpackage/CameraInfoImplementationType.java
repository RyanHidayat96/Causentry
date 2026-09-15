package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraInfoImplementationType implements getCameraControl {
    private final getCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final getCameraControl b;

    public CameraInfoImplementationType(getCameraControl getcameracontrol, getCameraControl getcameracontrol2) {
        this.b = getcameracontrol;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getcameracontrol2;
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        if (!(obj instanceof CameraInfoImplementationType)) {
            return false;
        }
        CameraInfoImplementationType cameraInfoImplementationType = (CameraInfoImplementationType) obj;
        return this.b.equals(cameraInfoImplementationType.b) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(cameraInfoImplementationType.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCacheKey{sourceKey=");
        sb.append(this.b);
        sb.append(", signature=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.b.updateDiskCacheKey(messageDigest);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.updateDiskCacheKey(messageDigest);
    }
}
