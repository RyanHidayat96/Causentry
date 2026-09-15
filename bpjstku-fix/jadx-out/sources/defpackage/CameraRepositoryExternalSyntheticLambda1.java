package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class CameraRepositoryExternalSyntheticLambda1 extends CameraFilters {
    private /* synthetic */ CameraRepositoryExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ TaskCompletionSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraRepositoryExternalSyntheticLambda1(CameraRepositoryExternalSyntheticLambda0 cameraRepositoryExternalSyntheticLambda0, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.b = taskCompletionSource2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraRepositoryExternalSyntheticLambda0;
    }

    @Override // defpackage.CameraFilters
    public final void b() throws Throwable {
        try {
            CameraFiltersExternalSyntheticLambda1 cameraFiltersExternalSyntheticLambda1 = (CameraFiltersExternalSyntheticLambda1) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.notify;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Bundle bundle = new Bundle();
            Map mapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CameraStateRegistry.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            bundle.putInt("playcore_version_code", ((Integer) mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get("java")).intValue());
            if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get("native")).intValue());
            }
            if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.get("unity")).intValue());
            }
            CameraRepositoryExternalSyntheticLambda0 cameraRepositoryExternalSyntheticLambda0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            TaskCompletionSource taskCompletionSource = this.b;
            String str2 = cameraRepositoryExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cameraFiltersExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, bundle, new lambdadeinit0androidxcameracoreimplCameraRepository(cameraRepositoryExternalSyntheticLambda0, taskCompletionSource));
        } catch (RemoteException e2) {
            CameraRepositoryExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, "error requesting in-app review for %s", this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.b.trySetException(new RuntimeException(e2));
        }
    }
}
