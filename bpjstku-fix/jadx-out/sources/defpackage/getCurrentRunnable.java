package defpackage;

import com.bpjstku.data.jp.model.response.JpVerificationResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class getCurrentRunnable {
    public static final JpVerificationResponse b(JpVerificationResponse jpVerificationResponse) {
        Intrinsics.checkNotNullParameter(jpVerificationResponse, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return new JpVerificationResponse(Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jpVerificationResponse.isSuspend(), strB), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jpVerificationResponse.isSuccessful(), strB), jpVerificationResponse.getMessage(), jpVerificationResponse.getStatusCode());
    }
}
