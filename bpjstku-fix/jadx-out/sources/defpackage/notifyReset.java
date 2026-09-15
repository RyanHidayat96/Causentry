package defpackage;

import com.dynatrace.android.agent.EventType;

/* JADX INFO: loaded from: classes4.dex */
public final class notifyReset implements CameraCapturePipeline {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final UseCaseState TuitionPaymentFragmentbindingInflater1 = new UseCaseState();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("AppStartActionObserverImpl");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    @Override // defpackage.CameraCapturePipeline
    public final void TuitionPaymentFragmentbindingInflater1(CameraRequest cameraRequest) {
        isPrimary isprimary;
        CaptureNodeIn captureNodeIn = cameraRequest.b;
        if (captureNodeIn == null || captureNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb = new StringBuilder("Parent action is not available anymore, discard action '");
                sb.append(cameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb.append("'");
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                return;
            }
            return;
        }
        if (!lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 && (isprimary = isPrimary.read()) != null) {
            isprimary.TuitionPaymentFragmentspecialinlinedviewModeldefault2(isprimary.b(false));
        }
        if (provideSurface.b()) {
            mergeConfigs mergeconfigsTuitionPaymentFragmentspecialinlinedviewModeldefault1 = captureNodeIn.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentbindingInflater1 = captureNodeIn.TuitionPaymentFragmentbindingInflater1();
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String str = UseCaseState.b;
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("captured AppStart action: ".concat(String.valueOf(cameraRequest)));
            }
            long j = mergeconfigsTuitionPaymentFragmentspecialinlinedviewModeldefault1.g;
            long j2 = cameraRequest.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            setViewPort setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault3 = UseCaseState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j, cameraRequest.TuitionPaymentFragmentbindingInflater1);
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null ? new getProcessingRequest().TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3) : null;
            notifyState.b bVar = new notifyState.b();
            bVar.TuitionPaymentFragmentbindingInflater1 = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            bVar.asBinder = mergeconfigsTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            bVar.d = iTuitionPaymentFragmentbindingInflater1;
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraRequest.b != null ? cameraRequest.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : 0L;
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = EventType.APP_START;
            bVar.asInterface = setviewportTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            bVar.b = UseCaseState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2, cameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new notifyState(bVar, (byte) 0));
        }
        CaptureNode1ExternalSyntheticLambda0 captureNode1ExternalSyntheticLambda0 = cameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(captureNode1ExternalSyntheticLambda0);
        captureNode1ExternalSyntheticLambda0.MediaBrowserCompat();
        captureNodeIn.asBinder();
    }
}
