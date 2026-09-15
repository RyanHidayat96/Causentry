package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.zza;

/* JADX INFO: loaded from: classes4.dex */
final class lambdadeinit0androidxcameracoreimplCameraRepository extends lambdadeinit1androidxcameracoreimplCameraRepository {
    lambdadeinit0androidxcameracoreimplCameraRepository(CameraRepositoryExternalSyntheticLambda0 cameraRepositoryExternalSyntheticLambda0, TaskCompletionSource taskCompletionSource) {
        super(cameraRepositoryExternalSyntheticLambda0, new CameraInfoInternal("OnRequestInstallCallback"), taskCompletionSource);
    }

    @Override // defpackage.lambdadeinit1androidxcameracoreimplCameraRepository, defpackage.CameraFiltersExternalSyntheticLambda0
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bundle bundle) throws RemoteException {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bundle);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
