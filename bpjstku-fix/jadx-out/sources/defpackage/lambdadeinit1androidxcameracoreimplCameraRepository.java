package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
class lambdadeinit1androidxcameracoreimplCameraRepository extends lambdagetCameraSelector0 {
    final TaskCompletionSource TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ CameraRepositoryExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private CameraInfoInternal b;

    lambdadeinit1androidxcameracoreimplCameraRepository(CameraRepositoryExternalSyntheticLambda0 cameraRepositoryExternalSyntheticLambda0, CameraInfoInternal cameraInfoInternal, TaskCompletionSource taskCompletionSource) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraRepositoryExternalSyntheticLambda0;
        this.b = cameraInfoInternal;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = taskCompletionSource;
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bundle bundle) throws RemoteException {
        CameraMode cameraMode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
        if (cameraMode != null) {
            TaskCompletionSource taskCompletionSource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            synchronized (cameraMode.g) {
                cameraMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(taskCompletionSource);
            }
            cameraMode.b().post(new isFrontFacing(cameraMode));
        }
        CameraInfoInternal cameraInfoInternal = this.b;
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 4)) {
            CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "onGetLaunchReviewFlowInfo", objArr);
        }
    }
}
