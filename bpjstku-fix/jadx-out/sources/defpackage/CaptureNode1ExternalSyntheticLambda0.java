package defpackage;

import com.dynatrace.android.agent.EventType;

/* JADX INFO: loaded from: classes3.dex */
public final class CaptureNode1ExternalSyntheticLambda0 extends lambdanew3androidxcameracoreSurfaceRequest {
    final CaptureNodeIn INotificationSideChannelStub;
    private final lambdareleaseInputResources3 RemoteActionCompatParcelizer;

    public CaptureNode1ExternalSyntheticLambda0(String str, CaptureNode2 captureNode2, lambdareleaseInputResources3 lambdareleaseinputresources3) {
        super(str, EventType.ACTION_MANUAL, captureNode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface, captureNode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(), captureNode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(), false, captureNode2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.RemoteActionCompatParcelizer = lambdareleaseinputresources3;
        this.INotificationSideChannelStub = captureNode2;
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest, defpackage.isServiced
    public final StringBuilder b() {
        return new StringBuilder();
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest
    public final void RemoteActionCompatParcelizer() {
        if (cancel()) {
            return;
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
        lambdareleaseInputResources3 lambdareleaseinputresources3 = this.RemoteActionCompatParcelizer;
        if (lambdareleaseinputresources3.g.compareAndSet(false, true)) {
            lambdareleaseinputresources3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.unregisterActivityLifecycleCallbacks(lambdareleaseinputresources3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String str = lambdareleaseInputResources3.TuitionPaymentFragmentbindingInflater1;
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("AppStart action dropped");
            }
        }
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) {
        if (cancel()) {
            return;
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
        lambdareleaseInputResources3 lambdareleaseinputresources3 = this.RemoteActionCompatParcelizer;
        lambdareleaseinputresources3.TuitionPaymentFragmentbindingInflater1(lambdareleaseinputresources3.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), null);
    }
}
