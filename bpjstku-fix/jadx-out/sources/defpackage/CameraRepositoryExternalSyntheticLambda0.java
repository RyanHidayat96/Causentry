package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraRepositoryExternalSyntheticLambda0 {
    static final CameraInfoInternal TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CameraInfoInternal("ReviewService");
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    CameraMode b;

    public CameraRepositoryExternalSyntheticLambda0(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context.getPackageName();
        if (getCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context)) {
            Intent intent = new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending");
            CameraInfoInternal cameraInfoInternal = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            new Object() { // from class: CameraProviderInitRetryPolicy
            };
            this.b = new CameraMode(context, cameraInfoInternal, intent);
        }
    }
}
