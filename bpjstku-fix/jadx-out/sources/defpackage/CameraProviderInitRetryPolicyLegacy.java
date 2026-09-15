package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zzc;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraProviderInitRetryPolicyLegacy implements CameraDeviceSurfaceManager {
    private final Handler TuitionPaymentFragmentbindingInflater1 = new Handler(Looper.getMainLooper());
    private final CameraRepositoryExternalSyntheticLambda0 b;

    public CameraProviderInitRetryPolicyLegacy(CameraRepositoryExternalSyntheticLambda0 cameraRepositoryExternalSyntheticLambda0) {
        this.b = cameraRepositoryExternalSyntheticLambda0;
    }

    @Override // defpackage.CameraDeviceSurfaceManager
    public final Task<ReviewInfo> TuitionPaymentFragmentbindingInflater1() {
        CameraRepositoryExternalSyntheticLambda0 cameraRepositoryExternalSyntheticLambda0 = this.b;
        String str = cameraRepositoryExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        CameraInfoInternal cameraInfoInternal = CameraRepositoryExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object[] objArr = {str};
        if (Log.isLoggable("PlayCore", 4)) {
            CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "requestInAppReview (%s)", objArr);
        }
        if (cameraRepositoryExternalSyntheticLambda0.b == null) {
            Object[] objArr2 = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Play Store app is either not installed or not the official version", objArr2);
            }
            return Tasks.forException(new ReviewException());
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        CameraMode cameraMode = cameraRepositoryExternalSyntheticLambda0.b;
        CameraRepositoryExternalSyntheticLambda1 cameraRepositoryExternalSyntheticLambda1 = new CameraRepositoryExternalSyntheticLambda1(cameraRepositoryExternalSyntheticLambda0, taskCompletionSource, taskCompletionSource);
        cameraMode.b().post(new getHasTransform(cameraMode, cameraRepositoryExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1, taskCompletionSource, cameraRepositoryExternalSyntheticLambda1));
        return taskCompletionSource.getTask();
    }

    @Override // defpackage.CameraDeviceSurfaceManager
    public final Task<Void> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.TuitionPaymentFragmentbindingInflater1()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.b());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this.TuitionPaymentFragmentbindingInflater1, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }
}
