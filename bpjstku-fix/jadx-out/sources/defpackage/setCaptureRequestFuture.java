package defpackage;

/* JADX INFO: loaded from: classes6.dex */
final class setCaptureRequestFuture extends submitCameraRequest {
    private final RgbaImageProxy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* synthetic */ setCaptureRequestFuture(RgbaImageProxy rgbaImageProxy, byte b) {
        this(rgbaImageProxy);
    }

    private setCaptureRequestFuture(RgbaImageProxy rgbaImageProxy) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = rgbaImageProxy;
    }

    @Override // defpackage.submitCameraRequest
    public final RgbaImageProxy b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalPrivacyContext{prequest=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof submitCameraRequest)) {
            return false;
        }
        RgbaImageProxy rgbaImageProxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        RgbaImageProxy rgbaImageProxyB = ((submitCameraRequest) obj).b();
        if (rgbaImageProxy == null) {
            return rgbaImageProxyB == null;
        }
        return rgbaImageProxy.equals(rgbaImageProxyB);
    }

    public final int hashCode() {
        RgbaImageProxy rgbaImageProxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (rgbaImageProxy == null ? 0 : rgbaImageProxy.hashCode()) ^ 1000003;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends submitCameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private RgbaImageProxy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // submitCameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final submitCameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(RgbaImageProxy rgbaImageProxy) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = rgbaImageProxy;
            return this;
        }

        @Override // submitCameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final submitCameraRequest b() {
            return new setCaptureRequestFuture(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (byte) 0);
        }
    }
}
