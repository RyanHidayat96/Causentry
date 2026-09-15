package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class getRelativeRotation implements getViewPortCropRect {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final int TuitionPaymentFragmentbindingInflater1 = Integer.MAX_VALUE;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("SafeXamarinCrashProcessor");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    public getRelativeRotation(Throwable th, String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = th;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
    }

    @Override // defpackage.getViewPortCropRect
    public final getTargetFrameRateInternal TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        try {
            return new isCurrentCamera(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } catch (Exception unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentbindingInflater1("invalid Xamarin crash");
            }
            return new getSecondaryCamera(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }
}
