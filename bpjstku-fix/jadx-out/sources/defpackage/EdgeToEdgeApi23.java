package defpackage;

import com.bpjstku.data.otpverification.OtpVerificationRepository;
import com.bpjstku.data.otpverification.model.request.OtpVerificationActivationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequestAuth;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EdgeToEdgeApi23 implements postWhenReportersAreDone {
    private final OtpVerificationRepository TuitionPaymentFragmentbindingInflater1;

    public EdgeToEdgeApi23(OtpVerificationRepository otpVerificationRepository) {
        Intrinsics.checkNotNullParameter(otpVerificationRepository, "");
        this.TuitionPaymentFragmentbindingInflater1 = otpVerificationRepository;
    }

    @Override // defpackage.postWhenReportersAreDone
    public final deriveCodec<OtpVerificationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        deriveCodec<OtpVerificationResponse> derivecodecVerifyOtpOld = this.TuitionPaymentFragmentbindingInflater1.verifyOtpOld(new OtpVerificationRequest(str2, str, str3));
        final Function1 function1 = new Function1() { // from class: EdgeToEdgeApi28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EdgeToEdgeApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault3((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: EdgeToEdgeApi26
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return EdgeToEdgeApi23.asInterface(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyOtpOld, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.postWhenReportersAreDone
    public final deriveCodec<OtpVerificationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        deriveCodec<OtpVerificationResponse> derivecodecVerifyOtpOld = this.TuitionPaymentFragmentbindingInflater1.verifyOtpOld(str, new OtpVerificationRequest(str3, str2, str4));
        final Function1 function1 = new Function1() { // from class: EdgeToEdgeenableEdgeToEdge12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EdgeToEdgeApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: FullyDrawnReporter
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return EdgeToEdgeApi23.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyOtpOld, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.postWhenReportersAreDone
    public final deriveCodec<OtpVerificationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        deriveCodec<OtpVerificationResponse> derivecodecVerifyOtp = this.TuitionPaymentFragmentbindingInflater1.verifyOtp(new OtpVerificationRequest(str2, str, str3));
        final Function1 function1 = new Function1() { // from class: ExperimentalActivityApi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EdgeToEdgeApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: EdgeToEdgeImpl
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return EdgeToEdgeApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyOtp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.postWhenReportersAreDone
    public final deriveCodec<OtpVerificationResponse> TuitionPaymentFragmentbindingInflater1(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        deriveCodec<OtpVerificationResponse> derivecodecVerifyOtp = this.TuitionPaymentFragmentbindingInflater1.verifyOtp(str, new OtpVerificationRequest(str3, str2, str4));
        final Function1 function1 = new Function1() { // from class: setUp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EdgeToEdgeApi23.TuitionPaymentFragmentbindingInflater1((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: EdgeToEdgeApi30
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return EdgeToEdgeApi23.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyOtp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.postWhenReportersAreDone
    public final deriveCodec<OtpVerificationResponse> b(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        deriveCodec<OtpVerificationResponse> derivecodecVerifyActivationOtp = this.TuitionPaymentFragmentbindingInflater1.verifyActivationOtp(str, new OtpVerificationActivationRequest(str3, str2, str4, str5));
        final Function1 function1 = new Function1() { // from class: EdgeToEdgeExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EdgeToEdgeApi23.b((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getDefaultLightScrimannotations
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return EdgeToEdgeApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyActivationOtp, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.postWhenReportersAreDone
    public final deriveCodec<OtpVerificationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        deriveCodec<OtpVerificationResponse> derivecodecVerifyOtpAuth = this.TuitionPaymentFragmentbindingInflater1.verifyOtpAuth(new OtpVerificationRequestAuth(str2, str, str3, str4));
        final Function1 function1 = new Function1() { // from class: EdgeToEdgeApi29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EdgeToEdgeApi23.a((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: adjustLayoutInDisplayCutoutMode
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return EdgeToEdgeApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyOtpAuth, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ OtpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        EdgeToEdgeApi35 edgeToEdgeApi35 = EdgeToEdgeApi35.INSTANCE;
        return EdgeToEdgeApi35.TuitionPaymentFragmentspecialinlinedviewModeldefault3().invoke(otpVerificationResponse);
    }

    public static /* synthetic */ OtpVerificationResponse TuitionPaymentFragmentbindingInflater1(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        EdgeToEdgeApi35 edgeToEdgeApi35 = EdgeToEdgeApi35.INSTANCE;
        return EdgeToEdgeApi35.TuitionPaymentFragmentspecialinlinedviewModeldefault3().invoke(otpVerificationResponse);
    }

    public static /* synthetic */ OtpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ OtpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        EdgeToEdgeApi35 edgeToEdgeApi35 = EdgeToEdgeApi35.INSTANCE;
        return EdgeToEdgeApi35.TuitionPaymentFragmentspecialinlinedviewModeldefault3().invoke(otpVerificationResponse);
    }

    public static /* synthetic */ OtpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ OtpVerificationResponse b(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        EdgeToEdgeApi35 edgeToEdgeApi35 = EdgeToEdgeApi35.INSTANCE;
        return EdgeToEdgeApi35.TuitionPaymentFragmentspecialinlinedviewModeldefault3().invoke(otpVerificationResponse);
    }

    public static /* synthetic */ OtpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ OtpVerificationResponse TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ OtpVerificationResponse b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ OtpVerificationResponse asInterface(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    public static /* synthetic */ OtpVerificationResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        EdgeToEdgeApi35 edgeToEdgeApi35 = EdgeToEdgeApi35.INSTANCE;
        return EdgeToEdgeApi35.TuitionPaymentFragmentspecialinlinedviewModeldefault3().invoke(otpVerificationResponse);
    }

    public static /* synthetic */ OtpVerificationResponse a(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        EdgeToEdgeApi35 edgeToEdgeApi35 = EdgeToEdgeApi35.INSTANCE;
        return EdgeToEdgeApi35.TuitionPaymentFragmentspecialinlinedviewModeldefault3().invoke(otpVerificationResponse);
    }
}
