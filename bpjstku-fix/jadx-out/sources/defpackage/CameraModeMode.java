package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
final class CameraModeMode extends CameraFilters {
    private /* synthetic */ CameraProviderExecutionState TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    CameraModeMode(CameraProviderExecutionState cameraProviderExecutionState) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraProviderExecutionState;
    }

    @Override // defpackage.CameraFilters
    public final void b() {
        CameraMode cameraMode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        CameraInfoInternal cameraInfoInternal = cameraMode.TuitionPaymentFragmentbindingInflater1;
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 4)) {
            CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "unlinkToDeath", objArr);
        }
        cameraMode.notify.asBinder().unlinkToDeath(cameraMode.d, 0);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.notify = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f111a = false;
    }
}
