package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class getSessionConfigCameraCaptureCallbacks {
    public final int TuitionPaymentFragmentbindingInflater1;
    public final float TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final int b;

    /* JADX INFO: loaded from: classes4.dex */
    public static class b {
        public float TuitionPaymentFragmentbindingInflater1;
        public int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public /* synthetic */ getSessionConfigCameraCaptureCallbacks(b bVar, byte b2) {
        this(bVar);
    }

    private getSessionConfigCameraCaptureCallbacks(b bVar) {
        this.b = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentbindingInflater1 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar.TuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getSessionConfigCameraCaptureCallbacks getsessionconfigcameracapturecallbacks = (getSessionConfigCameraCaptureCallbacks) obj;
            if (this.b == getsessionconfigcameracapturecallbacks.b && this.TuitionPaymentFragmentbindingInflater1 == getsessionconfigcameracapturecallbacks.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getsessionconfigcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Float.compare(getsessionconfigcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        float f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return (((((i * 31) + i2) * 31) + i3) * 31) + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityMetrics{screenWidth=");
        sb.append(this.b);
        sb.append(", screenHeight=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", screenDensityDpi=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", screenDensityFactor=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append('}');
        return sb.toString();
    }
}
