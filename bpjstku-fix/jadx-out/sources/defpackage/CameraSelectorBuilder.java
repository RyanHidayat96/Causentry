package defpackage;

import com.bumptech.glide.load.Transformation;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraSelectorBuilder implements getCameraControl {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final getTargetRotation TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f112a;
    private final int asBinder;
    private final getCameraControl asInterface;
    private final Object b;
    private final Map<Class<?>, Transformation<?>> d;
    private final Class<?> g;

    CameraSelectorBuilder(Object obj, getCameraControl getcameracontrol, int i, int i2, Map<Class<?>, Transformation<?>> map, Class<?> cls, Class<?> cls2, getTargetRotation gettargetrotation) {
        if (obj != null) {
            this.b = obj;
            if (getcameracontrol != null) {
                this.asInterface = getcameracontrol;
                this.asBinder = i;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                if (map == null) {
                    throw new NullPointerException("Argument must not be null");
                }
                this.d = map;
                if (cls == null) {
                    throw new NullPointerException("Resource class must not be null");
                }
                this.g = cls;
                if (cls2 == null) {
                    throw new NullPointerException("Transcode class must not be null");
                }
                this.f112a = cls2;
                if (gettargetrotation == null) {
                    throw new NullPointerException("Argument must not be null");
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gettargetrotation;
                return;
            }
            throw new NullPointerException("Signature must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        if (!(obj instanceof CameraSelectorBuilder)) {
            return false;
        }
        CameraSelectorBuilder cameraSelectorBuilder = (CameraSelectorBuilder) obj;
        return this.b.equals(cameraSelectorBuilder.b) && this.asInterface.equals(cameraSelectorBuilder.asInterface) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == cameraSelectorBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.asBinder == cameraSelectorBuilder.asBinder && this.d.equals(cameraSelectorBuilder.d) && this.g.equals(cameraSelectorBuilder.g) && this.f112a.equals(cameraSelectorBuilder.f112a) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(cameraSelectorBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
            int iHashCode = this.b.hashCode();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.asInterface.hashCode()) * 31) + this.asBinder) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.d.hashCode();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.g.hashCode();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f112a.hashCode();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iHashCode5;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (iHashCode5 * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EngineKey{model=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.asBinder);
        sb.append(", height=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", resourceClass=");
        sb.append(this.g);
        sb.append(", transcodeClass=");
        sb.append(this.f112a);
        sb.append(", signature=");
        sb.append(this.asInterface);
        sb.append(", hashCode=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", transformations=");
        sb.append(this.d);
        sb.append(", options=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
