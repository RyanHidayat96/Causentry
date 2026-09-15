package defpackage;

import com.bpjstku.data.devicebinding.DeviceBindingRepository;
import com.bpjstku.data.devicebinding.model.request.CheckMembershipRequest;
import com.bpjstku.data.devicebinding.model.request.LivenessBeginRequest;
import com.bpjstku.data.devicebinding.model.request.LivenessEndRequest;
import com.bpjstku.data.devicebinding.model.request.OtpVerificationData;
import com.bpjstku.data.devicebinding.model.request.SendEmailOtpRequest;
import com.bpjstku.data.devicebinding.model.request.SubmitDeviceBindingRequest;
import com.bpjstku.data.devicebinding.model.request.VerifyOtpRequest;
import com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessEndResponse;
import com.bpjstku.data.devicebinding.model.response.SendEmailOtpResponse;
import com.bpjstku.data.devicebinding.model.response.SubmitDeviceBindingResponse;
import com.bpjstku.data.lib.model.BaseItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class _init_lambda1 implements r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ {
    private final DeviceBindingRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public _init_lambda1(DeviceBindingRepository deviceBindingRepository) {
        Intrinsics.checkNotNullParameter(deviceBindingRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = deviceBindingRepository;
    }

    @Override // defpackage.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ
    public final deriveCodec<CheckMembershipResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, CheckMembershipRequest checkMembershipRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(checkMembershipRequest, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.checkMembership(str, checkMembershipRequest);
    }

    @Override // defpackage.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ
    public final deriveCodec<SendEmailOtpResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.sendEmailOtp(str, new SendEmailOtpRequest());
    }

    @Override // defpackage.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyOtp(str, new VerifyOtpRequest(new OtpVerificationData("EMAIL", str2)));
    }

    @Override // defpackage.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ
    public final deriveCodec<SubmitDeviceBindingResponse> TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.submitDeviceBinding(str, new SubmitDeviceBindingRequest());
    }

    @Override // defpackage.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ
    public final deriveCodec<LivenessBeginResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.livenessBegin(str, new LivenessBeginRequest("ANDROID"));
    }

    @Override // defpackage.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ
    public final deriveCodec<LivenessEndResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, LivenessEndRequest livenessEndRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(livenessEndRequest, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.livenessEnd(str, livenessEndRequest);
    }
}
