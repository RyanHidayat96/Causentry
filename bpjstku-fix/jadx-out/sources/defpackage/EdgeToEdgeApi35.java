package defpackage;

import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"LEdgeToEdgeApi35;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "Lkotlin/Function1;", "Lcom/bpjstku/data/otpverification/model/response/OtpVerificationResponse;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EdgeToEdgeApi35 {
    public static final EdgeToEdgeApi35 INSTANCE = new EdgeToEdgeApi35();
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    private static final Function1<OtpVerificationResponse, OtpVerificationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Function1() { // from class: EdgeToEdgeBase
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return EdgeToEdgeApi35.TuitionPaymentFragmentspecialinlinedviewModeldefault3((OtpVerificationResponse) obj);
        }
    };

    private EdgeToEdgeApi35() {
    }

    public static Function1<OtpVerificationResponse, OtpVerificationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static /* synthetic */ OtpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        return new OtpVerificationResponse(Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(otpVerificationResponse.getSignature().toString(), TuitionPaymentFragmentspecialinlinedviewModeldefault2), otpVerificationResponse.getCheckSum().toString());
    }
}
