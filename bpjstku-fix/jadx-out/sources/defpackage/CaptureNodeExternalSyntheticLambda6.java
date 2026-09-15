package defpackage;

import com.dynatrace.android.ragetap.measure.TapMonitor;

/* JADX INFO: loaded from: classes4.dex */
public final class CaptureNodeExternalSyntheticLambda6 implements createRequests {
    private static final String b;
    private final sendCaptureError TuitionPaymentFragmentbindingInflater1;
    private final SurfaceRequestExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("TapMonitorFactory");
        b = sb.toString();
    }

    public CaptureNodeExternalSyntheticLambda6(sendCaptureError sendcaptureerror, SurfaceRequestExternalSyntheticLambda5 surfaceRequestExternalSyntheticLambda5) {
        this.TuitionPaymentFragmentbindingInflater1 = sendcaptureerror;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceRequestExternalSyntheticLambda5;
    }

    @Override // defpackage.createRequests
    public final processJpegImage b() {
        float f;
        getSessionConfigCameraCaptureCallbacks getsessionconfigcameracapturecallbacks = addUseCase.b().INotificationSideChannelStubProxy;
        if (getsessionconfigcameracapturecallbacks == null) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Cannot determine screen density as ScreenMetrics is null");
            }
            f = 1.0f;
        } else {
            f = getsessionconfigcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return new TapMonitor(this.TuitionPaymentFragmentbindingInflater1, new CaptureNodeExternalSyntheticLambda3(f), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}
